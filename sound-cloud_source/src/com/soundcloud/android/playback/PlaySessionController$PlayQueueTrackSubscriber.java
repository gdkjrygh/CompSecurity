// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import com.soundcloud.android.events.CurrentPlayQueueItemEvent;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.stations.StationsOperations;
import com.soundcloud.android.tracks.TrackRepository;
import com.soundcloud.rx.PropertySetFunctions;
import rx.Y;
import rx.a.b.a;
import rx.b;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaySessionController, PlayQueueManager, PlayQueueItem, PlayQueueOperations

private class <init> extends DefaultSubscriber
{

    final PlaySessionController this$0;

    public void onNext(CurrentPlayQueueItemEvent currentplayqueueitemevent)
    {
        if (!PlaySessionController.access$1100(PlaySessionController.this) || !PlaySessionController.access$1200(PlaySessionController.this)) goto _L2; else goto _L1
_L1:
        PlayQueueItem playqueueitem = PlaySessionController.access$000(PlaySessionController.this).getLastPlayQueueItem();
        if (!PlaySessionController.access$1300(PlaySessionController.this) || !playqueueitem.isTrack()) goto _L4; else goto _L3
_L3:
        PlaySessionController.access$902(PlaySessionController.this, PlaySessionController.access$1700(PlaySessionController.this).relatedTracksPlayQueue(playqueueitem.getUrn(), PlaySessionController.access$1600(PlaySessionController.this)).observeOn(a.a()).doOnNext(PlaySessionController.access$1500(PlaySessionController.this)).subscribe(new <init>(PlaySessionController.this, null)));
_L2:
        PlaySessionController.access$2000(PlaySessionController.this).unsubscribe();
        currentplayqueueitemevent = currentplayqueueitemevent.getCurrentPlayQueueItem();
        if (currentplayqueueitemevent.isTrack())
        {
            PlaySessionController.access$2002(PlaySessionController.this, PlaySessionController.access$2200(PlaySessionController.this).track(currentplayqueueitemevent.getUrn()).map(PropertySetFunctions.mergeInto(currentplayqueueitemevent.getMetaData())).subscribe(new nit>(PlaySessionController.this, null)));
        }
        return;
_L4:
        if (currentplayqueueitemevent.getCollectionUrn().isStation())
        {
            PlaySessionController.access$902(PlaySessionController.this, PlaySessionController.access$1900(PlaySessionController.this).fetchUpcomingTracks(currentplayqueueitemevent.getCollectionUrn(), PlaySessionController.access$000(PlaySessionController.this).getQueueSize()).observeOn(a.a()).doOnNext(PlaySessionController.access$1800(PlaySessionController.this)).subscribe(new <init>(PlaySessionController.this, null)));
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public volatile void onNext(Object obj)
    {
        onNext((CurrentPlayQueueItemEvent)obj);
    }

    private ()
    {
        this$0 = PlaySessionController.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
