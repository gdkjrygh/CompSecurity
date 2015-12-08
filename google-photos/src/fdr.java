// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class fdr extends hgu
{

    final npk a;
    private final dum b;
    private dwa c;

    public fdr(Context context, am am, dum dum1)
    {
        b = dum1;
        a = (npk)olm.a(context, npk);
        olm.a(context, mmr);
        fcm fcm1 = (fcm)dum1.a(fcm);
        dwh dwh1 = new dwh();
        dwh1.a = dum1.e;
        dwh1.c = context.getString(s.u);
        dwh1.d = context.getString(s.B);
        context = dwh1.b(s.E, new fdu(this), pws.t).b(s.z, new fdt(this, dum1), pws.i).a(s.s, new fds(this, fcm1, am), pws.k);
        context.i = c.cD;
        c = context.a();
    }

    public final int a()
    {
        return c.a();
    }

    public final void a(afn afn)
    {
        c.a((dwk)afn);
    }

    public final long b()
    {
        return b.c;
    }
}
