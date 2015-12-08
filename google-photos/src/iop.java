// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class iop extends nzc
{

    private final int a;
    private final iuj b;
    private final pgq c;

    public iop(Context context, int i, int j, iuj iuj1, pgq pgq)
    {
        super(context, (new nyh()).a(context, i).a(), "reportstoryabuse", new pdd(), new pde());
        a = j;
        b = iuj1;
        c = pgq;
    }

    protected final void a(qlw qlw)
    {
        qlw = (pdd)qlw;
        qlw.a = new pea();
        qlw = ((pdd) (qlw)).a;
        qlw.b = new pac();
        ((pea) (qlw)).b.a = a;
        qlw.c = Boolean.valueOf(false);
        qlw.a = new pgp();
        ((pea) (qlw)).a.b = b.a;
        ((pea) (qlw)).a.c = c;
    }
}
