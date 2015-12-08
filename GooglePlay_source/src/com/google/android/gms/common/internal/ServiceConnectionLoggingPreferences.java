// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import com.google.android.flib.pref.PreferenceFile;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.util.Clock;

public final class ServiceConnectionLoggingPreferences
{

    static final com.google.android.flib.pref.PreferenceFile.SharedPreference sPeriodToSend;
    static final com.google.android.flib.pref.PreferenceFile.SharedPreference sPeriodsInCycle;
    static final PreferenceFile sPrefs;

    public static boolean isTimeToLog(Clock clock)
    {
        long l = clock.currentTimeMillis();
        int i = ((Integer)sPeriodToSend.get()).intValue();
        int j = (int)(l / ((Long)com.google.android.gms.common.config.G.analytics.periodicMonitoringInterval.getBinderSafe()).longValue()) % 20;
        return j == i - 1 || i == 0 && j == 19;
    }

    static 
    {
        PreferenceFile preferencefile = new PreferenceFile("sc-logging");
        sPrefs = preferencefile;
        sPeriodToSend = preferencefile.intValue("period_to_send", Integer.valueOf(-1));
        sPeriodsInCycle = sPrefs.intValue("periods_in_cycle", Integer.valueOf(-1));
    }
}
