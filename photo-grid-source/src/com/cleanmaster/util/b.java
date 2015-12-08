// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.util;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class b
{

    private static String a = null;

    public static String a(Context context)
    {
        if (a == null)
        {
            if (android.os.Build.VERSION.SDK_INT >= 17)
            {
                a = b(context);
            } else
            {
                try
                {
                    a = a(context, "android.webkit.WebSettings", "android.webkit.WebView");
                }
                catch (Exception exception)
                {
                    try
                    {
                        a = a(context, "android.webkit.WebSettingsClassic", "android.webkit.WebViewClassic");
                    }
                    catch (Exception exception1)
                    {
                        context = new WebView(context.getApplicationContext());
                        a = context.getSettings().getUserAgentString();
                        context.destroy();
                    }
                }
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

    private static String b(Context context)
    {
        return WebSettings.getDefaultUserAgent(context);
    }

}
