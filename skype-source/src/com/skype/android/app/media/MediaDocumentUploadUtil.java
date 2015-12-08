// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.app.Application;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.skype.Conversation;
import com.skype.MediaDocument;
import com.skype.MediaDocumentImpl;
import com.skype.SkyLib;
import com.skype.android.app.transfer.PathRetriever;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.event.EventBus;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.wakeup.MediaWakeupEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.skype.android.app.media:
//            ImageTransformer, MediaLinkProfile, OnMediaUploadRetry

public class MediaDocumentUploadUtil
{

    private static final long FILE_BACKGROUND_UPLOAD_TIME;
    private static final String LEGACY_MESSAGE_REMOTE_FORMAT = "%1";
    private static final long PICTURE_BACKGROUND_UPLOAD_TIME;
    private final AsyncService async;
    private final EcsConfiguration configuration;
    private final Context context;
    private final ConversationUtil conversationUtil;
    private EventBus eventBus;
    private final ImageCache imageCache;
    private final ImageTransformer imageTransformer = new ImageTransformer();
    private final SkyLib lib;

    public MediaDocumentUploadUtil(Application application, AsyncService asyncservice, SkyLib skylib, ConversationUtil conversationutil, ImageCache imagecache, EcsConfiguration ecsconfiguration, EventBus eventbus)
    {
        context = application;
        async = asyncservice;
        lib = skylib;
        conversationUtil = conversationutil;
        imageCache = imagecache;
        configuration = ecsconfiguration;
        eventBus = eventbus;
    }

    private MediaDocument createMediaDocument(com.skype.MediaDocument.DOCUMENT_TYPE document_type)
    {
        MediaDocumentImpl mediadocumentimpl = new MediaDocumentImpl();
        if (lib.createMediaDocument(document_type, mediadocumentimpl))
        {
            return mediadocumentimpl;
        } else
        {
            return null;
        }
    }

    private Bitmap createThumbnail(int i, Bitmap bitmap)
    {
        int j = context.getResources().getDimensionPixelSize(0x7f0c01e5);
        bitmap = imageTransformer.scaleAndRotate(bitmap, j, 0.0F);
        imageCache.a(String.valueOf(i).concat(MediaLinkProfile.IMG_PROFILE.toString()), bitmap);
        return bitmap;
    }

    private String getContentId(com.skype.MediaDocument.DOCUMENT_TYPE document_type)
    {
        return lib.getDefaultContentId(document_type).m_contentId;
    }

    private transient List pathsAsList(String as[])
    {
        ArrayList arraylist = new ArrayList(as.length);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(as[i]);
        }

        return arraylist;
    }

    private boolean postFileMediaDocument(Conversation conversation, String s, String s1, String s2)
    {
        MediaDocumentImpl mediadocumentimpl;
        for (mediadocumentimpl = new MediaDocumentImpl(); !lib.createMediaDocument(com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_FILE, mediadocumentimpl, s) || !mediadocumentimpl.setMediaByContentId(MediaLinkProfile.ORIGINAL.toString(), s1, com.skype.MediaDocument.STORAGE_POLICY.STORAGE_POLICY_WEAK_LINK) || !conversation.postMediaDocument(mediadocumentimpl.getObjectID(), s2) || !mediadocumentimpl.upload(MediaLinkProfile.ORIGINAL.toString());)
        {
            return false;
        }

        eventBus.a(new MediaWakeupEvent(mediadocumentimpl, MediaLinkProfile.ORIGINAL.toString(), FILE_BACKGROUND_UPLOAD_TIME, com.skype.android.wakeup.MediaWakeupEvent.Type.a));
        return true;
    }

    private boolean postMediaDocument(Conversation conversation, com.skype.MediaDocument.DOCUMENT_TYPE document_type, String s, String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            if ((document_type = createMediaDocument(document_type)) != null && uploadContent(document_type, s1) && conversation.postMediaDocument(document_type.getObjectID(), s))
            {
                return true;
            }
        }
        return false;
    }

    private void postMediaDocumentsAsync(final Conversation conversation, final com.skype.MediaDocument.DOCUMENT_TYPE type, final List paths, AsyncCallback asynccallback)
    {
        conversation = new Callable() {

            final MediaDocumentUploadUtil this$0;
            final Conversation val$conversation;
            final String val$legacyMessage;
            final List val$paths;
            final com.skype.MediaDocument.DOCUMENT_TYPE val$type;

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            public final Map call()
                throws Exception
            {
                HashMap hashmap = new HashMap(paths.size());
                String s;
                for (Iterator iterator = paths.iterator(); iterator.hasNext(); hashmap.put(s, Boolean.valueOf(postMediaDocument(conversation, type, legacyMessage, s))))
                {
                    s = (String)iterator.next();
                }

                return hashmap;
            }

            
            {
                this$0 = MediaDocumentUploadUtil.this;
                paths = list;
                conversation = conversation1;
                type = document_type;
                legacyMessage = s;
                super();
            }
        };
        async.a(conversation, asynccallback);
    }

    private boolean postVideoMessageMediaDocument(Conversation conversation, String s, String s1, Bitmap bitmap, String s2)
    {
        MediaDocumentImpl mediadocumentimpl;
        mediadocumentimpl = new MediaDocumentImpl();
        break MISSING_BLOCK_LABEL_9;
        if (lib.createMediaDocument(com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_VIDEO, mediadocumentimpl) && mediadocumentimpl.setMediaByContentId(MediaLinkProfile.VIDEO_PROFILE.toString(), s, com.skype.MediaDocument.STORAGE_POLICY.STORAGE_POLICY_MOVE_TO_CACHE) && mediadocumentimpl.setMediaByContentId(MediaLinkProfile.THUMBNAIL_PROFILE.toString(), s1, com.skype.MediaDocument.STORAGE_POLICY.STORAGE_POLICY_MOVE_TO_CACHE) && conversation.postMediaDocument(mediadocumentimpl.getObjectID(), s2))
        {
            imageCache.a(String.valueOf(mediadocumentimpl.getObjectID()).concat(MediaLinkProfile.THUMBNAIL_PROFILE.toString()), bitmap);
            if (mediadocumentimpl.upload(MediaLinkProfile.THUMBNAIL_PROFILE.toString()) && mediadocumentimpl.upload(MediaLinkProfile.VIDEO_PROFILE.toString()))
            {
                return true;
            }
        }
        return false;
    }

    private boolean retryMediaDocumentUpload(MediaDocument mediadocument)
    {
        return mediadocument.sync() && mediadocument.upload(getContentId(mediadocument.getDocTypeProp()));
    }

    private String scaleImage(int i, String s)
    {
        s = imageTransformer.transform(s);
        String s1 = imageTransformer.saveBitmap(context.getExternalCacheDir(), s);
        createThumbnail(i, s);
        return s1;
    }

    private boolean uploadContent(MediaDocument mediadocument, String s)
    {
        String s1 = getContentId(mediadocument.getDocTypeProp());
        s = scaleImage(mediadocument.getObjectID(), s);
        if (!TextUtils.isEmpty(s) && mediadocument.setMediaByContentId(s1, s))
        {
            return mediadocument.upload(s1);
        } else
        {
            return false;
        }
    }

    private void uploadPicturesAsync(Conversation conversation, List list, AsyncCallback asynccallback)
    {
        postMediaDocumentsAsync(conversation, com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_PHOTO, list, asynccallback);
    }

    public boolean canSendMediaMessage(Conversation conversation)
    {
        return ConversationUtil.y(conversation) && isMediaMessagingEnabled();
    }

    public Future getThumbnailForCachedMediaAsync(final MediaDocument mediaDocument, Object obj, AsyncCallback asynccallback)
    {
        mediaDocument = new Callable() {

            final MediaDocumentUploadUtil this$0;
            final MediaDocument val$mediaDocument;

            public final Bitmap call()
                throws Exception
            {
                Object obj1 = mediaDocument.getMediaLink(MediaLinkProfile.CACHE_PROFILE.toString());
                if (((com.skype.MediaDocument.GetMediaLink_Result) (obj1)).m_return != com.skype.MediaDocument.MEDIA_STATUS.MEDIA_LOADED)
                {
                    return null;
                } else
                {
                    obj1 = imageTransformer.transform(((com.skype.MediaDocument.GetMediaLink_Result) (obj1)).m_path);
                    return createThumbnail(mediaDocument.getObjectID(), ((Bitmap) (obj1)));
                }
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = MediaDocumentUploadUtil.this;
                mediaDocument = mediadocument;
                super();
            }
        };
        return async.a(mediaDocument, obj, asynccallback);
    }

    public boolean isMediaMessagingEnabled()
    {
        return configuration.isMediaPhotoSharingEnabled();
    }

    public boolean isUploaded(MediaDocument mediadocument)
    {
        return mediadocument.getUploadStatus(getContentId(mediadocument.getDocTypeProp())) == com.skype.MediaDocument.UPLOAD_STATUS.UPLOAD_COMPLETED;
    }

    public boolean postMoji(Conversation conversation, int i)
    {
        return conversation.postMediaDocument(i, context.getResources().getString(0x7f0802dd));
    }

    public void retryMediaDocumentUploadAsync(final int messageId, final MediaDocument mediaDocument)
    {
        async.a(new Runnable() {

            final MediaDocumentUploadUtil this$0;
            final MediaDocument val$mediaDocument;
            final int val$messageId;

            public final void run()
            {
                boolean flag = retryMediaDocumentUpload(mediaDocument);
                eventBus.a(new OnMediaUploadRetry(messageId, mediaDocument.getObjectID(), flag));
            }

            
            {
                this$0 = MediaDocumentUploadUtil.this;
                mediaDocument = mediadocument;
                messageId = i;
                super();
            }
        });
    }

    public boolean shouldPerformCropForPreviewBeforeUpload()
    {
        return Build.MANUFACTURER.equalsIgnoreCase("sony") && (Build.DEVICE.equalsIgnoreCase("c6603") || Build.DEVICE.equalsIgnoreCase("mt27i") || Build.DEVICE.equalsIgnoreCase("c6903") || Build.DEVICE.equalsIgnoreCase("st26i") || Build.DEVICE.equalsIgnoreCase("c6833"));
    }

    public void uploadFileAsync(final Conversation conversation, final String fileName, final String path, final String legacyText, AsyncCallback asynccallback)
    {
        conversation = new Callable() {

            final MediaDocumentUploadUtil this$0;
            final Conversation val$conversation;
            final String val$fileName;
            final String val$legacyText;
            final String val$path;

            public final Boolean call()
                throws Exception
            {
                return Boolean.valueOf(postFileMediaDocument(conversation, fileName, path, legacyText));
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = MediaDocumentUploadUtil.this;
                conversation = conversation1;
                fileName = s;
                path = s1;
                legacyText = s2;
                super();
            }
        };
        async.a(conversation, asynccallback);
    }

    public void uploadPictureAsync(Conversation conversation, Intent intent, AsyncCallback asynccallback)
    {
        Uri uri = intent.getData();
        if (uri != null)
        {
            uploadPictureAsync(conversation, PathRetriever.getPath(context, uri, false), asynccallback);
        } else
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            intent = intent.getClipData();
            if (intent != null)
            {
                int j = intent.getItemCount();
                ArrayList arraylist = new ArrayList(j);
                for (int i = 0; i < j; i++)
                {
                    arraylist.add(PathRetriever.getPath(context, intent.getItemAt(i).getUri(), false));
                }

                uploadPicturesAsync(conversation, arraylist, asynccallback);
                return;
            }
        }
    }

    public void uploadPictureAsync(Conversation conversation, Uri uri, AsyncCallback asynccallback)
    {
        uploadPictureAsync(conversation, PathRetriever.getPath(context, uri, false), asynccallback);
    }

    public void uploadPictureAsync(Conversation conversation, String s, AsyncCallback asynccallback)
    {
        uploadPicturesAsync(conversation, pathsAsList(new String[] {
            s
        }), asynccallback);
    }

    public void uploadVideoMessageAsync(final Conversation conversation, final Uri videoUri, final String thumbnailPath, final Bitmap thumbnail, final String legacyText, AsyncCallback asynccallback)
    {
        conversation = new Callable() {

            final MediaDocumentUploadUtil this$0;
            final Conversation val$conversation;
            final String val$legacyText;
            final Bitmap val$thumbnail;
            final String val$thumbnailPath;
            final Uri val$videoUri;

            public final Boolean call()
                throws Exception
            {
                return Boolean.valueOf(postVideoMessageMediaDocument(conversation, PathRetriever.getPath(context, videoUri, false), thumbnailPath, thumbnail, legacyText));
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = MediaDocumentUploadUtil.this;
                conversation = conversation1;
                videoUri = uri;
                thumbnailPath = s;
                thumbnail = bitmap;
                legacyText = s1;
                super();
            }
        };
        async.a(conversation, asynccallback);
    }

    static 
    {
        FILE_BACKGROUND_UPLOAD_TIME = TimeUnit.MINUTES.toMillis(2L);
        PICTURE_BACKGROUND_UPLOAD_TIME = TimeUnit.SECONDS.toMillis(10L);
    }








}
