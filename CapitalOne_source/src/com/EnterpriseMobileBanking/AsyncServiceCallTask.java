// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.content.Context;
import android.os.AsyncTask;
import com.EnterpriseMobileBanking.Plugins.NativeCache;
import com.EnterpriseMobileBanking.Plugins.WebViewLinker;
import com.EnterpriseMobileBanking.Utils.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.SingleClientConnManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.EnterpriseMobileBanking:
//            Config

public class AsyncServiceCallTask extends AsyncTask
{
    class MyHttpClient extends DefaultHttpClient
    {

        final Context context;
        TrustManager easyTrustManager;
        final AsyncServiceCallTask this$0;

        private MySSLSocketFactory newSslSocketFactory()
        {
            Object obj;
            Exception exception;
            try
            {
                obj = KeyStore.getInstance("BKS");
            }
            catch (Exception exception1)
            {
                throw new AssertionError(exception1);
            }
            ((KeyStore) (obj)).load(null, null);
            obj = new MySSLSocketFactory(((KeyStore) (obj)));
            ((MySSLSocketFactory) (obj)).setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            return ((MySSLSocketFactory) (obj));
            exception;
            throw exception;
        }

        protected ClientConnectionManager createClientConnectionManager()
        {
            SchemeRegistry schemeregistry = new SchemeRegistry();
            schemeregistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
            schemeregistry.register(new Scheme("https", newSslSocketFactory(), 443));
            return new SingleClientConnManager(getParams(), schemeregistry);
        }

        public MyHttpClient(Context context1)
        {
            this$0 = AsyncServiceCallTask.this;
            super();
            easyTrustManager = new _cls1();
            context = context1;
        }
    }

    public class MyHttpClient.MySSLSocketFactory extends SSLSocketFactory
    {

        SSLContext sslContext;
        final MyHttpClient this$1;

        public Socket createSocket()
            throws IOException
        {
            return sslContext.getSocketFactory().createSocket();
        }

        public Socket createSocket(Socket socket, String s, int i, boolean flag)
            throws IOException, UnknownHostException
        {
            return sslContext.getSocketFactory().createSocket(socket, s, i, flag);
        }

        public MyHttpClient.MySSLSocketFactory(KeyStore keystore)
            throws NoSuchAlgorithmException, KeyManagementException, KeyStoreException, UnrecoverableKeyException
        {
            this$1 = MyHttpClient.this;
            super(keystore);
            sslContext = SSLContext.getInstance("TLS");
            myhttpclient = new _cls1();
            sslContext.init(null, new TrustManager[] {
                MyHttpClient.this
            }, null);
        }
    }


    public static final String JSON_CONFIG_360 = "Cap360ContactInfo";
    public static final String JSON_CONFIG_ATM_360_ATM_LOCATOR = "Cap360AtmLocator";
    public static final String JSON_CONFIG_CAP1 = "CapOneContactInfo";
    public static final String JSON_CONFIG_DELTA_HOURS = "ConfigUpdateDeltaHours";
    public static final String JSON_CONFIG_EMAIL = "Email";
    public static final String JSON_CONFIG_FACEBOOK_APP = "FacebookApp";
    public static final String JSON_CONFIG_FACEBOOK_HTTP = "FacebookHTTP";
    public static final String JSON_CONFIG_OPEN_OUTSIDE = "OpenOutsideApp";
    public static final String JSON_CONFIG_OUTSIDE_US_NUMBER = "OutsideUSNumber";
    public static final String JSON_CONFIG_PHONE_NUMBER = "PhoneNumber";
    public static final String JSON_CONFIG_PRODUCTS = "Products";
    public static final String JSON_CONFIG_PRODUCTS_360_AUTH_URL = "ThreeSixtyAuthProductsUrl";
    public static final String JSON_CONFIG_PRODUCTS_360_URL = "ThreeSixtyProductsUrl";
    public static final String JSON_CONFIG_PRODUCTS_BRANCH_URL = "CapitalOneBranchFinderUrl";
    public static final String JSON_CONFIG_TWITTER_APP = "TwitterApp";
    public static final String JSON_CONFIG_TWITTER_HTTP = "TwitterHTTP";
    public static final String JSON_CONFIG_VERSION = "Version";
    public static final int SERVICE_ID_CONFIG = 0;
    private static final String TAG = "AsyncServiceCallTask";
    private static Map serviceUrls;
    private Context mCtx;
    private int mServiceId;

    public AsyncServiceCallTask(int i, Context context)
    {
        mServiceId = i;
        mCtx = context;
    }

    private String getAppAndHttpString(String s, String s1)
    {
        return (new StringBuilder()).append("{ \"app\":\"").append(s).append("\", \"web\":\"").append(s1).append("\" }").toString();
    }

    private void handleConfigResponse(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return;
        }
        try
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject("CapOneContactInfo");
            NativeCache.staticWrite("SP_CONTACT_CAP1_US_PHONE", jsonobject1.getString("PhoneNumber"));
            NativeCache.staticWrite("SP_CONTACT_CAP1_NON_US_PHONE", jsonobject1.getString("OutsideUSNumber"));
            NativeCache.staticWrite("SP_CONTACT_CAP1_TWITTER", getAppAndHttpString(jsonobject1.getString("TwitterApp"), jsonobject1.getString("TwitterHTTP")));
            NativeCache.staticWrite("SP_CONTACT_CAP1_FACEBOOK", getAppAndHttpString(jsonobject1.getString("FacebookApp"), jsonobject1.getString("FacebookHTTP")));
            jsonobject1 = jsonobject.getJSONObject("Cap360ContactInfo");
            NativeCache.staticWrite("SP_CONTACT_360_US_PHONE", jsonobject1.getString("PhoneNumber"));
            NativeCache.staticWrite("SP_CONTACT_360_EMAIL", jsonobject1.getString("Email"));
            NativeCache.staticWrite("SP_CONTACT_360_TWITTER", getAppAndHttpString(jsonobject1.getString("TwitterApp"), jsonobject1.getString("TwitterHTTP")));
            NativeCache.staticWrite("SP_CONTACT_360_FACEBOOK", getAppAndHttpString(jsonobject1.getString("FacebookApp"), jsonobject1.getString("FacebookHTTP")));
            NativeCache.staticWrite("SP_CONFIG_DETLA_HOURS", jsonobject.getInt("ConfigUpdateDeltaHours"));
            NativeCache.staticWrite("SP_ATM_CAP360_ATM_LOCATOR", jsonobject.getString("Cap360AtmLocator"));
            NativeCache.staticWrite("SP_URL_OPEN_OUTSIDE", jsonobject.getJSONArray("OpenOutsideApp").join(","));
            WebViewLinker.setOutsideAppList(jsonobject.getJSONArray("OpenOutsideApp"));
            jsonobject = jsonobject.getJSONObject("Products");
            NativeCache.staticWrite("SP_PRODUCTS_360_PRODUCTS_URL", jsonobject.getString("ThreeSixtyProductsUrl"));
            NativeCache.staticWrite("SP_PRODUCTS_360_PRODUCTS_AUTH_URL", jsonobject.getString("ThreeSixtyAuthProductsUrl"));
            NativeCache.staticWrite("SP_PRODUCTS_BRANCH_URL", jsonobject.getString("CapitalOneBranchFinderUrl"));
            NativeCache.staticWrite("SP_CONFIG_LAST_UPDATED_MILLIS", System.currentTimeMillis());
            Log.v("AsyncServiceCallTask", "Made it to the end of putting in config params");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.v("AsyncServiceCallTask", (new StringBuilder()).append("Error parsing data ").append(jsonobject.toString()).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.v("AsyncServiceCallTask", (new StringBuilder()).append("Error converting result ").append(jsonobject.toString()).toString());
        }
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient HttpResponse doInBackground(Void avoid[])
    {
        Object obj = (String)serviceUrls.get(Integer.valueOf(mServiceId));
        if (Config.MOBILE_CONFIG_BYPASS_SSL_ERRORS.booleanValue())
        {
            avoid = new MyHttpClient(mCtx);
        } else
        {
            avoid = new DefaultHttpClient();
        }
        obj = new HttpGet(((String) (obj)));
        try
        {
            avoid = avoid.execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            avoid.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Void avoid[])
        {
            avoid.printStackTrace();
            return null;
        }
        return avoid;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((HttpResponse)obj);
    }

    protected void onPostExecute(HttpResponse httpresponse)
    {
        if (httpresponse != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        if (httpresponse.getStatusLine().getStatusCode() != 200)
        {
            Log.v("AsyncServiceCallTask", (new StringBuilder()).append("status code not zero: ").append(httpresponse.getStatusLine().getStatusCode()).toString());
            return;
        }
        obj = null;
        BufferedReader bufferedreader;
        StringBuilder stringbuilder;
        httpresponse = httpresponse.getEntity().getContent();
        bufferedreader = new BufferedReader(new InputStreamReader(httpresponse, "iso-8859-1"), 8);
        stringbuilder = new StringBuilder();
_L3:
        String s = bufferedreader.readLine();
        if (s == null)
        {
            break;
        }
        stringbuilder.append((new StringBuilder()).append(s).append("\n").toString());
          goto _L3
        while (false) 
        {
            try
            {
                httpresponse.close();
                httpresponse = new JSONObject(stringbuilder.toString());
            }
            // Misplaced declaration of an exception variable
            catch (HttpResponse httpresponse)
            {
                httpresponse.printStackTrace();
                httpresponse = obj;
            }
            // Misplaced declaration of an exception variable
            catch (HttpResponse httpresponse)
            {
                httpresponse.printStackTrace();
                httpresponse = obj;
            }
            // Misplaced declaration of an exception variable
            catch (HttpResponse httpresponse)
            {
                Log.v("AsyncServiceCallTask", (new StringBuilder()).append("Error parsing data ").append(httpresponse.toString()).toString());
                httpresponse = obj;
            }
            // Misplaced declaration of an exception variable
            catch (HttpResponse httpresponse)
            {
                Log.v("AsyncServiceCallTask", (new StringBuilder()).append("Error converting result ").append(httpresponse.toString()).toString());
                httpresponse = obj;
            }
            if (mServiceId == 0)
            {
                handleConfigResponse(httpresponse);
                return;
            }
        }
_L6:
        if (true) goto _L1; else goto _L4
_L4:
        if (true) goto _L6; else goto _L5
_L5:
    }

    static 
    {
        serviceUrls = new HashMap();
        serviceUrls.put(Integer.valueOf(0), "https://m.capitalone.com:443/static/mobileconfig.json");
    }

    // Unreferenced inner class com/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient$1

/* anonymous class */
    class MyHttpClient._cls1
        implements X509TrustManager
    {

        final MyHttpClient this$1;

        public void checkClientTrusted(X509Certificate ax509certificate[], String s)
            throws CertificateException
        {
        }

        public void checkServerTrusted(X509Certificate ax509certificate[], String s)
            throws CertificateException
        {
        }

        public X509Certificate[] getAcceptedIssuers()
        {
            return null;
        }

            
            {
                this$1 = MyHttpClient.this;
                super();
            }
    }


    // Unreferenced inner class com/EnterpriseMobileBanking/AsyncServiceCallTask$MyHttpClient$MySSLSocketFactory$1

/* anonymous class */
    class MyHttpClient.MySSLSocketFactory._cls1
        implements X509TrustManager
    {

        final MyHttpClient.MySSLSocketFactory this$2;
        final MyHttpClient val$this$1;

        public void checkClientTrusted(X509Certificate ax509certificate[], String s)
            throws CertificateException
        {
        }

        public void checkServerTrusted(X509Certificate ax509certificate[], String s)
            throws CertificateException
        {
        }

        public X509Certificate[] getAcceptedIssuers()
        {
            return null;
        }

            
            {
                this$2 = final_mysslsocketfactory;
                this$1 = MyHttpClient.this;
                super();
            }
    }

}
