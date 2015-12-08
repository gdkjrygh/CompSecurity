// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.braintreepayments.api.internal;

import com.braintreepayments.api.exceptions.BraintreeSslException;
import com.braintreepayments.api.exceptions.UnexpectedException;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.KeyStore;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.braintreepayments.api.internal:
//            BraintreeGatewayCertificate, HttpResponse

public class HttpRequest
{

    private static final String AUTHORIZATION_FINGERPRINT_KEY = "authorizationFingerprint";
    public static boolean DEBUG = false;
    private static final String METHOD_GET = "GET";
    private static final String METHOD_POST = "POST";
    public static final String TAG = "HttpRequest";
    private static final String UTF_8 = "UTF-8";
    private String mAuthorizationFingerprint;
    private int mConnectTimeout;

    public HttpRequest(String s)
    {
        mConnectTimeout = 0;
        mAuthorizationFingerprint = s;
    }

    private static SSLSocketFactory getSslSocketFactory()
    {
        Object obj;
        try
        {
            obj = KeyStore.getInstance(KeyStore.getDefaultType());
            ((KeyStore) (obj)).load(null, null);
            Iterator iterator = CertificateFactory.getInstance("X.509").generateCertificates(BraintreeGatewayCertificate.getCertInputStream()).iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Certificate certificate = (Certificate)iterator.next();
                if (certificate instanceof X509Certificate)
                {
                    ((KeyStore) (obj)).setCertificateEntry(((X509Certificate)certificate).getSubjectDN().getName(), certificate);
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new BraintreeSslException(((Exception) (obj)));
        }
        TrustManagerFactory trustmanagerfactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustmanagerfactory.init(((KeyStore) (obj)));
        obj = SSLContext.getInstance("TLS");
        ((SSLContext) (obj)).init(null, trustmanagerfactory.getTrustManagers(), null);
        obj = ((SSLContext) (obj)).getSocketFactory();
        return ((SSLSocketFactory) (obj));
    }

    public static String getUserAgent()
    {
        return "braintree/android/1.4.0";
    }

    private HttpResponse handleServerResponse(HttpURLConnection httpurlconnection)
    {
        int i = httpurlconnection.getResponseCode();
        Object obj;
        if (i >= 200 && i < 400)
        {
            obj = readStream(httpurlconnection.getInputStream());
        } else
        {
            obj = readStream(httpurlconnection.getErrorStream());
        }
        log((new StringBuilder()).append("Received response code: ").append(i).toString());
        log((new StringBuilder()).append("Received response: ").append(((String) (obj))).toString());
        obj = new HttpResponse(i, ((String) (obj)));
        ((HttpResponse) (obj)).setUrl(httpurlconnection.getURL().toString());
        return ((HttpResponse) (obj));
    }

    private void log(String s)
    {
        if (!DEBUG);
    }

    private String readStream(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        byte abyte0[] = new byte[1024];
        do
        {
            int i = inputstream.read(abyte0);
            if (i != -1)
            {
                bytearrayoutputstream.write(abyte0, 0, i);
            } else
            {
                return new String(bytearrayoutputstream.toByteArray(), "UTF-8");
            }
        } while (true);
    }

    public HttpResponse get(String s)
    {
        String s1;
        String s2;
        s2 = null;
        s1 = null;
        s = init((new StringBuilder()).append(s).append("?authorizationFingerprint=").append(URLEncoder.encode(mAuthorizationFingerprint, "UTF-8")).toString());
        s1 = s;
        s2 = s;
        s.setRequestMethod("GET");
        s1 = s;
        s2 = s;
        HttpResponse httpresponse = handleServerResponse(s);
        if (s != null)
        {
            s.disconnect();
        }
        return httpresponse;
        s;
        s2 = s1;
        throw new UnexpectedException(s.getMessage());
        s;
        if (s2 != null)
        {
            s2.disconnect();
        }
        throw s;
    }

    protected HttpURLConnection init(String s)
    {
        log((new StringBuilder()).append("Opening url: ").append(s).toString());
        s = (HttpURLConnection)(new URL(s)).openConnection();
        if (s instanceof HttpsURLConnection)
        {
            ((HttpsURLConnection)s).setSSLSocketFactory(getSslSocketFactory());
        }
        s.setRequestProperty("Content-Type", "application/json");
        s.setRequestProperty("User-Agent", getUserAgent());
        s.setRequestProperty("Accept-Language", Locale.getDefault().getLanguage());
        s.setConnectTimeout(mConnectTimeout);
        return s;
    }

    public HttpResponse post(String s, String s1)
    {
        String s2;
        String s3;
        String s4;
        Object obj;
        Object obj1;
        Object obj2;
        obj1 = null;
        obj2 = null;
        obj = null;
        s3 = ((String) (obj));
        s2 = obj1;
        s4 = obj2;
        s1 = (new JSONObject(s1)).put("authorizationFingerprint", mAuthorizationFingerprint).toString();
        s3 = ((String) (obj));
        s2 = obj1;
        s4 = obj2;
        s = init(s);
        s3 = s;
        s2 = s;
        s4 = s;
        s.setRequestMethod("POST");
        s3 = s;
        s2 = s;
        s4 = s;
        s.setDoOutput(true);
        s3 = s;
        s2 = s;
        s4 = s;
        obj = new DataOutputStream(s.getOutputStream());
        s3 = s;
        s2 = s;
        s4 = s;
        ((DataOutputStream) (obj)).writeBytes(s1);
        s3 = s;
        s2 = s;
        s4 = s;
        ((DataOutputStream) (obj)).flush();
        s3 = s;
        s2 = s;
        s4 = s;
        ((DataOutputStream) (obj)).close();
        s3 = s;
        s2 = s;
        s4 = s;
        obj = handleServerResponse(s);
        s3 = s;
        s2 = s;
        s4 = s;
        ((HttpResponse) (obj)).setData(s1);
        if (s != null)
        {
            s.disconnect();
        }
        return ((HttpResponse) (obj));
        s;
        s2 = s3;
        throw new UnexpectedException(s.getMessage());
        s;
        if (s2 != null)
        {
            s2.disconnect();
        }
        throw s;
        s;
        s2 = s4;
        throw new UnexpectedException(s.getMessage());
    }

    protected void setConnectTimeout(int i)
    {
        mConnectTimeout = i;
    }

    static 
    {
        DEBUG = false;
    }
}
