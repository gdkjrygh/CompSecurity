// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.http;

import android.app.Application;
import com.squareup.okhttp.OkHttpClient;
import java.security.GeneralSecurityException;
import javax.net.ssl.SSLContext;

public class HttpModule
{

    public HttpModule()
    {
    }

    static OkHttpClient getOkHttpClient(Application application)
    {
        application = new OkHttpClient();
        SSLContext sslcontext;
        try
        {
            sslcontext = SSLContext.getInstance("TLS");
            sslcontext.init(null, null, null);
        }
        // Misplaced declaration of an exception variable
        catch (Application application)
        {
            throw new AssertionError();
        }
        application.setSslSocketFactory(sslcontext.getSocketFactory());
        return application;
    }
}
