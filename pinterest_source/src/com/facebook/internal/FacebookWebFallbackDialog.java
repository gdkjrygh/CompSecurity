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
import com.facebook.widget.WebDialog;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//            Utility, BundleJSONConverter, NativeProtocol

public class FacebookWebFallbackDialog extends WebDialog
{

    private static final int OS_BACK_BUTTON_RESPONSE_TIMEOUT_MILLISECONDS = 1500;
    private static final String TAG = com/facebook/internal/FacebookWebFallbackDialog.getName();
    private boolean waitingForDialogToClose;

    private FacebookWebFallbackDialog(Context context, String s, String s1)
    {
        super(context, s);
        setExpectedRedirectUrl(s1);
    }

    public static boolean presentWebFallback(final Context context, String s, String s1, final com.facebook.widget.FacebookDialog.PendingCall appCall, final com.facebook.widget.FacebookDialog.Callback callback)
    {
        if (Utility.isNullOrEmpty(s))
        {
            return false;
        } else
        {
            s = new FacebookWebFallbackDialog(context, s, String.format("fb%s://bridge/", new Object[] {
                s1
            }));
            s.setOnCompleteListener(new _cls1());
            s.show();
            return true;
        }
    }

    public void dismiss()
    {
        WebView webview = getWebView();
        if (isListenerCalled() || webview == null || !webview.isShown())
        {
            super.dismiss();
        } else
        if (!waitingForDialogToClose)
        {
            waitingForDialogToClose = true;
            webview.loadUrl((new StringBuilder("javascript:")).append("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();").toString());
            (new Handler(Looper.getMainLooper())).postDelayed(new _cls2(), 1500L);
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
        implements com.facebook.widget.WebDialog.OnCompleteListener
    {

        final com.facebook.widget.FacebookDialog.PendingCall val$appCall;
        final com.facebook.widget.FacebookDialog.Callback val$callback;
        final Context val$context;

        public final void onComplete(Bundle bundle, FacebookException facebookexception)
        {
            Intent intent = new Intent();
            facebookexception = bundle;
            if (bundle == null)
            {
                facebookexception = new Bundle();
            }
            intent.putExtras(facebookexception);
            FacebookDialog.handleActivityResult(context, appCall, appCall.getRequestCode(), intent, callback);
        }

        _cls1()
        {
            context = context1;
            appCall = pendingcall;
            callback = callback1;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final FacebookWebFallbackDialog this$0;

        public void run()
        {
            if (!isListenerCalled())
            {
                sendCancelToListener();
            }
        }

        _cls2()
        {
            this$0 = FacebookWebFallbackDialog.this;
            super();
        }
    }

}
