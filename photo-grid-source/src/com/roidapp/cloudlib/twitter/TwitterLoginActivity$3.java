// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.twitter;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.roidapp.cloudlib.twitter:
//            a, f, TwitterLoginActivity

class a extends WebViewClient
{

    final TwitterLoginActivity a;

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (!s.startsWith(a.i))
        {
            return false;
        }
        webview = Uri.parse(s);
        if (TextUtils.isEmpty(webview.getQueryParameter("denied")))
        {
            TwitterLoginActivity.a(a, new f(a, (byte)0));
            TwitterLoginActivity.a(a).execute(new Uri[] {
                webview
            });
            return true;
        } else
        {
            a.finish();
            return true;
        }
    }

    _cls9(TwitterLoginActivity twitterloginactivity)
    {
        a = twitterloginactivity;
        super();
    }
}
