// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.g;

import android.content.Context;
import android.net.Proxy;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.params.ConnRouteParams;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

public class b
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(int i);
    }


    private static final String a = com/qihoo/security/g/b.getSimpleName();
    private Context b;
    private String c;
    private File d;
    private boolean e;
    private byte f[];
    private int g;
    private a h;

    public b(Context context, String s, byte abyte0[])
    {
        g = 0;
        h = null;
        b = context;
        c = s;
        f = abyte0;
        g = 1;
    }

    static int a(b b1, String s, File file)
    {
        return b1.a(s, file);
    }

    static int a(b b1, String s, byte abyte0[])
    {
        return b1.a(s, abyte0);
    }

    private int a(String s, File file)
    {
        DefaultHttpClient defaulthttpclient;
        defaulthttpclient = new DefaultHttpClient();
        boolean flag;
        if (file != null && file.exists() && file.isFile())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        int i;
        if (flag)
        {
            s = new HttpPost(s);
            file = a(file);
            if (file == null)
            {
                return 3;
            }
            file = new ByteArrayEntity(file);
            file.setContentType("application/x-www-form-urlencoded");
            ((HttpPost)s).setEntity(file);
        } else
        {
            s = new HttpGet(s);
        }
        file = a(b);
        if (file != null)
        {
            org.apache.http.params.HttpParams httpparams = defaulthttpclient.getParams();
            ConnRouteParams.setDefaultProxy(httpparams, file);
            s.setParams(httpparams);
        }
        file = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(file, 20000);
        HttpConnectionParams.setSoTimeout(file, 20000);
        s.setParams(file);
        try
        {
            i = defaulthttpclient.execute(s).getStatusLine().getStatusCode();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            s.abort();
            defaulthttpclient.getConnectionManager().shutdown();
            return 1;
        }
        finally
        {
            s.abort();
        }
        if (i == 200)
        {
            i = 0;
        } else
        {
            i = 2;
        }
        s.abort();
        defaulthttpclient.getConnectionManager().shutdown();
        return i;
        defaulthttpclient.getConnectionManager().shutdown();
        throw file;
    }

    private int a(String s, byte abyte0[])
    {
        DefaultHttpClient defaulthttpclient;
        defaulthttpclient = new DefaultHttpClient();
        int i;
        if (abyte0 != null && abyte0.length > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            s = new HttpPost(s);
            abyte0 = new ByteArrayEntity(abyte0);
            abyte0.setContentType("application/x-www-form-urlencoded");
            ((HttpPost)s).setEntity(abyte0);
        } else
        {
            s = new HttpGet(s);
        }
        abyte0 = a(b);
        if (abyte0 != null)
        {
            org.apache.http.params.HttpParams httpparams = defaulthttpclient.getParams();
            ConnRouteParams.setDefaultProxy(httpparams, abyte0);
            s.setParams(httpparams);
        }
        abyte0 = new BasicHttpParams();
        HttpConnectionParams.setConnectionTimeout(abyte0, 20000);
        HttpConnectionParams.setSoTimeout(abyte0, 20000);
        s.setParams(abyte0);
        try
        {
            i = defaulthttpclient.execute(s).getStatusLine().getStatusCode();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            s.abort();
            defaulthttpclient.getConnectionManager().shutdown();
            return 1;
        }
        finally
        {
            s.abort();
        }
        if (i == 200)
        {
            i = 0;
        } else
        {
            i = 2;
        }
        s.abort();
        defaulthttpclient.getConnectionManager().shutdown();
        return i;
        defaulthttpclient.getConnectionManager().shutdown();
        throw abyte0;
    }

    static a a(b b1)
    {
        return b1.h;
    }

    private static HttpHost a(Context context)
    {
        context = Proxy.getDefaultHost();
        int i = Proxy.getDefaultPort();
        if (context != null && context.length() > 0)
        {
            return new HttpHost(context, i);
        } else
        {
            return null;
        }
    }

    static boolean a(b b1, boolean flag)
    {
        b1.e = flag;
        return flag;
    }

    private static byte[] a(File file)
    {
        if (file != null) goto _L2; else goto _L1
_L1:
        long l;
        return null;
_L2:
        byte abyte0[];
        if ((l = file.length()) <= 0L || l > 0x200000L)
        {
            continue; /* Loop/switch isn't completed */
        }
        abyte0 = new byte[(int)l];
        file = new FileInputStream(file);
        int i = file.read(abyte0);
        Object obj;
        if ((long)i != l)
        {
            if (file != null)
            {
                try
                {
                    file.close();
                }
                // Misplaced declaration of an exception variable
                catch (File file)
                {
                    return null;
                }
                return null;
            }
        } else
        {
            if (file != null)
            {
                try
                {
                    file.close();
                }
                // Misplaced declaration of an exception variable
                catch (File file) { }
            }
            return abyte0;
        }
        if (true) goto _L1; else goto _L3
_L3:
        file;
        file = null;
_L9:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return null;
            }
            return null;
        }
        continue; /* Loop/switch isn't completed */
        file;
        file = null;
_L7:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file)
            {
                return null;
            }
            return null;
        }
        continue; /* Loop/switch isn't completed */
        obj;
        file = null;
_L5:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        throw obj;
        obj;
        if (true) goto _L5; else goto _L4
_L4:
        obj;
        if (true) goto _L7; else goto _L6
_L6:
        obj;
        if (true) goto _L9; else goto _L8
_L8:
    }

    static int b(b b1)
    {
        return b1.g;
    }

    static String c(b b1)
    {
        return b1.c;
    }

    static File d(b b1)
    {
        return b1.d;
    }

    static byte[] e(b b1)
    {
        return b1.f;
    }

    public void a(a a1)
    {
        h = a1;
    }

    public boolean a()
    {
        this;
        JVM INSTR monitorenter ;
        if (!e)
        {
            break MISSING_BLOCK_LABEL_13;
        }
        this;
        JVM INSTR monitorexit ;
        return false;
        e = true;
        this;
        JVM INSTR monitorexit ;
        (new Thread() {

            final b a;

            public void run()
            {
                if (b.a(a) != null)
                {
                    b.a(a).a();
                }
                if (b.b(a) != 0) goto _L2; else goto _L1
_L1:
                int i = b.a(a, b.c(a), b.d(a));
                if (b.a(a) != null)
                {
                    b.a(a).a(i);
                }
_L4:
                this;
                JVM INSTR monitorenter ;
                b.a(a, false);
                this;
                JVM INSTR monitorexit ;
                return;
_L2:
                if (1 == b.b(a))
                {
                    int j = b.a(a, b.c(a), b.e(a));
                    if (b.a(a) != null)
                    {
                        b.a(a).a(j);
                    }
                }
                if (true) goto _L4; else goto _L3
_L3:
                Exception exception1;
                exception1;
                this;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            
            {
                a = b.this;
                super();
            }
        }).start();
        return true;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
