// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.wg;
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
//            y, z, q, p, 
//            aa, s, d, az, 
//            bh, bi, j, m, 
//            ar, av

final class l extends y
{

    private static final byte c[] = "\n".getBytes();
    private final String a;
    private final p b;

    l(aa aa1)
    {
        super(aa1);
        a = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] {
            "GoogleAnalytics", z.a, android.os.Build.VERSION.RELEASE, q.a(Locale.getDefault()), Build.MODEL, Build.ID
        });
        b = new p(aa1.c());
    }

    private int a(URL url)
    {
        URL url1;
        URL url2;
        bl.a(url);
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
        int k = url.getResponseCode();
        if (k != 200)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        url1 = url;
        url2 = url;
        r().f();
        url1 = url;
        url2 = url;
        b("GET status", Integer.valueOf(k));
        if (url != null)
        {
            url.disconnect();
        }
        return k;
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
        bl.a(url);
        bl.a(abyte0);
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
        int k = url2.getResponseCode();
        if (k != 200)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        url = outputstream1;
        url1 = url2;
        outputstream = outputstream1;
        r().f();
        url = outputstream1;
        url1 = url2;
        outputstream = outputstream1;
        b("POST status", Integer.valueOf(k));
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
        return k;
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

    private URL a(d d1)
    {
        if (d1.e())
        {
            d1 = (new StringBuilder()).append(az.h()).append(az.j()).toString();
        } else
        {
            d1 = (new StringBuilder()).append(com.google.android.gms.analytics.internal.az.i()).append(az.j()).toString();
        }
        try
        {
            d1 = new URL(d1);
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            e("Error trying to parse the hardcoded host url", d1);
            return null;
        }
        return d1;
    }

    private URL a(d d1, String s1)
    {
        if (d1.e())
        {
            d1 = (new StringBuilder()).append(az.h()).append(az.j()).append("?").append(s1).toString();
        } else
        {
            d1 = (new StringBuilder()).append(com.google.android.gms.analytics.internal.az.i()).append(az.j()).append("?").append(s1).toString();
        }
        try
        {
            d1 = new URL(d1);
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            e("Error trying to parse the hardcoded host url", d1);
            return null;
        }
        return d1;
    }

    private static void a(StringBuilder stringbuilder, String s1, String s2)
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
    {
        HttpURLConnection httpurlconnection1 = null;
        httpurlconnection = httpurlconnection.getInputStream();
        httpurlconnection1 = httpurlconnection;
        byte abyte0[] = new byte[1024];
_L2:
        httpurlconnection1 = httpurlconnection;
        int k = httpurlconnection.read(abyte0);
        if (k > 0) goto _L2; else goto _L1
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
        bl.a(url);
        bl.a(abyte0);
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
        int k;
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
        k = url.getResponseCode();
        if (k != 200)
        {
            break MISSING_BLOCK_LABEL_222;
        }
        r().f();
        b("POST status", Integer.valueOf(k));
        if (url != null)
        {
            url.disconnect();
        }
        return k;
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
            url.setConnectTimeout(((Integer)bh.E.a()).intValue());
            url.setReadTimeout(((Integer)bh.F.a()).intValue());
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
        d d1;
        Object obj;
        boolean flag;
        if (!list.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        d1 = (d)list.next();
        bl.a(d1);
        boolean flag1;
        if (!d1.e())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj = a(d1, flag1);
        if (obj != null) goto _L2; else goto _L1
_L1:
        n().a(d1, "Error formatting hit for upload");
        flag = true;
_L9:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(Long.valueOf(d1.c()));
        if (arraylist.size() < az.f()) goto _L4; else goto _L3
_L3:
        return arraylist;
_L2:
        if (((String) (obj)).length() > ((Integer)bh.u.a()).intValue()) goto _L6; else goto _L5
_L5:
        obj = a(d1, ((String) (obj)));
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
        String s1 = a(d1, false);
        if (s1 == null)
        {
            n().a(d1, "Error formatting hit for POST upload");
            flag = true;
        } else
        {
label0:
            {
                abyte0 = s1.getBytes();
                if (abyte0.length <= ((Integer)bh.z.a()).intValue())
                {
                    break label0;
                }
                n().a(d1, "Hit payload exceeds size limit");
                flag = true;
            }
        }
          goto _L9
        URL url;
        url = a(d1);
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
        Object obj = (new StringBuilder()).append(az.h()).append((String)bh.t.a()).toString();
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

    final String a(d d1, boolean flag)
    {
        StringBuilder stringbuilder;
        bl.a(d1);
        stringbuilder = new StringBuilder();
        try
        {
            Iterator iterator = d1.b().entrySet().iterator();
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
        catch (d d1)
        {
            e("Failed to encode name or value", d1);
            return null;
        }
        a(stringbuilder, "ht", String.valueOf(d1.d()));
        a(stringbuilder, "qt", String.valueOf(l().a() - d1.d()));
        if (i.a)
        {
            a(stringbuilder, "_gmsv", z.a);
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        long l1 = d1.f();
        if (l1 == 0L) goto _L4; else goto _L3
_L3:
        d1 = String.valueOf(l1);
_L5:
        a(stringbuilder, "z", ((String) (d1)));
_L2:
        return stringbuilder.toString();
_L4:
        l1 = d1.c();
        d1 = String.valueOf(l1);
          goto _L5
    }

    public final List a(List list)
    {
        boolean flag3;
        flag3 = true;
        aa.r();
        B();
        bl.a(list);
        if (!o().k().isEmpty() && b.a((long)((Integer)bh.C.a()).intValue() * 1000L)) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L6:
        boolean flag;
        boolean flag2;
        flag2 = false;
        flag = flag1;
_L7:
        m m1;
        ArrayList arraylist;
        if (!flag) goto _L4; else goto _L3
_L2:
        if (ar.a((String)bh.v.a()) != ar.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (av.a((String)bh.w.a()) != av.b) goto _L6; else goto _L5
_L5:
        flag2 = true;
          goto _L7
_L3:
        if (list.isEmpty())
        {
            flag3 = false;
        }
        bl.b(flag3);
        a("Uploading batched hits. compression, count", Boolean.valueOf(flag2), Integer.valueOf(list.size()));
        m1 = new m(this);
        arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            d d1 = (d)list.next();
            if (!m1.a(d1))
            {
                break;
            }
            arraylist.add(Long.valueOf(d1.c()));
        } while (true);
        if (m1.a() == 0)
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
        int k;
        if (flag2)
        {
            k = b(list, m1.b());
        } else
        {
            k = a(((URL) (list)), m1.b());
        }
        if (200 == k)
        {
            a("Batched upload completed. Hits batched", Integer.valueOf(m1.a()));
            return arraylist;
        }
        a("Network error uploading hits. status code", Integer.valueOf(k));
        if (o().k().contains(Integer.valueOf(k)))
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
        aa.r();
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
            b("No network connectivity");
            return false;
        } else
        {
            return true;
        }
    }

}
