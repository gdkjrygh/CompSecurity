// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
import java.security.KeyStore;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.TrustManagerFactory;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.worklight.wlclient:
//            WLPersistentCookieStore, WorklightRedirectHandler, WLHttpInterceptor

public class HttpClientManager
{

    private static final int SOCKET_OPERATION_TIMEOUT = 60000;
    private static HttpClientManager instance;
    private static Logger logger = Logger.getInstance(com/worklight/wlclient/HttpClientManager.getName());
    private DefaultHttpClient httpCacheableInvokeClient;
    private DefaultHttpClient httpClient;
    private HttpContext httpContext;
    private String webViewUserAgent;

    private HttpClientManager(Context context)
    {
        BasicHttpParams basichttpparams = new BasicHttpParams();
        HttpConnectionParams.setStaleCheckingEnabled(basichttpparams, false);
        HttpConnectionParams.setConnectionTimeout(basichttpparams, 60000);
        HttpConnectionParams.setSoTimeout(basichttpparams, 60000);
        HttpConnectionParams.setSocketBufferSize(basichttpparams, 8192);
        HttpClientParams.setRedirecting(basichttpparams, true);
        HttpClientParams.setAuthenticating(basichttpparams, false);
        Object obj = new SchemeRegistry();
        Object obj1 = WLConfig.getInstance().getProtocol();
        Integer.valueOf(WLConfig.getInstance().getPort()).intValue();
        if (((String) (obj1)).equalsIgnoreCase("http") || ((String) (obj1)).equalsIgnoreCase("https"))
        {
            ((SchemeRegistry) (obj)).register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
            try
            {
                ((SchemeRegistry) (obj)).register(new Scheme("https", SSLCertificateSocketFactory.getHttpSocketFactory(60000, null), 443));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                logger.error("Error while registering the https schema", ((Throwable) (obj1)));
            }
            obj = new ThreadSafeClientConnManager(basichttpparams, ((SchemeRegistry) (obj)));
            httpClient = new DefaultHttpClient(((ClientConnectionManager) (obj)), basichttpparams);
            httpClient.setCookieStore(new WLPersistentCookieStore(context));
            httpClient.setRedirectHandler(new WorklightRedirectHandler(this));
            httpCacheableInvokeClient = new DefaultHttpClient(((ClientConnectionManager) (obj)), basichttpparams);
            httpContext = new BasicHttpContext();
            httpContext.setAttribute("http.cookie-store", httpClient.getCookieStore());
            webViewUserAgent = System.getProperty("http.agent");
            if (!webViewUserAgent.contains("Worklight"))
            {
                webViewUserAgent = (new StringBuilder()).append(webViewUserAgent).append("/Worklight/").append(WLConfig.getInstance().getPlatformVersion()).toString();
            }
            context = new WLHttpInterceptor(Logger.getInstance("wl.resource_request"), WLConfig.getInstance());
            httpClient.addRequestInterceptor(context);
            httpClient.addResponseInterceptor(context);
            return;
        } else
        {
            throw new RuntimeException((new StringBuilder()).append("HttpClientFactory: Can't create HttpClient with protocol ").append(((String) (obj1))).toString());
        }
    }

    public static void createInstance(Context context)
    {
        com/worklight/wlclient/HttpClientManager;
        JVM INSTR monitorenter ;
        if (instance == null)
        {
            instance = new HttpClientManager(context);
        }
        com/worklight/wlclient/HttpClientManager;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    private static KeyStore getAndroidCATrustStore()
    {
        KeyStore keystore;
        try
        {
            keystore = KeyStore.getInstance("AndroidCAStore");
            TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm()).init(keystore);
        }
        catch (Throwable throwable)
        {
            return null;
        }
        return keystore;
    }

    public static HttpClientManager getInstance()
    {
        if (instance == null)
        {
            throw new IllegalStateException("HttpClientManager should be created first (before calling getInstance");
        } else
        {
            return instance;
        }
    }

    private static void replaceSocketFactory(SSLSocketFactory sslsocketfactory)
    {
        SchemeRegistry schemeregistry = instance.httpClient.getConnectionManager().getSchemeRegistry();
        Object obj = schemeregistry.getSchemeNames().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            if (!((String)((Iterator) (obj)).next()).equalsIgnoreCase("https"))
            {
                continue;
            }
            obj = schemeregistry.getScheme("https");
            schemeregistry.unregister("https");
            schemeregistry.register(new Scheme("https", sslsocketfactory, ((Scheme) (obj)).getDefaultPort()));
            break;
        } while (true);
    }

    static void resetInstance(Context context)
    {
        com/worklight/wlclient/HttpClientManager;
        JVM INSTR monitorenter ;
        instance = new HttpClientManager(context);
        com/worklight/wlclient/HttpClientManager;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    public static boolean setSSLSocketFactory(KeyStore keystore, char ac[])
    {
        boolean flag = true;
        KeyStore keystore1;
        try
        {
            keystore1 = getAndroidCATrustStore();
        }
        // Misplaced declaration of an exception variable
        catch (KeyStore keystore)
        {
            if (true)
            {
                flag = false;
            }
            return flag;
        }
        if (keystore1 == null)
        {
            return false;
        }
        keystore = new SSLSocketFactory(keystore, new String(ac), keystore1);
        if (instance != null && instance.httpClient != null)
        {
            replaceSocketFactory(keystore);
        }
        return true;
    }

    public DefaultHttpClient getHttpCacheableInvokeClient()
    {
        return httpCacheableInvokeClient;
    }

    public DefaultHttpClient getHttpClient()
    {
        return httpClient;
    }

    public HttpContext getHttpContext()
    {
        return httpContext;
    }

    public String getWebViewUserAgent()
    {
        return webViewUserAgent;
    }

}
