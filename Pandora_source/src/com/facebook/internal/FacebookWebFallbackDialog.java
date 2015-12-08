// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.widget.FacebookDialog;
import com.facebook.widget.WebDialog;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.internal:
//            Utility, BundleJSONConverter, NativeProtocol

public class FacebookWebFallbackDialog extends WebDialog
{

    private static final String TAG = com/facebook/internal/FacebookWebFallbackDialog.getName();

    private FacebookWebFallbackDialog(Context context, String s, String s1)
    {
        super(context, s);
        setExpectedRedirectUrl(s1);
    }

    public static boolean presentWebFallback(Context context, String s, String s1, com.facebook.widget.FacebookDialog.PendingCall pendingcall, com.facebook.widget.FacebookDialog.Callback callback)
    {
        if (Utility.isNullOrEmpty(s))
        {
            return false;
        } else
        {
            s = new FacebookWebFallbackDialog(context, s, String.format("fb%s://bridge/", new Object[] {
                s1
            }));
            s.setOnCompleteListener(new com.facebook.widget.WebDialog.OnCompleteListener(context, pendingcall, callback) {

                final com.facebook.widget.FacebookDialog.PendingCall val$appCall;
                final com.facebook.widget.FacebookDialog.Callback val$callback;
                final Context val$context;

                public void onComplete(Bundle bundle, FacebookException facebookexception)
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

            
            {
                context = context1;
                appCall = pendingcall;
                callback = callback1;
                super();
            }
            });
            s.show();
            return true;
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

}
