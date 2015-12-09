// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.analytics.AnalyticsService;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.d.ad;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            z, ad, an, x, 
//            w, v, u, ab, 
//            ae, bh, d

public class t extends z
{

    private final an a;

    public t(ab ab, com.google.android.gms.analytics.internal.ad ad1)
    {
        super(ab);
        u.a(ad1);
        a = ad1.j(ab);
    }

    static an a(t t1)
    {
        return t1.a;
    }

    public long a(ae ae)
    {
        D();
        u.a(ae);
        m();
        long l = a.a(ae, true);
        if (l == 0L)
        {
            a.a(ae);
        }
        return l;
    }

    protected void a()
    {
        a.E();
    }

    public void a(bh bh)
    {
        D();
        r().a(new x(this, bh));
    }

    public void a(d d1)
    {
        u.a(d1);
        D();
        b("Hit delivery requested", d1);
        r().a(new w(this, d1));
    }

    public void a(String s, Runnable runnable)
    {
        u.a(s, "campaign param can't be empty");
        r().a(new v(this, s, runnable));
    }

    public void a(boolean flag)
    {
        a("Network connectivity status changed", Boolean.valueOf(flag));
        r().a(new com.google.android.gms.analytics.internal.u(this, flag));
    }

    public void b()
    {
        a.b();
    }

    public void c()
    {
        D();
        Context context = o();
        if (AnalyticsReceiver.a(context) && AnalyticsService.a(context))
        {
            Intent intent = new Intent(context, com/google/android/gms/analytics/AnalyticsService);
            intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            context.startService(intent);
            return;
        } else
        {
            a(((bh) (null)));
            return;
        }
    }

    public void d()
    {
        D();
        ad.d();
        a.f();
    }

    public void e()
    {
        b("Radio powered up");
        c();
    }

    void f()
    {
        m();
        a.e();
    }

    void g()
    {
        m();
        a.d();
    }
}
