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

final class a extends WebViewClient
{

    final WebView a;
    final a b;

    public final void onPageFinished(WebView webview, String s)
    {
        com.google.android.gms.ads.internal.util.client.b.a(3);
        b.b.a.remove(a);
    }

    public final void onReceivedError(WebView webview, int i, String s, String s1)
    {
        com.google.android.gms.ads.internal.util.client.b.c("Loading assets have failed.");
        b.b.a.remove(a);
    }

    l.client.b(l.client.b b1, WebView webview)
    {
        b = b1;
        a = webview;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/el$1

/* anonymous class */
    final class el._cls1
        implements Runnable
    {

        final String a;
        final String b;
        final el c;

        public final void run()
        {
            WebView webview = c.a();
            webview.setWebViewClient(new el._cls1._cls1(this, webview));
            c.a.add(webview);
            webview.loadDataWithBaseURL(a, b, "text/html", "UTF-8", null);
            com.google.android.gms.ads.internal.util.client.b.a(3);
        }

            
            {
                c = el1;
                a = s;
                b = s1;
                super();
            }
    }

}
