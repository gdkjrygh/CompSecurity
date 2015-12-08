// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.setup.api;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.common.collect.ImmutableMap;

public final class NfcSetupApi
{

    private static final ImmutableMap REASON_DESCRIPTIONS = ImmutableMap.builder().put(Integer.valueOf(0), "REASON_COUNT_LIMIT").put(Integer.valueOf(1), "REASON_TIME_THRESHOLD").put(Integer.valueOf(2), "REASON_COUNT_THRESHOLD").put(Integer.valueOf(3), "REASON_SERVER_REQUESTED").put(Integer.valueOf(4), "REASON_MANUAL_REFRESH").put(Integer.valueOf(5), "REASON_BACKUP_REFRESH").build();

    public static Intent createLegacySetupNfcPaymentCongratsActivityIntent(Context context)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.hce.setup.LegacySetupNfcPaymentCongratsActivity");
    }

    public static Intent createTapAndPaySetupIntent(Context context)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.hce.setup.LegacySetupNfcPaymentActivity");
    }

    public static String getDescription(int i)
    {
        return (String)REASON_DESCRIPTIONS.get(Integer.valueOf(i));
    }

    public static Intent getRefreshIntent(Context context, int i)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.hce.setup.NfcPaymentSetupService").setAction("com.google.android.apps.wallet.hce.setup.ACTION_REFRESH_HCE_BUNDLE").putExtra("reason", i);
    }

}
