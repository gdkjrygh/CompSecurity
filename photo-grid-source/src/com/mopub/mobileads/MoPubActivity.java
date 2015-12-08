// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.mopub.common.AdReport;
import com.mopub.common.CreativeOrientation;
import com.mopub.common.util.DeviceUtils;
import com.mopub.mobileads.factories.HtmlInterstitialWebViewFactory;

// Referenced classes of package com.mopub.mobileads:
//            l, HtmlInterstitialWebView, t, EventForwardingBroadcastReceiver, 
//            n

public class MoPubActivity extends l
{

    private HtmlInterstitialWebView b;

    public MoPubActivity()
    {
    }

    static HtmlInterstitialWebView a(MoPubActivity mopubactivity)
    {
        return mopubactivity.b;
    }

    static void a(Context context, AdReport adreport, CustomEventInterstitial.CustomEventInterstitialListener customeventinterstitiallistener, String s)
    {
        context = HtmlInterstitialWebViewFactory.create(context, adreport, customeventinterstitiallistener, false, null, null);
        context.a(false);
        context.setWebViewClient(new _cls1(customeventinterstitiallistener));
        context.a(s);
    }

    public static void start(Context context, String s, AdReport adreport, boolean flag, String s1, String s2, CreativeOrientation creativeorientation, long l1)
    {
        Intent intent = new Intent(context, com/mopub/mobileads/MoPubActivity);
        intent.putExtra("Html-Response-Body", s);
        intent.putExtra("Scrollable", flag);
        intent.putExtra("Clickthrough-Url", s2);
        intent.putExtra("Redirect-Url", s1);
        intent.putExtra("broadcastIdentifier", l1);
        intent.putExtra("mopub-intent-ad-report", adreport);
        intent.putExtra("com_mopub_orientation", creativeorientation);
        intent.addFlags(0x10000000);
        try
        {
            context.startActivity(intent);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public View getAdView()
    {
        Object obj = getIntent();
        boolean flag = ((Intent) (obj)).getBooleanExtra("Scrollable", false);
        String s = ((Intent) (obj)).getStringExtra("Redirect-Url");
        String s1 = ((Intent) (obj)).getStringExtra("Clickthrough-Url");
        obj = ((Intent) (obj)).getStringExtra("Html-Response-Body");
        b = HtmlInterstitialWebViewFactory.create(getApplicationContext(), a, new t(this), flag, s, s1);
        b.a(((String) (obj)));
        return b;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent().getSerializableExtra("com_mopub_orientation");
        if (bundle == null || !(bundle instanceof CreativeOrientation))
        {
            bundle = CreativeOrientation.UNDEFINED;
        } else
        {
            bundle = (CreativeOrientation)bundle;
        }
        DeviceUtils.lockOrientation(this, bundle);
        EventForwardingBroadcastReceiver.a(this, a().longValue(), "com.mopub.action.interstitial.show");
    }

    protected void onDestroy()
    {
        b.loadUrl(n.WEB_VIEW_DID_CLOSE.b());
        b.destroy();
        EventForwardingBroadcastReceiver.a(this, a().longValue(), "com.mopub.action.interstitial.dismiss");
        super.onDestroy();
    }

    private class _cls1 extends WebViewClient
    {

        final CustomEventInterstitial.CustomEventInterstitialListener a;

        public final boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            if (!s.equals("mopub://finishLoad")) goto _L2; else goto _L1
_L1:
            a.onInterstitialLoaded();
_L4:
            return true;
_L2:
            if (s.equals("mopub://failLoad"))
            {
                a.onInterstitialFailed(null);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        _cls1(CustomEventInterstitial.CustomEventInterstitialListener customeventinterstitiallistener)
        {
            a = customeventinterstitiallistener;
            super();
        }
    }

}
