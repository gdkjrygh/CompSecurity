// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class emh extends mvc
{

    private final ekq l;
    private final ekk m;
    private final ej n = new ej(this);
    private final ekr o;

    public emh(Context context, ekq ekq1, ekk ekk)
    {
        super(context);
        l = ekq1;
        m = ekk;
        o = (ekr)((els)olm.a(super.f, els)).a(ekq1.a());
    }

    public final Object d()
    {
        return o.a(l, m);
    }

    protected final boolean q()
    {
        o.a(l, n);
        return super.q();
    }

    protected final boolean r()
    {
        o.b(l, n);
        return super.r();
    }
}
