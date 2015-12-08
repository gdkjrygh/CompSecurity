// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.accounts;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import com.soundcloud.android.ServiceInitiator;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;

// Referenced classes of package com.soundcloud.android.accounts:
//            AccountOperations

public class AccountPlaybackController extends DefaultActivityLightCycle
{

    private final AccountOperations accountOperations;
    private final ServiceInitiator serviceInitiator;

    public AccountPlaybackController(AccountOperations accountoperations, ServiceInitiator serviceinitiator)
    {
        accountOperations = accountoperations;
        serviceInitiator = serviceinitiator;
    }

    public volatile void onResume(Activity activity)
    {
        onResume((AppCompatActivity)activity);
    }

    public void onResume(AppCompatActivity appcompatactivity)
    {
        if (!accountOperations.isUserLoggedIn())
        {
            serviceInitiator.resetPlaybackService();
            appcompatactivity.finish();
        }
    }
}
