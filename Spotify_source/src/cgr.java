// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class cgr
    implements cgp
{

    final Context a;
    final Set b = Collections.synchronizedSet(new HashSet());

    public cgr(Context context)
    {
        a = context;
    }

    public final void a(String s, String s1)
    {
        bka.a("Fetching assets for the given html");
        cjj.a.post(new Runnable(s, s1) {

            final cgr a;
            private String b;
            private String c;

            public final void run()
            {
                WebView webview = new WebView(a.a);
                webview.getSettings().setJavaScriptEnabled(true);
                webview.setWebViewClient(new WebViewClient(this, webview) {

                    private WebView a;
                    private _cls1 b;

                    public final void onPageFinished(WebView webview, String s)
                    {
                        bka.a("Loading assets have finished");
                        b.a.b.remove(a);
                    }

                    public final void onReceivedError(WebView webview, int i, String s, String s1)
                    {
                        bka.e("Loading assets have failed.");
                        b.a.b.remove(a);
                    }

            
            {
                b = _pcls1;
                a = webview;
                super();
            }
                });
                a.b.add(webview);
                webview.loadDataWithBaseURL(b, c, "text/html", "UTF-8", null);
                bka.a("Fetching assets finished.");
            }

            
            {
                a = cgr.this;
                b = s;
                c = s1;
                super();
            }
        });
    }
}
