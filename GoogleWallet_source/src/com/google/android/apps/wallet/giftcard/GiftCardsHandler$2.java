// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.help.api.HelpUrls;

// Referenced classes of package com.google.android.apps.wallet.giftcard:
//            GiftCardsHandler

final class this._cls0
    implements android.view.r
{

    final GiftCardsHandler this$0;

    public final void onClick(View view)
    {
        analyticsUtil.sendLinkTap("GiftCardBalanceInfo", new AnalyticsCustomDimension[0]);
        view = HelpUrls.createAboutGiftCardBalanceHelpUrl();
        GiftCardsHandler.access$000(GiftCardsHandler.this).startActivity(UriIntents.create(GiftCardsHandler.access$000(GiftCardsHandler.this), view));
    }

    ension()
    {
        this$0 = GiftCardsHandler.this;
        super();
    }
}
