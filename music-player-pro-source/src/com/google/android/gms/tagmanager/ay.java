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
//            cz

class ay
{

    private static String arH;
    static Map arI = new HashMap();

    ay()
    {
    }

    static void cH(String s)
    {
        com/google/android/gms/tagmanager/ay;
        JVM INSTR monitorenter ;
        arH = s;
        com/google/android/gms/tagmanager/ay;
        JVM INSTR monitorexit ;
        return;
        s;
        com/google/android/gms/tagmanager/ay;
        JVM INSTR monitorexit ;
        throw s;
    }

    static void d(Context context, String s)
    {
        cz.a(context, "gtm_install_referrer", "referrer", s);
        f(context, s);
    }

    static String e(Context context, String s)
    {
        if (arH != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/tagmanager/ay;
        JVM INSTR monitorenter ;
        if (arH != null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        context = context.getSharedPreferences("gtm_install_referrer", 0);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        arH = context.getString("referrer", "");
_L3:
        com/google/android/gms/tagmanager/ay;
        JVM INSTR monitorexit ;
_L2:
        return w(arH, s);
        arH = "";
          goto _L3
        context;
        com/google/android/gms/tagmanager/ay;
        JVM INSTR monitorexit ;
        throw context;
    }

    static String f(Context context, String s, String s1)
    {
        String s2 = (String)arI.get(s);
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
            arI.put(s, context);
            obj = context;
        }
        return w(((String) (obj)), s1);
    }

    static void f(Context context, String s)
    {
        String s1 = w(s, "conv");
        if (s1 != null && s1.length() > 0)
        {
            arI.put(s1, s);
            cz.a(context, "gtm_click_referrers", s1, s);
        }
    }

    static String w(String s, String s1)
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
            return Uri.parse((new StringBuilder()).append("http://hostname/?").append(s).toString()).getQueryParameter(s1);
        }
    }

}
