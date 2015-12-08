// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
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
import android.view.KeyEvent;
import android.view.MotionEvent;
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
import com.facebook.AccessToken;
import com.facebook.FacebookDialogException;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookRequestError;
import com.facebook.FacebookSdk;
import com.facebook.FacebookServiceException;
import java.util.Locale;

// Referenced classes of package com.facebook.internal:
//            ServerProtocol, Utility, Validate

public class WebDialog extends Dialog
{
    public static class Builder
    {

        private AccessToken accessToken;
        private String action;
        private String applicationId;
        private Context context;
        private OnCompleteListener listener;
        private Bundle parameters;
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
            if (accessToken != null)
            {
                parameters.putString("app_id", accessToken.getApplicationId());
                parameters.putString("access_token", accessToken.getToken());
            } else
            {
                parameters.putString("app_id", applicationId);
            }
            return new WebDialog(context, action, parameters, theme, listener);
        }

        public String getApplicationId()
        {
            return applicationId;
        }

        public Context getContext()
        {
            return context;
        }

        public OnCompleteListener getListener()
        {
            return listener;
        }

        public Bundle getParameters()
        {
            return parameters;
        }

        public int getTheme()
        {
            return theme;
        }

        public Builder setOnCompleteListener(OnCompleteListener oncompletelistener)
        {
            listener = oncompletelistener;
            return this;
        }

        public Builder setTheme(int i)
        {
            theme = i;
            return this;
        }

        public Builder(Context context1, String s, Bundle bundle)
        {
label0:
            {
                super();
                theme = 0x1030010;
                accessToken = AccessToken.getCurrentAccessToken();
                if (accessToken == null)
                {
                    String s1 = Utility.getMetadataApplicationId(context1);
                    if (s1 == null)
                    {
                        break label0;
                    }
                    applicationId = s1;
                }
                finishInit(context1, s, bundle);
                return;
            }
            throw new FacebookException("Attempted to create a builder without a valid access token or a valid default Application ID.");
        }

        public Builder(Context context1, String s, String s1, Bundle bundle)
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
            isPageFinished = true;
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
        }

        public void onReceivedSslError(WebView webview, SslErrorHandler sslerrorhandler, SslError sslerror)
        {
            super.onReceivedSslError(webview, sslerrorhandler, sslerror);
            sslerrorhandler.cancel();
            sendErrorToListener(new FacebookDialogException(null, -11, null));
        }

        public boolean shouldOverrideUrlLoading(WebView webview, String s)
        {
            boolean flag;
            flag = false;
            Utility.logd("FacebookSDK.WebDialog", (new StringBuilder()).append("Redirect URL: ").append(s).toString());
            if (!s.startsWith(expectedRedirectUrl)) goto _L2; else goto _L1
_L1:
            Bundle bundle = parseResponseUri(s);
            webview = bundle.getString("error");
            s = webview;
            if (webview == null)
            {
                s = bundle.getString("error_type");
            }
            Object obj = bundle.getString("error_msg");
            webview = ((WebView) (obj));
            if (obj == null)
            {
                webview = bundle.getString("error_message");
            }
            obj = webview;
            if (webview == null)
            {
                obj = bundle.getString("error_description");
            }
            webview = bundle.getString("error_code");
            int i;
            if (!Utility.isNullOrEmpty(webview))
            {
                try
                {
                    i = Integer.parseInt(webview);
                }
                // Misplaced declaration of an exception variable
                catch (WebView webview)
                {
                    i = -1;
                }
            } else
            {
                i = -1;
            }
            if (Utility.isNullOrEmpty(s) && Utility.isNullOrEmpty(((String) (obj))) && i == -1)
            {
                sendSuccessToListener(bundle);
            } else
            if (s != null && (s.equals("access_denied") || s.equals("OAuthAccessDeniedException")))
            {
                cancel();
            } else
            if (i == 4201)
            {
                cancel();
            } else
            {
                webview = new FacebookRequestError(i, s, ((String) (obj)));
                sendErrorToListener(new FacebookServiceException(webview, ((String) (obj))));
            }
            flag = true;
_L4:
            return flag;
_L2:
            if (s.startsWith("fbconnect://cancel"))
            {
                cancel();
                return true;
            }
            if (s.contains("touch")) goto _L4; else goto _L3
_L3:
            getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(s)));
            return true;
            webview;
            return false;
            if (true) goto _L6; else goto _L5
_L6:
            break MISSING_BLOCK_LABEL_159;
_L5:
        }

        private DialogWebViewClient()
        {
            this$0 = WebDialog.this;
            super();
        }

    }

    public static interface OnCompleteListener
    {

        public abstract void onComplete(Bundle bundle, FacebookException facebookexception);
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
    private boolean isPageFinished;
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
        int j = i;
        if (i == 0)
        {
            j = 0x1030010;
        }
        super(context, j);
        expectedRedirectUrl = "fbconnect://success";
        listenerCalled = false;
        isDetached = false;
        isPageFinished = false;
        url = s;
    }

    public WebDialog(Context context, String s, Bundle bundle, int i, OnCompleteListener oncompletelistener)
    {
        int j = i;
        if (i == 0)
        {
            j = 0x1030010;
        }
        super(context, j);
        expectedRedirectUrl = "fbconnect://success";
        listenerCalled = false;
        isDetached = false;
        isPageFinished = false;
        context = bundle;
        if (bundle == null)
        {
            context = new Bundle();
        }
        context.putString("redirect_uri", "fbconnect://success");
        context.putString("display", "touch");
        context.putString("sdk", String.format(Locale.ROOT, "android-%s", new Object[] {
            FacebookSdk.getSdkVersion()
        }));
        url = Utility.buildUri(ServerProtocol.getDialogAuthority(), (new StringBuilder()).append(ServerProtocol.getAPIVersion()).append("/").append("dialog/").append(s).toString(), context).toString();
        onCompleteListener = oncompletelistener;
    }

    private void createCrossImage()
    {
        crossImageView = new ImageView(getContext());
        crossImageView.setOnClickListener(new android.view.View.OnClickListener() {

            final WebDialog this$0;

            public void onClick(View view)
            {
                cancel();
            }

            
            {
                this$0 = WebDialog.this;
                super();
            }
        });
        Drawable drawable = getContext().getResources().getDrawable(com.facebook.R.drawable.com_facebook_close);
        crossImageView.setImageDrawable(drawable);
        crossImageView.setVisibility(4);
    }

    private int getScaledSize(int i, float f, int j, int k)
    {
        double d;
        int l;
        d = 0.5D;
        l = (int)((float)i / f);
        if (l > j) goto _L2; else goto _L1
_L1:
        d = 1.0D;
_L4:
        return (int)(d * (double)i);
_L2:
        if (l < k)
        {
            d = 0.5D + ((double)(k - l) / (double)(k - j)) * 0.5D;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void setUpWebView(int i)
    {
        LinearLayout linearlayout = new LinearLayout(getContext());
        webView = new WebView(getContext().getApplicationContext()) {

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
        webView.setWebViewClient(new DialogWebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl(url);
        webView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        webView.setVisibility(4);
        webView.getSettings().setSavePassword(false);
        webView.getSettings().setSaveFormData(false);
        webView.setFocusable(true);
        webView.setFocusableInTouchMode(true);
        webView.setOnTouchListener(new android.view.View.OnTouchListener() {

            final WebDialog this$0;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                if (!view.hasFocus())
                {
                    view.requestFocus();
                }
                return false;
            }

            
            {
                this$0 = WebDialog.this;
                super();
            }
        });
        linearlayout.setPadding(i, i, i, i);
        linearlayout.addView(webView);
        linearlayout.setBackgroundColor(0xcc000000);
        contentFrameLayout.addView(linearlayout);
    }

    public void cancel()
    {
        if (onCompleteListener != null && !listenerCalled)
        {
            sendErrorToListener(new FacebookOperationCanceledException());
        }
    }

    public void dismiss()
    {
        if (webView != null)
        {
            webView.stopLoading();
        }
        if (!isDetached && spinner != null && spinner.isShowing())
        {
            spinner.dismiss();
        }
        super.dismiss();
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

    protected boolean isPageFinished()
    {
        return isPageFinished;
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
        spinner.setMessage(getContext().getString(com.facebook.R.string.com_facebook_loading));
        spinner.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final WebDialog this$0;

            public void onCancel(DialogInterface dialoginterface)
            {
                cancel();
            }

            
            {
                this$0 = WebDialog.this;
                super();
            }
        });
        requestWindowFeature(1);
        contentFrameLayout = new FrameLayout(getContext());
        resize();
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

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            cancel();
        }
        return super.onKeyDown(i, keyevent);
    }

    protected void onStart()
    {
        super.onStart();
        resize();
    }

    protected Bundle parseResponseUri(String s)
    {
        s = Uri.parse(s);
        Bundle bundle = Utility.parseUrlQueryString(s.getQuery());
        bundle.putAll(Utility.parseUrlQueryString(s.getFragment()));
        return bundle;
    }

    public void resize()
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








/*
    static boolean access$702(WebDialog webdialog, boolean flag)
    {
        webdialog.isPageFinished = flag;
        return flag;
    }

*/
}
