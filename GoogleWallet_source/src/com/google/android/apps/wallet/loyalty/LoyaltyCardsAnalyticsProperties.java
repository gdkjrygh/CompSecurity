// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import com.google.android.apps.wallet.loyalty.api.LoyaltyApi;
import com.google.android.apps.wallet.wobs.add.ProgramCardsAnalyticsProperties;

public final class LoyaltyCardsAnalyticsProperties
    implements ProgramCardsAnalyticsProperties
{

    private boolean isSignup;

    public LoyaltyCardsAnalyticsProperties()
    {
    }

    public final String getCsiSaveTiming()
    {
        return "user_add_loyalty_card";
    }

    public final String getEditCardInfoFragmentScreen()
    {
        if (isSignup)
        {
            return "Join Loyalty Program";
        } else
        {
            return "Add Loyalty Program";
        }
    }

    public final String getGoogleAnalyticsSaveTiming()
    {
        return "AddLoyaltyProgram";
    }

    public final com.google.android.apps.wallet.wobs.add.api.AddWobsApi.ImageCaptureAnalyticsStrings getImageCaptureAnalyticsStrings()
    {
        return LoyaltyApi.IMAGE_CAPTURE_ANALYTICS_STRINGS;
    }

    public final String getSaveEvent()
    {
        return "AddLoyaltyProgram";
    }

    public final String getSearchProgramsFragmentScreen()
    {
        return "Loyalty Program Search";
    }

    final void setIsSignup(boolean flag)
    {
        isSignup = flag;
    }
}
