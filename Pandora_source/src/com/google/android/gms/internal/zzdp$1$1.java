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

class a extends WebViewClient
{

    final WebView a;
    final a b;

    public void onPageFinished(WebView webview, String s)
    {
        zzb.zzaj("Loading assets have finished");
        b.b.zzxh.remove(a);
    }

    public void onReceivedError(WebView webview, int i, String s, String s1)
    {
        zzb.zzan("Loading assets have failed.");
        b.b.zzxh.remove(a);
    }

    client.zzb(client.zzb zzb1, WebView webview)
    {
        b = zzb1;
        a = webview;
        super();
    }

    // Unreferenced inner class com/google/android/gms/internal/zzdp$1

/* anonymous class */
    class zzdp._cls1
        implements Runnable
    {

        final String a;
        final String b;
        final zzdp c;

        public void run()
        {
            WebView webview = c.zzdS();
            webview.setWebViewClient(new zzdp._cls1._cls1(this, webview));
            c.zzxh.add(webview);
            webview.loadDataWithBaseURL(a, b, "text/html", "UTF-8", null);
            zzb.zzaj("Fetching assets finished.");
        }

            
            {
                c = zzdp1;
                a = s;
                b = s1;
                super();
            }
    }

}
