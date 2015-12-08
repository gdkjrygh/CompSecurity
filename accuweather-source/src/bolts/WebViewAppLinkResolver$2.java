// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bolts;

import android.net.Uri;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package bolts:
//            Continuation, WebViewAppLinkResolver, Task, Capture

class val.content
    implements Continuation
{

    final WebViewAppLinkResolver this$0;
    final Capture val$content;
    final Capture val$contentType;
    final Uri val$url;

    public Task then(Task task)
        throws Exception
    {
        final  tcs = Task.create();
        WebView webview = new WebView(WebViewAppLinkResolver.access$200(WebViewAppLinkResolver.this));
        webview.getSettings().setJavaScriptEnabled(true);
        webview.setNetworkAvailable(false);
        webview.setWebViewClient(new WebViewClient() {

            private boolean loaded;
            final WebViewAppLinkResolver._cls2 this$1;

            private void runJavaScript(WebView webview1)
            {
                if (!loaded)
                {
                    loaded = true;
                    webview1.loadUrl("javascript:boltsWebViewAppLinkResolverResult.setValue((function() {  var metaTags = document.getElementsByTagName('meta');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute('property');    if (property && property.substring(0, 'al:'.length) === 'al:') {      var tag = { \"property\": metaTags[i].getAttribute('property') };      if (metaTags[i].hasAttribute('content')) {        tag['content'] = metaTags[i].getAttribute('content');      }      results.push(tag);    }  }  return JSON.stringify(results);})())");
                }
            }

            public void onLoadResource(WebView webview1, String s)
            {
                super.onLoadResource(webview1, s);
                runJavaScript(webview1);
            }

            public void onPageFinished(WebView webview1, String s)
            {
                super.onPageFinished(webview1, s);
                runJavaScript(webview1);
            }

            
            {
                this$1 = WebViewAppLinkResolver._cls2.this;
                super();
                loaded = false;
            }
        });
        webview.addJavascriptInterface(new Object() {

            final WebViewAppLinkResolver._cls2 this$1;
            final Task.TaskCompletionSource val$tcs;

            public void setValue(String s)
            {
                try
                {
                    tcs.trySetResult(new JSONArray(s));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    tcs.trySetError(s);
                }
            }

            
            {
                this$1 = WebViewAppLinkResolver._cls2.this;
                tcs = taskcompletionsource;
                super();
            }
        }, "boltsWebViewAppLinkResolverResult");
        task = null;
        if (val$contentType.get() != null)
        {
            task = ((String)val$contentType.get()).split(";")[0];
        }
        webview.loadDataWithBaseURL(val$url.toString(), (String)val$content.get(), task, null, null);
        return tcs.getTask();
    }

    public volatile Object then(Task task)
        throws Exception
    {
        return then(task);
    }

    _cls2.val.tcs()
    {
        this$0 = final_webviewapplinkresolver;
        val$contentType = capture;
        val$url = uri;
        val$content = Capture.this;
        super();
    }
}
