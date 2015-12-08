// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            au

class s
{

    static Map a = new HashMap();
    private static String b;

    s()
    {
    }

    static void a(Context context, String s1)
    {
        au.a(context, "gtm_install_referrer", "referrer", s1);
        b(context, s1);
    }

    static void a(String s1)
    {
        com/google/android/gms/tagmanager/s;
        JVM INSTR monitorenter ;
        b = s1;
        com/google/android/gms/tagmanager/s;
        JVM INSTR monitorexit ;
        return;
        s1;
        com/google/android/gms/tagmanager/s;
        JVM INSTR monitorexit ;
        throw s1;
    }

    static void b(Context context, String s1)
    {
        String s2 = Uri.parse((new StringBuilder("http://hostname/?")).append(s1).toString()).getQueryParameter("conv");
        if (s2 != null && s2.length() > 0)
        {
            a.put(s2, s1);
            au.a(context, "gtm_click_referrers", s2, s1);
        }
    }

}
