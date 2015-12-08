// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.roidapp.baselib.c.an;
import com.roidapp.cloudlib.at;

// Referenced classes of package com.roidapp.cloudlib.ads:
//            b

final class  extends WebViewClient
{

    final Activity a;
    final View b;
    final AlertDialog c;

    public final void onPageFinished(WebView webview, String s)
    {
        if (a != null && !a.isFinishing() && b != null && b.getVisibility() == 0)
        {
            b.setVisibility(8);
        }
    }

    public final void onReceivedError(WebView webview, int i, String s, String s1)
    {
        if (a != null && !a.isFinishing())
        {
            an.a(a, a.getString(at.e));
            c.dismiss();
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (a != null && !a.isFinishing() && s != null && !s.equals(webview.getUrl()))
        {
            com.roidapp.cloudlib.ads.b.a(a, s);
        }
        return true;
    }

    (Activity activity, View view, AlertDialog alertdialog)
    {
        a = activity;
        b = view;
        c = alertdialog;
        super();
    }
}
