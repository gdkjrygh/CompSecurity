// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.event;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.brightcove.player.event:
//            EventListener, Event

public abstract class BackgroundEventListener
    implements EventListener
{
    static final class a extends Handler
    {

        private final WeakReference a;

        static String a(int i)
        {
            switch (i)
            {
            default:
                return null;

            case 2: // '\002'
                return "MESSAGE_PROCESS_EVENT";

            case 1: // '\001'
                return "MESSAGE_SHUTDOWN";
            }
        }

        static String b(int i)
        {
            return a(i);
        }

        public final void handleMessage(Message message)
        {
            BackgroundEventListener backgroundeventlistener = (BackgroundEventListener)a.get();
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                if (android.os.Build.VERSION.SDK_INT >= 18)
                {
                    getLooper().quitSafely();
                } else
                {
                    getLooper().quit();
                }
                BackgroundEventListener.a(backgroundeventlistener);
                return;

            case 2: // '\002'
                backgroundeventlistener.backgroundProcessEvent((Event)message.obj);
                return;
            }
        }

        a(BackgroundEventListener backgroundeventlistener)
        {
            a = new WeakReference(backgroundeventlistener);
        }
    }


    private Runnable a;
    private ExecutorService b;
    private a c;

    public BackgroundEventListener()
    {
        a = new Runnable() {

            private BackgroundEventListener a;

            public final void run()
            {
                Looper.prepare();
                BackgroundEventListener.a(a, new a(a));
                Looper.loop();
            }

            
            {
                a = BackgroundEventListener.this;
                super();
            }
        };
        a();
    }

    static a a(BackgroundEventListener backgroundeventlistener, a a1)
    {
        backgroundeventlistener.c = a1;
        return a1;
    }

    private void a()
    {
        if (b == null || b.isShutdown())
        {
            b = Executors.newSingleThreadExecutor();
            b.execute(a);
        }
    }

    private void a(int i, Object obj)
    {
        a();
        for (long l = System.currentTimeMillis(); c == null && System.currentTimeMillis() - l < 500L;) { }
        if (c == null)
        {
            (new StringBuilder("Unable to send message of type ")).append(a.b(i)).append("(").append(i).append(") because there is no background handler.");
            return;
        }
        obj = c.obtainMessage(i, obj);
        a a1 = c;
        Object obj1 = a1.getLooper();
        if (obj1 == null)
        {
            (new StringBuilder("Unable to send message of type ")).append(a.a(((Message) (obj)).what)).append("(").append(((Message) (obj)).what).append(") safely as looper is null");
            return;
        }
        obj1 = ((Looper) (obj1)).getThread();
        if (((Thread) (obj1)).getState() == Thread.State.RUNNABLE)
        {
            a1.sendMessage(((Message) (obj)));
            return;
        } else
        {
            (new StringBuilder("Unable to send message of type ")).append(a.a(((Message) (obj)).what)).append("(").append(((Message) (obj)).what).append(") safely as thread's state is ").append(((Thread) (obj1)).getState());
            return;
        }
    }

    static void a(BackgroundEventListener backgroundeventlistener)
    {
        if (backgroundeventlistener.b != null && !backgroundeventlistener.b.isShutdown())
        {
            backgroundeventlistener.b.shutdown();
        }
        backgroundeventlistener.c = null;
    }

    public abstract void backgroundProcessEvent(Event event);

    public void destroyBackgroundThread()
    {
        a(1, null);
    }

    public final void processEvent(Event event)
    {
        a(2, event);
    }

    static 
    {
        com/brightcove/player/event/BackgroundEventListener.getSimpleName();
    }
}
