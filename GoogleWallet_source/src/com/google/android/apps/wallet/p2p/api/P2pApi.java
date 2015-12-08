// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p.api;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.funding.api.FundingSource;

public final class P2pApi
{

    public static Intent createClaimMoneyIntroActivityIntent(Context context)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.p2p.ClaimMoneyIntroActivity");
    }

    public static Intent createClaimMoneyResultsActivityIntent(Context context, FundingSource fundingsource)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.p2p.ClaimMoneyResultsActivity").putExtra("funding_source", fundingsource);
    }

    public static Intent createReviewClaimMoneyActivityIntent(Context context, FundingSource fundingsource, String s)
    {
        return InternalIntents.forClass(context, "com.google.android.apps.wallet.p2p.ReviewClaimMoneyActivity").putExtra("funding_source", fundingsource).putExtra("amount", s);
    }
}
