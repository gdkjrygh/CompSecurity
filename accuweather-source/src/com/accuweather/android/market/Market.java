// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.market;

import android.content.Context;
import com.accuweather.android.utilities.Constants;
import com.accuweather.android.utilities.PartnerCoding;
import java.util.ArrayList;

public abstract class Market
{

    public Market()
    {
    }

    public abstract void goToFree(Context context);

    public abstract void goToPlatinum(Context context);

    public boolean isMarketAvailable(Context context)
    {
        return true;
    }

    protected boolean isNonMarketPartner(Context context)
    {
        context = PartnerCoding.getPartnerCodeFromSharedPreferences(context);
        return Constants.NON_MARKET_PARTNERS.contains(context);
    }

    public boolean isPaidPackage(Context context)
    {
        return context.getPackageName().contains("paid");
    }

    public void rate(Context context)
    {
        if (isPaidPackage(context))
        {
            goToPlatinum(context);
            return;
        } else
        {
            goToFree(context);
            return;
        }
    }

    public boolean shouldShowRateOrUpgrade(Context context)
    {
        if (isNonMarketPartner(context))
        {
            return false;
        } else
        {
            return isMarketAvailable(context);
        }
    }
}
