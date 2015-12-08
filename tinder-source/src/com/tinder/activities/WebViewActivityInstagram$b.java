// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.tinder.utils.v;

// Referenced classes of package com.tinder.activities:
//            WebViewActivityInstagram

private final class b extends WebViewClient
{

    final WebViewActivityInstagram a;
    private a b;

    public final void onReceivedError(WebView webview, int i, String s, String s1)
    {
        super.onReceivedError(webview, i, s, s1);
        v.b(String.format("onReceivedError errorCode:[%s], description:[%s], failigUrl[%s]", new Object[] {
            Integer.valueOf(i), s, s1
        }));
        a.finish();
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        int i = 0;
        boolean flag = false;
        webview = Uri.parse(s);
        if (s.startsWith(WebViewActivityInstagram.b(a)))
        {
            s = webview.getQueryParameter("code");
            if (!TextUtils.isEmpty(s))
            {
                b.a(s);
            } else
            {
                s = webview.getQueryParameter("status");
                if (!TextUtils.isEmpty(s))
                {
                    i = Integer.parseInt(s);
                }
                s = webview.getQueryParameter("error");
                String s1 = webview.getQueryParameter("errorReason");
                webview = webview.getQueryParameter("errorDescription");
                webview = (new com.tinder.model.<init>(s)).ErrorReason(s1).ErrorDescription(webview).StatusCode(i).build();
                b.a(webview);
            }
            flag = true;
        }
        return flag;
    }

    public (WebViewActivityInstagram webviewactivityinstagram,  )
    {
        a = webviewactivityinstagram;
        super();
        b = ;
    }
}
