// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzhx, zzez

class zzov extends WebViewClient
{

    final WebView zzov;
    final zzov zzuR;

    public void onPageFinished(WebView webview, String s)
    {
        zzhx.zzY("Loading assets have finished");
        zzuR.uQ.zzuN.remove(zzov);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        zzhx.zzac("Loading assets have failed.");
        zzuR.uQ.zzuN.remove(zzov);
    }

    uP(uP up, WebView webview)
    {
        zzuR = up;
        zzov = webview;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/zzez$1

/* anonymous class */
    class zzez._cls1
        implements Runnable
    {

        final String zzuO;
        final String zzuP;
        final zzez zzuQ;

        public void run()
        {
            WebView webview = zzuQ.zzdr();
            webview.setWebViewClient(new zzez._cls1._cls1(this, webview));
            zzuQ.zzuN.add(webview);
            webview.loadDataWithBaseURL(zzuO, zzuP, "text/html", "UTF-8", null);
            zzhx.zzY("Fetching assets finished.");
        }

            
            {
                zzuQ = zzez1;
                zzuO = s;
                zzuP = s1;
                super();
            }
    }

}
