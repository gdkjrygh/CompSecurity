// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.market;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.accuweather.android.utilities.Logger;
import com.accuweather.android.utilities.PartnerCoding;
import com.accuweather.android.utilities.PreferenceUtils;
import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.Tracker;

// Referenced classes of package com.accuweather.android.market:
//            Market

public class GooglePlayMarket extends Market
{

    public static final String GOOGLE_FREE_PACKAGE = "com.accuweather.android";
    public static final String GOOGLE_PLATINUM_PACKAGE = "com.accuweather.paid.android";

    public GooglePlayMarket()
    {
    }

    private String buildCampaignString(Context context, String s, String s1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("utm_source").append("%3D").append(s).append("%26");
        stringbuilder.append("utm_medium").append("%3D").append(getUtmMedium(context)).append("%26");
        stringbuilder.append("utm_campaign").append("%3D").append(s1);
        context = stringbuilder.toString();
        Logger.i(getClass().getName(), "campaign string is %s", new Object[] {
            context
        });
        return context;
    }

    private void trackAndroidLiteToFreeCampaign(Context context)
    {
        EasyTracker.getInstance().setContext(context);
        EasyTracker.getTracker().setCampaign(getLiteToFreeUpgradeCampaignString(context));
        PreferenceUtils.save(context, "upgraded_from_android_lite", false);
    }

    private boolean wasUpgradedFromAndroidLite(Context context)
    {
        return PreferenceUtils.get(context, "upgraded_from_android_lite", false);
    }

    public void captureLiteToFreeUpgrade(Context context)
    {
        if (wasUpgradedFromAndroidLite(context))
        {
            trackAndroidLiteToFreeCampaign(context);
        }
    }

    public final Uri getGooglePlatinumUri(Context context)
    {
        return Uri.parse((new StringBuilder()).append("market://details?id=com.accuweather.paid.android&referrer=").append(buildCampaignString(context, "inApp", "AccuWeatherforAndroid_InApp")).toString());
    }

    public String getLiteToFreeUpgradeCampaignString(Context context)
    {
        return buildCampaignString(context, "AndroidLite", "AndroidLiteCampaign");
    }

    protected String getUtmMedium(Context context)
    {
        return PartnerCoding.getPartnerCodeFromSharedPreferences(context);
    }

    public void goToFree(Context context)
    {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.accuweather.android"));
        intent.setFlags(0x10000000);
        context.startActivity(intent);
    }

    public void goToPlatinum(Context context)
    {
        context.startActivity(new Intent("android.intent.action.VIEW", getGooglePlatinumUri(context)));
    }
}
