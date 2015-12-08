// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzdn, zzfl

public class zzdp
    implements zzdn
{

    private final Context mContext;
    final Set zzxh = Collections.synchronizedSet(new HashSet());

    public zzdp(Context context)
    {
        mContext = context;
    }

    public void zza(String s, String s1, String s2)
    {
        zzb.zzaj("Fetching assets for the given html");
        zzfl.zzCr.post(new Runnable(s1, s2) {

            final String a;
            final String b;
            final zzdp c;

            public void run()
            {
                WebView webview = c.zzdS();
                webview.setWebViewClient(new WebViewClient(this, webview) {

                    final WebView a;
                    final _cls1 b;

                    public void onPageFinished(WebView webview, String s)
                    {
                        zzb.zzaj("Loading assets have finished");
                        b.c.zzxh.remove(a);
                    }

                    public void onReceivedError(WebView webview, int i, String s, String s1)
                    {
                        zzb.zzan("Loading assets have failed.");
                        b.c.zzxh.remove(a);
                    }

            
            {
                b = _pcls1;
                a = webview;
                super();
            }
                });
                c.zzxh.add(webview);
                webview.loadDataWithBaseURL(a, b, "text/html", "UTF-8", null);
                zzb.zzaj("Fetching assets finished.");
            }

            
            {
                c = zzdp.this;
                a = s;
                b = s1;
                super();
            }
        });
    }

    public WebView zzdS()
    {
        WebView webview = new WebView(mContext);
        webview.getSettings().setJavaScriptEnabled(true);
        return webview;
    }
}
