// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import android.content.Context;
import android.net.SSLCertificateSocketFactory;
import android.net.SSLSessionCache;
import android.net.http.AndroidHttpClient;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.UnknownHostException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.LayeredSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpParams;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            TDURLConnection, StringUtils, THMStatusCode, ProxyWrapper, 
//            CancelState, HttpParameterMap

class ApacheURLConnectionImpl
    implements TDURLConnection
{

    private static final String j = StringUtils.a(com/threatmetrix/TrustDefenderMobile/ApacheURLConnectionImpl);
    private final AndroidHttpClient a;
    private final ArrayList b = new ArrayList();
    private HttpResponse c;
    private HttpRequestBase d;
    private THMStatusCode e;
    private final CancelState f;
    private InputStream g;
    private boolean h;
    private Context i;

    ApacheURLConnectionImpl(AndroidHttpClient androidhttpclient, CancelState cancelstate, Context context, boolean flag)
    {
        a = androidhttpclient;
        e = THMStatusCode.a;
        d = null;
        f = cancelstate;
        g = null;
        h = flag;
        i = context;
    }

    static void a(Context context, HttpClient httpclient, int k)
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            b(context, httpclient, k);
            return;
        } else
        {
            c(context, httpclient, k);
            return;
        }
    }

    private void a(HttpRequestBase httprequestbase)
    {
        this;
        JVM INSTR monitorenter ;
        d = httprequestbase;
        this;
        JVM INSTR monitorexit ;
        BasicHeader basicheader;
        for (httprequestbase = b.iterator(); httprequestbase.hasNext(); d.addHeader(basicheader))
        {
            basicheader = (BasicHeader)httprequestbase.next();
        }

        break MISSING_BLOCK_LABEL_52;
        httprequestbase;
        this;
        JVM INSTR monitorexit ;
        throw httprequestbase;
        HttpClientParams.setRedirecting(d.getParams(), true);
        httprequestbase = new ProxyWrapper();
        if (httprequestbase.a() != null && !httprequestbase.a().isEmpty())
        {
            httprequestbase = new HttpHost(httprequestbase.a(), httprequestbase.b());
            a.getParams().setParameter("http.route.default-proxy", httprequestbase);
        } else
        {
            a.getParams().setParameter("http.route.default-proxy", null);
        }
        try
        {
            c = a.execute(d);
            e = THMStatusCode.b;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequestBase httprequestbase) { }
        // Misplaced declaration of an exception variable
        catch (HttpRequestBase httprequestbase)
        {
            Log.e(j, "Caught runtime exception:", httprequestbase);
            e = THMStatusCode.c;
            return;
        }
        if (httprequestbase.getCause() instanceof CertificateException)
        {
            e = THMStatusCode.g;
        } else
        if (httprequestbase instanceof SSLPeerUnverifiedException)
        {
            e = THMStatusCode.g;
        } else
        if (httprequestbase instanceof UnknownHostException)
        {
            e = THMStatusCode.d;
        } else
        if (httprequestbase instanceof SocketTimeoutException)
        {
            e = THMStatusCode.e;
        } else
        if (e == THMStatusCode.a)
        {
            e = THMStatusCode.c;
        }
        if (f != null && f.a())
        {
            Log.d(j, "Connection interrupted due to cancel!");
            c();
            return;
        } else
        {
            Log.e(j, "Failed to retrieve URI", httprequestbase);
            return;
        }
    }

    private static void b(Context context, HttpClient httpclient, int k)
    {
        context = SSLCertificateSocketFactory.getHttpSocketFactory(k, new SSLSessionCache(context));
        httpclient.getConnectionManager().getSchemeRegistry().register(new Scheme("https", context, 443));
    }

    private static void c(Context context, HttpClient httpclient, int k)
    {
        context = new LayeredSocketFactory(k, context) {

            final SSLSocketFactory a;
            final int b;
            final Context c;

            private void a(Socket socket, String s)
            {
                try
                {
                    Field field = java/net/InetAddress.getDeclaredField("hostName");
                    field.setAccessible(true);
                    field.set(socket.getInetAddress(), s);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Socket socket)
                {
                    return;
                }
            }

            public Socket connectSocket(Socket socket, String s, int l, InetAddress inetaddress, int i1, HttpParams httpparams)
            {
                return a.connectSocket(socket, s, l, inetaddress, i1, httpparams);
            }

            public Socket createSocket()
            {
                return a.createSocket();
            }

            public Socket createSocket(Socket socket, String s, int l, boolean flag)
            {
                a(socket, s);
                return a.createSocket(socket, s, l, flag);
            }

            public boolean isSecure(Socket socket)
            {
                return a.isSecure(socket);
            }

            
            {
                b = k;
                c = context;
                super();
                a = SSLCertificateSocketFactory.getHttpSocketFactory(b, new SSLSessionCache(c));
            }
        };
        httpclient.getConnectionManager().getSchemeRegistry().register(new Scheme("https", context, 443));
    }

    public long a(String s)
    {
        a(((HttpRequestBase) (new HttpGet(s))));
        if (c == null || e != THMStatusCode.b)
        {
            return -1L;
        } else
        {
            return (long)c.getStatusLine().getStatusCode();
        }
    }

    public long a(String s, HttpParameterMap httpparametermap)
    {
        if (h && i != null)
        {
            AbstractHttpEntity abstracthttpentity = a(httpparametermap, i);
            httpparametermap = abstracthttpentity;
            if (abstracthttpentity.getContentEncoding() != null)
            {
                Log.d(j, (new StringBuilder()).append("Entity content encoding: ").append(abstracthttpentity.getContentEncoding().getValue()).toString());
                a("Content-Encoding", abstracthttpentity.getContentEncoding().getValue());
                a("Accept-Encoding", "gzip, deflate");
                httpparametermap = abstracthttpentity;
            }
        } else
        {
            httpparametermap = a(httpparametermap);
        }
        s = new HttpPost(s);
        s.setEntity(httpparametermap);
        a(((HttpRequestBase) (s)));
        if (c == null || e != THMStatusCode.b)
        {
            return -1L;
        } else
        {
            return (long)c.getStatusLine().getStatusCode();
        }
    }

    public String a()
    {
        if (d != null)
        {
            return (new StringBuilder()).append(d.getURI().getScheme()).append("://").append(d.getURI().getHost()).append(d.getURI().getPath()).toString();
        } else
        {
            return "";
        }
    }

    public UrlEncodedFormEntity a(HttpParameterMap httpparametermap)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = httpparametermap.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s2 = (String)iterator.next();
            String s1 = (String)httpparametermap.get(s2);
            if (s1 != null && !s1.isEmpty())
            {
                String s = s1;
                if (httpparametermap.a() != 0)
                {
                    s = s1;
                    if (s1.length() > httpparametermap.a())
                    {
                        s = s1.substring(0, httpparametermap.a());
                    }
                }
                arraylist.add(new BasicNameValuePair(s2, s));
            }
        } while (true);
        try
        {
            httpparametermap = new UrlEncodedFormEntity(arraylist, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (HttpParameterMap httpparametermap)
        {
            Log.e(j, "Failed url encoding", httpparametermap);
            return null;
        }
        return httpparametermap;
    }

    public AbstractHttpEntity a(HttpParameterMap httpparametermap, Context context)
    {
        StringBuilder stringbuilder = new StringBuilder();
        ArrayList arraylist = new ArrayList();
        Iterator iterator = httpparametermap.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s2 = (String)iterator.next();
            String s1 = (String)httpparametermap.get(s2);
            if (s1 != null && !s1.isEmpty())
            {
                String s = s1;
                if (httpparametermap.a() != 0)
                {
                    s = s1;
                    if (s1.length() > httpparametermap.a())
                    {
                        s = s1.substring(0, httpparametermap.a());
                    }
                }
                arraylist.add(new BasicNameValuePair(s2, s));
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append("&");
                }
                stringbuilder.append((new BasicNameValuePair(s2, s)).toString());
            }
        } while (true);
        try
        {
            byte abyte0[] = stringbuilder.toString().getBytes("UTF-8");
            if ((long)abyte0.length < AndroidHttpClient.getMinGzipSize(context.getContentResolver()))
            {
                Log.d(j, (new StringBuilder()).append("POST data too small to compress ").append(abyte0.length).append(" bytes").toString());
            } else
            {
                Log.d(j, (new StringBuilder()).append("Original content length: ").append(abyte0.length).toString());
            }
            return AndroidHttpClient.getCompressedEntity(abyte0, context.getContentResolver());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e(j, "Failed url encoding", context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e(j, "Failed IO during encoding", context);
        }
        return a(httpparametermap);
    }

    public void a(String s, String s1)
    {
        b.add(new BasicHeader(s, s1));
    }

    public void a(Map map)
    {
        if (map != null)
        {
            Iterator iterator = map.keySet().iterator();
            while (iterator.hasNext()) 
            {
                String s = (String)iterator.next();
                String s1 = (String)map.get(s);
                if (s1 != null && !s1.isEmpty())
                {
                    a(s, s1);
                }
            }
        }
    }

    public String b()
    {
        if (d != null)
        {
            return d.getURI().getHost();
        } else
        {
            return "";
        }
    }

    public void c()
    {
        Log.d(j, "aborting connection");
        this;
        JVM INSTR monitorenter ;
        if (d != null)
        {
            d.abort();
        }
        this;
        JVM INSTR monitorexit ;
        e = THMStatusCode.h;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public InputStream d()
    {
        if (g != null)
        {
            return g;
        }
        if (c != null)
        {
            g = c.getEntity().getContent();
            return g;
        } else
        {
            return null;
        }
    }

    public int e()
    {
        if (c != null)
        {
            return c.getStatusLine().getStatusCode();
        } else
        {
            return 0;
        }
    }

    public void f()
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        InputStream inputstream;
        InputStream inputstream1;
        Object obj1;
        Object obj2;
        HttpEntity httpentity;
        httpentity = c.getEntity();
        obj1 = null;
        obj2 = null;
        inputstream1 = null;
        inputstream = obj1;
        obj = obj2;
        if (g != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (httpentity == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        inputstream = obj1;
        obj = obj2;
        inputstream1 = httpentity.getContent();
        inputstream = inputstream1;
        obj = inputstream1;
        httpentity.consumeContent();
_L4:
        if (inputstream1 != null)
        {
            try
            {
                inputstream1.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        inputstream = obj1;
        obj = obj2;
        inputstream1 = g;
          goto _L4
        IOException ioexception1;
        ioexception1;
        obj = inputstream;
        Log.d(j, "failed to consume content", ioexception1);
        if (inputstream == null) goto _L1; else goto _L5
_L5:
        try
        {
            inputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        Exception exception;
        exception;
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            catch (IOException ioexception) { }
        }
        throw exception;
    }

    public THMStatusCode g()
    {
        return e;
    }

}
