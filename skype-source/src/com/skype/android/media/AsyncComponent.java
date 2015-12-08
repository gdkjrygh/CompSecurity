// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

// Referenced classes of package com.skype.android.media:
//            Component, e

abstract class AsyncComponent
    implements android.os.Handler.Callback, Component
{

    private Handler handler;
    private boolean ownsThread;
    private HandlerThread thread;

    AsyncComponent(HandlerThread handlerthread)
    {
        if (handlerthread == null)
        {
            throw new IllegalArgumentException("null thread");
        } else
        {
            thread = handlerthread;
            handler = new Handler(handlerthread.getLooper(), this);
            return;
        }
    }

    AsyncComponent(String s)
    {
        ownsThread = true;
        thread = new HandlerThread(s);
        thread.start();
        handler = new Handler(thread.getLooper(), this);
    }

    protected Handler getHandler()
    {
        return handler;
    }

    public String getName()
    {
        return thread.getName();
    }

    public Thread getThread()
    {
        return thread;
    }

    abstract boolean handle(e e1, Object obj);

    public final boolean handleMessage(Message message)
    {
        e e1 = e.a(message.what);
        boolean flag = handle(e1, message.obj);
        if (e1 == e.d)
        {
            thread.quit();
        }
        return flag;
    }

    public void releaseAndWait()
    {
        send(e.d);
        if (thread == null || !ownsThread)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        thread.join();
        thread = null;
        return;
        Object obj;
        obj;
        ((InterruptedException) (obj)).printStackTrace();
        thread = null;
        return;
        obj;
        thread = null;
        throw obj;
    }

    public void remove(e e1)
    {
        handler.removeMessages(e1.ordinal());
    }

    public boolean send(e e1)
    {
        return send(e1, null);
    }

    public boolean send(e e1, Object obj)
    {
        if (thread != null)
        {
            if (e1 == e.d)
            {
                e1 = handler.obtainMessage(e1.ordinal(), obj);
                return handler.sendMessageAtFrontOfQueue(e1);
            } else
            {
                e1 = handler.obtainMessage(e1.ordinal(), obj);
                return handler.sendMessage(e1);
            }
        } else
        {
            return false;
        }
    }
}
