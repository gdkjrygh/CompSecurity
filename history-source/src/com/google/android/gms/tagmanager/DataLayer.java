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

        public final String KP;
        public final Object wF;

        public boolean equals(Object obj)
        {
            if (obj instanceof a)
            {
                if (KP.equals(((a) (obj = (a)obj)).KP) && wF.equals(((a) (obj)).wF))
                {
                    return true;
                }
            }
            return false;
        }

        public int hashCode()
        {
            return Arrays.hashCode(new Integer[] {
                Integer.valueOf(KP.hashCode()), Integer.valueOf(wF.hashCode())
            });
        }

        public String toString()
        {
            return (new StringBuilder()).append("Key: ").append(KP).append(" value: ").append(wF.toString()).toString();
        }

        a(String s, Object obj)
        {
            KP = s;
            wF = obj;
        }
    }

    static interface b
    {

        public abstract void C(Map map);
    }

    static interface c
    {

        public abstract void a(a a1);

        public abstract void a(List list, long l);

        public abstract void cz(String s);
    }

    public static interface c.a
    {

        public abstract void h(List list);
    }


    public static final String EVENT_KEY = "event";
    public static final Object OBJECT_NOT_PRESENT = new Object();
    static final String aqQ[] = "gtm.lifetime".toString().split("\\.");
    private static final Pattern aqR = Pattern.compile("(\\d+)\\s*([smhd]?)");
    private final ConcurrentHashMap aqS;
    private final Map aqT;
    private final ReentrantLock aqU;
    private final LinkedList aqV;
    private final c aqW;
    private final CountDownLatch aqX;

    DataLayer()
    {
        this(new c() {

            public void a(c.a a1)
            {
                a1.h(new ArrayList());
            }

            public void a(List list, long l)
            {
            }

            public void cz(String s)
            {
            }

        });
    }

    DataLayer(c c1)
    {
        aqW = c1;
        aqS = new ConcurrentHashMap();
        aqT = new HashMap();
        aqU = new ReentrantLock();
        aqV = new LinkedList();
        aqX = new CountDownLatch(1);
        pv();
    }

    private void E(Map map)
    {
        aqU.lock();
        aqV.offer(map);
        if (aqU.getHoldCount() == 1)
        {
            pw();
        }
        F(map);
        aqU.unlock();
        return;
        map;
        aqU.unlock();
        throw map;
    }

    private void F(Map map)
    {
        Long long1 = G(map);
        if (long1 == null)
        {
            return;
        } else
        {
            map = I(map);
            map.remove("gtm.lifetime");
            aqW.a(map, long1.longValue());
            return;
        }
    }

    private Long G(Map map)
    {
        map = ((Map) (H(map)));
        if (map == null)
        {
            return null;
        } else
        {
            return cy(map.toString());
        }
    }

    private Object H(Map map)
    {
        String as[] = aqQ;
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

    private List I(Map map)
    {
        ArrayList arraylist = new ArrayList();
        a(map, "", arraylist);
        return arraylist;
    }

    private void J(Map map)
    {
        Map map1 = aqT;
        map1;
        JVM INSTR monitorenter ;
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); a(c(s, map.get(s)), aqT))
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
        K(map);
        return;
    }

    private void K(Map map)
    {
        for (Iterator iterator = aqS.keySet().iterator(); iterator.hasNext(); ((b)iterator.next()).C(map)) { }
    }

    static CountDownLatch a(DataLayer datalayer)
    {
        return datalayer.aqX;
    }

    static void a(DataLayer datalayer, Map map)
    {
        datalayer.E(map);
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

    static Long cy(String s)
    {
        Object obj = aqR.matcher(s);
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

    private void pv()
    {
        aqW.a(new c.a() {

            final DataLayer aqY;

            public void h(List list)
            {
                a a1;
                for (list = list.iterator(); list.hasNext(); DataLayer.a(aqY, aqY.c(a1.KP, a1.wF)))
                {
                    a1 = (a)list.next();
                }

                DataLayer.a(aqY).countDown();
            }

            
            {
                aqY = DataLayer.this;
                super();
            }
        });
    }

    private void pw()
    {
        int i = 0;
        do
        {
            Map map = (Map)aqV.poll();
            if (map != null)
            {
                J(map);
                i++;
                if (i > 500)
                {
                    aqV.clear();
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
        aqS.put(b1, Integer.valueOf(0));
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

    void cx(String s)
    {
        push(s, null);
        aqW.cz(s);
    }

    public Object get(String s)
    {
        Map map = aqT;
        map;
        JVM INSTR monitorenter ;
        Object obj;
        String as[];
        int j;
        obj = aqT;
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
            aqX.await();
        }
        catch (InterruptedException interruptedexception)
        {
            bh.W("DataLayer.push: unexpected InterruptedException");
        }
        E(map);
    }

    public void pushEvent(String s, Map map)
    {
        map = new HashMap(map);
        map.put("event", s);
        push(map);
    }

    public String toString()
    {
        Map map = aqT;
        map;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new StringBuilder();
        java.util.Map.Entry entry;
        for (Iterator iterator = aqT.entrySet().iterator(); iterator.hasNext(); ((StringBuilder) (obj)).append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", new Object[] {
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
