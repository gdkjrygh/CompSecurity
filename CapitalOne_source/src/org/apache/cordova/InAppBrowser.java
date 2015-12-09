// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.StringTokenizer;
import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.CordovaPlugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova:
//            CordovaWebView

public class InAppBrowser extends CordovaPlugin
{
    public class InAppBrowserClient extends WebViewClient
    {

        EditText edittext;
        final InAppBrowser this$0;
        CordovaWebView webView;

        public void onPageFinished(WebView webview, String s)
        {
            super.onPageFinished(webview, s);
            try
            {
                webview = new JSONObject();
                webview.put("type", "loadstop");
                webview.put("url", s);
                sendUpdate(webview, true);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                Log.d("InAppBrowser", "Should never happen");
            }
        }

        public void onPageStarted(WebView webview, String s, Bitmap bitmap)
        {
            super.onPageStarted(webview, s, bitmap);
            if (s.startsWith("http:") || s.startsWith("https:") || s.startsWith("file:"))
            {
                webview = s;
            } else
            {
                webview = (new StringBuilder()).append("http://").append(s).toString();
            }
            if (!webview.equals(edittext.getText().toString()))
            {
                edittext.setText(webview);
            }
            try
            {
                s = new JSONObject();
                s.put("type", "loadstart");
                s.put("url", webview);
                sendUpdate(s, true);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (WebView webview)
            {
                Log.d("InAppBrowser", "Should never happen");
            }
        }

        public InAppBrowserClient(CordovaWebView cordovawebview, EditText edittext1)
        {
            this$0 = InAppBrowser.this;
            super();
            webView = cordovawebview;
            edittext = edittext1;
        }
    }


    private static final String EXIT_EVENT = "exit";
    private static final String LOAD_START_EVENT = "loadstart";
    private static final String LOAD_STOP_EVENT = "loadstop";
    private static final String LOCATION = "location";
    protected static final String LOG_TAG = "InAppBrowser";
    private static final String NULL = "null";
    private static final String SELF = "_self";
    private static final String SYSTEM = "_system";
    private CallbackContext callbackContext;
    private Dialog dialog;
    private EditText edittext;
    private WebView inAppWebView;
    private boolean showLocationBar;

    public InAppBrowser()
    {
        showLocationBar = true;
    }

    private void closeDialog()
    {
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("type", "exit");
            sendUpdate(jsonobject, false);
        }
        catch (JSONException jsonexception)
        {
            Log.d("InAppBrowser", "Should never happen");
        }
        if (dialog != null)
        {
            dialog.dismiss();
        }
    }

    private boolean getShowLocationBar()
    {
        return showLocationBar;
    }

    private void goBack()
    {
        if (inAppWebView.canGoBack())
        {
            inAppWebView.goBack();
        }
    }

    private void goForward()
    {
        if (inAppWebView.canGoForward())
        {
            inAppWebView.goForward();
        }
    }

    private void navigate(String s)
    {
        ((InputMethodManager)cordova.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(edittext.getWindowToken(), 0);
        if (!s.startsWith("http") && !s.startsWith("file:"))
        {
            inAppWebView.loadUrl((new StringBuilder()).append("http://").append(s).toString());
        } else
        {
            inAppWebView.loadUrl(s);
        }
        inAppWebView.requestFocus();
    }

    private HashMap parseFeature(String s)
    {
        if (!s.equals("null")) goto _L2; else goto _L1
_L1:
        s = null;
_L4:
        return s;
_L2:
        HashMap hashmap = new HashMap();
        StringTokenizer stringtokenizer = new StringTokenizer(s, ",");
        do
        {
            s = hashmap;
            if (!stringtokenizer.hasMoreElements())
            {
                continue;
            }
            s = new StringTokenizer(stringtokenizer.nextToken(), "=");
            if (s.hasMoreElements())
            {
                String s1 = s.nextToken();
                if (s.nextToken().equals("no"))
                {
                    s = Boolean.FALSE;
                } else
                {
                    s = Boolean.TRUE;
                }
                hashmap.put(s1, s);
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void sendUpdate(JSONObject jsonobject, boolean flag)
    {
        jsonobject = new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, jsonobject);
        jsonobject.setKeepCallback(flag);
        callbackContext.sendPluginResult(jsonobject);
    }

    private String updateUrl(String s)
    {
        String s1 = s;
        if (Uri.parse(s).isRelative())
        {
            s1 = (new StringBuilder()).append(webView.getUrl().substring(0, webView.getUrl().lastIndexOf("/") + 1)).append(s).toString();
        }
        return s1;
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        org.apache.cordova.api.PluginResult.Status status;
        String s1;
        status = org.apache.cordova.api.PluginResult.Status.OK;
        s1 = "";
        callbackContext = callbackcontext;
        if (!s.equals("open")) goto _L2; else goto _L1
_L1:
        String s2;
        s2 = jsonarray.getString(0);
        callbackcontext = jsonarray.optString(1);
        if (callbackcontext == null) goto _L4; else goto _L3
_L3:
        if (callbackcontext.equals("")) goto _L4; else goto _L5
_L5:
        s = callbackcontext;
        if (!callbackcontext.equals("null")) goto _L6; else goto _L4
_L6:
        jsonarray = parseFeature(jsonarray.optString(2));
        Log.d("InAppBrowser", (new StringBuilder()).append("target = ").append(s).toString());
        callbackcontext = updateUrl(s2);
        if (!"_self".equals(s)) goto _L8; else goto _L7
_L7:
        Log.d("InAppBrowser", "in self");
        if (!callbackcontext.startsWith("file://") && !callbackcontext.startsWith("javascript:") && !webView.isUrlWhiteListed(callbackcontext)) goto _L10; else goto _L9
_L9:
        webView.loadUrl(callbackcontext);
        jsonarray = status;
        s = s1;
_L11:
        try
        {
            s = new PluginResult(jsonarray, s);
            s.setKeepCallback(true);
            callbackContext.sendPluginResult(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.api.PluginResult.Status.JSON_EXCEPTION));
            return true;
        }
        return true;
_L10:
        s = showWebPage(callbackcontext, jsonarray);
        jsonarray = status;
        continue; /* Loop/switch isn't completed */
_L8:
        if (!"_system".equals(s))
        {
            break MISSING_BLOCK_LABEL_240;
        }
        Log.d("InAppBrowser", "in system");
        s = openExternal(callbackcontext);
        jsonarray = status;
        continue; /* Loop/switch isn't completed */
        Log.d("InAppBrowser", "in blank");
        s = showWebPage(callbackcontext, jsonarray);
        jsonarray = status;
        continue; /* Loop/switch isn't completed */
_L2:
        if (!s.equals("close"))
        {
            break MISSING_BLOCK_LABEL_329;
        }
        closeDialog();
        s = new PluginResult(org.apache.cordova.api.PluginResult.Status.OK);
        s.setKeepCallback(false);
        callbackContext.sendPluginResult(s);
        s = s1;
        jsonarray = status;
        continue; /* Loop/switch isn't completed */
        jsonarray = org.apache.cordova.api.PluginResult.Status.INVALID_ACTION;
        s = s1;
        if (true) goto _L11; else goto _L4
_L4:
        s = "_self";
        if (true) goto _L6; else goto _L12
_L12:
    }

    public String openExternal(String s)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(s));
        cordova.getActivity().startActivity(intent);
        return "";
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
_L2:
        Log.d("InAppBrowser", (new StringBuilder()).append("InAppBrowser: Error loading url ").append(s).append(":").append(activitynotfoundexception.toString()).toString());
        return activitynotfoundexception.toString();
        activitynotfoundexception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public String showWebPage(final String url, HashMap hashmap)
    {
        showLocationBar = true;
        if (hashmap != null)
        {
            showLocationBar = ((Boolean)hashmap.get("location")).booleanValue();
        }
        url = new Runnable() {

            final InAppBrowser this$0;
            final CordovaWebView val$thatWebView;
            final String val$url;

            private int dpToPixels(int i)
            {
                return (int)TypedValue.applyDimension(1, i, cordova.getActivity().getResources().getDisplayMetrics());
            }

            public void run()
            {
                dialog = new Dialog(cordova.getActivity(), 0x1030006);
                dialog.getWindow().getAttributes().windowAnimations = 0x1030002;
                dialog.requestWindowFeature(1);
                dialog.setCancelable(true);
                dialog.setOnDismissListener(new android.content.DialogInterface.OnDismissListener() {

                    final _cls1 this$1;

                    public void onDismiss(DialogInterface dialoginterface)
                    {
                        try
                        {
                            dialoginterface = new JSONObject();
                            dialoginterface.put("type", "exit");
                            sendUpdate(dialoginterface, false);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (DialogInterface dialoginterface)
                        {
                            Log.d("InAppBrowser", "Should never happen");
                        }
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
                LinearLayout linearlayout = new LinearLayout(cordova.getActivity());
                linearlayout.setOrientation(1);
                Object obj = new RelativeLayout(cordova.getActivity());
                ((RelativeLayout) (obj)).setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-1, dpToPixels(44)));
                ((RelativeLayout) (obj)).setPadding(dpToPixels(2), dpToPixels(2), dpToPixels(2), dpToPixels(2));
                ((RelativeLayout) (obj)).setHorizontalGravity(3);
                ((RelativeLayout) (obj)).setVerticalGravity(48);
                RelativeLayout relativelayout = new RelativeLayout(cordova.getActivity());
                relativelayout.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
                relativelayout.setHorizontalGravity(3);
                relativelayout.setVerticalGravity(16);
                relativelayout.setId(1);
                Button button = new Button(cordova.getActivity());
                Object obj1 = new android.widget.RelativeLayout.LayoutParams(-2, -1);
                ((android.widget.RelativeLayout.LayoutParams) (obj1)).addRule(5);
                button.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
                button.setContentDescription("Back Button");
                button.setId(2);
                button.setText("<");
                button.setOnClickListener(new android.view.View.OnClickListener() {

                    final _cls1 this$1;

                    public void onClick(View view)
                    {
                        goBack();
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
                obj1 = new Button(cordova.getActivity());
                Object obj2 = new android.widget.RelativeLayout.LayoutParams(-2, -1);
                ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(1, 2);
                ((Button) (obj1)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj2)));
                ((Button) (obj1)).setContentDescription("Forward Button");
                ((Button) (obj1)).setId(3);
                ((Button) (obj1)).setText(">");
                ((Button) (obj1)).setOnClickListener(new android.view.View.OnClickListener() {

                    final _cls1 this$1;

                    public void onClick(View view)
                    {
                        goForward();
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
                edittext = new EditText(cordova.getActivity());
                obj2 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(1, 1);
                ((android.widget.RelativeLayout.LayoutParams) (obj2)).addRule(0, 5);
                edittext.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj2)));
                edittext.setId(4);
                edittext.setSingleLine(true);
                edittext.setText(url);
                edittext.setInputType(16);
                edittext.setImeOptions(2);
                edittext.setInputType(0);
                edittext.setOnKeyListener(new android.view.View.OnKeyListener() {

                    final _cls1 this$1;

                    public boolean onKey(View view, int i, KeyEvent keyevent)
                    {
                        if (keyevent.getAction() == 0 && i == 66)
                        {
                            navigate(edittext.getText().toString());
                            return true;
                        } else
                        {
                            return false;
                        }
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
                obj2 = new Button(cordova.getActivity());
                Object obj3 = new android.widget.RelativeLayout.LayoutParams(-2, -1);
                ((android.widget.RelativeLayout.LayoutParams) (obj3)).addRule(11);
                ((Button) (obj2)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj3)));
                ((Button) (obj1)).setContentDescription("Close Button");
                ((Button) (obj2)).setId(5);
                ((Button) (obj2)).setText("Done");
                ((Button) (obj2)).setOnClickListener(new android.view.View.OnClickListener() {

                    final _cls1 this$1;

                    public void onClick(View view)
                    {
                        closeDialog();
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
                inAppWebView = new WebView(cordova.getActivity());
                inAppWebView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
                inAppWebView.setWebChromeClient(new WebChromeClient());
                obj3 = new InAppBrowserClient(thatWebView, edittext);
                inAppWebView.setWebViewClient(((WebViewClient) (obj3)));
                obj3 = inAppWebView.getSettings();
                ((WebSettings) (obj3)).setJavaScriptEnabled(true);
                ((WebSettings) (obj3)).setJavaScriptCanOpenWindowsAutomatically(true);
                ((WebSettings) (obj3)).setBuiltInZoomControls(true);
                ((WebSettings) (obj3)).setPluginsEnabled(true);
                ((WebSettings) (obj3)).setDomStorageEnabled(true);
                inAppWebView.loadUrl(url);
                inAppWebView.setId(6);
                inAppWebView.getSettings().setLoadWithOverviewMode(true);
                inAppWebView.getSettings().setUseWideViewPort(true);
                inAppWebView.requestFocus();
                inAppWebView.requestFocusFromTouch();
                relativelayout.addView(button);
                relativelayout.addView(((View) (obj1)));
                ((RelativeLayout) (obj)).addView(relativelayout);
                ((RelativeLayout) (obj)).addView(edittext);
                ((RelativeLayout) (obj)).addView(((View) (obj2)));
                if (getShowLocationBar())
                {
                    linearlayout.addView(((View) (obj)));
                }
                linearlayout.addView(inAppWebView);
                obj = new android.view.WindowManager.LayoutParams();
                ((android.view.WindowManager.LayoutParams) (obj)).copyFrom(dialog.getWindow().getAttributes());
                obj.width = -1;
                obj.height = -1;
                dialog.setContentView(linearlayout);
                dialog.show();
                dialog.getWindow().setAttributes(((android.view.WindowManager.LayoutParams) (obj)));
            }

            
            {
                this$0 = InAppBrowser.this;
                url = s;
                thatWebView = cordovawebview;
                super();
            }
        };
        cordova.getActivity().runOnUiThread(url);
        return "";
    }



/*
    static Dialog access$002(InAppBrowser inappbrowser, Dialog dialog1)
    {
        inappbrowser.dialog = dialog1;
        return dialog1;
    }

*/






/*
    static EditText access$402(InAppBrowser inappbrowser, EditText edittext1)
    {
        inappbrowser.edittext = edittext1;
        return edittext1;
    }

*/





/*
    static WebView access$702(InAppBrowser inappbrowser, WebView webview)
    {
        inappbrowser.inAppWebView = webview;
        return webview;
    }

*/

}
