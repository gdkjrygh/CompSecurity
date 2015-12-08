// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import com.kohls.mcommerce.opal.wl.HybridScreen;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            BaseActivityWithoutSlider

public class WebViewActivity extends BaseActivityWithoutSlider
{
    public class SimpleChromeClient extends WebChromeClient
    {

        final WebViewActivity this$0;

        public boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
        {
            return super.onJsAlert(webview, s, s1, jsresult);
        }

        public boolean onJsPrompt(WebView webview, String s, String s1, String s2, JsPromptResult jspromptresult)
        {
            return super.onJsPrompt(webview, s, s1, s2, jspromptresult);
        }

        public void onProgressChanged(WebView webview, int i)
        {
            super.onProgressChanged(webview, i);
        }

        public SimpleChromeClient()
        {
            this$0 = WebViewActivity.this;
            super();
        }
    }


    private boolean isListRegistry;
    private String mHeading;
    private String mHtmlContent;
    private boolean mIsWebViewBackEnabled;
    private String mUrl;
    private WebView mWebView;
    private boolean overrideUserAgent;
    String ua;

    public WebViewActivity()
    {
        ua = "Mozilla/5.0 (X11; Linux i686) AppleWebKit/537.31 (KHTML, like Gecko) Chrome/26.0.1410.63 Safari/537.31";
    }

    private void attachActionItemListener()
    {
        getActionBarHelper().getItemView().setOnClickListener(new android.view.View.OnClickListener() {

            final WebViewActivity this$0;

            public void onClick(View view)
            {
                UtilityMethods.openHybridScreen(WebViewActivity.this, HybridScreen.SHOPPINGBAG);
            }

            
            {
                this$0 = WebViewActivity.this;
                super();
            }
        });
    }

    private boolean checkUrl(String s)
    {
        return Pattern.compile("(?i)^((https?|ftp)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?].*)?$").matcher(s).find();
    }

    private void loadBundledData(Bundle bundle)
    {
        if (bundle != null)
        {
            mUrl = bundle.getString("KEY_URL");
            isListRegistry = bundle.getBoolean("KEY_LIST_REGISTRY");
            overrideUserAgent = bundle.getBoolean("EXTRA_KEY_OVERRIDE_USERAGENT");
            mHeading = bundle.getString("KEY_SCREENNAME");
            mIsWebViewBackEnabled = bundle.getBoolean("is webview back enabled");
            if (mUrl == null)
            {
                mHtmlContent = bundle.getString("HTML_CONTENT");
            }
        }
    }

    private void loadHTMLContent(String s)
    {
        if (mWebView != null)
        {
            mWebView.loadDataWithBaseURL("", s.replace("\"", "").trim(), "text/html", "utf-8", "");
        }
    }

    private void loadMyUrl(String s)
    {
label0:
        {
            if (mWebView != null)
            {
                if (!checkUrl(s))
                {
                    break label0;
                }
                mWebView.loadUrl(s);
            }
            return;
        }
        mWebView.loadData(s, "text/html", "utf-8");
    }

    private void openEmailClient(String s)
    {
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
    }

    private void setWebViewSettings()
    {
        mWebView.getSettings().setLoadsImagesAutomatically(true);
        mWebView.getSettings().setJavaScriptEnabled(true);
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            mWebView.getSettings().setMixedContentMode(0);
        }
        if (overrideUserAgent)
        {
            mWebView.getSettings().setUserAgentString(ua);
        }
        mWebView.setWebChromeClient(new SimpleChromeClient());
        mWebView.setWebViewClient(new WebViewClient() {

            final WebViewActivity this$0;

            public void onReceivedError(WebView webview, int i, String s, String s1)
            {
            }

            public boolean shouldOverrideUrlLoading(WebView webview, String s)
            {
                if (s.startsWith("mailto:"))
                {
                    openEmailClient(s);
                } else
                {
                    webview.loadUrl(s);
                }
                return true;
            }

            
            {
                this$0 = WebViewActivity.this;
                super();
            }
        });
    }

    protected int getLayoutId()
    {
        return 0x7f030117;
    }

    protected void initializeViews(Bundle bundle)
    {
        mWebView = (WebView)findViewById(0x7f0d06ea);
        if (android.os.Build.VERSION.SDK_INT < 19);
        loadBundledData(bundle);
        setWebViewSettings();
        attachActionItemListener();
        if (mUrl != null)
        {
            loadMyUrl(mUrl);
        } else
        if (mHtmlContent != null)
        {
            loadHTMLContent(mHtmlContent);
            return;
        }
    }

    public void onBackPressed()
    {
        if (mIsWebViewBackEnabled && mWebView.canGoBack())
        {
            mWebView.goBack();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    protected void onResume()
    {
        super.onResume();
    }

    protected void updateActionBarViews()
    {
        if (isListRegistry)
        {
            getActionBarHelper().showActionBarWithDetail("Back");
            return;
        }
        if (TextUtils.isEmpty(mHeading))
        {
            getActionBarHelper().showActionBarForWebViewActivity();
            return;
        } else
        {
            getActionBarHelper().showActionBarForWebViewString(mHeading);
            return;
        }
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    protected void updateViewsOnSuccess(Object obj)
    {
    }

}
