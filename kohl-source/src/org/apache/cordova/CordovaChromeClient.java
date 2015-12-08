// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

// Referenced classes of package org.apache.cordova:
//            CordovaWebView, LOG, CordovaInterface, CordovaBridge

public class CordovaChromeClient extends WebChromeClient
{

    public static final int FILECHOOSER_RESULTCODE = 5173;
    private long MAX_QUOTA;
    private String TAG;
    protected CordovaWebView appView;
    protected CordovaInterface cordova;
    public ValueCallback mUploadMessage;
    private View mVideoProgressView;

    public CordovaChromeClient(CordovaInterface cordovainterface)
    {
        TAG = "CordovaLog";
        MAX_QUOTA = 0x6400000L;
        cordova = cordovainterface;
    }

    public CordovaChromeClient(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        TAG = "CordovaLog";
        MAX_QUOTA = 0x6400000L;
        cordova = cordovainterface;
        appView = cordovawebview;
    }

    public ValueCallback getValueCallback()
    {
        return mUploadMessage;
    }

    public View getVideoLoadingProgressView()
    {
        if (mVideoProgressView == null)
        {
            LinearLayout linearlayout = new LinearLayout(appView.getContext());
            linearlayout.setOrientation(1);
            Object obj = new android.widget.RelativeLayout.LayoutParams(-2, -2);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).addRule(13);
            linearlayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            obj = new ProgressBar(appView.getContext());
            android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutparams.gravity = 17;
            ((ProgressBar) (obj)).setLayoutParams(layoutparams);
            linearlayout.addView(((View) (obj)));
            mVideoProgressView = linearlayout;
        }
        return mVideoProgressView;
    }

    public void onConsoleMessage(String s, int i, String s1)
    {
        if (android.os.Build.VERSION.SDK_INT == 7)
        {
            LOG.d(TAG, "%s: Line %d : %s", new Object[] {
                s1, Integer.valueOf(i), s
            });
            super.onConsoleMessage(s, i, s1);
        }
    }

    public boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        if (consolemessage.message() != null)
        {
            LOG.d(TAG, "%s: Line %d : %s", new Object[] {
                consolemessage.sourceId(), Integer.valueOf(consolemessage.lineNumber()), consolemessage.message()
            });
        }
        return super.onConsoleMessage(consolemessage);
    }

    public void onExceededDatabaseQuota(String s, String s1, long l, long l1, long l2, android.webkit.WebStorage.QuotaUpdater quotaupdater)
    {
        LOG.d(TAG, "onExceededDatabaseQuota estimatedSize: %d  currentQuota: %d  totalUsedQuota: %d", new Object[] {
            Long.valueOf(l1), Long.valueOf(l), Long.valueOf(l2)
        });
        quotaupdater.updateQuota(MAX_QUOTA);
    }

    public void onGeolocationPermissionsShowPrompt(String s, android.webkit.GeolocationPermissions.Callback callback)
    {
        super.onGeolocationPermissionsShowPrompt(s, callback);
        callback.invoke(s, true, false);
    }

    public void onHideCustomView()
    {
        appView.hideCustomView();
    }

    public boolean onJsAlert(WebView webview, String s, String s1, final JsResult result)
    {
        webview = new android.app.AlertDialog.Builder(cordova.getActivity());
        webview.setMessage(s1);
        webview.setTitle("Alert");
        webview.setCancelable(true);
        webview.setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

            final CordovaChromeClient this$0;
            final JsResult val$result;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                result.confirm();
            }

            
            {
                this$0 = CordovaChromeClient.this;
                result = jsresult;
                super();
            }
        });
        webview.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final CordovaChromeClient this$0;
            final JsResult val$result;

            public void onCancel(DialogInterface dialoginterface)
            {
                result.cancel();
            }

            
            {
                this$0 = CordovaChromeClient.this;
                result = jsresult;
                super();
            }
        });
        webview.setOnKeyListener(new android.content.DialogInterface.OnKeyListener() {

            final CordovaChromeClient this$0;
            final JsResult val$result;

            public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
            {
                if (i == 4)
                {
                    result.confirm();
                    return false;
                } else
                {
                    return true;
                }
            }

            
            {
                this$0 = CordovaChromeClient.this;
                result = jsresult;
                super();
            }
        });
        webview.show();
        return true;
    }

    public boolean onJsConfirm(WebView webview, String s, String s1, final JsResult result)
    {
        webview = new android.app.AlertDialog.Builder(cordova.getActivity());
        webview.setMessage(s1);
        webview.setTitle("Confirm");
        webview.setCancelable(true);
        webview.setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

            final CordovaChromeClient this$0;
            final JsResult val$result;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                result.confirm();
            }

            
            {
                this$0 = CordovaChromeClient.this;
                result = jsresult;
                super();
            }
        });
        webview.setNegativeButton(0x1040000, new android.content.DialogInterface.OnClickListener() {

            final CordovaChromeClient this$0;
            final JsResult val$result;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                result.cancel();
            }

            
            {
                this$0 = CordovaChromeClient.this;
                result = jsresult;
                super();
            }
        });
        webview.setOnCancelListener(new android.content.DialogInterface.OnCancelListener() {

            final CordovaChromeClient this$0;
            final JsResult val$result;

            public void onCancel(DialogInterface dialoginterface)
            {
                result.cancel();
            }

            
            {
                this$0 = CordovaChromeClient.this;
                result = jsresult;
                super();
            }
        });
        webview.setOnKeyListener(new android.content.DialogInterface.OnKeyListener() {

            final CordovaChromeClient this$0;
            final JsResult val$result;

            public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
            {
                if (i == 4)
                {
                    result.cancel();
                    return false;
                } else
                {
                    return true;
                }
            }

            
            {
                this$0 = CordovaChromeClient.this;
                result = jsresult;
                super();
            }
        });
        webview.show();
        return true;
    }

    public boolean onJsPrompt(WebView webview, final String input, String s, String s1, final JsPromptResult res)
    {
        webview = appView.bridge.promptOnJsPrompt(input, s, s1);
        if (webview != null)
        {
            res.confirm(webview);
        } else
        {
            webview = new android.app.AlertDialog.Builder(cordova.getActivity());
            webview.setMessage(s);
            input = new EditText(cordova.getActivity());
            if (s1 != null)
            {
                input.setText(s1);
            }
            webview.setView(input);
            webview.setCancelable(false);
            webview.setPositiveButton(0x104000a, new android.content.DialogInterface.OnClickListener() {

                final CordovaChromeClient this$0;
                final EditText val$input;
                final JsPromptResult val$res;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    dialoginterface = input.getText().toString();
                    res.confirm(dialoginterface);
                }

            
            {
                this$0 = CordovaChromeClient.this;
                input = edittext;
                res = jspromptresult;
                super();
            }
            });
            webview.setNegativeButton(0x1040000, new android.content.DialogInterface.OnClickListener() {

                final CordovaChromeClient this$0;
                final JsPromptResult val$res;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    res.cancel();
                }

            
            {
                this$0 = CordovaChromeClient.this;
                res = jspromptresult;
                super();
            }
            });
            webview.show();
        }
        return true;
    }

    public void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        appView.showCustomView(view, customviewcallback);
    }

    public void openFileChooser(ValueCallback valuecallback)
    {
        openFileChooser(valuecallback, "*/*");
    }

    public void openFileChooser(ValueCallback valuecallback, String s)
    {
        openFileChooser(valuecallback, s, null);
    }

    public void openFileChooser(ValueCallback valuecallback, String s, String s1)
    {
        mUploadMessage = valuecallback;
        valuecallback = new Intent("android.intent.action.GET_CONTENT");
        valuecallback.addCategory("android.intent.category.OPENABLE");
        valuecallback.setType("*/*");
        cordova.getActivity().startActivityForResult(Intent.createChooser(valuecallback, "File Browser"), 5173);
    }

    public void setWebView(CordovaWebView cordovawebview)
    {
        appView = cordovawebview;
    }
}
