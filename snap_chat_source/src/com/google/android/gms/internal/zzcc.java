// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.gms.internal:
//            zzab, zzho, zzhx, zzca, 
//            zzcf

public class zzcc
{

    private final Context mContext;
    private final String zznf;
    private int zzqP;
    private int zzqQ;
    private int zzqR;
    private int zzqS;
    private String zzqT;
    private BlockingQueue zzqV;
    private ExecutorService zzqW;
    private LinkedHashMap zzqX;

    public zzcc(Context context, String s, String s1, int i, int j, int k, int l, 
            Map map, int i1)
    {
        zzqX = new LinkedHashMap();
        mContext = context;
        zznf = s;
        zzqT = s1;
        zzqQ = i;
        zzqR = j;
        zzqS = k;
        zzk(l);
        for (context = map.entrySet().iterator(); context.hasNext(); zze((String)s.getKey(), (String)s.getValue()))
        {
            s = (java.util.Map.Entry)context.next();
        }

        if (i1 == 1)
        {
            zzck();
        }
        if (i1 == 2)
        {
            zzcl();
        }
        init();
    }

    private void init()
    {
        zzqV = new ArrayBlockingQueue(zzqQ);
        zzqW = Executors.newSingleThreadExecutor();
        zzqW.execute(new Runnable() {

            final zzcc zzqY;

            public void run()
            {
                zzcc.zza(zzqY);
            }

            
            {
                zzqY = zzcc.this;
                super();
            }
        });
    }

    static void zza(zzcc zzcc1)
    {
        zzcc1.zzcm();
    }

    private boolean zzb(Map map)
    {
        int i;
        boolean flag;
        flag = false;
        i = 0;
_L2:
        if (flag || i >= zzqR)
        {
            break; /* Loop/switch isn't completed */
        }
        Thread.sleep(zzqS);
        String s = zza(zzqT, map);
        zzab.zzaM().zzc(mContext, zznf, s);
        flag = true;
_L3:
        i++;
        if (true) goto _L2; else goto _L1
        InterruptedException interruptedexception;
        interruptedexception;
        zzhx.zzd("CsiReporter:interrupted in sendReport()", interruptedexception);
        Thread.currentThread().interrupt();
          goto _L3
_L1:
        return flag;
    }

    private void zzck()
    {
        zzca.zza(new Runnable() {

            final zzcc zzqY;

            public void run()
            {
                if (!zzca.zzcb().isEmpty())
                {
                    zzqY.zze("eid", TextUtils.join(",", zzca.zzcb()));
                }
            }

            
            {
                zzqY = zzcc.this;
                super();
            }
        });
    }

    private void zzcl()
    {
        if (!zzca.zzca().isEmpty())
        {
            zze("eid", TextUtils.join(",", zzca.zzca()));
        }
    }

    private void zzcm()
    {
        do
        {
            Object obj;
            do
            {
                obj = zzj(zzqP);
            } while (obj == null);
            obj = zzc(((List) (obj))).values().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                zzb((Map)((Iterator) (obj)).next());
            }
        } while (true);
        InterruptedException interruptedexception;
        interruptedexception;
        zzhx.zzd("CsiReporter:reporter interrupted", interruptedexception);
        return;
    }

    private List zzj(int i)
    {
        ArrayList arraylist = new ArrayList();
        for (int j = 0; j < i; j++)
        {
            arraylist.add(zzqV.take());
        }

        return arraylist;
    }

    private void zzk(int i)
    {
        int j = i;
        if (i <= 0)
        {
            zzhx.zzac((new StringBuilder("CsiReporter - too small batch size :")).append(i).append(", changed to 1").toString());
            j = 1;
        }
        i = j;
        if (j > zzqQ)
        {
            zzhx.zzac((new StringBuilder("CsiReporter - batch size :")).append(j).append(" bigger than buffer size, change to buffer limit").toString());
            i = zzqQ;
        }
        zzqP = i;
    }

    String zza(String s, Map map)
    {
        s = Uri.parse(s).buildUpon();
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); s.appendQueryParameter((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return s.build().toString();
    }

    public boolean zza(zzcf zzcf1)
    {
        return zzqV.offer(zzcf1);
    }

    Map zzc(List list)
    {
        Object obj;
        obj = new LinkedHashMap();
        for (list = list.iterator(); list.hasNext();)
        {
            zzcf zzcf1 = (zzcf)list.next();
            String s = zzcf1.zzct();
            if (((Map) (obj)).containsKey(s))
            {
                ((List)((Map) (obj)).get(s)).add(zzcf1);
            } else
            {
                ArrayList arraylist = new ArrayList();
                arraylist.add(zzcf1);
                ((Map) (obj)).put(s, arraylist);
            }
        }

        list = new LinkedHashMap();
        obj = ((Map) (obj)).entrySet().iterator();
_L2:
        List list1;
        java.util.Map.Entry entry;
        LinkedHashMap linkedhashmap;
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        entry = (java.util.Map.Entry)((Iterator) (obj)).next();
        list1 = (List)entry.getValue();
        linkedhashmap = new LinkedHashMap(zzqX);
        Map map = zzcf.zza((zzcf[])list1.toArray(new zzcf[list1.size()]));
        linkedhashmap.putAll(map);
        list.put(entry.getKey(), linkedhashmap);
        continue; /* Loop/switch isn't completed */
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        zzhx.zzd((new StringBuilder("CsiReporter:failed to merge tickers:")).append(list1).toString(), illegalargumentexception);
        if (true) goto _L2; else goto _L1
_L1:
        return list;
    }

    void zze(String s, String s1)
    {
        zzqX.put(s, s1);
    }
}
