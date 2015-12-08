// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import android.net.Uri;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package bolts:
//            Continuation, WebViewAppLinkResolver, Task, Capture

class a
{

    final a a;
    final a b;

    b(b b1, b b2)
    {
        b = b1;
        a = b2;
        super();
    }

    // Unreferenced inner class bolts/WebViewAppLinkResolver$2

/* anonymous class */
    class WebViewAppLinkResolver._cls2
        implements Continuation
    {

        final Capture a;
        final Uri b;
        final Capture c;
        final WebViewAppLinkResolver d;

        public Task a(Task task)
        {
            Task.TaskCompletionSource taskcompletionsource = Task.a();
            WebView webview = new WebView(WebViewAppLinkResolver.a(d));
            webview.getSettings().setJavaScriptEnabled(true);
            webview.setNetworkAvailable(false);
            webview.setWebViewClient(new WebViewAppLinkResolver._cls2._cls1());
            webview.addJavascriptInterface(new WebViewAppLinkResolver._cls2._cls2(this, taskcompletionsource), "boltsWebViewAppLinkResolverResult");
            if (a.a() != null)
            {
                task = ((String)a.a()).split(";")[0];
            } else
            {
                task = null;
            }
            webview.loadDataWithBaseURL(b.toString(), (String)c.a(), task, null, null);
            return taskcompletionsource.a();
        }

        public Object then(Task task)
        {
            return a(task);
        }

        // Unreferenced inner class bolts/WebViewAppLinkResolver$2$1

/* anonymous class */
        class WebViewAppLinkResolver._cls2._cls1 extends WebViewClient
        {

            final WebViewAppLinkResolver._cls2 a;
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

                    
                    {
                        a = WebViewAppLinkResolver._cls2.this;
                        super();
                        b = false;
                    }
        }

    }

}
