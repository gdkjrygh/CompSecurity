// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.usersetup;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.filter.ActivityFilter;

// Referenced classes of package com.google.android.apps.wallet.usersetup:
//            WarmWelcomeActivity

public class WarmWelcomeFilter extends ActivityFilter
{

    private final Activity activity;
    private final SharedPreferences globalPreferences;

    WarmWelcomeFilter(Activity activity1, SharedPreferences sharedpreferences)
    {
        activity = activity1;
        globalPreferences = sharedpreferences;
    }

    public final Intent onCreate(Bundle bundle)
    {
        if (!((Boolean)SharedPreference.WARM_WELCOME_VIEWED.get(globalPreferences)).booleanValue())
        {
            return InternalIntents.forClass(activity, com/google/android/apps/wallet/usersetup/WarmWelcomeActivity);
        } else
        {
            return null;
        }
    }
}
