// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.funding.api;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.wallet.api.InternalIntents;

// Referenced classes of package com.google.android.apps.wallet.funding.api:
//            FundingSource

public final class FundingApi
{

    public static Intent createLegacySetupNfcBackingInstrumentsActivityIntent(Context context)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.funding.LegacySetupNfcBackingInstrumentsActivity");
    }

    public static Intent createSelectFundingSourceIntent(Context context, int i, FundingSource fundingsource, boolean flag)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.funding.SelectFundingSourceActivity").putExtra("instrument_use", i).putExtra("funding_source", fundingsource).putExtra("show_fees", flag);
    }

    public static Intent createSelectNfcPaymentCardIntent(Context context)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.funding.SelectFundingSourceActivity").putExtra("instrument_use", 1);
    }

    public static Intent createSelectNfcPaymentCardWithTitleIntent(Context context, String s, boolean flag)
    {
        return createSelectNfcPaymentCardIntent(context).putExtra("title", s).putExtra("show_help_text", flag).putExtra("instrument_use", 1);
    }
}
