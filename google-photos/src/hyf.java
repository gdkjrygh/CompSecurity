// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class hyf
    implements iwj
{

    private static List a;
    private final int b;
    private final Context c;
    private final int d;
    private final boolean e;
    private final hxv f;
    private final hxh g;

    public hyf(Context context, int i, int j, boolean flag)
    {
        c = context;
        d = i;
        b = j;
        e = flag;
        f = (hxv)olm.a(context, hxv);
        g = (hxh)olm.a(context, hxh);
    }

    private boolean a(hsr hsr1, int i)
    {
        if (!e)
        {
            return false;
        }
        for (Iterator iterator = Arrays.asList(new hsw[] {
    hsw.a, hsw.b, hsw.c
}).iterator(); iterator.hasNext();)
        {
            List list = hsr1.a((hsw)iterator.next());
            if (list != null && list.size() >= i)
            {
                return false;
            }
        }

        return true;
    }

    public final Object a(Object obj)
    {
        obj = (hsr)obj;
        if (a(((hsr) (obj)), 1))
        {
            return Collections.emptyList();
        }
        ArrayList arraylist = new ArrayList();
        Object obj1 = f;
        int i = d;
        if (a(((hsr) (obj)), (new Long(((hxv) (obj1)).b.b(hxv.a, i).longValue())).intValue()))
        {
            arraylist.add(new hwi());
        }
        obj1 = a.iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            hsw hsw1 = (hsw)((Iterator) (obj1)).next();
            List list = ((hsr) (obj)).a(hsw1);
            if (list != null && !list.isEmpty())
            {
                int j = b * (new nvq(c)).a;
                int k = j;
                if (hsw1 == hsw.d)
                {
                    k = j / 2;
                }
                int l;
                boolean flag1;
                if (list.size() > k)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (e)
                {
                    arraylist.add(new hwu(c, hsw1, flag1));
                }
                l = 0;
                j = 0;
                while (l < list.size() && j < k) 
                {
                    hsv hsv1 = (hsv)list.get(l);
                    boolean flag;
                    if (g.d == hxi.b || hsv1.a() != hsw.a || hsv1.at_())
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (flag)
                    {
                        arraylist.add(new hwm(d, hsv1, j));
                        j++;
                    }
                    l++;
                }
            }
        } while (true);
        return arraylist;
    }

    static 
    {
        a = Arrays.asList(new hsw[] {
            hsw.a, hsw.b, hsw.c, hsw.d
        });
    }
}
