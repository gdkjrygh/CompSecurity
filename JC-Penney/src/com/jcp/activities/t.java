// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.jcp.activities:
//            InAppPromoActivity

class t extends WebViewClient
{

    final InAppPromoActivity a;

    t(InAppPromoActivity inapppromoactivity)
    {
        a = inapppromoactivity;
        super();
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        return false;
    }
}
