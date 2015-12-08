// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.restrictioncheck;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import com.google.android.apps.wallet.config.gservices.GservicesKey;
import com.google.android.apps.wallet.config.gservices.GservicesWrapper;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.user.UserInfoManager;
import java.util.concurrent.TimeUnit;

public class WalletRestrictionChecker
{

    private static final long CACHE_TIME_OUT_MILLIS;
    private static final String TAG = com/google/android/apps/wallet/restrictioncheck/WalletRestrictionChecker.getSimpleName();
    private boolean alreadyWarned;
    private long alreadyWarnedRealTimeMillis;
    private final Application application;
    private final GservicesWrapper gservicesWrapper;
    private final UserInfoManager userInfoManager;

    WalletRestrictionChecker(Application application1, GservicesWrapper gserviceswrapper, UserInfoManager userinfomanager)
    {
        alreadyWarned = false;
        alreadyWarnedRealTimeMillis = -1L;
        application = application1;
        gservicesWrapper = gserviceswrapper;
        userInfoManager = userinfomanager;
    }

    private static int getPackageVersion(Context context)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 128).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            WLog.e(TAG, "Unable to get packageName or version", context);
            return 0x7fffffff;
        }
        return i;
    }

    public final boolean checkAllRestrictionsSatisfied()
    {
        return !isWalletVersionTooOld() && userInfoManager.isWalletAllowedForUserInCountry();
    }

    public final boolean isWalletVersionTooOld()
    {
        long l = gservicesWrapper.getInt(GservicesKey.GSERVICES_MIN_SUPPORTED_VERSION);
        int i = getPackageVersion(application);
        boolean flag;
        if ((long)i <= l)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        WLog.d(TAG, (new StringBuilder(103)).append("isWalletVersionTooOld packageVersion=").append(i).append(" mMinSupportedVersion=").append(l).append(" result=").append(flag).toString());
        return flag;
    }

    public final boolean shouldUpgradeWalletSoon()
    {
        long l = SystemClock.elapsedRealtime();
        if (!alreadyWarned || l > alreadyWarnedRealTimeMillis + CACHE_TIME_OUT_MILLIS)
        {
            long l1 = gservicesWrapper.getInt(GservicesKey.GSERVICES_MIN_UPGRADE_SOON_VERSION);
            alreadyWarned = true;
            alreadyWarnedRealTimeMillis = l;
            if ((long)getPackageVersion(application) <= l1)
            {
                return true;
            }
        }
        return false;
    }

    static 
    {
        CACHE_TIME_OUT_MILLIS = TimeUnit.HOURS.toMillis(4L);
    }
}
