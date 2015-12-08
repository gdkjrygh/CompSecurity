// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.location.Location;
import com.google.android.gms.ads.b.a;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            eh, q

public final class p
{

    public static final String a = com.google.android.gms.internal.eh.a("emulator");
    private final Date b;
    private final String c;
    private final int d;
    private final Set e;
    private final Location f;
    private final boolean g;
    private final Map h;
    private final String i;
    private final com.google.android.gms.ads.search.a j;
    private final int k;
    private final Set l;

    public p(q q1)
    {
        this(q1, (byte)0);
    }

    private p(q q1, byte byte0)
    {
        b = com.google.android.gms.internal.q.a(q1);
        c = q.b(q1);
        d = q.c(q1);
        e = Collections.unmodifiableSet(q.d(q1));
        f = q.e(q1);
        g = q.f(q1);
        h = Collections.unmodifiableMap(q.g(q1));
        i = q.h(q1);
        j = null;
        k = q.i(q1);
        l = Collections.unmodifiableSet(q.j(q1));
    }

    public final a a(Class class1)
    {
        return (a)h.get(class1);
    }

    public final Date a()
    {
        return b;
    }

    public final boolean a(Context context)
    {
        return l.contains(com.google.android.gms.internal.eh.a(context));
    }

    public final String b()
    {
        return c;
    }

    public final int c()
    {
        return d;
    }

    public final Set d()
    {
        return e;
    }

    public final Location e()
    {
        return f;
    }

    public final boolean f()
    {
        return g;
    }

    public final String g()
    {
        return i;
    }

    public final com.google.android.gms.ads.search.a h()
    {
        return j;
    }

    public final Map i()
    {
        return h;
    }

    public final int j()
    {
        return k;
    }

}
