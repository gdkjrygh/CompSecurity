// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cx;

import android.net.http.AndroidHttpClient;
import android.os.Build;
import com.pandora.radio.data.af;
import com.pandora.radio.data.f;
import com.pandora.radio.data.q;
import com.pandora.radio.util.NetworkUtil;
import com.pandora.radio.util.i;
import com.pandora.radio.util.k;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.Vector;
import java.util.zip.GZIPOutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p.cw.c;
import p.df.a;

// Referenced classes of package p.cx:
//            t, q, n, f, 
//            y, aa, o, x, 
//            l

public class u
    implements t
{

    private HttpClient a;
    private final Random b = new Random();
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private int j;
    private final c k;
    private final p.cx.f l;
    private final aa m;

    public u(c c1, p.cx.f f1, String s, String s1, String s2, String s3, String s4, 
            aa aa1)
    {
        a = null;
        c = null;
        j = 1;
        k = c1;
        l = f1;
        m = aa1;
        d = s;
        e = s1;
        f = s2;
        g = s3;
        h = s4;
    }

    private String a(String s, HttpPost httppost, t.a a1)
        throws UnsupportedEncodingException, p.cx.q, n
    {
        e((new StringBuilder()).append("start post network request: ").append(s).toString());
        if (!com.pandora.radio.util.i.e())
        {
            s = new ByteArrayOutputStream();
            try
            {
                httppost.getEntity().writeTo(s);
                p.df.a.a("PandoraHttpUtilsImpl", (new StringBuilder()).append("POST params : ").append(s.toString()).toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s.printStackTrace();
            }
        }
        s = b();
        httppost = a(((HttpClient) (s)), ((HttpRequestBase) (httppost)), a1);
        try
        {
            s.getConnectionManager().shutdown();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            e("error shutting down httpclient");
            s.printStackTrace();
            return httppost;
        }
        return httppost;
        httppost;
        try
        {
            s.getConnectionManager().shutdown();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            e("error shutting down httpclient");
            s.printStackTrace();
        }
        throw httppost;
    }

    private String a(String s, t.a a1, String s1)
        throws p.cx.q, n
    {
        DefaultHttpClient defaulthttpclient;
        e((new StringBuilder()).append("start get network request: ").append(s).toString());
        defaulthttpclient = new DefaultHttpClient();
        defaulthttpclient.getParams().setParameter("http.socket.timeout", Integer.valueOf(20000));
        defaulthttpclient.getParams().setParameter("http.useragent", s1);
        s = a(((HttpClient) (defaulthttpclient)), ((HttpRequestBase) (new HttpGet(s))), a1);
        try
        {
            defaulthttpclient.getConnectionManager().shutdown();
        }
        // Misplaced declaration of an exception variable
        catch (t.a a1)
        {
            e("error shutting down httpclient");
            a1.printStackTrace();
            return s;
        }
        return s;
        s;
        try
        {
            defaulthttpclient.getConnectionManager().shutdown();
        }
        // Misplaced declaration of an exception variable
        catch (t.a a1)
        {
            e("error shutting down httpclient");
            a1.printStackTrace();
        }
        throw s;
    }

    private String a(String s, t.a a1, HttpClient httpclient)
        throws p.cx.q, n
    {
        e((new StringBuilder()).append("start get network request: ").append(s).toString());
        return a(httpclient, ((HttpRequestBase) (new HttpGet(s))), a1);
    }

    private String a(String s, boolean flag, Hashtable hashtable, Hashtable hashtable1, int i1)
    {
        String s3 = null;
        af af1 = l.a();
        q q1 = l.c();
        String s1;
        String s2;
        if (i1 == 1 && q1 != null)
        {
            s2 = q1.b();
            s1 = q1.a();
            hashtable.put("partnerAuthToken", s2);
        } else
        if (i1 == 3 && q1 != null)
        {
            s2 = q1.b();
            s1 = q1.a();
            hashtable.put("partnerAdminAuthToken", s2);
        } else
        if (i1 == 2 && af1 != null && q1 != null)
        {
            s2 = af1.b();
            s1 = q1.a();
            s3 = af1.d();
            hashtable.put("userAuthToken", s2);
        } else
        {
            s1 = null;
            s2 = null;
        }
        if (!com.pandora.radio.util.i.e())
        {
            RuntimeException runtimeexception = new RuntimeException();
            if (i1 == 1)
            {
                if (q1 == null)
                {
                    p.df.a.a("PandoraHttpUtilsImpl", (new StringBuilder()).append("Requesting AUTH_PARTNER but partnerData is null, method = ").append(s).toString(), runtimeexception);
                    throw runtimeexception;
                }
            } else
            if (i1 == 3)
            {
                if (q1 == null)
                {
                    p.df.a.a("PandoraHttpUtilsImpl", (new StringBuilder()).append("Requesting AUTH_PARTNER_ADMIN but partnerData is null, method = ").append(s).toString(), runtimeexception);
                    throw runtimeexception;
                }
            } else
            if (i1 == 2)
            {
                if (af1 == null)
                {
                    p.df.a.a("PandoraHttpUtilsImpl", (new StringBuilder()).append("Requesting AUTH_USER but userData is null, method = ").append(s).toString(), runtimeexception);
                    throw runtimeexception;
                }
                if (q1 == null)
                {
                    p.df.a.a("PandoraHttpUtilsImpl", (new StringBuilder()).append("Requesting AUTH_USER but partnerData is null, method = ").append(s).toString(), runtimeexception);
                    throw runtimeexception;
                }
            }
        }
        hashtable1 = a(hashtable1);
        if (hashtable1 != null && !hashtable1.isEmpty())
        {
            hashtable1.putAll(k.l().g());
            hashtable.put("deviceProperties", hashtable1);
        } else
        {
            hashtable.put("deviceProperties", k.l().g());
        }
        hashtable = new HashMap();
        hashtable.put("method", s);
        if (s2 != null)
        {
            hashtable.put("auth_token", s2);
        }
        if (s1 != null)
        {
            hashtable.put("partner_id", s1);
        }
        if (s3 != null)
        {
            hashtable.put("user_id", s3);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_453;
        }
        s = e();
_L1:
        s = a(s, ((HashMap) (hashtable)), 0x7fffffff);
        return s;
        try
        {
            s = d();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeException(s);
        }
          goto _L1
    }

    private String a(HttpResponse httpresponse)
        throws p.cx.q
    {
        HttpResponse httpresponse1;
        HttpResponse httpresponse2;
        StringWriter stringwriter;
        httpresponse2 = null;
        httpresponse1 = null;
        stringwriter = new StringWriter();
        httpresponse = AndroidHttpClient.getUngzippedContent(httpresponse.getEntity());
        httpresponse1 = httpresponse;
        httpresponse2 = httpresponse;
        NetworkUtil.a(httpresponse, stringwriter);
        httpresponse1 = httpresponse;
        httpresponse2 = httpresponse;
        String s = stringwriter.getBuffer().toString();
        NetworkUtil.a(httpresponse);
        NetworkUtil.a(stringwriter);
        return s;
        httpresponse;
        httpresponse2 = httpresponse1;
        throw new p.cx.q(httpresponse);
        httpresponse;
        NetworkUtil.a(httpresponse2);
        NetworkUtil.a(stringwriter);
        throw httpresponse;
    }

    private String a(HttpClient httpclient, HttpRequestBase httprequestbase, t.a a1)
        throws p.cx.q, n
    {
        int i1;
        try
        {
            httpclient = httpclient.execute(httprequestbase);
            if (a1 == t.a.b)
            {
                k.o().d();
            }
        }
        // Misplaced declaration of an exception variable
        catch (HttpClient httpclient)
        {
            throw new p.cx.q(httpclient);
        }
        i1 = httpclient.getStatusLine().getStatusCode();
        e((new StringBuilder()).append("network request returned response code ").append(i1).toString());
        if (i1 != 200 && i1 != 206)
        {
            throw new n(i1, httprequestbase.getURI().toString());
        } else
        {
            return a(((HttpResponse) (httpclient)));
        }
    }

    private AbstractHttpEntity a(byte abyte0[])
        throws p.cx.q
    {
        GZIPOutputStream gzipoutputstream;
        ByteArrayOutputStream bytearrayoutputstream;
        try
        {
            bytearrayoutputstream = new ByteArrayOutputStream();
            gzipoutputstream = new GZIPOutputStream(bytearrayoutputstream);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new p.cx.q(abyte0);
        }
        gzipoutputstream.write(abyte0);
        NetworkUtil.a(gzipoutputstream);
        return new ByteArrayEntity(bytearrayoutputstream.toByteArray());
        abyte0;
        NetworkUtil.a(gzipoutputstream);
        throw abyte0;
    }

    private static JSONArray a(Vector vector)
        throws JSONException
    {
        JSONArray jsonarray = new JSONArray();
        for (vector = vector.iterator(); vector.hasNext();)
        {
            Object obj = vector.next();
            if (obj instanceof Hashtable)
            {
                jsonarray.put(b((Hashtable)obj));
            } else
            {
                jsonarray.put(obj);
            }
        }

        return jsonarray;
    }

    private JSONObject a(String s, String s1, Hashtable hashtable, Hashtable hashtable1, boolean flag, boolean flag1)
        throws JSONException, n, p.cx.q, y
    {
        e((new StringBuilder()).append("API: ").append(s1).toString());
        if (flag)
        {
            hashtable.put("syncTime", m.a());
        }
        hashtable1 = b(hashtable).toString().getBytes();
        hashtable = hashtable1;
        if (flag)
        {
            hashtable = m.a(new String(hashtable1));
        }
        HttpPost httppost = new HttpPost(s);
        hashtable1 = new DefaultHttpClient();
        int i1;
        if (flag1)
        {
            AndroidHttpClient.modifyRequestToAcceptGzipResponse(httppost);
            hashtable = a(((byte []) (hashtable)));
            hashtable.setContentEncoding("gzip");
        } else
        {
            hashtable = new ByteArrayEntity(hashtable);
        }
        httppost.setEntity(hashtable);
        hashtable1.getParams().setParameter("http.socket.timeout", Integer.valueOf(20000));
        hashtable1.getParams().setParameter("http.useragent", h());
        hashtable = hashtable1.execute(httppost);
        k.o().d();
        i1 = hashtable.getStatusLine().getStatusCode();
        if (i1 == 200 || i1 == 206)
        {
            break MISSING_BLOCK_LABEL_281;
        }
        try
        {
            throw new n(i1, s);
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        finally
        {
            hashtable1.getConnectionManager().shutdown();
        }
        throw new o(s1.getMessage(), s);
        throw s;
        s1;
        throw new p.cx.q(s1);
        hashtable = new JSONObject(a(((HttpResponse) (hashtable))));
        boolean flag2;
        if (!"ok".equals(hashtable.getString("stat")))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        throw new y(hashtable.getInt("code"), hashtable.getString("message"), hashtable, s1);
        s1 = hashtable.optJSONObject("result");
        hashtable1.getConnectionManager().shutdown();
        return s1;
    }

    private static JSONObject b(Hashtable hashtable)
        throws JSONException
    {
        if (hashtable == null)
        {
            return new JSONObject();
        }
        JSONObject jsonobject = new JSONObject();
        for (Iterator iterator = hashtable.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            Object obj = hashtable.get(s);
            if (obj instanceof Vector)
            {
                jsonobject.put(s, a((Vector)obj));
            } else
            if (obj instanceof Hashtable)
            {
                jsonobject.put(s, b((Hashtable)obj));
            } else
            {
                jsonobject.put(s, obj);
            }
        }

        return jsonobject;
    }

    private static String d(String s)
    {
        int i1 = s.indexOf(";u=");
        String s1 = s;
        if (i1 > 0)
        {
            s1 = s.substring(0, i1);
        }
        s = s1;
        if (s1.length() > 512)
        {
            s = s1.substring(0, 512);
        }
        return s;
    }

    private void e(String s)
    {
        p.df.a.c("PandoraHttpUtilsImpl", (new StringBuilder()).append("HTTP - ").append(s).toString());
    }

    private String h()
    {
        if (c == null)
        {
            c = String.format("Pandora/%s Android/%s %s", new Object[] {
                k.B(), com.pandora.radio.data.f.j(), Build.DEVICE
            });
        }
        return c;
    }

    public String a(String s)
        throws p.cx.q, n
    {
        String s1;
        if (s == null)
        {
            s1 = null;
        } else
        {
            s1 = s.replace("__CACHEBUST__", Long.toString(System.currentTimeMillis() + b.nextLong())).replace(" ", "%20");
            s = s1;
            if (s1.indexOf("__LOGON__") != -1)
            {
                s = s1;
                if (f() != null)
                {
                    s = s1.replaceAll("__LOGON__", f());
                }
            }
            s1 = s;
            if (s.indexOf("__INDEX__") != -1)
            {
                return s.replaceAll("__INDEX__", Integer.toString(g()));
            }
        }
        return s1;
    }

    public String a(String s, String s1, String s2)
        throws n, p.cx.q, UnsupportedEncodingException
    {
        HashMap hashmap = new HashMap();
        hashmap.put("adUrl", d(s1));
        hashmap.put("adType", s);
        hashmap.put("client", h());
        hashmap.put("reason", s2);
        s = a((new StringBuilder()).append(c()).append("radio/services/brokenAd.jsp").toString(), hashmap, 2000);
        e("Recording broken ad");
        return a(s, t.a.b);
    }

    public String a(String s, String s1, String s2, String s3)
        throws n, p.cx.q, UnsupportedEncodingException
    {
        HashMap hashmap = new HashMap();
        hashmap.put("action", s);
        if (s1 != null)
        {
            hashmap.put("type", s1);
        }
        if (s2 != null)
        {
            hashmap.put("ad", s2);
        }
        if (s3 != null)
        {
            hashmap.put("cr", s3);
        }
        hashmap.put("tok", l.a().b());
        s = a((new StringBuilder()).append(c()).append("radio/util/mobileAds.jsp").toString(), hashmap, 0x7fffffff);
        e(String.format("Issuing atTest request: %s", new Object[] {
            s
        }));
        return a(s, t.a.b);
    }

    public String a(String s, String s1, t.a a1)
        throws UnsupportedEncodingException, p.cx.q, n
    {
        ArrayList arraylist = new ArrayList();
        s1 = s1.split("&");
        for (int i1 = 0; i1 < s1.length; i1++)
        {
            String as[] = s1[i1].split("=");
            arraylist.add(new BasicNameValuePair(as[0], as[1]));
        }

        return a(s, ((List) (arraylist)), a1);
    }

    public String a(String s, HashMap hashmap, int i1)
        throws UnsupportedEncodingException
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(s);
        Iterator iterator = hashmap.keySet().iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            String s1 = (String)iterator.next();
            if (flag)
            {
                s = "?";
            } else
            {
                s = "&";
            }
            stringbuilder.append(s);
            s = URLEncoder.encode((String)hashmap.get(s1), "UTF-8");
            if (stringbuilder.length() + s1.length() + s.length() + 1 <= i1)
            {
                stringbuilder.append(s1);
                stringbuilder.append("=");
                stringbuilder.append(s);
            }
            flag = false;
        }
        return stringbuilder.toString();
    }

    public String a(String s, List list, t.a a1)
        throws UnsupportedEncodingException, p.cx.q, n
    {
        HttpPost httppost = new HttpPost(s);
        list = new UrlEncodedFormEntity(list);
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            list.writeTo(bytearrayoutputstream);
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        httppost.setEntity(list);
        return a(s, httppost, a1);
    }

    public String a(String s, Map map)
        throws p.cx.q, n
    {
        HttpGet httpget = new HttpGet(s);
        if (map != null)
        {
            Iterator iterator = map.keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s1 = (String)iterator.next();
                String s2 = (String)map.get(s1);
                if (s2 != null)
                {
                    httpget.addHeader(s1, s2);
                }
            } while (true);
        }
        map = new DefaultHttpClient();
        int i1;
        try
        {
            map.getParams().setParameter("http.socket.timeout", Integer.valueOf(20000));
            map.getParams().setParameter("http.useragent", h());
            e((new StringBuilder()).append("start get network request: ").append(s).toString());
            map = map.execute(httpget);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new p.cx.q(s);
        }
        i1 = map.getStatusLine().getStatusCode();
        e((new StringBuilder()).append("network request returned response code ").append(i1).toString());
        if (i1 != 200 && i1 != 206)
        {
            throw new n(i1, s);
        } else
        {
            return a(((HttpResponse) (map)));
        }
    }

    public String a(String s, HttpClient httpclient, boolean flag)
        throws p.cx.q, n
    {
        String s1 = g;
        String s2 = com.pandora.radio.util.i.b(s);
        if (flag)
        {
            s = "yes";
        } else
        {
            s = "no";
        }
        return a(String.format("%ss2?q=%s&sendquery=no&adv=yes&stations=%s", new Object[] {
            s1, s2, s
        }), t.a.b, httpclient);
    }

    public String a(String s, t.a a1)
        throws p.cx.q, n
    {
        return a(s, a1, h());
    }

    protected Hashtable a(Hashtable hashtable)
    {
        ArrayList arraylist = k.e().u();
        Hashtable hashtable1 = hashtable;
        if (hashtable == null)
        {
            hashtable1 = new Hashtable();
        }
        if (arraylist != null && !arraylist.isEmpty())
        {
            new Hashtable();
            hashtable = arraylist.iterator();
            do
            {
                if (!hashtable.hasNext())
                {
                    break;
                }
                Map map = ((l)hashtable.next()).o();
                if (map != null && !map.isEmpty())
                {
                    hashtable1.putAll(map);
                }
            } while (true);
        }
        return hashtable1;
    }

    public JSONObject a(String s, Hashtable hashtable, Hashtable hashtable1, int i1)
        throws n, p.cx.q, y, JSONException
    {
        return a(a(s, false, hashtable, hashtable1, i1), s, hashtable, hashtable1, false, false);
    }

    public void a()
    {
        j = 1;
    }

    public String b(String s)
        throws p.cx.q, n
    {
        if (s == null)
        {
            return null;
        }
        s = a(s);
        p/cx/t;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            BasicHttpParams basichttpparams = new BasicHttpParams();
            HttpConnectionParams.setConnectionTimeout(basichttpparams, 20000);
            HttpProtocolParams.setVersion(basichttpparams, HttpVersion.HTTP_1_1);
            SchemeRegistry schemeregistry = new SchemeRegistry();
            schemeregistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
            schemeregistry.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
            a = new DefaultHttpClient(new ThreadSafeClientConnManager(basichttpparams, schemeregistry), basichttpparams);
            a.getParams().setParameter("http.socket.timeout", Integer.valueOf(20000));
            a.getParams().setParameter("http.useragent", "DoubleClick RProxy/1.0");
        }
        p/cx/t;
        JVM INSTR monitorexit ;
        p.df.a.c("PandoraHttpUtilsImpl", (new StringBuilder()).append("Fetch ad url = ").append(s).toString());
        return a(s, t.a.b, a);
        s;
        p/cx/t;
        JVM INSTR monitorexit ;
        throw s;
    }

    public HttpClient b()
    {
        DefaultHttpClient defaulthttpclient = new DefaultHttpClient();
        defaulthttpclient.getParams().setParameter("http.socket.timeout", Integer.valueOf(20000));
        defaulthttpclient.getParams().setParameter("http.useragent", h());
        return defaulthttpclient;
    }

    public JSONObject b(String s, Hashtable hashtable, Hashtable hashtable1, int i1)
        throws n, p.cx.q, y, JSONException
    {
        return a(a(s, true, hashtable, hashtable1, i1), s, hashtable, hashtable1, false, false);
    }

    public String c()
    {
        return d;
    }

    public JSONObject c(String s, Hashtable hashtable, Hashtable hashtable1, int i1)
        throws n, p.cx.q, y, JSONException
    {
        return a(a(s, true, hashtable, hashtable1, i1), s, hashtable, hashtable1, true, false);
    }

    public void c(String s)
    {
        i = s;
    }

    public String d()
    {
        return e;
    }

    public JSONObject d(String s, Hashtable hashtable, Hashtable hashtable1, int i1)
        throws n, p.cx.q, y, JSONException
    {
        return a(a(s, false, hashtable, hashtable1, i1), s, hashtable, hashtable1, true, false);
    }

    public String e()
    {
        return f;
    }

    public JSONObject e(String s, Hashtable hashtable, Hashtable hashtable1, int i1)
        throws n, p.cx.q, y, JSONException
    {
        return a(a(s, true, hashtable, hashtable1, i1), s, hashtable, hashtable1, false, true);
    }

    public String f()
    {
        return i;
    }

    public int g()
    {
        int i1 = j;
        j = i1 + 1;
        return i1;
    }
}
