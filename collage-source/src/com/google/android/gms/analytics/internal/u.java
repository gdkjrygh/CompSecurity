// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.analytics.c;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.ix;
import com.google.android.gms.internal.iy;
import com.google.android.gms.internal.zzof;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            ai, y, a, ab, 
//            o, g, af, z, 
//            h, p, x, i, 
//            w, aj, j, t

public class u
{

    private final Context a;
    private final Context b;

    public u(Context context)
    {
        z.a(context);
        context = context.getApplicationContext();
        z.a(context, "Application context can't be null");
        a = context;
        b = context;
    }

    public Context a()
    {
        return a;
    }

    protected ai a(t t)
    {
        return new ai(t);
    }

    protected zzof a(Context context)
    {
        return zzof.a(context);
    }

    public Context b()
    {
        return b;
    }

    protected y b(t t)
    {
        return new y(t);
    }

    protected a c(t t)
    {
        return new a(t);
    }

    protected ab d(t t)
    {
        return new ab(t);
    }

    protected o e(t t)
    {
        return new o(t);
    }

    protected g f(t t)
    {
        return new g(t);
    }

    protected af g(t t)
    {
        return new af(t);
    }

    protected ix h(t t)
    {
        return iy.d();
    }

    protected c i(t t)
    {
        return new c(t);
    }

    com.google.android.gms.analytics.internal.z j(t t)
    {
        return new com.google.android.gms.analytics.internal.z(t, this);
    }

    h k(t t)
    {
        return new h(t);
    }

    protected p l(t t)
    {
        return new p(t, this);
    }

    public x m(t t)
    {
        return new x(t);
    }

    public i n(t t)
    {
        return new i(t);
    }

    public w o(t t)
    {
        return new w(t);
    }

    public aj p(t t)
    {
        return new aj(t);
    }

    public j q(t t)
    {
        return new j(t);
    }
}
