// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.preference.PreferenceManager;
import com.fitbit.FitBitApplication;
import com.fitbit.config.BuildType;
import com.fitbit.config.b;
import com.fitbit.galileo.service.e;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class PedometerSavedState extends a
{
    public static final class HtcCompatibilityCheckResultReplacementValue extends Enum
    {

        public static final HtcCompatibilityCheckResultReplacementValue a;
        public static final HtcCompatibilityCheckResultReplacementValue b;
        public static final HtcCompatibilityCheckResultReplacementValue c;
        public static final HtcCompatibilityCheckResultReplacementValue d;
        public static final HtcCompatibilityCheckResultReplacementValue e;
        public static final HtcCompatibilityCheckResultReplacementValue f;
        public static final HtcCompatibilityCheckResultReplacementValue g;
        public static final HtcCompatibilityCheckResultReplacementValue h;
        private static final HtcCompatibilityCheckResultReplacementValue i[];
        private final int code;

        public static HtcCompatibilityCheckResultReplacementValue a(int i1)
        {
            HtcCompatibilityCheckResultReplacementValue ahtccompatibilitycheckresultreplacementvalue[] = values();
            int k1 = ahtccompatibilitycheckresultreplacementvalue.length;
            for (int j1 = 0; j1 < k1; j1++)
            {
                HtcCompatibilityCheckResultReplacementValue htccompatibilitycheckresultreplacementvalue = ahtccompatibilitycheckresultreplacementvalue[j1];
                if (htccompatibilitycheckresultreplacementvalue.a() == i1)
                {
                    return htccompatibilitycheckresultreplacementvalue;
                }
            }

            throw new IllegalArgumentException();
        }

        public static HtcCompatibilityCheckResultReplacementValue valueOf(String s1)
        {
            return (HtcCompatibilityCheckResultReplacementValue)Enum.valueOf(com/fitbit/savedstate/PedometerSavedState$HtcCompatibilityCheckResultReplacementValue, s1);
        }

        public static HtcCompatibilityCheckResultReplacementValue[] values()
        {
            return (HtcCompatibilityCheckResultReplacementValue[])i.clone();
        }

        public int a()
        {
            return code;
        }

        static 
        {
            a = new HtcCompatibilityCheckResultReplacementValue("UNCHANGED", 0, 0);
            b = new HtcCompatibilityCheckResultReplacementValue("COMPATIBLE", 1, 1);
            c = new HtcCompatibilityCheckResultReplacementValue("ERROR_HSP_NOT_SUPPORTED", 2, 2);
            d = new HtcCompatibilityCheckResultReplacementValue("ERROR_HSP_NOT_INSTALLED", 3, 3);
            e = new HtcCompatibilityCheckResultReplacementValue("HSP_UPDATE_REQUIRED", 4, 4);
            f = new HtcCompatibilityCheckResultReplacementValue("HMS_APP_UPDATE_REQUIRED", 5, 5);
            g = new HtcCompatibilityCheckResultReplacementValue("ERROR_HSP_NOT_ENABLED", 6, 6);
            h = new HtcCompatibilityCheckResultReplacementValue("ERROR_UNKNOWN", 7, 7);
            i = (new HtcCompatibilityCheckResultReplacementValue[] {
                a, b, c, d, e, f, g, h
            });
        }

        private HtcCompatibilityCheckResultReplacementValue(String s1, int i1, int j1)
        {
            super(s1, i1);
            code = j1;
        }
    }

    public static final class MetsAndActivityCalculationMethod extends Enum
    {

        public static final MetsAndActivityCalculationMethod a;
        public static final MetsAndActivityCalculationMethod b;
        public static final MetsAndActivityCalculationMethod c;
        private static final MetsAndActivityCalculationMethod d[];
        private final int code;

        public static MetsAndActivityCalculationMethod a(int i1)
        {
            MetsAndActivityCalculationMethod ametsandactivitycalculationmethod[] = values();
            int k1 = ametsandactivitycalculationmethod.length;
            for (int j1 = 0; j1 < k1; j1++)
            {
                MetsAndActivityCalculationMethod metsandactivitycalculationmethod = ametsandactivitycalculationmethod[j1];
                if (metsandactivitycalculationmethod.a() == i1)
                {
                    return metsandactivitycalculationmethod;
                }
            }

            throw new IllegalArgumentException();
        }

        public static MetsAndActivityCalculationMethod valueOf(String s1)
        {
            return (MetsAndActivityCalculationMethod)Enum.valueOf(com/fitbit/savedstate/PedometerSavedState$MetsAndActivityCalculationMethod, s1);
        }

        public static MetsAndActivityCalculationMethod[] values()
        {
            return (MetsAndActivityCalculationMethod[])d.clone();
        }

        public int a()
        {
            return code;
        }

        static 
        {
            a = new MetsAndActivityCalculationMethod("DEFAULT", 0, 0);
            b = new MetsAndActivityCalculationMethod("HTC", 1, 1);
            c = new MetsAndActivityCalculationMethod("FITBIT", 2, 2);
            d = (new MetsAndActivityCalculationMethod[] {
                a, b, c
            });
        }

        private MetsAndActivityCalculationMethod(String s1, int i1, int j1)
        {
            super(s1, i1);
            code = j1;
        }
    }


    private static final PedometerSavedState b = new PedometerSavedState();
    private static final String c = "PUSH_NOTIFICATIONS_ENABLED";
    private static final String d = "PEDOMETER_BG_FLUSH_INTERVAL";
    private static final String e = "PEDOMETER_FG_FLUSH_INTERVAL";
    private static final String f = "PEDOMETER_BG_SERVER_SYNC_INTERVAL";
    private static final String g = "PEDOMETER_METS_AND_ACTIVITY_CALCULATION_METHOD";
    private static final String h = "PEDOMETER_HTC_COMPATIBILITY_CHECK_RESULT_REPLACEMENT_VALUE";
    private static final String i = "PEDOMETER_LAST_SERVER_SYNC_RUN_TIME";
    private static final String j = "PEDOMETER_CAN_USE_AS_MULTI_DEVICE_TRACKER";

    PedometerSavedState()
    {
        super("PedometerSavedState");
    }

    public static void a(int i1)
    {
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putInt("PEDOMETER_BG_FLUSH_INTERVAL", i1);
        editor.apply();
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(HtcCompatibilityCheckResultReplacementValue htccompatibilitycheckresultreplacementvalue)
    {
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putInt("PEDOMETER_HTC_COMPATIBILITY_CHECK_RESULT_REPLACEMENT_VALUE", htccompatibilitycheckresultreplacementvalue.a());
        editor.apply();
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorexit ;
        return;
        htccompatibilitycheckresultreplacementvalue;
        throw htccompatibilitycheckresultreplacementvalue;
    }

    public static void a(MetsAndActivityCalculationMethod metsandactivitycalculationmethod)
    {
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putInt("PEDOMETER_METS_AND_ACTIVITY_CALCULATION_METHOD", metsandactivitycalculationmethod.a());
        editor.apply();
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorexit ;
        return;
        metsandactivitycalculationmethod;
        throw metsandactivitycalculationmethod;
    }

    public static void a(boolean flag)
    {
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putBoolean("PEDOMETER_CAN_USE_AS_MULTI_DEVICE_TRACKER", flag);
        editor.apply();
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void b(int i1)
    {
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putInt("PEDOMETER_FG_FLUSH_INTERVAL", i1);
        editor.apply();
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static void c(int i1)
    {
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putInt("PEDOMETER_BG_SERVER_SYNC_INTERVAL", i1);
        editor.apply();
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected static a g()
    {
        return b;
    }

    public static void h()
    {
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putInt("PUSH_NOTIFICATIONS_ENABLED", 0);
        editor.apply();
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static int i()
    {
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorenter ;
        int i1 = b.b().getInt("PUSH_NOTIFICATIONS_ENABLED", 0);
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public static void j()
    {
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorenter ;
        SharedPreferences sharedpreferences = b.b();
        android.content.SharedPreferences.Editor editor = sharedpreferences.edit();
        editor.putInt("PUSH_NOTIFICATIONS_ENABLED", sharedpreferences.getInt("PUSH_NOTIFICATIONS_ENABLED", 0) + 1);
        editor.apply();
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static int k()
    {
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorenter ;
        int i1 = b.b().getInt("PEDOMETER_BG_FLUSH_INTERVAL", 1);
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public static int l()
    {
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorenter ;
        int i1 = b.b().getInt("PEDOMETER_FG_FLUSH_INTERVAL", 30);
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public static int m()
    {
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorenter ;
        int i1 = b.b().getInt("PEDOMETER_BG_SERVER_SYNC_INTERVAL", 16);
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public static MetsAndActivityCalculationMethod n()
    {
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorenter ;
        MetsAndActivityCalculationMethod metsandactivitycalculationmethod = MetsAndActivityCalculationMethod.a(b.b().getInt("PEDOMETER_METS_AND_ACTIVITY_CALCULATION_METHOD", MetsAndActivityCalculationMethod.a.a()));
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorexit ;
        return metsandactivitycalculationmethod;
        Exception exception;
        exception;
        throw exception;
    }

    public static HtcCompatibilityCheckResultReplacementValue o()
    {
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorenter ;
        int i1;
        int j1;
        i1 = b.b().getInt("PEDOMETER_HTC_COMPATIBILITY_CHECK_RESULT_REPLACEMENT_VALUE", HtcCompatibilityCheckResultReplacementValue.a.a());
        if (BuildType.e != b.a)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        j1 = s();
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        if (j1 <= HtcCompatibilityCheckResultReplacementValue.h.a())
        {
            i1 = j1;
        }
        HtcCompatibilityCheckResultReplacementValue htccompatibilitycheckresultreplacementvalue = HtcCompatibilityCheckResultReplacementValue.a(i1);
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorexit ;
        return htccompatibilitycheckresultreplacementvalue;
        Exception exception;
        exception;
        throw exception;
    }

    public static void p()
    {
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putLong("PEDOMETER_LAST_SERVER_SYNC_RUN_TIME", (new Date()).getTime());
        editor.apply();
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public static long q()
    {
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorenter ;
        int i1;
        long l2;
        long l3;
        long l4;
        l3 = b.b().getLong("PEDOMETER_LAST_SERVER_SYNC_RUN_TIME", 0L);
        l4 = (new Date()).getTime();
        l2 = (long)m() * 60000L;
        i1 = i();
        long l1;
        l1 = l2;
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        l1 = (new e(2, l2)).a(i1);
        l1 = Math.min(l1, Math.max(0L, l3 + (l1 - l4)));
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    public static boolean r()
    {
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorenter ;
        boolean flag = b.b().getBoolean("PEDOMETER_CAN_USE_AS_MULTI_DEVICE_TRACKER", false);
        com/fitbit/savedstate/PedometerSavedState;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    private static int s()
    {
        Object obj2 = null;
        Object obj = FitBitApplication.a().getExternalFilesDir(null);
        Object obj1;
        int i1;
        int j1;
        if (obj != null)
        {
            obj = (new StringBuilder()).append(((File) (obj)).getAbsolutePath()).append("/").toString();
        } else
        {
            obj = null;
        }
        obj1 = obj;
        if (obj == null)
        {
            obj1 = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append("/").toString();
        }
        obj = new File((new StringBuilder()).append(((String) (obj1))).append("HtcCompatibilityCheckPrefs.txt").toString());
        j1 = 0;
        i1 = j1;
        if (!((File) (obj)).exists())
        {
            break MISSING_BLOCK_LABEL_161;
        }
        i1 = j1;
        if (!((File) (obj)).isFile())
        {
            break MISSING_BLOCK_LABEL_161;
        }
        obj1 = new BufferedReader(new FileReader(((File) (obj))));
        obj = obj1;
        i1 = Integer.parseInt(((BufferedReader) (obj1)).readLine());
        j1 = i1;
        i1 = j1;
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((IOException) (obj)).printStackTrace();
                return j1;
            }
            i1 = j1;
        }
_L2:
        return i1;
        obj2;
        obj1 = null;
_L5:
        obj = obj1;
        ((Exception) (obj2)).printStackTrace();
        i1 = j1;
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        try
        {
            ((BufferedReader) (obj1)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((IOException) (obj)).printStackTrace();
            return 0;
        }
        return 0;
        obj;
        obj1 = obj2;
_L4:
        if (obj1 != null)
        {
            try
            {
                ((BufferedReader) (obj1)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((IOException) (obj1)).printStackTrace();
            }
        }
        throw obj;
        obj2;
        obj1 = obj;
        obj = obj2;
        if (true) goto _L4; else goto _L3
_L3:
        obj2;
          goto _L5
    }

    public volatile int a()
    {
        return super.a();
    }

    public volatile SharedPreferences a(Context context)
    {
        return super.a(context);
    }

    public volatile void a(Context context, int i1, int j1, android.content.SharedPreferences.Editor editor)
    {
        super.a(context, i1, j1, editor);
    }

    public volatile SharedPreferences b()
    {
        return super.b();
    }

    public void b(Context context, int i1, int j1, android.content.SharedPreferences.Editor editor)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context);
        android.content.SharedPreferences.Editor editor1 = context.edit();
        if (context.contains("SavedState.PedometerState.PUSH_NOTIFICATIONS_ENABLED"))
        {
            editor.putInt("PUSH_NOTIFICATIONS_ENABLED", context.getInt("SavedState.PedometerState.PUSH_NOTIFICATIONS_ENABLED", 0));
            editor1.remove("SavedState.PedometerState.PUSH_NOTIFICATIONS_ENABLED");
        }
        if (context.contains("SavedState.PedometerState.PEDOMETER_BG_FLUSH_INTERVAL"))
        {
            editor.putInt("PEDOMETER_BG_FLUSH_INTERVAL", context.getInt("SavedState.PedometerState.PEDOMETER_BG_FLUSH_INTERVAL", 0));
            editor1.remove("SavedState.PedometerState.PEDOMETER_BG_FLUSH_INTERVAL");
        }
        if (context.contains("SavedState.PedometerState.PEDOMETER_FG_FLUSH_INTERVAL"))
        {
            editor.putInt("PEDOMETER_FG_FLUSH_INTERVAL", context.getInt("SavedState.PedometerState.PEDOMETER_FG_FLUSH_INTERVAL", 0));
            editor1.remove("SavedState.PedometerState.PEDOMETER_FG_FLUSH_INTERVAL");
        }
        if (context.contains("SavedState.PedometerState.PEDOMETER_BG_SERVER_SYNC_INTERVAL"))
        {
            editor.putInt("PEDOMETER_BG_SERVER_SYNC_INTERVAL", context.getInt("SavedState.PedometerState.PEDOMETER_BG_SERVER_SYNC_INTERVAL", 0));
            editor1.remove("SavedState.PedometerState.PEDOMETER_BG_SERVER_SYNC_INTERVAL");
        }
        if (context.contains("SavedState.PedometerState.PEDOMETER_METS_AND_ACTIVITY_CALCULATION_METHOD"))
        {
            editor.putInt("PEDOMETER_METS_AND_ACTIVITY_CALCULATION_METHOD", context.getInt("SavedState.PedometerState.PEDOMETER_METS_AND_ACTIVITY_CALCULATION_METHOD", 0));
            editor1.remove("SavedState.PedometerState.PEDOMETER_METS_AND_ACTIVITY_CALCULATION_METHOD");
        }
        if (context.contains("SavedState.PedometerState.PEDOMETER_HTC_COMPATIBILITY_CHECK_RESULT_REPLACEMENT_VALUE"))
        {
            editor.putInt("PEDOMETER_HTC_COMPATIBILITY_CHECK_RESULT_REPLACEMENT_VALUE", context.getInt("SavedState.PedometerState.PEDOMETER_HTC_COMPATIBILITY_CHECK_RESULT_REPLACEMENT_VALUE", 0));
            editor1.remove("SavedState.PedometerState.PEDOMETER_HTC_COMPATIBILITY_CHECK_RESULT_REPLACEMENT_VALUE");
        }
        if (context.contains("SavedState.PedometerState.PEDOMETER_LAST_SERVER_SYNC_RUN_TIME"))
        {
            editor.putLong("PEDOMETER_LAST_SERVER_SYNC_RUN_TIME", context.getLong("SavedState.PedometerState.PEDOMETER_LAST_SERVER_SYNC_RUN_TIME", 0L));
            editor1.remove("SavedState.PedometerState.PEDOMETER_LAST_SERVER_SYNC_RUN_TIME");
        }
        if (context.contains("SavedState.PedometerState.PEDOMETER_CAN_USE_AS_MULTI_DEVICE_TRACKER"))
        {
            editor.putBoolean("PEDOMETER_CAN_USE_AS_MULTI_DEVICE_TRACKER", context.getBoolean("SavedState.PedometerState.PEDOMETER_CAN_USE_AS_MULTI_DEVICE_TRACKER", false));
            editor1.remove("SavedState.PedometerState.PEDOMETER_CAN_USE_AS_MULTI_DEVICE_TRACKER");
        }
        editor1.apply();
    }

    public volatile android.content.SharedPreferences.Editor c()
    {
        return super.c();
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.remove("PEDOMETER_LAST_SERVER_SYNC_RUN_TIME");
        editor.remove("PUSH_NOTIFICATIONS_ENABLED");
        editor.apply();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
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
