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
//            bb

public class x
{

    static Map a = new HashMap();
    private static String b;

    public x()
    {
    }

    public static void a(Context context, String s)
    {
label0:
        {
            String s1 = Uri.parse((new StringBuilder("http://hostname/?")).append(s).toString()).getQueryParameter("conv");
            if (s1 != null && s1.length() > 0)
            {
                a.put(s1, s);
                context = context.getSharedPreferences("gtm_click_referrers", 0).edit();
                context.putString(s1, s);
                if (android.os.Build.VERSION.SDK_INT < 9)
                {
                    break label0;
                }
                context.apply();
            }
            return;
        }
        (new Thread(new bb(context))).start();
    }

    public static void a(String s)
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

}
