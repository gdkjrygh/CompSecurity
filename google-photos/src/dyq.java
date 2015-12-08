// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class dyq extends hgu
{

    private dwa a;
    private final dum b;

    public dyq(Context context, dum dum1)
    {
        b = dum1;
        dwh dwh1 = new dwh();
        dwh1.a = dum1.e;
        dwh1.c = context.getString(p.j);
        dwh1.i = b.kE;
        dwh1.d = context.getString(p.h);
        a = dwh1.b(p.g, new dys(this, dum1), pws.i).a(p.i, new dyr(this, dum1), pws.l).a();
    }

    public final int a()
    {
        return a.a();
    }

    public final void a(afn afn)
    {
        a.a((dwk)afn);
    }

    public final long b()
    {
        return b.c;
    }
}
