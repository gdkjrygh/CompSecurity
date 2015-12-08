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
//            zzbf

public class DataLayer
{
    static final class zza
    {

        public final String zzqd;
        public final Object zzzt;

        public final boolean equals(Object obj)
        {
            if (obj instanceof zza)
            {
                if (zzqd.equals(((zza) (obj = (zza)obj)).zzqd) && zzzt.equals(((zza) (obj)).zzzt))
                {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode()
        {
            return Arrays.hashCode(new Integer[] {
                Integer.valueOf(zzqd.hashCode()), Integer.valueOf(zzzt.hashCode())
            });
        }

        public final String toString()
        {
            return (new StringBuilder("Key: ")).append(zzqd).append(" value: ").append(zzzt.toString()).toString();
        }

        zza(String s, Object obj)
        {
            zzqd = s;
            zzzt = obj;
        }
    }

    static interface zzb
    {

        public abstract void zzI(Map map);
    }

    static interface zzc
    {

        public abstract void zza(zza zza1);

        public abstract void zza(List list, long l);

        public abstract void zzcW(String s);
    }

    public static interface zzc.zza
    {

        public abstract void zzq(List list);
    }


    public static final Object OBJECT_NOT_PRESENT = new Object();
    static final String zzayd[] = "gtm.lifetime".toString().split("\\.");
    private static final Pattern zzaye = Pattern.compile("(\\d+)\\s*([smhd]?)");
    private final ConcurrentHashMap zzayf;
    private final Map zzayg;
    private final ReentrantLock zzayh;
    private final LinkedList zzayi;
    private final zzc zzayj;
    private final CountDownLatch zzayk;

    DataLayer()
    {
        this(new zzc() {

            public void zza(zzc.zza zza1)
            {
                zza1.zzq(new ArrayList());
            }

            public void zza(List list, long l)
            {
            }

            public void zzcW(String s)
            {
            }

        });
    }

    DataLayer(zzc zzc1)
    {
        zzayj = zzc1;
        zzayf = new ConcurrentHashMap();
        zzayg = new HashMap();
        zzayh = new ReentrantLock();
        zzayi = new LinkedList();
        zzayk = new CountDownLatch(1);
        zzsU();
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
                throw new IllegalArgumentException((new StringBuilder("key is not a string: ")).append(aobj[i]).toString());
            }
            hashmap.put((String)aobj[i], aobj[i + 1]);
        }

        return hashmap;
    }

    private void zzK(Map map)
    {
        zzayh.lock();
        zzayi.offer(map);
        if (zzayh.getHoldCount() == 1)
        {
            zzsV();
        }
        zzL(map);
        zzayh.unlock();
        return;
        map;
        zzayh.unlock();
        throw map;
    }

    private void zzL(Map map)
    {
        Long long1 = zzM(map);
        if (long1 == null)
        {
            return;
        } else
        {
            map = zzO(map);
            map.remove("gtm.lifetime");
            zzayj.zza(map, long1.longValue());
            return;
        }
    }

    private Long zzM(Map map)
    {
        map = ((Map) (zzN(map)));
        if (map == null)
        {
            return null;
        } else
        {
            return zzcV(map.toString());
        }
    }

    private Object zzN(Map map)
    {
        String as[] = zzayd;
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

    private List zzO(Map map)
    {
        ArrayList arraylist = new ArrayList();
        zza(map, "", arraylist);
        return arraylist;
    }

    private void zzP(Map map)
    {
        Map map1 = zzayg;
        map1;
        JVM INSTR monitorenter ;
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); zza(zzc(s, map.get(s)), zzayg))
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
        zzQ(map);
        return;
    }

    private void zzQ(Map map)
    {
        for (Iterator iterator = zzayf.keySet().iterator(); iterator.hasNext(); ((zzb)iterator.next()).zzI(map)) { }
    }

    static CountDownLatch zza(DataLayer datalayer)
    {
        return datalayer.zzayk;
    }

    static void zza(DataLayer datalayer, Map map)
    {
        datalayer.zzK(map);
    }

    private void zza(Map map, String s, Collection collection)
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
                zza((Map)entry.getValue(), ((String) (map)), collection);
            } else
            if (!map.equals("gtm.lifetime"))
            {
                collection.add(new zza(map, entry.getValue()));
            }
        } while (true);
    }

    static Long zzcV(String s)
    {
        Object obj = zzaye.matcher(s);
        if (!((Matcher) (obj)).matches())
        {
            zzbf.zzaa((new StringBuilder("unknown _lifetime: ")).append(s).toString());
            return null;
        }
        long l;
        try
        {
            l = Long.parseLong(((Matcher) (obj)).group(1));
        }
        catch (NumberFormatException numberformatexception)
        {
            zzbf.zzac((new StringBuilder("illegal number in _lifetime value: ")).append(s).toString());
            l = 0L;
        }
        if (l <= 0L)
        {
            zzbf.zzaa((new StringBuilder("non-positive _lifetime: ")).append(s).toString());
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
            zzbf.zzac((new StringBuilder("unknown units in _lifetime: ")).append(s).toString());
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

    private void zzsU()
    {
        zzayj.zza(new zzc.zza() {

            final DataLayer zzayl;

            public void zzq(List list)
            {
                zza zza1;
                for (list = list.iterator(); list.hasNext(); DataLayer.zza(zzayl, zzayl.zzc(zza1.zzqd, zza1.zzzt)))
                {
                    zza1 = (zza)list.next();
                }

                DataLayer.zza(zzayl).countDown();
            }

            
            {
                zzayl = DataLayer.this;
                super();
            }
        });
    }

    private void zzsV()
    {
        int i = 0;
        do
        {
            Map map = (Map)zzayi.poll();
            if (map != null)
            {
                zzP(map);
                i++;
                if (i > 500)
                {
                    zzayi.clear();
                    throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
                }
            } else
            {
                return;
            }
        } while (true);
    }

    public Object get(String s)
    {
        Map map = zzayg;
        map;
        JVM INSTR monitorenter ;
        Object obj;
        String as[];
        int j;
        obj = zzayg;
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
        push(zzc(s, obj));
    }

    public void push(Map map)
    {
        try
        {
            zzayk.await();
        }
        catch (InterruptedException interruptedexception)
        {
            zzbf.zzac("DataLayer.push: unexpected InterruptedException");
        }
        zzK(map);
    }

    public String toString()
    {
        Map map = zzayg;
        map;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new StringBuilder();
        java.util.Map.Entry entry;
        for (Iterator iterator = zzayg.entrySet().iterator(); iterator.hasNext(); ((StringBuilder) (obj)).append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", new Object[] {
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

    void zza(zzb zzb1)
    {
        zzayf.put(zzb1, Integer.valueOf(0));
    }

    void zza(Map map, Map map1)
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
                zzb((List)obj, (List)map1.get(s));
            } else
            if (obj instanceof Map)
            {
                if (!(map1.get(s) instanceof Map))
                {
                    map1.put(s, new HashMap());
                }
                zza((Map)obj, (Map)map1.get(s));
            } else
            {
                map1.put(s, obj);
            }
        }

    }

    void zzb(List list, List list1)
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
                zzb((List)obj, (List)list1.get(i));
            } else
            if (obj instanceof Map)
            {
                if (!(list1.get(i) instanceof Map))
                {
                    list1.set(i, new HashMap());
                }
                zza((Map)obj, (Map)list1.get(i));
            } else
            if (obj != OBJECT_NOT_PRESENT)
            {
                list1.set(i, obj);
            }
            i++;
        }
    }

    Map zzc(String s, Object obj)
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

    void zzcU(String s)
    {
        push(s, null);
        zzayj.zzcW(s);
    }

}
