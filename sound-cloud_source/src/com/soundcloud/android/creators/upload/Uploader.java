// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.api.ApiClient;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiMapperException;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.api.ApiRequestException;
import com.soundcloud.android.api.FilePart;
import com.soundcloud.android.api.StringPart;
import com.soundcloud.android.api.legacy.model.PublicApiTrack;
import com.soundcloud.android.api.legacy.model.Recording;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UploadEvent;
import com.soundcloud.android.model.PostProperty;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.sync.SyncStateManager;
import com.soundcloud.android.sync.posts.StorePostsCommand;
import com.soundcloud.android.utils.IOUtils;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.rx.eventbus.EventBus;
import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import rx.Y;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            UserCanceledException, UploadService

public class Uploader
    implements Runnable
{
    private final class EventSubscriber extends DefaultSubscriber
    {

        final Uploader this$0;

        public final void onNext(UploadEvent uploadevent)
        {
            if (uploadevent.isCancelled() && recording.getId() == uploadevent.getRecording().getId())
            {
                uploadevent = SoundCloudApplication.TAG;
                (new StringBuilder("canceling upload of ")).append(recording);
                cancel();
            }
        }

        public final volatile void onNext(Object obj)
        {
            onNext((UploadEvent)obj);
        }

        private EventSubscriber()
        {
            this$0 = Uploader.this;
            super();
        }

        EventSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }

    private class UploadProgressListener
        implements com.soundcloud.android.api.ApiRequest.ProgressListener
    {

        private long lastPublished;
        private final Recording recording;
        final Uploader this$0;

        public void update(long l, long l1)
            throws IOException
        {
            if (isCancelled())
            {
                throw new UserCanceledException();
            }
            if (System.currentTimeMillis() - lastPublished > 500L)
            {
                int i = (int)Math.min(100L, (100L * l) / l1);
                eventBus.publish(EventQueue.UPLOAD, UploadEvent.transferProgress(recording, i));
                lastPublished = System.currentTimeMillis();
            }
        }

        public UploadProgressListener(Recording recording1)
        {
            this$0 = Uploader.this;
            super();
            recording = recording1;
        }
    }


    static final String PARAM_ARTWORK_DATA = "track[artwork_data]";
    static final String PARAM_ASSET_DATA = "track[asset_data]";
    static final String PARAM_DESCRIPTION = "track[description]";
    static final String PARAM_DOWNLOADABLE = "track[downloadable]";
    static final String PARAM_GENRE = "track[genre]";
    static final String PARAM_SHARING = "track[sharing]";
    static final String PARAM_STREAMABLE = "track[streamable]";
    static final String PARAM_TAG_LIST = "track[tag_list]";
    static final String PARAM_TITLE = "track[title]";
    static final String PARAM_TYPE = "track[track_type]";
    private final ApiClient apiClient;
    private volatile boolean canceled;
    private final EventBus eventBus;
    private final Recording recording;
    private final Resources resources;
    private final StorePostsCommand storePostsCommand;
    private final StoreTracksCommand storeTracksCommand;
    private final Y subscription;
    private final SyncStateManager syncStateManager;

    public Uploader(Context context, ApiClient apiclient, Recording recording1, StoreTracksCommand storetrackscommand, StorePostsCommand storepostscommand, EventBus eventbus)
    {
        apiClient = apiclient;
        recording = recording1;
        storeTracksCommand = storetrackscommand;
        storePostsCommand = storepostscommand;
        resources = context.getResources();
        syncStateManager = new SyncStateManager(context);
        subscription = eventbus.subscribe(EventQueue.UPLOAD, new EventSubscriber(null));
        eventBus = eventbus;
    }

    private void addRecordingFields(com.soundcloud.android.api.ApiRequest.Builder builder, Map map)
    {
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (entry.getValue() instanceof Iterable)
            {
                Iterator iterator = ((Iterable)entry.getValue()).iterator();
                while (iterator.hasNext()) 
                {
                    Object obj = iterator.next();
                    builder.withFormPart(StringPart.from((String)entry.getKey(), obj.toString()));
                }
            } else
            {
                builder.withFormPart(StringPart.from((String)entry.getKey(), entry.getValue().toString()));
            }
        }

    }

    private Map buildRecordingParamMap(Resources resources1, Recording recording1)
    {
        HashMap hashmap = new HashMap();
        recording1.title = recording1.sharingNote(resources1);
        hashmap.put("track[title]", recording1.title);
        hashmap.put("track[track_type]", "recording");
        if (recording1.isPublic())
        {
            resources1 = "public";
        } else
        {
            resources1 = "private";
        }
        hashmap.put("track[sharing]", resources1);
        hashmap.put("track[downloadable]", Boolean.valueOf(false));
        hashmap.put("track[streamable]", Boolean.valueOf(true));
        resources1 = recording1.tagString();
        if (!TextUtils.isEmpty(resources1))
        {
            hashmap.put("track[tag_list]", resources1);
        }
        if (!TextUtils.isEmpty(recording1.description))
        {
            hashmap.put("track[description]", recording1.description);
        }
        if (!TextUtils.isEmpty(recording1.genre))
        {
            hashmap.put("track[genre]", recording1.genre);
        }
        return hashmap;
    }

    private ApiRequest buildUploadRequest(Resources resources1, Recording recording1)
    {
        com.soundcloud.android.api.ApiRequest.Builder builder = ApiRequest.post(ApiEndpoints.LEGACY_TRACKS.path()).forPublicApi();
        resources1 = buildRecordingParamMap(resources1, recording1);
        addRecordingFields(builder, resources1);
        File file = recording1.getUploadFile();
        if (!recording1.external_upload)
        {
            String s = resources1.get("track[title]").toString();
            resources1 = s;
            if (s == null)
            {
                resources1 = "unknown";
            }
            resources1 = String.format("%s.%s", new Object[] {
                URLEncoder.encode(resources1.replace(" ", "_")), "ogg"
            });
        } else
        {
            resources1 = file.getName();
        }
        builder.withFormPart(FilePart.from("track[asset_data]", file, resources1, "application/octet-stream"));
        if (recording1.artwork_path != null)
        {
            builder.withFormPart(FilePart.from("track[artwork_data]", recording1.artwork_path, "application/octet-stream"));
        }
        builder.withProgressListener(new UploadProgressListener(recording1));
        return builder.build();
    }

    private void createNewTrackPost(PublicApiTrack publicapitrack)
    {
        storePostsCommand.call(Collections.singletonList(PropertySet.from(new PropertyBinding[] {
            PostProperty.TARGET_URN.bind(publicapitrack.getUrn()), PostProperty.CREATED_AT.bind(publicapitrack.getCreatedAt()), PostProperty.IS_REPOST.bind(Boolean.valueOf(false))
        })));
    }

    private void onUploadFailed(Exception exception)
    {
        exception = SoundCloudApplication.TAG;
        eventBus.publish(EventQueue.UPLOAD, UploadEvent.error(recording));
    }

    private void onUploadFinished(PublicApiTrack publicapitrack)
    {
        storeTracksCommand.call(Collections.singletonList(publicapitrack));
        createNewTrackPost(publicapitrack);
        syncStateManager.forceToStale(Content.ME_SOUNDS);
        if (Log.isLoggable(SoundCloudApplication.TAG, 3))
        {
            String s = SoundCloudApplication.TAG;
            (new StringBuilder("Upload successful : ")).append(publicapitrack);
        }
        recording.markUploaded();
        if (!recording.external_upload)
        {
            IOUtils.deleteFile(recording.getFile());
            IOUtils.deleteFile(recording.getEncodedFile());
        }
        File file = recording.resized_artwork_path;
        if (file != null)
        {
            IOUtils.deleteFile(file);
        }
        eventBus.publish(EventQueue.UPLOAD, UploadEvent.transferSuccess(recording, publicapitrack));
    }

    private void upload()
    {
        Object obj;
        obj = recording.getUploadFile();
        if (obj == null || !((File) (obj)).exists())
        {
            throw new IllegalArgumentException("File to be uploaded does not exist");
        }
        if (((File) (obj)).length() == 0L)
        {
            throw new IllegalArgumentException("File to be uploaded is empty");
        }
        if (isCancelled())
        {
            throw new UserCanceledException();
        }
          goto _L1
_L3:
        if (!isCancelled())
        {
            onUploadFailed(((Exception) (obj)));
        }
        return;
_L1:
        try
        {
            String s = SoundCloudApplication.TAG;
            (new StringBuilder("starting upload of ")).append(obj);
            eventBus.publish(EventQueue.UPLOAD, UploadEvent.transferStarted(recording));
            obj = buildUploadRequest(resources, recording);
            onUploadFinished((PublicApiTrack)apiClient.fetchMappedResponse(((ApiRequest) (obj)), com/soundcloud/android/api/legacy/model/PublicApiTrack));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        if (true) goto _L3; else goto _L2
_L2:
    }

    public void cancel()
    {
        canceled = true;
    }

    public boolean isCancelled()
    {
        return canceled;
    }

    public void run()
    {
        String s = UploadService.TAG;
        (new StringBuilder("Uploader.run(")).append(recording).append(")");
        upload();
        subscription.unsubscribe();
        return;
        Object obj;
        obj;
        onUploadFailed(((Exception) (obj)));
        subscription.unsubscribe();
        return;
        obj;
        subscription.unsubscribe();
        throw obj;
    }


}
