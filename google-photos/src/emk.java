// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class emk extends mvc
{

    private final ekq l;
    private final els m;
    private final ej n = new ej(this);
    private final ekk o;

    emk(Context context, ekq ekq1, ekk ekk1)
    {
        super(context);
        l = (ekq)p.a(ekq1);
        o = (ekk)p.a(ekk1);
        m = (els)olm.a(context, els);
    }

    private elb s()
    {
        elb elb1;
        try
        {
            elb1 = b.b(t().a(l, o).a());
        }
        catch (eke eke1)
        {
            return b.a(eke1);
        }
        return elb1;
    }

    private ekr t()
    {
        return (ekr)m.a(l.a());
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
}
