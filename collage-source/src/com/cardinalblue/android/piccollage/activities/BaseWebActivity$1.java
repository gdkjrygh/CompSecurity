// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseWebActivity

class a extends WebChromeClient
{

    final BaseWebActivity a;

    public void onProgressChanged(WebView webview, int i)
    {
        a.setProgress(i * 100);
        if (i == 100)
        {
            a.a.setVisibility(8);
        }
    }

    (BaseWebActivity basewebactivity)
    {
        a = basewebactivity;
        super();
    }
}
