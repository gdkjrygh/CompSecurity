// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public abstract class gxk
{

    private static final Comparator b = new Comparator() {

        public final int compare(Object obj, Object obj1)
        {
            obj = (java.util.Map.Entry)obj;
            obj1 = (java.util.Map.Entry)obj1;
            return ((Integer)((java.util.Map.Entry) (obj)).getKey()).compareTo((Integer)((java.util.Map.Entry) (obj1)).getKey());
        }

    };
    public List a;

    protected gxk(Map map)
    {
        a = b(map);
    }

    public static gxk a(Map map)
    {
        int i = -1;
        Iterator iterator = map.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            int j = ((Integer)iterator.next()).intValue();
            if (j > i)
            {
                i = j;
            }
        } while (true);
        int k = map.size();
        boolean flag;
        if (i <= 64 || (float)k / (float)i > 0.75F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return new gxl(map, i);
        } else
        {
            return new gxm(map);
        }
    }

    private static List b(Map map)
    {
        Object obj = new TreeSet(b);
        ((TreeSet) (obj)).addAll(map.entrySet());
        map = new ArrayList();
        for (obj = ((TreeSet) (obj)).iterator(); ((Iterator) (obj)).hasNext(); map.add(((java.util.Map.Entry)((Iterator) (obj)).next()).getValue())) { }
        return map;
    }

    public abstract Object a(int i);

    public abstract boolean b(int i);

}
