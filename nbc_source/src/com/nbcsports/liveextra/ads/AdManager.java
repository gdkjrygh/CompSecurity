// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ads;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherAdView;
import com.google.android.gms.ads.mediation.admob.AdMobExtras;
import com.phunware.nbc.sochi.system.NBCSystem;

public class AdManager
{

    public static final AdSize PHONE_AD_SIZES[] = {
        new AdSize(320, 50), new AdSize(300, 50)
    };
    public static final AdSize TABLET_AD_SIZES[] = {
        new AdSize(728, 90)
    };

    public AdManager()
    {
    }

    public PublisherAdRequest getAdRequest()
    {
        Object obj;
        Bundle bundle;
        if (NBCSystem.IS_TAB)
        {
            obj = "androidtab";
        } else
        {
            obj = "android";
        }
        bundle = new Bundle();
        bundle.putString("app", "live");
        bundle.putString("type", ((String) (obj)));
        obj = new AdMobExtras(bundle);
        return (new com.google.android.gms.ads.doubleclick.PublisherAdRequest.Builder()).addNetworkExtras(((com.google.android.gms.ads.mediation.NetworkExtras) (obj))).build();
    }

    public PublisherAdView getAdView(Activity activity, String s)
    {
        AdSize aadsize[];
        String s1;
        String s2;
        if (NBCSystem.IS_TAB)
        {
            aadsize = TABLET_AD_SIZES;
        } else
        {
            aadsize = PHONE_AD_SIZES;
        }
        if (NBCSystem.IS_TAB)
        {
            s1 = "/androidTab/";
        } else
        {
            s1 = "/android/";
        }
        s2 = s;
        if ("premier-league".equalsIgnoreCase(s))
        {
            s2 = "premier_league";
        }
        s = (new StringBuilder()).append(activity.getString(0x7f070045)).append(s1).append(s2).toString();
        activity = new PublisherAdView(activity);
        activity.setAdUnitId(s);
        activity.setAdSizes(aadsize);
        return activity;
    }

}
