// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.internal.ig;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.common.internal:
//            z, w, x

final class y
{

    final w a;
    private final z b = new z(this);
    private final Set c = new HashSet();
    private int d;
    private boolean e;
    private IBinder f;
    private final x g;
    private ComponentName h;

    public y(w w1, x x1)
    {
        a = w1;
        super();
        g = x1;
        d = 2;
    }

    static int a(y y1, int i)
    {
        y1.d = i;
        return i;
    }

    static ComponentName a(y y1, ComponentName componentname)
    {
        y1.h = componentname;
        return componentname;
    }

    static IBinder a(y y1, IBinder ibinder)
    {
        y1.f = ibinder;
        return ibinder;
    }

    static x a(y y1)
    {
        return y1.g;
    }

    static Set b(y y1)
    {
        return y1.c;
    }

    public final void a()
    {
        w.c(a).a(w.b(a), b);
        e = false;
        d = 2;
    }

    public final void a(ServiceConnection serviceconnection)
    {
        w.c(a).b(w.b(a), serviceconnection);
        c.remove(serviceconnection);
    }

    public final void a(ServiceConnection serviceconnection, String s)
    {
        w.c(a).a(w.b(a), serviceconnection, s, g.a());
        c.add(serviceconnection);
    }

    public final void a(String s)
    {
        e = w.c(a).a(w.b(a), s, g.a(), b, 129);
        if (e)
        {
            d = 3;
            return;
        } else
        {
            w.c(a).a(w.b(a), b);
            return;
        }
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
