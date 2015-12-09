// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.graphics.Bitmap;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova:
//            InAppBrowser, CordovaWebView

public class edittext extends WebViewClient
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
            InAppBrowser.access$100(InAppBrowser.this, webview, true);
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
            InAppBrowser.access$100(InAppBrowser.this, s, true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview)
        {
            Log.d("InAppBrowser", "Should never happen");
        }
    }

    public (CordovaWebView cordovawebview, EditText edittext1)
    {
        this$0 = InAppBrowser.this;
        super();
        webView = cordovawebview;
        edittext = edittext1;
    }
}
