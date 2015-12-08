// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcu

class zzaw
{

    private static String zzayS;
    static Map zzayT = new HashMap();

    zzaw()
    {
    }

    static String zzA(String s, String s1)
    {
        if (s1 == null)
        {
            if (s.length() > 0)
            {
                return s;
            } else
            {
                return null;
            }
        } else
        {
            return Uri.parse((new StringBuilder("http://hostname/?")).append(s).toString()).getQueryParameter(s1);
        }
    }

    static void zzdc(String s)
    {
        com/google/android/gms/tagmanager/zzaw;
        JVM INSTR monitorenter ;
        zzayS = s;
        com/google/android/gms/tagmanager/zzaw;
        JVM INSTR monitorexit ;
        return;
        s;
        com/google/android/gms/tagmanager/zzaw;
        JVM INSTR monitorexit ;
        throw s;
    }

    static String zzf(Context context, String s, String s1)
    {
        String s2 = (String)zzayT.get(s);
        Object obj = s2;
        if (s2 == null)
        {
            context = context.getSharedPreferences("gtm_click_referrers", 0);
            if (context != null)
            {
                context = context.getString(s, "");
            } else
            {
                context = "";
            }
            zzayT.put(s, context);
            obj = context;
        }
        return zzA(((String) (obj)), s1);
    }

    static void zzh(Context context, String s)
    {
        zzcu.zza(context, "gtm_install_referrer", "referrer", s);
        zzj(context, s);
    }

    static String zzi(Context context, String s)
    {
        if (zzayS != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/tagmanager/zzaw;
        JVM INSTR monitorenter ;
        if (zzayS != null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        context = context.getSharedPreferences("gtm_install_referrer", 0);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        zzayS = context.getString("referrer", "");
_L3:
        com/google/android/gms/tagmanager/zzaw;
        JVM INSTR monitorexit ;
_L2:
        return zzA(zzayS, s);
        zzayS = "";
          goto _L3
        context;
        com/google/android/gms/tagmanager/zzaw;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void zzj(Context context, String s)
    {
        String s1 = zzA(s, "conv");
        if (s1 != null && s1.length() > 0)
        {
            zzayT.put(s1, s);
            zzcu.zza(context, "gtm_click_referrers", s1, s);
        }
    }

}
