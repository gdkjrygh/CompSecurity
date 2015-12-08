// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.event.eventListener.factory;

import android.os.Handler;
import com.google.inject.Provider;
import roboguice.event.EventListener;
import roboguice.event.EventThread;
import roboguice.event.eventListener.AsynchronousEventListenerDecorator;
import roboguice.event.eventListener.UIThreadEventListenerDecorator;

public class EventListenerThreadingDecorator
{

    protected Provider handlerProvider;

    public EventListenerThreadingDecorator()
    {
    }

    public EventListener decorate(EventThread eventthread, EventListener eventlistener)
    {
        static class _cls1
        {

            static final int $SwitchMap$roboguice$event$EventThread[];

            static 
            {
                $SwitchMap$roboguice$event$EventThread = new int[EventThread.values().length];
                try
                {
                    $SwitchMap$roboguice$event$EventThread[EventThread.UI.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$roboguice$event$EventThread[EventThread.BACKGROUND.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.roboguice.event.EventThread[eventthread.ordinal()])
        {
        default:
            return eventlistener;

        case 1: // '\001'
            return new UIThreadEventListenerDecorator(eventlistener, (Handler)handlerProvider.get());

        case 2: // '\002'
            return new AsynchronousEventListenerDecorator(eventlistener);
        }
    }
}
