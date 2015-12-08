// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.event.eventListener;

import android.os.Handler;
import roboguice.event.EventListener;

// Referenced classes of package roboguice.event.eventListener:
//            EventListenerRunnable

public class UIThreadEventListenerDecorator
    implements EventListener
{

    protected EventListener eventListener;
    protected Handler handler;

    public UIThreadEventListenerDecorator(EventListener eventlistener, Handler handler1)
    {
        eventListener = eventlistener;
        handler = handler1;
    }

    public void onEvent(Object obj)
    {
        handler.post(new EventListenerRunnable(obj, eventListener));
    }
}
