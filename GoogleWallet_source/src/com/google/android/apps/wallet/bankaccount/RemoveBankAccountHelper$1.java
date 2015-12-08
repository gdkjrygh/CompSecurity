// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import android.content.DialogInterface;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.base.activity.WalletActivity;

// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            RemoveBankAccountHelper

final class val.currentActivity
    implements android.content.tener
{

    final RemoveBankAccountHelper this$0;
    final WalletActivity val$currentActivity;

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == -1)
        {
            analyticsUtil.sendButtonTap("RemoveBankAccount", new AnalyticsCustomDimension[0]);
            removeAccount(val$currentActivity);
        }
    }

    ()
    {
        this$0 = final_removebankaccounthelper;
        val$currentActivity = WalletActivity.this;
        super();
    }
}
