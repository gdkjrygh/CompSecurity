// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzbz, zzbv, zzcd, zzcc, 
//            zzlb

public class zzce
{

    private static int zzuP;
    private final Object zzqt;
    final String zzuO;
    private final LinkedList zzuQ;
    private zzcd zzuR;

    public zzce(String s)
    {
        zzqt = new Object();
        zzuO = s;
        zzuP = ((Integer)zzbz.zztZ.get()).intValue();
        synchronized (zzqt)
        {
            zzuQ = new LinkedList();
        }
        return;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static Map zza(String s, StringBuilder stringbuilder)
    {
        LinkedHashMap linkedhashmap = null;
        if (stringbuilder.length() > 0)
        {
            linkedhashmap = new LinkedHashMap();
            if (s != null)
            {
                linkedhashmap.put("action", s);
            }
            stringbuilder.setLength(stringbuilder.length() - 1);
            linkedhashmap.put("it", stringbuilder.toString());
        }
        return linkedhashmap;
    }

    public static transient Map zza(zzce azzce[])
        throws IllegalArgumentException
    {
        String s = null;
        StringBuilder stringbuilder = new StringBuilder(zzuP * 10 * 20);
        int i = 0;
        while (i < azzce.length) 
        {
            Map map = azzce[i].zzdq();
            if (map != null)
            {
                if (i == 0)
                {
                    s = (String)map.get("action");
                    stringbuilder.append((String)map.get("it")).append(",");
                } else
                {
                    if (!map.containsKey("action") && s != null || map.containsKey("action") && !((String)map.get("action")).equals(s))
                    {
                        throw new IllegalArgumentException("Can not merge report items for the tickers with different action names.");
                    }
                    stringbuilder.append((String)map.get("it")).append(",");
                }
            }
            i++;
        }
        return zza(s, stringbuilder);
    }

    private transient boolean zza(zzcd zzcd1, long l, String as[])
    {
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        int j = as.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        zzcd zzcd2 = new zzcd(l, as[i], zzcd1);
        zzuQ.add(zzcd2);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return true;
        zzcd1;
        obj;
        JVM INSTR monitorexit ;
        throw zzcd1;
    }

    private zzcd zzb(long l)
    {
        return new zzcd(l, null, null);
    }

    public transient boolean zza(zzcd zzcd1, String as[])
    {
        if (!zzo.zzbA().zzdc() || zzcd1 == null)
        {
            return false;
        } else
        {
            return zza(zzcd1, zzo.zzbz().elapsedRealtime(), as);
        }
    }

    public zzcd zzdo()
    {
        if (!zzo.zzbA().zzdc())
        {
            return null;
        } else
        {
            return zzb(zzo.zzbz().elapsedRealtime());
        }
    }

    public void zzdp()
    {
        zzuR = zzdo();
    }

    Map zzdq()
    {
        Object obj1 = new StringBuilder();
        Object obj = zzqt;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = zzuQ.iterator();
_L2:
        Long long1;
        String s;
        zzcd zzcd1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_129;
            }
            zzcd1 = (zzcd)iterator.next();
            long1 = Long.valueOf(zzcd1.getTime());
            s = zzcd1.zzdm();
            zzcd1 = zzcd1.zzdn();
        } while (zzcd1 == null);
        if (long1.longValue() <= 0L) goto _L2; else goto _L1
_L1:
        long l = long1.longValue();
        long l1 = zzcd1.getTime();
        ((StringBuilder) (obj1)).append(s).append('.').append(l - l1).append(',');
          goto _L2
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        zzuQ.clear();
        obj;
        JVM INSTR monitorexit ;
        return zza(zzuO, ((StringBuilder) (obj1)));
    }

    public String zzdr()
    {
        return zzuO;
    }

    public zzcd zzds()
    {
        return zzuR;
    }
}
