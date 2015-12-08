// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.roidapp.baselib.c.n;

// Referenced classes of package com.roidapp.photogrid.release:
//            More

class a extends WebViewClient
{

    final More a;

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        if (s.startsWith("market://"))
        {
            s.substring(s.indexOf("?id=") + 4, s.lastIndexOf("http://"));
            a.go(s);
        } else
        if (n.a(a, "com.android.vending") && s.contains("play.google"))
        {
            a.b(s);
        } else
        {
            a.a(s);
        }
        return true;
    }

    (More more)
    {
        a = more;
        super();
    }
}
