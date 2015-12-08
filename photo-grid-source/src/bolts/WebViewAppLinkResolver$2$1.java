// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package bolts:
//            s

class b extends WebViewClient
{

    final s a;
    private boolean b;

    private void runJavaScript(WebView webview)
    {
        if (!b)
        {
            b = true;
            webview.loadUrl("javascript:boltsWebViewAppLinkResolverResult.setValue((function() {  var metaTags = document.getElementsByTagName('meta');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute('property');    if (property && property.substring(0, 'al:'.length) === 'al:') {      var tag = { \"property\": metaTags[i].getAttribute('property') };      if (metaTags[i].hasAttribute('content')) {        tag['content'] = metaTags[i].getAttribute('content');      }      results.push(tag);    }  }  return JSON.stringify(results);})())");
        }
    }

    public void onLoadResource(WebView webview, String s)
    {
        super.onLoadResource(webview, s);
        runJavaScript(webview);
    }

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        runJavaScript(webview);
    }

    (s s)
    {
        a = s;
        super();
        b = false;
    }
}
