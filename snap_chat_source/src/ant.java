// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class ant
{

    private static anu a;

    public static anu a()
    {
        if (a != null) goto _L2; else goto _L1
_L1:
        anv anv3;
        List list1;
        anv anv1 = new anv();
        anv.d d = new anv.d();
        anv1.a(d, d);
        anv1.a(0);
        anv1 = anv1.b();
        anv1.a(1);
        anv1 = anv1.b();
        anv1.a(2);
        anv1 = anv1.b();
        anv1.a(3);
        anv3 = anv1.b();
        list1 = anv3.a;
        if (list1.size() != 0) goto _L4; else goto _L3
_L3:
        Object obj = anv.d.a;
        obj = anv.d.a;
        obj = new anv.f("T", "T");
        anv3.a(((anx) (obj)), ((anw) (obj)));
_L6:
        anv3.a(4);
        anv anv2 = anv3.b();
        anv2.a(5);
        anv2 = anv2.b();
        anv2.a(9);
        a = anv2.b().a();
_L2:
        return a;
_L4:
        Object obj1 = null;
        int i = list1.size();
        List list;
label0:
        do
        {
label1:
            {
                i--;
                anv.f f = obj1;
                list = list1;
                if (i >= 0)
                {
                    if (!(list1.get(i) instanceof anv.f))
                    {
                        break label1;
                    }
                    f = (anv.f)list1.get(i);
                    list = list1.subList(i + 1, list1.size());
                }
                if (f != null && list.size() == 0)
                {
                    throw new IllegalStateException("Cannot have two adjacent separators");
                }
                break label0;
            }
            i--;
        } while (true);
        anv.a(list);
        list.clear();
        anv.f f1 = new anv.f("T", "T");
        list.add(f1);
        list.add(f1);
        if (true) goto _L6; else goto _L5
_L5:
    }
}
