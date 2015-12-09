// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.auth;

import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.cardinalblue.android.piccollage.auth:
//            PicEditAccountActivity

class a extends WebViewClient
{

    final PicEditAccountActivity a;

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (s.startsWith("cardinalblue://localhost/edited"))
        {
            a.setResult(-1);
            a.finish();
            return true;
        } else
        {
            return false;
        }
    }

    (PicEditAccountActivity piceditaccountactivity)
    {
        a = piceditaccountactivity;
        super();
    }
}
