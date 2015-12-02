// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;

import com.facebook.mqtt.b;
import com.facebook.mqtt.messages.k;
import com.google.common.base.Preconditions;
import com.google.common.d.a.ab;
import com.google.common.d.a.s;
import java.util.concurrent.ScheduledFuture;

public class ao
{

    private final b a;
    private final k b;
    private final int c;
    private final ab d = ab.a();
    private final long e;
    private ScheduledFuture f;

    public ao(b b1, k k, int i, long l)
    {
        a = b1;
        b = k;
        c = i;
        e = l;
    }

    private void g()
    {
        if (f != null)
        {
            f.cancel(false);
        }
    }

    public b a()
    {
        return a;
    }

    public void a(Throwable throwable)
    {
        g();
        d.a_(throwable);
    }

    public void a(ScheduledFuture scheduledfuture)
    {
        Preconditions.checkNotNull(scheduledfuture);
        boolean flag;
        if (f == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Timeout future can be set only once.");
        f = scheduledfuture;
    }

    public k b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public s d()
    {
        return d;
    }

    public long e()
    {
        return e;
    }

    public void f()
    {
        g();
        d.a_(null);
    }
}
