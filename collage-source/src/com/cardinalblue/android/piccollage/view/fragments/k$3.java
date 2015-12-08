// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import uk.co.senab.photoview.PhotoView;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            k

class a extends WebViewClient
{

    final k a;

    public void onPageFinished(WebView webview, String s)
    {
        if (a.a.getVisibility() == 0)
        {
            a.a.setVisibility(4);
        }
        k.e(a).setVisibility(4);
        k.a(a).setOnTouchListener(k.f(a));
    }

    (k k1)
    {
        a = k1;
        super();
    }
}
