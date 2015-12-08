// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzfd

class zzAv
    implements Runnable
{

    final String zzAu;
    final String zzAv;
    final zzfd zzAw;

    public void run()
    {
        WebView webview = zzAw.zzeZ();
        webview.setWebViewClient(new WebViewClient(webview) {

            final zzfd._cls1 zzAx;
            final WebView zzrG;

            public void onPageFinished(WebView webview1, String s)
            {
                zzb.zzay("Loading assets have finished");
                zzAx.zzAw.zzAt.remove(zzrG);
            }

            public void onReceivedError(WebView webview1, int i, String s, String s1)
            {
                zzb.zzaC("Loading assets have failed.");
                zzAx.zzAw.zzAt.remove(zzrG);
            }

            
            {
                zzAx = zzfd._cls1.this;
                zzrG = webview;
                super();
            }
        });
        zzAw.zzAt.add(webview);
        webview.loadDataWithBaseURL(zzAu, zzAv, "text/html", "UTF-8", null);
        zzb.zzay("Fetching assets finished.");
    }

    _cls1.zzrG(zzfd zzfd1, String s, String s1)
    {
        zzAw = zzfd1;
        zzAu = s;
        zzAv = s1;
        super();
    }
}
