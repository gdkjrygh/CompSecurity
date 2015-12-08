// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nielsen.app.sdk;

import android.content.Context;
import android.content.res.Resources;
import java.io.InputStream;
import java.security.KeyStore;
import org.apache.http.HttpVersion;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

// Referenced classes of package com.nielsen.app.sdk:
//            AppRequestManager, c

class setParams extends DefaultHttpClient
{

    final AppRequestManager a;
    private final int b = 80;
    private final int c = 443;
    private KeyStore d;

    private SSLSocketFactory a()
    {
        boolean flag;
        flag = true;
        d = KeyStore.getInstance(KeyStore.getDefaultType());
        if (d == null) goto _L2; else goto _L1
_L1:
        Object obj = AppRequestManager.a(a).getResources();
        if (obj == null) goto _L4; else goto _L3
_L3:
        int i = ((Resources) (obj)).getIdentifier("nielsen", "raw", AppRequestManager.a(a).getPackageName());
        if (i == 0) goto _L4; else goto _L5
_L5:
        obj = ((Resources) (obj)).openRawResource(i);
        if (obj == null) goto _L7; else goto _L6
_L6:
        d.load(((InputStream) (obj)), new char[] {
            'n', '1', '3', 'l', 's', '3', 'n', '!'
        });
_L13:
        if (!flag)
        {
            d.load(null, null);
        }
        if (obj != null)
        {
            ((InputStream) (obj)).close();
        }
_L8:
        class AppSocketFactory extends SSLSocketFactory
        {

            SSLContext a;
            a b;
            final AppRequestManager.AppClient c;

            public Socket createSocket()
            {
                return a.getSocketFactory().createSocket();
            }

            public Socket createSocket(Socket socket, String s, int j, boolean flag1)
            {
                return a.getSocketFactory().createSocket(socket, s, j, flag1);
            }

            public AppSocketFactory(KeyStore keystore)
            {
                c = AppRequestManager.AppClient.this;
                super(keystore);
                a = SSLContext.getInstance("TLS");
                class a
                    implements X509TrustManager
                {

                    final AppSocketFactory a;

                    public void checkClientTrusted(X509Certificate ax509certificate[], String s)
                    {
                    }

                    public void checkServerTrusted(X509Certificate ax509certificate[], String s)
                    {
                    }

                    public X509Certificate[] getAcceptedIssuers()
                    {
                        return null;
                    }

                        private a()
                        {
                            a = AppSocketFactory.this;
                            super();
                        }

                        a(AppRequestManager._cls1 _pcls1)
                        {
                            this();
                        }
                }

                b = new a(null);
                appclient = b;
                keystore = a;
                SecureRandom securerandom = new SecureRandom();
                keystore.init(null, new TrustManager[] {
                    AppRequestManager.AppClient.this
                }, securerandom);
            }
        }

        return new AppSocketFactory(d);
        Object obj1;
        obj1;
        obj = null;
_L11:
        com.nielsen.app.sdk.c.a(((Throwable) (obj1)), true, 9, 'E', "It failed in loadeing the keystore, it will try to handle the HTTPS calls without credentings. If the CA authorirty id well-known, then there should be no issue", new Object[0]);
        d.load(null, null);
        if (obj != null)
        {
            ((InputStream) (obj)).close();
        }
          goto _L8
        obj1;
        obj = null;
_L10:
        d.load(null, null);
        if (obj != null)
        {
            ((InputStream) (obj)).close();
        }
        throw obj1;
_L2:
        throw new Exception("Could not get the default trust store type (BKS)");
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L10; else goto _L9
_L9:
        obj1;
          goto _L11
_L7:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L4:
        flag = false;
        obj = null;
        if (true) goto _L13; else goto _L12
_L12:
    }

    protected ClientConnectionManager createClientConnectionManager()
    {
        Object obj;
        try
        {
            obj = new SchemeRegistry();
            SSLSocketFactory sslsocketfactory = a();
            sslsocketfactory.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            ((SchemeRegistry) (obj)).register(new Scheme("https", sslsocketfactory, 443));
            ((SchemeRegistry) (obj)).register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
            obj = new ThreadSafeClientConnManager(a.p, ((SchemeRegistry) (obj)));
        }
        catch (Exception exception)
        {
            com.nielsen.app.sdk.c.a(exception, true, 9, 'E', "Could not create the socket", new Object[0]);
            return null;
        }
        return ((ClientConnectionManager) (obj));
    }

    public ConnManager(AppRequestManager apprequestmanager, int i, int j, int k)
    {
        a = apprequestmanager;
        super();
        d = null;
        apprequestmanager.p = getParams();
        apprequestmanager.p.setIntParameter("http.socket.timeout", j);
        apprequestmanager.p.setIntParameter("http.connection.timeout", i);
        apprequestmanager.p.setIntParameter("http.socket.buffer-size", k);
        HttpProtocolParams.setContentCharset(apprequestmanager.p, "UTF-8");
        HttpProtocolParams.setVersion(apprequestmanager.p, HttpVersion.HTTP_1_1);
        setParams(apprequestmanager.p);
    }
}
