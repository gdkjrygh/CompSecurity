// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            ad, ag

public class k
{

    private final DefaultHttpClient a;
    private final String b;
    private Context c;

    public k()
    {
        b = "";
        a = a();
    }

    public k(String s, Context context)
    {
        b = s;
        a = a();
        c = context;
    }

    private String a(HttpRequestBase httprequestbase)
    {
        Object obj;
        int i;
        try
        {
            a.getConnectionManager().closeExpiredConnections();
            obj = a.execute(httprequestbase);
            i = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequestBase httprequestbase)
        {
            crittercism/android/k.getClass().getCanonicalName();
            throw new ad("Error: connection timed out, please try again later.", ad.a.b);
        }
        catch (IOException ioexception)
        {
            httprequestbase.abort();
            for (int j = 0; j < httprequestbase.getAllHeaders().length; j++)
            {
                Header header = httprequestbase.getAllHeaders()[j];
                (new StringBuilder()).append(header.getName()).append(": ").append(header.getValue());
            }

            crittercism/android/k.getClass().getCanonicalName();
            (new StringBuilder("Error: Aborting HTTP Request: ")).append(ioexception.getLocalizedMessage());
            if (ioexception.getMessage() != null && ioexception.getMessage().toLowerCase().contains("no route to host"))
            {
                throw new ad("Error: no internet connection", ad.a.a);
            }
            if (ioexception.getStackTrace()[0].toString().contains("java.net.InetAddress.lookupHostByName"))
            {
                crittercism/android/k.getClass().getCanonicalName();
                throw new ad("Error: no internet connection", ad.a.a);
            } else
            {
                throw ioexception;
            }
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequestBase httprequestbase)
        {
            crittercism/android/k.getClass().getCanonicalName();
            (new StringBuilder("Neither ConnectTimeoutException nor IOException.  Instead: ")).append(httprequestbase.getClass().getName());
            httprequestbase.printStackTrace();
            return "";
        }
        i;
        JVM INSTR tableswitch 200 202: default 429
    //                   200 154
    //                   201 64
    //                   202 166;
           goto _L1 _L2 _L1 _L3
_L1:
        crittercism/android/k.getCanonicalName();
        (new StringBuilder("executeHttpRequest error=")).append(i).append(" - ").append(((HttpResponse) (obj)).getStatusLine().toString());
        crittercism/android/k.getCanonicalName();
        (new StringBuilder("executeHttpRequest error=")).append(i).append(" - ").append(((HttpResponse) (obj)).getStatusLine().toString());
        ((HttpResponse) (obj)).getEntity().consumeContent();
        return "";
_L2:
        return EntityUtils.toString(((HttpResponse) (obj)).getEntity(), "UTF-8");
_L3:
        obj = new HashMap();
        ((Map) (obj)).put("success", Integer.valueOf(1));
        obj = (new JSONObject(((Map) (obj)))).toString();
        return ((String) (obj));
    }

    private static DefaultHttpClient a()
    {
        SchemeRegistry schemeregistry = new SchemeRegistry();
        schemeregistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        Object obj = SSLSocketFactory.BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
        SSLSocketFactory sslsocketfactory = SSLSocketFactory.getSocketFactory();
        sslsocketfactory.setHostnameVerifier((X509HostnameVerifier)obj);
        schemeregistry.register(new Scheme("https", sslsocketfactory, 443));
        obj = new BasicHttpParams();
        HttpConnectionParams.setStaleCheckingEnabled(((org.apache.http.params.HttpParams) (obj)), false);
        HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj)), 20000);
        HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj)), 20000);
        HttpConnectionParams.setSocketBufferSize(((org.apache.http.params.HttpParams) (obj)), 8192);
        HttpClientParams.setRedirecting(((org.apache.http.params.HttpParams) (obj)), false);
        return new DefaultHttpClient(new ThreadSafeClientConnManager(((org.apache.http.params.HttpParams) (obj)), schemeregistry), ((org.apache.http.params.HttpParams) (obj)));
    }

    public final String a(String s, JSONObject jsonobject)
    {
        crittercism/android/k.getCanonicalName();
        (new StringBuilder("*** executing HTTP Post with JSON : ")).append(s);
        s = new HttpPost(s);
        s.addHeader("User-Agent", b);
        s.addHeader("Content-Type", "application/json");
        try
        {
            s.setEntity(new ByteArrayEntity(jsonobject.toString().getBytes("UTF8")));
            (new StringBuilder("JSON Object for request: ")).append(jsonobject.toString());
            (new StringBuilder("httpPost Entity is: ")).append(s.getEntity().getContent().toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException("Error encoding http params");
        }
        return a(((HttpRequestBase) (s)));
    }

    public final String a(String s, JSONObject jsonobject, String as[], String s1)
    {
        String s2;
        int i;
        i = 0;
        crittercism/android/k.getCanonicalName();
        (new StringBuilder("*** executing HTTP Post with File : ")).append(s);
        new String();
        byte abyte0[] = new byte[30];
        (new Random()).nextBytes(abyte0);
        s2 = ag.a(abyte0);
        (new StringBuilder("boundary = ")).append(s2);
        s = new HttpPost(s);
        s.addHeader("User-Agent", b);
        s.addHeader("Content-Type", (new StringBuilder("multipart/form-data; boundary=")).append(s2).append("; charset=\"utf-8\"").toString());
        s.addHeader("Accept", "text/plain, application/json");
        s.addHeader("Content-Disposition", "form-data");
        ByteArrayOutputStream bytearrayoutputstream;
        bytearrayoutputstream = new ByteArrayOutputStream();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append((new StringBuilder("--")).append(s2).append("\n").toString());
        stringbuilder.append((new StringBuilder("Content-Disposition: form-data; name=\"")).append(s1).append("json\";\n").toString());
        stringbuilder.append("Content-type: application/json\n\n");
        stringbuilder.append((new StringBuilder()).append(jsonobject.toString()).append("\n").toString());
        bytearrayoutputstream.write(stringbuilder.toString().getBytes("UTF-8"));
_L2:
        byte abyte1[];
        if (i >= as.length)
        {
            break MISSING_BLOCK_LABEL_508;
        }
        jsonobject = new File(as[i]);
        StringBuilder stringbuilder1 = new StringBuilder();
        stringbuilder1.append((new StringBuilder("--")).append(s2).append("\n").toString());
        stringbuilder1.append((new StringBuilder("Content-Disposition: form-data; name=\"")).append(s1).append(Integer.toString(i)).append("\"; filename=\"").append(jsonobject.getName()).append("\";\n").toString());
        stringbuilder1.append("Content-type: application/octet-stream\n\n");
        bytearrayoutputstream.write(stringbuilder1.toString().getBytes("UTF-8"));
        jsonobject = new FileInputStream(jsonobject);
        abyte1 = new byte[8192];
_L1:
        int j = jsonobject.read(abyte1);
        if (j < 0)
        {
            break MISSING_BLOCK_LABEL_457;
        }
        bytearrayoutputstream.write(abyte1, 0, j);
          goto _L1
        try
        {
            jsonobject = new StringBuilder();
            jsonobject.append((new StringBuilder("--")).append(s2).append("--").toString());
            bytearrayoutputstream.write(jsonobject.toString().getBytes("UTF-8"));
            s.setEntity(new ByteArrayEntity(bytearrayoutputstream.toByteArray()));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject) { }
        return a(((HttpRequestBase) (s)));
        stringbuilder2 = new StringBuilder();
        stringbuilder2.append("\n");
        bytearrayoutputstream.write(stringbuilder2.toString().getBytes("UTF-8"));
        jsonobject.close();
        bytearrayoutputstream.close();
        i++;
          goto _L2
    }
}
