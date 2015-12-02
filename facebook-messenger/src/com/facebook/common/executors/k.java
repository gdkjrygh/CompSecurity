// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.executors;

import android.os.Handler;
import android.os.Looper;
import com.google.common.d.a.g;
import java.util.concurrent.TimeUnit;

abstract class k extends g
{

    private final Handler a;

    public k(Handler handler)
    {
        a = handler;
    }

    private boolean a()
    {
        return Looper.myLooper() == a.getLooper();
    }

    private void d()
    {
        if (!isDone())
        {
            throw new IllegalStateException("Must not call get() function from this Handler thread. Will deadlock!");
        } else
        {
            return;
        }
    }

    public Object get()
    {
        if (a())
        {
            d();
        }
        return super.get();
    }

    public Object get(long l, TimeUnit timeunit)
    {
        if (a())
        {
            d();
        }
        return super.get(l, timeunit);
    }
}
