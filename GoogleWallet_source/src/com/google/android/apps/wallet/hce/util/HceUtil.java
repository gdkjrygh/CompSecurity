// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.util;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.nfc.cardemulation.CardEmulation;
import dagger.Lazy;

public class HceUtil
{

    private final Activity activity;
    private final Lazy cardEmulationManager;

    public HceUtil(Activity activity1, Lazy lazy)
    {
        activity = activity1;
        cardEmulationManager = lazy;
    }

    public final boolean isWalletDefaultPaymentApp()
    {
        ComponentName componentname = new ComponentName(activity, "com.google.android.apps.wallet.hce.WalletHceService");
        return ((CardEmulation)cardEmulationManager.get()).isDefaultServiceForCategory(componentname, "payment");
    }

    public final void setWalletDefaultPaymentApp()
    {
        Intent intent = new Intent("android.nfc.cardemulation.action.ACTION_CHANGE_DEFAULT");
        intent.putExtra("category", "payment");
        intent.putExtra("component", new ComponentName(activity, "com.google.android.apps.wallet.hce.WalletHceService"));
        activity.startActivity(intent);
    }
}
