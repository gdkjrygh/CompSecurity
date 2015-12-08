// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.http;

import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.io.Closeable;
import java.lang.reflect.Method;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package com.google.android.gms.http:
//            GoogleHttpServiceClient

public final class GoogleURLConnectionFactory
    implements Closeable
{

    public int defaultConnectTimeout;
    public int defaultReadTimeout;
    public SSLSocketFactory defaultSSLSocketFactory;
    GoogleHttpServiceClient mClient;
    Context mContext;
    HostnameVerifier mVerifier;

    public GoogleURLConnectionFactory(Context context, boolean flag)
    {
        defaultReadTimeout = 60000;
        defaultConnectTimeout = 60000;
        mContext = context;
        mClient = new GoogleHttpServiceClient(mContext);
        Object obj;
        if (flag)
        {
            obj = loadSocketFactoryFromPackage();
        } else
        {
            obj = null;
        }
        defaultSSLSocketFactory = ((SSLSocketFactory) (obj));
        if (defaultSSLSocketFactory == null)
        {
            Log.i("GoogleURLConnFactory", "Using platform SSLCertificateSocketFactory");
            Object obj1 = null;
            obj = obj1;
            if (context != null)
            {
                obj = obj1;
                if (android.os.Build.VERSION.SDK_INT > 18)
                {
                    obj = new SSLSessionCache(context);
                }
            }
            defaultSSLSocketFactory = SSLCertificateSocketFactory.getDefault(60000, ((SSLSessionCache) (obj)));
        }
        mVerifier = new HostnameVerifier() {

            final GoogleURLConnectionFactory this$0;

            public final boolean verify(String s, SSLSession sslsession)
            {
                HostnameVerifier hostnameverifier = HttpsURLConnection.getDefaultHostnameVerifier();
                if (hostnameverifier.verify(s, sslsession))
                {
                    return true;
                }
                if ("android.clients.google.com".equalsIgnoreCase(s))
                {
                    return hostnameverifier.verify("clients.google.com", sslsession);
                } else
                {
                    return false;
                }
            }

            
            {
                this$0 = GoogleURLConnectionFactory.this;
                super();
            }
        };
    }

    private SSLSocketFactory loadSocketFactoryFromPackage()
    {
        Object obj;
        try
        {
            obj = GooglePlayServicesUtil.getRemoteContext(mContext);
        }
        catch (Exception exception)
        {
            Log.w("GoogleURLConnFactory", "Failed to load SSLCertificateSocketFactory from package");
            return null;
        }
        if (obj == null)
        {
            return null;
        }
        obj = (SSLSocketFactory)((Context) (obj)).getClassLoader().loadClass("com.google.android.gms.common.net.SSLCertificateSocketFactory").getMethod("getDefaultWithSessionCache", new Class[] {
            Integer.TYPE, android/content/Context
        }).invoke(null, new Object[] {
            Integer.valueOf(60000), mContext
        });
        return ((SSLSocketFactory) (obj));
    }

    public final void close()
    {
    }
}
