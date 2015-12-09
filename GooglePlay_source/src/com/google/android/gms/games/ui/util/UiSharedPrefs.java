// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.os.Process;
import com.android.common.SharedPreferencesCompat;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.util.BaseSharedPrefs;

public final class UiSharedPrefs extends BaseSharedPrefs
{

    private static volatile UiSharedPrefs sSingleton;

    private UiSharedPrefs()
    {
        super("play.games.ui.sharedPrefs");
    }

    public static String getDefaultAccount(Context context)
    {
        return getInstance().getString(context, "settingsDefaultAccount");
    }

    private static UiSharedPrefs getInstance()
    {
        if (sSingleton != null) goto _L2; else goto _L1
_L1:
        com/google/android/gms/games/ui/util/UiSharedPrefs;
        JVM INSTR monitorenter ;
        if (sSingleton == null)
        {
            sSingleton = new UiSharedPrefs();
        }
        com/google/android/gms/games/ui/util/UiSharedPrefs;
        JVM INSTR monitorexit ;
_L2:
        return sSingleton;
        Exception exception;
        exception;
        com/google/android/gms/games/ui/util/UiSharedPrefs;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static int getLeaderboardCollection(Context context)
    {
        return getInstance().getInteger(context, "collection", 1);
    }

    public static int getLeaderboardTimespan(Context context)
    {
        return getInstance().getInteger(context, "time_span", 2);
    }

    public static int getPreferredVideoQuality(Context context)
    {
        return getInstance().getInteger(context, "videoRecordingQuality", 1);
    }

    public static boolean hasAgreedToLegalText(Context context, String s)
    {
        return getInstance().getSharedPrefs(context).getBoolean(String.format("videoRecordingAgree:%s", new Object[] {
            s
        }), false);
    }

    public static boolean hasEnabledNearbyPlayers(Context context, String s)
    {
        return getInstance().getSharedPrefs(context).getBoolean(String.format("nearby-players:%s", new Object[] {
            s
        }), false);
    }

    public static boolean hasShownVideoOnboardingFlow(Context context)
    {
        return getInstance().getSharedPrefs(context).getBoolean("videoRecordingOnboarding", false);
    }

    public static void setAgreedToLegalText$607b2e89(Context context, String s)
    {
        context = getInstance().getEditor(context);
        context.putBoolean(String.format("videoRecordingAgree:%s", new Object[] {
            s
        }), true);
        SharedPreferencesCompat.apply(context);
    }

    public static void setDefaultAccount(Context context, String s)
    {
        getInstance().setString(context, "settingsDefaultAccount", s);
    }

    public static void setLeaderboardTimespan(Context context, int i)
    {
        getInstance().setInteger(context, "time_span", i);
    }

    public static void setNearbyPlayersConsent$607b2e89(Context context, String s)
    {
        context = getInstance().getEditor(context);
        context.putBoolean(String.format("nearby-players:%s", new Object[] {
            s
        }), true);
        SharedPreferencesCompat.apply(context);
    }

    public static void setPreferredVideoQuality(Context context, int i)
    {
        getInstance().setInteger(context, "videoRecordingQuality", i);
    }

    public static void setShownVideoOnboardingFlow$1a552341(Context context)
    {
        context = getInstance().getEditor(context);
        context.putBoolean("videoRecordingOnboarding", true);
        SharedPreferencesCompat.apply(context);
    }

    public final void assertProcess(Context context)
    {
        context = context.getApplicationInfo().processName;
        Asserts.checkState("com.google.android.play.games".equals(context), "Current process (%d, %s) is not the GMS Core main process (%s)", new Object[] {
            Integer.valueOf(Process.myPid()), "com.google.android.play.games", context
        });
    }
}
