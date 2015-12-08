// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.h;

import android.os.Bundle;
import com.google.android.m4b.maps.g.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.m4b.maps.h:
//            i, h, f, b

public final class g
    implements i
{

    private final h a;

    public g(h h1)
    {
        a = h1;
    }

    public final c.a a(c.a a1)
    {
        a.f.add(a1);
        return a1;
    }

    public final void a()
    {
        for (Iterator iterator = a.l.values().iterator(); iterator.hasNext(); ((b.a)iterator.next()).d()) { }
    }

    public final void a(int j)
    {
        if (j == -1)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0)
        {
            for (Iterator iterator = a.f.iterator(); iterator.hasNext(); ((h.e)iterator.next()).a()) { }
            a.f.clear();
            a.f();
            a.m.clear();
        }
    }

    public final void a(Bundle bundle)
    {
    }

    public final void a(a a1, b b1, int j)
    {
    }

    public final c.a b(c.a a1)
    {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void b()
    {
        h h1;
        h1 = a;
        h1.a.lock();
        h1.r = new f(h1, h1.o, h1.p, h1.q, h1.a, h1.d);
        h1.r.a();
        h1.b.signalAll();
        h1.a.unlock();
        return;
        Exception exception;
        exception;
        h1.a.unlock();
        throw exception;
    }

    public final void b(int j)
    {
    }

    public final String c()
    {
        return "DISCONNECTED";
    }
}
