// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.pedometer;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.fitbit.FitBitApplication;
import com.fitbit.e.a;
import com.fitbit.util.p;

// Referenced classes of package com.fitbit.pedometer:
//            e

public class l
{

    private static final String a = "TrackerSigningKeyController";
    private static Boolean b;
    private static String c = "com.fitbit.pedometer.TrackerSigningKeyController.IS_KEY_EXPIRED_PREFERENCE_KEY";

    public l()
    {
    }

    public static void a(boolean flag)
    {
        com/fitbit/pedometer/l;
        JVM INSTR monitorenter ;
        if (!flag) goto _L2; else goto _L1
_L1:
        b();
_L4:
        com/fitbit/pedometer/l;
        JVM INSTR monitorexit ;
        return;
_L2:
        c();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean a()
    {
        boolean flag = false;
        com/fitbit/pedometer/l;
        JVM INSTR monitorenter ;
        if (b == null) goto _L2; else goto _L1
_L1:
        flag = b.booleanValue();
_L4:
        com/fitbit/pedometer/l;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a());
        if (sharedpreferences.contains(c))
        {
            b = Boolean.valueOf(sharedpreferences.getBoolean(c, false));
            flag = b.booleanValue();
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private static void b()
    {
        b = Boolean.valueOf(true);
        com.fitbit.e.a.d("TrackerSigningKeyController", "Expiring Tracker signing key.", new Object[0]);
        PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a()).edit().putBoolean(c, b.booleanValue()).commit();
        com.fitbit.pedometer.service.a.c();
        com.fitbit.pedometer.service.a.a();
        com.fitbit.multipledevice.a.a().b();
    }

    private static void c()
    {
        b = Boolean.valueOf(false);
        SharedPreferences sharedpreferences = PreferenceManager.getDefaultSharedPreferences(FitBitApplication.a());
        if (!sharedpreferences.contains(c) || sharedpreferences.getBoolean(c, false))
        {
            com.fitbit.e.a.d("TrackerSigningKeyController", "Tracker signing key is marked as fresh now", new Object[0]);
            sharedpreferences.edit().putBoolean(c, b.booleanValue()).commit();
            if (p.l())
            {
                com.fitbit.pedometer.e.a(new e.b() {

                    public void a(Boolean boolean1)
                    {
                        if (boolean1.booleanValue())
                        {
                            com.fitbit.pedometer.service.a.b();
                            com.fitbit.multipledevice.a.a().b();
                        }
                    }

                    public volatile void a(Object obj)
                    {
                        a((Boolean)obj);
                    }

                });
                return;
            }
        }
    }

}
