// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.adapters;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.facebook.ads.AdError;

// Referenced classes of package com.facebook.ads.internal.adapters:
//            InterstitialAdapterListener, InterstitialAdapter

public class d extends BroadcastReceiver
{

    private String a;
    private Context b;
    private InterstitialAdapterListener c;
    private InterstitialAdapter d;

    public d(Context context, String s, InterstitialAdapter interstitialadapter, InterstitialAdapterListener interstitialadapterlistener)
    {
        b = context;
        a = s;
        c = interstitialadapterlistener;
        d = interstitialadapter;
    }

    public void a()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction((new StringBuilder()).append("com.facebook.ads.interstitial.impression.logged:").append(a).toString());
        intentfilter.addAction((new StringBuilder()).append("com.facebook.ads.interstitial.displayed:").append(a).toString());
        intentfilter.addAction((new StringBuilder()).append("com.facebook.ads.interstitial.dismissed:").append(a).toString());
        intentfilter.addAction((new StringBuilder()).append("com.facebook.ads.interstitial.clicked:").append(a).toString());
        intentfilter.addAction((new StringBuilder()).append("com.facebook.ads.interstitial.error:").append(a).toString());
        LocalBroadcastManager.getInstance(b).registerReceiver(this, intentfilter);
    }

    public void b()
    {
        try
        {
            LocalBroadcastManager.getInstance(b).unregisterReceiver(this);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction().split(":")[0];
        if (c != null && context != null)
        {
            if ("com.facebook.ads.interstitial.clicked".equals(context))
            {
                context = intent.getStringExtra("com.facebook.ads.interstitial.ad.click.url");
                boolean flag = intent.getBooleanExtra("com.facebook.ads.interstitial.ad.player.handles.click", true);
                c.onInterstitialAdClicked(d, context, flag);
                return;
            }
            if ("com.facebook.ads.interstitial.dismissed".equals(context))
            {
                c.onInterstitialAdDismissed(d);
                return;
            }
            if ("com.facebook.ads.interstitial.displayed".equals(context))
            {
                c.onInterstitialAdDisplayed(d);
                return;
            }
            if ("com.facebook.ads.interstitial.impression.logged".equals(context))
            {
                c.onInterstitialLoggingImpression(d);
                return;
            }
            if ("com.facebook.ads.interstitial.error".equals(context))
            {
                c.onInterstitialError(d, AdError.INTERNAL_ERROR);
                return;
            }
        }
    }
}
