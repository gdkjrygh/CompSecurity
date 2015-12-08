// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.soundcloud.android.main:
//            WebViewActivity

class this._cls0 extends WebViewClient
{

    final WebViewActivity this$0;

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        return false;
    }

    ()
    {
        this$0 = WebViewActivity.this;
        super();
    }
}
