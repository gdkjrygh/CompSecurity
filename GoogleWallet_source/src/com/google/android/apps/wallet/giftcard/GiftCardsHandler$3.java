// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;

// Referenced classes of package com.google.android.apps.wallet.giftcard:
//            GiftCardsHandler, GiftCardHelpDialogFragment, GiftCardInfo

final class val.cardInfo
    implements android.view.r
{

    final GiftCardsHandler this$0;
    final GiftCardInfo val$cardInfo;

    public final void onClick(View view)
    {
        analyticsUtil.sendLinkTap("GiftCardNumbersHelp", new AnalyticsCustomDimension[0]);
        ((GiftCardHelpDialogFragment)GiftCardHelpDialogFragment.newBuilder().setPrompts(val$cardInfo.getAllPrompts()).build()).show(GiftCardsHandler.access$000(GiftCardsHandler.this).getSupportFragmentManager());
    }

    ragment.Builder()
    {
        this$0 = final_giftcardshandler;
        val$cardInfo = GiftCardInfo.this;
        super();
    }
}
