// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.loader;

import android.util.Log;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.mobvista.sdk.m.core.loader:
//            n

final class q extends WebChromeClient
{

    final n a;

    q(n n1)
    {
        a = n1;
        super();
    }

    public final void onProgressChanged(WebView webview, int i)
    {
        if (i == 100)
        {
            Log.i(n.a(), (new StringBuilder("\u52A0\u8F7D\u9875\u9762-\u8FDB\u5EA6\u5B8C\u6210\uFF1A")).append(webview.getUrl()).toString());
            if (!n.b(a) && !a.b)
            {
                n.j(a);
            }
            if (n.d(a) != null)
            {
                n.d(a);
                webview.getUrl();
            }
        }
    }
}
