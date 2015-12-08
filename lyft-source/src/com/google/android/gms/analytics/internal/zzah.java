// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlb;
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
//            zzd, zze, zzam, zzaj, 
//            zzf, zzb, zzab, zzr, 
//            zzaf, zzm, zzo

class zzah extends zzd
{

    private static final byte c[] = "\n".getBytes();
    private final String a;
    private final zzaj b;

    zzah(zzf zzf1)
    {
        super(zzf1);
        a = a("GoogleAnalytics", zze.a, android.os.Build.VERSION.RELEASE, zzam.a(Locale.getDefault()), Build.MODEL, Build.ID);
        b = new zzaj(zzf1.d());
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
        zzu.a(url);
        zzu.a(abyte0);
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
        int j = url2.getResponseCode();
        if (j != 200)
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
        b("POST status", Integer.valueOf(j));
        int i;
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
        i = j;
        if (url2 != null)
        {
            url2.disconnect();
            i = j;
        }
_L2:
        return i;
        abyte0;
        url2 = null;
_L5:
        url = outputstream;
        url1 = url2;
        d("Network POST connection error", abyte0);
        i = 0;
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

    private static String a(String s, String s1, String s2, String s3, String s4, String s5)
    {
        return String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", new Object[] {
            s, s1, s2, s3, s4, s5
        });
    }

    private URL a(zzab zzab1, String s)
    {
        if (zzab1.f())
        {
            zzab1 = (new StringBuilder()).append(q().o()).append(q().q()).append("?").append(s).toString();
        } else
        {
            zzab1 = (new StringBuilder()).append(q().p()).append(q().q()).append("?").append(s).toString();
        }
        try
        {
            zzab1 = new URL(zzab1);
        }
        // Misplaced declaration of an exception variable
        catch (zzab zzab1)
        {
            e("Error trying to parse the hardcoded host url", zzab1);
            return null;
        }
        return zzab1;
    }

    private void a(StringBuilder stringbuilder, String s, String s1)
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

    private boolean a(zzab zzab1)
    {
        String s;
        zzu.a(zzab1);
        boolean flag;
        if (!zzab1.f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = a(zzab1, flag);
        if (s != null) goto _L2; else goto _L1
_L1:
        p().a(zzab1, "Error formatting hit for upload");
_L4:
        return true;
_L2:
        if (s.length() > q().d())
        {
            break; /* Loop/switch isn't completed */
        }
        zzab1 = a(zzab1, s);
        if (zzab1 == null)
        {
            f("Failed to build collect GET endpoint url");
            return false;
        }
        if (b(zzab1) != 200)
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        String s1 = a(zzab1, false);
        if (s1 == null)
        {
            p().a(zzab1, "Error formatting hit for POST upload");
            return true;
        }
        byte abyte0[] = s1.getBytes();
        if (abyte0.length > q().f())
        {
            p().a(zzab1, "Hit payload exceeds size limit");
            return true;
        }
        zzab1 = b(zzab1);
        if (zzab1 == null)
        {
            f("Failed to build collect POST endpoint url");
            return false;
        }
        if (a(((URL) (zzab1)), abyte0) != 200)
        {
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private static byte[] a(byte abyte0[])
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
        zzu.a(url);
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
        int j = url.getResponseCode();
        if (j != 200)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        url1 = url;
        url2 = url;
        t().h();
        url1 = url;
        url2 = url;
        b("GET status", Integer.valueOf(j));
        int i;
        i = j;
        if (url != null)
        {
            url.disconnect();
            i = j;
        }
_L2:
        return i;
        url;
        url2 = url1;
        d("Network GET connection error", url);
        i = 0;
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
        zzu.a(url);
        zzu.a(abyte0);
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
        int j;
        a(url);
        j = url.getResponseCode();
        if (j != 200)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        t().h();
        b("POST status", Integer.valueOf(j));
        int i;
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
        i = j;
        if (url != null)
        {
            url.disconnect();
            i = j;
        }
_L2:
        return i;
        abyte0;
        url = null;
_L5:
        d("Network compressed POST connection error", abyte0);
        i = 0;
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

    private URL b(zzab zzab1)
    {
        if (zzab1.f())
        {
            zzab1 = (new StringBuilder()).append(q().o()).append(q().q()).toString();
        } else
        {
            zzab1 = (new StringBuilder()).append(q().p()).append(q().q()).toString();
        }
        try
        {
            zzab1 = new URL(zzab1);
        }
        // Misplaced declaration of an exception variable
        catch (zzab zzab1)
        {
            e("Error trying to parse the hardcoded host url", zzab1);
            return null;
        }
        return zzab1;
    }

    private String c(zzab zzab1)
    {
        return String.valueOf(zzab1.c());
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

    String a(zzab zzab1, boolean flag)
    {
        StringBuilder stringbuilder;
        zzu.a(zzab1);
        stringbuilder = new StringBuilder();
        try
        {
            Iterator iterator = zzab1.b().entrySet().iterator();
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
        catch (zzab zzab1)
        {
            e("Failed to encode name or value", zzab1);
            return null;
        }
        a(stringbuilder, "ht", String.valueOf(zzab1.d()));
        a(stringbuilder, "qt", String.valueOf(n().a() - zzab1.d()));
        if (q().a())
        {
            a(stringbuilder, "_gmsv", zze.a);
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        long l = zzab1.g();
        if (l == 0L) goto _L4; else goto _L3
_L3:
        zzab1 = String.valueOf(l);
_L6:
        a(stringbuilder, "z", ((String) (zzab1)));
_L2:
        return stringbuilder.toString();
_L4:
        zzab1 = c(zzab1);
        if (true) goto _L6; else goto _L5
_L5:
    }

    HttpURLConnection a(URL url)
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
        zzu.a(list);
        boolean flag1;
        if (q().u().isEmpty() || !b.a(q().n() * 1000L))
        {
            flag2 = false;
            flag1 = false;
        } else
        {
            boolean flag;
            if (q().s() != zzm.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag;
            if (q().t() != zzo.b)
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
        zza zza1;
        ArrayList arraylist;
        boolean flag1;
        if (!list.isEmpty())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        zzu.b(flag1);
        a("Uploading batched hits. compression, count", Boolean.valueOf(flag), Integer.valueOf(list.size()));
        zza1 = new zza();
        arraylist = new ArrayList();
        list = list.iterator();
label0:
        do
        {
            zzab zzab1;
label1:
            {
                if (list.hasNext())
                {
                    zzab1 = (zzab)list.next();
                    if (zza1.a(zzab1))
                    {
                        break label1;
                    }
                }
                if (zza1.a() == 0)
                {
                    return arraylist;
                }
                break label0;
            }
            arraylist.add(Long.valueOf(zzab1.c()));
        } while (true);
        list = d();
        if (list == null)
        {
            f("Failed to build batching endpoint url");
            return Collections.emptyList();
        }
        int i;
        if (flag)
        {
            i = b(list, zza1.b());
        } else
        {
            i = a(((URL) (list)), zza1.b());
        }
        if (200 == i)
        {
            a("Batched upload completed. Hits batched", Integer.valueOf(zza1.a()));
            return arraylist;
        }
        a("Network error uploading hits. status code", Integer.valueOf(i));
        if (q().u().contains(Integer.valueOf(i)))
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
            zzab zzab1;
label0:
            {
                if (list.hasNext())
                {
                    zzab1 = (zzab)list.next();
                    if (a(zzab1))
                    {
                        break label0;
                    }
                }
                return arraylist;
            }
            arraylist.add(Long.valueOf(zzab1.c()));
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


    private class zza
    {

        final zzah a;
        private int b;
        private ByteArrayOutputStream c;

        public int a()
        {
            return b;
        }

        public boolean a(zzab zzab1)
        {
            zzu.a(zzab1);
            if (b + 1 > a.q().m())
            {
                return false;
            }
            String s = a.a(zzab1, false);
            if (s == null)
            {
                a.p().a(zzab1, "Error formatting hit");
                return true;
            }
            byte abyte0[] = s.getBytes();
            int j = abyte0.length;
            if (j > a.q().e())
            {
                a.p().a(zzab1, "Hit size exceeds the maximum size limit");
                return true;
            }
            int i = j;
            if (c.size() > 0)
            {
                i = j + 1;
            }
            if (i + c.size() > a.q().g())
            {
                return false;
            }
            try
            {
                if (c.size() > 0)
                {
                    c.write(zzah.c());
                }
                c.write(abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (zzab zzab1)
            {
                a.e("Failed to write payload when batching hits", zzab1);
                return true;
            }
            b = b + 1;
            return true;
        }

        public byte[] b()
        {
            return c.toByteArray();
        }

        public zza()
        {
            a = zzah.this;
            super();
            c = new ByteArrayOutputStream();
        }
    }

}
