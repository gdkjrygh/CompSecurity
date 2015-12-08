// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.os.IBinder;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.internal:
//            gf, gd, fw

final class ge
{

    final gd a;
    private final String b;
    private final gf c = new gf(this);
    private final HashSet d = new HashSet();
    private int e;
    private boolean f;
    private IBinder g;
    private ComponentName h;

    public ge(gd gd, String s)
    {
        a = gd;
        super();
        b = s;
        e = 0;
    }

    static int a(ge ge1, int i)
    {
        ge1.e = i;
        return i;
    }

    static ComponentName a(ge ge1, ComponentName componentname)
    {
        ge1.h = componentname;
        return componentname;
    }

    static IBinder a(ge ge1, IBinder ibinder)
    {
        ge1.g = ibinder;
        return ibinder;
    }

    static HashSet a(ge ge1)
    {
        return ge1.d;
    }

    public final gf a()
    {
        return c;
    }

    public final void a(fw fw)
    {
        d.add(fw);
    }

    public final void a(boolean flag)
    {
        f = flag;
    }

    public final String b()
    {
        return b;
    }

    public final void b(fw fw)
    {
        d.remove(fw);
    }

    public final boolean c()
    {
        return f;
    }

    public final boolean c(fw fw)
    {
        return d.contains(fw);
    }

    public final int d()
    {
        return e;
    }

    public final boolean e()
    {
        return d.isEmpty();
    }

    public final IBinder f()
    {
        return g;
    }

    public final ComponentName g()
    {
        return h;
    }
}
