// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriRegistry;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            PlasticCardTile

final class this._cls0
    implements android.view.er
{

    final PlasticCardTile this$0;

    public final void onClick(View view)
    {
        PlasticCardTile.access$000(PlasticCardTile.this).sendLinkTap("WalletCardStatusTile", new AnalyticsCustomDimension[0]);
        PlasticCardTile.access$400(PlasticCardTile.this).startActivity(PlasticCardTile.access$200(PlasticCardTile.this).createIntent(6003, new Object[0]));
    }

    imension()
    {
        this$0 = PlasticCardTile.this;
        super();
    }
}
