// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class dxh extends hgu
{

    final mpk a;
    private final dwa b;
    private final dum c;
    private final Context d;

    public dxh(Context context, dum dum1)
    {
        a = (mpk)olm.a(context, mpk);
        a.a(b.kw, new dxi(this));
        c = dum1;
        d = context;
        dwh dwh1 = new dwh();
        dwh1.a = dum1.e;
        dwh1.c = context.getString(c.cq);
        dwh1.i = b.kv;
        dwh1.d = context.getString(c.co);
        b = dwh1.b(c.cl, new dxk(this), pws.i).a(c.cp, new dxj(this, dum1), pwt.u).a();
    }

    static void a(dxh dxh1)
    {
        ((dyb)olm.a(dxh1.d, dyb)).a(dxh1.c.c, dxh1.c.a);
    }

    public final int a()
    {
        return b.a();
    }

    public final void a(afn afn)
    {
        b.a((dwk)afn);
    }

    public final long b()
    {
        return c.c;
    }
}
