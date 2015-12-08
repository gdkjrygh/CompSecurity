// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.mopub.common.AdReport;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mraid.MraidController;
import com.mopub.mraid.MraidWebViewDebugListener;
import com.mopub.mraid.PlacementType;

// Referenced classes of package com.mopub.mobileads:
//            l, BaseWebView, aj, ak, 
//            EventForwardingBroadcastReceiver

public class MraidActivity extends l
{

    private MraidController b;
    private MraidWebViewDebugListener c;

    public MraidActivity()
    {
    }

    static MraidController a(MraidActivity mraidactivity)
    {
        return mraidactivity.b;
    }

    public static void preRenderHtml(Context context, CustomEventInterstitial.CustomEventInterstitialListener customeventinterstitiallistener, String s)
    {
        context = new BaseWebView(context);
        context.a(false);
        context.setWebViewClient(new _cls1(customeventinterstitiallistener));
        context.loadDataWithBaseURL(null, s, "text/html", "UTF-8", null);
    }

    public static void start(Context context, AdReport adreport, String s, long l1)
    {
        Intent intent = new Intent(context, com/mopub/mobileads/MraidActivity);
        intent.putExtra("Html-Response-Body", s);
        intent.putExtra("broadcastIdentifier", l1);
        intent.putExtra("mopub-intent-ad-report", adreport);
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
        String s = getIntent().getStringExtra("Html-Response-Body");
        if (s == null)
        {
            MoPubLog.w("MraidActivity received a null HTML body. Finishing the activity.");
            finish();
            return new View(this);
        } else
        {
            b = new MraidController(this, a, PlacementType.INTERSTITIAL);
            b.setDebugListener(c);
            b.setMraidListener(new aj(this));
            b.setUseCustomCloseListener(new ak(this));
            b.loadContent(s);
            return b.getAdContainer();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        EventForwardingBroadcastReceiver.a(this, a().longValue(), "com.mopub.action.interstitial.show");
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            getWindow().setFlags(0x1000000, 0x1000000);
        }
    }

    protected void onDestroy()
    {
        if (b != null)
        {
            b.destroy();
        }
        EventForwardingBroadcastReceiver.a(this, a().longValue(), "com.mopub.action.interstitial.dismiss");
        super.onDestroy();
    }

    protected void onPause()
    {
        if (b != null)
        {
            b.pause(isFinishing());
        }
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
        if (b != null)
        {
            b.resume();
        }
    }

    public void setDebugListener(MraidWebViewDebugListener mraidwebviewdebuglistener)
    {
        c = mraidwebviewdebuglistener;
        if (b != null)
        {
            b.setDebugListener(mraidwebviewdebuglistener);
        }
    }

    private class _cls1 extends WebViewClient
    {

        final CustomEventInterstitial.CustomEventInterstitialListener a;

        public final void onPageFinished(WebView webview, String s)
        {
            a.onInterstitialLoaded();
        }

        public final void onReceivedError(WebView webview, int i, String s, String s1)
        {
            super.onReceivedError(webview, i, s, s1);
            a.onInterstitialFailed(MoPubErrorCode.MRAID_LOAD_ERROR);
        }

        public final boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            return true;
        }

        _cls1(CustomEventInterstitial.CustomEventInterstitialListener customeventinterstitiallistener)
        {
            a = customeventinterstitiallistener;
            super();
        }
    }

}
