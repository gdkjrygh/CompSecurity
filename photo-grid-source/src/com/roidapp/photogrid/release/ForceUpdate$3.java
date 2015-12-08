// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.roidapp.photogrid.release:
//            bo

class a extends WebViewClient
{

    final Activity a;
    final bo b;

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (!s.contains("play.google.com"))
        {
            break MISSING_BLOCK_LABEL_81;
        }
        webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
        webview.setFlags(0x10000000);
        webview.setPackage("com.android.vending");
        a.startActivity(webview);
        return true;
        webview;
        s = new Intent("android.intent.action.VIEW", Uri.parse(s));
        s.setFlags(0x10000000);
        a.startActivity(s);
        webview.printStackTrace();
        return false;
    }

    (bo bo, Activity activity)
    {
        b = bo;
        a = activity;
        super();
    }
}
