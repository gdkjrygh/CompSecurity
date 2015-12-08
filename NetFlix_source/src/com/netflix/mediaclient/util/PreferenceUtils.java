// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import android.content.Context;
import android.content.SharedPreferences;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.error.CrashReport;
import com.netflix.mediaclient.error.Signal;

public final class PreferenceUtils
{

    private static final String PREFS_NAME = "nfxpref";

    private PreferenceUtils()
    {
    }

    public static boolean getBooleanPref(Context context, String s, boolean flag)
    {
        if (!validate(context, s))
        {
            return flag;
        }
        boolean flag1;
        try
        {
            flag1 = context.getSharedPreferences("nfxpref", 0).getBoolean(s, flag);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("nfxpref", "Failed to get preferences!", context);
            return flag;
        }
        return flag1;
    }

    public static CrashReport getCrashReport(Context context)
        throws IllegalArgumentException
    {
        context = context.getSharedPreferences("nfxpref", 0);
        int i = context.getInt("NF_CrashReport.signal", -1);
        long l = context.getLong("NF_CrashReport.sigNumber", -1L);
        long l1 = context.getLong("NF_CrashReport.errorNumber", -1L);
        long l2 = context.getLong("NF_CrashReport.errorCode", -1L);
        long l3 = context.getLong("NF_CrashReport.ts", -1L);
        String s = context.getString("NF_CrashReport.movieId", "");
        String s1 = context.getString("NF_CrashReport.episodeId", "");
        int j = context.getInt("NF_CrashReport.trackId", 0);
        int k = context.getInt("NF_CrashReport.pid", -1);
        if (i == -1)
        {
            removeCrashReport(context);
            return null;
        }
        Signal signal = Signal.toSignal(i);
        if (signal == null)
        {
            removeCrashReport(context);
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown signal ").append(i).toString());
        } else
        {
            return new CrashReport(signal, l, l1, l2, s, s1, j, l3, k);
        }
    }

    public static float getFloatPref(Context context, String s, float f)
    {
        if (!validate(context, s))
        {
            return f;
        }
        float f1;
        try
        {
            f1 = context.getSharedPreferences("nfxpref", 0).getFloat(s, f);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("nfxpref", "Failed to get preferences!", context);
            return f;
        }
        return f1;
    }

    public static int getIntPref(Context context, String s, int i)
    {
        if (!validate(context, s))
        {
            return i;
        }
        int j;
        try
        {
            j = context.getSharedPreferences("nfxpref", 0).getInt(s, i);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("nfxpref", "Failed to get preferences!", context);
            return i;
        }
        return j;
    }

    public static long getLongPref(Context context, String s, long l)
    {
        if (!validate(context, s))
        {
            return l;
        }
        long l1;
        try
        {
            l1 = context.getSharedPreferences("nfxpref", 0).getLong(s, l);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("nfxpref", "Failed to get preferences!", context);
            return l;
        }
        return l1;
    }

    public static String getStringPref(Context context, String s, String s1)
    {
        if (!validate(context, s))
        {
            return s1;
        }
        try
        {
            context = context.getSharedPreferences("nfxpref", 0).getString(s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("nfxpref", "Failed to get preferences!", context);
            return s1;
        }
        return context;
    }

    public static boolean putBooleanPref(Context context, String s, boolean flag)
    {
        boolean flag1;
        flag1 = false;
        if (!validate(context, s))
        {
            return false;
        }
        context = context.getSharedPreferences("nfxpref", 0).edit();
        context.putBoolean(s, flag);
        context.commit();
        flag = true;
_L2:
        return flag;
        context;
        Log.e("nfxpref", "Failed to save to preferences!", context);
        flag = flag1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean putIntPref(Context context, String s, int i)
    {
        boolean flag;
        flag = false;
        if (!validate(context, s))
        {
            return false;
        }
        context = context.getSharedPreferences("nfxpref", 0).edit();
        context.putInt(s, i);
        context.commit();
        flag = true;
_L2:
        return flag;
        context;
        Log.e("nfxpref", "Failed to save to preferences!", context);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void putLongPref(Context context, String s, float f)
    {
        if (!validate(context, s))
        {
            return;
        } else
        {
            context = context.getSharedPreferences("nfxpref", 0).edit();
            context.putFloat(s, f);
            context.commit();
            return;
        }
    }

    public static boolean putLongPref(Context context, String s, long l)
    {
        boolean flag;
        flag = false;
        if (!validate(context, s))
        {
            return false;
        }
        context = context.getSharedPreferences("nfxpref", 0).edit();
        context.putLong(s, l);
        context.commit();
        flag = true;
_L2:
        return flag;
        context;
        Log.e("nfxpref", "Failed to save to preferences!", context);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static boolean putStringPref(Context context, String s, String s1)
    {
        boolean flag;
        flag = false;
        if (!validate(context, s))
        {
            return false;
        }
        context = context.getSharedPreferences("nfxpref", 0).edit();
        context.putString(s, s1);
        context.commit();
        flag = true;
_L2:
        return flag;
        context;
        Log.e("nfxpref", "Failed to save to preferences!", context);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static void removeCrashReport(SharedPreferences sharedpreferences)
    {
        sharedpreferences = sharedpreferences.edit();
        sharedpreferences.remove("NF_CrashReport.signal");
        sharedpreferences.remove("NF_CrashReport.sigNumber");
        sharedpreferences.remove("NF_CrashReport.errorCode");
        sharedpreferences.remove("NF_CrashReport.errorNumber");
        sharedpreferences.remove("NF_CrashReport.ts");
        sharedpreferences.remove("NF_CrashReport.movieId");
        sharedpreferences.remove("NF_CrashReport.episodeId");
        sharedpreferences.remove("NF_CrashReport.trackId");
        sharedpreferences.remove("NF_CrashReport.pid");
        sharedpreferences.commit();
    }

    public static boolean removeCrashReport(Context context)
    {
        try
        {
            removeCrashReport(context.getSharedPreferences("nfxpref", 0));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("nfxpref", "Failed to remove crash report from preferences!", context);
            return false;
        }
        return true;
    }

    public static boolean removePref(Context context, String s)
    {
        boolean flag;
        flag = false;
        if (!validate(context, s))
        {
            return false;
        }
        if (s == null)
        {
            Log.w("nfxpref", "Name is null!");
            return false;
        }
        context = context.getSharedPreferences("nfxpref", 0);
        if (context != null) goto _L2; else goto _L1
_L1:
        Log.e("nfxpref", "Prefs null, not expected!");
        return false;
        context;
        Log.e("nfxpref", "Failed to save to preferences!", context);
_L4:
        return flag;
_L2:
        context = context.edit();
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        Log.e("nfxpref", "Editor null, not expected!");
        return false;
        context.remove(s);
        context.commit();
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean saveCrashReport(Context context, CrashReport crashreport)
    {
        try
        {
            context = context.getSharedPreferences("nfxpref", 0).edit();
            context.putInt("NF_CrashReport.signal", crashreport.getSignal().getNumber());
            context.putLong("NF_CrashReport.sigNumber", crashreport.getSigNumber());
            context.putLong("NF_CrashReport.errorCode", crashreport.getErrorCode());
            context.putLong("NF_CrashReport.errorNumber", crashreport.getErrorNumber());
            context.putLong("NF_CrashReport.ts", crashreport.getTimestamp());
            context.putString("NF_CrashReport.movieId", crashreport.getMovieId());
            context.putString("NF_CrashReport.episodeId", crashreport.getEpisodeId());
            context.putInt("NF_CrashReport.trackId", crashreport.getTrkId());
            context.commit();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("nfxpref", "Failed to save to preferences!", context);
            return false;
        }
        return true;
    }

    private static boolean validate(Context context, String s)
    {
        if (context == null)
        {
            Log.w("nfxpref", "Context is null!");
            return false;
        }
        if (s == null)
        {
            Log.w("nfxpref", "Name is null!");
            return false;
        } else
        {
            return true;
        }
    }
}
