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

        public final String JI;
        public final Object afe;

        public boolean equals(Object obj)
        {
            if (obj instanceof a)
            {
                if (JI.equals(((a) (obj = (a)obj)).JI) && afe.equals(((a) (obj)).afe))
                {
                    return true;
                }
            }
            return false;
        }

        public int hashCode()
        {
            return Arrays.hashCode(new Integer[] {
                Integer.valueOf(JI.hashCode()), Integer.valueOf(afe.hashCode())
            });
        }

        public String toString()
        {
            return (new StringBuilder()).append("Key: ").append(JI).append(" value: ").append(afe.toString()).toString();
        }

        a(String s, Object obj)
        {
            JI = s;
            afe = obj;
        }
    }

    static interface b
    {

        public abstract void x(Map map);
    }

    static interface c
    {

        public abstract void a(a a1);

        public abstract void a(List list, long l);

        public abstract void bP(String s);
    }

    public static interface c.a
    {

        public abstract void d(List list);
    }


    public static final String EVENT_KEY = "event";
    public static final Object OBJECT_NOT_PRESENT = new Object();
    static final String aeV[] = "gtm.lifetime".toString().split("\\.");
    private static final Pattern aeW = Pattern.compile("(\\d+)\\s*([smhd]?)");
    private final ConcurrentHashMap aeX;
    private final Map aeY;
    private final ReentrantLock aeZ;
    private final LinkedList afa;
    private final c afb;
    private final CountDownLatch afc;

    DataLayer()
    {
        this(new c() {

            public void a(c.a a1)
            {
                a1.d(new ArrayList());
            }

            public void a(List list, long l)
            {
            }

            public void bP(String s)
            {
            }

        });
    }

    DataLayer(c c1)
    {
        afb = c1;
        aeX = new ConcurrentHashMap();
        aeY = new HashMap();
        aeZ = new ReentrantLock();
        afa = new LinkedList();
        afc = new CountDownLatch(1);
        lt();
    }

    private void A(Map map)
    {
        Long long1 = B(map);
        if (long1 == null)
        {
            return;
        } else
        {
            map = D(map);
            map.remove("gtm.lifetime");
            afb.a(map, long1.longValue());
            return;
        }
    }

    private Long B(Map map)
    {
        map = ((Map) (C(map)));
        if (map == null)
        {
            return null;
        } else
        {
            return bO(map.toString());
        }
    }

    private Object C(Map map)
    {
        String as[] = aeV;
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

    private List D(Map map)
    {
        ArrayList arraylist = new ArrayList();
        a(map, "", arraylist);
        return arraylist;
    }

    private void E(Map map)
    {
        Map map1 = aeY;
        map1;
        JVM INSTR monitorenter ;
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); a(c(s, map.get(s)), aeY))
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
        F(map);
        return;
    }

    private void F(Map map)
    {
        for (Iterator iterator = aeX.keySet().iterator(); iterator.hasNext(); ((b)iterator.next()).x(map)) { }
    }

    static CountDownLatch a(DataLayer datalayer)
    {
        return datalayer.afc;
    }

    static void a(DataLayer datalayer, Map map)
    {
        datalayer.z(map);
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

    static Long bO(String s)
    {
        Object obj = aeW.matcher(s);
        if (!((Matcher) (obj)).matches())
        {
            bh.B((new StringBuilder()).append("unknown _lifetime: ").append(s).toString());
            return null;
        }
        long l;
        try
        {
            l = Long.parseLong(((Matcher) (obj)).group(1));
        }
        catch (NumberFormatException numberformatexception)
        {
            bh.D((new StringBuilder()).append("illegal number in _lifetime value: ").append(s).toString());
            l = 0L;
        }
        if (l <= 0L)
        {
            bh.B((new StringBuilder()).append("non-positive _lifetime: ").append(s).toString());
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
            bh.D((new StringBuilder()).append("unknown units in _lifetime: ").append(s).toString());
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

    private void lt()
    {
        afb.a(new c.a() {

            final DataLayer afd;

            public void d(List list)
            {
                a a1;
                for (list = list.iterator(); list.hasNext(); DataLayer.a(afd, afd.c(a1.JI, a1.afe)))
                {
                    a1 = (a)list.next();
                }

                DataLayer.a(afd).countDown();
            }

            
            {
                afd = DataLayer.this;
                super();
            }
        });
    }

    private void lu()
    {
        int i = 0;
        do
        {
            Map map = (Map)afa.poll();
            if (map != null)
            {
                E(map);
                i++;
                if (i > 500)
                {
                    afa.clear();
                    throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
                }
            } else
            {
                return;
            }
        } while (true);
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

    private void z(Map map)
    {
        aeZ.lock();
        afa.offer(map);
        if (aeZ.getHoldCount() == 1)
        {
            lu();
        }
        A(map);
        aeZ.unlock();
        return;
        map;
        aeZ.unlock();
        throw map;
    }

    void a(b b1)
    {
        aeX.put(b1, Integer.valueOf(0));
    }

    void a(List list, List list1)
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
                a((List)obj, (List)list1.get(i));
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

    void bN(String s)
    {
        push(s, null);
        afb.bP(s);
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

    public Object get(String s)
    {
        Map map = aeY;
        map;
        JVM INSTR monitorenter ;
        Object obj;
        String as[];
        int j;
        obj = aeY;
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
            afc.await();
        }
        catch (InterruptedException interruptedexception)
        {
            bh.D("DataLayer.push: unexpected InterruptedException");
        }
        z(map);
    }

    public void pushEvent(String s, Map map)
    {
        map = new HashMap(map);
        map.put("event", s);
        push(map);
    }

}
