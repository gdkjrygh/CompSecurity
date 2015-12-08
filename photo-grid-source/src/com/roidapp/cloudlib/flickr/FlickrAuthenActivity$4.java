// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.flickr;

import android.app.ProgressDialog;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.googlecode.flickrjandroid.oauth.OAuth;
import com.googlecode.flickrjandroid.oauth.OAuthToken;
import com.roidapp.cloudlib.common.a;

// Referenced classes of package com.roidapp.cloudlib.flickr:
//            FlickrAuthenActivity, h

class a extends WebViewClient
{

    final FlickrAuthenActivity a;

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (!a.isFinishing()) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        webview = Uri.parse(s);
        if (!webview.getScheme().equalsIgnoreCase(com.roidapp.cloudlib.flickr.FlickrAuthenActivity.a))
        {
            break; /* Loop/switch isn't completed */
        }
        s = com.roidapp.cloudlib.common.a.h(a);
        if (s != null && s.getUser() != null)
        {
            break; /* Loop/switch isn't completed */
        }
        s = webview.getQuery().split("&");
        if (s == null || s.length != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        webview = s[0].substring(s[0].indexOf("=") + 1);
        s = s[1].substring(s[1].indexOf("=") + 1);
        (new StringBuilder("OAuth Token: ")).append(webview).append("; OAuth Verifier: ").append(s);
        OAuth oauth = com.roidapp.cloudlib.common.a.h(a);
        if (oauth != null && oauth.getToken() != null && oauth.getToken().getOauthTokenSecret() != null)
        {
            com.roidapp.cloudlib.flickr.FlickrAuthenActivity.a(a, new h(a));
            com.roidapp.cloudlib.flickr.FlickrAuthenActivity.a(a).execute(new String[] {
                webview, oauth.getToken().getOauthTokenSecret(), s
            });
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (FlickrAuthenActivity.b(a) != null)
        {
            FlickrAuthenActivity.b(a).show();
        }
        return false;
    }

    (FlickrAuthenActivity flickrauthenactivity)
    {
        a = flickrauthenactivity;
        super();
    }
}
