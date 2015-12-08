// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.settings.api;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.wallet.api.InternalIntents;

public final class SettingsApi
{

    public static Intent createLowBalanceSettingsActivityIntentForSettings(Context context)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.settings.ui.LowBalanceSettingsActivity").putExtra("PARENTED_BY_SEETINGS", true);
    }

    public static Intent createLowBalanceSettingsActivityIntentForWalletBalance(Context context)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.settings.ui.LowBalanceSettingsActivity").putExtra("PARENTED_BY_SEETINGS", false);
    }

    public static String getNotificationSettingsUri()
    {
        return "comgooglewallet:///settings/notifications";
    }
}
