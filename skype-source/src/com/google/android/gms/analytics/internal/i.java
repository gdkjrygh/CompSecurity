// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.io;
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
//            q, r, m, k, 
//            s, o, c, ae, 
//            al, g, z, ab

final class i extends q
{
    private final class a
    {

        final i a;
        private int b;
        private ByteArrayOutputStream c;

        public final int a()
        {
            return b;
        }

        public final boolean a(c c1)
        {
            y.a(c1);
            if (b + 1 > com.google.android.gms.analytics.internal.ae.g())
            {
                return false;
            }
            String s1 = a.a(c1, false);
            if (s1 == null)
            {
                a.n().a(c1, "Error formatting hit");
                return true;
            }
            byte abyte0[] = s1.getBytes();
            int l = abyte0.length;
            if (l > ae.c())
            {
                a.n().a(c1, "Hit size exceeds the maximum size limit");
                return true;
            }
            int j = l;
            if (c.size() > 0)
            {
                j = l + 1;
            }
            if (c.size() + j > ((Integer)al.A.a()).intValue())
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

        public final byte[] b()
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

    i(s s1)
    {
        super(s1);
        a = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] {
            "GoogleAnalytics", r.a, android.os.Build.VERSION.RELEASE, m.a(Locale.getDefault()), Build.MODEL, Build.ID
        });
        b = new k(s1.c());
    }

    private int a(URL url)
    {
        URL url1;
        URL url2;
        y.a(url);
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
        int j = url.getResponseCode();
        if (j != 200)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        url1 = url;
        url2 = url;
        r().h();
        url1 = url;
        url2 = url;
        b("GET status", Integer.valueOf(j));
        if (url != null)
        {
            url.disconnect();
        }
        return j;
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
        y.a(url);
        y.a(abyte0);
        b("POST bytes, url", Integer.valueOf(abyte0.length), url);
        if (z())
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
        int j = url2.getResponseCode();
        if (j != 200)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        url = outputstream1;
        url1 = url2;
        outputstream = outputstream1;
        r().h();
        url = outputstream1;
        url1 = url2;
        outputstream = outputstream1;
        b("POST status", Integer.valueOf(j));
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
        return j;
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

    private URL a(c c1)
    {
        if (c1.e())
        {
            c1 = (new StringBuilder()).append(ae.h()).append(ae.j()).toString();
        } else
        {
            c1 = (new StringBuilder()).append(ae.i()).append(ae.j()).toString();
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

    private URL a(c c1, String s1)
    {
        if (c1.e())
        {
            c1 = (new StringBuilder()).append(ae.h()).append(ae.j()).append("?").append(s1).toString();
        } else
        {
            c1 = (new StringBuilder()).append(ae.i()).append(ae.j()).append("?").append(s1).toString();
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

    private static void a(StringBuilder stringbuilder, String s1, String s2)
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

    private int b(URL url, byte abyte0[])
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        y.a(url);
        y.a(abyte0);
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
        if (z())
        {
            a("Post payload", (new StringBuilder("\n")).append(new String(abyte0)).toString());
        }
        url = b(url);
        Object obj2;
        int j;
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
        j = url.getResponseCode();
        if (j != 200)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        r().h();
        b("POST status", Integer.valueOf(j));
        if (url != null)
        {
            url.disconnect();
        }
        return j;
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
            url.setConnectTimeout(((Integer)al.E.a()).intValue());
            url.setReadTimeout(((Integer)al.F.a()).intValue());
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
        c c1;
        Object obj;
        boolean flag;
        if (!list.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        c1 = (c)list.next();
        y.a(c1);
        boolean flag1;
        if (!c1.e())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj = a(c1, flag1);
        if (obj != null) goto _L2; else goto _L1
_L1:
        n().a(c1, "Error formatting hit for upload");
        flag = true;
_L9:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(Long.valueOf(c1.c()));
        if (arraylist.size() < ae.f()) goto _L4; else goto _L3
_L3:
        return arraylist;
_L2:
        if (((String) (obj)).length() > ((Integer)al.u.a()).intValue()) goto _L6; else goto _L5
_L5:
        obj = a(c1, ((String) (obj)));
        if (obj != null) goto _L8; else goto _L7
_L7:
        g("Failed to build collect GET endpoint url");
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
        String s1 = a(c1, false);
        if (s1 == null)
        {
            n().a(c1, "Error formatting hit for POST upload");
            flag = true;
        } else
        {
label0:
            {
                abyte0 = s1.getBytes();
                if (abyte0.length <= ((Integer)al.z.a()).intValue())
                {
                    break label0;
                }
                n().a(c1, "Hit payload exceeds size limit");
                flag = true;
            }
        }
          goto _L9
        URL url;
        url = a(c1);
        if (url != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        g("Failed to build collect POST endpoint url");
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
        Object obj = (new StringBuilder()).append(ae.h()).append((String)al.t.a()).toString();
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

    final String a(c c1, boolean flag)
    {
        StringBuilder stringbuilder;
        y.a(c1);
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
        a(stringbuilder, "qt", String.valueOf(l().a() - c1.d()));
        if (g.a)
        {
            a(stringbuilder, "_gmsv", r.a);
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        long l = c1.f();
        if (l == 0L) goto _L4; else goto _L3
_L3:
        c1 = String.valueOf(l);
_L5:
        a(stringbuilder, "z", ((String) (c1)));
_L2:
        return stringbuilder.toString();
_L4:
        l = c1.c();
        c1 = String.valueOf(l);
          goto _L5
    }

    public final List a(List list)
    {
        boolean flag3;
        flag3 = true;
        s.r();
        B();
        y.a(list);
        if (!o().k().isEmpty() && b.a((long)((Integer)al.C.a()).intValue() * 1000L)) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L6:
        boolean flag;
        boolean flag2;
        flag2 = false;
        flag = flag1;
_L7:
        a a1;
        ArrayList arraylist;
        if (!flag) goto _L4; else goto _L3
_L2:
        if (z.a((String)al.v.a()) != z.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (ab.a((String)al.w.a()) != ab.b) goto _L6; else goto _L5
_L5:
        flag2 = true;
          goto _L7
_L3:
        if (list.isEmpty())
        {
            flag3 = false;
        }
        y.b(flag3);
        a("Uploading batched hits. compression, count", Boolean.valueOf(flag2), Integer.valueOf(list.size()));
        a1 = new a();
        arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            c c1 = (c)list.next();
            if (!a1.a(c1))
            {
                break;
            }
            arraylist.add(Long.valueOf(c1.c()));
        } while (true);
        if (a1.a() == 0)
        {
            return arraylist;
        }
        list = d();
        if (list != null) goto _L9; else goto _L8
_L8:
        g("Failed to build batching endpoint url");
_L10:
        return Collections.emptyList();
_L9:
        int j;
        if (flag2)
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
        if (o().k().contains(Integer.valueOf(j)))
        {
            f("Server instructed the client to stop batching");
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
        s.r();
        B();
        Object obj = (ConnectivityManager)m().getSystemService("connectivity");
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
            c("No network connectivity");
            return false;
        } else
        {
            return true;
        }
    }

}
