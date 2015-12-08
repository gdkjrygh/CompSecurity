// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.driverdefense;

import android.app.Activity;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.application.IUserProvider;
import me.lyft.android.domain.User;
import me.lyft.android.infrastructure.activity.ActivityService;
import me.lyft.android.services.LyftDriverToggleService;

public class DriverDefenseStarterService extends ActivityService
{

    private ILyftPreferences lyftPreferences;
    private IUserProvider userProvider;

    public DriverDefenseStarterService(IUserProvider iuserprovider, ILyftPreferences ilyftpreferences)
    {
        userProvider = iuserprovider;
        lyftPreferences = ilyftpreferences;
    }

    private boolean shouldShowDriverDefense()
    {
        return userProvider.getUser().isApprovedDriver() && lyftPreferences.isDriverShortcutEnabled();
    }

    public void onActivityPaused(Activity activity)
    {
        super.onActivityPaused(activity);
        if (shouldShowDriverDefense())
        {
            LyftDriverToggleService.startService(activity);
        }
    }

    public void onActivityResumed(Activity activity)
    {
        super.onActivityResumed(activity);
        LyftDriverToggleService.stopService(activity);
    }
}
