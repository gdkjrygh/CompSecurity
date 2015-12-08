// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

// Referenced classes of package com.google.zxing.client.android:
//            LocaleManager

public final class HelpActivity extends Activity
{
    private final class HelpClient extends WebViewClient
    {

        final HelpActivity this$0;

        public void onPageFinished(WebView webview, String s)
        {
            setTitle(webview.getTitle());
            backButton.setEnabled(webview.canGoBack());
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            if (s.startsWith("file"))
            {
                return false;
            } else
            {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
                return true;
            }
        }

        private HelpClient()
        {
            this$0 = HelpActivity.this;
            super();
        }

        HelpClient(HelpClient helpclient)
        {
            this();
        }
    }


    private static final String BASE_URL = (new StringBuilder("file:///android_asset/html-")).append(LocaleManager.getTranslatedAssetLanguage()).append('/').toString();
    public static final String DEFAULT_PAGE = "index.html";
    public static final String REQUESTED_PAGE_KEY = "requested_page_key";
    private static final String WEBVIEW_STATE_PRESENT = "webview_state_present";
    public static final String WHATS_NEW_PAGE = "whatsnew.html";
    private Button backButton;
    private final android.view.View.OnClickListener backListener = new android.view.View.OnClickListener() {

        final HelpActivity this$0;

        public void onClick(View view)
        {
            webView.goBack();
        }

            
            {
                this$0 = HelpActivity.this;
                super();
            }
    };
    private final android.view.View.OnClickListener doneListener = new android.view.View.OnClickListener() {

        final HelpActivity this$0;

        public void onClick(View view)
        {
            finish();
        }

            
            {
                this$0 = HelpActivity.this;
                super();
            }
    };
    private WebView webView;

    public HelpActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(R.layout.help);
        webView = (WebView)findViewById(R.id.help_contents);
        webView.setWebViewClient(new HelpClient(null));
        Intent intent = getIntent();
        if (bundle != null && bundle.getBoolean("webview_state_present", false))
        {
            webView.restoreState(bundle);
        } else
        if (intent != null)
        {
            bundle = intent.getStringExtra("requested_page_key");
            if (bundle != null && bundle.length() > 0)
            {
                webView.loadUrl((new StringBuilder(String.valueOf(BASE_URL))).append(bundle).toString());
            } else
            {
                webView.loadUrl((new StringBuilder(String.valueOf(BASE_URL))).append("index.html").toString());
            }
        } else
        {
            webView.loadUrl((new StringBuilder(String.valueOf(BASE_URL))).append("index.html").toString());
        }
        backButton = (Button)findViewById(R.id.back_button);
        backButton.setOnClickListener(backListener);
        findViewById(R.id.done_button).setOnClickListener(doneListener);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4 && webView.canGoBack())
        {
            webView.goBack();
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        String s = webView.getUrl();
        if (s != null && s.length() > 0)
        {
            webView.saveState(bundle);
            bundle.putBoolean("webview_state_present", true);
        }
    }



}
