// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.market;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;

// Referenced classes of package com.accuweather.android.market:
//            AmazonMarket, BarnesAndNobleMarket, GooglePlayMarket, MobirooMarket, 
//            NoMarket, Market

public class MarketFactory
{

    public MarketFactory()
    {
    }

    public static Market getMarket(Context context)
    {
        if (isAmazonPackage(context))
        {
            return new AmazonMarket();
        }
        if (isBarnesAndNoblePackage(context))
        {
            return new BarnesAndNobleMarket();
        }
        if (hasGooglePlay(context))
        {
            return new GooglePlayMarket();
        }
        if (isMobirooMarket(context))
        {
            return new MobirooMarket();
        } else
        {
            return new NoMarket();
        }
    }

    private static boolean hasGooglePlay(Context context)
    {
        return isGooglePackage(context) && isGooglePlayAvailable(context);
    }

    private static boolean isAmazonPackage(Context context)
    {
        return context.getPackageName().contains("amazon");
    }

    private static boolean isBarnesAndNoblePackage(Context context)
    {
        return context.getPackageName().contains("bn");
    }

    private static boolean isGooglePackage(Context context)
    {
        return context.getPackageName().contains("com.accuweather.android") || context.getPackageName().contains("com.accuweather.paid.android");
    }

    private static boolean isGooglePlayAvailable(Context context)
    {
        return GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0;
    }

    private static boolean isMobirooMarket(Context context)
    {
        return context.getPackageName().contains("mobiroo");
    }
}
