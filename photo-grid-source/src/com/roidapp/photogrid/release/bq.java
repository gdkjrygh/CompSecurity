// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

// Referenced classes of package com.roidapp.photogrid.release:
//            bo

final class bq extends WebChromeClient
{

    final ProgressBar a;
    final bo b;

    bq(bo bo, ProgressBar progressbar)
    {
        b = bo;
        a = progressbar;
        super();
    }

    public final void onProgressChanged(WebView webview, int i)
    {
        if (i == 100)
        {
            a.setVisibility(8);
        }
    }
}
