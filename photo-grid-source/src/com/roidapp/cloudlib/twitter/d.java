// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.twitter;

import android.app.ProgressDialog;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.roidapp.cloudlib.twitter:
//            TwitterLoginActivity

final class d extends WebChromeClient
{

    final TwitterLoginActivity a;

    d(TwitterLoginActivity twitterloginactivity)
    {
        a = twitterloginactivity;
        super();
    }

    public final void onProgressChanged(WebView webview, int i)
    {
        if (i == 100 && a.a != null)
        {
            a.a.dismiss();
        }
    }
}
