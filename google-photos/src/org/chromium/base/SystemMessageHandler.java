// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.os.Handler;
import android.os.Message;
import qwp;

public class SystemMessageHandler extends Handler
{

    private long a;
    private long b;

    private SystemMessageHandler(long l)
    {
        a = 0L;
        b = 0L;
        a = l;
    }

    private static Message a(int i)
    {
        Message message = Message.obtain();
        message.what = i;
        qwp.a(message, true);
        return message;
    }

    private static SystemMessageHandler create(long l)
    {
        return new SystemMessageHandler(l);
    }

    private native void nativeDoRunLoopOnce(long l, long l1);

    private void removeAllPendingMessages()
    {
        removeMessages(1);
        removeMessages(2);
    }

    private void scheduleDelayedWork(long l, long l1)
    {
        if (b != 0L)
        {
            removeMessages(2);
        }
        b = l;
        sendMessageDelayed(a(2), l1);
    }

    private void scheduleWork()
    {
        sendMessage(a(1));
    }

    public void handleMessage(Message message)
    {
        if (message.what == 2)
        {
            b = 0L;
        }
        nativeDoRunLoopOnce(a, b);
    }
}
