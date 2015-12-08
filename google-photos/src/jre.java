// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class jre extends jsw
{

    final jrw a;

    public jre(jrk jrk1, jrm jrm1)
    {
        super(jrk1);
        b.d(jrm1);
        a = jrm1.c(jrk1);
    }

    public final long a(jrn jrn)
    {
        r();
        b.d(jrn);
        jrk.i();
        long l = a.a(jrn, true);
        if (l == 0L)
        {
            a.a(jrn);
        }
        return l;
    }

    protected final void a()
    {
        a.s();
    }

    public final void a(String s, Runnable runnable)
    {
        b.a(s, "campaign param can't be empty");
        super.d.b().a(new jrg(this, s, runnable));
    }

    public final void a(jsk jsk)
    {
        r();
        super.d.b().a(new jri(this, jsk));
    }

    public final void a(jsn jsn)
    {
        b.d(jsn);
        r();
        b("Hit delivery requested", jsn);
        super.d.b().a(new jrh(this, jsn));
    }

    public final void a(boolean flag)
    {
        a("Network connectivity status changed", Boolean.valueOf(flag));
        super.d.b().a(new jrf(this, flag));
    }

    public final void b()
    {
        r();
        ljb.b();
        a.m();
    }

    public final void c()
    {
        b("Radio powered up");
        r();
        Context context = super.d.a;
        if (jqf.a(context) && jqg.a(context))
        {
            Intent intent = new Intent(context, jqg);
            intent.setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            context.startService(intent);
            return;
        } else
        {
            a(((jsk) (null)));
            return;
        }
    }

    final void d()
    {
        jrk.i();
        a.e();
    }

    final void e()
    {
        jrk.i();
        a.d();
    }
}
