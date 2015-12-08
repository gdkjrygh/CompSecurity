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

public final class jzt
    implements kae
{

    private final jzu a;

    public jzt(jzu jzu1)
    {
        a = jzu1;
    }

    public final jzb a(jzb jzb)
    {
        a.f.add(jzb);
        return jzb;
    }

    public final void a()
    {
        for (Iterator iterator = a.m.values().iterator(); iterator.hasNext(); ((jyl)iterator.next()).a()) { }
        a.o = Collections.emptySet();
    }

    public final void a(int i)
    {
    }

    public final void a(Bundle bundle)
    {
    }

    public final void a(ConnectionResult connectionresult, jyh jyh, int i)
    {
    }

    public final jzb b(jzb jzb)
    {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void b()
    {
        for (Iterator iterator = a.f.iterator(); iterator.hasNext(); ((kad)iterator.next()).b()) { }
        a.f.clear();
        a.n.clear();
        a.g();
    }

    public final void c()
    {
        jzu jzu1;
        jzu1 = a;
        jzu1.a.lock();
        jzu1.s = new jzf(jzu1, jzu1.p, jzu1.q, jzu1.k, jzu1.r, jzu1.a, jzu1.d);
        jzu1.s.a();
        jzu1.b.signalAll();
        jzu1.a.unlock();
        return;
        Exception exception;
        exception;
        jzu1.a.unlock();
        throw exception;
    }

    public final String d()
    {
        return "DISCONNECTED";
    }
}
