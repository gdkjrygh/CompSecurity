// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

// Referenced classes of package com.yume.android.player:
//            az

final class aD extends WebViewClient
{

    private az a;

    aD(az az1)
    {
        a = az1;
        super();
    }

    public final void onPageFinished(WebView webview, String s)
    {
        if (a.d != null)
        {
            a.d.setVisibility(4);
        }
        super.onPageFinished(webview, s);
    }

    public final void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        if (a.d != null)
        {
            a.d.setVisibility(0);
            if (a.b != null)
            {
                a.b.bringChildToFront(a.d);
            }
        }
        super.onPageStarted(webview, s, bitmap);
    }

    public final boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (az.a != null)
        {
            az.a.loadUrl(s);
        }
        return super.shouldOverrideUrlLoading(webview, s);
    }
}
