// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.executors;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.common.a.a;
import com.google.common.base.Preconditions;
import com.google.common.d.a.h;
import com.google.common.d.a.i;
import com.google.common.d.a.s;

// Referenced classes of package com.facebook.common.executors:
//            a, j, c

public class b
    implements com.facebook.common.executors.a
{

    private volatile boolean a;

    public b()
    {
    }

    public void a()
    {
        if (!a)
        {
            Preconditions.checkState(c());
        }
    }

    public void a(long l)
    {
        Thread.sleep(l);
    }

    public void a(s s, h h)
    {
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(h);
        Preconditions.checkNotNull(Looper.myLooper(), "Must be called on a handler thread");
        i.a(s, h, new j(new Handler()));
    }

    public void a(Runnable runnable)
    {
        if (c())
        {
            (new a(runnable)).a();
            return;
        } else
        {
            runnable.run();
            return;
        }
    }

    public void a(Runnable runnable, long l)
    {
        (new Handler(Looper.getMainLooper())).postDelayed(runnable, l);
    }

    public void a(String s, Runnable runnable)
    {
        s = new HandlerThread(s);
        s.start();
        (new Handler(s.getLooper())).post(new c(this, runnable, s));
    }

    public void b()
    {
        if (!a)
        {
            boolean flag;
            if (!c())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
        }
    }

    public void b(Runnable runnable)
    {
        if (c())
        {
            runnable.run();
            return;
        } else
        {
            (new Handler(Looper.getMainLooper())).post(runnable);
            return;
        }
    }

    public void c(Runnable runnable)
    {
        (new a(runnable)).a();
    }

    public boolean c()
    {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void d(Runnable runnable)
    {
        (new Handler(Looper.getMainLooper())).post(runnable);
    }
}
