// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gvr extends nzc
{

    public pnp a;
    private final String b;
    private final String c;
    private final pnp d;

    public gvr(Context context, int i, String s, pnp pnp)
    {
        super(context, (new nyh()).a(context, i).a(), "setphotoeditlist", new pdf(), new pdg());
        b = s;
        c = ((mmv)olm.a(context, mmv)).a(i).b("gaia_id");
        d = pnp;
    }

    protected final void a(qlw qlw)
    {
        qlw = (pdf)qlw;
        qlw.a = new pls();
        qlw = ((pdf) (qlw)).a;
        qlw.b = b;
        qlw.a = c;
        qlw.c = d;
        qlw.d = Boolean.TRUE;
        qlw.e = 3;
        qlw.h = b.i();
        qlw.g = Boolean.TRUE;
        qlw.f = new plg();
        ((pls) (qlw)).f.a = Boolean.TRUE;
    }

    protected final void b(qlw qlw)
    {
        qlw = ((pdg)qlw).a;
        a = ((pme) (qlw)).b;
        ((pme) (qlw)).a.booleanValue();
    }
}
