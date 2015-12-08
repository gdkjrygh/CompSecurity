// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookServiceException;
import com.facebook.Session;
import com.facebook.android.Util;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;

public class WebDialog extends Dialog
{
    public static class Builder extends BuilderBase
    {

        public volatile WebDialog build()
        {
            return super.build();
        }

        public Builder(Context context, Session session, String s, Bundle bundle)
        {
            super(context, session, s, bundle);
        }

        public Builder(Context context, String s, String s1, Bundle bundle)
        {
            super(context, s, s1, bundle);
        }
    }

    private static class BuilderBase
    {

        private String action;
        private String applicationId;
        private Context context;
        private OnCompleteListener listener;
        private Bundle parameters;
        private Session session;
        private int theme;

        private void finishInit(Context context1, String s, Bundle bundle)
        {
            context = context1;
            action = s;
            if (bundle != null)
            {
                parameters = bundle;
                return;
            } else
            {
                parameters = new Bundle();
                return;
            }
        }

        public WebDialog build()
        {
            if (session != null && session.isOpened())
            {
                parameters.putString("app_id", session.getApplicationId());
                parameters.putString("access_token", session.getAccessToken());
            } else
            {
                parameters.putString("app_id", applicationId);
            }
            if (!parameters.containsKey("redirect_uri"))
            {
                parameters.putString("redirect_uri", "fbconnect://success");
            }
            return new WebDialog(context, action, parameters, theme, listener);
        }

        protected String getApplicationId()
        {
            return applicationId;
        }

        protected Context getContext()
        {
            return context;
        }

        protected OnCompleteListener getListener()
        {
            return listener;
        }

        protected Bundle getParameters()
        {
            return parameters;
        }

        protected int getTheme()
        {
            return theme;
        }

        public BuilderBase setOnCompleteListener(OnCompleteListener oncompletelistener)
        {
            listener = oncompletelistener;
            return this;
        }

        public BuilderBase setTheme(int i)
        {
            theme = i;
            return this;
        }

        protected BuilderBase(Context context1, Session session1, String s, Bundle bundle)
        {
            theme = 0x1030010;
            Validate.notNull(session1, "session");
            if (!session1.isOpened())
            {
                throw new FacebookException("Attempted to use a Session that was not open.");
            } else
            {
                session = session1;
                finishInit(context1, s, bundle);
                return;
            }
        }

        protected BuilderBase(Context context1, String s, String s1, Bundle bundle)
        {
            theme = 0x1030010;
            Validate.notNullOrEmpty(s, "applicationId");
            applicationId = s;
            finishInit(context1, s1, bundle);
        }
    }

    private class DialogWebViewClient extends WebViewClient
    {

        final WebDialog this$0;

        public void onPageFinished(WebView webview, String s)
        {
            super.onPageFinished(webview, s);
            if (!isDetached)
            {
                spinner.dismiss();
            }
            contentFrameLayout.setBackgroundColor(0);
            webView.setVisibility(0);
            crossImageView.setVisibility(0);
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            Utility.logd("FacebookSDK.WebDialog", (new StringBuilder()).append("Webview loading URL: ").append(s).toString());
            super.onPageStarted(webview, s, bitmap);
            if (!isDetached)
            {
                spinner.show();
            }
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            super.onReceivedError(webview, i, s, s1);
            sendErrorToListener(new FacebookDialogException(s, i, s1));
            dismiss();
        }

        public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
        {
            super.onReceivedSslError(webview, sslerrorhandler, sslerror);
            sendErrorToListener(new FacebookDialogException(null, -11, null));
            sslerrorhandler.cancel();
            dismiss();
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            Utility.logd("FacebookSDK.WebDialog", (new StringBuilder()).append("Redirect URL: ").append(s).toString());
            if (s.startsWith("fbconnect://success"))
            {
                Bundle bundle = Util.parseUrl(s);
                s = bundle.getString("error");
                webview = s;
                if (s == null)
                {
                    webview = bundle.getString("error_type");
                }
                String s1 = bundle.getString("error_msg");
                s = s1;
                if (s1 == null)
                {
                    s = bundle.getString("error_description");
                }
                s1 = bundle.getString("error_code");
                int i = -1;
                if (!Utility.isNullOrEmpty(s1))
                {
                    try
                    {
                        i = Integer.parseInt(s1);
                    }
                    catch (NumberFormatException numberformatexception)
                    {
                        i = -1;
                    }
                }
                if (Utility.isNullOrEmpty(webview) && Utility.isNullOrEmpty(s) && i == -1)
                {
                    sendSuccessToListener(bundle);
                } else
                if (webview != null && (webview.equals("access_denied") || webview.equals("OAuthAccessDeniedException")))
                {
                    sendCancelToListener();
                } else
                {
                    webview = new FacebookRequestError(i, webview, s);
                    sendErrorToListener(new FacebookServiceException(webview, s));
                }
                dismiss();
                return true;
            }
            if (s.startsWith("fbconnect://cancel"))
            {
                sendCancelToListener();
                dismiss();
                return true;
            }
            if (s.contains("touch"))
            {
                return false;
            } else
            {
                getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
                return true;
            }
        }

        private DialogWebViewClient()
        {
            this$0 = WebDialog.this;
            super();
        }

    }

    public static class FeedDialogBuilder extends BuilderBase
    {

        private static final String CAPTION_PARAM = "caption";
        private static final String DESCRIPTION_PARAM = "description";
        private static final String FEED_DIALOG = "feed";
        private static final String FROM_PARAM = "from";
        private static final String LINK_PARAM = "link";
        private static final String NAME_PARAM = "name";
        private static final String PICTURE_PARAM = "picture";
        private static final String SOURCE_PARAM = "source";
        private static final String TO_PARAM = "to";

        public volatile WebDialog build()
        {
            return super.build();
        }

        public FeedDialogBuilder setCaption(String s)
        {
            getParameters().putString("caption", s);
            return this;
        }

        public FeedDialogBuilder setDescription(String s)
        {
            getParameters().putString("description", s);
            return this;
        }

        public FeedDialogBuilder setFrom(String s)
        {
            getParameters().putString("from", s);
            return this;
        }

        public FeedDialogBuilder setLink(String s)
        {
            getParameters().putString("link", s);
            return this;
        }

        public FeedDialogBuilder setName(String s)
        {
            getParameters().putString("name", s);
            return this;
        }

        public FeedDialogBuilder setPicture(String s)
        {
            getParameters().putString("picture", s);
            return this;
        }

        public FeedDialogBuilder setSource(String s)
        {
            getParameters().putString("source", s);
            return this;
        }

        public FeedDialogBuilder setTo(String s)
        {
            getParameters().putString("to", s);
            return this;
        }

        public FeedDialogBuilder(Context context, Session session)
        {
            super(context, session, "feed", null);
        }

        public FeedDialogBuilder(Context context, Session session, Bundle bundle)
        {
            super(context, session, "feed", bundle);
        }
    }

    public static interface OnCompleteListener
    {

        public abstract void onComplete(Bundle bundle, FacebookException facebookexception);
    }

    public static class RequestsDialogBuilder extends BuilderBase
    {

        private static final String APPREQUESTS_DIALOG = "apprequests";
        private static final String DATA_PARAM = "data";
        private static final String MESSAGE_PARAM = "message";
        private static final String TITLE_PARAM = "title";
        private static final String TO_PARAM = "to";

        public volatile WebDialog build()
        {
            return super.build();
        }

        public RequestsDialogBuilder setData(String s)
        {
            getParameters().putString("data", s);
            return this;
        }

        public RequestsDialogBuilder setMessage(String s)
        {
            getParameters().putString("message", s);
            return this;
        }

        public RequestsDialogBuilder setTitle(String s)
        {
            getParameters().putString("title", s);
            return this;
        }

        public RequestsDialogBuilder setTo(String s)
        {
            getParameters().putString("to", s);
            return this;
        }

        public RequestsDialogBuilder(Context context, Session session)
        {
            super(context, session, "apprequests", null);
        }

        public RequestsDialogBuilder(Context context, Session session, Bundle bundle)
        {
            super(context, session, "apprequests", bundle);
        }
    }


    static final String CANCEL_URI = "fbconnect://cancel";
    public static final int DEFAULT_THEME = 0x1030010;
    static final boolean DISABLE_SSL_CHECK_FOR_TESTING = false;
    private static final String DISPLAY_TOUCH = "touch";
    private static final String LOG_TAG = "FacebookSDK.WebDialog";
    static final String REDIRECT_URI = "fbconnect://success";
    private static final String USER_AGENT = "user_agent";
    private FrameLayout contentFrameLayout;
    private ImageView crossImageView;
    private boolean isDetached;
    private boolean listenerCalled;
    private OnCompleteListener onCompleteListener;
    private ProgressDialog spinner;
    private String url;
    private WebView webView;

    public WebDialog(Context context, String s)
    {
        this(context, s, 0x1030010);
    }

    public WebDialog(Context context, String s, int i)
    {
        super(context, i);
        listenerCalled = false;
        isDetached = false;
        url = s;
    }

    public WebDialog(Context context, String s, Bundle bundle, int i, OnCompleteListener oncompletelistener)
    {
        super(context, i);
        listenerCalled = false;
        isDetached = false;
        context = bundle;
        if (bundle == null)
        {
            context = new Bundle();
        }
        context.putString("display", "touch");
        context.putString("type", "user_agent");
        url = Utility.buildUri("m.facebook.com", (new StringBuilder()).append("dialog/").append(s).toString(), context).toString();
        onCompleteListener = oncompletelistener;
    }

    private void createCrossImage()
    {
        crossImageView = new ImageView(getContext());
        crossImageView.setOnClickListener(new android.view.View.OnClickListener() {

            final WebDialog this$0;

            public void onClick(View view)
            {
                sendCancelToListener();
                dismiss();
            }

            
            {
                this$0 = WebDialog.this;
                super();
            }
        });
        Drawable drawable = getContext().getResources().getDrawable(com.facebook.android.R.drawable.com_facebook_close);
        crossImageView.setImageDrawable(drawable);
        crossImageView.setVisibility(4);
    }

    private void sendCancelToListener()
    {
        sendErrorToListener(new FacebookOperationCanceledException());
    }

    private void sendErrorToListener(Throwable throwable)
    {
        if (onCompleteListener != null && !listenerCalled)
        {
            listenerCalled = true;
            if (throwable instanceof FacebookException)
            {
                throwable = (FacebookException)throwable;
            } else
            {
                throwable = new FacebookException(throwable);
            }
            onCompleteListener.onComplete(null, throwable);
        }
    }

    private void sendSuccessToListener(Bundle bundle)
    {
        if (onCompleteListener != null && !listenerCalled)
        {
            listenerCalled = true;
            onCompleteListener.onComplete(bundle, null);
        }
    }

    private void setUpWebView(int i)
    {
        LinearLayout linearlayout = new LinearLayout(getContext());
        webView = new WebView(getContext());
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setWebViewClient(new DialogWebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
        webView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        webView.setVisibility(4);
        webView.getSettings().setSavePassword(false);
        linearlayout.setPadding(i, i, i, i);
        linearlayout.addView(webView);
        contentFrameLayout.addView(linearlayout);
    }

    public void dismiss()
    {
        if (webView != null)
        {
            webView.stopLoading();
        }
        if (!isDetached)
        {
            if (spinner.isShowing())
            {
                spinner.dismiss();
            }
            super.dismiss();
        }
    }

    public OnCompleteListener getOnCompleteListener()
    {
        return onCompleteListener;
    }

    public void onAttachedToWindow()
    {
        isDetached = false;
        super.onAttachedToWindow();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final WebDialog this$0;

            public void onCancel(DialogInterface dialoginterface)
            {
                sendCancelToListener();
            }

            
            {
                this$0 = WebDialog.this;
                super();
            }
        });
        spinner = new ProgressDialog(getContext());
        spinner.requestWindowFeature(1);
        spinner.setMessage(getContext().getString(com.facebook.android.R.string.com_facebook_loading));
        spinner.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final WebDialog this$0;

            public void onCancel(DialogInterface dialoginterface)
            {
                sendCancelToListener();
                dismiss();
            }

            
            {
                this$0 = WebDialog.this;
                super();
            }
        });
        requestWindowFeature(1);
        contentFrameLayout = new FrameLayout(getContext());
        createCrossImage();
        setUpWebView(crossImageView.getDrawable().getIntrinsicWidth() / 2);
        contentFrameLayout.addView(crossImageView, new android.view.ViewGroup.LayoutParams(-2, -2));
        addContentView(contentFrameLayout, new android.view.ViewGroup.LayoutParams(-1, -1));
    }

    public void onDetachedFromWindow()
    {
        isDetached = true;
        super.onDetachedFromWindow();
    }

    public void setOnCompleteListener(OnCompleteListener oncompletelistener)
    {
        onCompleteListener = oncompletelistener;
    }








}
