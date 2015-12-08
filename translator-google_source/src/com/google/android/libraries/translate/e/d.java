// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.e;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.libraries.translate.core.Singleton;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.zip.GZIPInputStream;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicHeader;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;

// Referenced classes of package com.google.android.libraries.translate.e:
//            e, o

public final class d
{

    static boolean a = false;
    private static final String b = "phone";
    private static final String c = "tablet";
    private static String d = null;
    private static String e[] = null;
    private static String f[] = null;
    private static HttpClient g;

    public static long a(InputStream inputstream, OutputStream outputstream)
    {
        byte abyte0[] = new byte[4096];
        long l = 0L;
_L2:
        int i = inputstream.read(abyte0);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        outputstream.write(abyte0, 0, i);
        l += i;
        if (true) goto _L2; else goto _L1
_L1:
        a(((Closeable) (outputstream)));
        a(((Closeable) (inputstream)));
        return l;
        Exception exception;
        exception;
        a(((Closeable) (outputstream)));
        a(((Closeable) (inputstream)));
        throw exception;
    }

    public static InputStream a(HttpResponse httpresponse)
    {
        Object obj = httpresponse.getEntity();
        if (obj != null)
        {
            httpresponse = ((HttpEntity) (obj)).getContent();
            obj = ((HttpEntity) (obj)).getContentEncoding();
            if (obj != null && "gzip".equals(((Header) (obj)).getValue()))
            {
                return new GZIPInputStream(httpresponse);
            } else
            {
                return httpresponse;
            }
        } else
        {
            return null;
        }
    }

    public static String a(InputStream inputstream)
    {
        try
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            a(inputstream, ((OutputStream) (bytearrayoutputstream)));
            inputstream = bytearrayoutputstream.toString("UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return null;
        }
        return inputstream;
    }

    public static HttpClient a()
    {
        com/google/android/libraries/translate/e/d;
        JVM INSTR monitorenter ;
        HttpClient httpclient;
        if (g == null)
        {
            g = b();
        }
        httpclient = g;
        com/google/android/libraries/translate/e/d;
        JVM INSTR monitorexit ;
        return httpclient;
        Exception exception;
        exception;
        throw exception;
    }

    public static void a(String s, File file, Object obj)
    {
        FileOutputStream fileoutputstream;
        ByteArrayOutputStream bytearrayoutputstream;
        try
        {
            s = new URL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        try
        {
            s = s.openConnection();
            s.setReadTimeout(0x493e0);
            s.setConnectTimeout(50000);
            s.setRequestProperty("User-Agent", c());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        bytearrayoutputstream = new ByteArrayOutputStream(0x10000);
        try
        {
            a(((InputStream) (new BufferedInputStream(s.getInputStream(), 0x10000))), ((OutputStream) (bytearrayoutputstream)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
        obj;
        JVM INSTR monitorenter ;
        s = null;
        fileoutputstream = new FileOutputStream(file);
        s = fileoutputstream;
        bytearrayoutputstream.writeTo(fileoutputstream);
        a(((Closeable) (fileoutputstream)));
_L1:
        obj;
        JVM INSTR monitorexit ;
        return;
        s;
        fileoutputstream = null;
_L4:
        s = fileoutputstream;
        a(((Closeable) (fileoutputstream)));
        s = fileoutputstream;
        file.delete();
        a(((Closeable) (fileoutputstream)));
          goto _L1
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        file;
_L3:
        a(((Closeable) (s)));
        throw file;
        file;
        if (true) goto _L3; else goto _L2
_L2:
        s;
          goto _L4
    }

    public static void a(HttpClient httpclient)
    {
        HttpProtocolParams.setUserAgent(httpclient.getParams(), c());
    }

    public static void a(String as[])
    {
        e = as;
    }

    public static boolean a(Closeable closeable)
    {
        if (closeable != null)
        {
            try
            {
                closeable.close();
            }
            // Misplaced declaration of an exception variable
            catch (Closeable closeable)
            {
                return false;
            }
        }
        return true;
    }

    public static String b(HttpResponse httpresponse)
    {
        try
        {
            httpresponse = a(a(httpresponse));
        }
        // Misplaced declaration of an exception variable
        catch (HttpResponse httpresponse)
        {
            return null;
        }
        return httpresponse;
    }

    public static HttpClient b()
    {
        DefaultHttpClient defaulthttpclient = new DefaultHttpClient();
        HttpParams httpparams = defaulthttpclient.getParams();
        HttpConnectionParams.setSoTimeout(httpparams, 20000);
        httpparams.setParameter("http.connection-manager.factory-object", new e());
        ArrayList arraylist = new ArrayList();
        arraylist.add(new BasicHeader("Accept-Charset", "UTF-8"));
        arraylist.add(new BasicHeader("Accept-Encoding", "gzip"));
        httpparams.setParameter("http.default-headers", arraylist);
        a(defaulthttpclient);
        return defaulthttpclient;
    }

    public static void b(String as[])
    {
        f = as;
    }

    public static byte[] b(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream(0x10000);
        a(inputstream, bytearrayoutputstream);
        return bytearrayoutputstream.toByteArray();
    }

    public static String c()
    {
        if (d == null)
        {
            Pair pair = d();
            StringBuilder stringbuilder = (new StringBuilder(Singleton.d())).append("/").append((String)pair.first).append("-").append(pair.second);
            stringbuilder.append(" ").append(android.os.Build.VERSION.RELEASE);
            if (TextUtils.equals("aw", Singleton.c()))
            {
                stringbuilder.append(" wearable");
            } else
            {
                StringBuilder stringbuilder1 = stringbuilder.append(" ");
                String s;
                if (o.a())
                {
                    s = c;
                } else
                {
                    s = b;
                }
                stringbuilder1.append(s);
            }
            if (f != null)
            {
                String as[] = f;
                int k = as.length;
                for (int i = 0; i < k; i++)
                {
                    String s1 = as[i];
                    stringbuilder.append(" ").append(s1);
                }

            }
            if (e != null)
            {
                String as1[] = e;
                int l = as1.length;
                for (int j = 0; j < l; j++)
                {
                    String s2 = as1[j];
                    stringbuilder.append(" ").append(s2);
                }

            }
            d = stringbuilder.toString();
        }
        return d;
    }

    public static Pair d()
    {
        Object obj;
        try
        {
            obj = Singleton.a();
            obj = ((Context) (obj)).getPackageManager().getPackageInfo(((Context) (obj)).getPackageName(), 0);
            obj = Pair.create(((PackageInfo) (obj)).versionName, Integer.valueOf(((PackageInfo) (obj)).versionCode));
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return Pair.create("0.0.0", Integer.valueOf(0));
        }
        return ((Pair) (obj));
    }

    static 
    {
        a = false;
    }
}
