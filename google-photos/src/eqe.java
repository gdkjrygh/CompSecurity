// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.EnumSet;

public final class eqe extends nzc
{

    ArrayList a;
    private final Context b;
    private final EnumSet c;

    public eqe(Context context, int i, EnumSet enumset)
    {
        super(context, new nyg(context, i), "readphotosfeatures", new pcp(), new pcq());
        boolean flag;
        if (enumset.size() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "must specify at least 1 feature");
        b = context;
        c = enumset;
    }

    protected final void a(qlw qlw)
    {
        qlw = (pcp)qlw;
        qhc qhc1 = new qhc();
        qlw.a = qhc1;
        if (c.contains(eqd.a))
        {
            qhc1.a = new qgw();
        }
        if (c.contains(eqd.b))
        {
            qhc1.b = new qfs();
            qhc1.b.a = new qft();
        }
    }

    protected final void b(qlw qlw)
    {
        qlw = (pcq)qlw;
        super.b(qlw);
        if (c.contains(eqd.b))
        {
            a = new ArrayList();
            if (qlw != null && ((pcq) (qlw)).a != null && ((pcq) (qlw)).a.a != null && ((pcq) (qlw)).a.a.a != null)
            {
                qlw = ((pcq) (qlw)).a.a.a;
                int j = qlw.length;
                int i = 0;
                while (i < j) 
                {
                    Object obj = qlw[i];
                    ArrayList arraylist = a;
                    eph eph1 = new eph(b);
                    if (((qfq) (obj)).b > 0)
                    {
                        eph1.b(((qfq) (obj)).b);
                    } else
                    {
                        eph1.a(((qfq) (obj)).a);
                    }
                    eph1.a = ((qfq) (obj)).d;
                    eph1.b = ((qfq) (obj)).e;
                    eph1.c = ((qfq) (obj)).c;
                    if (((qfq) (obj)).f != null)
                    {
                        epm epm1 = new epm();
                        epm1.a = ((qfq) (obj)).f.a.intValue();
                        epm1.b = ((qfq) (obj)).f.b.intValue();
                        if (((qfq) (obj)).f.c != null)
                        {
                            epm1.c = ((qfq) (obj)).f.c.intValue();
                        }
                        if (!((qfq) (obj)).f.d.booleanValue())
                        {
                            epm1.d = true;
                        }
                        eph1.f = epm1.a();
                    }
                    arraylist.add(eph1.a());
                    i++;
                }
            }
        }
    }
}
