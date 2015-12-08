// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.view.View;
import com.google.android.apps.wallet.funding.api.FundingSource;
import com.google.android.apps.wallet.p2p.api.P2pApi;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            ReviewClaimMoneyActivity

final class val.instrument
    implements android.view.wClaimMoneyActivity._cls1
{

    final ReviewClaimMoneyActivity this$0;
    final FundingSource val$instrument;

    public final void onClick(View view)
    {
        startActivity(P2pApi.createClaimMoneyResultsActivityIntent(ReviewClaimMoneyActivity.this, val$instrument));
        finish();
    }

    ()
    {
        this$0 = final_reviewclaimmoneyactivity;
        val$instrument = FundingSource.this;
        super();
    }
}
