// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

public final class adT
{

    private static final List d = new LinkedList();
    abW a;
    abv b;
    aaA c;
    private afd e;

    public adT(abW abw, abv abv, aaA aaa)
    {
        a = abw;
        b = abv;
        c = aaa;
    }

    static void a(Throwable throwable)
    {
        synchronized (d)
        {
            d.add(throwable);
        }
    }

    private static boolean a(SocketImplFactory socketimplfactory)
    {
        Field field;
        try
        {
            field = aeu.a(java/net/Socket, java/net/SocketImplFactory, true);
        }
        // Misplaced declaration of an exception variable
        catch (SocketImplFactory socketimplfactory)
        {
            a(((Throwable) (socketimplfactory)));
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
            a(((Throwable) (socketimplfactory)));
            return true;
        }
        // Misplaced declaration of an exception variable
        catch (SocketImplFactory socketimplfactory)
        {
            a(((Throwable) (socketimplfactory)));
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (SocketImplFactory socketimplfactory)
        {
            a(((Throwable) (socketimplfactory)));
            return false;
        }
        return true;
    }

    public static void d()
    {
        List list = d;
        list;
        JVM INSTR monitorenter ;
        for (Iterator iterator = d.iterator(); iterator.hasNext(); abk.a((Throwable)iterator.next())) { }
        break MISSING_BLOCK_LABEL_44;
        Exception exception;
        exception;
        throw exception;
        d.clear();
        list;
        JVM INSTR monitorexit ;
    }

    final boolean a()
    {
        javax.net.ssl.SSLSocketFactory sslsocketfactory = HttpsURLConnection.getDefaultSSLSocketFactory();
        if (sslsocketfactory instanceof afd)
        {
            e = (afd)sslsocketfactory;
            return true;
        }
        try
        {
            e = new afd(sslsocketfactory, a, b, c);
        }
        catch (aaC aac)
        {
            a(((Throwable) (aac)));
            return false;
        }
        HttpsURLConnection.setDefaultSSLSocketFactory(e);
        return true;
    }

    final boolean b()
    {
        Object obj;
        try
        {
            obj = SSLSocketFactory.getSocketFactory();
            obj = (javax.net.ssl.SSLSocketFactory)aeu.a(org/apache/http/conn/ssl/SSLSocketFactory, javax/net/ssl/SSLSocketFactory, true).get(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a(((Throwable) (obj)));
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a(((Throwable) (obj)));
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a(((Throwable) (obj)));
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a(((Throwable) (obj)));
            return false;
        }
        if (obj == null)
        {
            a(new NullPointerException("Delegate factory was null"));
            return false;
        }
        if (obj instanceof afd)
        {
            return false;
        }
        try
        {
            obj = new afd(((javax.net.ssl.SSLSocketFactory) (obj)), a, b, c);
        }
        catch (aaC aac)
        {
            a(aac);
            aac = null;
        }
        try
        {
            SSLSocketFactory sslsocketfactory = SSLSocketFactory.getSocketFactory();
            aeu.a(org/apache/http/conn/ssl/SSLSocketFactory, javax/net/ssl/SSLSocketFactory, true).set(sslsocketfactory, obj);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            a(illegalargumentexception);
            return false;
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            a(illegalaccessexception);
            return false;
        }
        catch (aaC aac1)
        {
            a(aac1);
            return false;
        }
        return true;
    }

    final boolean c()
    {
        Object obj;
        SocketImplFactory socketimplfactory;
        obj = null;
        try
        {
            socketimplfactory = (SocketImplFactory)aeu.a(aeu.a(java/net/Socket, java/net/SocketImplFactory, true), null);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a(((Throwable) (obj)));
            return false;
        }
        if (socketimplfactory != null) goto _L2; else goto _L1
_L1:
        obj = (SocketImpl)aeu.a(aeu.a(java/net/Socket, java/net/SocketImpl, true), new Socket());
        if (obj == null)
        {
            try
            {
                throw new aaC("SocketImpl was null");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                a(((Throwable) (obj)));
            }
            return false;
        }
        obj = obj.getClass();
_L6:
        if (socketimplfactory == null) goto _L4; else goto _L3
_L3:
        try
        {
            a(new aff(socketimplfactory, a, b));
        }
        catch (aaC aac)
        {
            a(aac);
            return false;
        }
        catch (IOException ioexception)
        {
            a(ioexception);
            return false;
        }
        return true;
_L2:
        if (socketimplfactory instanceof aff)
        {
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        Socket.setSocketImplFactory(new aff(((Class) (obj)), a, b, c));
        break MISSING_BLOCK_LABEL_101;
        a(new NullPointerException("Null SocketImpl"));
        return false;
        if (true) goto _L6; else goto _L5
_L5:
    }

}
