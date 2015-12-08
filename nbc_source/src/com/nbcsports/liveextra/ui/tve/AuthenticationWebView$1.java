// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.tve;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adobe.adobepass.accessenabler.api.AccessEnabler;
import java.net.URLDecoder;

// Referenced classes of package com.nbcsports.liveextra.ui.tve:
//            AuthenticationWebView

class this._cls0 extends WebViewClient
{

    final AuthenticationWebView this$0;

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (s.equals(URLDecoder.decode(AccessEnabler.ADOBEPASS_REDIRECT_URL)))
        {
            AuthenticationWebView.access$000(AuthenticationWebView.this).onComplete();
            setVisibility(8);
            return true;
        } else
        {
            return false;
        }
    }

    llback()
    {
        this$0 = AuthenticationWebView.this;
        super();
    }
}
