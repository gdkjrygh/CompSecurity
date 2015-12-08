// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzex, zzhx, zzhw

public class zzez
    implements zzex
{

    private final Context mContext;
    final Set zzuN = Collections.synchronizedSet(new HashSet());

    public zzez(Context context)
    {
        mContext = context;
    }

    public void zza(String s, String s1, String s2)
    {
        zzhx.zzY("Fetching assets for the given html");
        zzhw.zzzG.post(new Runnable(s1, s2) {

            final String zzuO;
            final String zzuP;
            final zzez zzuQ;

            public void run()
            {
                WebView webview = zzuQ.zzdr();
                webview.setWebViewClient(new WebViewClient(this, webview) {

                    final WebView zzov;
                    final _cls1 zzuR;

                    public void onPageFinished(WebView webview, String s)
                    {
                        zzhx.zzY("Loading assets have finished");
                        zzuR.zzuQ.zzuN.remove(zzov);
                    }

                    public void onReceivedError(WebView webview, int i, String s, String s1)
                    {
                        zzhx.zzac("Loading assets have failed.");
                        zzuR.zzuQ.zzuN.remove(zzov);
                    }

            
            {
                zzuR = _pcls1;
                zzov = webview;
                super();
            }
                });
                zzuQ.zzuN.add(webview);
                webview.loadDataWithBaseURL(zzuO, zzuP, "text/html", "UTF-8", null);
                zzhx.zzY("Fetching assets finished.");
            }

            
            {
                zzuQ = zzez.this;
                zzuO = s;
                zzuP = s1;
                super();
            }
        });
    }

    public WebView zzdr()
    {
        WebView webview = new WebView(mContext);
        webview.getSettings().setJavaScriptEnabled(true);
        return webview;
    }
}
