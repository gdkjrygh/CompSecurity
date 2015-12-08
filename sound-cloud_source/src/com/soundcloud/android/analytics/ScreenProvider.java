// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.rx.eventbus.EventBus;
import rx.b;
import rx.b.f;
import rx.g.m;

public class ScreenProvider
{
    private class ScreenTrackingEventSubscriber extends DefaultSubscriber
    {

        final ScreenProvider this$0;

        public void onNext(ScreenEvent screenevent)
        {
            lastScreenTag = screenevent.getScreenTag();
        }

        public volatile void onNext(Object obj)
        {
            onNext((ScreenEvent)obj);
        }

        private ScreenTrackingEventSubscriber()
        {
            this$0 = ScreenProvider.this;
            super();
        }

        ScreenTrackingEventSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private final f IS_SCREEN_TRACKING = new _cls1();
    private final EventBus eventBus;
    private String lastScreenTag;

    public ScreenProvider(EventBus eventbus)
    {
        eventBus = eventbus;
    }

    public String getLastScreenTag()
    {
        return lastScreenTag;
    }

    public void subscribe()
    {
        eventBus.queue(EventQueue.TRACKING).filter(IS_SCREEN_TRACKING).cast(com/soundcloud/android/events/ScreenEvent).subscribe(new ScreenTrackingEventSubscriber(null));
    }


/*
    static String access$102(ScreenProvider screenprovider, String s)
    {
        screenprovider.lastScreenTag = s;
        return s;
    }

*/

    private class _cls1
        implements f
    {

        final ScreenProvider this$0;

        public Boolean call(TrackingEvent trackingevent)
        {
            return Boolean.valueOf(trackingevent instanceof ScreenEvent);
        }

        public volatile Object call(Object obj)
        {
            return call((TrackingEvent)obj);
        }

        _cls1()
        {
            this$0 = ScreenProvider.this;
            super();
        }
    }

}
