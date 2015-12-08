// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import android.net.Uri;
import android.webkit.WebSettings;
import android.webkit.WebView;

// Referenced classes of package bolts:
//            i, j, r, t, 
//            h, q

final class s
    implements i
{

    final h a;
    final Uri b;
    final h c;
    final r d;

    public final Object then(j j1)
    {
        q q1 = j.a();
        WebView webview = new WebView(r.a(d));
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setNetworkAvailable(false);
        webview.setWebViewClient(new WebViewAppLinkResolver._cls2._cls1(this));
        webview.addJavascriptInterface(new t(this, q1), "boltsWebViewAppLinkResolverResult");
        if (a.a() != null)
        {
            j1 = ((String)a.a()).split(";")[0];
        } else
        {
            j1 = null;
        }
        webview.loadDataWithBaseURL(b.toString(), (String)c.a(), j1, null, null);
        return q1.a;
    }
}
