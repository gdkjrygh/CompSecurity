// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.a;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//            dm, dl, dj

public final class dk
    implements dm
{

    private final dl a;

    public dk(dl dl1)
    {
        a = dl1;
    }

    public final dg.a a(dg.a a1)
    {
        a.f.add(a1);
        return a1;
    }

    public final void a()
    {
        for (Iterator iterator = a.m.values().iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.a.b)iterator.next()).a()) { }
        a.o = Collections.emptySet();
    }

    public final void a(int i)
    {
    }

    public final void a(Bundle bundle)
    {
    }

    public final void a(ConnectionResult connectionresult, a a1, int i)
    {
    }

    public final dg.a b(dg.a a1)
    {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void b()
    {
        dl.f f;
        for (Iterator iterator = a.f.iterator(); iterator.hasNext(); f.f())
        {
            f = (dl.f)iterator.next();
            f.a(null);
        }

        a.f.clear();
        a.n.clear();
        a.f();
    }

    public final void c()
    {
        dl dl1;
        dl1 = a;
        dl1.a.lock();
        dl1.s = new dj(dl1, dl1.p, dl1.q, dl1.k, dl1.r, dl1.a, dl1.d);
        dl1.s.a();
        dl1.b.signalAll();
        dl1.a.unlock();
        return;
        Exception exception;
        exception;
        dl1.a.unlock();
        throw exception;
    }

    public final String d()
    {
        return "DISCONNECTED";
    }
}
