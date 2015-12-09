// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.Socket;
import java.net.SocketImpl;
import java.net.SocketImplFactory;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.ssl.SSLSocketFactory;

// Referenced classes of package b.a:
//            eu, de, oh, pz, 
//            qb, px, gt, fg, 
//            da

public final class ne
{

    private static final List a = new LinkedList();
    private qb b;
    private pz c;
    private pz d;
    private gt e;
    private fg f;
    private da g;

    public ne(gt gt, fg fg, da da)
    {
        e = gt;
        f = fg;
        g = da;
    }

    private static void a(String s, Throwable throwable)
    {
        synchronized (a)
        {
            a.add(throwable);
        }
        eu.c(s);
    }

    private static boolean a(SocketImplFactory socketimplfactory)
    {
        Field field;
        try
        {
            field = oh.a(java/net/Socket, java/net/SocketImplFactory, true);
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

    public static void b()
    {
        List list = a;
        list;
        JVM INSTR monitorenter ;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); eu.a((Throwable)iterator.next())) { }
        break MISSING_BLOCK_LABEL_44;
        Exception exception;
        exception;
        throw exception;
        a.clear();
        list;
        JVM INSTR monitorexit ;
    }

    private boolean c()
    {
        javax.net.ssl.SSLSocketFactory sslsocketfactory = HttpsURLConnection.getDefaultSSLSocketFactory();
        if (sslsocketfactory instanceof pz)
        {
            c = (pz)sslsocketfactory;
            return true;
        }
        try
        {
            c = new pz(sslsocketfactory, e, f, g);
        }
        catch (de de1)
        {
            a("Unable to install OPTIMZ for javax.net.ssl.SSLSocket connections", de1);
            return false;
        }
        HttpsURLConnection.setDefaultSSLSocketFactory(c);
        return true;
    }

    private boolean d()
    {
        Object obj;
        try
        {
            obj = SSLSocketFactory.getSocketFactory();
            obj = (javax.net.ssl.SSLSocketFactory)oh.a(org/apache/http/conn/ssl/SSLSocketFactory, javax/net/ssl/SSLSocketFactory, true).get(obj);
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
            return false;
        }
        if (obj instanceof pz)
        {
            return false;
        }
        try
        {
            obj = new pz(((javax.net.ssl.SSLSocketFactory) (obj)), e, f, g);
        }
        catch (de de1)
        {
            a("Unable to install OPTIMZ for javax.net.ssl.SSLSocket connections", de1);
            de1 = null;
        }
        try
        {
            SSLSocketFactory sslsocketfactory = SSLSocketFactory.getSocketFactory();
            oh.a(org/apache/http/conn/ssl/SSLSocketFactory, javax/net/ssl/SSLSocketFactory, true).set(sslsocketfactory, obj);
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
        catch (de de2)
        {
            a("Unable to install OPTIMZ for SSL HttpClient connections", de2);
            return false;
        }
        d = ((pz) (obj));
        return true;
    }

    private boolean e()
    {
        Object obj;
        SocketImplFactory socketimplfactory;
        obj = null;
        try
        {
            socketimplfactory = (SocketImplFactory)oh.a(oh.a(java/net/Socket, java/net/SocketImplFactory, true), null);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a("Unable to install OPTIMZ for http connections", ((Throwable) (obj)));
            return false;
        }
        if (socketimplfactory != null) goto _L2; else goto _L1
_L1:
        obj = (SocketImpl)oh.a(oh.a(java/net/Socket, java/net/SocketImpl, true), new Socket());
        if (obj == null)
        {
            try
            {
                throw new de("SocketImpl was null");
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
            obj = new qb(socketimplfactory, e, f);
            a(((SocketImplFactory) (obj)));
        }
        catch (de de1)
        {
            a("Unable to install OPTIMZ for http connections", de1);
            return false;
        }
        catch (IOException ioexception)
        {
            a("Unable to install OPTIMZ for http connections", ioexception);
            return false;
        }
        b = ((qb) (obj));
        return true;
_L2:
        if (socketimplfactory instanceof qb)
        {
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        obj = new qb(((Class) (obj)), e, f, g);
        Socket.setSocketImplFactory(((SocketImplFactory) (obj)));
        break MISSING_BLOCK_LABEL_107;
        a("Unable to install OPTIMZ for http connections", new NullPointerException("Null SocketImpl"));
        return false;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean a()
    {
        Throwable throwable = pz.a();
        if (throwable != null)
        {
            a("Unable to install service monitoring", throwable);
            return false;
        }
        boolean flag1 = e() | false | d();
        boolean flag = flag1;
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            flag = flag1 | px.a(e, f, g);
        }
        return flag | c();
    }

}
