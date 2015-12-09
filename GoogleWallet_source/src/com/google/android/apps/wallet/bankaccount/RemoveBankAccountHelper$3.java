// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.bankaccount;

import com.google.android.apps.wallet.base.activity.WalletActivity;

// Referenced classes of package com.google.android.apps.wallet.bankaccount:
//            RemoveBankAccountHelper

final class val.activity
    implements Runnable
{

    final RemoveBankAccountHelper this$0;
    final WalletActivity val$activity;

    public final void run()
    {
        val$activity.finish();
    }

    ()
    {
        this$0 = final_removebankaccounthelper;
        val$activity = WalletActivity.this;
        super();
    }
}
