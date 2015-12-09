// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.pin.api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.wallet.api.InternalIntents;

public final class PinApi
{

    public static Intent createIntentForPaymentCloudPinEntry(Context context, String s)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.pin.VerifyCloudPinActivity").addFlags(0x20000000).addFlags(0x10000000).putExtra("successComponent", s).putExtra("play_failure_sound", true).putExtra("floatTop", true);
    }

    public static Intent createIntentForPinSettingsActivity(Context context)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.pin.PinSettingsActivity").addFlags(0x20000000).addFlags(0x4000000);
    }

    public static Intent createLockWalletIntent(Context context)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.pin.VerifyCloudPinActivity").addFlags(0x20000000).putExtra("EXPIRE_PIN", true);
    }

    public static void startVerifyPinActivityForResult(Activity activity, int i)
    {
        activity.startActivityForResult(InternalIntents.forClass(activity, "com.google.android.apps.wallet.pin.VerifyCloudPinActivity").addFlags(0x20000000), i);
    }

    public static void startVerifyPinActivityForResultAllowBack(Activity activity, int i)
    {
        activity.startActivityForResult(InternalIntents.forClass(activity, "com.google.android.apps.wallet.pin.VerifyCloudPinActivity").addFlags(0x20000000).putExtra("enabled_back_button", true), i);
    }
}
