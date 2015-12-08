// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            gr, dm, gm, go, 
//            gp, gn, ea

class gl extends WebViewClient
{

    final gr a;
    final Dialog b;
    final dm c;
    final Activity d;
    final gj.a e;
    final String f;
    final ea g;

    public gl(gr gr1, Dialog dialog, dm dm1, Activity activity, gj.a a1, String s, ea ea)
    {
        a = gr1;
        b = dialog;
        c = dm1;
        d = activity;
        e = a1;
        f = s;
        g = ea;
        super();
    }

    public void onPageFinished(WebView webview, String s)
    {
        while (a.a || s.compareTo("https://api.twitter.com/oauth/authorize") == 0 || b.isShowing()) 
        {
            return;
        }
        c.hide();
        b.setContentView(a, new android.view.ViewGroup.LayoutParams(-2, -2));
        b.show();
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        if (a.a)
        {
            return;
        } else
        {
            d.runOnUiThread(new gm(this));
            return;
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        while (a.a || a.b) 
        {
            return true;
        }
        if (s.startsWith("oauth"))
        {
            a.b = true;
            webview = Uri.parse(s);
            if (webview.getQueryParameter("denied") != null)
            {
                e.a(-1, "");
                d.runOnUiThread(new go(this));
                return true;
            } else
            {
                d.runOnUiThread(new gp(this));
                (new gn(this, webview)).execute(new Void[0]);
                return true;
            }
        } else
        {
            return super.shouldOverrideUrlLoading(webview, s);
        }
    }
}
