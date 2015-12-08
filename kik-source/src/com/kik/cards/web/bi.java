// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web;

import android.webkit.WebView;
import com.kik.g.s;
import java.util.concurrent.Callable;

// Referenced classes of package com.kik.cards.web:
//            WebViewBrowserMetadataPlugin

final class bi
    implements Callable
{

    final String a;
    final String b;
    final WebViewBrowserMetadataPlugin c;

    bi(WebViewBrowserMetadataPlugin webviewbrowsermetadataplugin, String s1, String s2)
    {
        c = webviewbrowsermetadataplugin;
        a = s1;
        b = s2;
        super();
    }

    public final Object call()
    {
        return s.a(new av.a(WebViewBrowserMetadataPlugin.b(c).getTitle(), WebViewBrowserMetadataPlugin.b(c).getUrl(), null, "article", WebViewBrowserMetadataPlugin.b(c).getUrl(), WebViewBrowserMetadataPlugin.b(c).getTitle(), null, a, b));
    }
}
