// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.util.Log;
import com.google.android.gms.common.internal.zzv;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzd, zzx, zzaa, zzq, 
//            zze, zzah

public class zzae extends zzd
{

    private static String zzIp = "3";
    private static String zzIq = "01VDIWEA?";
    private static zzae zzIr;

    public zzae(zze zze1)
    {
        super(zze1);
    }

    public static zzae zziV()
    {
        return zzIr;
    }

    public void zza(int i, String s, Object obj, Object obj1, Object obj2)
    {
        String s1 = (String)zzx.zzHf.get();
        if (Log.isLoggable(s1, i))
        {
            Log.println(i, s1, zzc(s, obj, obj1, obj2));
        }
        if (i >= 5)
        {
            zzb(i, s, obj, obj1, obj2);
        }
    }

    public void zza(zzaa zzaa1, String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "no reason provided";
        }
        if (zzaa1 != null)
        {
            zzaa1 = zzaa1.toString();
        } else
        {
            zzaa1 = "no hit data";
        }
        zzd((new StringBuilder()).append("Discarding hit. ").append(s1).toString(), zzaa1);
    }

    public void zzb(int i, String s, Object obj, Object obj1, Object obj2)
    {
        int j = 0;
        this;
        JVM INSTR monitorenter ;
        zzv.zzr(s);
        if (i < 0)
        {
            i = j;
        }
        if (i >= zzIq.length())
        {
            i = zzIq.length() - 1;
        }
        if (!zzgI().zzhQ()) goto _L2; else goto _L1
_L1:
        char c;
        if (zzgI().zzhP())
        {
            c = 'P';
        } else
        {
            c = 'C';
        }
_L4:
        j = com.google.android.gms.analytics.internal.zze.zzgZ();
        obj = (new StringBuilder()).append(zzIp).append(zzIq.charAt(i)).append(c).append(String.valueOf(j)).append(":").append(zzc(s, zzh(obj), zzh(obj1), zzh(obj2))).toString();
        s = ((String) (obj));
        if (((String) (obj)).length() > 1024)
        {
            s = ((String) (obj)).substring(0, 1024);
        }
        obj = zzgD().zzgW();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        ((zzah) (obj)).zzji().zzaS(s);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        boolean flag = zzgI().zzhP();
        if (flag)
        {
            c = 'p';
        } else
        {
            c = 'c';
        }
        if (true) goto _L4; else goto _L3
_L3:
        s;
        throw s;
    }

    public void zze(Map map, String s)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "no reason provided";
        }
        if (map != null)
        {
            s = new StringBuilder();
            java.util.Map.Entry entry;
            for (map = map.entrySet().iterator(); map.hasNext(); s.append((String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)map.next();
                if (s.length() > 0)
                {
                    s.append(',');
                }
                s.append((String)entry.getKey());
                s.append('=');
            }

            map = s.toString();
        } else
        {
            map = "no hit data";
        }
        zzd((new StringBuilder()).append("Discarding hit. ").append(s1).toString(), map);
    }

    protected void zzgb()
    {
        com/google/android/gms/analytics/internal/zzae;
        JVM INSTR monitorenter ;
        zzIr = this;
        com/google/android/gms/analytics/internal/zzae;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        com/google/android/gms/analytics/internal/zzae;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected String zzh(Object obj)
    {
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof Integer)
        {
            obj = new Long(((Integer)obj).intValue());
        }
        if (obj instanceof Long)
        {
            if (Math.abs(((Long)obj).longValue()) < 100L)
            {
                return String.valueOf(obj);
            }
            String s;
            StringBuilder stringbuilder;
            if (String.valueOf(obj).charAt(0) == '-')
            {
                s = "-";
            } else
            {
                s = "";
            }
            obj = String.valueOf(Math.abs(((Long)obj).longValue()));
            stringbuilder = new StringBuilder();
            stringbuilder.append(s);
            stringbuilder.append(Math.round(Math.pow(10D, ((String) (obj)).length() - 1)));
            stringbuilder.append("...");
            stringbuilder.append(s);
            stringbuilder.append(Math.round(Math.pow(10D, ((String) (obj)).length()) - 1.0D));
            return stringbuilder.toString();
        }
        if (obj instanceof Boolean)
        {
            return String.valueOf(obj);
        }
        if (obj instanceof Throwable)
        {
            return obj.getClass().getCanonicalName();
        } else
        {
            return "-";
        }
    }

}
