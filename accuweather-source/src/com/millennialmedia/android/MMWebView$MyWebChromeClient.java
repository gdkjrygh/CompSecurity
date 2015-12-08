// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Toast;
import java.lang.ref.WeakReference;

// Referenced classes of package com.millennialmedia.android:
//            MMWebView

private static class webRef extends WebChromeClient
{

    private static final String KEY_USE_GEO = "mm_use_geo_location";
    WeakReference webRef;

    private String getApplicationName(Context context)
    {
        PackageManager packagemanager = context.getApplicationContext().getPackageManager();
        try
        {
            context = packagemanager.getApplicationInfo(context.getPackageName(), 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
        }
        if (context != null)
        {
            context = packagemanager.getApplicationLabel(context);
        } else
        {
            context = "This app";
        }
        return (String)(String)context;
    }

    private boolean isFirstGeoRequest()
    {
        boolean flag1 = false;
        MMWebView mmwebview = (MMWebView)webRef.get();
        boolean flag = flag1;
        if (mmwebview != null)
        {
            flag = flag1;
            if (!mmwebview.getContext().getSharedPreferences("MillennialMediaSettings", 0).contains("mm_use_geo_location"))
            {
                flag = true;
            }
        }
        return flag;
    }

    private boolean retrieveUseGeo()
    {
        boolean flag = false;
        MMWebView mmwebview = (MMWebView)webRef.get();
        if (mmwebview != null)
        {
            flag = mmwebview.getContext().getSharedPreferences("MillennialMediaSettings", 0).getBoolean("mm_use_geo_location", false);
        }
        return flag;
    }

    private void saveUseGeo(boolean flag)
    {
        Object obj = (MMWebView)webRef.get();
        if (obj != null)
        {
            obj = ((MMWebView) (obj)).getContext().getSharedPreferences("MillennialMediaSettings", 0).edit();
            ((android.content.) (obj)).Boolean("mm_use_geo_location", flag);
            ((android.content.Boolean) (obj)).mit();
        }
    }

    public void onConsoleMessage(String s, int i, String s1)
    {
        super.onConsoleMessage(s, i, s1);
    }

    public void onGeolocationPermissionsShowPrompt(final String origin, final android.webkit.ack callback)
    {
        if (!isFirstGeoRequest())
        {
            break MISSING_BLOCK_LABEL_116;
        }
        if (!retrieveUseGeo()) goto _L2; else goto _L1
_L1:
        callback.invoke(origin, true, true);
_L4:
        return;
_L2:
        Object obj = (MMWebView)webRef.get();
        if (obj == null) goto _L4; else goto _L3
_L3:
        obj = ((MMWebView) (obj)).getActivity();
        if (obj == null) goto _L4; else goto _L5
_L5:
        android.app.istener istener = new android.app.tActivity(((Context) (obj)));
        istener.(getApplicationName(((Context) (obj))));
        istener.ge("Would like to use your Current Location.").iveButton("Allow", new android.content.DialogInterface.OnClickListener() {

            final MMWebView.MyWebChromeClient this$0;
            final android.webkit.GeolocationPermissions.Callback val$callback;
            final String val$origin;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                saveUseGeo(true);
                callback.invoke(origin, true, true);
            }

            
            {
                this$0 = MMWebView.MyWebChromeClient.this;
                callback = callback1;
                origin = s;
                super();
            }
        }).iveButton("Don't Allow", new android.content.DialogInterface.OnClickListener() {

            final MMWebView.MyWebChromeClient this$0;
            final android.webkit.GeolocationPermissions.Callback val$callback;
            final String val$origin;

            public void onClick(DialogInterface dialoginterface, int i)
            {
                saveUseGeo(false);
                callback.invoke(origin, false, false);
            }

            
            {
                this$0 = MMWebView.MyWebChromeClient.this;
                callback = callback1;
                origin = s;
                super();
            }
        });
        istener.llback().show();
        return;
        callback.invoke(origin, false, false);
        return;
    }

    public boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
    {
        MMWebView mmwebview = (MMWebView)webRef.get();
        if (mmwebview != null)
        {
            if (mmwebview.getContext() != mmwebview.getContext().getApplicationContext())
            {
                return super.onJsAlert(webview, s, s1, jsresult);
            }
            Toast.makeText(mmwebview.getContext(), s1, 0).show();
        }
        return true;
    }

    public boolean onJsBeforeUnload(WebView webview, String s, String s1, JsResult jsresult)
    {
        MMWebView mmwebview = (MMWebView)webRef.get();
        if (mmwebview != null)
        {
            if (mmwebview.getContext() != mmwebview.getContext().getApplicationContext())
            {
                return super.onJsBeforeUnload(webview, s, s1, jsresult);
            }
            Toast.makeText(mmwebview.getContext(), s1, 0).show();
        }
        return true;
    }

    public boolean onJsConfirm(WebView webview, String s, String s1, JsResult jsresult)
    {
        MMWebView mmwebview = (MMWebView)webRef.get();
        if (mmwebview != null)
        {
            if (mmwebview.getContext() != mmwebview.getContext().getApplicationContext())
            {
                return super.onJsConfirm(webview, s, s1, jsresult);
            }
            Toast.makeText(mmwebview.getContext(), s1, 0).show();
        }
        return true;
    }

    public boolean onJsPrompt(WebView webview, String s, String s1, String s2, JsPromptResult jspromptresult)
    {
        MMWebView mmwebview = (MMWebView)webRef.get();
        if (mmwebview != null)
        {
            if (mmwebview.getContext() != mmwebview.getContext().getApplicationContext())
            {
                return super.onJsPrompt(webview, s, s1, s2, jspromptresult);
            }
            Toast.makeText(mmwebview.getContext(), s1, 0).show();
        }
        return true;
    }


    _cls2.val.origin(MMWebView mmwebview)
    {
        webRef = new WeakReference(mmwebview);
    }
}
