// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class hkr extends nzc
{

    public boolean a;
    private final String b;
    private final String c[];

    public hkr(Context context, int i, String s, String as[])
    {
        super(context, (new nyh()).a(context, i).a(), "reordercollectionphotos", new pdb(), new pdc());
        a = false;
        boolean flag;
        if (as.length > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        p.a(s);
        c = as;
        b = s;
    }

    protected final void a(qlw qlw)
    {
        qlw = (pdb)qlw;
        qlw.a = new plq();
        qlw = ((pdb) (qlw)).a;
        qlw.a = "0";
        qlw.b = "0";
        qlw.c = b;
        qlw.d = c;
        qlw.e = 1;
    }

    protected final void b(qlw qlw)
    {
        qlw = (pdc)qlw;
        super.b(qlw);
        qlw = ((pdc) (qlw)).a;
        if (!l() && ((pmd) (qlw)).a.booleanValue())
        {
            a = true;
        }
    }
}
