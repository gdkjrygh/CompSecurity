// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ba

class x
{

    static Map a = new HashMap();
    private static String b;

    x()
    {
    }

    static void a(Context context, String s)
    {
        ba.a(context, "gtm_install_referrer", "referrer", s);
        b(context, s);
    }

    static void a(String s)
    {
        com/google/android/gms/tagmanager/x;
        JVM INSTR monitorenter ;
        b = s;
        com/google/android/gms/tagmanager/x;
        JVM INSTR monitorexit ;
        return;
        s;
        com/google/android/gms/tagmanager/x;
        JVM INSTR monitorexit ;
        throw s;
    }

    static void b(Context context, String s)
    {
        String s1 = Uri.parse((new StringBuilder("http://hostname/?")).append(s).toString()).getQueryParameter("conv");
        if (s1 != null && s1.length() > 0)
        {
            a.put(s1, s);
            ba.a(context, "gtm_click_referrers", s1, s);
        }
    }

}
