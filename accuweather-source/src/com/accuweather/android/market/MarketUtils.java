// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.market;

import android.content.Context;

// Referenced classes of package com.accuweather.android.market:
//            MarketFactory, GooglePlayMarket, Market

public class MarketUtils
{

    public MarketUtils()
    {
    }

    public static void captureAppUpgradeIfApplicable(Context context)
    {
        Market market = MarketFactory.getMarket(context);
        if (market instanceof GooglePlayMarket)
        {
            ((GooglePlayMarket)market).captureLiteToFreeUpgrade(context);
        }
    }

    public static void goToFreeVersion(Context context)
    {
        MarketFactory.getMarket(context).goToFree(context);
    }

    public static void goToPlatinumVersion(Context context)
    {
        MarketFactory.getMarket(context).goToPlatinum(context);
    }

    public static void rateThisApp(Context context)
    {
        MarketFactory.getMarket(context).rate(context);
    }

    public static boolean shouldShowRateOrUpgrade(Context context)
    {
        return MarketFactory.getMarket(context).shouldShowRateOrUpgrade(context);
    }
}
