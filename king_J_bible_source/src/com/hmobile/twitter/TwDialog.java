// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.twitter;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import android.widget.TextView;
import oauth.signpost.commonshttp.CommonsHttpOAuthConsumer;
import oauth.signpost.commonshttp.CommonsHttpOAuthProvider;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.exception.OAuthNotAuthorizedException;

// Referenced classes of package com.hmobile.twitter:
//            DialogError, Twitter, TwitterError

public class TwDialog extends Dialog
{
    private class TwWebViewClient extends WebViewClient
    {

        final TwDialog this$0;

        public void onPageFinished(WebView webview, String s)
        {
            super.onPageFinished(webview, s);
            webview = mWebView.getTitle();
            if (webview != null && webview.length() > 0)
            {
                mTitle.setText(webview);
            }
            mSpinner.dismiss();
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            Log.d("twitter", (new StringBuilder("WebView loading URL: ")).append(s).toString());
            super.onPageStarted(webview, s, bitmap);
            if (mSpinner.isShowing())
            {
                mSpinner.dismiss();
            }
            mSpinner.show();
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            super.onReceivedError(webview, i, s, s1);
            mListener.onError(new DialogError(s, i, s1));
            dismiss();
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            Log.d("twitter", (new StringBuilder("Redirect URL: ")).append(s).toString());
            if (s.startsWith("gc://twitt"))
            {
                retrieveAccessToken(s);
                return true;
            }
            if (s.startsWith("twitter://cancel"))
            {
                mListener.onCancel();
                dismiss();
                return true;
            } else
            {
                return false;
            }
        }

        private TwWebViewClient()
        {
            this$0 = TwDialog.this;
            super();
        }

        TwWebViewClient(TwWebViewClient twwebviewclient)
        {
            this();
        }
    }


    static final float DIMENSIONS_LANDSCAPE[] = {
        460F, 260F
    };
    static final float DIMENSIONS_PORTRAIT[] = {
        280F, 420F
    };
    static final android.widget.FrameLayout.LayoutParams FILL = new android.widget.FrameLayout.LayoutParams(-1, -1);
    static final int MARGIN = 4;
    static final int PADDING = 2;
    public static final String TAG = "twitter";
    static final int TW_BLUE = 0xffc0deed;
    private CommonsHttpOAuthConsumer mConsumer;
    private LinearLayout mContent;
    private Handler mHandler;
    private Drawable mIcon;
    private Twitter.DialogListener mListener;
    private CommonsHttpOAuthProvider mProvider;
    private ProgressDialog mSpinner;
    private TextView mTitle;
    private String mUrl;
    private WebView mWebView;

    public TwDialog(Context context, CommonsHttpOAuthProvider commonshttpoauthprovider, CommonsHttpOAuthConsumer commonshttpoauthconsumer, Twitter.DialogListener dialoglistener, Drawable drawable)
    {
        super(context);
        mProvider = commonshttpoauthprovider;
        mConsumer = commonshttpoauthconsumer;
        mListener = dialoglistener;
        mIcon = drawable;
        mHandler = new Handler();
    }

    private void retrieveAccessToken(final String url)
    {
        mSpinner.show();
        (new Thread() {

            final TwDialog this$0;
            private final String val$url;

            public void run()
            {
                Object obj = Uri.parse(url).getQueryParameter("oauth_verifier");
                Bundle bundle = new Bundle();
                try
                {
                    mProvider.retrieveAccessToken(mConsumer, ((String) (obj)));
                    bundle.putString("access_token", mConsumer.getToken());
                    bundle.putString("secret_token", mConsumer.getTokenSecret());
                    mListener.onComplete(bundle);
                }
                catch (OAuthMessageSignerException oauthmessagesignerexception)
                {
                    mListener.onError(new DialogError(oauthmessagesignerexception.getMessage(), -1, ((String) (obj))));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    mListener.onTwitterError(new TwitterError(((OAuthNotAuthorizedException) (obj)).getMessage()));
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    mListener.onTwitterError(new TwitterError(((OAuthExpectationFailedException) (obj)).getMessage()));
                }
                catch (OAuthCommunicationException oauthcommunicationexception)
                {
                    mListener.onError(new DialogError(oauthcommunicationexception.getMessage(), -1, ((String) (obj))));
                }
                mHandler.post(new Runnable() {

                    final _cls2 this$1;

                    public void run()
                    {
                        mSpinner.dismiss();
                        dismiss();
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                });
            }


            
            {
                this$0 = TwDialog.this;
                url = s;
                super();
            }
        }).start();
    }

    private void retrieveRequestToken()
    {
        mSpinner.show();
        (new Thread() {

            final TwDialog this$0;

            public void run()
            {
                try
                {
                    mUrl = mProvider.retrieveRequestToken(mConsumer, "gc://twitt");
                    mWebView.loadUrl(mUrl);
                    return;
                }
                catch (OAuthMessageSignerException oauthmessagesignerexception)
                {
                    mListener.onError(new DialogError(oauthmessagesignerexception.getMessage(), -1, Twitter.OAUTH_REQUEST_TOKEN));
                    return;
                }
                catch (OAuthNotAuthorizedException oauthnotauthorizedexception)
                {
                    mListener.onError(new DialogError(oauthnotauthorizedexception.getMessage(), -1, Twitter.OAUTH_REQUEST_TOKEN));
                    return;
                }
                catch (OAuthExpectationFailedException oauthexpectationfailedexception)
                {
                    mListener.onError(new DialogError(oauthexpectationfailedexception.getMessage(), -1, Twitter.OAUTH_REQUEST_TOKEN));
                    return;
                }
                catch (OAuthCommunicationException oauthcommunicationexception)
                {
                    mListener.onError(new DialogError(oauthcommunicationexception.getMessage(), -1, Twitter.OAUTH_REQUEST_TOKEN));
                }
            }

            
            {
                this$0 = TwDialog.this;
                super();
            }
        }).start();
    }

    private void setUpTitle()
    {
        requestWindowFeature(1);
        mTitle = new TextView(getContext());
        mTitle.setText("Twitter");
        mTitle.setTextColor(-1);
        mTitle.setTypeface(Typeface.DEFAULT_BOLD);
        mTitle.setBackgroundColor(0xffc0deed);
        mTitle.setPadding(6, 4, 4, 4);
        mTitle.setCompoundDrawablePadding(6);
        if (mIcon != null)
        {
            mTitle.setCompoundDrawablesWithIntrinsicBounds(mIcon, null, null, null);
        }
        mContent.addView(mTitle);
    }

    private void setUpWebView()
    {
        mWebView = new WebView(getContext());
        mWebView.setVerticalScrollBarEnabled(false);
        mWebView.setHorizontalScrollBarEnabled(false);
        mWebView.setWebViewClient(new TwWebViewClient(null));
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.loadUrl(mUrl);
        mWebView.setLayoutParams(FILL);
        mContent.addView(mWebView);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mSpinner = new ProgressDialog(getContext());
        mSpinner.requestWindowFeature(1);
        mSpinner.setMessage("Loading...");
        mContent = new LinearLayout(getContext());
        mContent.setOrientation(1);
        setUpTitle();
        setUpWebView();
        bundle = getWindow().getWindowManager().getDefaultDisplay();
        float f = getContext().getResources().getDisplayMetrics().density;
        if (bundle.getWidth() < bundle.getHeight())
        {
            bundle = DIMENSIONS_PORTRAIT;
        } else
        {
            bundle = DIMENSIONS_LANDSCAPE;
        }
        addContentView(mContent, new android.widget.FrameLayout.LayoutParams((int)(bundle[0] * f + 0.5F), (int)(bundle[1] * f + 0.5F)));
        retrieveRequestToken();
    }

    public void show()
    {
        super.show();
        mSpinner.show();
    }











}
