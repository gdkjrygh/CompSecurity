// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class cmj
    implements cmq
{

    private final cmk a;

    public cmj(cmk cmk1)
    {
        a = cmk1;
    }

    public final clu a(clu clu)
    {
        a.f.add(clu);
        return clu;
    }

    public final void a()
    {
        for (Iterator iterator = a.l.values().iterator(); iterator.hasNext(); ((bqr)iterator.next()).c()) { }
        a.n = Collections.emptySet();
    }

    public final void a(int i)
    {
    }

    public final void a(Bundle bundle)
    {
    }

    public final void a(ConnectionResult connectionresult, bql bql, int i)
    {
    }

    public final clu b(clu clu)
    {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void b()
    {
        cmp cmp1;
        for (Iterator iterator = a.f.iterator(); iterator.hasNext(); cmp1.f())
        {
            cmp1 = (cmp)iterator.next();
            cmp1.a(null);
        }

        a.f.clear();
        a.m.clear();
        a.f();
    }

    public final void c()
    {
        cmk cmk1;
        cmk1 = a;
        cmk1.a.lock();
        cmk1.r = new clz(cmk1, cmk1.o, cmk1.p, cmk1.q, cmk1.a, cmk1.d);
        cmk1.r.a();
        cmk1.b.signalAll();
        cmk1.a.unlock();
        return;
        Exception exception;
        exception;
        cmk1.a.unlock();
        throw exception;
    }

    public final String d()
    {
        return "DISCONNECTED";
    }
}
