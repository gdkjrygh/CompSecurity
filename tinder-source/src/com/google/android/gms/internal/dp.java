// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.internal.u;

public final class dp
{
    private final class a extends Handler
    {

        final dp a;

        public final void handleMessage(Message message)
        {
            boolean flag = true;
            Object obj;
            if (message.what != 1)
            {
                flag = false;
            }
            u.b(flag);
            obj = a;
            message = (b)message.obj;
            obj = ((dp) (obj)).a;
            if (obj == null)
            {
                message.a();
                return;
            }
            try
            {
                message.a(obj);
                return;
            }
            catch (RuntimeException runtimeexception)
            {
                message.a();
                throw runtimeexception;
            }
        }

        public a(Looper looper)
        {
            a = dp.this;
            super(looper);
        }
    }

    public static interface b
    {

        public abstract void a();

        public abstract void a(Object obj);
    }


    public volatile Object a;
    private final a b;

    public dp(Looper looper, Object obj)
    {
        b = new a(looper);
        a = u.a(obj, "Listener must not be null");
    }

    public final void a(b b1)
    {
        u.a(b1, "Notifier must not be null");
        b1 = b.obtainMessage(1, b1);
        b.sendMessage(b1);
    }
}
