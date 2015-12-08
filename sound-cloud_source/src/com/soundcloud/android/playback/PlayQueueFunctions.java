// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import rx.b.f;

public final class PlayQueueFunctions
{

    public static final f IS_TRACK_QUEUE_ITEM = new _cls1();
    public static final f TO_TRACK_QUEUE_ITEM = new _cls2();

    private PlayQueueFunctions()
    {
    }


    private class _cls1
        implements f
    {

        public final Boolean call(CurrentPlayQueueItemEvent currentplayqueueitemevent)
        {
            return Boolean.valueOf(currentplayqueueitemevent.getCurrentPlayQueueItem().isTrack());
        }

        public final volatile Object call(Object obj)
        {
            return call((CurrentPlayQueueItemEvent)obj);
        }

        _cls1()
        {
        }
    }


    private class _cls2
        implements f
    {

        public final TrackQueueItem call(CurrentPlayQueueItemEvent currentplayqueueitemevent)
        {
            return (TrackQueueItem)currentplayqueueitemevent.getCurrentPlayQueueItem();
        }

        public final volatile Object call(Object obj)
        {
            return call((CurrentPlayQueueItemEvent)obj);
        }

        _cls2()
        {
        }
    }

}
