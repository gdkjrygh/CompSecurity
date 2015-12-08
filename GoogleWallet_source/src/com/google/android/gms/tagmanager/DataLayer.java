// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.Arrays;
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
//            bg

public final class DataLayer
{
    static final class a
    {

        public final String TN;
        public final Object wE;

        public final boolean equals(Object obj)
        {
            if (obj instanceof a)
            {
                if (TN.equals(((a) (obj = (a)obj)).TN) && wE.equals(((a) (obj)).wE))
                {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode()
        {
            return Arrays.hashCode(new Integer[] {
                Integer.valueOf(TN.hashCode()), Integer.valueOf(wE.hashCode())
            });
        }

        public final String toString()
        {
            return (new StringBuilder("Key: ")).append(TN).append(" value: ").append(wE.toString()).toString();
        }

        a(String s, Object obj)
        {
            TN = s;
            wE = obj;
        }
    }

    static interface b
    {

        public abstract void E(Map map);
    }

    static interface c
    {

        public abstract void a(a a1);

        public abstract void a(List list, long l);
    }

    public static interface c.a
    {

        public abstract void k(List list);
    }


    public static final String EVENT_KEY = "event";
    public static final Object OBJECT_NOT_PRESENT = new Object();
    static final String aNf[] = "gtm.lifetime".toString().split("\\.");
    private static final Pattern aNg = Pattern.compile("(\\d+)\\s*([smhd]?)");
    private final ConcurrentHashMap aNh;
    private final Map aNi;
    private final ReentrantLock aNj;
    private final LinkedList aNk;
    private final c aNl;
    private final CountDownLatch aNm;

    DataLayer()
    {
        this(new c() {

            public final void a(c.a a1)
            {
                a1.k(new ArrayList());
            }

            public final void a(List list, long l)
            {
            }

        });
    }

    DataLayer(c c1)
    {
        aNl = c1;
        aNh = new ConcurrentHashMap();
        aNi = new HashMap();
        aNj = new ReentrantLock();
        aNk = new LinkedList();
        aNm = new CountDownLatch(1);
        sH();
    }

    private void G(Map map)
    {
        aNj.lock();
        aNk.offer(map);
        if (aNj.getHoldCount() == 1)
        {
            sI();
        }
        H(map);
        aNj.unlock();
        return;
        map;
        aNj.unlock();
        throw map;
    }

    private void H(Map map)
    {
        Long long1 = I(map);
        if (long1 == null)
        {
            return;
        } else
        {
            map = K(map);
            map.remove("gtm.lifetime");
            aNl.a(map, long1.longValue());
            return;
        }
    }

    private Long I(Map map)
    {
        map = ((Map) (J(map)));
        if (map == null)
        {
            return null;
        } else
        {
            return dz(map.toString());
        }
    }

    private static Object J(Map map)
    {
        String as[] = aNf;
        int j = as.length;
        int i = 0;
        do
        {
            Object obj;
label0:
            {
                obj = map;
                if (i < j)
                {
                    obj = as[i];
                    if (map instanceof Map)
                    {
                        break label0;
                    }
                    obj = null;
                }
                return obj;
            }
            map = ((Map) (((Map)map).get(obj)));
            i++;
        } while (true);
    }

    private List K(Map map)
    {
        ArrayList arraylist = new ArrayList();
        a(map, "", arraylist);
        return arraylist;
    }

    private void L(Map map)
    {
        Map map1 = aNi;
        map1;
        JVM INSTR monitorenter ;
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); a(e(s, map.get(s)), aNi))
        {
            s = (String)iterator.next();
        }

        break MISSING_BLOCK_LABEL_68;
        map;
        map1;
        JVM INSTR monitorexit ;
        throw map;
        map1;
        JVM INSTR monitorexit ;
        M(map);
        return;
    }

    private void M(Map map)
    {
        for (Iterator iterator = aNh.keySet().iterator(); iterator.hasNext(); ((b)iterator.next()).E(map)) { }
    }

    static CountDownLatch a(DataLayer datalayer)
    {
        return datalayer.aNm;
    }

    static void a(DataLayer datalayer, Map map)
    {
        datalayer.G(map);
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
                collection.add(new a(map, entry.getValue()));
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
                b((List)obj, (List)map1.get(s));
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

    private void b(List list, List list1)
    {
        for (; list1.size() < list.size(); list1.add(null)) { }
        int i = 0;
        while (i < list.size()) 
        {
            Object obj = list.get(i);
            if (obj instanceof List)
            {
                if (!(list1.get(i) instanceof List))
                {
                    list1.set(i, new ArrayList());
                }
                b((List)obj, (List)list1.get(i));
            } else
            if (obj instanceof Map)
            {
                if (!(list1.get(i) instanceof Map))
                {
                    list1.set(i, new HashMap());
                }
                a((Map)obj, (Map)list1.get(i));
            } else
            if (obj != OBJECT_NOT_PRESENT)
            {
                list1.set(i, obj);
            }
            i++;
        }
    }

    private static Long dz(String s)
    {
        Object obj = aNg.matcher(s);
        if (!((Matcher) (obj)).matches())
        {
            bg.i((new StringBuilder("unknown _lifetime: ")).append(s).toString());
            return null;
        }
        long l;
        try
        {
            l = Long.parseLong(((Matcher) (obj)).group(1));
        }
        catch (NumberFormatException numberformatexception)
        {
            bg.w((new StringBuilder("illegal number in _lifetime value: ")).append(s).toString());
            l = 0L;
        }
        if (l <= 0L)
        {
            bg.i((new StringBuilder("non-positive _lifetime: ")).append(s).toString());
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
            bg.w((new StringBuilder("unknown units in _lifetime: ")).append(s).toString());
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

    static Map e(String s, Object obj)
    {
        HashMap hashmap = new HashMap();
        String as[] = s.toString().split("\\.");
        int i = 0;
        HashMap hashmap1;
        for (s = hashmap; i < as.length - 1; s = hashmap1)
        {
            hashmap1 = new HashMap();
            s.put(as[i], hashmap1);
            i++;
        }

        s.put(as[as.length - 1], obj);
        return hashmap;
    }

    private void sH()
    {
        aNl.a(new c.a() {

            final DataLayer aNn;

            public final void k(List list)
            {
                a a1;
                DataLayer datalayer;
                for (list = list.iterator(); list.hasNext(); DataLayer.a(datalayer, DataLayer.e(a1.TN, a1.wE)))
                {
                    a1 = (a)list.next();
                    datalayer = aNn;
                    DataLayer datalayer1 = aNn;
                }

                DataLayer.a(aNn).countDown();
            }

            
            {
                aNn = DataLayer.this;
                super();
            }
        });
    }

    private void sI()
    {
        int i = 0;
        do
        {
            Map map = (Map)aNk.poll();
            if (map != null)
            {
                L(map);
                i++;
                if (i > 500)
                {
                    aNk.clear();
                    throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
                }
            } else
            {
                return;
            }
        } while (true);
    }

    final void a(b b1)
    {
        aNh.put(b1, Integer.valueOf(0));
    }

    public final void push(Map map)
    {
        try
        {
            aNm.await();
        }
        catch (InterruptedException interruptedexception)
        {
            bg.w("DataLayer.push: unexpected InterruptedException");
        }
        G(map);
    }

    public final String toString()
    {
        Map map = aNi;
        map;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new StringBuilder();
        java.util.Map.Entry entry;
        for (Iterator iterator = aNi.entrySet().iterator(); iterator.hasNext(); ((StringBuilder) (obj)).append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", new Object[] {
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
