// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.b.e;

import android.content.Context;
import android.content.SharedPreferences;

public final class b
{

    private static Context a;

    public static String a(String s)
    {
        com/cmcm/adsdk/b/e/b;
        JVM INSTR monitorenter ;
        s = a.getSharedPreferences("cm_ad_cache", 0).getString("config_cache", s);
_L2:
        com/cmcm/adsdk/b/e/b;
        JVM INSTR monitorexit ;
        return s;
        s;
        (new StringBuilder("get cache json error...")).append(s.getMessage());
        s = "";
        if (true) goto _L2; else goto _L1
_L1:
        s;
        throw s;
    }

    public static void a(Context context)
    {
        a = context;
    }

    public static void b(String s)
    {
        com/cmcm/adsdk/b/e/b;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor;
        editor = a.getSharedPreferences("cm_ad_cache", 0).edit();
        editor.putString("config_cache", s);
        if (android.os.Build.VERSION.SDK_INT < 9) goto _L2; else goto _L1
_L1:
        editor.apply();
_L4:
        com/cmcm/adsdk/b/e/b;
        JVM INSTR monitorexit ;
        return;
_L2:
        try
        {
            editor.commit();
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        finally
        {
            com/cmcm/adsdk/b/e/b;
        }
        (new StringBuilder("save cache json error...")).append(s.getMessage());
        if (true) goto _L4; else goto _L3
_L3:
        throw s;
    }
}
