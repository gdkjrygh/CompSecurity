// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.inappbrowser;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import java.io.File;
import java.util.HashMap;
import java.util.StringTokenizer;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.Config;
import org.apache.cordova.CordovaArgs;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaResourceApi;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.LOG;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova.inappbrowser:
//            InAppBrowserDialog, InAppChromeClient

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
            bitmap = "";
            if (!s.startsWith("http:") && !s.startsWith("https:") && !s.startsWith("file:")) goto _L2; else goto _L1
_L1:
            webview = s;
_L3:
            if (!webview.equals(edittext.getText().toString()))
            {
                edittext.setText(webview);
            }
            String s1;
            Intent intent;
            String s2;
            int i;
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
            break MISSING_BLOCK_LABEL_539;
_L2:
            if (!s.startsWith("tel:"))
            {
                break MISSING_BLOCK_LABEL_190;
            }
            webview = new Intent("android.intent.action.DIAL");
            webview.setData(Uri.parse(s));
            cordova.getActivity().startActivity(webview);
            webview = bitmap;
              goto _L3
            webview;
            LOG.e("InAppBrowser", (new StringBuilder()).append("Error dialing ").append(s).append(": ").append(webview.toString()).toString());
            webview = bitmap;
              goto _L3
            if (!s.startsWith("geo:") && !s.startsWith("mailto:") && !s.startsWith("market:"))
            {
                break MISSING_BLOCK_LABEL_299;
            }
            webview = new Intent("android.intent.action.VIEW");
            webview.setData(Uri.parse(s));
            cordova.getActivity().startActivity(webview);
            webview = bitmap;
              goto _L3
            webview;
            LOG.e("InAppBrowser", (new StringBuilder()).append("Error with ").append(s).append(": ").append(webview.toString()).toString());
            webview = bitmap;
              goto _L3
            if (!s.startsWith("sms:"))
            {
                break MISSING_BLOCK_LABEL_507;
            }
            intent = new Intent("android.intent.action.VIEW");
            i = s.indexOf('?');
            if (i != -1) goto _L5; else goto _L4
_L4:
            webview = s.substring(4);
_L7:
            intent.setData(Uri.parse((new StringBuilder()).append("sms:").append(webview).toString()));
            intent.putExtra("address", webview);
            intent.setType("vnd.android-dir/mms-sms");
            cordova.getActivity().startActivity(intent);
            webview = bitmap;
              goto _L3
            webview;
            LOG.e("InAppBrowser", (new StringBuilder()).append("Error sending sms ").append(s).append(":").append(webview.toString()).toString());
            webview = bitmap;
              goto _L3
_L5:
            s1 = s.substring(4, i);
            s2 = Uri.parse(s).getQuery();
            webview = s1;
            if (s2 == null) goto _L7; else goto _L6
_L6:
            webview = s1;
            if (!s2.startsWith("body=")) goto _L7; else goto _L8
_L8:
            intent.putExtra("sms_body", s2.substring(5));
            webview = s1;
              goto _L7
            webview = (new StringBuilder()).append("http://").append(s).toString();
              goto _L3
        }

        public void onReceivedError(WebView webview, int i, String s, String s1)
        {
            super.onReceivedError(webview, i, s, s1);
            try
            {
                webview = new JSONObject();
                webview.put("type", "loaderror");
                webview.put("url", s1);
                webview.put("code", i);
                webview.put("message", s);
                sendUpdate(webview, true, org.apache.cordova.PluginResult.Status.ERROR);
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


    private static final String CLEAR_ALL_CACHE = "clearcache";
    private static final String CLEAR_SESSION_CACHE = "clearsessioncache";
    private static final String EXIT_EVENT = "exit";
    private static final String HIDDEN = "hidden";
    private static final String LOAD_ERROR_EVENT = "loaderror";
    private static final String LOAD_START_EVENT = "loadstart";
    private static final String LOAD_STOP_EVENT = "loadstop";
    private static final String LOCATION = "location";
    protected static final String LOG_TAG = "InAppBrowser";
    private static final String NULL = "null";
    private static final String SELF = "_self";
    private static final String SYSTEM = "_system";
    private CallbackContext callbackContext;
    private boolean clearAllCache;
    private boolean clearSessionCache;
    private InAppBrowserDialog dialog;
    private EditText edittext;
    private WebView inAppWebView;
    private boolean openWindowHidden;
    private boolean showLocationBar;

    public InAppBrowser()
    {
        showLocationBar = true;
        openWindowHidden = false;
        clearAllCache = false;
        clearSessionCache = false;
    }

    private InAppBrowser getInAppBrowser()
    {
        return this;
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

    private void injectDeferredObject(final String finalScriptToInject, String s)
    {
        if (s != null)
        {
            JSONArray jsonarray = new JSONArray();
            jsonarray.put(finalScriptToInject);
            finalScriptToInject = jsonarray.toString();
            finalScriptToInject = String.format(s, new Object[] {
                finalScriptToInject.substring(1, finalScriptToInject.length() - 1)
            });
        }
        cordova.getActivity().runOnUiThread(new Runnable() {

            final InAppBrowser this$0;
            final String val$finalScriptToInject;

            public void run()
            {
                if (android.os.Build.VERSION.SDK_INT < 19)
                {
                    inAppWebView.loadUrl((new StringBuilder()).append("javascript:").append(finalScriptToInject).toString());
                    return;
                } else
                {
                    inAppWebView.evaluateJavascript(finalScriptToInject, null);
                    return;
                }
            }

            
            {
                this$0 = InAppBrowser.this;
                finalScriptToInject = s;
                super();
            }
        });
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
        sendUpdate(jsonobject, flag, org.apache.cordova.PluginResult.Status.OK);
    }

    private void sendUpdate(JSONObject jsonobject, boolean flag, org.apache.cordova.PluginResult.Status status)
    {
        if (callbackContext != null)
        {
            jsonobject = new PluginResult(status, jsonobject);
            jsonobject.setKeepCallback(flag);
            callbackContext.sendPluginResult(jsonobject);
            if (!flag)
            {
                callbackContext = null;
            }
        }
    }

    public void closeDialog()
    {
        final WebView childView = inAppWebView;
        if (childView == null)
        {
            return;
        }
        cordova.getActivity().runOnUiThread(new Runnable() {

            final InAppBrowser this$0;
            final WebView val$childView;

            public void run()
            {
                childView.setWebViewClient(new WebViewClient() {

                    final _cls4 this$1;

                    public void onPageFinished(WebView webview, String s)
                    {
                        if (dialog != null)
                        {
                            dialog.dismiss();
                        }
                    }

            
            {
                this$1 = _cls4.this;
                super();
            }
                });
                childView.loadUrl("about:blank");
            }

            
            {
                this$0 = InAppBrowser.this;
                childView = webview;
                super();
            }
        });
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("type", "exit");
            sendUpdate(jsonobject, false);
            return;
        }
        catch (JSONException jsonexception)
        {
            Log.d("InAppBrowser", "Should never happen");
        }
    }

    public boolean execute(final String target, final CordovaArgs features, final CallbackContext callbackContext)
        throws JSONException
    {
        boolean flag = false;
        if (!target.equals("open")) goto _L2; else goto _L1
_L1:
        final String url;
label0:
        {
            this.callbackContext = callbackContext;
            url = features.getString(0);
            String s = features.optString(1);
            if (s != null && !s.equals(""))
            {
                target = s;
                if (!s.equals("null"))
                {
                    break label0;
                }
            }
            target = "_self";
        }
        features = parseFeature(features.optString(2));
        Log.d("InAppBrowser", (new StringBuilder()).append("target = ").append(target).toString());
        cordova.getActivity().runOnUiThread(new Runnable() {

            final InAppBrowser this$0;
            final CallbackContext val$callbackContext;
            final HashMap val$features;
            final String val$target;
            final String val$url;

            public void run()
            {
                Object obj = "";
                if ("_self".equals(target))
                {
                    Log.d("InAppBrowser", "in self");
                    if (url.startsWith("file://") || url.startsWith("javascript:") || Config.isUrlWhiteListed(url))
                    {
                        Log.d("InAppBrowser", "loading in webview");
                        webView.loadUrl(url);
                    } else
                    if (url.startsWith("tel:"))
                    {
                        try
                        {
                            Log.d("InAppBrowser", "loading in dialer");
                            Intent intent = new Intent("android.intent.action.DIAL");
                            intent.setData(Uri.parse(url));
                            cordova.getActivity().startActivity(intent);
                        }
                        catch (ActivityNotFoundException activitynotfoundexception)
                        {
                            LOG.e("InAppBrowser", (new StringBuilder()).append("Error dialing ").append(url).append(": ").append(activitynotfoundexception.toString()).toString());
                        }
                    } else
                    {
                        Log.d("InAppBrowser", "loading in InAppBrowser");
                        obj = showWebPage(url, features);
                    }
                } else
                if ("_system".equals(target))
                {
                    Log.d("InAppBrowser", "in system");
                    obj = openExternal(url);
                } else
                {
                    Log.d("InAppBrowser", "in blank");
                    obj = showWebPage(url, features);
                }
                obj = new PluginResult(org.apache.cordova.PluginResult.Status.OK, ((String) (obj)));
                ((PluginResult) (obj)).setKeepCallback(true);
                callbackContext.sendPluginResult(((PluginResult) (obj)));
            }

            
            {
                this$0 = InAppBrowser.this;
                target = s;
                url = s1;
                features = hashmap;
                callbackContext = callbackcontext;
                super();
            }
        });
_L6:
        flag = true;
_L4:
        return flag;
_L2:
        if (target.equals("close"))
        {
            closeDialog();
        } else
        if (target.equals("injectScriptCode"))
        {
            target = null;
            if (features.getBoolean(1))
            {
                target = String.format("prompt(JSON.stringify([eval(%%s)]), 'gap-iab://%s')", new Object[] {
                    callbackContext.getCallbackId()
                });
            }
            injectDeferredObject(features.getString(0), target);
        } else
        if (target.equals("injectScriptFile"))
        {
            if (features.getBoolean(1))
            {
                target = String.format("(function(d) { var c = d.createElement('script'); c.src = %%s; c.onload = function() { prompt('', 'gap-iab://%s'); }; d.body.appendChild(c); })(document)", new Object[] {
                    callbackContext.getCallbackId()
                });
            } else
            {
                target = "(function(d) { var c = d.createElement('script'); c.src = %s; d.body.appendChild(c); })(document)";
            }
            injectDeferredObject(features.getString(0), target);
        } else
        if (target.equals("injectStyleCode"))
        {
            if (features.getBoolean(1))
            {
                target = String.format("(function(d) { var c = d.createElement('style'); c.innerHTML = %%s; d.body.appendChild(c); prompt('', 'gap-iab://%s');})(document)", new Object[] {
                    callbackContext.getCallbackId()
                });
            } else
            {
                target = "(function(d) { var c = d.createElement('style'); c.innerHTML = %s; d.body.appendChild(c); })(document)";
            }
            injectDeferredObject(features.getString(0), target);
        } else
        {
            if (!target.equals("injectStyleFile"))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (features.getBoolean(1))
            {
                target = String.format("(function(d) { var c = d.createElement('link'); c.rel='stylesheet'; c.type='text/css'; c.href = %%s; d.head.appendChild(c); prompt('', 'gap-iab://%s');})(document)", new Object[] {
                    callbackContext.getCallbackId()
                });
            } else
            {
                target = "(function(d) { var c = d.createElement('link'); c.rel='stylesheet'; c.type='text/css'; c.href = %s; d.head.appendChild(c); })(document)";
            }
            injectDeferredObject(features.getString(0), target);
        }
        continue; /* Loop/switch isn't completed */
        if (!target.equals("show")) goto _L4; else goto _L3
_L3:
        cordova.getActivity().runOnUiThread(new Runnable() {

            final InAppBrowser this$0;

            public void run()
            {
                dialog.show();
            }

            
            {
                this$0 = InAppBrowser.this;
                super();
            }
        });
        target = new PluginResult(org.apache.cordova.PluginResult.Status.OK);
        target.setKeepCallback(true);
        this.callbackContext.sendPluginResult(target);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onDestroy()
    {
        closeDialog();
    }

    public void onReset()
    {
        closeDialog();
    }

    public String openExternal(String s)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        Uri uri;
        uri = Uri.parse(s);
        if (!"file".equals(uri.getScheme()))
        {
            break MISSING_BLOCK_LABEL_63;
        }
        intent.setDataAndType(uri, webView.getResourceApi().getMimeType(uri));
_L1:
        cordova.getActivity().startActivity(intent);
        return "";
        intent.setData(uri);
          goto _L1
        ActivityNotFoundException activitynotfoundexception;
        activitynotfoundexception;
_L3:
        Log.d("InAppBrowser", (new StringBuilder()).append("InAppBrowser: Error loading url ").append(s).append(":").append(activitynotfoundexception.toString()).toString());
        return activitynotfoundexception.toString();
        activitynotfoundexception;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public String showWebPage(final String url, HashMap hashmap)
    {
        showLocationBar = true;
        openWindowHidden = false;
        if (hashmap == null) goto _L2; else goto _L1
_L1:
        Boolean boolean1;
        boolean1 = (Boolean)hashmap.get("location");
        if (boolean1 != null)
        {
            showLocationBar = boolean1.booleanValue();
        }
        boolean1 = (Boolean)hashmap.get("hidden");
        if (boolean1 != null)
        {
            openWindowHidden = boolean1.booleanValue();
        }
        boolean1 = (Boolean)hashmap.get("clearcache");
        if (boolean1 == null) goto _L4; else goto _L3
_L3:
        clearAllCache = boolean1.booleanValue();
_L2:
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
                dialog = new InAppBrowserDialog(cordova.getActivity(), 0x1030006);
                dialog.getWindow().getAttributes().windowAnimations = 0x1030002;
                dialog.requestWindowFeature(1);
                dialog.setCancelable(true);
                dialog.setInAppBroswer(getInAppBrowser());
                LinearLayout linearlayout = new LinearLayout(cordova.getActivity());
                linearlayout.setOrientation(1);
                Object obj = new RelativeLayout(cordova.getActivity());
                ((RelativeLayout) (obj)).setBackgroundColor(0xffcccccc);
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
                Object obj2 = cordova.getActivity().getResources();
                obj1 = ((Resources) (obj2)).getDrawable(((Resources) (obj2)).getIdentifier("ic_action_previous_item", "drawable", cordova.getActivity().getPackageName()));
                Object obj3;
                Object obj4;
                boolean flag;
                if (android.os.Build.VERSION.SDK_INT < 16)
                {
                    button.setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj1)));
                } else
                {
                    button.setBackground(((android.graphics.drawable.Drawable) (obj1)));
                }
                button.setOnClickListener(new android.view.View.OnClickListener() {

                    final _cls5 this$1;

                    public void onClick(View view)
                    {
                        goBack();
                    }

            
            {
                this$1 = _cls5.this;
                super();
            }
                });
                obj1 = new Button(cordova.getActivity());
                obj3 = new android.widget.RelativeLayout.LayoutParams(-2, -1);
                ((android.widget.RelativeLayout.LayoutParams) (obj3)).addRule(1, 2);
                ((Button) (obj1)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj3)));
                ((Button) (obj1)).setContentDescription("Forward Button");
                ((Button) (obj1)).setId(3);
                obj3 = ((Resources) (obj2)).getDrawable(((Resources) (obj2)).getIdentifier("ic_action_next_item", "drawable", cordova.getActivity().getPackageName()));
                if (android.os.Build.VERSION.SDK_INT < 16)
                {
                    ((Button) (obj1)).setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj3)));
                } else
                {
                    ((Button) (obj1)).setBackground(((android.graphics.drawable.Drawable) (obj3)));
                }
                ((Button) (obj1)).setOnClickListener(new android.view.View.OnClickListener() {

                    final _cls5 this$1;

                    public void onClick(View view)
                    {
                        goForward();
                    }

            
            {
                this$1 = _cls5.this;
                super();
            }
                });
                edittext = new EditText(cordova.getActivity());
                obj3 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
                ((android.widget.RelativeLayout.LayoutParams) (obj3)).addRule(1, 1);
                ((android.widget.RelativeLayout.LayoutParams) (obj3)).addRule(0, 5);
                edittext.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj3)));
                edittext.setId(4);
                edittext.setSingleLine(true);
                edittext.setText(url);
                edittext.setInputType(16);
                edittext.setImeOptions(2);
                edittext.setInputType(0);
                edittext.setOnKeyListener(new android.view.View.OnKeyListener() {

                    final _cls5 this$1;

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
                this$1 = _cls5.this;
                super();
            }
                });
                obj3 = new Button(cordova.getActivity());
                obj4 = new android.widget.RelativeLayout.LayoutParams(-2, -1);
                ((android.widget.RelativeLayout.LayoutParams) (obj4)).addRule(11);
                ((Button) (obj3)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj4)));
                ((Button) (obj1)).setContentDescription("Close Button");
                ((Button) (obj3)).setId(5);
                obj2 = ((Resources) (obj2)).getDrawable(((Resources) (obj2)).getIdentifier("ic_action_remove", "drawable", cordova.getActivity().getPackageName()));
                if (android.os.Build.VERSION.SDK_INT < 16)
                {
                    ((Button) (obj3)).setBackgroundDrawable(((android.graphics.drawable.Drawable) (obj2)));
                } else
                {
                    ((Button) (obj3)).setBackground(((android.graphics.drawable.Drawable) (obj2)));
                }
                ((Button) (obj3)).setOnClickListener(new android.view.View.OnClickListener() {

                    final _cls5 this$1;

                    public void onClick(View view)
                    {
                        closeDialog();
                    }

            
            {
                this$1 = _cls5.this;
                super();
            }
                });
                inAppWebView = new WebView(cordova.getActivity());
                inAppWebView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
                inAppWebView.setWebChromeClient(new InAppChromeClient(thatWebView));
                obj2 = new InAppBrowserClient(thatWebView, edittext);
                inAppWebView.setWebViewClient(((WebViewClient) (obj2)));
                obj2 = inAppWebView.getSettings();
                ((WebSettings) (obj2)).setJavaScriptEnabled(true);
                ((WebSettings) (obj2)).setJavaScriptCanOpenWindowsAutomatically(true);
                ((WebSettings) (obj2)).setBuiltInZoomControls(true);
                ((WebSettings) (obj2)).setPluginState(android.webkit.WebSettings.PluginState.ON);
                obj4 = cordova.getActivity().getIntent().getExtras();
                if (obj4 == null)
                {
                    flag = true;
                } else
                {
                    flag = ((Bundle) (obj4)).getBoolean("InAppBrowserStorageEnabled", true);
                }
                if (flag)
                {
                    ((WebSettings) (obj2)).setDatabasePath(cordova.getActivity().getApplicationContext().getDir("inAppBrowserDB", 0).getPath());
                    ((WebSettings) (obj2)).setDatabaseEnabled(true);
                }
                ((WebSettings) (obj2)).setDomStorageEnabled(true);
                if (!clearAllCache) goto _L2; else goto _L1
_L1:
                CookieManager.getInstance().removeAllCookie();
_L4:
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
                ((RelativeLayout) (obj)).addView(((View) (obj3)));
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
                if (openWindowHidden)
                {
                    dialog.hide();
                }
                return;
_L2:
                if (clearSessionCache)
                {
                    CookieManager.getInstance().removeSessionCookie();
                }
                if (true) goto _L4; else goto _L3
_L3:
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
_L4:
        hashmap = (Boolean)hashmap.get("clearsessioncache");
        if (hashmap != null)
        {
            clearSessionCache = hashmap.booleanValue();
        }
        if (true) goto _L2; else goto _L5
_L5:
    }



/*
    static InAppBrowserDialog access$002(InAppBrowser inappbrowser, InAppBrowserDialog inappbrowserdialog)
    {
        inappbrowser.dialog = inappbrowserdialog;
        return inappbrowserdialog;
    }

*/




/*
    static WebView access$102(InAppBrowser inappbrowser, WebView webview)
    {
        inappbrowser.inAppWebView = webview;
        return webview;
    }

*/








/*
    static EditText access$502(InAppBrowser inappbrowser, EditText edittext1)
    {
        inappbrowser.edittext = edittext1;
        return edittext1;
    }

*/




}
