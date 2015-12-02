// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.result.view;

import android.graphics.Bitmap;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.qihoo.security.ui.result.a;

// Referenced classes of package com.qihoo.security.ui.result.view:
//            AdvLoadingActivity

class a extends WebViewClient
{

    final AdvLoadingActivity a;

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        webview = com.qihoo.security.ui.result.view.AdvLoadingActivity.a(a).obtainMessage();
        webview.what = 1;
        webview.arg1 = i;
        webview.obj = s;
        com.qihoo.security.ui.result.view.AdvLoadingActivity.a(a).sendMessage(webview);
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
label0:
        {
            if (!TextUtils.isEmpty(s))
            {
                if (!com.qihoo.security.ui.result.a.a().a(s))
                {
                    break label0;
                }
                com.qihoo.security.ui.result.view.AdvLoadingActivity.a(a, s);
            }
            return true;
        }
        webview.loadUrl(s);
        return true;
    }

    (AdvLoadingActivity advloadingactivity)
    {
        a = advloadingactivity;
        super();
    }
}
