// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings;

import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.snapchat.android.fragments.settings:
//            WebFragment

final class a extends WebChromeClient
{

    private WebFragment a;

    public final void onProgressChanged(WebView webview, int i)
    {
        if (WebFragment.a(a) != null)
        {
            webview = WebFragment.a(a);
            if (i < 100)
            {
                i = 0;
            } else
            {
                i = 8;
            }
            webview.setVisibility(i);
        }
    }

    (WebFragment webfragment)
    {
        a = webfragment;
        super();
    }
}
