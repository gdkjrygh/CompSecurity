// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import com.google.common.a.hq;
import com.google.inject.a;
import java.util.List;

// Referenced classes of package com.facebook.inject:
//            am, an, ao

class al
{

    private static ThreadLocal a = new am();

    al()
    {
    }

    public static void a()
    {
        List list = (List)a.get();
        list.remove(list.size() - 1);
        list.remove(list.size() - 1);
    }

    public static void a(ao ao1, a a1)
    {
        List list = (List)a.get();
        list.add(ao1);
        list.add(a1);
    }

    public static List b()
    {
        List list = (List)a.get();
        java.util.ArrayList arraylist = hq.a();
        for (int i = 0; i < list.size(); i += 2)
        {
            arraylist.add(new an((ao)list.get(i), (a)list.get(i + 1)));
        }

        return arraylist;
    }

}
