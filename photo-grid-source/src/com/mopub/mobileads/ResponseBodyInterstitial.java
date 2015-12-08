// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.Context;
import com.mopub.common.AdReport;
import com.mopub.common.logging.MoPubLog;
import java.util.Map;

// Referenced classes of package com.mopub.mobileads:
//            CustomEventInterstitial, MoPubErrorCode, EventForwardingBroadcastReceiver

public abstract class ResponseBodyInterstitial extends CustomEventInterstitial
{

    protected Context a;
    protected AdReport b;
    protected long c;
    private EventForwardingBroadcastReceiver d;

    public ResponseBodyInterstitial()
    {
    }

    protected abstract void a(CustomEventInterstitial.CustomEventInterstitialListener customeventinterstitiallistener);

    protected abstract void a(Map map);

    public void loadInterstitial(Context context, CustomEventInterstitial.CustomEventInterstitialListener customeventinterstitiallistener, Map map, Map map1)
    {
        a = context;
        if (!map1.containsKey("Html-Response-Body"))
        {
            break MISSING_BLOCK_LABEL_69;
        }
        a(map1);
        b = (AdReport)map.get("mopub-intent-ad-report");
        map = (Long)map.get("broadcastIdentifier");
        if (map == null)
        {
            try
            {
                MoPubLog.e("Broadcast Identifier was not set in localExtras");
                customeventinterstitiallistener.onInterstitialFailed(MoPubErrorCode.INTERNAL_ERROR);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                MoPubLog.e("LocalExtras contained an incorrect type.");
            }
            break MISSING_BLOCK_LABEL_123;
        }
        break MISSING_BLOCK_LABEL_79;
        customeventinterstitiallistener.onInterstitialFailed(MoPubErrorCode.NETWORK_INVALID_STATE);
        return;
        c = map.longValue();
        d = new EventForwardingBroadcastReceiver(customeventinterstitiallistener, c);
        d.register(context);
        a(customeventinterstitiallistener);
        return;
        customeventinterstitiallistener.onInterstitialFailed(MoPubErrorCode.INTERNAL_ERROR);
        return;
    }

    public void onInvalidate()
    {
        if (d != null)
        {
            d.unregister();
        }
    }

    public abstract void showInterstitial();
}
