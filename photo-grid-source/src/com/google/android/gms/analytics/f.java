// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.internal.aa;
import com.google.android.gms.analytics.internal.i;
import com.google.android.gms.analytics.internal.r;
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

    public f(aa aa1)
    {
        super(aa1);
        e = new HashSet();
    }

    public static f a(Context context)
    {
        return aa.a(context).j();
    }

    public static void c()
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

    public final l a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = new l(f(), s);
        s.C();
        this;
        JVM INSTR monitorexit ;
        return s;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final void a()
    {
        r r1 = f().k();
        if (r1.d())
        {
            i.a().a(r1.e());
        }
        if (r1.h())
        {
            f = r1.i();
        }
        if (r1.d())
        {
            k k1 = i.a();
            if (k1 != null)
            {
                k1.a(r1.e());
            }
        }
        c = true;
    }

    public final boolean b()
    {
        return c && !d;
    }

    public final boolean d()
    {
        return f;
    }

    public final boolean e()
    {
        return g;
    }

}
