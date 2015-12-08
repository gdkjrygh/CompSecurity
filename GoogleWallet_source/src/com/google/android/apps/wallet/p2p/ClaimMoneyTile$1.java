// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.p2p.api.P2pApi;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            ClaimMoneyTile

final class this._cls0
    implements android.view.ner
{

    final ClaimMoneyTile this$0;

    public final void onClick(View view)
    {
        ClaimMoneyTile.access$000(ClaimMoneyTile.this).sendLinkTap("ClaimMoneyTile", new AnalyticsCustomDimension[0]);
        ClaimMoneyTile.access$200(ClaimMoneyTile.this).startActivity(P2pApi.createClaimMoneyIntroActivityIntent(ClaimMoneyTile.access$100(ClaimMoneyTile.this)));
    }

    il()
    {
        this$0 = ClaimMoneyTile.this;
        super();
    }
}
