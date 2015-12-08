// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public final class hsg extends nzc
{

    public ple a;
    private final String b;
    private final long c;
    private final long d;
    private final int e;

    hsg(Context context, int i, long l, String s, long l1, 
            int j)
    {
        super(context, new nyg(context, i), "editphotocluster", new paz(), new pba());
        c = l;
        b = s;
        d = l1;
        e = j;
    }

    protected final void a(qlw qlw)
    {
        qlw = (paz)qlw;
        qlw.a = new pkx();
        qlw = ((paz) (qlw)).a;
        qlw.a = new qbe();
        ((pkx) (qlw)).a.b = new qbf();
        ((pkx) (qlw)).a.b.a = Long.valueOf(c);
        qlw.b = new pky();
        if (e != 0)
        {
            ((pkx) (qlw)).b.a = 4;
            ((pkx) (qlw)).b.c = new plb();
            ((pkx) (qlw)).b.c.a = e;
            return;
        }
        if (TextUtils.isEmpty(b))
        {
            ((pkx) (qlw)).b.a = 2;
            return;
        }
        ((pkx) (qlw)).b.a = 1;
        ((pkx) (qlw)).b.b = new plc();
        if (d == -1L)
        {
            ((pkx) (qlw)).b.b.a = b;
            return;
        } else
        {
            ((pkx) (qlw)).b.b.b = new qin();
            ((pkx) (qlw)).b.b.b.a = new qio();
            ((pkx) (qlw)).b.b.b.a.a = Long.valueOf(d);
            return;
        }
    }

    protected final void b(qlw qlw)
    {
        a = ((pba)qlw).a;
    }
}
