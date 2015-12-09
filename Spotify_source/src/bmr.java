// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.analytics.internal.zzm;
import com.google.android.gms.analytics.internal.zzo;
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

final class bmr extends bnd
{

    private static final byte c[] = "\n".getBytes();
    private final String a;
    private final bmv b;

    bmr(bnf bnf1)
    {
        super(bnf1);
        a = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] {
            "GoogleAnalytics", bne.a, android.os.Build.VERSION.RELEASE, bmz.a(Locale.getDefault()), Build.MODEL, Build.ID
        });
        b = new bmv(bnf1.c);
    }

    private int a(URL url)
    {
        URL url1;
        URL url2;
        btl.a(url);
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
        super.f.c().f();
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
        btl.a(url);
        btl.a(abyte0);
        b("POST bytes, url", Integer.valueOf(abyte0.length), url);
        if (k())
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
        super.f.c().f();
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

    private URL a(bmj bmj1)
    {
        if (bmj1.f)
        {
            bmj1 = (new StringBuilder()).append(bns.h()).append(bns.j()).toString();
        } else
        {
            bmj1 = (new StringBuilder()).append(bns.i()).append(bns.j()).toString();
        }
        try
        {
            bmj1 = new URL(bmj1);
        }
        // Misplaced declaration of an exception variable
        catch (bmj bmj1)
        {
            e("Error trying to parse the hardcoded host url", bmj1);
            return null;
        }
        return bmj1;
    }

    private URL a(bmj bmj1, String s)
    {
        if (bmj1.f)
        {
            bmj1 = (new StringBuilder()).append(bns.h()).append(bns.j()).append("?").append(s).toString();
        } else
        {
            bmj1 = (new StringBuilder()).append(bns.i()).append(bns.j()).append("?").append(s).toString();
        }
        try
        {
            bmj1 = new URL(bmj1);
        }
        // Misplaced declaration of an exception variable
        catch (bmj bmj1)
        {
            e("Error trying to parse the hardcoded host url", bmj1);
            return null;
        }
        return bmj1;
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
        obj = null;
        obj1 = null;
        btl.a(url);
        btl.a(abyte0);
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
        if (k())
        {
            a("Post payload", (new StringBuilder("\n")).append(new String(abyte0)).toString());
        }
        url = b(url);
        Exception exception;
        Exception exception1;
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
        i = url.getResponseCode();
        if (i != 200)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        super.f.c().f();
        b("POST status", Integer.valueOf(i));
        if (url != null)
        {
            url.disconnect();
        }
        return i;
        obj;
        url = null;
        abyte0 = obj1;
_L4:
        d("Network compressed POST connection error", obj);
        if (url != null)
        {
            try
            {
                url.close();
            }
            // Misplaced declaration of an exception variable
            catch (URL url)
            {
                e("Error closing http compressed post connection output stream", url);
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
                e("Error closing http compressed post connection output stream", obj);
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
    {
        url = url.openConnection();
        if (!(url instanceof HttpURLConnection))
        {
            throw new IOException("Failed to obtain http connection");
        } else
        {
            url = (HttpURLConnection)url;
            url.setDefaultUseCaches(false);
            url.setConnectTimeout(((Integer)bnz.w.a).intValue());
            url.setReadTimeout(((Integer)bnz.x.a).intValue());
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
        bmj bmj1;
        Object obj;
        boolean flag;
        if (!list.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        bmj1 = (bmj)list.next();
        btl.a(bmj1);
        boolean flag1;
        if (!bmj1.f)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        obj = a(bmj1, flag1);
        if (obj != null) goto _L2; else goto _L1
_L1:
        super.f.a().a(bmj1, "Error formatting hit for upload");
        flag = true;
_L9:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(Long.valueOf(bmj1.c));
        if (arraylist.size() < bns.f()) goto _L4; else goto _L3
_L3:
        return arraylist;
_L2:
        if (((String) (obj)).length() > ((Integer)bnz.o.a).intValue()) goto _L6; else goto _L5
_L5:
        obj = a(bmj1, ((String) (obj)));
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
        String s = a(bmj1, false);
        if (s == null)
        {
            super.f.a().a(bmj1, "Error formatting hit for POST upload");
            flag = true;
        } else
        {
label0:
            {
                abyte0 = s.getBytes();
                if (abyte0.length <= ((Integer)bnz.s.a).intValue())
                {
                    break label0;
                }
                super.f.a().a(bmj1, "Hit payload exceeds size limit");
                flag = true;
            }
        }
          goto _L9
        URL url;
        url = a(bmj1);
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
        Object obj = (new StringBuilder()).append(bns.h()).append((String)bnz.n.a).toString();
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

    final String a(bmj bmj1, boolean flag)
    {
        StringBuilder stringbuilder;
        btl.a(bmj1);
        stringbuilder = new StringBuilder();
        try
        {
            Iterator iterator = bmj1.a.entrySet().iterator();
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
        catch (bmj bmj1)
        {
            e("Failed to encode name or value", bmj1);
            return null;
        }
        a(stringbuilder, "ht", String.valueOf(bmj1.d));
        a(stringbuilder, "qt", String.valueOf(super.f.c.a() - bmj1.d));
        if (!flag) goto _L2; else goto _L1
_L1:
        long l = bmz.b(bmj1.a("_s", "0"));
        if (l == 0L) goto _L4; else goto _L3
_L3:
        bmj1 = String.valueOf(l);
_L5:
        a(stringbuilder, "z", ((String) (bmj1)));
_L2:
        return stringbuilder.toString();
_L4:
        l = bmj1.c;
        bmj1 = String.valueOf(l);
          goto _L5
    }

    public final List a(List list)
    {
        boolean flag3;
        flag3 = true;
        bnf.i();
        m();
        btl.a(list);
        if (!super.f.d.k().isEmpty() && b.a((long)((Integer)bnz.v.a).intValue() * 1000L)) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L6:
        boolean flag;
        boolean flag2;
        flag2 = false;
        flag = flag1;
_L7:
        bms bms1;
        ArrayList arraylist;
        if (!flag) goto _L4; else goto _L3
_L2:
        if (zzm.a((String)bnz.p.a) != zzm.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (zzo.a((String)bnz.q.a) != zzo.a) goto _L6; else goto _L5
_L5:
        flag2 = true;
          goto _L7
_L3:
        if (list.isEmpty())
        {
            flag3 = false;
        }
        btl.b(flag3);
        a("Uploading batched hits. compression, count", Boolean.valueOf(flag2), Integer.valueOf(list.size()));
        bms1 = new bms(this);
        arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            bmj bmj1 = (bmj)list.next();
            if (!bms1.a(bmj1))
            {
                break;
            }
            arraylist.add(Long.valueOf(bmj1.c));
        } while (true);
        if (bms1.a == 0)
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
            i = b(list, bms1.b.toByteArray());
        } else
        {
            i = a(((URL) (list)), bms1.b.toByteArray());
        }
        if (200 == i)
        {
            a("Batched upload completed. Hits batched", Integer.valueOf(bms1.a));
            return arraylist;
        }
        a("Network error uploading hits. status code", Integer.valueOf(i));
        if (super.f.d.k().contains(Integer.valueOf(i)))
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
        bnf.i();
        m();
        Object obj = (ConnectivityManager)super.f.a.getSystemService("connectivity");
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
