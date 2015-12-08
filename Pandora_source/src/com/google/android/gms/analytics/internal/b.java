// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzht;
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
//            zzd, zzal, c, zze, 
//            zzb, zzaa, zzq, zzae, 
//            zzl, zzn

class b extends zzd
{
    private class a
    {

        final b a;
        private int b;
        private ByteArrayOutputStream c;

        public int a()
        {
            return b;
        }

        public boolean a(zzaa zzaa1)
        {
            zzv.zzr(zzaa1);
            if (b + 1 > a.zzgI().zzib())
            {
                return false;
            }
            String s = a.a(zzaa1, false);
            if (s == null)
            {
                a.zzgH().zza(zzaa1, "Error formatting hit");
                return true;
            }
            byte abyte0[] = s.getBytes();
            int j = abyte0.length;
            if (j > a.zzgI().zzhT())
            {
                a.zzgH().zza(zzaa1, "Hit size exceeds the maximum size limit");
                return true;
            }
            int i = j;
            if (c.size() > 0)
            {
                i = j + 1;
            }
            if (i + c.size() > a.zzgI().zzhV())
            {
                return false;
            }
            try
            {
                if (c.size() > 0)
                {
                    c.write(b.b());
                }
                c.write(abyte0);
            }
            // Misplaced declaration of an exception variable
            catch (zzaa zzaa1)
            {
                a.zze("Failed to write payload when batching hits", zzaa1);
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
            a = b.this;
            super();
            c = new ByteArrayOutputStream();
        }
    }


    private static final byte c[] = "\n".getBytes();
    private final String a;
    private final c b;

    b(zze zze1)
    {
        super(zze1);
        a = a("GoogleAnalytics", "4.5.0", android.os.Build.VERSION.RELEASE, zzal.zza(Locale.getDefault()), Build.MODEL, Build.ID);
        b = new c(zze1.zzgG());
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
        zzv.zzr(url);
        zzv.zzr(abyte0);
        zzb("POST bytes, url", Integer.valueOf(abyte0.length), url);
        if (zzgQ())
        {
            zza("Post payload\n", new String(abyte0));
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
        zzfZ().zzgB();
        url = outputstream1;
        url1 = url2;
        outputstream = outputstream1;
        zzb("POST status", Integer.valueOf(j));
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
                zze("Error closing http post connection output stream", url);
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
        zzd("Network POST connection error", abyte0);
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
                zze("Error closing http post connection output stream", url);
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
                zze("Error closing http post connection output stream", url);
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

    private URL a(zzaa zzaa1, String s)
    {
        if (zzaa1.zziR())
        {
            zzaa1 = (new StringBuilder()).append(zzgI().zzid()).append(zzgI().zzif()).append("?").append(s).toString();
        } else
        {
            zzaa1 = (new StringBuilder()).append(zzgI().zzie()).append(zzgI().zzif()).append("?").append(s).toString();
        }
        try
        {
            zzaa1 = new URL(zzaa1);
        }
        // Misplaced declaration of an exception variable
        catch (zzaa zzaa1)
        {
            zze("Error trying to parse the hardcoded host url", zzaa1);
            return null;
        }
        return zzaa1;
    }

    private void a(StringBuilder stringbuilder, String s, String s1)
        throws UnsupportedEncodingException
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
        throws IOException
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
        zze("Error closing http connection input stream", httpurlconnection);
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
                zze("Error closing http connection input stream", ioexception);
            }
        }
        throw httpurlconnection;
    }

    private boolean a(zzaa zzaa1)
    {
        String s;
        zzv.zzr(zzaa1);
        boolean flag;
        if (!zzaa1.zziR())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = a(zzaa1, flag);
        if (s != null) goto _L2; else goto _L1
_L1:
        zzgH().zza(zzaa1, "Error formatting hit for upload");
_L4:
        return true;
_L2:
        if (s.length() > zzgI().zzhS())
        {
            break; /* Loop/switch isn't completed */
        }
        zzaa1 = a(zzaa1, s);
        if (zzaa1 == null)
        {
            zzaJ("Failed to build collect GET endpoint url");
            return false;
        }
        if (b(zzaa1) != 200)
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        String s1 = a(zzaa1, false);
        if (s1 == null)
        {
            zzgH().zza(zzaa1, "Error formatting hit for POST upload");
            return true;
        }
        byte abyte0[] = s1.getBytes();
        if (abyte0.length > zzgI().zzhU())
        {
            zzgH().zza(zzaa1, "Hit payload exceeds size limit");
            return true;
        }
        zzaa1 = b(zzaa1);
        if (zzaa1 == null)
        {
            zzaJ("Failed to build collect POST endpoint url");
            return false;
        }
        if (a(((URL) (zzaa1)), abyte0) != 200)
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
        zzv.zzr(url);
        zzb("GET request", url);
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
        zzfZ().zzgB();
        url1 = url;
        url2 = url;
        zzb("GET status", Integer.valueOf(j));
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
        zzd("Network GET connection error", url);
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
        zzv.zzr(url);
        zzv.zzr(abyte0);
        byte abyte1[];
        abyte1 = a(abyte0);
        zza("POST compressed size, ratio %, url", Integer.valueOf(abyte1.length), Long.valueOf((100L * (long)abyte1.length) / (long)abyte0.length), url);
        if (abyte1.length > abyte0.length)
        {
            zzc("Compressed payload is larger then uncompressed. compressed, uncompressed", Integer.valueOf(abyte1.length), Integer.valueOf(abyte0.length));
        }
        if (zzgQ())
        {
            zza("Post payload", (new StringBuilder()).append("\n").append(new String(abyte0)).toString());
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
        zzfZ().zzgB();
        zzb("POST status", Integer.valueOf(j));
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
                zze("Error closing http compressed post connection output stream", abyte0);
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
        zzd("Network compressed POST connection error", abyte0);
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
                zze("Error closing http compressed post connection output stream", abyte0);
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
                zze("Error closing http compressed post connection output stream", obj);
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

    private URL b(zzaa zzaa1)
    {
        if (zzaa1.zziR())
        {
            zzaa1 = (new StringBuilder()).append(zzgI().zzid()).append(zzgI().zzif()).toString();
        } else
        {
            zzaa1 = (new StringBuilder()).append(zzgI().zzie()).append(zzgI().zzif()).toString();
        }
        try
        {
            zzaa1 = new URL(zzaa1);
        }
        // Misplaced declaration of an exception variable
        catch (zzaa zzaa1)
        {
            zze("Error trying to parse the hardcoded host url", zzaa1);
            return null;
        }
        return zzaa1;
    }

    static byte[] b()
    {
        return c;
    }

    private String c(zzaa zzaa1)
    {
        return String.valueOf(zzaa1.zziO());
    }

    private URL c()
    {
        Object obj = (new StringBuilder()).append(zzgI().zzid()).append(zzgI().zzig()).toString();
        try
        {
            obj = new URL(((String) (obj)));
        }
        catch (MalformedURLException malformedurlexception)
        {
            zze("Error trying to parse the hardcoded host url", malformedurlexception);
            return null;
        }
        return ((URL) (obj));
    }

    String a(zzaa zzaa1, boolean flag)
    {
        StringBuilder stringbuilder;
        zzv.zzr(zzaa1);
        stringbuilder = new StringBuilder();
        try
        {
            Iterator iterator = zzaa1.zzhe().entrySet().iterator();
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
        catch (zzaa zzaa1)
        {
            zze("Failed to encode name or value", zzaa1);
            return null;
        }
        a(stringbuilder, "ht", String.valueOf(zzaa1.zziP()));
        a(stringbuilder, "qt", String.valueOf(zzgG().currentTimeMillis() - zzaa1.zziP()));
        if (zzgI().zzhP())
        {
            a(stringbuilder, "_gmsv", zzfZ().zzgy());
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        long l = zzaa1.zziS();
        if (l == 0L) goto _L4; else goto _L3
_L3:
        zzaa1 = String.valueOf(l);
_L6:
        a(stringbuilder, "z", ((String) (zzaa1)));
_L2:
        return stringbuilder.toString();
_L4:
        zzaa1 = c(zzaa1);
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
            url.setConnectTimeout(zzgI().zzis());
            url.setReadTimeout(zzgI().zzit());
            url.setInstanceFollowRedirects(false);
            url.setRequestProperty("User-Agent", a);
            url.setDoInput(true);
            return url;
        }
    }

    public List a(List list)
    {
        boolean flag2 = true;
        zzgF();
        zzgR();
        zzv.zzr(list);
        boolean flag1;
        if (zzgI().zzij().isEmpty() || !b.a(zzgI().zzic() * 1000L))
        {
            flag2 = false;
            flag1 = false;
        } else
        {
            boolean flag;
            if (zzgI().zzih() != zzl.zzGD)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag;
            if (zzgI().zzii() != zzn.zzGP)
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
        zzv.zzQ(flag1);
        zza("Uploading batched hits. compression, count", Boolean.valueOf(flag), Integer.valueOf(list.size()));
        a1 = new a();
        arraylist = new ArrayList();
        list = list.iterator();
label0:
        do
        {
            zzaa zzaa1;
label1:
            {
                if (list.hasNext())
                {
                    zzaa1 = (zzaa)list.next();
                    if (a1.a(zzaa1))
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
            arraylist.add(Long.valueOf(zzaa1.zziO()));
        } while (true);
        list = c();
        if (list == null)
        {
            zzaJ("Failed to build batching endpoint url");
            return Collections.emptyList();
        }
        int i;
        if (flag)
        {
            i = b(list, a1.b());
        } else
        {
            i = a(((URL) (list)), a1.b());
        }
        if (200 == i)
        {
            zza("Batched upload completed. Hits batched", Integer.valueOf(a1.a()));
            return arraylist;
        }
        zza("Network error uploading hits. status code", Integer.valueOf(i));
        if (zzgI().zzij().contains(Integer.valueOf(i)))
        {
            zzaI("Server instructed the client to stop batching");
            b.a();
        }
        return Collections.emptyList();
    }

    public boolean a()
    {
        zzgF();
        zzgR();
        Object obj = (ConnectivityManager)getContext().getSystemService("connectivity");
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
            zzaF("No network connectivity");
            return false;
        } else
        {
            return true;
        }
    }

    List b(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        list = list.iterator();
        do
        {
            zzaa zzaa1;
label0:
            {
                if (list.hasNext())
                {
                    zzaa1 = (zzaa)list.next();
                    if (a(zzaa1))
                    {
                        break label0;
                    }
                }
                return arraylist;
            }
            arraylist.add(Long.valueOf(zzaa1.zziO()));
            if (arraylist.size() >= zzgI().zzia())
            {
                return arraylist;
            }
        } while (true);
    }

    protected void zzgb()
    {
        zza("Network initialized. User agent", a);
    }

}
