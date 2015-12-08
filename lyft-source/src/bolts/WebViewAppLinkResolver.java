// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package bolts:
//            Continuation, Task, Capture

public class WebViewAppLinkResolver
{

    private final Context a;

    static Context a(WebViewAppLinkResolver webviewapplinkresolver)
    {
        return webviewapplinkresolver.a;
    }

    // Unreferenced inner class bolts/WebViewAppLinkResolver$2

/* anonymous class */
    class _cls2
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
            webview.setWebViewClient(new WebViewClient(this) {

                final _cls2 a;
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
                a = _pcls2;
                super();
                b = false;
            }
            });
            webview.addJavascriptInterface(new Object(this, taskcompletionsource) {

                final Task.TaskCompletionSource a;
                final _cls2 b;

            
            {
                b = _pcls2;
                a = taskcompletionsource;
                super();
            }
            }, "boltsWebViewAppLinkResolverResult");
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
    }

}
