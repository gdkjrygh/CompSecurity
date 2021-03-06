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
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
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
import com.facebook.internal.ServerProtocol;
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

        public volatile BuilderBase setOnCompleteListener(OnCompleteListener oncompletelistener)
        {
            return super.setOnCompleteListener(oncompletelistener);
        }

        public volatile BuilderBase setTheme(int i)
        {
            return super.setTheme(i);
        }

        public Builder(Context context, Session session, String s, Bundle bundle)
        {
            super(context, session, s, bundle);
        }

        public Builder(Context context, String s)
        {
            super(context, s);
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

        protected BuilderBase(Context context1, String s)
        {
            theme = 0x1030010;
            Session session1 = Session.getActiveSession();
            if (session1 != null && session1.isOpened())
            {
                session = session1;
            } else
            {
                String s1 = Utility.getMetadataApplicationId(context1);
                if (s1 != null)
                {
                    applicationId = s1;
                } else
                {
                    throw new FacebookException("Attempted to create a builder without an open Active Session or a valid default Application ID.");
                }
            }
            finishInit(context1, s, null);
        }

        protected BuilderBase(Context context1, String s, String s1, Bundle bundle)
        {
            theme = 0x1030010;
            String s2 = s;
            if (s == null)
            {
                s2 = Utility.getMetadataApplicationId(context1);
            }
            Validate.notNullOrEmpty(s2, "applicationId");
            applicationId = s2;
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
            Utility.logd("FacebookSDK.WebDialog", (new StringBuilder("Webview loading URL: ")).append(s).toString());
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
        }

        public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
        {
            super.onReceivedSslError(webview, sslerrorhandler, sslerror);
            sslerrorhandler.cancel();
            sendErrorToListener(new FacebookDialogException(null, -11, null));
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            Utility.logd("FacebookSDK.WebDialog", (new StringBuilder("Redirect URL: ")).append(s).toString());
            if (s.startsWith(expectedRedirectUrl))
            {
                Bundle bundle = parseResponseUri(s);
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
                    return true;
                }
                if (webview != null && (webview.equals("access_denied") || webview.equals("OAuthAccessDeniedException")))
                {
                    sendCancelToListener();
                    return true;
                }
                if (i == 4201)
                {
                    sendCancelToListener();
                    return true;
                } else
                {
                    webview = new FacebookRequestError(i, webview, s);
                    sendErrorToListener(new FacebookServiceException(webview, s));
                    return true;
                }
            }
            if (s.startsWith("fbconnect://cancel"))
            {
                sendCancelToListener();
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

        DialogWebViewClient(DialogWebViewClient dialogwebviewclient)
        {
            this();
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

        public volatile BuilderBase setOnCompleteListener(OnCompleteListener oncompletelistener)
        {
            return super.setOnCompleteListener(oncompletelistener);
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

        public volatile BuilderBase setTheme(int i)
        {
            return super.setTheme(i);
        }

        public FeedDialogBuilder setTo(String s)
        {
            getParameters().putString("to", s);
            return this;
        }

        public FeedDialogBuilder(Context context)
        {
            super(context, "feed");
        }

        public FeedDialogBuilder(Context context, Session session)
        {
            super(context, session, "feed", null);
        }

        public FeedDialogBuilder(Context context, Session session, Bundle bundle)
        {
            super(context, session, "feed", bundle);
        }

        public FeedDialogBuilder(Context context, String s, Bundle bundle)
        {
            super(context, s, "feed", bundle);
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

        public volatile BuilderBase setOnCompleteListener(OnCompleteListener oncompletelistener)
        {
            return super.setOnCompleteListener(oncompletelistener);
        }

        public volatile BuilderBase setTheme(int i)
        {
            return super.setTheme(i);
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

        public RequestsDialogBuilder(Context context)
        {
            super(context, "apprequests");
        }

        public RequestsDialogBuilder(Context context, Session session)
        {
            super(context, session, "apprequests", null);
        }

        public RequestsDialogBuilder(Context context, Session session, Bundle bundle)
        {
            super(context, session, "apprequests", bundle);
        }

        public RequestsDialogBuilder(Context context, String s, Bundle bundle)
        {
            super(context, s, "apprequests", bundle);
        }
    }


    private static final int API_EC_DIALOG_CANCEL = 4201;
    private static final int BACKGROUND_GRAY = 0xcc000000;
    static final String CANCEL_URI = "fbconnect://cancel";
    public static final int DEFAULT_THEME = 0x1030010;
    static final boolean DISABLE_SSL_CHECK_FOR_TESTING = false;
    private static final String DISPLAY_TOUCH = "touch";
    private static final String LOG_TAG = "FacebookSDK.WebDialog";
    private static final int MAX_PADDING_SCREEN_HEIGHT = 1280;
    private static final int MAX_PADDING_SCREEN_WIDTH = 800;
    private static final double MIN_SCALE_FACTOR = 0.5D;
    private static final int NO_PADDING_SCREEN_HEIGHT = 800;
    private static final int NO_PADDING_SCREEN_WIDTH = 480;
    static final String REDIRECT_URI = "fbconnect://success";
    private FrameLayout contentFrameLayout;
    private ImageView crossImageView;
    private String expectedRedirectUrl;
    private boolean isDetached;
    private boolean isDismissed;
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
        expectedRedirectUrl = "fbconnect://success";
        listenerCalled = false;
        isDetached = false;
        isDismissed = false;
        url = s;
    }

    public WebDialog(Context context, String s, Bundle bundle, int i, OnCompleteListener oncompletelistener)
    {
        super(context, i);
        expectedRedirectUrl = "fbconnect://success";
        listenerCalled = false;
        isDetached = false;
        isDismissed = false;
        context = bundle;
        if (bundle == null)
        {
            context = new Bundle();
        }
        context.putString("redirect_uri", "fbconnect://success");
        context.putString("display", "touch");
        url = Utility.buildUri(ServerProtocol.getDialogAuthority(), (new StringBuilder(String.valueOf(ServerProtocol.getAPIVersion()))).append("/").append("dialog/").append(s).toString(), context).toString();
        onCompleteListener = oncompletelistener;
    }

    private void calculateSize()
    {
        Display display = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displaymetrics = new DisplayMetrics();
        display.getMetrics(displaymetrics);
        int i;
        int j;
        if (displaymetrics.widthPixels < displaymetrics.heightPixels)
        {
            i = displaymetrics.widthPixels;
        } else
        {
            i = displaymetrics.heightPixels;
        }
        if (displaymetrics.widthPixels < displaymetrics.heightPixels)
        {
            j = displaymetrics.heightPixels;
        } else
        {
            j = displaymetrics.widthPixels;
        }
        i = Math.min(getScaledSize(i, displaymetrics.density, 480, 800), displaymetrics.widthPixels);
        j = Math.min(getScaledSize(j, displaymetrics.density, 800, 1280), displaymetrics.heightPixels);
        getWindow().setLayout(i, j);
    }

    private void createCrossImage()
    {
        crossImageView = new ImageView(getContext());
        crossImageView.setOnClickListener(new android.view.View.OnClickListener() {

            final WebDialog this$0;

            public void onClick(View view)
            {
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

    private int getScaledSize(int i, float f, int j, int k)
    {
        int l = (int)((float)i / f);
        double d;
        if (l <= j)
        {
            d = 1.0D;
        } else
        if (l >= k)
        {
            d = 0.5D;
        } else
        {
            d = 0.5D + ((double)(k - l) / (double)(k - j)) * 0.5D;
        }
        return (int)((double)i * d);
    }

    private void setUpWebView(int i)
    {
        LinearLayout linearlayout = new LinearLayout(getContext());
        webView = new WebView(getContext()) {

            final WebDialog this$0;

            public void onWindowFocusChanged(boolean flag)
            {
                try
                {
                    super.onWindowFocusChanged(flag);
                    return;
                }
                catch (NullPointerException nullpointerexception)
                {
                    return;
                }
            }

            
            {
                this$0 = WebDialog.this;
                super(context);
            }
        };
        webView.setVerticalScrollBarEnabled(false);
        webView.setHorizontalScrollBarEnabled(false);
        webView.setWebViewClient(new DialogWebViewClient(null));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
        webView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        webView.setVisibility(4);
        webView.getSettings().setSavePassword(false);
        webView.getSettings().setSaveFormData(false);
        linearlayout.setPadding(i, i, i, i);
        linearlayout.addView(webView);
        linearlayout.setBackgroundColor(0xcc000000);
        contentFrameLayout.addView(linearlayout);
    }

    public void dismiss()
    {
        if (!isDismissed)
        {
            isDismissed = true;
            if (!listenerCalled)
            {
                sendCancelToListener();
            }
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
                return;
            }
        }
    }

    public OnCompleteListener getOnCompleteListener()
    {
        return onCompleteListener;
    }

    protected WebView getWebView()
    {
        return webView;
    }

    protected boolean isListenerCalled()
    {
        return listenerCalled;
    }

    public void onAttachedToWindow()
    {
        isDetached = false;
        super.onAttachedToWindow();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        spinner = new ProgressDialog(getContext());
        spinner.requestWindowFeature(1);
        spinner.setMessage(getContext().getString(com.facebook.android.R.string.com_facebook_loading));
        spinner.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final WebDialog this$0;

            public void onCancel(DialogInterface dialoginterface)
            {
                dismiss();
            }

            
            {
                this$0 = WebDialog.this;
                super();
            }
        });
        requestWindowFeature(1);
        contentFrameLayout = new FrameLayout(getContext());
        calculateSize();
        getWindow().setGravity(17);
        getWindow().setSoftInputMode(16);
        createCrossImage();
        setUpWebView(crossImageView.getDrawable().getIntrinsicWidth() / 2 + 1);
        contentFrameLayout.addView(crossImageView, new android.view.ViewGroup.LayoutParams(-2, -2));
        setContentView(contentFrameLayout);
    }

    public void onDetachedFromWindow()
    {
        isDetached = true;
        super.onDetachedFromWindow();
    }

    protected Bundle parseResponseUri(String s)
    {
        s = Uri.parse(s);
        Bundle bundle = Utility.parseUrlQueryString(s.getQuery());
        bundle.putAll(Utility.parseUrlQueryString(s.getFragment()));
        return bundle;
    }

    protected void sendCancelToListener()
    {
        sendErrorToListener(new FacebookOperationCanceledException());
    }

    protected void sendErrorToListener(Throwable throwable)
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
            dismiss();
        }
    }

    protected void sendSuccessToListener(Bundle bundle)
    {
        if (onCompleteListener != null && !listenerCalled)
        {
            listenerCalled = true;
            onCompleteListener.onComplete(bundle, null);
            dismiss();
        }
    }

    protected void setExpectedRedirectUrl(String s)
    {
        expectedRedirectUrl = s;
    }

    public void setOnCompleteListener(OnCompleteListener oncompletelistener)
    {
        onCompleteListener = oncompletelistener;
    }






}
