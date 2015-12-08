// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            el

final class b
    implements Runnable
{

    final String a;
    final String b;
    final el c;

    public final void run()
    {
        WebView webview = c.a();
        webview.setWebViewClient(new WebViewClient(webview) {

            final WebView a;
            final el._cls1 b;

            public final void onPageFinished(WebView webview1, String s)
            {
                com.google.android.gms.ads.internal.util.client.b.a(3);
                b.c.a.remove(a);
            }

            public final void onReceivedError(WebView webview1, int i, String s, String s1)
            {
                com.google.android.gms.ads.internal.util.client.b.c("Loading assets have failed.");
                b.c.a.remove(a);
            }

            
            {
                b = el._cls1.this;
                a = webview;
                super();
            }
        });
        c.a.add(webview);
        webview.loadDataWithBaseURL(a, b, "text/html", "UTF-8", null);
        com.google.android.gms.ads.internal.util.client.b.a(3);
    }

    _cls1.a(el el1, String s, String s1)
    {
        c = el1;
        a = s;
        b = s1;
        super();
    }
}
