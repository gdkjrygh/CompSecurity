// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class epq
{

    private static oni h = new oni("debug.photos.add_shared_album");
    boolean a;
    epf b;
    epf c;
    epf d;
    epf e;
    epf f;
    epf g;
    private final Context i;

    public epq(Context context)
    {
        i = context;
        context = (new eph(i)).b(-100).c(b.mJ).d(b.mK).e(b.mF);
        epm epm1 = new epm();
        epm1.b = 2000;
        context.f = epm1.a();
        b = context.a();
        context = (new eph(i)).b(-200).c(b.mL).d(b.mK).e(b.mF);
        epm1 = new epm();
        epm1.b = 2000;
        context.f = epm1.a();
        c = context.a();
        context = (new eph(i)).a(8).c(b.mQ).d(b.mR).e(b.mE);
        epm1 = new epm();
        epm1.b = 50;
        context.f = epm1.a();
        d = context.a();
        context = (new eph(i)).b(1).c(b.mS).d(b.mT).e(b.mD);
        epm1 = new epm();
        epm1.a = 5;
        epm1.b = 2000;
        epm1.c = 33;
        context.f = epm1.a();
        e = context.a();
        context = (new eph(i)).a(1).c(b.mO).d(b.mP).e(b.mC);
        epm1 = new epm();
        epm1.a = 2;
        epm1.b = 50;
        context.f = epm1.a();
        g = context.a();
        context = (new eph(i)).a(4).c(b.mM).d(b.mN).e(b.mB);
        epm1 = new epm();
        epm1.a = 2;
        epm1.b = 9;
        context.f = epm1.a();
        f = context.a();
    }

    static epf a(int j, List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            epf epf1 = (epf)list.next();
            if (epf1.c == j)
            {
                return epf1;
            }
        }

        return null;
    }

    static epf b(int j, List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            epf epf1 = (epf)list.next();
            if (epf1.d == j)
            {
                return epf1;
            }
        }

        return null;
    }

    public final List a(boolean flag, boolean flag1)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(b);
        if (flag)
        {
            arraylist.add(d);
        }
        arraylist.add(e);
        arraylist.add(g);
        arraylist.add(f);
        return arraylist;
    }

}
