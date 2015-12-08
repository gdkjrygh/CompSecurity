// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.event.eventListener;

import roboguice.event.EventListener;

public class EventListenerRunnable
    implements Runnable
{

    protected Object event;
    protected EventListener eventListener;

    public EventListenerRunnable(Object obj, EventListener eventlistener)
    {
        event = obj;
        eventListener = eventlistener;
    }

    public void run()
    {
        eventListener.onEvent(event);
    }
}
