// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.restrictioncheck;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.filter.ActivityFilter;
import com.google.android.apps.wallet.user.UserInfoManager;

// Referenced classes of package com.google.android.apps.wallet.restrictioncheck:
//            WalletRestrictionChecker, WalletRestrictionCheckFailActivity

public class RestrictionCheckFilter extends ActivityFilter
{

    private final Activity activity;
    private final UserInfoManager userInfoManager;
    private final WalletRestrictionChecker walletRestrictionChecker;

    public RestrictionCheckFilter(Activity activity1, WalletRestrictionChecker walletrestrictionchecker, UserInfoManager userinfomanager)
    {
        activity = activity1;
        walletRestrictionChecker = walletrestrictionchecker;
        userInfoManager = userinfomanager;
    }

    protected final Intent onCreate(Bundle bundle)
    {
        if (walletRestrictionChecker.shouldUpgradeWalletSoon())
        {
            bundle = InternalIntents.forClass(activity, com/google/android/apps/wallet/restrictioncheck/WalletRestrictionCheckFailActivity);
            bundle.putExtra("mode", 2);
            bundle.addFlags(0x10000);
            return bundle;
        }
        if (walletRestrictionChecker.isWalletVersionTooOld())
        {
            return WalletRestrictionCheckFailActivity.createIntentForMustUpgradeWallet(activity);
        }
        if (!userInfoManager.isWalletAllowedForUserInCountry())
        {
            bundle = InternalIntents.forClass(activity, com/google/android/apps/wallet/restrictioncheck/WalletRestrictionCheckFailActivity);
            bundle.putExtra("mode", 0);
            bundle.addFlags(0x10000);
            bundle.addFlags(0x10000000);
            return bundle;
        } else
        {
            return null;
        }
    }
}
