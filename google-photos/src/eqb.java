// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class eqb extends nzc
{

    pkg a;
    pkf b;
    private final List c;
    private int d;

    public eqb(Context context, int i, List list, int j)
    {
        super(context, new nyg(context, i), "createmediaproject", new par(), new pas());
        boolean flag;
        if (!list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "must specify non-empty mediaList");
        c = list;
        d = j;
    }

    protected final void a(qlw qlw)
    {
        qlw = (par)qlw;
        qlw.a = new pjk();
        ((par) (qlw)).a.a = 1;
        Object obj = new pxi();
        obj.a = new pxk();
        Object obj1 = ((pxi) (obj)).a;
        String as[] = new String[c.size()];
        for (int i = 0; i < c.size(); i++)
        {
            as[i] = ((hpg)((ekp)c.get(i)).a(hpg)).b().c;
        }

        obj1.a = as;
        ((par) (qlw)).a.b = ((pxi) (obj));
        obj = new pxd();
        obj1 = new ArrayList(c.size());
        for (int j = 0; j < c.size(); j++)
        {
            int k = (int)((jdv)((ekp)c.get(j)).a(jdv)).p();
            if (k <= 0)
            {
                continue;
            }
            pxe pxe1 = new pxe();
            Object obj2 = (ekp)c.get(j);
            pxe1.a = ((hpg)((ekp) (obj2)).a(hpg)).b().c;
            obj2 = (gaf)((ekp) (obj2)).b(gaf);
            if (obj2 != null)
            {
                pxe1.c = Integer.valueOf(((gaf) (obj2)).k());
                pxe1.d = Integer.valueOf(((gaf) (obj2)).l());
            }
            pxe1.b = Integer.valueOf(k);
            ((List) (obj1)).add(pxe1);
        }

        obj.a = (pxe[])((List) (obj1)).toArray(new pxe[0]);
        obj1 = new pxf();
        obj1.a = Integer.valueOf(d);
        obj.b = ((pxf) (obj1));
        ((par) (qlw)).a.c = ((pxd) (obj));
    }

    protected final void b(qlw qlw)
    {
        qlw = (pas)qlw;
        if (qlw == null || ((pas) (qlw)).a == null)
        {
            return;
        } else
        {
            a = ((pas) (qlw)).a.a;
            b = ((pas) (qlw)).a.c;
            return;
        }
    }
}
