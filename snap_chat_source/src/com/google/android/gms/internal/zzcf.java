// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzca, zzbx, zzce, zzab, 
//            zzcd, zzlv

public class zzcf
{

    private static int zzrd;
    private final Object zznh;
    final String zzrc;
    private final LinkedList zzre;
    private zzce zzrf;

    public zzcf(String s)
    {
        zznh = new Object();
        zzrc = s;
        zzrd = ((Integer)zzca.zzqz.get()).intValue();
        synchronized (zznh)
        {
            zzre = new LinkedList();
        }
        return;
        exception;
        s;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private zzce zza(long l)
    {
        return new zzce(l, null, null);
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

    public static transient Map zza(zzcf azzcf[])
    {
        String s = null;
        StringBuilder stringbuilder = new StringBuilder(zzrd * 10 * 20);
        int i = 0;
        while (i < azzcf.length) 
        {
            Map map = azzcf[i].zzcs();
            String s1 = s;
            if (map != null)
            {
                if (i == 0)
                {
                    s1 = (String)map.get("action");
                    stringbuilder.append((String)map.get("it")).append(",");
                } else
                {
                    if (!map.containsKey("action") && s != null || map.containsKey("action") && !((String)map.get("action")).equals(s))
                    {
                        throw new IllegalArgumentException("Can not merge report items for the tickers with different action names.");
                    }
                    stringbuilder.append((String)map.get("it")).append(",");
                    s1 = s;
                }
            }
            i++;
            s = s1;
        }
        return zza(s, stringbuilder);
    }

    private transient boolean zza(zzce zzce1, long l, String as[])
    {
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        int j = as.length;
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        zzce zzce2 = new zzce(l, as[i], zzce1);
        zzre.add(zzce2);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        JVM INSTR monitorexit ;
        return true;
        zzce1;
        obj;
        JVM INSTR monitorexit ;
        throw zzce1;
    }

    public transient boolean zza(zzce zzce1, String as[])
    {
        if (!zzab.zzaR().zzcd() || zzce1 == null)
        {
            return false;
        } else
        {
            return zza(zzce1, zzab.zzaQ().elapsedRealtime(), as);
        }
    }

    public zzce zzcq()
    {
        if (!zzab.zzaR().zzcd())
        {
            return null;
        } else
        {
            return zza(zzab.zzaQ().elapsedRealtime());
        }
    }

    public void zzcr()
    {
        zzrf = zzcq();
    }

    Map zzcs()
    {
        Object obj1 = new StringBuilder();
        Object obj = zznh;
        obj;
        JVM INSTR monitorenter ;
        Iterator iterator = zzre.iterator();
_L2:
        Long long1;
        String s;
        zzce zzce1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_129;
            }
            zzce1 = (zzce)iterator.next();
            long1 = zzce1.zzcn();
            s = zzce1.zzco();
            zzce1 = zzce1.zzcp();
        } while (zzce1 == null);
        if (long1.longValue() <= 0L) goto _L2; else goto _L1
_L1:
        long l = long1.longValue();
        long l1 = zzce1.zzcn().longValue();
        ((StringBuilder) (obj1)).append(s).append('.').append(l - l1).append(',');
          goto _L2
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        zzre.clear();
        obj;
        JVM INSTR monitorexit ;
        return zza(zzrc, ((StringBuilder) (obj1)));
    }

    public String zzct()
    {
        return zzrc;
    }

    public zzce zzcu()
    {
        return zzrf;
    }
}
