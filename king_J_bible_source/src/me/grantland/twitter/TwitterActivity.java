// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.grantland.twitter;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.commonshttp.CommonsHttpOAuthProvider;
import oauth.signpost.exception.OAuthException;

// Referenced classes of package me.grantland.twitter:
//            TwitterError

public class TwitterActivity extends Activity
{
    private class H extends Handler
    {

        final TwitterActivity this$0;

        public void handleMessage(Message message)
        {
            Bundle bundle = message.getData();
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                mWebView.loadUrl(bundle.getString("url"));
                break;
            }
        }

        private H()
        {
            this$0 = TwitterActivity.this;
            super();
        }

        H(H h)
        {
            this();
        }
    }

    private class TwitterWebViewClient extends WebViewClient
    {

        final TwitterActivity this$0;

        public void onPageFinished(WebView webview, String s)
        {
            mSpinner.dismiss();
            webview.setVisibility(0);
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            super.onPageStarted(webview, s, bitmap);
            if (webview.getVisibility() != 4 && !mSpinner.isShowing())
            {
                mSpinner.show();
            }
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            super.onReceivedError(webview, i, s, s1);
            error(new TwitterError(s, i, s1));
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            webview = Uri.parse(s);
            if (webview != null && "gc".equals(webview.getScheme()))
            {
                if (webview.getQueryParameter("denied") != null)
                {
                    cancel();
                } else
                {
                    retrieveAccessToken(webview);
                }
                return true;
            } else
            {
                return false;
            }
        }

        private TwitterWebViewClient()
        {
            this$0 = TwitterActivity.this;
            super();
        }

        TwitterWebViewClient(TwitterWebViewClient twitterwebviewclient)
        {
            this();
        }
    }


    private static final boolean DEBUG = false;
    private static final String KEY_URL = "url";
    private static final int RETRIEVE_ACCESS_TOKEN = 2;
    private static final int RETRIEVE_REQUEST_TOKEN = 1;
    private static final String TAG = "me.grantland.twitter";
    private OAuthConsumer mConsumer;
    private H mMainThreadHandler;
    private OAuthProvider mProvider;
    private ProgressDialog mSpinner;
    private WebView mWebView;

    public TwitterActivity()
    {
    }

    private void cancel()
    {
        setResult(0, getIntent());
        finish();
    }

    private void complete(String s, String s1)
    {
        Intent intent = getIntent();
        intent.putExtra("access_key", s);
        intent.putExtra("access_secret", s1);
        setResult(-1, intent);
        finish();
    }

    private void error(Throwable throwable)
    {
        Intent intent = getIntent();
        intent.putExtra("error", throwable.getMessage());
        setResult(-1, intent);
        finish();
    }

    private void retrieveAccessToken(final Uri uri)
    {
        (new Thread() {

            final TwitterActivity this$0;
            private final Uri val$uri;

            public void run()
            {
                try
                {
                    String s = uri.getQueryParameter("oauth_token");
                    String s1 = uri.getQueryParameter("oauth_verifier");
                    mConsumer.setTokenWithSecret(s, mConsumer.getConsumerSecret());
                    mProvider.retrieveAccessToken(mConsumer, s1);
                    complete(mConsumer.getToken(), mConsumer.getTokenSecret());
                    return;
                }
                catch (OAuthException oauthexception)
                {
                    error(oauthexception);
                }
            }

            
            {
                this$0 = TwitterActivity.this;
                uri = uri1;
                super();
            }
        }).start();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.twitter_layout);
        bundle = getIntent();
        mConsumer = (OAuthConsumer)bundle.getSerializableExtra("consumer");
        bundle = bundle.getStringExtra("params");
        mMainThreadHandler = new H(null);
        mProvider = new CommonsHttpOAuthProvider("https://twitter.com/oauth/request_token", "https://twitter.com/oauth/access_token", (new StringBuilder("https://twitter.com/oauth/authorize")).append(bundle).toString());
        mProvider.setOAuth10a(true);
        mSpinner = new ProgressDialog(this);
        mSpinner.setMessage(getResources().getString(R.string.loading_loading));
        mSpinner.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final TwitterActivity this$0;

            public void onCancel(DialogInterface dialoginterface)
            {
                cancel();
            }

            
            {
                this$0 = TwitterActivity.this;
                super();
            }
        });
        mWebView = (WebView)findViewById(R.id.twitter_webview);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setSaveFormData(false);
        mWebView.getSettings().setSavePassword(false);
        mWebView.setScrollBarStyle(0x2000000);
        mWebView.setWebViewClient(new TwitterWebViewClient(null));
        (new Thread() {

            final TwitterActivity this$0;

            public void run()
            {
                try
                {
                    Message message = new Message();
                    message.what = 1;
                    Bundle bundle1 = new Bundle();
                    bundle1.putString("url", mProvider.retrieveRequestToken(mConsumer, "gc://twitt"));
                    message.setData(bundle1);
                    mMainThreadHandler.sendMessage(message);
                    return;
                }
                catch (OAuthException oauthexception)
                {
                    error(oauthexception);
                }
            }

            
            {
                this$0 = TwitterActivity.this;
                super();
            }
        }).start();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (4 == i)
        {
            cancel();
            return true;
        } else
        {
            return false;
        }
    }









}
