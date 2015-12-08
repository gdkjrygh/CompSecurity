// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin;

import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import com.pinterest.base.Device;
import com.pinterest.kit.activity.BaseActivity;
import com.pinterest.kit.utils.WebViewUtils;
import org.scribe.model.Token;
import org.scribe.oauth.OAuthService;

public abstract class WebAuthActivity extends BaseActivity
{

    protected String _authURL;
    protected Token _requestToken;
    protected OAuthService _service;
    protected WebView _webview;
    protected int errorStringId;

    public WebAuthActivity()
    {
        errorStringId = 0x7f070350;
    }

    private void doAuth()
    {
        (new Thread(new _cls1())).start();
    }

    protected abstract OAuthService getService();

    protected void init()
    {
        super.init();
        _webview = (WebView)findViewById(0x7f0f0097);
        WebViewUtils.setupWebView(_webview, true);
        setResult(0, null);
        doAuth();
    }

    protected void notifyError(final Exception e)
    {
        runOnUiThread(new _cls2());
    }

    protected abstract void onAuthSuccess(Uri uri);

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03002a);
        init();
    }

    protected void onDestroy()
    {
        super.onDestroy();
        WebViewUtils.safeDestroyWebView(_webview);
    }

    protected void onPause()
    {
        Device.hideSoftKeyboard(getCurrentFocus());
        super.onPause();
    }

    private class _cls1
        implements Runnable
    {

        final WebAuthActivity this$0;

        public void run()
        {
            try
            {
                _service = getService();
                if (!_service.getVersion().equals("2.0"))
                {
                    _requestToken = _service.getRequestToken();
                }
                _authURL = _service.getAuthorizationUrl(_requestToken);
                class _cls1
                    implements Runnable
                {

                    final _cls1 this$1;

                    public void run()
                    {
                        class _cls1 extends WebViewClient
                        {

                            final _cls1 this$2;

                            public boolean shouldOverrideUrlLoading(WebView webview, String s)
                            {
                                Uri uri = Uri.parse(s);
                                if (s.startsWith("http://www.pinterest.com/android_app_oauth/") || s.startsWith("http://www.pinterdev.com/android_app_oauth/") || s.startsWith("oauth://twitter"))
                                {
                                    onAuthSuccess(uri);
                                    return true;
                                } else
                                {
                                    return super.shouldOverrideUrlLoading(webview, s);
                                }
                            }

                                _cls1()
                                {
                                    this$2 = _cls1.this;
                                    super();
                                }
                        }

                        _webview.setWebViewClient(new _cls1());
                        _webview.loadUrl(_authURL);
                    }

                _cls1()
                {
                    this$1 = _cls1.this;
                    super();
                }
                }

                runOnUiThread(new _cls1());
                return;
            }
            catch (Exception exception)
            {
                notifyError(exception);
            }
        }

        _cls1()
        {
            this$0 = WebAuthActivity.this;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final WebAuthActivity this$0;
        final Exception val$e;

        public void run()
        {
            if (!NetworkUtils.getInstance().hasInternet())
            {
                Application.showToast(0x7f07039b);
            } else
            if (e instanceof OAuthException)
            {
                Application.showToast(0x7f07034c);
            } else
            {
                Application.showToast(errorStringId);
            }
            finish();
        }

        _cls2()
        {
            this$0 = WebAuthActivity.this;
            e = exception;
            super();
        }
    }

}
