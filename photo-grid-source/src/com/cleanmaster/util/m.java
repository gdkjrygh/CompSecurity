// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.util;

import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.cleanmaster.util:
//            l

class m extends WebViewClient
{

    final l a;

    m(l l1)
    {
        a = l1;
        super();
    }

    public void onPageFinished(WebView webview, String s)
    {
        l.b(a).loadUrl((new StringBuilder("javascript:try{")).append(l.a(a)).append("recordEvent(8)}catch(e){alert(e)}").toString());
        super.onPageFinished(webview, s);
    }
}
