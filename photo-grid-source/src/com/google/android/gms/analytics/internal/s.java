// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.analytics.AnalyticsService;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.bl;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            y, ac, aa, am, 
//            w, v, u, t, 
//            ad, bf, d

public final class s extends y
{

    private final am a;

    public s(aa aa1, ac ac1)
    {
        super(aa1);
        bl.a(ac1);
        a = ac1.c(aa1);
    }

    static am a(s s1)
    {
        return s1.a;
    }

    public final long a(ad ad)
    {
        B();
        bl.a(ad);
        aa.r();
        long l = a.b(ad);
        if (l == 0L)
        {
            a.a(ad);
        }
        return l;
    }

    protected final void a()
    {
        a.C();
    }

    public final void a(bf bf)
    {
        B();
        p().a(new w(this, bf));
    }

    public final void a(d d1)
    {
        bl.a(d1);
        B();
        b("Hit delivery requested", d1);
        p().a(new v(this, d1));
    }

    public final void a(String s1, Runnable runnable)
    {
        bl.a(s1, "campaign param can't be empty");
        p().a(new u(this, s1, runnable));
    }

    public final void a(boolean flag)
    {
        a("Network connectivity status changed", Boolean.valueOf(flag));
        p().a(new t(this, flag));
    }

    public final void b()
    {
        a.b();
    }

    public final void c()
    {
        B();
        Context context = m();
        if (AnalyticsReceiver.a(context) && AnalyticsService.a(context))
        {
            Intent intent = new Intent(context, com/google/android/gms/analytics/AnalyticsService);
            intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            context.startService(intent);
            return;
        } else
        {
            a(((bf) (null)));
            return;
        }
    }

    public final void d()
    {
        B();
        com.google.android.gms.c.f.d();
        a.f();
    }

    final void e()
    {
        aa.r();
        a.e();
    }

    final void f()
    {
        aa.r();
        a.d();
    }
}
