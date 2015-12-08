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
//            bh

public class DataLayer
{
    static final class a
    {

        public final String JO;
        public final Object wq;

        public boolean equals(Object obj)
        {
            if (obj instanceof a)
            {
                if (JO.equals(((a) (obj = (a)obj)).JO) && wq.equals(((a) (obj)).wq))
                {
                    return true;
                }
            }
            return false;
        }

        public int hashCode()
        {
            return Arrays.hashCode(new Integer[] {
                Integer.valueOf(JO.hashCode()), Integer.valueOf(wq.hashCode())
            });
        }

        public String toString()
        {
            return (new StringBuilder()).append("Key: ").append(JO).append(" value: ").append(wq.toString()).toString();
        }

        a(String s, Object obj)
        {
            JO = s;
            wq = obj;
        }
    }

    static interface b
    {

        public abstract void D(Map map);
    }

    static interface c
    {

        public abstract void a(a a1);

        public abstract void a(List list, long l);

        public abstract void cx(String s);
    }

    public static interface c.a
    {

        public abstract void g(List list);
    }


    public static final String EVENT_KEY = "event";
    public static final Object OBJECT_NOT_PRESENT = new Object();
    static final String aoG[] = "gtm.lifetime".toString().split("\\.");
    private static final Pattern aoH = Pattern.compile("(\\d+)\\s*([smhd]?)");
    private final ConcurrentHashMap aoI;
    private final Map aoJ;
    private final ReentrantLock aoK;
    private final LinkedList aoL;
    private final c aoM;
    private final CountDownLatch aoN;

    DataLayer()
    {
        this(new c() {

            public void a(c.a a1)
            {
                a1.g(new ArrayList());
            }

            public void a(List list, long l)
            {
            }

            public void cx(String s)
            {
            }

        });
    }

    DataLayer(c c1)
    {
        aoM = c1;
        aoI = new ConcurrentHashMap();
        aoJ = new HashMap();
        aoK = new ReentrantLock();
        aoL = new LinkedList();
        aoN = new CountDownLatch(1);
        oe();
    }

    private void F(Map map)
    {
        aoK.lock();
        aoL.offer(map);
        if (aoK.getHoldCount() == 1)
        {
            of();
        }
        G(map);
        aoK.unlock();
        return;
        map;
        aoK.unlock();
        throw map;
    }

    private void G(Map map)
    {
        Long long1 = H(map);
        if (long1 == null)
        {
            return;
        } else
        {
            map = J(map);
            map.remove("gtm.lifetime");
            aoM.a(map, long1.longValue());
            return;
        }
    }

    private Long H(Map map)
    {
        map = ((Map) (I(map)));
        if (map == null)
        {
            return null;
        } else
        {
            return cw(map.toString());
        }
    }

    private Object I(Map map)
    {
        String as[] = aoG;
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

    private List J(Map map)
    {
        ArrayList arraylist = new ArrayList();
        a(map, "", arraylist);
        return arraylist;
    }

    private void K(Map map)
    {
        Map map1 = aoJ;
        map1;
        JVM INSTR monitorenter ;
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); a(c(s, map.get(s)), aoJ))
        {
            s = (String)iterator.next();
        }

        break MISSING_BLOCK_LABEL_69;
        map;
        map1;
        JVM INSTR monitorexit ;
        throw map;
        map1;
        JVM INSTR monitorexit ;
        L(map);
        return;
    }

    private void L(Map map)
    {
        for (Iterator iterator = aoI.keySet().iterator(); iterator.hasNext(); ((b)iterator.next()).D(map)) { }
    }

    static CountDownLatch a(DataLayer datalayer)
    {
        return datalayer.aoN;
    }

    static void a(DataLayer datalayer, Map map)
    {
        datalayer.F(map);
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

    static Long cw(String s)
    {
        Object obj = aoH.matcher(s);
        if (!((Matcher) (obj)).matches())
        {
            bh.U((new StringBuilder()).append("unknown _lifetime: ").append(s).toString());
            return null;
        }
        long l;
        try
        {
            l = Long.parseLong(((Matcher) (obj)).group(1));
        }
        catch (NumberFormatException numberformatexception)
        {
            bh.W((new StringBuilder()).append("illegal number in _lifetime value: ").append(s).toString());
            l = 0L;
        }
        if (l <= 0L)
        {
            bh.U((new StringBuilder()).append("non-positive _lifetime: ").append(s).toString());
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
            bh.W((new StringBuilder()).append("unknown units in _lifetime: ").append(s).toString());
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

    public static transient List listOf(Object aobj[])
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < aobj.length; i++)
        {
            arraylist.add(aobj[i]);
        }

        return arraylist;
    }

    public static transient Map mapOf(Object aobj[])
    {
        if (aobj.length % 2 != 0)
        {
            throw new IllegalArgumentException("expected even number of key-value pairs");
        }
        HashMap hashmap = new HashMap();
        for (int i = 0; i < aobj.length; i += 2)
        {
            if (!(aobj[i] instanceof String))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("key is not a string: ").append(aobj[i]).toString());
            }
            hashmap.put((String)aobj[i], aobj[i + 1]);
        }

        return hashmap;
    }

    private void oe()
    {
        aoM.a(new c.a() {

            final DataLayer aoO;

            public void g(List list)
            {
                a a1;
                for (list = list.iterator(); list.hasNext(); DataLayer.a(aoO, aoO.c(a1.JO, a1.wq)))
                {
                    a1 = (a)list.next();
                }

                DataLayer.a(aoO).countDown();
            }

            
            {
                aoO = DataLayer.this;
                super();
            }
        });
    }

    private void of()
    {
        int i = 0;
        do
        {
            Map map = (Map)aoL.poll();
            if (map != null)
            {
                K(map);
                i++;
                if (i > 500)
                {
                    aoL.clear();
                    throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
                }
            } else
            {
                return;
            }
        } while (true);
    }

    void a(b b1)
    {
        aoI.put(b1, Integer.valueOf(0));
    }

    void a(Map map, Map map1)
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

    void b(List list, List list1)
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

    Map c(String s, Object obj)
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

    void cv(String s)
    {
        push(s, null);
        aoM.cx(s);
    }

    public Object get(String s)
    {
        Map map = aoJ;
        map;
        JVM INSTR monitorenter ;
        Object obj;
        String as[];
        int j;
        obj = aoJ;
        as = s.split("\\.");
        j = as.length;
        int i;
        s = ((String) (obj));
        i = 0;
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        obj = as[i];
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
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void push(String s, Object obj)
    {
        push(c(s, obj));
    }

    public void push(Map map)
    {
        try
        {
            aoN.await();
        }
        catch (InterruptedException interruptedexception)
        {
            bh.W("DataLayer.push: unexpected InterruptedException");
        }
        F(map);
    }

    public void pushEvent(String s, Map map)
    {
        map = new HashMap(map);
        map.put("event", s);
        push(map);
    }

    public String toString()
    {
        Map map = aoJ;
        map;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new StringBuilder();
        java.util.Map.Entry entry;
        for (Iterator iterator = aoJ.entrySet().iterator(); iterator.hasNext(); ((StringBuilder) (obj)).append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", new Object[] {
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
