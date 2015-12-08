// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.internal.o;

public final class c
{
    private final class a extends Handler
    {

        final c Jt;

        public void handleMessage(Message message)
        {
            boolean flag = true;
            if (message.what != 1)
            {
                flag = false;
            }
            o.K(flag);
            Jt.b((b)message.obj);
        }

        public a(Looper looper)
        {
            Jt = c.this;
            super(looper);
        }
    }

    public static interface b
    {

        public abstract void d(Object obj);

        public abstract void gr();
    }


    private final a Js;
    private volatile Object mListener;

    c(Looper looper, Object obj)
    {
        Js = new a(looper);
        mListener = o.b(obj, "Listener must not be null");
    }

    public void a(b b1)
    {
        o.b(b1, "Notifier must not be null");
        b1 = Js.obtainMessage(1, b1);
        Js.sendMessage(b1);
    }

    void b(b b1)
    {
        Object obj = mListener;
        if (obj == null)
        {
            b1.gr();
            return;
        }
        try
        {
            b1.d(obj);
            return;
        }
        catch (Exception exception)
        {
            Log.w("ListenerHolder", "Notifying listener failed", exception);
        }
        b1.gr();
    }

    public void clear()
    {
        mListener = null;
    }
}
