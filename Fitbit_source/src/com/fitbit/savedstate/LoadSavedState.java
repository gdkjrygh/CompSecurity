// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.SharedPreferences;
import com.fitbit.util.format.e;
import java.util.Date;
import java.util.TimeZone;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class LoadSavedState extends a
{
    public static final class DataType extends Enum
    {

        public static final DataType a;
        public static final DataType b;
        public static final DataType c;
        public static final DataType d;
        public static final DataType e;
        public static final DataType f;
        public static final DataType g;
        private static final DataType h[];

        public static DataType valueOf(String s)
        {
            return (DataType)Enum.valueOf(com/fitbit/savedstate/LoadSavedState$DataType, s);
        }

        public static DataType[] values()
        {
            return (DataType[])h.clone();
        }

        static 
        {
            a = new DataType("SLEEP_DATA", 0);
            b = new DataType("NOTIFICATIONS", 1);
            c = new DataType("FRIENDS", 2);
            d = new DataType("CONTACTS", 3);
            e = new DataType("PROFILE_PHOTO", 4);
            f = new DataType("CHALLENGES", 5);
            g = new DataType("NOTIFICATIONS_COUNT", 6);
            h = (new DataType[] {
                a, b, c, d, e, f, g
            });
        }

        private DataType(String s, int j)
        {
            super(s, j);
        }
    }

    public static final class Status extends Enum
    {

        public static final Status a;
        public static final Status b;
        public static final Status c;
        private static final Status d[];

        public static Status valueOf(String s)
        {
            return (Status)Enum.valueOf(com/fitbit/savedstate/LoadSavedState$Status, s);
        }

        public static Status[] values()
        {
            return (Status[])d.clone();
        }

        static 
        {
            a = new Status("NOT_LOADED", 0);
            b = new Status("LOADED", 1);
            c = new Status("LOAD_FAILED", 2);
            d = (new Status[] {
                a, b, c
            });
        }

        private Status(String s, int j)
        {
            super(s, j);
        }
    }


    private static final LoadSavedState b = new LoadSavedState();
    private static final String c = "STEPS_LOADED";
    private static final String d = "DISTANCE_LOADED";
    private static final String e = "MINUTES_VERY_ACTIVE_LOADED";
    private static final String f = "CALORIES_LOADED";
    private static final String g = "FLOORS_LOADED";
    private static final String h = "STRING.";
    private static final String i = ".REFRESH_DATE";

    LoadSavedState()
    {
        super("LoadSavedState");
    }

    public static Status a(DataType datatype)
    {
        return a(e(datatype));
    }

    public static Status a(DataType datatype, String s)
    {
        return a(b(datatype, s));
    }

    private static Status a(String s)
    {
        com/fitbit/savedstate/LoadSavedState;
        JVM INSTR monitorenter ;
        s = Status.valueOf(h().getString(s, Status.a.name()));
        com/fitbit/savedstate/LoadSavedState;
        JVM INSTR monitorexit ;
        return s;
        s;
        throw s;
    }

    private static String a(DataType datatype, Date date)
    {
        return b(datatype, com.fitbit.util.format.e.c(date, TimeZone.getTimeZone("GMT")));
    }

    public static void a(DataType datatype, Status status)
    {
        a(e(datatype), status, null);
    }

    public static void a(DataType datatype, Status status, Status status1)
    {
        a(e(datatype), status, status1);
    }

    public static void a(DataType datatype, String s, Status status)
    {
        a(b(datatype, s), status, null);
    }

    public static void a(DataType datatype, String s, Status status, Status status1)
    {
        a(b(datatype, s), status, status1);
    }

    public static void a(DataType datatype, Date date, Status status)
    {
        a(a(datatype, date), status, null);
    }

    public static void a(DataType datatype, Date date, Status status, Status status1)
    {
        a(a(datatype, date), status, status1);
    }

    private static void a(String s, Status status, Status status1)
    {
        com/fitbit/savedstate/LoadSavedState;
        JVM INSTR monitorenter ;
        SharedPreferences sharedpreferences = h();
        if (status1 == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        if (status1 != Status.valueOf(sharedpreferences.getString(s, Status.a.name())))
        {
            break MISSING_BLOCK_LABEL_52;
        }
        sharedpreferences.edit().putString(s, status.name()).apply();
        com/fitbit/savedstate/LoadSavedState;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }

    public static void a(boolean flag, com.fitbit.util.chart.Filter.Type type)
    {
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putBoolean((new StringBuilder()).append("STEPS_LOADED").append(type.name()).toString(), flag);
        editor.apply();
    }

    public static void a(boolean flag, com.fitbit.util.chart.Filter.Type atype[])
    {
        android.content.SharedPreferences.Editor editor = b.b().edit();
        int k = atype.length;
        for (int j = 0; j < k; j++)
        {
            com.fitbit.util.chart.Filter.Type type = atype[j];
            editor.putBoolean((new StringBuilder()).append("STEPS_LOADED").append(type.name()).toString(), flag);
        }

        editor.apply();
    }

    public static boolean a(com.fitbit.util.chart.Filter.Type type)
    {
        com/fitbit/savedstate/LoadSavedState;
        JVM INSTR monitorenter ;
        boolean flag = b.b().getBoolean((new StringBuilder()).append("STEPS_LOADED").append(type.name()).toString(), false);
        com/fitbit/savedstate/LoadSavedState;
        JVM INSTR monitorexit ;
        return flag;
        type;
        throw type;
    }

    private static String b(DataType datatype, String s)
    {
        return (new StringBuilder()).append("STRING.").append(datatype.name()).append(".").append(s).toString();
    }

    public static void b(boolean flag, com.fitbit.util.chart.Filter.Type type)
    {
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putBoolean((new StringBuilder()).append("DISTANCE_LOADED").append(type.name()).toString(), flag);
        editor.apply();
    }

    public static void b(boolean flag, com.fitbit.util.chart.Filter.Type atype[])
    {
        android.content.SharedPreferences.Editor editor = b.b().edit();
        int k = atype.length;
        for (int j = 0; j < k; j++)
        {
            com.fitbit.util.chart.Filter.Type type = atype[j];
            editor.putBoolean((new StringBuilder()).append("DISTANCE_LOADED").append(type.name()).toString(), flag);
        }

        editor.apply();
    }

    public static boolean b(DataType datatype)
    {
        return a(e(datatype)) == Status.b;
    }

    public static boolean b(com.fitbit.util.chart.Filter.Type type)
    {
        com/fitbit/savedstate/LoadSavedState;
        JVM INSTR monitorenter ;
        boolean flag = b.b().getBoolean((new StringBuilder()).append("DISTANCE_LOADED").append(type.name()).toString(), false);
        com/fitbit/savedstate/LoadSavedState;
        JVM INSTR monitorexit ;
        return flag;
        type;
        throw type;
    }

    public static void c(DataType datatype)
    {
        datatype = f(datatype);
        SharedPreferences sharedpreferences = h();
        Date date = new Date();
        sharedpreferences.edit().putLong(datatype, date.getTime()).apply();
    }

    public static void c(boolean flag, com.fitbit.util.chart.Filter.Type type)
    {
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putBoolean((new StringBuilder()).append("MINUTES_VERY_ACTIVE_LOADED").append(type.name()).toString(), flag);
        editor.apply();
    }

    public static void c(boolean flag, com.fitbit.util.chart.Filter.Type atype[])
    {
        android.content.SharedPreferences.Editor editor = b.b().edit();
        int k = atype.length;
        for (int j = 0; j < k; j++)
        {
            com.fitbit.util.chart.Filter.Type type = atype[j];
            editor.putBoolean((new StringBuilder()).append("MINUTES_VERY_ACTIVE_LOADED").append(type.name()).toString(), flag);
        }

        editor.apply();
    }

    public static boolean c(com.fitbit.util.chart.Filter.Type type)
    {
        com/fitbit/savedstate/LoadSavedState;
        JVM INSTR monitorenter ;
        boolean flag = b.b().getBoolean((new StringBuilder()).append("MINUTES_VERY_ACTIVE_LOADED").append(type.name()).toString(), false);
        com/fitbit/savedstate/LoadSavedState;
        JVM INSTR monitorexit ;
        return flag;
        type;
        throw type;
    }

    public static Date d(DataType datatype)
    {
        datatype = f(datatype);
        return new Date(h().getLong(datatype, 0L));
    }

    public static void d(boolean flag, com.fitbit.util.chart.Filter.Type type)
    {
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putBoolean((new StringBuilder()).append("CALORIES_LOADED").append(type.name()).toString(), flag);
        editor.apply();
    }

    public static void d(boolean flag, com.fitbit.util.chart.Filter.Type atype[])
    {
        android.content.SharedPreferences.Editor editor = b.b().edit();
        int k = atype.length;
        for (int j = 0; j < k; j++)
        {
            com.fitbit.util.chart.Filter.Type type = atype[j];
            editor.putBoolean((new StringBuilder()).append("FLOORS_LOADED").append(type.name()).toString(), flag);
        }

        editor.apply();
    }

    public static boolean d(com.fitbit.util.chart.Filter.Type type)
    {
        com/fitbit/savedstate/LoadSavedState;
        JVM INSTR monitorenter ;
        boolean flag = b.b().getBoolean((new StringBuilder()).append("CALORIES_LOADED").append(type.name()).toString(), false);
        com/fitbit/savedstate/LoadSavedState;
        JVM INSTR monitorexit ;
        return flag;
        type;
        throw type;
    }

    private static String e(DataType datatype)
    {
        return (new StringBuilder()).append("STRING.").append(datatype.name()).toString();
    }

    public static void e(boolean flag, com.fitbit.util.chart.Filter.Type type)
    {
        android.content.SharedPreferences.Editor editor = b.b().edit();
        editor.putBoolean((new StringBuilder()).append("FLOORS_LOADED").append(type.name()).toString(), flag);
        editor.apply();
    }

    public static void e(boolean flag, com.fitbit.util.chart.Filter.Type atype[])
    {
        android.content.SharedPreferences.Editor editor = b.b().edit();
        int k = atype.length;
        for (int j = 0; j < k; j++)
        {
            com.fitbit.util.chart.Filter.Type type = atype[j];
            editor.putBoolean((new StringBuilder()).append("CALORIES_LOADED").append(type.name()).toString(), flag);
        }

        editor.apply();
    }

    public static boolean e(com.fitbit.util.chart.Filter.Type type)
    {
        com/fitbit/savedstate/LoadSavedState;
        JVM INSTR monitorenter ;
        boolean flag = b.b().getBoolean((new StringBuilder()).append("FLOORS_LOADED").append(type.name()).toString(), false);
        com/fitbit/savedstate/LoadSavedState;
        JVM INSTR monitorexit ;
        return flag;
        type;
        throw type;
    }

    private static String f(DataType datatype)
    {
        return (new StringBuilder()).append(e(datatype)).append(".REFRESH_DATE").toString();
    }

    protected static a g()
    {
        return b;
    }

    private static SharedPreferences h()
    {
        return b.b();
    }

    public volatile int a()
    {
        return super.a();
    }

    public volatile SharedPreferences a(Context context)
    {
        return super.a(context);
    }

    public volatile void a(Context context, int j, int k, android.content.SharedPreferences.Editor editor)
    {
        super.a(context, j, k, editor);
    }

    public volatile SharedPreferences b()
    {
        return super.b();
    }

    public void b(Context context, int j, int k, android.content.SharedPreferences.Editor editor)
    {
    }

    public volatile android.content.SharedPreferences.Editor c()
    {
        return super.c();
    }

    public void d()
    {
        int j = 0;
        this;
        JVM INSTR monitorenter ;
        android.content.SharedPreferences.Editor editor;
        com.fitbit.util.chart.Filter.Type atype[];
        int k;
        editor = b.b().edit();
        editor.clear();
        atype = com.fitbit.util.chart.Filter.Type.values();
        k = atype.length;
_L2:
        com.fitbit.util.chart.Filter.Type type;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        type = atype[j];
        editor.putBoolean((new StringBuilder()).append("STEPS_LOADED").append(type.name()).toString(), false);
        editor.putBoolean((new StringBuilder()).append("CALORIES_LOADED").append(type.name()).toString(), false);
        editor.putBoolean((new StringBuilder()).append("FLOORS_LOADED").append(type.name()).toString(), false);
        editor.putBoolean((new StringBuilder()).append("DISTANCE_LOADED").append(type.name()).toString(), false);
        editor.putBoolean((new StringBuilder()).append("MINUTES_VERY_ACTIVE_LOADED").append(type.name()).toString(), false);
        j++;
        if (true) goto _L2; else goto _L1
_L1:
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
