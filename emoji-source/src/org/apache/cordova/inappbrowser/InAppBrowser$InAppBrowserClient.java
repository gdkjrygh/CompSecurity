// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.inappbrowser;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.LOG;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.apache.cordova.inappbrowser:
//            InAppBrowser

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
            InAppBrowser.access$1100(InAppBrowser.this, webview, true);
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
            InAppBrowser.access$1100(InAppBrowser.this, s, true);
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
            InAppBrowser.access$1200(InAppBrowser.this, webview, true, org.apache.cordova.rowserClient.this._fld0);
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
