// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class emp extends mvc
{

    private final ekq l;
    private final ekw m;
    private final ej n = new ej(this);
    private final ekk o;

    public emp(Context context, ekq ekq1, ekw ekw, ekk ekk)
    {
        super(context);
        l = ekq1;
        m = ekw;
        o = ekk;
    }

    private ekr t()
    {
        return (ekr)((els)olm.a(super.f, els)).a(l.a());
    }

    public final Object d()
    {
        return s();
    }

    protected final boolean q()
    {
        t().a(l, n);
        return true;
    }

    protected final boolean r()
    {
        t().b(l, n);
        return true;
    }

    public final elb s()
    {
        return ((ekv)((elw)olm.a(super.f, elw)).a(l.a())).a(l, m, o);
    }
}
