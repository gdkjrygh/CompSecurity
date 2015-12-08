// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.tagmanager:
//            d, e, h, y, 
//            f, g

public final class c
{

    public static final Object a = new Object();
    static final String b[] = "gtm.lifetime".toString().split("\\.");
    private static final Pattern c = Pattern.compile("(\\d+)\\s*([smhd]?)");
    private final ConcurrentHashMap d;
    private final Map e;
    private final ReentrantLock f;
    private final LinkedList g;
    private final h h;
    private final CountDownLatch i;

    c()
    {
        this(((h) (new d())));
    }

    c(h h1)
    {
        h = h1;
        d = new ConcurrentHashMap();
        e = new HashMap();
        f = new ReentrantLock();
        g = new LinkedList();
        i = new CountDownLatch(1);
        h.a(new e(this));
    }

    private static Long a(String s)
    {
        Object obj = c.matcher(s);
        if (!((Matcher) (obj)).matches())
        {
            y.c((new StringBuilder("unknown _lifetime: ")).append(s).toString());
            return null;
        }
        long l;
        try
        {
            l = Long.parseLong(((Matcher) (obj)).group(1));
        }
        catch (NumberFormatException numberformatexception)
        {
            y.b((new StringBuilder("illegal number in _lifetime value: ")).append(s).toString());
            l = 0L;
        }
        if (l <= 0L)
        {
            y.c((new StringBuilder("non-positive _lifetime: ")).append(s).toString());
            return null;
        }
        obj = ((Matcher) (obj)).group(2);
        if (((String) (obj)).length() == 0)
        {
            return Long.valueOf(l);
        }
        switch (((String) (obj)).charAt(0))
        {
        default:
            y.b((new StringBuilder("unknown units in _lifetime: ")).append(s).toString());
            return null;

        case 115: // 's'
            return Long.valueOf(l * 1000L);

        case 109: // 'm'
            return Long.valueOf(l * 1000L * 60L);

        case 104: // 'h'
            return Long.valueOf(l * 1000L * 60L * 60L);

        case 100: // 'd'
            return Long.valueOf(l * 1000L * 60L * 60L * 24L);
        }
    }

    static Map a(String s, Object obj)
    {
        HashMap hashmap = new HashMap();
        String as[] = s.toString().split("\\.");
        int j = 0;
        HashMap hashmap1;
        for (s = hashmap; j < as.length - 1; s = hashmap1)
        {
            hashmap1 = new HashMap();
            s.put(as[j], hashmap1);
            j++;
        }

        s.put(as[as.length - 1], obj);
        return hashmap;
    }

    static CountDownLatch a(c c1)
    {
        return c1.i;
    }

    static void a(c c1, Map map)
    {
        c1.b(map);
    }

    private void a(List list, List list1)
    {
        for (; list1.size() < list.size(); list1.add(null)) { }
        int j = 0;
        while (j < list.size()) 
        {
            Object obj = list.get(j);
            if (obj instanceof List)
            {
                if (!(list1.get(j) instanceof List))
                {
                    list1.set(j, new ArrayList());
                }
                a((List)obj, (List)list1.get(j));
            } else
            if (obj instanceof Map)
            {
                if (!(list1.get(j) instanceof Map))
                {
                    list1.set(j, new HashMap());
                }
                a((Map)obj, (Map)list1.get(j));
            } else
            if (obj != a)
            {
                list1.set(j, obj);
            }
            j++;
        }
    }

    private void a(Map map, String s, Collection collection)
    {
        Iterator iterator = map.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            StringBuilder stringbuilder = (new StringBuilder()).append(s);
            if (s.length() == 0)
            {
                map = "";
            } else
            {
                map = ".";
            }
            map = stringbuilder.append(map).append((String)entry.getKey()).toString();
            if (entry.getValue() instanceof Map)
            {
                a((Map)entry.getValue(), ((String) (map)), collection);
            } else
            if (!map.equals("gtm.lifetime"))
            {
                collection.add(new f(map, entry.getValue()));
            }
        } while (true);
    }

    private void a(Map map, Map map1)
    {
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            Object obj = map.get(s);
            if (obj instanceof List)
            {
                if (!(map1.get(s) instanceof List))
                {
                    map1.put(s, new ArrayList());
                }
                a((List)obj, (List)map1.get(s));
            } else
            if (obj instanceof Map)
            {
                if (!(map1.get(s) instanceof Map))
                {
                    map1.put(s, new HashMap());
                }
                a((Map)obj, (Map)map1.get(s));
            } else
            {
                map1.put(s, obj);
            }
        }

    }

    private void b(Map map)
    {
        f.lock();
        g.offer(map);
        if (f.getHoldCount() != 1)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        int j = 0;
_L2:
        Object obj = (Map)g.poll();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_200;
        }
        Map map1 = e;
        map1;
        JVM INSTR monitorenter ;
        String s;
        for (Iterator iterator1 = ((Map) (obj)).keySet().iterator(); iterator1.hasNext(); a(a(s, ((Map) (obj)).get(s)), e))
        {
            s = (String)iterator1.next();
        }

        break MISSING_BLOCK_LABEL_126;
        map;
        map1;
        JVM INSTR monitorexit ;
        throw map;
        map;
        f.unlock();
        throw map;
        map1;
        JVM INSTR monitorexit ;
        for (Iterator iterator = d.keySet().iterator(); iterator.hasNext(); ((g)iterator.next()).a(((Map) (obj)))) { }
        j++;
        if (j <= 500) goto _L2; else goto _L1
_L1:
        g.clear();
        throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
        obj = c(map);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        obj = null;
_L3:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        ArrayList arraylist = new ArrayList();
        a(map, "", arraylist);
        arraylist.remove("gtm.lifetime");
        h.a(arraylist, ((Long) (obj)).longValue());
        f.unlock();
        return;
        obj = a(obj.toString());
          goto _L3
    }

    private static Object c(Map map)
    {
        String as[] = b;
        int k = as.length;
        int j = 0;
        do
        {
            Object obj;
label0:
            {
                obj = map;
                if (j < k)
                {
                    obj = as[j];
                    if (map instanceof Map)
                    {
                        break label0;
                    }
                    obj = null;
                }
                return obj;
            }
            map = ((Map) (((Map)map).get(obj)));
            j++;
        } while (true);
    }

    final void a(g g1)
    {
        d.put(g1, Integer.valueOf(0));
    }

    public final void a(Map map)
    {
        try
        {
            i.await();
        }
        catch (InterruptedException interruptedexception)
        {
            y.b("DataLayer.push: unexpected InterruptedException");
        }
        b(map);
    }

    public final String toString()
    {
        Map map = e;
        map;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new StringBuilder();
        java.util.Map.Entry entry;
        for (Iterator iterator = e.entrySet().iterator(); iterator.hasNext(); ((StringBuilder) (obj)).append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", new Object[] {
    entry.getKey(), entry.getValue()
})))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        break MISSING_BLOCK_LABEL_93;
        obj;
        map;
        JVM INSTR monitorexit ;
        throw obj;
        obj = ((StringBuilder) (obj)).toString();
        map;
        JVM INSTR monitorexit ;
        return ((String) (obj));
    }

}
