// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;

// Referenced classes of package com.mopub.mobileads:
//            MoPubErrorCode

public class EventForwardingBroadcastReceiver extends BroadcastReceiver
{

    public static final String ACTION_INTERSTITIAL_CLICK = "com.mopub.action.interstitial.click";
    public static final String ACTION_INTERSTITIAL_DISMISS = "com.mopub.action.interstitial.dismiss";
    public static final String ACTION_INTERSTITIAL_FAIL = "com.mopub.action.interstitial.fail";
    public static final String ACTION_INTERSTITIAL_SHOW = "com.mopub.action.interstitial.show";
    private static IntentFilter d;
    private final CustomEventInterstitial.CustomEventInterstitialListener a;
    private final long b;
    private Context c;

    public EventForwardingBroadcastReceiver(CustomEventInterstitial.CustomEventInterstitialListener customeventinterstitiallistener, long l)
    {
        a = customeventinterstitiallistener;
        b = l;
        d = getHtmlInterstitialIntentFilter();
    }

    static void a(Context context, long l, String s)
    {
        s = new Intent(s);
        s.putExtra("broadcastIdentifier", l);
        LocalBroadcastManager.getInstance(context.getApplicationContext()).sendBroadcast(s);
    }

    public static IntentFilter getHtmlInterstitialIntentFilter()
    {
        if (d == null)
        {
            IntentFilter intentfilter = new IntentFilter();
            d = intentfilter;
            intentfilter.addAction("com.mopub.action.interstitial.fail");
            d.addAction("com.mopub.action.interstitial.show");
            d.addAction("com.mopub.action.interstitial.dismiss");
            d.addAction("com.mopub.action.interstitial.click");
        }
        return d;
    }

    public void onReceive(Context context, Intent intent)
    {
        long l;
        if (a != null)
        {
            if (b == (l = intent.getLongExtra("broadcastIdentifier", -1L)))
            {
                context = intent.getAction();
                if ("com.mopub.action.interstitial.fail".equals(context))
                {
                    a.onInterstitialFailed(MoPubErrorCode.NETWORK_INVALID_STATE);
                    return;
                }
                if ("com.mopub.action.interstitial.show".equals(context))
                {
                    a.onInterstitialShown();
                    return;
                }
                if ("com.mopub.action.interstitial.dismiss".equals(context))
                {
                    a.onInterstitialDismissed();
                    unregister();
                    return;
                }
                if ("com.mopub.action.interstitial.click".equals(context))
                {
                    a.onInterstitialClicked();
                    return;
                }
            }
        }
    }

    public void register(Context context)
    {
        c = context;
        LocalBroadcastManager.getInstance(c).registerReceiver(this, d);
    }

    public void unregister()
    {
        if (c != null)
        {
            LocalBroadcastManager.getInstance(c).unregisterReceiver(this);
            c = null;
        }
    }
}
