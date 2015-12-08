// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.instagram;

import android.app.ProgressDialog;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.roidapp.cloudlib.instagram:
//            InstagramAuthActivity

final class d extends WebChromeClient
{

    final InstagramAuthActivity a;

    d(InstagramAuthActivity instagramauthactivity)
    {
        a = instagramauthactivity;
        super();
    }

    public final void onProgressChanged(WebView webview, int i)
    {
        if (i == 100 && InstagramAuthActivity.a(a) != null)
        {
            InstagramAuthActivity.a(a).dismiss();
        }
        super.onProgressChanged(webview, i);
    }
}
