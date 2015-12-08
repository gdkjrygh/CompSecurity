// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            LinkActivity

private class <init> extends WebViewClient
{

    final LinkActivity this$0;

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (s.equalsIgnoreCase(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getTermsandConditionUrl()))
        {
            LinkActivity.access$102(LinkActivity.this, getResources().getString(0x7f0804fd));
            webview.loadUrl(s);
            setUpActionBar();
            return true;
        }
        if (s.equalsIgnoreCase(KohlsPhoneApplication.getInstance().getAuthenticationUtils().getFaqUrl()))
        {
            LinkActivity.access$102(LinkActivity.this, getResources().getString(0x7f080200));
            webview.loadUrl(s);
            setUpActionBar();
            return true;
        } else
        {
            hideActionBar();
            webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
            startActivity(webview);
            return true;
        }
    }

    private ()
    {
        this$0 = LinkActivity.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
