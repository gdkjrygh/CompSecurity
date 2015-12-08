// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.ix;
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

// Referenced classes of package com.google.android.gms.analytics.internal:
//            r, s, n, k, 
//            t, p, c, af, 
//            g, aa, ac

class i extends r
{
    private class a
    {

        final i a;
        private int b;
        private ByteArrayOutputStream c;

        public int a()
        {
            return b;
        }

        public boolean a(c c1)
        {
            z.a(c1);
            if (b + 1 > a.q().m())
            {
                return false;
            }
            String s1 = a.a(c1, false);
            if (s1 == null)
            {
                a.p().a(c1, "Error formatting hit");
                return true;
            }
            byte abyte0[] = s1.getBytes();
            int l = abyte0.length;
            if (l > a.q().e())
            {
                a.p().a(c1, "Hit size exceeds the maximum size limit");
                return true;
            }
            int j = l;
            if (c.size() > 0)
            {
                j = l + 1;
            }
            if (j + c.size() > a.q().g())
            {
                return false;
            }
            try
            {
                if (c.size() > 0)
                {
                    c.write(i.c());
                }
                c.write(abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (c c1)
            {
                a.e("Failed to write payload when batching hits", c1);
                return true;
            }
            b = b + 1;
            return true;
        }

        public byte[] b()
        {
            return c.toByteArray();
        }

        public a()
        {
            a = i.this;
            super();
            c = new ByteArrayOutputStream();
        }
    }


    private static final byte c[] = "\n".getBytes();
    private final String a;
    private final k b;

    i(t t1)
    {
        super(t1);
        a = a("GoogleAnalytics", s.a, android.os.Build.VERSION.RELEASE, n.a(Locale.getDefault()), Build.MODEL, Build.ID);
        b = new k(t1.d());
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
        z.a(url);
        z.a(abyte0);
        b("POST bytes, url", Integer.valueOf(abyte0.length), url);
        if (B())
        {
            a("Post payload\n", new String(abyte0));
        }
        url = a(url);
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
        int l = url2.getResponseCode();
        if (l != 200)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        url = outputstream1;
        url1 = url2;
        outputstream = outputstream1;
        t().h();
        url = outputstream1;
        url1 = url2;
        outputstream = outputstream1;
        b("POST status", Integer.valueOf(l));
        int j;
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
        j = l;
        if (url2 != null)
        {
            url2.disconnect();
            j = l;
        }
_L2:
        return j;
        abyte0;
        url2 = null;
_L5:
        url = outputstream;
        url1 = url2;
        d("Network POST connection error", abyte0);
        j = 0;
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
        if (url2 == null) goto _L2; else goto _L1
_L1:
        url2.disconnect();
        return 0;
        abyte0;
        url1 = null;
        url = url2;
_L4:
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
        if (true) goto _L4; else goto _L3
_L3:
        abyte0;
          goto _L5
    }

    private static String a(String s1, String s2, String s3, String s4, String s5, String s6)
    {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] {
            s1, s2, s3, s4, s5, s6
        });
    }

    private URL a(c c1, String s1)
    {
        if (c1.f())
        {
            c1 = (new StringBuilder()).append(q().o()).append(q().q()).append("?").append(s1).toString();
        } else
        {
            c1 = (new StringBuilder()).append(q().p()).append(q().q()).append("?").append(s1).toString();
        }
        try
        {
            c1 = new URL(c1);
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            e("Error trying to parse the hardcoded host url", c1);
            return null;
        }
        return c1;
    }

    private void a(StringBuilder stringbuilder, String s1, String s2)
        throws UnsupportedEncodingException
    {
        if (stringbuilder.length() != 0)
        {
            stringbuilder.append('&');
        }
        stringbuilder.append(URLEncoder.encode(s1, "UTF-8"));
        stringbuilder.append('=');
        stringbuilder.append(URLEncoder.encode(s2, "UTF-8"));
    }

    private void a(HttpURLConnection httpurlconnection)
        throws IOException
    {
        HttpURLConnection httpurlconnection1 = null;
        httpurlconnection = httpurlconnection.getInputStream();
        httpurlconnection1 = httpurlconnection;
        byte abyte0[] = new byte[1024];
_L2:
        httpurlconnection1 = httpurlconnection;
        int j = httpurlconnection.read(abyte0);
        if (j > 0) goto _L2; else goto _L1
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

    private boolean a(c c1)
    {
        String s1;
        z.a(c1);
        boolean flag;
        if (!c1.f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s1 = a(c1, flag);
        if (s1 != null) goto _L2; else goto _L1
_L1:
        p().a(c1, "Error formatting hit for upload");
_L4:
        return true;
_L2:
        if (s1.length() > q().d())
        {
            break; /* Loop/switch isn't completed */
        }
        c1 = a(c1, s1);
        if (c1 == null)
        {
            f("Failed to build collect GET endpoint url");
            return false;
        }
        if (b(c1) != 200)
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        String s2 = a(c1, false);
        if (s2 == null)
        {
            p().a(c1, "Error formatting hit for POST upload");
            return true;
        }
        byte abyte0[] = s2.getBytes();
        if (abyte0.length > q().f())
        {
            p().a(c1, "Hit payload exceeds size limit");
            return true;
        }
        c1 = b(c1);
        if (c1 == null)
        {
            f("Failed to build collect POST endpoint url");
            return false;
        }
        if (a(((URL) (c1)), abyte0) != 200)
        {
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private static byte[] a(byte abyte0[])
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        GZIPOutputStream gzipoutputstream = new GZIPOutputStream(bytearrayoutputstream);
        gzipoutputstream.write(abyte0);
        gzipoutputstream.close();
        bytearrayoutputstream.close();
        return bytearrayoutputstream.toByteArray();
    }

    private int b(URL url)
    {
        URL url1;
        URL url2;
        z.a(url);
        b("GET request", url);
        url2 = null;
        url1 = null;
        url = a(url);
        url1 = url;
        url2 = url;
        url.connect();
        url1 = url;
        url2 = url;
        a(url);
        url1 = url;
        url2 = url;
        int l = url.getResponseCode();
        if (l != 200)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        url1 = url;
        url2 = url;
        t().h();
        url1 = url;
        url2 = url;
        b("GET status", Integer.valueOf(l));
        int j;
        j = l;
        if (url != null)
        {
            url.disconnect();
            j = l;
        }
_L2:
        return j;
        url;
        url2 = url1;
        d("Network GET connection error", url);
        j = 0;
        if (url1 == null) goto _L2; else goto _L1
_L1:
        url1.disconnect();
        return 0;
        url;
        if (url2 != null)
        {
            url2.disconnect();
        }
        throw url;
    }

    private int b(URL url, byte abyte0[])
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        z.a(url);
        z.a(abyte0);
        byte abyte1[];
        abyte1 = a(abyte0);
        a("POST compressed size, ratio %, url", Integer.valueOf(abyte1.length), Long.valueOf((100L * (long)abyte1.length) / (long)abyte0.length), url);
        if (abyte1.length > abyte0.length)
        {
            c("Compressed payload is larger then uncompressed. compressed, uncompressed", Integer.valueOf(abyte1.length), Integer.valueOf(abyte0.length));
        }
        if (B())
        {
            a("Post payload", (new StringBuilder()).append("\n").append(new String(abyte0)).toString());
        }
        url = a(url);
        url.setDoOutput(true);
        url.addRequestProperty("Content-Encoding", "gzip");
        url.setFixedLengthStreamingMode(abyte1.length);
        url.connect();
        abyte0 = url.getOutputStream();
        abyte0.write(abyte1);
        abyte0.close();
        int l;
        a(url);
        l = url.getResponseCode();
        if (l != 200)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        t().h();
        b("POST status", Integer.valueOf(l));
        int j;
        if (false)
        {
            try
            {
                throw new NullPointerException();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                e("Error closing http compressed post connection output stream", abyte0);
            }
        }
        j = l;
        if (url != null)
        {
            url.disconnect();
            j = l;
        }
_L2:
        return j;
        abyte0;
        url = null;
_L5:
        d("Network compressed POST connection error", abyte0);
        j = 0;
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
        if (url == null) goto _L2; else goto _L1
_L1:
        url.disconnect();
        return 0;
        abyte0;
        url = null;
        obj = obj1;
_L4:
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
        abyte0;
        obj = obj1;
        continue; /* Loop/switch isn't completed */
        Object obj2;
        obj2;
        obj = abyte0;
        abyte0 = ((byte []) (obj2));
        continue; /* Loop/switch isn't completed */
        abyte0;
        if (true) goto _L4; else goto _L3
_L3:
        abyte0;
          goto _L5
        obj2;
        obj = abyte0;
        abyte0 = ((byte []) (obj2));
          goto _L5
    }

    private URL b(c c1)
    {
        if (c1.f())
        {
            c1 = (new StringBuilder()).append(q().o()).append(q().q()).toString();
        } else
        {
            c1 = (new StringBuilder()).append(q().p()).append(q().q()).toString();
        }
        try
        {
            c1 = new URL(c1);
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            e("Error trying to parse the hardcoded host url", c1);
            return null;
        }
        return c1;
    }

    private String c(c c1)
    {
        return String.valueOf(c1.c());
    }

    static byte[] c()
    {
        return c;
    }

    private URL d()
    {
        Object obj = (new StringBuilder()).append(q().o()).append(q().r()).toString();
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

    String a(c c1, boolean flag)
    {
        StringBuilder stringbuilder;
        z.a(c1);
        stringbuilder = new StringBuilder();
        try
        {
            Iterator iterator = c1.b().entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                String s1 = (String)entry.getKey();
                if (!"ht".equals(s1) && !"qt".equals(s1) && !"AppUID".equals(s1) && !"z".equals(s1) && !"_gmsv".equals(s1))
                {
                    a(stringbuilder, s1, (String)entry.getValue());
                }
            } while (true);
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            e("Failed to encode name or value", c1);
            return null;
        }
        a(stringbuilder, "ht", String.valueOf(c1.d()));
        a(stringbuilder, "qt", String.valueOf(n().a() - c1.d()));
        if (q().a())
        {
            a(stringbuilder, "_gmsv", s.a);
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        long l = c1.g();
        if (l == 0L) goto _L4; else goto _L3
_L3:
        c1 = String.valueOf(l);
_L6:
        a(stringbuilder, "z", ((String) (c1)));
_L2:
        return stringbuilder.toString();
_L4:
        c1 = c(c1);
        if (true) goto _L6; else goto _L5
_L5:
    }

    HttpURLConnection a(URL url)
        throws IOException
    {
        url = url.openConnection();
        if (!(url instanceof HttpURLConnection))
        {
            throw new IOException("Failed to obtain http connection");
        } else
        {
            url = (HttpURLConnection)url;
            url.setDefaultUseCaches(false);
            url.setConnectTimeout(q().D());
            url.setReadTimeout(q().E());
            url.setInstanceFollowRedirects(false);
            url.setRequestProperty("User-Agent", a);
            url.setDoInput(true);
            return url;
        }
    }

    public List a(List list)
    {
        boolean flag2 = true;
        m();
        D();
        z.a(list);
        boolean flag1;
        if (q().u().isEmpty() || !b.a(q().n() * 1000L))
        {
            flag2 = false;
            flag1 = false;
        } else
        {
            boolean flag;
            if (q().s() != aa.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag;
            if (q().t() != ac.b)
            {
                flag2 = false;
                flag1 = flag;
            }
        }
        if (flag1)
        {
            return a(list, flag2);
        } else
        {
            return b(list);
        }
    }

    List a(List list, boolean flag)
    {
        a a1;
        ArrayList arraylist;
        boolean flag1;
        if (!list.isEmpty())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        z.b(flag1);
        a("Uploading batched hits. compression, count", Boolean.valueOf(flag), Integer.valueOf(list.size()));
        a1 = new a();
        arraylist = new ArrayList();
        list = list.iterator();
label0:
        do
        {
            c c1;
label1:
            {
                if (list.hasNext())
                {
                    c1 = (c)list.next();
                    if (a1.a(c1))
                    {
                        break label1;
                    }
                }
                if (a1.a() == 0)
                {
                    return arraylist;
                }
                break label0;
            }
            arraylist.add(Long.valueOf(c1.c()));
        } while (true);
        list = d();
        if (list == null)
        {
            f("Failed to build batching endpoint url");
            return Collections.emptyList();
        }
        int j;
        if (flag)
        {
            j = b(list, a1.b());
        } else
        {
            j = a(((URL) (list)), a1.b());
        }
        if (200 == j)
        {
            a("Batched upload completed. Hits batched", Integer.valueOf(a1.a()));
            return arraylist;
        }
        a("Network error uploading hits. status code", Integer.valueOf(j));
        if (q().u().contains(Integer.valueOf(j)))
        {
            e("Server instructed the client to stop batching");
            b.a();
        }
        return Collections.emptyList();
    }

    protected void a()
    {
        a("Network initialized. User agent", a);
    }

    List b(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        list = list.iterator();
        do
        {
            c c1;
label0:
            {
                if (list.hasNext())
                {
                    c1 = (c)list.next();
                    if (a(c1))
                    {
                        break label0;
                    }
                }
                return arraylist;
            }
            arraylist.add(Long.valueOf(c1.c()));
            if (arraylist.size() >= q().l())
            {
                return arraylist;
            }
        } while (true);
    }

    public boolean b()
    {
        m();
        D();
        Object obj = (ConnectivityManager)o().getSystemService("connectivity");
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
