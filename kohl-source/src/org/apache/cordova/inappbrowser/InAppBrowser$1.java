// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.inappbrowser;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.Config;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.LOG;
import org.apache.cordova.PluginResult;

// Referenced classes of package org.apache.cordova.inappbrowser:
//            InAppBrowser

class val.callbackContext
    implements Runnable
{

    final InAppBrowser this$0;
    final CallbackContext val$callbackContext;
    final HashMap val$features;
    final String val$target;
    final String val$url;

    public void run()
    {
        Object obj = "";
        if ("_self".equals(val$target))
        {
            Log.d("InAppBrowser", "in self");
            if (val$url.startsWith("file://") || val$url.startsWith("javascript:") || Config.isUrlWhiteListed(val$url))
            {
                Log.d("InAppBrowser", "loading in webview");
                webView.loadUrl(val$url);
            } else
            if (val$url.startsWith("tel:"))
            {
                try
                {
                    Log.d("InAppBrowser", "loading in dialer");
                    Intent intent = new Intent("android.intent.action.DIAL");
                    intent.setData(Uri.parse(val$url));
                    cordova.getActivity().startActivity(intent);
                }
                catch (ActivityNotFoundException activitynotfoundexception)
                {
                    LOG.e("InAppBrowser", (new StringBuilder()).append("Error dialing ").append(val$url).append(": ").append(activitynotfoundexception.toString()).toString());
                }
            } else
            {
                Log.d("InAppBrowser", "loading in InAppBrowser");
                obj = showWebPage(val$url, val$features);
            }
        } else
        if ("_system".equals(val$target))
        {
            Log.d("InAppBrowser", "in system");
            obj = openExternal(val$url);
        } else
        {
            Log.d("InAppBrowser", "in blank");
            obj = showWebPage(val$url, val$features);
        }
        obj = new PluginResult(org.apache.cordova.atus.OK, ((String) (obj)));
        ((PluginResult) (obj)).setKeepCallback(true);
        val$callbackContext.sendPluginResult(((PluginResult) (obj)));
    }

    ()
    {
        this$0 = final_inappbrowser;
        val$target = s;
        val$url = s1;
        val$features = hashmap;
        val$callbackContext = CallbackContext.this;
        super();
    }
}
