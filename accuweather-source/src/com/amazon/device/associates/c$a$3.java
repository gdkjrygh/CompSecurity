// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.TextView;

// Referenced classes of package com.amazon.device.associates:
//            c

class t> extends WebChromeClient
{

    final ty a;

    public void onProgressChanged(WebView webview, int i)
    {
        t>(a).setProgress(i);
        if (i == 100)
        {
            ess(a).setVisibility(8);
            ility(a).setVisibility(8);
        }
    }

    ( )
    {
        a = ;
        super();
    }
}
