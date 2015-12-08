// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.grantland.twitter;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.PaintDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.LayoutInflater;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.commonshttp.CommonsHttpOAuthProvider;
import oauth.signpost.exception.OAuthException;

// Referenced classes of package me.grantland.twitter:
//            TwitterError

public class TwitterDialog extends Dialog
{
    private class H extends Handler
    {

        final TwitterDialog this$0;

        public void handleMessage(Message message)
        {
            Bundle bundle = message.getData();
            switch (message.what)
            {
            case 0: // '\0'
            default:
                return;

            case -1: 
                error((Throwable)bundle.getSerializable("error"));
                return;

            case 1: // '\001'
                mWebView.loadUrl(bundle.getString("url"));
                return;

            case 2: // '\002'
                complete(bundle.getString("access_token"), bundle.getString("access_secret"));
                break;
            }
        }

        private H()
        {
            this$0 = TwitterDialog.this;
            super();
        }

        H(H h)
        {
            this();
        }
    }

    private class TwitterWebViewClient extends WebViewClient
    {

        final TwitterDialog this$0;

        public void onPageFinished(WebView webview, String s)
        {
            mSpinner.dismiss();
            mFrame.setVisibility(0);
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            super.onPageStarted(webview, s, bitmap);
            if (!mSpinner.isShowing())
            {
                mSpinner.show();
            }
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            super.onReceivedError(webview, i, s, s1);
            mListener.onError(new TwitterError(s, i, s1));
            dismiss();
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
            this$0 = TwitterDialog.this;
            super();
        }

        TwitterWebViewClient(TwitterWebViewClient twitterwebviewclient)
        {
            this();
        }
    }


    private static final int BORDER_ALPHA = 126;
    private static final int BORDER_RADIUS = 10;
    private static final boolean DEBUG = false;
    private static final int ERROR = -1;
    private static final String KEY_ACCESS_SECRET = "access_secret";
    private static final String KEY_ACCESS_TOKEN = "access_token";
    private static final String KEY_ERROR = "error";
    private static final String KEY_URL = "url";
    private static final int PADDING = 10;
    private static final int RETRIEVE_ACCESS_TOKEN = 2;
    private static final int RETRIEVE_REQUEST_TOKEN = 1;
    private static final String TAG = "me.grantland.twitter";
    private OAuthConsumer mConsumer;
    private FrameLayout mContent;
    private FrameLayout mFrame;
    private final Twitter.DialogListener mListener;
    private H mMainThreadHandler;
    private OAuthProvider mProvider;
    private ProgressDialog mSpinner;
    private String mUrl;
    private WebView mWebView;

    public TwitterDialog(Context context, OAuthConsumer oauthconsumer, String s, Twitter.DialogListener dialoglistener)
    {
        super(context, 0x1030010);
        mConsumer = oauthconsumer;
        mListener = dialoglistener;
        mMainThreadHandler = new H(null);
        mProvider = new CommonsHttpOAuthProvider("https://twitter.com/oauth/request_token", "https://twitter.com/oauth/access_token", (new StringBuilder("https://twitter.com/oauth/authorize")).append(s).toString());
        mProvider.setOAuth10a(true);
        (new Thread() {

            final TwitterDialog this$0;

            public void run()
            {
                Message message = new Message();
                Bundle bundle = new Bundle();
                try
                {
                    message.what = 1;
                    bundle.putString("url", mProvider.retrieveRequestToken(mConsumer, "gc://twitt"));
                }
                catch (OAuthException oauthexception)
                {
                    message.what = -1;
                    bundle.putSerializable("error", oauthexception);
                }
                message.setData(bundle);
                mMainThreadHandler.sendMessage(message);
            }

            
            {
                this$0 = TwitterDialog.this;
                super();
            }
        }).start();
    }

    private void complete(String s, String s1)
    {
        mListener.onComplete(s, s1);
        dismiss();
    }

    private void error(Throwable throwable)
    {
        mListener.onError(new TwitterError(throwable.getMessage()));
        dismiss();
    }

    private void retrieveAccessToken(final Uri uri)
    {
        (new Thread() {

            final TwitterDialog this$0;
            private final Uri val$uri;

            public void run()
            {
                Message message = new Message();
                Bundle bundle = new Bundle();
                try
                {
                    String s = uri.getQueryParameter("oauth_token");
                    String s1 = uri.getQueryParameter("oauth_verifier");
                    mConsumer.setTokenWithSecret(s, mConsumer.getConsumerSecret());
                    mProvider.retrieveAccessToken(mConsumer, s1);
                    message.what = 2;
                    bundle.putString("access_token", mConsumer.getToken());
                    bundle.putString("access_secret", mConsumer.getTokenSecret());
                }
                catch (OAuthException oauthexception)
                {
                    message.what = -1;
                    bundle.putSerializable("error", oauthexception);
                }
                message.setData(bundle);
                mMainThreadHandler.sendMessage(message);
            }

            
            {
                this$0 = TwitterDialog.this;
                uri = uri1;
                super();
            }
        }).start();
    }

    private void setUpWebView()
    {
        mWebView = (WebView)getLayoutInflater().inflate(R.layout.twitter_layout, null);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setSaveFormData(false);
        mWebView.getSettings().setSavePassword(false);
        mWebView.setWebViewClient(new TwitterWebViewClient(null));
        mWebView.loadUrl(mUrl);
        mContent.addView(mWebView);
    }

    public void cancel()
    {
        super.cancel();
    }

    public void dismiss()
    {
        super.dismiss();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        requestWindowFeature(1);
        mSpinner = new ProgressDialog(getContext());
        mSpinner.setMessage("Loading...");
        mSpinner.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final TwitterDialog this$0;

            public void onCancel(DialogInterface dialoginterface)
            {
                cancel();
            }

            
            {
                this$0 = TwitterDialog.this;
                super();
            }
        });
        mFrame = new FrameLayout(getContext());
        mFrame.setPadding(10, 10, 10, 10);
        setContentView(mFrame);
        mFrame.setVisibility(4);
        mContent = new FrameLayout(getContext());
        mContent.setPadding(10, 10, 10, 10);
        mFrame.addView(mContent);
        bundle = new PaintDrawable(0xff000000);
        bundle.setAlpha(126);
        bundle.setCornerRadius(10F);
        mContent.setBackgroundDrawable(bundle);
        setUpWebView();
        setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final TwitterDialog this$0;

            public void onCancel(DialogInterface dialoginterface)
            {
                mListener.onCancel();
            }

            
            {
                this$0 = TwitterDialog.this;
                super();
            }
        });
    }










}
