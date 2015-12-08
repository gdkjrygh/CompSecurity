// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fsr.tracker.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fsr.tracker.SurveyUrlBuilder;
import com.fsr.tracker.domain.Configuration;
import com.fsr.tracker.domain.MeasureConfiguration;
import com.fsr.tracker.layouts.SurveyView;
import fs.org.slf4j.Logger;
import fs.org.slf4j.LoggerFactory;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.fsr.tracker.app:
//            ISurveyCallback, TrackingContext, JsInterface

public class SurveyActivity extends Activity
    implements ISurveyCallback
{
    private class SurveyWebClient extends WebViewClient
    {

        final SurveyActivity this$0;

        public void onPageFinished(WebView webview, String s)
        {
            logger.debug("Finished loading URL: {}", s);
            super.onPageFinished(webview, s);
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            super.onReceivedError(webview, i, s, s1);
            switch (i)
            {
            default:
                return;

            case -14: 
            case -8: 
            case -6: 
            case -2: 
                onNetworkNotAvailable();
                break;
            }
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            if (TrackingContext.Instance().getConfiguration().isDomainWhiteListed(s))
            {
                webView.loadUrl(s);
            } else
            {
                logger.debug("Requested URL not white listed: {}", s);
                webview = new Intent("android.intent.action.VIEW", Uri.parse(s));
                webview.addFlags(0x10000000);
                startActivity(webview);
            }
            return true;
        }

        private SurveyWebClient()
        {
            this$0 = SurveyActivity.this;
            super();
        }

    }


    private JsInterface jsInterface;
    private Logger logger;
    private WebView webView;

    public SurveyActivity()
    {
        logger = LoggerFactory.getLogger("ForeSee Trigger Code");
    }

    public Context getContext()
    {
        return this;
    }

    public void onBackPressed()
    {
        if (webView.canGoBack())
        {
            webView.goBack();
            return;
        } else
        {
            surveyAborted();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = (Configuration)getIntent().getSerializableExtra("CONTEXT_CONFIG");
        TrackingContext.start(getApplication(), bundle);
        bundle = (MeasureConfiguration)getIntent().getSerializableExtra("MEASURE_CONFIG");
        Object obj = new SurveyView(this);
        setContentView(((android.view.View) (obj)));
        jsInterface = new JsInterface(this, TrackingContext.Instance());
        webView = ((SurveyView) (obj)).getWebView();
        webView.addJavascriptInterface(jsInterface, "fsrTracker");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new SurveyWebClient());
        obj = TrackingContext.Instance().getSurveyUrlBase();
        String s = webView.getSettings().getUserAgentString();
        try
        {
            TrackingContext trackingcontext = TrackingContext.Instance();
            bundle = SurveyUrlBuilder.buildSurveyUrl(((String) (obj)), s, trackingcontext.getApiKey(), bundle.getSurveyId(), trackingcontext.getConfiguration().getCpps(), trackingcontext.getConfiguration().getQueryStringParams());
            logger.debug("Loading survey: {}", bundle);
            webView.loadUrl(bundle);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Bundle bundle)
        {
            logger.error(bundle.getMessage(), bundle);
        }
    }

    protected void onNetworkNotAvailable()
    {
        TrackingContext.Instance().onNetworkDisconnected(this);
    }

    public void surveyAborted()
    {
        TrackingContext.Instance().abortSurvey();
        finish();
    }

    public void surveyCompleted()
    {
        TrackingContext.Instance().completeSurvey();
        finish();
    }


}
