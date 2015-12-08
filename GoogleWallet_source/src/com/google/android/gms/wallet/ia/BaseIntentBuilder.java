// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.ia;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;

public abstract class BaseIntentBuilder
{

    private com.google.android.gms.wallet.shared.BuyFlowConfig.a aVg;
    private com.google.android.gms.wallet.shared.ApplicationParameters.a aVh;
    protected Bundle mArgs;
    protected Intent mIntent;

    public BaseIntentBuilder(Context context, String s, String s1)
    {
        mIntent = new Intent();
        mIntent.setPackage("com.google.android.gms");
        mIntent.setAction(s);
        mArgs = new Bundle();
        aVh = ApplicationParameters.newBuilder().A(mArgs);
        aVg = BuyFlowConfig.newBuilder().ei(context.getPackageName()).ej(s1);
    }

    public final Intent build()
    {
        BuyFlowConfig buyflowconfig = aVg.a(aVh.uZ()).va();
        mIntent.putExtra("com.google.android.gms.wallet.buyFlowConfig", buyflowconfig);
        return onIntentBuilt(mIntent, buyflowconfig);
    }

    protected Intent onIntentBuilt(Intent intent, BuyFlowConfig buyflowconfig)
    {
        return intent;
    }

    public final BaseIntentBuilder setBuyerAccount(Account account)
    {
        aVh.d(account);
        return this;
    }

    public final BaseIntentBuilder setEnvironment(int i)
    {
        aVh.ln(i);
        return this;
    }

    public final BaseIntentBuilder setTheme(int i)
    {
        aVh.lo(i);
        return this;
    }
}
