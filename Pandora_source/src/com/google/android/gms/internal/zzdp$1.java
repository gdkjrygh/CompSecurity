// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzdp

class b
    implements Runnable
{

    final String a;
    final String b;
    final zzdp c;

    public void run()
    {
        WebView webview = c.zzdS();
        webview.setWebViewClient(new WebViewClient(webview) {

            final WebView a;
            final zzdp._cls1 b;

            public void onPageFinished(WebView webview1, String s)
            {
                zzb.zzaj("Loading assets have finished");
                b.c.zzxh.remove(a);
            }

            public void onReceivedError(WebView webview1, int i, String s, String s1)
            {
                zzb.zzan("Loading assets have failed.");
                b.c.zzxh.remove(a);
            }

            
            {
                b = zzdp._cls1.this;
                a = webview;
                super();
            }
        });
        c.zzxh.add(webview);
        webview.loadDataWithBaseURL(a, b, "text/html", "UTF-8", null);
        zzb.zzaj("Fetching assets finished.");
    }

    _cls1.a(zzdp zzdp1, String s, String s1)
    {
        c = zzdp1;
        a = s;
        b = s1;
        super();
    }
}
