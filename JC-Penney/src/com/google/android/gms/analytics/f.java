// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.internal.ab;
import com.google.android.gms.analytics.internal.au;
import com.google.android.gms.analytics.internal.i;
import com.google.android.gms.analytics.internal.s;
import com.google.android.gms.common.internal.u;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            o, l, k

public final class f extends o
{

    private static List b = new ArrayList();
    private boolean c;
    private boolean d;
    private Set e;
    private boolean f;
    private volatile boolean g;

    public f(ab ab1)
    {
        super(ab1);
        e = new HashSet();
    }

    public static f a(Context context)
    {
        return ab.a(context).k();
    }

    public static void d()
    {
        com/google/android/gms/analytics/f;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((Runnable)iterator.next()).run()) { }
        break MISSING_BLOCK_LABEL_50;
        Exception exception;
        exception;
        com/google/android/gms/analytics/f;
        JVM INSTR monitorexit ;
        throw exception;
        b = null;
        com/google/android/gms/analytics/f;
        JVM INSTR monitorexit ;
    }

    private s n()
    {
        return i().l();
    }

    public l a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        s1 = new l(i(), s1, null);
        s1.E();
        this;
        JVM INSTR monitorexit ;
        return s1;
        s1;
        this;
        JVM INSTR monitorexit ;
        throw s1;
    }

    public void a()
    {
        b();
        c = true;
    }

    public void a(boolean flag)
    {
        f = flag;
    }

    void b()
    {
        s s1 = n();
        if (s1.d())
        {
            g().a(s1.e());
        }
        if (s1.h())
        {
            a(s1.i());
        }
        if (s1.d())
        {
            k k1 = i.a();
            if (k1 != null)
            {
                k1.a(s1.e());
            }
        }
    }

    public boolean c()
    {
        return c && !d;
    }

    public boolean e()
    {
        return f;
    }

    public boolean f()
    {
        return g;
    }

    public k g()
    {
        return i.a();
    }

    public String h()
    {
        u.c("getClientId can not be called from the main thread");
        return i().p().b();
    }

}
