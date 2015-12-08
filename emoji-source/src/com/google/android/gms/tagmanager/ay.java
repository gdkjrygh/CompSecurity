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
//            cy

class ay
{

    private static String afS;
    static Map afT = new HashMap();

    ay()
    {
    }

    static void bX(String s)
    {
        com/google/android/gms/tagmanager/ay;
        JVM INSTR monitorenter ;
        afS = s;
        com/google/android/gms/tagmanager/ay;
        JVM INSTR monitorexit ;
        return;
        s;
        com/google/android/gms/tagmanager/ay;
        JVM INSTR monitorexit ;
        throw s;
    }

    static String d(Context context, String s, String s1)
    {
        String s2 = (String)afT.get(s);
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
            afT.put(s, context);
            obj = context;
        }
        return p(((String) (obj)), s1);
    }

    static void d(Context context, String s)
    {
        cy.a(context, "gtm_install_referrer", "referrer", s);
        f(context, s);
    }

    static String e(Context context, String s)
    {
        if (afS != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/tagmanager/ay;
        JVM INSTR monitorenter ;
        if (afS != null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        context = context.getSharedPreferences("gtm_install_referrer", 0);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        afS = context.getString("referrer", "");
_L3:
        com/google/android/gms/tagmanager/ay;
        JVM INSTR monitorexit ;
_L2:
        return p(afS, s);
        afS = "";
          goto _L3
        context;
        com/google/android/gms/tagmanager/ay;
        JVM INSTR monitorexit ;
        throw context;
    }

    static void f(Context context, String s)
    {
        String s1 = p(s, "conv");
        if (s1 != null && s1.length() > 0)
        {
            afT.put(s1, s);
            cy.a(context, "gtm_click_referrers", s1, s);
        }
    }

    static String p(String s, String s1)
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
