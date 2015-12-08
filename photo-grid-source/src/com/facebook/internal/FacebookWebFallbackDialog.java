// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//            WebDialog, Utility, BundleJSONConverter, NativeProtocol

public class FacebookWebFallbackDialog extends WebDialog
{

    private static final int OS_BACK_BUTTON_RESPONSE_TIMEOUT_MILLISECONDS = 1500;
    private static final String TAG = com/facebook/internal/FacebookWebFallbackDialog.getName();
    private boolean waitingForDialogToClose;

    public FacebookWebFallbackDialog(Context context, String s, String s1)
    {
        super(context, s);
        setExpectedRedirectUrl(s1);
    }

    public void cancel()
    {
        WebView webview = getWebView();
        if (!isPageFinished() || isListenerCalled() || webview == null || !webview.isShown())
        {
            super.cancel();
        } else
        if (!waitingForDialogToClose)
        {
            waitingForDialogToClose = true;
            webview.loadUrl((new StringBuilder("javascript:")).append("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();").toString());
            (new Handler(Looper.getMainLooper())).postDelayed(new _cls1(), 1500L);
            return;
        }
    }

    protected Bundle parseResponseUri(String s)
    {
        Bundle bundle = Utility.parseUrlQueryString(Uri.parse(s).getQuery());
        s = bundle.getString("bridge_args");
        bundle.remove("bridge_args");
        String s1;
        if (!Utility.isNullOrEmpty(s))
        {
            try
            {
                bundle.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", BundleJSONConverter.convertToBundle(new JSONObject(s)));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Utility.logd(TAG, "Unable to parse bridge_args JSON", s);
            }
        }
        s1 = bundle.getString("method_results");
        bundle.remove("method_results");
        if (!Utility.isNullOrEmpty(s1))
        {
            s = s1;
            if (Utility.isNullOrEmpty(s1))
            {
                s = "{}";
            }
            try
            {
                bundle.putBundle("com.facebook.platform.protocol.RESULT_ARGS", BundleJSONConverter.convertToBundle(new JSONObject(s)));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Utility.logd(TAG, "Unable to parse bridge_args JSON", s);
            }
        }
        bundle.remove("version");
        bundle.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", NativeProtocol.getLatestKnownVersion());
        return bundle;
    }



    private class _cls1
        implements Runnable
    {

        final FacebookWebFallbackDialog this$0;

        public void run()
        {
            cancel();
        }

        _cls1()
        {
            this$0 = FacebookWebFallbackDialog.this;
            super();
        }
    }

}
