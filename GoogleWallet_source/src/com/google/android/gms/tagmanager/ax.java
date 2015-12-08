// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cv

class ax
{

    private static String aNX;
    static Map aNY = new HashMap();

    ax()
    {
    }

    private static String N(String s, String s1)
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

    static void dH(String s)
    {
        com/google/android/gms/tagmanager/ax;
        JVM INSTR monitorenter ;
        aNX = s;
        com/google/android/gms/tagmanager/ax;
        JVM INSTR monitorexit ;
        return;
        s;
        com/google/android/gms/tagmanager/ax;
        JVM INSTR monitorexit ;
        throw s;
    }

    static void k(Context context, String s)
    {
        cv.a(context, "gtm_install_referrer", "referrer", s);
        m(context, s);
    }

    static void m(Context context, String s)
    {
        String s1 = N(s, "conv");
        if (s1 != null && s1.length() > 0)
        {
            aNY.put(s1, s);
            cv.a(context, "gtm_click_referrers", s1, s);
        }
    }

}
