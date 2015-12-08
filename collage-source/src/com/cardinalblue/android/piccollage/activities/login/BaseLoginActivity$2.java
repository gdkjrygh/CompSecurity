// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities.login;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.cardinalblue.android.piccollage.activities.login:
//            BaseLoginActivity

class a extends WebChromeClient
{

    final BaseLoginActivity a;

    public void onProgressChanged(WebView webview, int i)
    {
        a.setProgress(i * 100);
    }

    (BaseLoginActivity baseloginactivity)
    {
        a = baseloginactivity;
        super();
    }
}
