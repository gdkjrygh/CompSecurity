// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.auth;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import com.cardinalblue.android.piccollage.a.c;
import com.cardinalblue.android.piccollage.a.f;
import com.cardinalblue.android.piccollage.activities.login.FbLoginForReadActivity;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.auth:
//            PicLoginActivity, PicAuth

class inActivity extends com.cardinalblue.android.piccollage.activities.login.
{

    final PicLoginActivity b;

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        webview = Uri.parse(s);
        if (webview != null && "/register".equals(webview.getPath()))
        {
            f.e(b);
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        Uri uri = Uri.parse(s);
        String s2 = uri.getPath();
        if (s2 == null)
        {
            f.a(new IllegalArgumentException((new StringBuilder()).append("url: ").append(s).toString()));
            return false;
        }
        if (s2.contains("/cb_authorize"))
        {
            String s1 = uri.getQueryParameter("cb_user_provenance");
            PicLoginActivity picloginactivity = b;
            webview = s1;
            if (s1 == null)
            {
                webview = "unknown";
            }
            PicLoginActivity.a(picloginactivity, webview);
        }
        if (s2.equals("/fb_connect"))
        {
            f.d(b);
        }
        if (s2.equals("/fb_connect"))
        {
            webview = uri.getQueryParameter("redirect_uri");
            s = uri.getQueryParameters("scope");
            if (s == null || s.size() == 0)
            {
                s = c.a;
            }
            s = new Intent(b.getApplicationContext(), com/cardinalblue/android/piccollage/activities/login/FbLoginForReadActivity);
            PicLoginActivity.b(b, webview);
            b.startActivityForResult(s, 701);
            return true;
        }
        if (s.startsWith("cardinalblue://localhost/cb_authorized"))
        {
            webview = uri.getQueryParameter("cb_access_token");
            PicLoginActivity.a(b).a(webview);
            PicLoginActivity.a(b).f();
            PicLoginActivity.a(b).j();
            return true;
        } else
        {
            return false;
        }
    }

    inActivity(PicLoginActivity picloginactivity)
    {
        b = picloginactivity;
        super(picloginactivity);
    }
}
