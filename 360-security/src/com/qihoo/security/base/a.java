// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.base;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

public abstract class com.qihoo.security.base.a
{
    protected static final class a extends Handler
    {

        private final WeakReference a;

        public void handleMessage(Message message)
        {
            if (a != null && a.get() != null && message != null)
            {
                ((com.qihoo.security.base.a)a.get()).a(message);
            }
        }

        public a(com.qihoo.security.base.a a1)
        {
            a = new WeakReference(a1);
        }
    }


    protected final Context a;
    protected a b;

    public com.qihoo.security.base.a(Context context)
    {
        a = context;
        b = new a(this);
    }

    public void a()
    {
        b.removeCallbacksAndMessages(null);
    }

    protected abstract void a(Message message);
}
