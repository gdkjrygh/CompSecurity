// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.development;

import android.app.Application;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.OkHttpClient;
import java.lang.reflect.Method;
import java.util.List;

public class StethoSupport
{

    public StethoSupport()
    {
    }

    public static void addStethoInterceptor(OkHttpClient okhttpclient)
    {
        try
        {
            Interceptor interceptor = (Interceptor)getStethoProxyClass().getMethod("createNetworkInterceptor", new Class[0]).invoke(null, new Object[0]);
            okhttpclient.networkInterceptors().add(interceptor);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (OkHttpClient okhttpclient)
        {
            return;
        }
    }

    private static Class getStethoProxyClass()
    {
        return Class.forName("me.lyft.android.development.proxies.StethoProxy");
    }

    public static void initStethoIfPresent(Application application)
    {
        try
        {
            getStethoProxyClass().getMethod("init", new Class[] {
                android/app/Application
            }).invoke(null, new Object[] {
                application
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            return;
        }
    }
}
