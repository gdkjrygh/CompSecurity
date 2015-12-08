// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzez, zzhx

class zzuP
    implements Runnable
{

    final String zzuO;
    final String zzuP;
    final zzez zzuQ;

    public void run()
    {
        WebView webview = zzuQ.zzdr();
        webview.setWebViewClient(new WebViewClient(webview) {

            final WebView zzov;
            final zzez._cls1 zzuR;

            public void onPageFinished(WebView webview1, String s)
            {
                zzhx.zzY("Loading assets have finished");
                zzuR.zzuQ.zzuN.remove(zzov);
            }

            public void onReceivedError(WebView webview1, int i, String s, String s1)
            {
                zzhx.zzac("Loading assets have failed.");
                zzuR.zzuQ.zzuN.remove(zzov);
            }

            
            {
                zzuR = zzez._cls1.this;
                zzov = webview;
                super();
            }
        });
        zzuQ.zzuN.add(webview);
        webview.loadDataWithBaseURL(zzuO, zzuP, "text/html", "UTF-8", null);
        zzhx.zzY("Fetching assets finished.");
    }

    _cls1.zzov(zzez zzez1, String s, String s1)
    {
        zzuQ = zzez1;
        zzuO = s;
        zzuP = s1;
        super();
    }
}
