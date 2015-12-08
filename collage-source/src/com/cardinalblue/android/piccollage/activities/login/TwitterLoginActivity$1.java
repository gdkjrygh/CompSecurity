// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities.login;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;

// Referenced classes of package com.cardinalblue.android.piccollage.activities.login:
//            TwitterLoginActivity

class it> extends it>
{

    final TwitterLoginActivity b;

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (s.startsWith("cardinalblue:///"))
        {
            webview = Uri.parse(s);
            if (!TextUtils.isEmpty(webview.getQueryParameter("denied")))
            {
                b.finish();
                return true;
            } else
            {
                TwitterLoginActivity.a(b, new <init>(b, null));
                TwitterLoginActivity.a(b).execute(new Uri[] {
                    webview
                });
                return true;
            }
        } else
        {
            return false;
        }
    }

    Q(TwitterLoginActivity twitterloginactivity)
    {
        b = twitterloginactivity;
        super(twitterloginactivity);
    }
}
