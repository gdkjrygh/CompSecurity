// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

public final class lpu
{

    private static Object b = new Object();
    private static String c[] = "gtm.lifetime".toString().split("\\.");
    private static final Pattern d = Pattern.compile("(\\d+)\\s*([smhd]?)");
    final lpz a;
    private final ConcurrentHashMap e;
    private final Map f;
    private final ReentrantLock g;
    private final LinkedList h;
    private final CountDownLatch i;

    lpu()
    {
        this(((lpz) (new lpv())));
    }

    lpu(lpz lpz1)
    {
        a = lpz1;
        e = new ConcurrentHashMap();
        f = new HashMap();
        g = new ReentrantLock();
        h = new LinkedList();
        i = new CountDownLatch(1);
        a.a(new lpw(this));
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

    public static transient Map a(Object aobj[])
    {
        if (aobj.length % 2 != 0)
        {
            throw new IllegalArgumentException("expected even number of key-value pairs");
        }
        HashMap hashmap = new HashMap();
        for (int j = 0; j < aobj.length; j += 2)
        {
            if (!(aobj[j] instanceof String))
            {
                throw new IllegalArgumentException((new StringBuilder("key is not a string: ")).append(aobj[j]).toString());
            }
            hashmap.put((String)aobj[j], aobj[j + 1]);
        }

        return hashmap;
    }

    static CountDownLatch a(lpu lpu1)
    {
        return lpu1.i;
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
            if (obj != b)
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
                collection.add(new lpx(map, entry.getValue()));
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

    static void a(lpu lpu1, Map map)
    {
        lpu1.b(map);
    }

    private void b(Map map)
    {
        g.lock();
        h.offer(map);
        if (g.getHoldCount() != 1)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        int j = 0;
_L2:
        Object obj = (Map)h.poll();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        d(((Map) (obj)));
        j++;
        if (j <= 500) goto _L2; else goto _L1
_L1:
        h.clear();
        throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
        map;
        g.unlock();
        throw map;
        obj = c(map);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        obj = null;
_L3:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        ArrayList arraylist = new ArrayList();
        a(map, "", arraylist);
        arraylist.remove("gtm.lifetime");
        a.a(arraylist, ((Long) (obj)).longValue());
        g.unlock();
        return;
        obj = c(obj.toString());
          goto _L3
    }

    private static Long c(String s)
    {
        Object obj = d.matcher(s);
        if (!((Matcher) (obj)).matches())
        {
            lqh.c((new StringBuilder("unknown _lifetime: ")).append(s).toString());
            return null;
        }
        long l;
        try
        {
            l = Long.parseLong(((Matcher) (obj)).group(1));
        }
        catch (NumberFormatException numberformatexception)
        {
            lqh.b((new StringBuilder("illegal number in _lifetime value: ")).append(s).toString());
            l = 0L;
        }
        if (l <= 0L)
        {
            lqh.c((new StringBuilder("non-positive _lifetime: ")).append(s).toString());
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
            lqh.b((new StringBuilder("unknown units in _lifetime: ")).append(s).toString());
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

    private static Object c(Map map)
    {
        String as[] = c;
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

    private void d(Map map)
    {
        Map map1 = f;
        map1;
        JVM INSTR monitorenter ;
        String s;
        for (Iterator iterator1 = map.keySet().iterator(); iterator1.hasNext(); a(a(s, map.get(s)), f))
        {
            s = (String)iterator1.next();
        }

        break MISSING_BLOCK_LABEL_68;
        map;
        map1;
        JVM INSTR monitorexit ;
        throw map;
        map1;
        JVM INSTR monitorexit ;
        for (Iterator iterator = e.keySet().iterator(); iterator.hasNext(); ((lpy)iterator.next()).a(map)) { }
        return;
    }

    final void a(String s)
    {
        a(a(s, null));
        a.a(s);
    }

    public final void a(Map map)
    {
        try
        {
            i.await();
        }
        catch (InterruptedException interruptedexception)
        {
            lqh.b("DataLayer.push: unexpected InterruptedException");
        }
        b(map);
    }

    final void a(lpy lpy1)
    {
        e.put(lpy1, Integer.valueOf(0));
    }

    public final Object b(String s)
    {
        Map map = f;
        map;
        JVM INSTR monitorenter ;
        Object obj;
        String as[];
        int k;
        obj = f;
        as = s.split("\\.");
        k = as.length;
        int j;
        s = ((String) (obj));
        j = 0;
_L2:
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        obj = as[j];
        if (s instanceof Map)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        map;
        JVM INSTR monitorexit ;
        return null;
        s = ((String) (((Map)s).get(obj)));
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        map;
        JVM INSTR monitorexit ;
        return null;
        map;
        JVM INSTR monitorexit ;
        return s;
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final String toString()
    {
        Map map = f;
        map;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new StringBuilder();
        java.util.Map.Entry entry;
        for (Iterator iterator = f.entrySet().iterator(); iterator.hasNext(); ((StringBuilder) (obj)).append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", new Object[] {
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
