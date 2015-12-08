// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.internal:
//            dr, ds, dq, z

public final class dp
{

    private final LinkedList a = new LinkedList();
    private final Object b = new Object();
    private final String c;
    private final String d;
    private long e;
    private long f;
    private boolean g;
    private long h;
    private long i;
    private long j;
    private long k;

    public dp(String s, String s1)
    {
        e = -1L;
        f = -1L;
        g = false;
        h = -1L;
        i = 0L;
        j = -1L;
        k = -1L;
        c = s;
        d = s1;
    }

    public final void a()
    {
        synchronized (b)
        {
            if (k != -1L && f != -1L)
            {
                f = SystemClock.elapsedRealtime();
                dr.b().b();
                dr.a(this);
            }
        }
    }

    public final void a(long l)
    {
        synchronized (b)
        {
            k = l;
            if (k != -1L)
            {
                dr.a(this);
            }
        }
    }

    public final void a(z z)
    {
        synchronized (b)
        {
            j = SystemClock.elapsedRealtime();
            dr.b().a(z, j);
        }
    }

    public final void a(boolean flag)
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (k == -1L)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        h = SystemClock.elapsedRealtime();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        f = h;
        dr.a(this);
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        synchronized (b)
        {
            if (k != -1L)
            {
                dq dq1 = new dq();
                dq1.c();
                a.add(dq1);
                i = i + 1L;
                dr.b().a();
                dr.a(this);
            }
        }
    }

    public final void b(long l)
    {
        synchronized (b)
        {
            if (k != -1L)
            {
                e = l;
                dr.a(this);
            }
        }
    }

    public final void b(boolean flag)
    {
        synchronized (b)
        {
            if (k != -1L)
            {
                g = flag;
                dr.a(this);
            }
        }
    }

    public final void c()
    {
        synchronized (b)
        {
            if (k != -1L && !a.isEmpty())
            {
                dq dq1 = (dq)a.getLast();
                if (dq1.a() == -1L)
                {
                    dq1.b();
                    dr.a(this);
                }
            }
        }
    }

    public final Bundle d()
    {
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        ArrayList arraylist;
        obj1 = new Bundle();
        ((Bundle) (obj1)).putString("seqnum", c);
        ((Bundle) (obj1)).putString("slotid", d);
        ((Bundle) (obj1)).putBoolean("ismediation", g);
        ((Bundle) (obj1)).putLong("treq", j);
        ((Bundle) (obj1)).putLong("tresponse", k);
        ((Bundle) (obj1)).putLong("timp", f);
        ((Bundle) (obj1)).putLong("tload", h);
        ((Bundle) (obj1)).putLong("pcc", i);
        ((Bundle) (obj1)).putLong("tfetch", e);
        arraylist = new ArrayList();
        for (Iterator iterator = a.iterator(); iterator.hasNext(); arraylist.add(((dq)iterator.next()).d())) { }
        break MISSING_BLOCK_LABEL_158;
        obj1;
        throw obj1;
        ((Bundle) (obj1)).putParcelableArrayList("tclick", arraylist);
        obj;
        JVM INSTR monitorexit ;
        return ((Bundle) (obj1));
    }
}
