// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

final class huj
    implements iwj
{

    private final int a;
    private final Context b;
    private final long c;

    public huj(Context context, int i, long l)
    {
        b = context;
        a = i;
        c = l;
    }

    public final Object a(Object obj)
    {
        Object obj1 = (htq)obj;
        obj = ((htq) (obj1)).c;
        HashSet hashset = new HashSet();
        ArrayList arraylist = new ArrayList();
        Iterator iterator = ((htq) (obj1)).a.iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            hrr hrr1 = (hrr)iterator.next();
            boolean flag1 = flag;
            if (hrr1.ar_() == -1L)
            {
                flag1 = flag;
                if (!flag)
                {
                    arraylist.add(new hud());
                    flag1 = true;
                }
            }
            boolean flag3;
            if (hrr1.ar_() != -1L && hrr1.ar_() != c || hrr1.ar_() == -1L && !hashset.contains(hrr1.c()))
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            flag = flag1;
            if (flag3)
            {
                arraylist.add(new huf(b, hrr1, a, arraylist.size()));
                hashset.add(hrr1.c());
                flag = flag1;
            }
        } while (true);
        if (((htq) (obj1)).d)
        {
            obj1 = ((htq) (obj1)).b.iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                String s = (String)((Iterator) (obj1)).next();
                if (!hashset.contains(s))
                {
                    boolean flag2 = flag;
                    if (!flag)
                    {
                        arraylist.add(new hud());
                        flag2 = true;
                    }
                    hse hse1 = new hse(((String) (obj)), s);
                    arraylist.add(new huf(b, hse1, a, arraylist.size()));
                    hashset.add(s);
                    flag = flag2;
                }
            } while (true);
        } else
        {
            arraylist.add(new htx(b));
        }
        return arraylist;
    }
}
