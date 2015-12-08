// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.util;

import android.app.Activity;
import android.widget.LinearLayout;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;

public class AdUtil
{

    public AdUtil()
    {
    }

    public static void showAD(final Activity adContainer)
    {
        AdView adview = new AdView(adContainer);
        adview.setAdUnitId("ca-app-pub-4949699850115085/3011788458");
        adview.setAdSize(AdSize.SMART_BANNER);
        com.google.android.gms.ads.AdRequest adrequest = (new com.google.android.gms.ads.AdRequest.Builder()).build();
        adContainer = (LinearLayout)adContainer.findViewById(0x7f0d0029);
        adContainer.addView(adview);
        adview.setAdListener(new AdListener() {

            private final LinearLayout val$adContainer;

            public void onAdLoaded()
            {
                adContainer.setVisibility(0);
            }

            
            {
                adContainer = linearlayout;
                super();
            }
        });
        adview.loadAd(adrequest);
    }
}
