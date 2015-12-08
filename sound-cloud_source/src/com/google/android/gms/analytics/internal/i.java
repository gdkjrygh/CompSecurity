// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.b.V;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzx;
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
//            t, u, l, k, 
//            v, s, n, d, 
//            R, Z, g, K, 
//            O

final class i extends t
{
    private final class a
    {

        int a;
        ByteArrayOutputStream b;
        final i c;

        public final boolean a(d d1)
        {
            zzx.zzv(d1);
            if (a + 1 > R.g())
            {
                return false;
            }
            String s1 = c.a(d1, false);
            if (s1 == null)
            {
                ((s) (c)).i.a().a(d1, "Error formatting hit");
                return true;
            }
            byte abyte0[] = s1.getBytes();
            int i1 = abyte0.length;
            if (i1 > R.c())
            {
                ((s) (c)).i.a().a(d1, "Hit size exceeds the maximum size limit");
                return true;
            }
            int j = i1;
            if (b.size() > 0)
            {
                j = i1 + 1;
            }
            if (b.size() + j > ((Integer)Z.A.a()).intValue())
            {
                return false;
            }
            try
            {
                if (b.size() > 0)
                {
                    b.write(i.c());
                }
                b.write(abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (d d1)
            {
                c.d("Failed to write payload when batching hits", d1);
                return true;
            }
            a = a + 1;
            return true;
        }

        public a()
        {
            c = i.this;
            super();
            b = new ByteArrayOutputStream();
        }
    }


    private static final byte c[] = "\n".getBytes();
    private final String a;
    private final k b;

    i(v v1)
    {
        super(v1);
        a = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] {
            "GoogleAnalytics", u.a, android.os.Build.VERSION.RELEASE, l.a(Locale.getDefault()), Build.MODEL, Build.ID
        });
        b = new k(v1.c);
    }

    private int a(URL url)
    {
        URL url1;
        URL url2;
        zzx.zzv(url);
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
            break MISSING_BLOCK_LABEL_71;
        }
        url1 = url;
        url2 = url;
        super.i.c().e();
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
        c("Network GET connection error", url);
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
        zzx.zzv(url);
        zzx.zzv(abyte0);
        b("POST bytes, url", Integer.valueOf(abyte0.length), url);
        if (m())
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
            break MISSING_BLOCK_LABEL_205;
        }
        url = outputstream1;
        url1 = url2;
        outputstream = outputstream1;
        super.i.c().e();
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
                d("Error closing http post connection output stream", url);
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
        c("Network POST connection error", abyte0);
        if (outputstream != null)
        {
            try
            {
                outputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (URL url)
            {
                d("Error closing http post connection output stream", url);
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
                d("Error closing http post connection output stream", url);
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
        if (d1.f)
        {
            d1 = (new StringBuilder()).append(R.h()).append(R.j()).toString();
        } else
        {
            d1 = (new StringBuilder()).append(R.i()).append(R.j()).toString();
        }
        try
        {
            d1 = new URL(d1);
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            d("Error trying to parse the hardcoded host url", d1);
            return null;
        }
        return d1;
    }

    private URL a(d d1, String s1)
    {
        if (d1.f)
        {
            d1 = (new StringBuilder()).append(R.h()).append(R.j()).append("?").append(s1).toString();
        } else
        {
            d1 = (new StringBuilder()).append(R.i()).append(R.j()).append("?").append(s1).toString();
        }
        try
        {
            d1 = new URL(d1);
        }
        // Misplaced declaration of an exception variable
        catch (d d1)
        {
            d("Error trying to parse the hardcoded host url", d1);
            return null;
        }
        return d1;
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
        d("Error closing http connection input stream", httpurlconnection);
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
                d("Error closing http connection input stream", ioexception);
            }
        }
        throw httpurlconnection;
    }

    private int b(URL url, byte abyte0[])
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = null;
        zzx.zzv(url);
        zzx.zzv(abyte0);
        byte abyte1[];
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        GZIPOutputStream gzipoutputstream = new GZIPOutputStream(bytearrayoutputstream);
        gzipoutputstream.write(abyte0);
        gzipoutputstream.close();
        bytearrayoutputstream.close();
        abyte1 = bytearrayoutputstream.toByteArray();
        super.a(3, "POST compressed size, ratio %, url", Integer.valueOf(abyte1.length), Long.valueOf((100L * (long)abyte1.length) / (long)abyte0.length), url);
        if (abyte1.length > abyte0.length)
        {
            c("Compressed payload is larger then uncompressed. compressed, uncompressed", Integer.valueOf(abyte1.length), Integer.valueOf(abyte0.length));
        }
        if (m())
        {
            a("Post payload", (new StringBuilder("\n")).append(new String(abyte0)).toString());
        }
        url = b(url);
        Exception exception;
        Exception exception1;
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
        catch (Object obj)
        {
            Object obj2 = null;
            abyte0 = url;
            url = obj2;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            continue; /* Loop/switch isn't completed */
        }
        abyte0.write(abyte1);
        abyte0.close();
        a(url);
        j = url.getResponseCode();
        if (j != 200)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        super.i.c().e();
        b("POST status", Integer.valueOf(j));
        if (url != null)
        {
            url.disconnect();
        }
        return j;
        obj;
        url = null;
        abyte0 = obj1;
_L4:
        c("Network compressed POST connection error", obj);
        if (url != null)
        {
            try
            {
                url.close();
            }
            // Misplaced declaration of an exception variable
            catch (URL url)
            {
                d("Error closing http compressed post connection output stream", url);
            }
        }
        if (abyte0 != null)
        {
            abyte0.disconnect();
        }
        return 0;
        abyte0;
        url = null;
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
                d("Error closing http compressed post connection output stream", obj);
            }
        }
        if (url != null)
        {
            url.disconnect();
        }
        throw abyte0;
        exception;
        obj = abyte0;
        abyte0 = exception;
        continue; /* Loop/switch isn't completed */
        exception1;
        obj = abyte0;
        URL url1 = url;
        abyte0 = exception1;
        url = ((URL) (obj));
        obj = url1;
        if (true) goto _L2; else goto _L1
_L1:
        break MISSING_BLOCK_LABEL_187;
        obj;
        URL url2 = url;
        url = abyte0;
        abyte0 = url2;
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
            url.setConnectTimeout(((Integer)Z.E.a()).intValue());
            url.setReadTimeout(((Integer)Z.F.a()).intValue());
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
        zzx.zzv(d1);
        boolean flag1;
        if (!d1.f)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj = a(d1, flag1);
        if (obj != null) goto _L2; else goto _L1
_L1:
        super.i.a().a(d1, "Error formatting hit for upload");
        flag = true;
_L9:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(Long.valueOf(d1.c));
        if (arraylist.size() < R.f()) goto _L4; else goto _L3
_L3:
        return arraylist;
_L2:
        if (((String) (obj)).length() > ((Integer)Z.u.a()).intValue()) goto _L6; else goto _L5
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
            super.i.a().a(d1, "Error formatting hit for POST upload");
            flag = true;
        } else
        {
label0:
            {
                abyte0 = s1.getBytes();
                if (abyte0.length <= ((Integer)Z.z.a()).intValue())
                {
                    break label0;
                }
                super.i.a().a(d1, "Hit payload exceeds size limit");
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
        Object obj = (new StringBuilder()).append(R.h()).append((String)Z.t.a()).toString();
        try
        {
            obj = new URL(((String) (obj)));
        }
        catch (MalformedURLException malformedurlexception)
        {
            d("Error trying to parse the hardcoded host url", malformedurlexception);
            return null;
        }
        return ((URL) (obj));
    }

    final String a(d d1, boolean flag)
    {
        StringBuilder stringbuilder;
        zzx.zzv(d1);
        stringbuilder = new StringBuilder();
        try
        {
            Iterator iterator = d1.a.entrySet().iterator();
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
            d("Failed to encode name or value", d1);
            return null;
        }
        a(stringbuilder, "ht", String.valueOf(d1.d));
        a(stringbuilder, "qt", String.valueOf(super.i.c.a() - d1.d));
        if (zzd.zzacF)
        {
            a(stringbuilder, "_gmsv", u.a);
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        long l1 = l.a(d1.a("_s", "0"));
        if (l1 == 0L) goto _L4; else goto _L3
_L3:
        d1 = String.valueOf(l1);
_L5:
        a(stringbuilder, "z", ((String) (d1)));
_L2:
        return stringbuilder.toString();
_L4:
        l1 = d1.c;
        d1 = String.valueOf(l1);
          goto _L5
    }

    public final List a(List list)
    {
        boolean flag3;
        flag3 = true;
        v.g();
        o();
        zzx.zzv(list);
        if (!super.i.d.k().isEmpty() && b.a((long)((Integer)Z.C.a()).intValue() * 1000L)) goto _L2; else goto _L1
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
        if (K.a((String)Z.v.a()) != K.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (O.a((String)Z.w.a()) != O.b) goto _L6; else goto _L5
_L5:
        flag2 = true;
          goto _L7
_L3:
        if (list.isEmpty())
        {
            flag3 = false;
        }
        zzx.zzZ(flag3);
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
            d d1 = (d)list.next();
            if (!a1.a(d1))
            {
                break;
            }
            arraylist.add(Long.valueOf(d1.c));
        } while (true);
        if (a1.a == 0)
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
        int j;
        if (flag2)
        {
            j = b(list, a1.b.toByteArray());
        } else
        {
            j = a(((URL) (list)), a1.b.toByteArray());
        }
        if (200 == j)
        {
            a("Batched upload completed. Hits batched", Integer.valueOf(a1.a));
            return arraylist;
        }
        a("Network error uploading hits. status code", Integer.valueOf(j));
        if (super.i.d.k().contains(Integer.valueOf(j)))
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
        v.g();
        o();
        Object obj = (ConnectivityManager)super.i.a.getSystemService("connectivity");
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
