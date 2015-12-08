// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.LOG;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package org.apache.cordova:
//            CordovaWebView, ExposedJsApi

public class CordovaChromeClient extends WebChromeClient
{

    private long MAX_QUOTA;
    private String TAG;
    private CordovaWebView appView;
    private CordovaInterface cordova;
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
            LOG.d(TAG, consolemessage.message());
        }
        return super.onConsoleMessage(consolemessage);
    }

    public void onExceededDatabaseQuota(String s, String s1, long l, long l1, long l2, android.webkit.WebStorage.QuotaUpdater quotaupdater)
    {
        LOG.d(TAG, "DroidGap:  onExceededDatabaseQuota estimatedSize: %d  currentQuota: %d  totalUsedQuota: %d", new Object[] {
            Long.valueOf(l1), Long.valueOf(l), Long.valueOf(l2)
        });
        if (l1 < MAX_QUOTA)
        {
            LOG.d(TAG, "calling quotaUpdater.updateQuota newQuota: %d", new Object[] {
                Long.valueOf(l1)
            });
            quotaupdater.updateQuota(l1);
            return;
        } else
        {
            quotaupdater.updateQuota(l);
            return;
        }
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
        webview.create();
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
        webview.create();
        webview.show();
        return true;
    }

    public boolean onJsPrompt(WebView webview, final String input, String s, String s1, final JsPromptResult res)
    {
        boolean flag;
        flag = false;
        if (input.startsWith("file://") || input.indexOf(appView.baseUrl) == 0 || appView.isUrlWhiteListed(input))
        {
            flag = true;
        }
        if (!flag || s1 == null || s1.length() <= 3 || !s1.substring(0, 4).equals("gap:")) goto _L2; else goto _L1
_L1:
        s1 = new JSONArray(s1.substring(4));
        webview = s1.getString(0);
        input = s1.getString(1);
        s1 = s1.getString(2);
        input = appView.exposedJsApi.exec(webview, input, s1, s);
        webview = input;
        if (input == null)
        {
            webview = "";
        }
        try
        {
            res.confirm(webview);
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview)
        {
            webview.printStackTrace();
        }
_L4:
        return true;
_L2:
        if (flag && s1 != null && s1.equals("gap_bridge_mode:"))
        {
            appView.exposedJsApi.setNativeToJsBridgeMode(Integer.parseInt(s));
            res.confirm("");
        } else
        if (flag && s1 != null && s1.equals("gap_poll:"))
        {
            input = appView.exposedJsApi.retrieveJsMessages();
            webview = input;
            if (input == null)
            {
                webview = "";
            }
            res.confirm(webview);
        } else
        if (s1 != null && s1.equals("gap_init:"))
        {
            res.confirm("OK");
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
            webview.create();
            webview.show();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        appView.showCustomView(view, customviewcallback);
    }

    public void setWebView(CordovaWebView cordovawebview)
    {
        appView = cordovawebview;
    }
}
