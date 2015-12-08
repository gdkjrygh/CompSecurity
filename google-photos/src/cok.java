// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Pair;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class cok
{

    private static final cok c = new cok(1280, 720, 1280, 720);
    public final int a;
    public final int b;
    private int d;
    private int e;

    cok(int i, int j, int k, int l)
    {
        Integer integer = ddy.f.b();
        if (integer == null)
        {
            i = b.a(i, "width");
        } else
        {
            i = integer.intValue();
        }
        a = i;
        integer = ddy.g.b();
        if (integer == null)
        {
            i = b.a(j, "height");
        } else
        {
            i = integer.intValue();
        }
        b = i;
        d = Math.max(b.a(k, "maxWidth"), a);
        e = Math.max(b.a(l, "maxHeight"), b);
    }

    public static cok a(List list, Map map)
    {
label0:
        {
            if (!ddy.e.a())
            {
                break label0;
            }
            list = new col(list, map);
            if (((col) (list)).a.isEmpty())
            {
                return c;
            }
            list.a();
            map = new HashMap();
            Iterator iterator = ((col) (list)).c.iterator();
            long l2 = 0L;
            int l1 = 0;
            int j1 = 0;
            int j = 0;
            int i = 0;
            while (iterator.hasNext()) 
            {
label1:
                {
                    com com1 = (com)iterator.next();
                    Pair pair = new Pair(Integer.valueOf(com1.a), Integer.valueOf(com1.b));
                    list = (Long)map.get(pair);
                    int k;
                    int i1;
                    long l3;
                    if (list == null)
                    {
                        list = Long.valueOf(com1.c);
                    } else
                    {
                        list = Long.valueOf(list.longValue() + com1.c);
                    }
                    map.put(pair, list);
                    if (list.longValue() <= l2)
                    {
                        i1 = l1;
                        k = j1;
                        l3 = l2;
                        if (list.longValue() != l2)
                        {
                            break label1;
                        }
                        i1 = l1;
                        k = j1;
                        l3 = l2;
                        if (com1.a * com1.b <= j1 * l1)
                        {
                            break label1;
                        }
                    }
                    l3 = list.longValue();
                    k = com1.a;
                    i1 = com1.b;
                }
                int l;
                if (com1.a * com1.b > j * i)
                {
                    i = com1.a;
                    j = com1.b;
                } else
                {
                    int k1 = j;
                    j = i;
                    i = k1;
                }
                j1 = i;
                i = j;
                j = j1;
                l1 = i1;
                j1 = k;
                l2 = l3;
            }
            if (j >= i)
            {
                l = i;
                i = j;
                j = l;
            }
            return new cok(j1, l1, i, j);
        }
        list = new col(list, map);
        list.a();
        if (((col) (list)).b)
        {
            return list.a(720, 1280);
        } else
        {
            return list.a(1280, 720);
        }
    }

    public static cok a(List list, Map map, int i, int j)
    {
        return (new col(list, map)).a(i, j);
    }

    public final String toString()
    {
        String s = String.valueOf(getClass().getSimpleName());
        int i = a;
        int j = b;
        int k = d;
        int l = e;
        return (new StringBuilder(String.valueOf(s).length() + 53)).append(s).append(": ").append(i).append(",").append(j).append(" max ").append(k).append(",").append(l).toString();
    }

}
