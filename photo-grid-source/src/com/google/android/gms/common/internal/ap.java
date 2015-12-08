// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.stats.b;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            aq, an, ao

final class ap
{

    final an a;
    private final aq b = new aq(this);
    private final Set c = new HashSet();
    private int d;
    private boolean e;
    private IBinder f;
    private final ao g;
    private ComponentName h;

    public ap(an an1, ao ao1)
    {
        a = an1;
        super();
        g = ao1;
        d = 2;
    }

    static int a(ap ap1, int i)
    {
        ap1.d = i;
        return i;
    }

    static ComponentName a(ap ap1, ComponentName componentname)
    {
        ap1.h = componentname;
        return componentname;
    }

    static IBinder a(ap ap1, IBinder ibinder)
    {
        ap1.f = ibinder;
        return ibinder;
    }

    static ao a(ap ap1)
    {
        return ap1.g;
    }

    static Set b(ap ap1)
    {
        return ap1.c;
    }

    public final void a()
    {
        an.c(a).a(com.google.android.gms.common.internal.an.b(a), b);
        e = false;
        d = 2;
    }

    public final void a(ServiceConnection serviceconnection)
    {
        an.c(a).b(com.google.android.gms.common.internal.an.b(a), serviceconnection);
        c.remove(serviceconnection);
    }

    public final void a(ServiceConnection serviceconnection, String s)
    {
        an.c(a).a(com.google.android.gms.common.internal.an.b(a), serviceconnection, s, g.a());
        c.add(serviceconnection);
    }

    public final void a(String s)
    {
        d = 3;
        e = an.c(a).a(com.google.android.gms.common.internal.an.b(a), s, g.a(), b, 129);
        if (e)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        d = 2;
        an.c(a).a(com.google.android.gms.common.internal.an.b(a), b);
        return;
        s;
    }

    public final boolean b()
    {
        return e;
    }

    public final boolean b(ServiceConnection serviceconnection)
    {
        return c.contains(serviceconnection);
    }

    public final int c()
    {
        return d;
    }

    public final boolean d()
    {
        return c.isEmpty();
    }

    public final IBinder e()
    {
        return f;
    }

    public final ComponentName f()
    {
        return h;
    }
}
