// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.threedsecure;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.braintreepayments.api.internal.HttpRequest;

// Referenced classes of package com.braintreepayments.api.threedsecure:
//            ThreeDSecureWebChromeClient, ThreeDSecureWebViewClient, ThreeDSecureWebViewActivity

public class ThreeDSecureWebView extends WebView
{

    public ThreeDSecureWebView(Context context)
    {
        super(context);
    }

    public ThreeDSecureWebView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ThreeDSecureWebView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected final void a(ThreeDSecureWebViewActivity threedsecurewebviewactivity)
    {
        setId(0x1020018);
        WebSettings websettings = getSettings();
        websettings.setUserAgentString(HttpRequest.a());
        websettings.setCacheMode(1);
        websettings.setSupportMultipleWindows(true);
        websettings.setJavaScriptEnabled(true);
        websettings.setBuiltInZoomControls(true);
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            websettings.setDisplayZoomControls(false);
        }
        setWebChromeClient(new ThreeDSecureWebChromeClient(threedsecurewebviewactivity));
        setWebViewClient(new ThreeDSecureWebViewClient(threedsecurewebviewactivity));
    }
}
