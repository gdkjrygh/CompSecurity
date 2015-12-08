// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.sync.SyncInitiator;
import com.soundcloud.rx.PropertySetFunctions;
import com.soundcloud.rx.eventbus.EventBus;
import rx.R;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackStorage

public class TrackRepository
{

    private final EventBus eventBus;
    private final rx.b.b publishTrackChanged = new _cls1();
    private final R scheduler;
    private final SyncInitiator syncInitiator;
    private final TrackStorage trackStorage;

    public TrackRepository(TrackStorage trackstorage, EventBus eventbus, SyncInitiator syncinitiator, R r)
    {
        trackStorage = trackstorage;
        eventBus = eventbus;
        syncInitiator = syncinitiator;
        scheduler = r;
    }

    private b fullTrackFromStorage(Urn urn)
    {
        return trackFromStorage(urn).zipWith(trackStorage.loadTrackDescription(urn), PropertySetFunctions.mergeLeft()).subscribeOn(scheduler);
    }

    private f syncIfEmpty(final Urn trackUrn)
    {
        return new _cls2();
    }

    private b syncThenLoadTrack(Urn urn, b b1)
    {
        return syncInitiator.syncTrack(urn).flatMap(RxUtils.continueWith(b1));
    }

    private b trackFromStorage(Urn urn)
    {
        return trackStorage.loadTrack(urn).subscribeOn(scheduler);
    }

    b fullTrackWithUpdate(Urn urn)
    {
        return b.concat(fullTrackFromStorage(urn), syncThenLoadTrack(urn, fullTrackFromStorage(urn)).doOnNext(publishTrackChanged));
    }

    public b track(Urn urn)
    {
        return trackFromStorage(urn).onErrorResumeNext(syncThenLoadTrack(urn, trackFromStorage(urn))).flatMap(syncIfEmpty(urn));
    }




    private class _cls1
        implements rx.b.b
    {

        final TrackRepository this$0;

        public void call(PropertySet propertyset)
        {
            eventBus.publish(EventQueue.ENTITY_STATE_CHANGED, EntityStateChangedEvent.fromSync(propertyset));
        }

        public volatile void call(Object obj)
        {
            call((PropertySet)obj);
        }

        _cls1()
        {
            this$0 = TrackRepository.this;
            super();
        }
    }


    private class _cls2
        implements f
    {

        final TrackRepository this$0;
        final Urn val$trackUrn;

        public volatile Object call(Object obj)
        {
            return call((PropertySet)obj);
        }

        public b call(PropertySet propertyset)
        {
            if (propertyset.isEmpty())
            {
                return syncThenLoadTrack(trackUrn, trackFromStorage(trackUrn));
            } else
            {
                return b.just(propertyset);
            }
        }

        _cls2()
        {
            this$0 = TrackRepository.this;
            trackUrn = urn;
            super();
        }
    }

}
