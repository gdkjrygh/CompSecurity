// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            dr, ds

private class <init> extends WebChromeClient
{

    final dr a;

    public void onHideCustomView()
    {
        dr.e(a);
    }

    public void onProgressChanged(WebView webview, int i)
    {
        super.onProgressChanged(webview, i);
        if (i == 100 && a.b != null)
        {
            a.b.a();
        }
    }

    public void onShowCustomView(View view, android.webkit.romeClient.CustomViewCallback customviewcallback)
    {
        if (dr.a(a) != null)
        {
            customviewcallback.onCustomViewHidden();
            return;
        }
        android.widget.VideoView videoview = dr.a(a, view);
        if (videoview != null)
        {
            dr.a(a, videoview);
        }
        dr.b(a).setVisibility(8);
        dr.c(a).addView(view, new android.widget.Layout.LayoutParams(-1, -1));
        dr.b(a, view);
        dr.a(a, customviewcallback);
        dr.c(a).setVisibility(0);
        dr.d(a);
    }

    private Callback(dr dr1)
    {
        a = dr1;
        super();
    }

    a(dr dr1, ds ds)
    {
        this(dr1);
    }
}
