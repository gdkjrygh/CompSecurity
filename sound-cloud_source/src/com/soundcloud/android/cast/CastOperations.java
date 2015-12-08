// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.cast;

import android.content.res.Resources;
import android.net.Uri;
import com.google.android.gms.cast.m;
import com.google.android.gms.cast.n;
import com.google.android.gms.common.images.WebImage;
import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.policies.PolicyOperations;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.android.tracks.TrackRepository;
import com.soundcloud.android.utils.Urns;
import com.soundcloud.java.collections.PropertySet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import rx.R;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.cast:
//            RemotePlayQueue

public class CastOperations
{

    private static final f FILTER_PRIVATE_TRACKS = new _cls1();
    private static final String KEY_PLAY_QUEUE = "play_queue";
    private static final String KEY_URN = "urn";
    public static final String TAG = "GoogleCast";
    private static final f TO_URNS = new _cls2();
    private final ImageOperations imageOperations;
    private final f loadTracks = new _cls3();
    private final PolicyOperations policyOperations;
    private final R progressPullIntervalScheduler;
    private final Resources resources;
    private final TrackRepository trackRepository;
    private final VideoCastManager videoCastManager;

    public CastOperations(VideoCastManager videocastmanager, TrackRepository trackrepository, PolicyOperations policyoperations, ImageOperations imageoperations, Resources resources1, R r)
    {
        videoCastManager = videocastmanager;
        trackRepository = trackrepository;
        policyOperations = policyoperations;
        imageOperations = imageoperations;
        resources = resources1;
        progressPullIntervalScheduler = r;
    }

    private List convertRemoteDataToTrackList(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = (JSONArray)jsonobject.get("play_queue");
        ArrayList arraylist = new ArrayList(jsonobject.length());
        for (int i = 0; i < jsonobject.length(); i++)
        {
            arraylist.add(new Urn(jsonobject.getString(i)));
        }

        return arraylist;
    }

    private m createMediaInfo(PropertySet propertyset)
    {
        Urn urn = (Urn)propertyset.get(TrackProperty.URN);
        String s = imageOperations.getUrlForLargestImage(resources, urn);
        n n1 = new n(3);
        n1.a("com.google.android.gms.cast.metadata.TITLE", (String)propertyset.get(TrackProperty.TITLE));
        n1.a("com.google.android.gms.cast.metadata.ARTIST", (String)propertyset.get(TrackProperty.CREATOR_NAME));
        n1.a("urn", urn.toString());
        if (s != null)
        {
            n1.a(new WebImage(Uri.parse(s)));
        }
        return (new com.google.android.gms.cast.m.a(urn.toString())).a("audio/mpeg").a(1).a(n1).a();
    }

    private JSONObject createPlayQueueJSON(List list)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("play_queue", new JSONArray(Urns.toString(list)));
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    private b filterMonetizableAndPrivateTracks(List list)
    {
        return policyOperations.filterMonetizableTracks(list).flatMap(RxUtils.emitCollectionItems()).flatMap(loadTracks).filter(FILTER_PRIVATE_TRACKS).map(TO_URNS);
    }

    private Urn getCurrentTrackUrn(m m1)
    {
        if (m1 == null)
        {
            return Urn.NOT_SET;
        } else
        {
            return new Urn(m1.d.a("urn"));
        }
    }

    private RemotePlayQueue parseMediaInfoToRemotePlayQueue(m m1)
    {
        if (m1 == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        JSONObject jsonobject = m1.g;
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        m1 = new RemotePlayQueue(convertRemoteDataToTrackList(jsonobject), getCurrentTrackUrn(m1));
        return m1;
        m1;
        return new RemotePlayQueue(new ArrayList(), Urn.NOT_SET);
    }

    public Urn getRemoteCurrentTrackUrn()
    {
        Urn urn = getCurrentTrackUrn(videoCastManager.getRemoteMediaInformation());
        return urn;
        Object obj;
        obj;
_L2:
        return Urn.NOT_SET;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public b intervalForProgressPull()
    {
        return b.interval(500L, TimeUnit.MILLISECONDS, progressPullIntervalScheduler).timeInterval();
    }

    public b loadLocalPlayQueue(Urn urn, List list)
    {
        return b.zip(trackRepository.track(urn), b.from(list).toList(), new _cls5());
    }

    public b loadLocalPlayQueueWithoutMonetizableAndPrivateTracks(final Urn currentTrackUrn, List list)
    {
        return filterMonetizableAndPrivateTracks(list).toList().flatMap(new _cls4());
    }

    public RemotePlayQueue loadRemotePlayQueue()
    {
        RemotePlayQueue remoteplayqueue = parseMediaInfoToRemotePlayQueue(videoCastManager.getRemoteMediaInformation());
        return remoteplayqueue;
        Object obj;
        obj;
_L2:
        return new RemotePlayQueue(Collections.emptyList(), Urn.NOT_SET);
        obj;
        if (true) goto _L2; else goto _L1
_L1:
    }





    private class _cls3
        implements f
    {

        final CastOperations this$0;

        public volatile Object call(Object obj)
        {
            return call((Urn)obj);
        }

        public b call(Urn urn)
        {
            return trackRepository.track(urn);
        }

        _cls3()
        {
            this$0 = CastOperations.this;
            super();
        }
    }


    private class _cls5
        implements g
    {

        final CastOperations this$0;

        public LocalPlayQueue call(PropertySet propertyset, List list)
        {
            return new LocalPlayQueue(createPlayQueueJSON(list), list, createMediaInfo(propertyset), (Urn)propertyset.get(TrackProperty.URN));
        }

        public volatile Object call(Object obj, Object obj1)
        {
            return call((PropertySet)obj, (List)obj1);
        }

        _cls5()
        {
            this$0 = CastOperations.this;
            super();
        }
    }


    private class _cls4
        implements f
    {

        final CastOperations this$0;
        final Urn val$currentTrackUrn;

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        public b call(List list)
        {
            if (list.isEmpty())
            {
                return b.just(LocalPlayQueue.empty());
            }
            if (list.contains(currentTrackUrn))
            {
                return loadLocalPlayQueue(currentTrackUrn, list);
            } else
            {
                return loadLocalPlayQueue((Urn)list.get(0), list);
            }
        }

        _cls4()
        {
            this$0 = CastOperations.this;
            currentTrackUrn = urn;
            super();
        }
    }


    private class _cls1
        implements f
    {

        public final Boolean call(PropertySet propertyset)
        {
            boolean flag;
            if (!((Boolean)propertyset.get(TrackProperty.IS_PRIVATE)).booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return Boolean.valueOf(flag);
        }

        public final volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements f
    {

        public final Urn call(PropertySet propertyset)
        {
            return (Urn)propertyset.get(TrackProperty.URN);
        }

        public final volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        _cls2()
        {
        }
    }

}
