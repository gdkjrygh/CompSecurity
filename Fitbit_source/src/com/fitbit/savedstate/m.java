// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v4.content.LocalBroadcastManager;
import com.fitbit.FitBitApplication;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class m extends a
{

    public static final String b = "SavedState.AppState.RECOMMENDED_LOCALE_UPDATED";
    private static final m c = new m();
    private static final String d = "RECOMMENDED_LOCALE";
    private static final String e = "COUNTRY_AUTOMATIC";

    m()
    {
        super("LocaleSavedState");
    }

    public static void a(String s)
    {
        com/fitbit/savedstate/m;
        JVM INSTR monitorenter ;
        SharedPreferences sharedpreferences = c.b();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        if (s.length() <= 0)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        sharedpreferences.edit().putString("RECOMMENDED_LOCALE", s).apply();
_L1:
        j();
        com/fitbit/savedstate/m;
        JVM INSTR monitorexit ;
        return;
        sharedpreferences.edit().remove("RECOMMENDED_LOCALE");
          goto _L1
        s;
        throw s;
    }

    public static void a(boolean flag)
    {
        com/fitbit/savedstate/m;
        JVM INSTR monitorenter ;
        c.b().edit().putBoolean("COUNTRY_AUTOMATIC", flag).apply();
        com/fitbit/savedstate/m;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected static a g()
    {
        return c;
    }

    public static boolean h()
    {
        com/fitbit/savedstate/m;
        JVM INSTR monitorenter ;
        boolean flag = c.b().getBoolean("COUNTRY_AUTOMATIC", false);
        com/fitbit/savedstate/m;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public static String i()
    {
        com/fitbit/savedstate/m;
        JVM INSTR monitorenter ;
        String s = c.b().getString("RECOMMENDED_LOCALE", null);
        com/fitbit/savedstate/m;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    private static void j()
    {
        Intent intent = new Intent("SavedState.AppState.RECOMMENDED_LOCALE_UPDATED");
        LocalBroadcastManager.getInstance(FitBitApplication.a()).sendBroadcast(intent);
    }

    public volatile int a()
    {
        return super.a();
    }

    public volatile SharedPreferences a(Context context)
    {
        return super.a(context);
    }

    public volatile void a(Context context, int k, int l, android.content.SharedPreferences.Editor editor)
    {
        super.a(context, k, l, editor);
    }

    public volatile SharedPreferences b()
    {
        return super.b();
    }

    public void b(Context context, int k, int l, android.content.SharedPreferences.Editor editor)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context);
        android.content.SharedPreferences.Editor editor1 = context.edit();
        if (context.contains("SavedState.AppState.RECOMMENDED_LOCALE_UPDATED"))
        {
            editor.putString("RECOMMENDED_LOCALE", context.getString("SavedState.AppState.RECOMMENDED_LOCALE_UPDATED", null));
            editor1.remove("SavedState.AppState.RECOMMENDED_LOCALE_UPDATED");
        }
        if (context.contains("SavedState.AppState.COUNTRY_AUTOMATIC"))
        {
            editor.putBoolean("COUNTRY_AUTOMATIC", context.getBoolean("SavedState.AppState.COUNTRY_AUTOMATIC", false));
            editor1.remove("SavedState.AppState.COUNTRY_AUTOMATIC");
        }
        editor1.apply();
    }

    public volatile android.content.SharedPreferences.Editor c()
    {
        return super.c();
    }

    public void d()
    {
        c.c().remove("COUNTRY_AUTOMATIC").remove("RECOMMENDED_LOCALE").apply();
    }

    public volatile void e()
    {
        super.e();
    }

    public volatile String f()
    {
        return super.f();
    }

}
