// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.analytics;

import android.content.SharedPreferences;
import android.os.SystemClock;
import com.google.android.apps.common.csi.lib.Ticker;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.logging.WLog;
import dagger.Lazy;

// Referenced classes of package com.google.android.apps.wallet.analytics:
//            CsiManager

public class AppStartTimeLogger
{

    private static final String TAG = com/google/android/apps/wallet/analytics/AppStartTimeLogger.getSimpleName();
    private volatile long appStartTime;
    private volatile int appStartType;
    private final Lazy csi;
    private final SharedPreferences globalPrefs;

    AppStartTimeLogger(Lazy lazy, SharedPreferences sharedpreferences)
    {
        csi = lazy;
        globalPrefs = sharedpreferences;
    }

    private void createCsiReportForChangeUser(long l)
    {
        if (l < 0L)
        {
            return;
        } else
        {
            Ticker ticker = new Ticker("change_user");
            tick(ticker, l, "prt");
            ((CsiManager)csi.get()).reportTicker(ticker);
            return;
        }
    }

    private void createCsiReportForColdStart(long l, String s)
    {
        if (l < 0L)
        {
            return;
        } else
        {
            s = new Ticker(s);
            tick(s, l, "prt");
            ((CsiManager)csi.get()).reportTicker(s);
            return;
        }
    }

    private void generateStartTimeLogs()
    {
        int i = appStartType;
        if (i == 0)
        {
            SharedPreference.START_TIME_SWITCH_USER.remove(globalPrefs);
            return;
        }
        long l;
        l = SystemClock.elapsedRealtime();
        if (appStartType != 1)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        l -= appStartTime;
        createCsiReportForColdStart(l, "cold_start");
        appStartType = 0;
        WLog.ifmt(TAG, "Wallet app cold start time: %d ms", new Object[] {
            Long.valueOf(l)
        });
        SharedPreference.START_TIME_SWITCH_USER.remove(globalPrefs);
        return;
        if (appStartType != 2)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        l -= appStartTime;
        createCsiReportForColdStart(l, "cold_start_to_pin");
        appStartType = 3;
        WLog.ifmt(TAG, "Wallet app cold start to pin time: %d ms", new Object[] {
            Long.valueOf(l)
        });
        SharedPreference.START_TIME_SWITCH_USER.remove(globalPrefs);
        return;
        if (appStartType != 3)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        l -= appStartTime;
        createCsiReportForColdStart(l, "cold_start_pin_to_my_wallet");
        appStartType = 0;
        WLog.ifmt(TAG, "Wallet app cold start pin to my wallet time: %d ms", new Object[] {
            Long.valueOf(l)
        });
        SharedPreference.START_TIME_SWITCH_USER.remove(globalPrefs);
        return;
        if (appStartType != 4 || !SharedPreference.START_TIME_SWITCH_USER.isPresent(globalPrefs))
        {
            break MISSING_BLOCK_LABEL_275;
        }
        l -= ((Long)SharedPreference.START_TIME_SWITCH_USER.get(globalPrefs)).longValue();
        createCsiReportForChangeUser(l);
        appStartType = 0;
        WLog.ifmt(TAG, "Wallet app switch user time: %d ms", new Object[] {
            Long.valueOf(l)
        });
        SharedPreference.START_TIME_SWITCH_USER.remove(globalPrefs);
        return;
        SharedPreference.START_TIME_SWITCH_USER.remove(globalPrefs);
        return;
        Exception exception;
        exception;
        SharedPreference.START_TIME_SWITCH_USER.remove(globalPrefs);
        throw exception;
    }

    private static boolean tick(Ticker ticker, long l, String s)
    {
        if (l < 0L)
        {
            return false;
        } else
        {
            ticker.tick(l, new String[] {
                s
            });
            return true;
        }
    }

    public final void abandonLogging()
    {
        appStartType = 0;
    }

    public final void notifyMainActivityRenderred()
    {
        generateStartTimeLogs();
    }

    public final void notifyRootActivityConstructed(long l)
    {
        appStartTime = l;
    }

    public final void notifyVerifyPin()
    {
        appStartTime = SystemClock.elapsedRealtime();
    }

    public final void notifyVerifyPinRenderred()
    {
        if (appStartType == 1)
        {
            appStartType = 2;
            generateStartTimeLogs();
            return;
        } else
        {
            appStartType = 0;
            return;
        }
    }

    public final void setAppStartType(int i)
    {
        appStartType = i;
    }

}
