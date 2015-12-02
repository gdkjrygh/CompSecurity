// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.util;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.ads.e;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

// Referenced classes of package com.facebook.ads.internal.util:
//            t

public class i
{

    private static String a = null;

    public static String a()
    {
        String s = e.a();
        if (t.a(s))
        {
            return "https://www.facebook.com/";
        } else
        {
            return String.format("https://www.%s.facebook.com", new Object[] {
                s
            });
        }
    }

    private static String a(Context context)
    {
        return WebSettings.getDefaultUserAgent(context);
    }

    public static String a(Context context, com.facebook.ads.internal.e e1)
    {
        if (e1 == com.facebook.ads.internal.e.j || e1 == com.facebook.ads.internal.e.i || e1 == null)
        {
            return System.getProperty("http.agent");
        }
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        if (android.os.Build.VERSION.SDK_INT < 17)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        a = a(context);
        e1 = a;
        return e1;
        e1;
        try
        {
            a = a(context, "android.webkit.WebSettings", "android.webkit.WebView");
        }
        // Misplaced declaration of an exception variable
        catch (com.facebook.ads.internal.e e1)
        {
            try
            {
                a = a(context, "android.webkit.WebSettingsClassic", "android.webkit.WebViewClassic");
            }
            // Misplaced declaration of an exception variable
            catch (com.facebook.ads.internal.e e1)
            {
                context = new WebView(context.getApplicationContext());
                a = context.getSettings().getUserAgentString();
                context.destroy();
            }
        }
        return a;
    }

    private static String a(Context context, String s, String s1)
    {
        Class class1 = Class.forName(s);
        s = class1.getDeclaredConstructor(new Class[] {
            android/content/Context, Class.forName(s1)
        });
        s.setAccessible(true);
        s1 = class1.getMethod("getUserAgentString", new Class[0]);
        context = (String)s1.invoke(s.newInstance(new Object[] {
            context, null
        }), new Object[0]);
        s.setAccessible(false);
        return context;
        context;
        s.setAccessible(false);
        throw context;
    }

    public static void a(WebView webview)
    {
        webview.loadUrl("about:blank");
        webview.clearCache(true);
        if (android.os.Build.VERSION.SDK_INT > 11)
        {
            webview.onPause();
            return;
        }
        try
        {
            android/webkit/WebView.getMethod("onPause", new Class[0]).invoke(webview, new Object[0]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (WebView webview)
        {
            return;
        }
    }

}
