// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.giftcard;

import com.google.android.apps.wallet.giftcard.api.GiftCardApi;
import com.google.android.apps.wallet.wobs.add.ProgramCardsAnalyticsProperties;

public final class GiftCardsAnalyticsProperties
    implements ProgramCardsAnalyticsProperties
{

    public GiftCardsAnalyticsProperties()
    {
    }

    public final String getCsiSaveTiming()
    {
        return "user_add_gift_card";
    }

    public final String getEditCardInfoFragmentScreen()
    {
        return "Add Gift Card";
    }

    public final String getGoogleAnalyticsSaveTiming()
    {
        return "AddGiftCard";
    }

    public final com.google.android.apps.wallet.wobs.add.api.AddWobsApi.ImageCaptureAnalyticsStrings getImageCaptureAnalyticsStrings()
    {
        return GiftCardApi.IMAGE_CAPTURE_ANALYTICS_STRINGS;
    }

    public final String getSaveEvent()
    {
        return "AddGiftCard";
    }

    public final String getSearchProgramsFragmentScreen()
    {
        return "Find Gift Card Merchant";
    }
}
