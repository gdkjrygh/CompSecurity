// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.androidquery.callback;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Xml;
import com.androidquery.util.Common;
import com.androidquery.util.Progress;
import com.androidquery.util.a;
import com.androidquery.util.d;
import com.androidquery.util.f;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.scheme.SocketFactory;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package com.androidquery.callback:
//            a, b, c

public abstract class AbstractAjaxCallback
    implements Runnable
{

    private static c J;
    private static final Class L[] = {
        java/lang/String, java/lang/Object, com/androidquery/callback/a
    };
    private static ExecutorService P;
    private static SocketFactory Q;
    private static DefaultHttpClient R;
    private static b S;
    private static int T = 200;
    private static int i = 30000;
    private static String j = null;
    private static int k = 4;
    private static boolean l = true;
    private static boolean m = true;
    private static boolean n = false;
    private int A;
    private boolean B;
    private long C;
    private String D;
    private WeakReference E;
    private int F;
    private HttpUriRequest G;
    private boolean H;
    private int I;
    private HttpHost K;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean U;
    protected Map a;
    protected Map b;
    protected Map c;
    protected Object d;
    protected com.androidquery.a.a e;
    protected com.androidquery.callback.a f;
    protected boolean g;
    protected boolean h;
    private Class o;
    private Reference p;
    private Object q;
    private String r;
    private WeakReference s;
    private String t;
    private String u;
    private c v;
    private int w;
    private File x;
    private File y;
    private boolean z;

    public AbstractAjaxCallback()
    {
        w = 0;
        A = 0;
        B = true;
        D = "UTF-8";
        F = 4;
        H = true;
        I = 0;
    }

    private File a(File file)
        throws IOException
    {
        file = new File((new StringBuilder(String.valueOf(file.getAbsolutePath()))).append(".tmp").toString());
        file.createNewFile();
        return file;
    }

    private static String a(Uri uri)
    {
        String s1 = (new StringBuilder(String.valueOf(uri.getScheme()))).append("://").append(uri.getAuthority()).append(uri.getPath()).toString();
        String s2 = uri.getFragment();
        uri = s1;
        if (s2 != null)
        {
            uri = (new StringBuilder(String.valueOf(s1))).append("#").append(s2).toString();
        }
        return uri;
    }

    static String a(AbstractAjaxCallback abstractajaxcallback)
    {
        return abstractajaxcallback.t;
    }

    private String a(HttpEntity httpentity)
    {
        if (httpentity != null)
        {
            if ((httpentity = httpentity.getContentEncoding()) != null)
            {
                return httpentity.getValue();
            }
        }
        return null;
    }

    private String a(byte abyte0[], String s1, com.androidquery.callback.a a1)
    {
        if (!"utf-8".equalsIgnoreCase(s1))
        {
            return new String(abyte0, s1);
        }
        s1 = f(a1.d("Content-Type"));
        com.androidquery.util.a.b("parsing header", s1);
        if (s1 == null) goto _L2; else goto _L1
_L1:
        abyte0 = new String(abyte0, s1);
        return abyte0;
        s1;
        abyte0 = null;
_L4:
        com.androidquery.util.a.b(s1);
        return abyte0;
_L2:
        s1 = new String(abyte0, "utf-8");
        String s2;
        s2 = e(s1);
        com.androidquery.util.a.b("parsing needed", s2);
        if (s2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if ("utf-8".equalsIgnoreCase(s2))
        {
            break; /* Loop/switch isn't completed */
        }
        com.androidquery.util.a.b("correction needed", s2);
        abyte0 = new String(abyte0, s2);
        try
        {
            a1.a(abyte0.getBytes("utf-8"));
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            continue; /* Loop/switch isn't completed */
        }
        return abyte0;
        a1;
        abyte0 = s1;
        s1 = a1;
        if (true) goto _L4; else goto _L3
_L3:
        return s1;
    }

    private HttpResponse a(HttpUriRequest httpurirequest, DefaultHttpClient defaulthttpclient, HttpContext httpcontext)
        throws ClientProtocolException, IOException
    {
        if (httpurirequest.getURI().getAuthority().contains("_"))
        {
            Object obj = httpurirequest.getURI().toURL();
            if (((URL) (obj)).getPort() == -1)
            {
                obj = new HttpHost(((URL) (obj)).getHost(), 80, ((URL) (obj)).getProtocol());
            } else
            {
                obj = new HttpHost(((URL) (obj)).getHost(), ((URL) (obj)).getPort(), ((URL) (obj)).getProtocol());
            }
            return defaulthttpclient.execute(((HttpHost) (obj)), httpurirequest, httpcontext);
        } else
        {
            return defaulthttpclient.execute(httpurirequest, httpcontext);
        }
    }

    private static void a(DataOutputStream dataoutputstream, String s1, Object obj)
        throws IOException
    {
        if (obj == null)
        {
            return;
        }
        if (obj instanceof File)
        {
            obj = (File)obj;
            a(dataoutputstream, s1, ((File) (obj)).getName(), ((InputStream) (new FileInputStream(((File) (obj))))));
            return;
        }
        if (obj instanceof byte[])
        {
            a(dataoutputstream, s1, s1, ((InputStream) (new ByteArrayInputStream((byte[])obj))));
            return;
        }
        if (obj instanceof InputStream)
        {
            a(dataoutputstream, s1, s1, (InputStream)obj);
            return;
        } else
        {
            a(dataoutputstream, s1, obj.toString());
            return;
        }
    }

    private static void a(DataOutputStream dataoutputstream, String s1, String s2)
        throws IOException
    {
        dataoutputstream.writeBytes("--*****\r\n");
        dataoutputstream.writeBytes((new StringBuilder("Content-Disposition: form-data; name=\"")).append(s1).append("\"").toString());
        dataoutputstream.writeBytes("\r\n");
        dataoutputstream.writeBytes("\r\n");
        dataoutputstream.write(s2.getBytes("UTF-8"));
        dataoutputstream.writeBytes("\r\n");
    }

    private static void a(DataOutputStream dataoutputstream, String s1, String s2, InputStream inputstream)
        throws IOException
    {
        dataoutputstream.writeBytes("--*****\r\n");
        dataoutputstream.writeBytes((new StringBuilder("Content-Disposition: form-data; name=\"")).append(s1).append("\";").append(" filename=\"").append(s2).append("\"").append("\r\n").toString());
        dataoutputstream.writeBytes("Content-Type: application/octet-stream");
        dataoutputstream.writeBytes("\r\n");
        dataoutputstream.writeBytes("Content-Transfer-Encoding: binary");
        dataoutputstream.writeBytes("\r\n");
        dataoutputstream.writeBytes("\r\n");
        com.androidquery.util.a.a(inputstream, dataoutputstream);
        dataoutputstream.writeBytes("\r\n");
    }

    private void a(InputStream inputstream, OutputStream outputstream, int i1)
        throws IOException
    {
        Progress progress = null;
        Object obj;
        if (s != null)
        {
            obj = s.get();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            progress = new Progress(obj);
        }
        com.androidquery.util.a.a(inputstream, outputstream, i1, progress);
    }

    private void a(InputStream inputstream, OutputStream outputstream, int i1, File file, File file1)
        throws IOException
    {
        if (file1 == null)
        {
            a(inputstream, outputstream, i1);
            return;
        }
        try
        {
            a(inputstream, outputstream, i1);
            inputstream.close();
            outputstream.close();
            file.renameTo(file1);
            return;
        }
        catch (IOException ioexception)
        {
            com.androidquery.util.a.a("copy failed, deleting files");
            file.delete();
            file1.delete();
            com.androidquery.util.a.a(inputstream);
            com.androidquery.util.a.a(outputstream);
            throw ioexception;
        }
    }

    public static void a(Runnable runnable)
    {
        if (P == null)
        {
            P = Executors.newFixedThreadPool(k);
        }
        P.execute(runnable);
    }

    private void a(String s1, com.androidquery.callback.a a1)
        throws IOException
    {
        com.androidquery.util.a.b("get", s1);
        s1 = h(s1);
        a(((HttpUriRequest) (new HttpGet(s1))), s1, a1);
    }

    private void a(String s1, Map map, com.androidquery.callback.a a1)
        throws ClientProtocolException, IOException
    {
        com.androidquery.util.a.b("post", s1);
        a(s1, ((HttpEntityEnclosingRequestBase) (new HttpPost(s1))), map, a1);
    }

    private void a(String s1, HttpEntityEnclosingRequestBase httpentityenclosingrequestbase, Map map, com.androidquery.callback.a a1)
        throws ClientProtocolException, IOException
    {
        Object obj;
        httpentityenclosingrequestbase.getParams().setBooleanParameter("http.protocol.expect-continue", false);
        obj = map.get("%entity");
        if (!(obj instanceof HttpEntity)) goto _L2; else goto _L1
_L1:
        map = (HttpEntity)obj;
_L4:
        if (b != null && !b.containsKey("Content-Type"))
        {
            b.put("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
        }
        httpentityenclosingrequestbase.setEntity(map);
        a(((HttpUriRequest) (httpentityenclosingrequestbase)), s1, a1);
        return;
_L2:
        ArrayList arraylist = new ArrayList();
        map = map.entrySet().iterator();
        do
        {
label0:
            {
                if (map.hasNext())
                {
                    break label0;
                }
                map = new UrlEncodedFormEntity(arraylist, "UTF-8");
            }
            if (true)
            {
                continue;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            Object obj1 = entry.getValue();
            if (obj1 != null)
            {
                arraylist.add(new BasicNameValuePair((String)entry.getKey(), obj1.toString()));
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void a(HttpUriRequest httpurirequest, String s1, com.androidquery.callback.a a1)
        throws ClientProtocolException, IOException
    {
        DefaultHttpClient defaulthttpclient;
        defaulthttpclient = t();
        if (S != null)
        {
            S.a(this, httpurirequest, defaulthttpclient);
        }
        if (j == null) goto _L2; else goto _L1
_L1:
        httpurirequest.addHeader("User-Agent", j);
_L24:
        if (b == null) goto _L4; else goto _L3
_L3:
        Object obj = b.keySet().iterator();
_L7:
        if (((Iterator) (obj)).hasNext()) goto _L5; else goto _L4
_L4:
        BasicHttpContext basichttpcontext;
        if (l && (b == null || !b.containsKey("Accept-Encoding")))
        {
            httpurirequest.addHeader("Accept-Encoding", "gzip");
        }
        if (e != null)
        {
            e.a(this, httpurirequest);
        }
        obj = u();
        if (obj != null)
        {
            httpurirequest.addHeader("Cookie", ((String) (obj)));
        }
        obj = httpurirequest.getParams();
        if (K != null)
        {
            ((HttpParams) (obj)).setParameter("http.route.default-proxy", K);
        }
        if (A > 0)
        {
            ((HttpParams) (obj)).setParameter("http.connection.timeout", Integer.valueOf(A));
            ((HttpParams) (obj)).setParameter("http.socket.timeout", Integer.valueOf(A));
        }
        if (!B)
        {
            ((HttpParams) (obj)).setBooleanParameter("http.protocol.handle-redirects", false);
        }
        basichttpcontext = new BasicHttpContext();
        basichttpcontext.setAttribute("http.cookie-store", new BasicCookieStore());
        G = httpurirequest;
        if (U)
        {
            throw new IOException("Aborted");
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (j == null && l)
        {
            httpurirequest.addHeader("User-Agent", "gzip");
        }
        continue; /* Loop/switch isn't completed */
_L5:
        String s2 = (String)((Iterator) (obj)).next();
        httpurirequest.addHeader(s2, (String)b.get(s2));
        if (true) goto _L7; else goto _L6
_L6:
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        HttpEntity httpentity;
        if (n)
        {
            throw new IOException("Simulated Error");
        }
        HttpResponse httpresponse;
        String s4;
        int i1;
        try
        {
            httpresponse = a(httpurirequest, defaulthttpclient, ((HttpContext) (basichttpcontext)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            if (K != null)
            {
                com.androidquery.util.a.a("proxy failed, retrying without proxy");
                ((HttpParams) (obj)).setParameter("http.route.default-proxy", null);
                httpresponse = a(httpurirequest, defaulthttpclient, ((HttpContext) (basichttpcontext)));
            } else
            {
                throw obj1;
            }
        }
        obj3 = null;
        i1 = httpresponse.getStatusLine().getStatusCode();
        s4 = httpresponse.getStatusLine().getReasonPhrase();
        obj4 = null;
        obj5 = null;
        httpentity = httpresponse.getEntity();
        obj2 = null;
        obj = null;
        if (i1 >= 200 && i1 < 300) goto _L9; else goto _L8
_L8:
        httpurirequest = null;
        if (httpentity == null) goto _L11; else goto _L10
_L10:
        httpurirequest = httpentity.getContent();
        obj = new String(a(a(httpentity), ((InputStream) (httpurirequest))), "UTF-8");
        com.androidquery.util.a.b("error", obj);
_L22:
        com.androidquery.util.a.a(httpurirequest);
        httpurirequest = s1;
        obj1 = obj3;
_L12:
        com.androidquery.util.a.b("response", Integer.valueOf(i1));
        if (obj1 != null)
        {
            com.androidquery.util.a.b(Integer.valueOf(obj1.length), s1);
        }
        a1.b(i1).b(s4).a(((String) (obj))).c(httpurirequest).a(new Date()).a(((byte []) (obj1))).a(((File) (obj2))).a(defaulthttpclient).a(basichttpcontext).a(httpresponse.getAllHeaders());
        return;
        obj1;
        httpurirequest = null;
        obj = obj4;
_L20:
        com.androidquery.util.a.a(((Throwable) (obj1)));
        com.androidquery.util.a.a(httpurirequest);
        httpurirequest = s1;
        obj1 = obj3;
          goto _L12
        s1;
        httpurirequest = null;
_L19:
        com.androidquery.util.a.a(httpurirequest);
        throw s1;
_L9:
        String s3;
        int j1;
        httpurirequest = (HttpHost)basichttpcontext.getAttribute("http.target_host");
        obj1 = (HttpUriRequest)basichttpcontext.getAttribute("http.request");
        s3 = (new StringBuilder(String.valueOf(httpurirequest.toURI()))).append(((HttpUriRequest) (obj1)).getURI()).toString();
        j1 = Math.max(32, Math.min(0x10000, (int)httpentity.getContentLength()));
        obj4 = null;
        obj1 = null;
        httpurirequest = ((HttpUriRequest) (obj1));
        obj2 = obj4;
        File file = p();
        if (file != null) goto _L14; else goto _L13
_L13:
        httpurirequest = ((HttpUriRequest) (obj1));
        obj2 = obj4;
        obj4 = new d(j1);
        obj3 = obj;
        obj = obj4;
_L17:
        httpurirequest = ((HttpUriRequest) (obj1));
        obj2 = obj;
        obj4 = httpentity.getContent();
        obj1 = obj4;
        httpurirequest = ((HttpUriRequest) (obj4));
        obj2 = obj;
        if (!"gzip".equalsIgnoreCase(a(httpentity)))
        {
            break MISSING_BLOCK_LABEL_862;
        }
        httpurirequest = ((HttpUriRequest) (obj4));
        obj2 = obj;
        obj1 = new GZIPInputStream(((InputStream) (obj4)));
        httpurirequest = ((HttpUriRequest) (obj1));
        obj2 = obj;
        a(((InputStream) (obj1)), ((OutputStream) (obj)), (int)httpentity.getContentLength(), ((File) (obj3)), file);
        if (file != null) goto _L16; else goto _L15
_L15:
        httpurirequest = ((HttpUriRequest) (obj1));
        obj2 = obj;
        obj3 = ((d)obj).toByteArray();
        httpurirequest = ((HttpUriRequest) (obj3));
        obj2 = file;
_L18:
        com.androidquery.util.a.a(((java.io.Closeable) (obj1)));
        com.androidquery.util.a.a(((java.io.Closeable) (obj)));
        obj1 = httpurirequest;
        httpurirequest = s3;
        obj = obj5;
          goto _L12
_L14:
        httpurirequest = ((HttpUriRequest) (obj1));
        obj2 = obj4;
        obj3 = a(file);
        httpurirequest = ((HttpUriRequest) (obj1));
        obj2 = obj4;
        obj = new BufferedOutputStream(new FileOutputStream(((File) (obj3))));
          goto _L17
_L16:
        httpurirequest = ((HttpUriRequest) (obj1));
        obj2 = obj;
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_1020;
        }
        httpurirequest = ((HttpUriRequest) (obj1));
        obj2 = obj;
        long l1 = file.length();
        if (l1 != 0L)
        {
            break MISSING_BLOCK_LABEL_1062;
        }
        obj2 = null;
        httpurirequest = null;
          goto _L18
        s1;
        com.androidquery.util.a.a(httpurirequest);
        com.androidquery.util.a.a(((java.io.Closeable) (obj2)));
        throw s1;
        s1;
          goto _L19
        s1;
          goto _L19
        obj1;
        obj = obj4;
          goto _L20
        obj1;
          goto _L20
        httpurirequest = null;
        obj2 = file;
          goto _L18
_L11:
        obj = null;
        if (true) goto _L22; else goto _L21
_L21:
        if (true) goto _L24; else goto _L23
_L23:
    }

    private static boolean a(Map map)
    {
        map = map.entrySet().iterator();
        Object obj;
        do
        {
            if (!map.hasNext())
            {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            obj = entry.getValue();
            com.androidquery.util.a.b(entry.getKey(), obj);
        } while (!(obj instanceof File) && !(obj instanceof byte[]) && !(obj instanceof InputStream));
        return true;
    }

    private byte[] a(String s1, InputStream inputstream)
        throws IOException
    {
        Object obj = inputstream;
        if ("gzip".equalsIgnoreCase(s1))
        {
            obj = new GZIPInputStream(inputstream);
        }
        return com.androidquery.util.a.a(((InputStream) (obj)));
    }

    private static Map b(Uri uri)
    {
        HashMap hashmap;
        int i1;
        int j1;
        hashmap = new HashMap();
        uri = uri.getQuery().split("&");
        j1 = uri.length;
        i1 = 0;
_L2:
        String as[];
        if (i1 >= j1)
        {
            return hashmap;
        }
        as = uri[i1].split("=");
        if (as.length < 2)
        {
            break; /* Loop/switch isn't completed */
        }
        hashmap.put(as[0], as[1]);
_L4:
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        if (as.length != 1) goto _L4; else goto _L3
_L3:
        hashmap.put(as[0], "");
          goto _L4
    }

    private void b(String s1, com.androidquery.callback.a a1)
        throws IOException
    {
        com.androidquery.util.a.b("get", s1);
        s1 = h(s1);
        a(new HttpDelete(s1), s1, a1);
    }

    private void b(String s1, Map map, com.androidquery.callback.a a1)
        throws ClientProtocolException, IOException
    {
        com.androidquery.util.a.b("put", s1);
        a(s1, new HttpPut(s1), map, a1);
    }

    public static void c(int i1)
    {
        k = Math.max(1, Math.min(25, i1));
        P = null;
        com.androidquery.util.a.b("setting network limit", Integer.valueOf(k));
    }

    private void c(Context context)
    {
        Object obj = d(t);
        if (obj != null)
        {
            d = obj;
            f.a(4).a();
            a();
            return;
        } else
        {
            x = com.androidquery.util.a.a(context, w);
            a(this);
            return;
        }
    }

    private void c(String s1, Map map, com.androidquery.callback.a a1)
        throws IOException
    {
        com.androidquery.util.a.b("multipart", s1);
        Object obj1 = new URL(s1);
        Object obj;
        Object obj2;
        int i1;
        if (K != null)
        {
            com.androidquery.util.a.b("proxy", K);
            obj = new Proxy(java.net.Proxy.Type.HTTP, new InetSocketAddress(K.getHostName(), K.getPort()));
        } else
        if (S != null)
        {
            obj = S.a(this);
        } else
        {
            obj = null;
        }
        if (obj == null)
        {
            obj = (HttpURLConnection)((URL) (obj1)).openConnection();
        } else
        {
            obj = (HttpURLConnection)((URL) (obj1)).openConnection(((Proxy) (obj)));
        }
        ((HttpURLConnection) (obj)).setInstanceFollowRedirects(false);
        ((HttpURLConnection) (obj)).setConnectTimeout(i * 4);
        ((HttpURLConnection) (obj)).setDoInput(true);
        ((HttpURLConnection) (obj)).setDoOutput(true);
        ((HttpURLConnection) (obj)).setUseCaches(false);
        ((HttpURLConnection) (obj)).setRequestMethod("POST");
        ((HttpURLConnection) (obj)).setRequestProperty("Connection", "Keep-Alive");
        ((HttpURLConnection) (obj)).setRequestProperty("Content-Type", "multipart/form-data;charset=utf-8;boundary=*****");
        if (b == null) goto _L2; else goto _L1
_L1:
        obj1 = b.keySet().iterator();
_L4:
        if (((Iterator) (obj1)).hasNext()) goto _L3; else goto _L2
_L2:
        obj1 = u();
        if (obj1 != null)
        {
            ((HttpURLConnection) (obj)).setRequestProperty("Cookie", ((String) (obj1)));
        }
        if (e != null)
        {
            e.a(this, ((HttpURLConnection) (obj)));
        }
        obj1 = new DataOutputStream(((HttpURLConnection) (obj)).getOutputStream());
        map = map.entrySet().iterator();
_L5:
        if (!map.hasNext())
        {
            ((DataOutputStream) (obj1)).writeBytes("--*****--\r\n");
            ((DataOutputStream) (obj1)).flush();
            ((DataOutputStream) (obj1)).close();
            ((HttpURLConnection) (obj)).connect();
            i1 = ((HttpURLConnection) (obj)).getResponseCode();
            obj1 = ((HttpURLConnection) (obj)).getResponseMessage();
            map = ((HttpURLConnection) (obj)).getContentEncoding();
            if (i1 < 200 || i1 >= 300)
            {
                map = new String(a(map, ((HttpURLConnection) (obj)).getErrorStream()), "UTF-8");
                com.androidquery.util.a.b("error", map);
                obj = null;
            } else
            {
                obj = a(map, ((HttpURLConnection) (obj)).getInputStream());
                map = null;
            }
            com.androidquery.util.a.b("response", Integer.valueOf(i1));
            if (obj != null)
            {
                com.androidquery.util.a.b(Integer.valueOf(obj.length), s1);
            }
            a1.b(i1).b(((String) (obj1))).c(s1).a(new Date()).a(((byte []) (obj))).a(map).a(null);
            return;
        }
        break MISSING_BLOCK_LABEL_475;
_L3:
        obj2 = (String)((Iterator) (obj1)).next();
        ((HttpURLConnection) (obj)).setRequestProperty(((String) (obj2)), (String)b.get(obj2));
          goto _L4
        obj2 = (java.util.Map.Entry)map.next();
        a(((DataOutputStream) (obj1)), (String)((java.util.Map.Entry) (obj2)).getKey(), ((java.util.Map.Entry) (obj2)).getValue());
          goto _L5
    }

    private void d(int i1)
        throws IOException
    {
        if (i1 <= 1)
        {
            r();
        } else
        {
            int j1 = 0;
            while (j1 < i1) 
            {
                try
                {
                    r();
                    return;
                }
                catch (IOException ioexception)
                {
                    if (j1 == i1 - 1)
                    {
                        throw ioexception;
                    }
                }
                j1++;
            }
        }
    }

    private String e(String s1)
    {
        s1 = Pattern.compile("<meta [^>]*http-equiv[^>]*\"Content-Type\"[^>]*>", 2).matcher(s1);
        if (!s1.find())
        {
            return null;
        } else
        {
            return f(s1.group());
        }
    }

    protected static int f()
    {
        return T;
    }

    private String f(String s1)
    {
        int k1;
        if (s1 != null)
        {
            if ((k1 = s1.indexOf("charset")) != -1)
            {
                int j1 = s1.indexOf(";", k1);
                int i1 = j1;
                if (j1 == -1)
                {
                    i1 = s1.length();
                }
                return s1.substring(k1 + 7, i1).replaceAll("[^\\w-]", "");
            }
        }
        return null;
    }

    private Object g()
    {
        return this;
    }

    private String g(String s1)
    {
        if (u != null)
        {
            s1 = u;
        }
        String s2 = s1;
        if (e != null)
        {
            s2 = e.a(s1);
        }
        return s2;
    }

    private static String h(String s1)
    {
        return s1.replaceAll(" ", "%20").replaceAll("\\|", "%7C");
    }

    private void h()
    {
        p = null;
        q = null;
        s = null;
        G = null;
        v = null;
        e = null;
        E = null;
    }

    private void i()
    {
        if (!N)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        Exception exception;
        try
        {
            notifyAll();
        }
        catch (Exception exception1) { }
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private boolean j()
    {
        if (E == null)
        {
            return true;
        }
        Activity activity = (Activity)E.get();
        return activity != null && !activity.isFinishing();
    }

    private void k()
    {
        if (!z && g)
        {
            m();
        }
        if (d == null)
        {
            n();
        }
        if (d == null)
        {
            o();
        }
    }

    private String l()
    {
        if (e != null)
        {
            return e.b(t);
        } else
        {
            return t;
        }
    }

    private void m()
    {
        File file = a(x, l());
        if (file != null)
        {
            f.a(3);
            d = a(t, file, f);
            if (d != null)
            {
                f.a(new Date(file.lastModified())).a();
            }
        }
    }

    private void n()
    {
        d = c(t);
        if (d != null)
        {
            f.a(2).a();
        }
    }

    private void o()
    {
        byte abyte0[];
        if (t == null)
        {
            f.b(-101).a();
            return;
        }
        abyte0 = null;
        byte abyte1[];
        d(I + 1);
        if (e != null && e.a(this, f) && !O)
        {
            com.androidquery.util.a.b("reauth needed", f.h());
            O = true;
            if (!e.b(this))
            {
                break MISSING_BLOCK_LABEL_168;
            }
            r();
        }
        abyte1 = f.i();
        abyte0 = abyte1;
_L1:
        Object obj;
        String s1;
        try
        {
            d = a(t, abyte0, f);
        }
        catch (Exception exception)
        {
            com.androidquery.util.a.a(exception);
        }
        if (d == null && abyte0 != null)
        {
            f.b(-103).b("transform error");
        }
        T = f.g();
        f.a();
        return;
        try
        {
            f.b(true);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.androidquery.util.a.a("IOException");
            s1 = ((IOException) (obj)).getMessage();
            if (s1 != null && s1.contains("No authentication challenges found"))
            {
                f.b(401).b(s1);
            } else
            {
                f.b(-101).b("network error");
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.androidquery.util.a.a(s1);
            f.b(-101).b("network error");
        }
          goto _L1
    }

    private File p()
    {
        Object obj;
        if (c())
        {
            if (y != null)
            {
                obj = y;
            } else
            if (g)
            {
                obj = b();
            } else
            {
                File file = com.androidquery.util.a.d();
                obj = file;
                if (file == null)
                {
                    obj = x;
                }
                obj = com.androidquery.util.a.a(((File) (obj)), t);
            }
        } else
        {
            obj = null;
        }
        if (obj != null && !((File) (obj)).exists())
        {
            try
            {
                ((File) (obj)).getParentFile().mkdirs();
                ((File) (obj)).createNewFile();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                com.androidquery.util.a.b(((Throwable) (obj)));
                return null;
            }
        }
        return ((File) (obj));
    }

    private void q()
    {
        if (d == null || !g) goto _L2; else goto _L1
_L1:
        byte abyte0[] = f.i();
        if (abyte0 == null) goto _L4; else goto _L3
_L3:
        if (f.k() != 1) goto _L4; else goto _L5
_L5:
        File file1 = b();
        if (f.f()) goto _L7; else goto _L6
_L6:
        a(t, d, file1, abyte0);
_L4:
        f.a(null);
_L9:
        return;
_L7:
        try
        {
            if (file1.exists())
            {
                file1.delete();
            }
        }
        catch (Exception exception)
        {
            com.androidquery.util.a.a(exception);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (f.g() != -103) goto _L9; else goto _L8
_L8:
        File file = b();
        if (!file.exists()) goto _L9; else goto _L10
_L10:
        file.delete();
        com.androidquery.util.a.a("invalidated cache due to transform error");
        return;
        if (true) goto _L4; else goto _L11
_L11:
    }

    private void r()
        throws IOException
    {
        String s1 = t;
        Map map = a;
        Object obj = map;
        Object obj1 = s1;
        if (map == null)
        {
            obj = map;
            obj1 = s1;
            if (s1.length() > 2000)
            {
                obj = Uri.parse(s1);
                obj1 = a(((Uri) (obj)));
                obj = b(((Uri) (obj)));
            }
        }
        s1 = g(((String) (obj1)));
        if (2 == F)
        {
            b(s1, f);
            return;
        }
        if (3 == F)
        {
            b(s1, ((Map) (obj)), f);
            return;
        }
        obj1 = obj;
        if (1 == F)
        {
            obj1 = obj;
            if (obj == null)
            {
                obj1 = new HashMap();
            }
        }
        if (obj1 == null)
        {
            a(s1, f);
            return;
        }
        if (a(((Map) (obj1))))
        {
            c(s1, ((Map) (obj1)), f);
            return;
        } else
        {
            a(s1, ((Map) (obj1)), f);
            return;
        }
    }

    private void s()
    {
        if (t != null && h)
        {
            a(t, d);
        }
        a();
        h();
    }

    private static DefaultHttpClient t()
    {
        if (R == null || !m)
        {
            com.androidquery.util.a.a("creating http client");
            BasicHttpParams basichttpparams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(basichttpparams, i);
            HttpConnectionParams.setSoTimeout(basichttpparams, i);
            ConnManagerParams.setMaxConnectionsPerRoute(basichttpparams, new ConnPerRouteBean(25));
            HttpConnectionParams.setSocketBufferSize(basichttpparams, 8192);
            SchemeRegistry schemeregistry = new SchemeRegistry();
            schemeregistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
            Object obj;
            if (Q == null)
            {
                obj = SSLSocketFactory.getSocketFactory();
            } else
            {
                obj = Q;
            }
            schemeregistry.register(new Scheme("https", ((SocketFactory) (obj)), 443));
            R = new DefaultHttpClient(new ThreadSafeClientConnManager(basichttpparams, schemeregistry), basichttpparams);
        }
        return R;
    }

    private String u()
    {
        if (c == null || c.size() == 0)
        {
            return null;
        }
        Iterator iterator = c.keySet().iterator();
        StringBuilder stringbuilder = new StringBuilder();
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    return stringbuilder.toString();
                }
                String s1 = (String)iterator.next();
                String s2 = (String)c.get(s1);
                stringbuilder.append(s1);
                stringbuilder.append("=");
                stringbuilder.append(s2);
            } while (!iterator.hasNext());
            stringbuilder.append("; ");
        } while (true);
    }

    protected File a(File file, String s1)
    {
        if (C >= 0L)
        {
            if ((file = com.androidquery.util.a.b(file, s1)) == null || C == 0L || System.currentTimeMillis() - file.lastModified() <= C)
            {
                return file;
            }
        }
        return null;
    }

    public Object a(int i1)
    {
        I = i1;
        return g();
    }

    public Object a(com.androidquery.a.a a1)
    {
        e = a1;
        return g();
    }

    public Object a(c c1)
    {
        v = c1;
        return g();
    }

    public Object a(Class class1)
    {
        o = class1;
        return g();
    }

    public Object a(Object obj)
    {
        if (obj != null)
        {
            s = new WeakReference(obj);
        }
        return g();
    }

    public Object a(String s1)
    {
        t = s1;
        return g();
    }

    public Object a(String s1, int i1)
    {
        K = new HttpHost(s1, i1);
        return g();
    }

    protected Object a(String s1, File file, com.androidquery.callback.a a1)
    {
        if (!c()) goto _L2; else goto _L1
_L1:
        a1.a(file);
        file = null;
_L4:
        return a(s1, ((byte []) (file)), a1);
_L2:
        file = com.androidquery.util.a.a(new FileInputStream(file));
        if (true) goto _L4; else goto _L3
_L3:
        s1;
        com.androidquery.util.a.a(s1);
        return null;
    }

    protected Object a(String s1, byte abyte0[], com.androidquery.callback.a a1)
    {
        if (o != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        File file;
        file = a1.j();
        if (abyte0 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (o.equals(android/graphics/Bitmap))
        {
            return BitmapFactory.decodeByteArray(abyte0, 0, abyte0.length);
        }
        if (!o.equals(org/json/JSONObject)) goto _L4; else goto _L3
_L3:
        abyte0 = new String(abyte0, D);
        s1 = (JSONObject)(new JSONTokener(abyte0)).nextValue();
_L5:
        return s1;
        s1;
        abyte0 = null;
_L8:
        com.androidquery.util.a.a(s1);
        com.androidquery.util.a.a(abyte0);
        s1 = null;
        if (true) goto _L5; else goto _L4
_L4:
        if (o.equals(org/json/JSONArray))
        {
            try
            {
                s1 = (JSONArray)(new JSONTokener(new String(abyte0, D))).nextValue();
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                com.androidquery.util.a.a(s1);
                s1 = null;
            }
            return s1;
        }
        if (o.equals(java/lang/String))
        {
            if (a1.k() == 1)
            {
                com.androidquery.util.a.a("network");
                return a(abyte0, D, a1);
            }
            com.androidquery.util.a.a("file");
            try
            {
                s1 = new String(abyte0, D);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                com.androidquery.util.a.a(s1);
                return null;
            }
            return s1;
        }
        if (o.equals([B))
        {
            return abyte0;
        }
        if (v != null)
        {
            return v.a(s1, o, D, abyte0, a1);
        }
        if (J == null) goto _L1; else goto _L6
_L6:
        return J.a(s1, o, D, abyte0, a1);
        if (file == null) goto _L1; else goto _L7
_L7:
        if (o.equals(java/io/File))
        {
            return file;
        }
        if (o.equals(com/androidquery/util/f))
        {
            try
            {
                s1 = new FileInputStream(file);
                abyte0 = new f(s1);
                a1.a(s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                com.androidquery.util.a.b(s1);
                return null;
            }
            return abyte0;
        }
        if (o.equals(org/xmlpull/v1/XmlPullParser))
        {
            s1 = Xml.newPullParser();
            try
            {
                abyte0 = new FileInputStream(file);
                s1.setInput(abyte0, D);
                a1.a(abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                com.androidquery.util.a.b(s1);
                return null;
            }
            return s1;
        }
        if (o.equals(java/io/InputStream))
        {
            try
            {
                s1 = new FileInputStream(file);
                a1.a(s1);
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                com.androidquery.util.a.b(s1);
                return null;
            }
            return s1;
        }
          goto _L1
        s1;
          goto _L8
    }

    public Object a(boolean flag)
    {
        g = flag;
        return g();
    }

    void a()
    {
        c(false);
        M = true;
        if (j())
        {
            if (r != null)
            {
                Object obj = e();
                Class class1 = o;
                String s1 = r;
                Class aclass[] = L;
                String s2 = t;
                Object obj1 = d;
                com.androidquery.callback.a a1 = f;
                com.androidquery.util.a.a(obj, s1, true, true, new Class[] {
                    java/lang/String, class1, com/androidquery/callback/a
                }, aclass, new Object[] {
                    s2, obj1, a1
                });
            } else
            {
                try
                {
                    a(t, d, f);
                }
                catch (Exception exception)
                {
                    com.androidquery.util.a.b(exception);
                }
            }
        } else
        {
            b(t, d, f);
        }
        q();
        if (!N)
        {
            f.c();
        }
        i();
        com.androidquery.util.a.a();
    }

    public void a(Activity activity)
    {
        if (activity.isFinishing())
        {
            com.androidquery.util.a.a("Warning", "Possible memory leak. Calling ajax with a terminated activity.");
        }
        if (o == null)
        {
            com.androidquery.util.a.a("Warning", "type() is not called with response type.");
            return;
        } else
        {
            E = new WeakReference(activity);
            a(((Context) (activity)));
            return;
        }
    }

    public void a(Context context)
    {
        if (f == null)
        {
            f = new com.androidquery.callback.a();
            f.c(t).a(z);
        } else
        if (f.d())
        {
            f.b();
            d = null;
        }
        c(true);
        if (e != null && !e.a())
        {
            com.androidquery.util.a.b("auth needed", t);
            e.a(this);
            return;
        } else
        {
            c(context);
            return;
        }
    }

    protected void a(String s1, Object obj)
    {
    }

    public void a(String s1, Object obj, com.androidquery.callback.a a1)
    {
    }

    protected void a(String s1, Object obj, File file, byte abyte0[])
    {
        if (file == null || abyte0 == null)
        {
            return;
        } else
        {
            com.androidquery.util.a.a(file, abyte0, 0L);
            return;
        }
    }

    protected File b()
    {
        return com.androidquery.util.a.a(x, l());
    }

    public Object b(int i1)
    {
        w = i1;
        return g();
    }

    public Object b(String s1)
    {
        u = s1;
        return g();
    }

    public Object b(boolean flag)
    {
        h = flag;
        return g();
    }

    protected void b(String s1, Object obj, com.androidquery.callback.a a1)
    {
    }

    protected boolean b(Context context)
    {
        return g && com.androidquery.util.a.b(com.androidquery.util.a.a(context, w), t) != null;
    }

    protected Object c(String s1)
    {
        return null;
    }

    protected void c(boolean flag)
    {
        Object obj;
label0:
        {
            if (s == null)
            {
                obj = null;
            } else
            {
                obj = s.get();
            }
            if (obj != null)
            {
                if (!com.androidquery.util.a.b())
                {
                    break label0;
                }
                Common.a(obj, t, flag);
            }
            return;
        }
        com.androidquery.util.a.a(new Runnable(obj, flag) {

            final AbstractAjaxCallback a;
            private final Object b;
            private final boolean c;

            public void run()
            {
                Common.a(b, com.androidquery.callback.AbstractAjaxCallback.a(a), c);
            }

            
            {
                a = AbstractAjaxCallback.this;
                b = obj;
                c = flag;
                super();
            }
        });
    }

    protected boolean c()
    {
        return java/io/File.equals(o) || org/xmlpull/v1/XmlPullParser.equals(o) || java/io/InputStream.equals(o) || com/androidquery/util/f.equals(o);
    }

    protected Object d(String s1)
    {
        return null;
    }

    public String d()
    {
        return t;
    }

    public Object e()
    {
        if (q != null)
        {
            return q;
        }
        if (p == null)
        {
            return null;
        } else
        {
            return p.get();
        }
    }

    public void run()
    {
label0:
        {
label1:
            {
                if (f.d())
                {
                    break label0;
                }
                try
                {
                    k();
                }
                catch (Throwable throwable)
                {
                    com.androidquery.util.a.a(throwable);
                    f.b(-101).a();
                }
                if (!f.e())
                {
                    if (!H)
                    {
                        break label1;
                    }
                    com.androidquery.util.a.a(this);
                }
                return;
            }
            s();
            return;
        }
        s();
    }

}
