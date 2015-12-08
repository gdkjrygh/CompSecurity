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
//            bd, aw, b, am, 
//            x

public class w extends bd
{

    private static final String a = com/facebook/internal/w.getName();
    private boolean b;

    public w(Context context, String s, String s1)
    {
        super(context, s);
        b(s1);
    }

    static void a(w w1)
    {
        w1.bd.cancel();
    }

    protected final Bundle a(String s)
    {
        Bundle bundle = aw.c(Uri.parse(s).getQuery());
        s = bundle.getString("bridge_args");
        bundle.remove("bridge_args");
        String s1;
        if (!aw.a(s))
        {
            try
            {
                bundle.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", com.facebook.internal.b.a(new JSONObject(s)));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                aw.a(a, "Unable to parse bridge_args JSON", s);
            }
        }
        s1 = bundle.getString("method_results");
        bundle.remove("method_results");
        if (!aw.a(s1))
        {
            s = s1;
            if (aw.a(s1))
            {
                s = "{}";
            }
            try
            {
                bundle.putBundle("com.facebook.platform.protocol.RESULT_ARGS", com.facebook.internal.b.a(new JSONObject(s)));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                aw.a(a, "Unable to parse bridge_args JSON", s);
            }
        }
        bundle.remove("version");
        bundle.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", am.a());
        return bundle;
    }

    public void cancel()
    {
        WebView webview = c();
        if (!b() || a() || webview == null || !webview.isShown())
        {
            super.cancel();
        } else
        if (!b)
        {
            b = true;
            webview.loadUrl((new StringBuilder("javascript:")).append("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();").toString());
            (new Handler(Looper.getMainLooper())).postDelayed(new x(this), 1500L);
            return;
        }
    }

}
