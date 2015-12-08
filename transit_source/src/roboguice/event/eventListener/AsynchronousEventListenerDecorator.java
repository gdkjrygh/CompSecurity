// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.event.eventListener;

import android.os.Handler;
import roboguice.event.EventListener;

// Referenced classes of package roboguice.event.eventListener:
//            RunnableAsyncTaskAdaptor, EventListenerRunnable

public class AsynchronousEventListenerDecorator
    implements EventListener
{

    protected EventListener eventListener;
    protected Handler handler;

    public AsynchronousEventListenerDecorator(Handler handler1, EventListener eventlistener)
    {
        handler = handler1;
        eventListener = eventlistener;
    }

    public AsynchronousEventListenerDecorator(EventListener eventlistener)
    {
        eventListener = eventlistener;
    }

    public void onEvent(Object obj)
    {
        (new RunnableAsyncTaskAdaptor(handler, new EventListenerRunnable(obj, eventListener))).execute();
    }
}
