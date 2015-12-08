// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.instagram;

import android.app.ProgressDialog;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.roidapp.cloudlib.al;

// Referenced classes of package com.roidapp.cloudlib.instagram:
//            InstagramAuthActivity, h, a

class <init> extends WebViewClient
{

    final InstagramAuthActivity a;

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (a.isFinishing())
        {
            return true;
        }
        if (Uri.parse(s).getScheme().equalsIgnoreCase(((h)al.g().b("Instagram")).h) && s.indexOf("code=") != -1)
        {
            webview = s.split("code=")[1];
            InstagramAuthActivity.a(a, webview);
            if (InstagramAuthActivity.a(a) != null)
            {
                InstagramAuthActivity.a(a).show();
            }
            (new Thread(InstagramAuthActivity.b(a))).start();
            return true;
        } else
        {
            return super.shouldOverrideUrlLoading(webview, s);
        }
    }

    private (InstagramAuthActivity instagramauthactivity)
    {
        a = instagramauthactivity;
        super();
    }

    a(InstagramAuthActivity instagramauthactivity, a a1)
    {
        this(instagramauthactivity);
    }
}
