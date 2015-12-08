// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.web.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.Toolbar;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.pinterest.activity.ActivityHelper;
import com.pinterest.activity.web.view.WebViewPinItBar;
import com.pinterest.activity.webhook.WebhookActivity;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.base.StopWatch;
import com.pinterest.ui.progress.LoadingView;

// Referenced classes of package com.pinterest.activity.web.fragment:
//            WebViewFragment

class this._cls0 extends WebViewClient
{

    final WebViewFragment this$0;

    public void onPageFinished(WebView webview, String s)
    {
        super.onPageFinished(webview, s);
        StopWatch.get().logTimeStamp("webview_pageload", "100p_loaded");
        WebViewFragment.access$100(WebViewFragment.this).setWebChromeClient(null);
        if (getActivity() != null && s != null && s.contains("password/reset/complete/"))
        {
            ActivityHelper.goSplashLogin(getActivity());
        }
        if (WebViewFragment.access$400(WebViewFragment.this) != null)
        {
            WebViewFragment.access$400(WebViewFragment.this).setVisibility(8);
        }
        if (WebViewFragment.access$500(WebViewFragment.this) != null && !ModelHelper.isValid(WebViewFragment.access$600(WebViewFragment.this)))
        {
            WebViewFragment.access$700(WebViewFragment.this).setTitle(webview.getTitle());
        }
        webview.loadUrl("javascript:webViewResult.setValue((function() {  var metaTags = document.getElementsByTagName('meta');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute('property');    if (property && property.substring(0, 'al:android:'.length) === 'al:android:') {      var tag = { \"property\": metaTags[i].getAttribute('property') };      if (metaTags[i].hasAttribute('content')) {        tag['content'] = metaTags[i].getAttribute('content');      }      results.push(tag);    }  }  return JSON.stringify(results);})())");
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        super.onPageStarted(webview, s, bitmap);
        StopWatch.get().logTimeStamp("webview_pageload", "0p_loaded");
        if (!WebViewFragment.access$800(WebViewFragment.this, s)) goto _L2; else goto _L1
_L1:
        bitmap = getActivity();
        if (bitmap != null) goto _L4; else goto _L3
_L3:
        return;
_L4:
        Intent intent = new Intent(bitmap, com/pinterest/activity/webhook/WebhookActivity);
        intent.setData(Uri.parse(s));
        bitmap.startActivity(intent);
        webview.stopLoading();
        getActivity().finish();
        return;
_L2:
        if (WebViewFragment.access$900(WebViewFragment.this) != null)
        {
            WebViewFragment.access$900(WebViewFragment.this).setUrl(s);
        }
        if (WebViewFragment.access$400(WebViewFragment.this) != null)
        {
            WebViewFragment.access$400(WebViewFragment.this).setVisibility(0);
            WebViewFragment.access$400(WebViewFragment.this).setState(0);
        }
        if (WebViewFragment.access$1000(WebViewFragment.this) != null && !ModelHelper.isValid(WebViewFragment.access$600(WebViewFragment.this)))
        {
            WebViewFragment.access$1100(WebViewFragment.this).setTitle(webview.getTitle());
            return;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        return WebViewFragment.access$300(WebViewFragment.this, webview, s);
    }

    ()
    {
        this$0 = WebViewFragment.this;
        super();
    }
}
