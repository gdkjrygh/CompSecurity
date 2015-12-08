// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.ConsoleMessage;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.skype.SkyLib;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.NavigationUrl;
import com.skype.android.inject.LifecycleSupport;
import com.skype.android.res.Urls;
import java.util.Random;
import java.util.logging.Logger;

public class WebActivity extends SkypeActivity
{
    public static interface WebPageLoadListener
    {

        public abstract void onPageFinished(WebView webview, String s);

        public abstract void onPageStarted(WebView webview, String s, Bitmap bitmap);
    }


    public static final String EXTRA_INITIATED_ACTIVITY = "EXTRA_INITIATED_ACTIVITY";
    public static final String EXTRA_TITLE = "EXTRA_TITLE";
    public static final String GO_PARAM_VALUE = "GO_PARAM_VALUE";
    public static final String URL = "url";
    public static final String USE_SSO = "use_sso";
    ActionBarCustomizer actionBarCustomizer;
    private String backToken;
    private boolean destroyed;
    private String goParamValue;
    SkyLib lib;
    NavigationUrl navigationUrl;
    private WebPageLoadListener pageLoadListener;
    private boolean pageLoaded;
    private String presecureUrl;
    ProgressBar progressBar;
    private int reqId;
    private String url;
    Urls urls;
    private boolean useSingleSignOn;
    WebView webView;

    public WebActivity()
    {
    }

    private Dialog getConnectionErrorDialog()
    {
        android.support.v7.app.AlertDialog.a a = new android.support.v7.app.AlertDialog.a(this, 0x7f0900cd);
        a.b(0x7f080444);
        a.a(0x7f080281);
        a.a(new android.content.DialogInterface.OnClickListener() {

            final WebActivity this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                startActivity(new Intent("android.settings.WIRELESS_SETTINGS"));
            }

            
            {
                this$0 = WebActivity.this;
                super();
            }
        });
        a.a(0x7f0802f6, new android.content.DialogInterface.OnClickListener() {

            final WebActivity this$0;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                finish();
            }

            
            {
                this$0 = WebActivity.this;
                super();
            }
        });
        return a.c();
    }

    private android.support.v7.app.AlertDialog.a getSslOverrideDialog(final SslErrorHandler handler, SslError sslerror)
    {
        android.support.v7.app.AlertDialog.a a = new android.support.v7.app.AlertDialog.a(this);
        a.b((new StringBuilder("SSL error continue? ")).append(sslerror.toString()).toString());
        a.a(0x104000a, new android.content.DialogInterface.OnClickListener() {

            final WebActivity this$0;
            final SslErrorHandler val$handler;

            public final void onClick(DialogInterface dialoginterface, int i)
            {
                handler.proceed();
            }

            
            {
                this$0 = WebActivity.this;
                handler = sslerrorhandler;
                super();
            }
        });
        a.a(new android.content.DialogInterface.OnCancelListener() {

            final WebActivity this$0;
            final SslErrorHandler val$handler;

            public final void onCancel(DialogInterface dialoginterface)
            {
                handler.cancel();
            }

            
            {
                this$0 = WebActivity.this;
                handler = sslerrorhandler;
                super();
            }
        });
        return a;
    }

    private void setupWebview(WebView webview)
    {
        webview = webview.getSettings();
        webview.setSavePassword(false);
        webview.setJavaScriptEnabled(true);
        webview.setSupportZoom(true);
        webview.setDomStorageEnabled(true);
        webview.setBuiltInZoomControls(true);
        webview.setDisplayZoomControls(false);
        webview.setUseWideViewPort(true);
        webView.requestFocus(130);
        webView.setWebViewClient(new WebViewClient() {

            final WebActivity this$0;

            public final void onPageFinished(WebView webview1, String s)
            {
                
// JavaClassFileOutputException: get_constant: invalid tag

            public final void onPageStarted(WebView webview1, String s, Bitmap bitmap)
            {
                if (pageLoadListener != null)
                {
                    pageLoadListener.onPageStarted(webview1, s, bitmap);
                }
            }

            public final void onReceivedError(WebView webview1, int i, String s, String s1)
            {
                
// JavaClassFileOutputException: get_constant: invalid tag

            public final void onReceivedSslError(WebView webview1, SslErrorHandler sslerrorhandler, SslError sslerror)
            {
                
// JavaClassFileOutputException: get_constant: invalid tag

            public final boolean shouldOverrideUrlLoading(WebView webview1, String s)
            {
                if (s != null)
                {
                    if (s.startsWith("market://"))
                    {
                        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
                        return true;
                    }
                    if (useSingleSignOn && s.contains(backToken) && pageLoaded)
                    {
                        finish();
                        return true;
                    }
                }
                return false;
            }

            
            {
                this$0 = WebActivity.this;
                super();
            }
        });
        webView.setWebChromeClient(new WebChromeClient() );
    }

    public WebPageLoadListener createWebPageLoadListener()
    {
        return null;
    }

    public void onBackPressed()
    {
        if (webView.canGoBack())
        {
            webView.goBack();
            return;
        } else
        {
            onBackPressed();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        onCreate(bundle);
        getComponent().inject(this);
        lifecycleSupport.addListener(actionBarCustomizer);
        getSupportActionBar().b(true);
        url = getIntent().getStringExtra("url");
        useSingleSignOn = getIntent().getBooleanExtra("use_sso", false);
        goParamValue = getIntent().getStringExtra("GO_PARAM_VALUE");
        setupWebview(webView);
        webView.setBackgroundResource(0);
        actionBarCustomizer.setTitleWithRecents(getIntent().getIntExtra("EXTRA_TITLE", 0x7f08032b));
        pageLoadListener = createWebPageLoadListener();
        if (bundle != null)
        {
            webView.restoreState(bundle);
            return;
        }
        if (useSingleSignOn)
        {
            bundle = (new StringBuilder("https://www.skype.com/")).append(String.valueOf(0x186a0 + (new Random()).nextInt(0xdbba0))).toString();
        } else
        {
            bundle = null;
        }
        backToken = bundle;
        if (useSingleSignOn)
        {
            progressBar.setIndeterminate(true);
            progressBar.setVisibility(0);
            reqId = lib.requestSSOToken();
            return;
        } else
        {
            log.info((new StringBuilder("load url: ")).append(url).toString());
            webView.loadUrl(url);
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        if (useSingleSignOn)
        {
            return false;
        } else
        {
            getMenuInflater().inflate(0x7f110015, menu);
            return true;
        }
    }

    public void onDestroy()
    {
        onDestroy();
        destroyed = true;
        if (webView != null)
        {
            webView.removeAllViews();
            webView.destroy();
        }
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnAuthTokenResult onauthtokenresult)
    {
label0:
        {
            if (reqId == onauthtokenresult.getRequest_id() && onauthtokenresult.getSuccess())
            {
                presecureUrl = urls.a(onauthtokenresult.getToken(), goParamValue, url, backToken);
                log.info((new StringBuilder("presecure login: ")).append(presecureUrl).toString());
            } else
            {
                log.warning("Get SSO info failed.");
            }
            if (!destroyed)
            {
                log.info((new StringBuilder("sso url: ")).append(presecureUrl).toString());
                if (presecureUrl != null)
                {
                    break label0;
                }
                getConnectionErrorDialog().show();
            }
            return;
        }
        webView.loadUrl(presecureUrl);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131756518: 
            navigationUrl.goToUrl(this, url, false);
            return true;

        case 2131756519: 
            ((ClipboardManager)getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, url));
            break;
        }
        return true;
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        onRestoreInstanceState(bundle);
        webView.restoreState(bundle);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        onSaveInstanceState(bundle);
        webView.saveState(bundle);
    }

    public void removeWebPageLoadListener()
    {
        pageLoadListener = null;
    }





/*
    static boolean access$202(WebActivity webactivity, boolean flag)
    {
        webactivity.pageLoaded = flag;
        return flag;
    }

*/






}
