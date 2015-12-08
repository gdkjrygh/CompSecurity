// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.Socket;
import java.net.SocketImpl;
import java.net.SocketImplFactory;
import java.net.URL;
import java.net.URLStreamHandler;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.SSLSocketFactory;

// Referenced classes of package crittercism.android:
//            j, dx, ck, v, 
//            ad, cj, ac, y, 
//            ab, e, d

public final class i
{
    static final class a
        implements Runnable
    {

        private boolean a;
        private boolean b;
        private i c;

        public final boolean a()
        {
            return b;
        }

        public final void run()
        {
            if (a)
            {
                b = c.c();
                return;
            } else
            {
                c.b();
                return;
            }
        }

        public a(i l)
        {
            b = false;
            c = l;
            a = true;
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b d[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(crittercism/android/i$b, s);
        }

        public static b[] values()
        {
            return (b[])d.clone();
        }

        static 
        {
            a = new b("SOCKET_MONITOR", 0);
            b = new b("STREAM_MONITOR", 1);
            c = new b("NONE", 2);
            d = (new b[] {
                a, b, c
            });
        }

        private b(String s, int l)
        {
            super(s, l);
        }
    }


    public static final v.a a;
    public static b b;
    private static final List c;
    private ad d;
    private ab e;
    private ab f;
    private v g;
    private e h;
    private d i;
    private b j;
    private v.a k;

    public i(e e1, d d1)
    {
        j = b;
        k = a;
        h = e1;
        i = d1;
    }

    private static void a(String s, Throwable throwable)
    {
        synchronized (c)
        {
            c.add(throwable);
        }
        dx.c("Crittercism", s);
    }

    private static void a(javax.net.ssl.SSLSocketFactory sslsocketfactory)
    {
        SSLSocketFactory sslsocketfactory1 = SSLSocketFactory.getSocketFactory();
        crittercism.android.j.a(org/apache/http/conn/ssl/SSLSocketFactory, javax/net/ssl/SSLSocketFactory).set(sslsocketfactory1, sslsocketfactory);
    }

    private static boolean a(SocketImplFactory socketimplfactory)
    {
        Field field;
        try
        {
            field = crittercism.android.j.a(java/net/Socket, java/net/SocketImplFactory);
        }
        // Misplaced declaration of an exception variable
        catch (SocketImplFactory socketimplfactory)
        {
            a("Unable to install OPTIMZ for http connections", ((Throwable) (socketimplfactory)));
            return false;
        }
        try
        {
            field.setAccessible(true);
            field.set(null, socketimplfactory);
        }
        // Misplaced declaration of an exception variable
        catch (SocketImplFactory socketimplfactory)
        {
            a("Unable to install OPTIMZ for http connections", ((Throwable) (socketimplfactory)));
            return true;
        }
        // Misplaced declaration of an exception variable
        catch (SocketImplFactory socketimplfactory)
        {
            a("Unable to install OPTIMZ for http connections", ((Throwable) (socketimplfactory)));
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (SocketImplFactory socketimplfactory)
        {
            a("Unable to install OPTIMZ for http connections", ((Throwable) (socketimplfactory)));
            return false;
        }
        return true;
    }

    public static void d()
    {
        List list = c;
        list;
        JVM INSTR monitorenter ;
        for (Iterator iterator = c.iterator(); iterator.hasNext(); dx.a((Throwable)iterator.next())) { }
        break MISSING_BLOCK_LABEL_44;
        Exception exception;
        exception;
        throw exception;
        c.clear();
        list;
        JVM INSTR monitorexit ;
    }

    private boolean e()
    {
        a a1 = new a(this);
        Thread thread = new Thread(a1);
        thread.start();
        try
        {
            thread.join();
        }
        catch (InterruptedException interruptedexception) { }
        return a1.a();
    }

    private boolean f()
    {
        boolean flag;
        try
        {
            g = new v(k, h, i);
            flag = g.b();
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            return false;
        }
        return flag;
    }

    private static javax.net.ssl.SSLSocketFactory g()
    {
        SSLSocketFactory sslsocketfactory = SSLSocketFactory.getSocketFactory();
        return (javax.net.ssl.SSLSocketFactory)crittercism.android.j.a(org/apache/http/conn/ssl/SSLSocketFactory, javax/net/ssl/SSLSocketFactory).get(sslsocketfactory);
    }

    private boolean h()
    {
        Object obj;
        SocketImplFactory socketimplfactory;
        obj = null;
        try
        {
            socketimplfactory = (SocketImplFactory)crittercism.android.j.a(crittercism.android.j.a(java/net/Socket, java/net/SocketImplFactory), null);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a("Unable to install OPTIMZ for http connections", ((Throwable) (obj)));
            return false;
        }
        if (socketimplfactory != null) goto _L2; else goto _L1
_L1:
        obj = (SocketImpl)crittercism.android.j.a(crittercism.android.j.a(java/net/Socket, java/net/SocketImpl), new Socket());
        if (obj == null)
        {
            try
            {
                throw new ck("SocketImpl was null");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                a("Unable to install OPTIMZ for http connections", ((Throwable) (obj)));
            }
            return false;
        }
        obj = obj.getClass();
_L6:
        if (socketimplfactory == null) goto _L4; else goto _L3
_L3:
        try
        {
            obj = new ad(socketimplfactory, h, i);
            a(((SocketImplFactory) (obj)));
        }
        catch (ck ck1)
        {
            a("Unable to install OPTIMZ for http connections", ck1);
            return false;
        }
        catch (IOException ioexception)
        {
            a("Unable to install OPTIMZ for http connections", ioexception);
            return false;
        }
        d = ((ad) (obj));
        return true;
_L2:
        if (socketimplfactory instanceof ad)
        {
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        obj = new ad(((Class) (obj)), h, i);
        Socket.setSocketImplFactory(((SocketImplFactory) (obj)));
        break MISSING_BLOCK_LABEL_105;
        a("Unable to install OPTIMZ for http connections", new NullPointerException("Null SocketImpl"));
        return false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean a()
    {
        boolean flag2 = false;
        if (!ac.c())
        {
            a("Unable to install OPTMZ", ac.d());
        } else
        {
            boolean flag;
            boolean flag1;
            try
            {
                ac.e();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                dx.a("Crittercism", ((cj) (obj)).toString(), ((Throwable) (obj)));
                return false;
            }
            flag = h() | false;
            if (android.os.Build.VERSION.SDK_INT >= 19)
            {
                flag1 = flag | e();
            } else
            {
                flag1 = flag | c();
            }
            if (android.os.Build.VERSION.SDK_INT >= 17)
            {
                flag1 |= y.a(h, i);
            }
            if (j == b.a)
            {
                Object obj = HttpsURLConnection.getDefaultSSLSocketFactory();
                if (obj instanceof ab)
                {
                    e = (ab)obj;
                } else
                {
                    e = new ab(((javax.net.ssl.SSLSocketFactory) (obj)), h, i);
                    HttpsURLConnection.setDefaultSSLSocketFactory(e);
                }
                return flag1 | true;
            }
            flag2 = flag1;
            if (j == b.b)
            {
                return flag1 | f();
            }
        }
        return flag2;
    }

    public final void b()
    {
        try
        {
            javax.net.ssl.SSLSocketFactory sslsocketfactory = g();
            if (sslsocketfactory instanceof ab)
            {
                a(((ab)sslsocketfactory).a());
            }
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            a("Unable to install OPTIMZ for SSL HttpClient connections", illegalargumentexception);
            return;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            a("Unable to install OPTIMZ for SSL HttpClient connections", illegalaccessexception);
            return;
        }
        catch (ck ck1)
        {
            a("Unable to install OPTIMZ for SSL HttpClient connections", ck1);
            return;
        }
        f = null;
    }

    public final boolean c()
    {
        Object obj;
        try
        {
            obj = g();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a("Unable to install OPTIMZ for SSL HttpClient connections", ((Throwable) (obj)));
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a("Unable to install OPTIMZ for SSL HttpClient connections", ((Throwable) (obj)));
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a("Unable to install OPTIMZ for SSL HttpClient connections", ((Throwable) (obj)));
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a("Unable to install OPTIMZ for SSL HttpClient connections", ((Throwable) (obj)));
            return false;
        }
        if (obj == null)
        {
            a("Unable to install OPTIMZ for SSL HttpClient connections", new NullPointerException("Delegate factory was null"));
        } else
        if (!(obj instanceof ab))
        {
            obj = new ab(((javax.net.ssl.SSLSocketFactory) (obj)), h, i);
            try
            {
                a(((javax.net.ssl.SSLSocketFactory) (obj)));
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                a("Unable to install OPTIMZ for SSL HttpClient connections", illegalargumentexception);
                return false;
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                a("Unable to install OPTIMZ for SSL HttpClient connections", illegalaccessexception);
                return false;
            }
            catch (ck ck1)
            {
                a("Unable to install OPTIMZ for SSL HttpClient connections", ck1);
                return false;
            }
            f = ((ab) (obj));
            return true;
        }
        return false;
    }

    static 
    {
        a = v.a.b;
        b = b.c;
        c = new LinkedList();
        URL url = new URL("https://www.google.com");
        if (((URLStreamHandler)crittercism.android.j.a(crittercism.android.j.a(java/net/URL, java/net/URLStreamHandler), url)).getClass().getName().contains("okhttp") && android.os.Build.VERSION.SDK_INT >= 19)
        {
            b = b.a;
            break MISSING_BLOCK_LABEL_89;
        }
        try
        {
            b = b.b;
        }
        catch (Exception exception)
        {
            b = b.c;
        }
    }
}
