// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.webkit.WebView;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.b:
//            as, al, f, aa, 
//            y

public class x extends as
{

    private static final String a = com/facebook/b/x.getName();
    private boolean b;

    public x(Context context, String s, String s1)
    {
        super(context, s);
        b(s1);
    }

    static void a(x x1)
    {
        x1.as.cancel();
    }

    protected Bundle a(String s)
    {
        Bundle bundle = al.b(Uri.parse(s).getQuery());
        s = bundle.getString("bridge_args");
        bundle.remove("bridge_args");
        String s1;
        if (!al.a(s))
        {
            try
            {
                bundle.putBundle("com.facebook.platform.protocol.BRIDGE_ARGS", f.a(new JSONObject(s)));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                al.a(a, "Unable to parse bridge_args JSON", s);
            }
        }
        s1 = bundle.getString("method_results");
        bundle.remove("method_results");
        if (!al.a(s1))
        {
            s = s1;
            if (al.a(s1))
            {
                s = "{}";
            }
            try
            {
                bundle.putBundle("com.facebook.platform.protocol.RESULT_ARGS", f.a(new JSONObject(s)));
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                al.a(a, "Unable to parse bridge_args JSON", s);
            }
        }
        bundle.remove("version");
        bundle.putInt("com.facebook.platform.protocol.PROTOCOL_VERSION", aa.a());
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
            webview.loadUrl((new StringBuilder()).append("javascript:").append("(function() {  var event = document.createEvent('Event');  event.initEvent('fbPlatformDialogMustClose',true,true);  document.dispatchEvent(event);})();").toString());
            (new Handler(Looper.getMainLooper())).postDelayed(new y(this), 1500L);
            return;
        }
    }

}
