// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities.login;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.cardinalblue.android.piccollage.activities.login:
//            BaseLoginActivity

public class a extends WebViewClient
{

    final BaseLoginActivity a;

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        a.f();
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        a.e();
    }

    public (BaseLoginActivity baseloginactivity)
    {
        a = baseloginactivity;
        super();
    }
}
