// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.analytics.f;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.d.q;
import com.google.android.gms.d.r;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            bf, am, b, au, 
//            s, j, bb, an, 
//            k, t, ak, l, 
//            af, bg, n, ab

public class ad
{

    private final Context a;
    private final Context b;

    public ad(Context context)
    {
        u.a(context);
        context = context.getApplicationContext();
        u.a(context, "Application context can't be null");
        a = context;
        b = context;
    }

    public Context a()
    {
        return a;
    }

    protected bf a(ab ab)
    {
        return new bf(ab);
    }

    protected com.google.android.gms.d.ad a(Context context)
    {
        return com.google.android.gms.d.ad.a(context);
    }

    public Context b()
    {
        return b;
    }

    protected am b(ab ab)
    {
        return new am(ab);
    }

    protected b c(ab ab)
    {
        return new b(ab);
    }

    protected au d(ab ab)
    {
        return new au(ab);
    }

    protected s e(ab ab)
    {
        return new s(ab);
    }

    protected j f(ab ab)
    {
        return new j(ab);
    }

    protected bb g(ab ab)
    {
        return new bb(ab);
    }

    protected q h(ab ab)
    {
        return r.c();
    }

    protected f i(ab ab)
    {
        return new f(ab);
    }

    an j(ab ab)
    {
        return new an(ab, this);
    }

    k k(ab ab)
    {
        return new k(ab);
    }

    protected t l(ab ab)
    {
        return new t(ab, this);
    }

    public ak m(ab ab)
    {
        return new ak(ab);
    }

    public l n(ab ab)
    {
        return new l(ab);
    }

    public af o(ab ab)
    {
        return new af(ab);
    }

    public bg p(ab ab)
    {
        return new bg(ab);
    }

    public n q(ab ab)
    {
        return new n(ab);
    }
}
