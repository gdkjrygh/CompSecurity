// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package dagger.a;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package dagger.a:
//            n, r

public final class s
{

    public static Map a(n n1, Object aobj[])
    {
        Object obj = new LinkedHashMap(aobj.length);
        int i = 0;
        while (i < aobj.length) 
        {
            if (aobj[i] instanceof Class)
            {
                r r2 = n1.a((Class)aobj[i]);
                ((Map) (obj)).put(r2, r2.newModule());
            } else
            {
                ((Map) (obj)).put(n1.a(aobj[i].getClass()), aobj[i]);
            }
            i++;
        }
        aobj = new LinkedHashMap(((Map) (obj)));
        LinkedHashMap linkedhashmap = new LinkedHashMap();
        for (obj = ((Map) (obj)).keySet().iterator(); ((Iterator) (obj)).hasNext(); a(n1, (r)((Iterator) (obj)).next(), ((Map) (linkedhashmap)))) { }
        n1 = linkedhashmap.values().iterator();
        do
        {
            if (!n1.hasNext())
            {
                break;
            }
            r r1 = (r)n1.next();
            if (!((Map) (aobj)).containsKey(r1))
            {
                ((Map) (aobj)).put(r1, r1.newModule());
            }
        } while (true);
        return ((Map) (aobj));
    }

    private static void a(n n1, r r1, Map map)
    {
        r1 = r1.includes;
        int j = r1.length;
        for (int i = 0; i < j; i++)
        {
            Class class1 = r1[i];
            if (!map.containsKey(class1))
            {
                r r2 = n1.a(class1);
                map.put(class1, r2);
                a(n1, r2, map);
            }
        }

    }
}
