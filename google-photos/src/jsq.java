// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

final class jsq extends jsw
{

    private static final byte c[] = "\n".getBytes();
    private final String a;
    private final jsu b;

    jsq(jrk jrk1)
    {
        super(jrk1);
        a = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] {
            "GoogleAnalytics", jsx.a, android.os.Build.VERSION.RELEASE, jtk.a(Locale.getDefault()), Build.MODEL, Build.ID
        });
        b = new jsu(jrk1.c);
    }

    private int a(URL url)
    {
        URL url1;
        URL url2;
        b.d(url);
        b("GET request", url);
        url2 = null;
        url1 = null;
        url = b(url);
        url1 = url;
        url2 = url;
        url.connect();
        url1 = url;
        url2 = url;
        a(((HttpURLConnection) (url)));
        url1 = url;
        url2 = url;
        int i = url.getResponseCode();
        if (i != 200)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        url1 = url;
        url2 = url;
        super.d.c().e();
        url1 = url;
        url2 = url;
        b("GET status", Integer.valueOf(i));
        if (url != null)
        {
            url.disconnect();
        }
        return i;
        url;
        url2 = url1;
        d("Network GET connection error", url);
        if (url1 != null)
        {
            url1.disconnect();
        }
        return 0;
        url;
        if (url2 != null)
        {
            url2.disconnect();
        }
        throw url;
    }

    private int a(URL url, byte abyte0[])
    {
        URL url2;
        OutputStream outputstream;
        OutputStream outputstream1;
        Object obj;
        url2 = null;
        outputstream1 = null;
        obj = null;
        outputstream = null;
        b.d(url);
        b.d(abyte0);
        b("POST bytes, url", Integer.valueOf(abyte0.length), url);
        if (l())
        {
            a("Post payload\n", new String(abyte0));
        }
        url = b(url);
        URL url1;
        url2 = url;
        url = outputstream1;
        url1 = url2;
        outputstream = obj;
        url2.setDoOutput(true);
        url = outputstream1;
        url1 = url2;
        outputstream = obj;
        url2.setFixedLengthStreamingMode(abyte0.length);
        url = outputstream1;
        url1 = url2;
        outputstream = obj;
        url2.connect();
        url = outputstream1;
        url1 = url2;
        outputstream = obj;
        outputstream1 = url2.getOutputStream();
        url = outputstream1;
        url1 = url2;
        outputstream = outputstream1;
        outputstream1.write(abyte0);
        url = outputstream1;
        url1 = url2;
        outputstream = outputstream1;
        a(((HttpURLConnection) (url2)));
        url = outputstream1;
        url1 = url2;
        outputstream = outputstream1;
        int i = url2.getResponseCode();
        if (i != 200)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        url = outputstream1;
        url1 = url2;
        outputstream = outputstream1;
        super.d.c().e();
        url = outputstream1;
        url1 = url2;
        outputstream = outputstream1;
        b("POST status", Integer.valueOf(i));
        if (outputstream1 != null)
        {
            try
            {
                outputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (URL url)
            {
                e("Error closing http post connection output stream", url);
            }
        }
        if (url2 != null)
        {
            url2.disconnect();
        }
        return i;
        abyte0;
        url2 = null;
_L4:
        url = outputstream;
        url1 = url2;
        d("Network POST connection error", abyte0);
        if (outputstream != null)
        {
            try
            {
                outputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (URL url)
            {
                e("Error closing http post connection output stream", url);
            }
        }
        if (url2 != null)
        {
            url2.disconnect();
        }
        return 0;
        abyte0;
        url1 = null;
        url = url2;
_L2:
        if (url != null)
        {
            try
            {
                url.close();
            }
            // Misplaced declaration of an exception variable
            catch (URL url)
            {
                e("Error closing http post connection output stream", url);
            }
        }
        if (url1 != null)
        {
            url1.disconnect();
        }
        throw abyte0;
        abyte0;
        if (true) goto _L2; else goto _L1
_L1:
        abyte0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private URL a(jsn jsn1)
    {
        if (jsn1.f)
        {
            jsn1 = (new StringBuilder()).append(jsh.h()).append(jsh.j()).toString();
        } else
        {
            jsn1 = (new StringBuilder()).append(jsh.i()).append(jsh.j()).toString();
        }
        try
        {
            jsn1 = new URL(jsn1);
        }
        // Misplaced declaration of an exception variable
        catch (jsn jsn1)
        {
            e("Error trying to parse the hardcoded host url", jsn1);
            return null;
        }
        return jsn1;
    }

    private URL a(jsn jsn1, String s)
    {
        if (jsn1.f)
        {
            jsn1 = (new StringBuilder()).append(jsh.h()).append(jsh.j()).append("?").append(s).toString();
        } else
        {
            jsn1 = (new StringBuilder()).append(jsh.i()).append(jsh.j()).append("?").append(s).toString();
        }
        try
        {
            jsn1 = new URL(jsn1);
        }
        // Misplaced declaration of an exception variable
        catch (jsn jsn1)
        {
            e("Error trying to parse the hardcoded host url", jsn1);
            return null;
        }
        return jsn1;
    }

    private static void a(StringBuilder stringbuilder, String s, String s1)
    {
        if (stringbuilder.length() != 0)
        {
            stringbuilder.append('&');
        }
        stringbuilder.append(URLEncoder.encode(s, "UTF-8"));
        stringbuilder.append('=');
        stringbuilder.append(URLEncoder.encode(s1, "UTF-8"));
    }

    private void a(HttpURLConnection httpurlconnection)
    {
        HttpURLConnection httpurlconnection1 = null;
        httpurlconnection = httpurlconnection.getInputStream();
        httpurlconnection1 = httpurlconnection;
        byte abyte0[] = new byte[1024];
_L2:
        httpurlconnection1 = httpurlconnection;
        int i = httpurlconnection.read(abyte0);
        if (i > 0) goto _L2; else goto _L1
_L1:
        if (httpurlconnection == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        httpurlconnection.close();
        return;
        httpurlconnection;
        e("Error closing http connection input stream", httpurlconnection);
        return;
        httpurlconnection;
        if (httpurlconnection1 != null)
        {
            try
            {
                httpurlconnection1.close();
            }
            catch (IOException ioexception)
            {
                e("Error closing http connection input stream", ioexception);
            }
        }
        throw httpurlconnection;
    }

    private int b(URL url, byte abyte0[])
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        b.d(url);
        b.d(abyte0);
        byte abyte1[];
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        GZIPOutputStream gzipoutputstream = new GZIPOutputStream(bytearrayoutputstream);
        gzipoutputstream.write(abyte0);
        gzipoutputstream.close();
        bytearrayoutputstream.close();
        abyte1 = bytearrayoutputstream.toByteArray();
        a("POST compressed size, ratio %, url", Integer.valueOf(abyte1.length), Long.valueOf((100L * (long)abyte1.length) / (long)abyte0.length), url);
        if (abyte1.length > abyte0.length)
        {
            c("Compressed payload is larger then uncompressed. compressed, uncompressed", Integer.valueOf(abyte1.length), Integer.valueOf(abyte0.length));
        }
        if (l())
        {
            a("Post payload", (new StringBuilder("\n")).append(new String(abyte0)).toString());
        }
        url = b(url);
        Object obj2;
        int i;
        try
        {
            url.setDoOutput(true);
            url.addRequestProperty("Content-Encoding", "gzip");
            url.setFixedLengthStreamingMode(abyte1.length);
            url.connect();
            abyte0 = url.getOutputStream();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            obj = obj1;
        }
        abyte0.write(abyte1);
        abyte0.close();
        a(url);
        i = url.getResponseCode();
        if (i != 200)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        super.d.c().e();
        b("POST status", Integer.valueOf(i));
        if (url != null)
        {
            url.disconnect();
        }
        return i;
        abyte0;
        url = null;
_L4:
        d("Network compressed POST connection error", abyte0);
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                e("Error closing http compressed post connection output stream", abyte0);
            }
        }
        if (url != null)
        {
            url.disconnect();
        }
        return 0;
        abyte0;
        url = null;
        obj = obj1;
_L2:
        if (obj != null)
        {
            try
            {
                ((OutputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                e("Error closing http compressed post connection output stream", obj);
            }
        }
        if (url != null)
        {
            url.disconnect();
        }
        throw abyte0;
        obj2;
        obj = abyte0;
        abyte0 = ((byte []) (obj2));
        continue; /* Loop/switch isn't completed */
        abyte0;
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        obj = abyte0;
        abyte0 = ((byte []) (obj2));
        if (true) goto _L4; else goto _L3
_L3:
    }

    private HttpURLConnection b(URL url)
    {
        url = url.openConnection();
        if (!(url instanceof HttpURLConnection))
        {
            throw new IOException("Failed to obtain http connection");
        } else
        {
            url = (HttpURLConnection)url;
            url.setDefaultUseCaches(false);
            url.setConnectTimeout(((Integer)jsl.w.a()).intValue());
            url.setReadTimeout(((Integer)jsl.x.a()).intValue());
            url.setInstanceFollowRedirects(false);
            url.setRequestProperty("User-Agent", a);
            url.setDoInput(true);
            return url;
        }
    }

    private List b(List list)
    {
        ArrayList arraylist;
        arraylist = new ArrayList(list.size());
        list = list.iterator();
_L4:
        jsn jsn1;
        Object obj;
        boolean flag;
        if (!list.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        jsn1 = (jsn)list.next();
        b.d(jsn1);
        boolean flag1;
        if (!jsn1.f)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj = a(jsn1, flag1);
        if (obj != null) goto _L2; else goto _L1
_L1:
        super.d.a().a(jsn1, "Error formatting hit for upload");
        flag = true;
_L9:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(Long.valueOf(jsn1.c));
        if (arraylist.size() < jsh.f()) goto _L4; else goto _L3
_L3:
        return arraylist;
_L2:
        if (((String) (obj)).length() > ((Integer)jsl.o.a()).intValue()) goto _L6; else goto _L5
_L5:
        obj = a(jsn1, ((String) (obj)));
        if (obj != null) goto _L8; else goto _L7
_L7:
        f("Failed to build collect GET endpoint url");
_L10:
        flag = false;
          goto _L9
_L8:
        if (a(((URL) (obj))) == 200)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L9
_L6:
        byte abyte0[];
        String s = a(jsn1, false);
        if (s == null)
        {
            super.d.a().a(jsn1, "Error formatting hit for POST upload");
            flag = true;
        } else
        {
label0:
            {
                abyte0 = s.getBytes();
                if (abyte0.length <= ((Integer)jsl.s.a()).intValue())
                {
                    break label0;
                }
                super.d.a().a(jsn1, "Hit payload exceeds size limit");
                flag = true;
            }
        }
          goto _L9
        URL url;
        url = a(jsn1);
        if (url != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        f("Failed to build collect POST endpoint url");
          goto _L10
        if (a(url, abyte0) != 200) goto _L10; else goto _L11
_L11:
        flag = true;
          goto _L9
    }

    static byte[] c()
    {
        return c;
    }

    private URL d()
    {
        Object obj = (new StringBuilder()).append(jsh.h()).append((String)jsl.n.a()).toString();
        try
        {
            obj = new URL(((String) (obj)));
        }
        catch (MalformedURLException malformedurlexception)
        {
            e("Error trying to parse the hardcoded host url", malformedurlexception);
            return null;
        }
        return ((URL) (obj));
    }

    final String a(jsn jsn1, boolean flag)
    {
        StringBuilder stringbuilder;
        b.d(jsn1);
        stringbuilder = new StringBuilder();
        try
        {
            Iterator iterator = jsn1.a.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                String s = (String)entry.getKey();
                if (!"ht".equals(s) && !"qt".equals(s) && !"AppUID".equals(s) && !"z".equals(s) && !"_gmsv".equals(s))
                {
                    a(stringbuilder, s, (String)entry.getValue());
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (jsn jsn1)
        {
            e("Failed to encode name or value", jsn1);
            return null;
        }
        a(stringbuilder, "ht", String.valueOf(jsn1.d));
        a(stringbuilder, "qt", String.valueOf(g().a() - jsn1.d));
        if (kbe.a)
        {
            a(stringbuilder, "_gmsv", jsx.a);
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        long l = jtk.a(jsn1.a("_s", "0"));
        if (l == 0L) goto _L4; else goto _L3
_L3:
        jsn1 = String.valueOf(l);
_L5:
        a(stringbuilder, "z", ((String) (jsn1)));
_L2:
        return stringbuilder.toString();
_L4:
        l = jsn1.c;
        jsn1 = String.valueOf(l);
          goto _L5
    }

    public final List a(List list)
    {
        boolean flag3;
        flag3 = true;
        jrk.i();
        r();
        b.d(list);
        if (!i().k().isEmpty() && b.a((long)((Integer)jsl.v.a()).intValue() * 1000L)) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L6:
        boolean flag;
        boolean flag2;
        flag2 = false;
        flag = flag1;
_L7:
        jsr jsr1;
        ArrayList arraylist;
        if (!flag) goto _L4; else goto _L3
_L2:
        if (jsb.a((String)jsl.p.a()) != jsb.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (jsg.a((String)jsl.q.a()) != jsg.a) goto _L6; else goto _L5
_L5:
        flag2 = true;
          goto _L7
_L3:
        if (list.isEmpty())
        {
            flag3 = false;
        }
        b.b(flag3);
        a("Uploading batched hits. compression, count", Boolean.valueOf(flag2), Integer.valueOf(list.size()));
        jsr1 = new jsr(this);
        arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            jsn jsn1 = (jsn)list.next();
            if (!jsr1.a(jsn1))
            {
                break;
            }
            arraylist.add(Long.valueOf(jsn1.c));
        } while (true);
        if (jsr1.a == 0)
        {
            return arraylist;
        }
        list = d();
        if (list != null) goto _L9; else goto _L8
_L8:
        f("Failed to build batching endpoint url");
_L10:
        return Collections.emptyList();
_L9:
        int i;
        if (flag2)
        {
            i = b(list, jsr1.b.toByteArray());
        } else
        {
            i = a(((URL) (list)), jsr1.b.toByteArray());
        }
        if (200 == i)
        {
            a("Batched upload completed. Hits batched", Integer.valueOf(jsr1.a));
            return arraylist;
        }
        a("Network error uploading hits. status code", Integer.valueOf(i));
        if (i().k().contains(Integer.valueOf(i)))
        {
            e("Server instructed the client to stop batching");
            b.a();
        }
        if (true) goto _L10; else goto _L4
_L4:
        return b(list);
    }

    protected final void a()
    {
        a("Network initialized. User agent", a);
    }

    public final boolean b()
    {
        jrk.i();
        r();
        Object obj = (ConnectivityManager)h().getSystemService("connectivity");
        try
        {
            obj = ((ConnectivityManager) (obj)).getActiveNetworkInfo();
        }
        catch (SecurityException securityexception)
        {
            securityexception = null;
        }
        if (obj == null || !((NetworkInfo) (obj)).isConnected())
        {
            b("No network connectivity");
            return false;
        } else
        {
            return true;
        }
    }

}
