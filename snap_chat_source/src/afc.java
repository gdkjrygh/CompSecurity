// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.KeyManagementException;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContextSpi;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSessionContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public final class afc extends SSLContextSpi
{

    private static Method a[];
    private static boolean b;
    private SSLContextSpi c;
    private abW d;
    private abv e;
    private aaA f;

    private afc()
    {
    }

    private afc(SSLContextSpi sslcontextspi, abW abw, abv abv, aaA aaa)
    {
        c = sslcontextspi;
        d = abw;
        e = abv;
        f = aaa;
    }

    public static afc a(SSLContextSpi sslcontextspi, abW abw, abv abv, aaA aaa)
    {
        if (!b)
        {
            return null;
        } else
        {
            return new afc(sslcontextspi, abw, abv, aaa);
        }
    }

    private transient Object a(int i, Object aobj[])
    {
        if (c == null)
        {
            return null;
        }
        try
        {
            aobj = ((Object []) (a[i].invoke(c, aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            throw new aaB(((Throwable) (aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            throw new aaB(((Throwable) (aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            Throwable throwable = ((InvocationTargetException) (aobj)).getTargetException();
            if (throwable == null)
            {
                throw new aaB(((Throwable) (aobj)));
            }
            if (throwable instanceof Exception)
            {
                throw (Exception)throwable;
            }
            if (throwable instanceof Error)
            {
                throw (Error)throwable;
            } else
            {
                throw new aaB(((Throwable) (aobj)));
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            throw new aaB(((Throwable) (aobj)));
        }
        return ((Object) (aobj));
    }

    private transient Object a(Object aobj[])
    {
        try
        {
            aobj = ((Object []) (a(6, aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            throw aobj;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            throw aobj;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            throw new aaB(((Throwable) (aobj)));
        }
        return ((Object) (aobj));
    }

    public static boolean a()
    {
        return b;
    }

    private transient Object b(int i, Object aobj[])
    {
        try
        {
            aobj = ((Object []) (a(i, aobj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            throw aobj;
        }
        // Misplaced declaration of an exception variable
        catch (Object aobj[])
        {
            throw new aaB(((Throwable) (aobj)));
        }
        return ((Object) (aobj));
    }

    protected final SSLEngine engineCreateSSLEngine()
    {
        return (SSLEngine)b(0, new Object[0]);
    }

    protected final SSLEngine engineCreateSSLEngine(String s, int i)
    {
        return (SSLEngine)b(1, new Object[] {
            s, Integer.valueOf(i)
        });
    }

    protected final SSLSessionContext engineGetClientSessionContext()
    {
        return (SSLSessionContext)b(2, new Object[0]);
    }

    protected final SSLSessionContext engineGetServerSessionContext()
    {
        return (SSLSessionContext)b(3, new Object[0]);
    }

    protected final SSLServerSocketFactory engineGetServerSocketFactory()
    {
        return (SSLServerSocketFactory)b(4, new Object[0]);
    }

    protected final SSLSocketFactory engineGetSocketFactory()
    {
        SSLSocketFactory sslsocketfactory = (SSLSocketFactory)b(5, new Object[0]);
        Object obj = sslsocketfactory;
        if (sslsocketfactory != null)
        {
            try
            {
                obj = new afd(sslsocketfactory, d, e, f);
            }
            catch (ThreadDeath threaddeath)
            {
                throw threaddeath;
            }
            catch (Throwable throwable)
            {
                abk.a(throwable);
                return sslsocketfactory;
            }
        }
        return ((SSLSocketFactory) (obj));
    }

    protected final void engineInit(KeyManager akeymanager[], TrustManager atrustmanager[], SecureRandom securerandom)
    {
        a(new Object[] {
            akeymanager, atrustmanager, securerandom
        });
    }

    public final boolean equals(Object obj)
    {
        return c.equals(obj);
    }

    public final int hashCode()
    {
        return c.hashCode();
    }

    public final String toString()
    {
        return c.toString();
    }

    static 
    {
        a = new Method[7];
        b = false;
        Method amethod[];
        a[0] = javax/net/ssl/SSLContextSpi.getDeclaredMethod("engineCreateSSLEngine", new Class[0]);
        a[1] = javax/net/ssl/SSLContextSpi.getDeclaredMethod("engineCreateSSLEngine", new Class[] {
            java/lang/String, Integer.TYPE
        });
        a[2] = javax/net/ssl/SSLContextSpi.getDeclaredMethod("engineGetClientSessionContext", new Class[0]);
        a[3] = javax/net/ssl/SSLContextSpi.getDeclaredMethod("engineGetServerSessionContext", new Class[0]);
        a[4] = javax/net/ssl/SSLContextSpi.getDeclaredMethod("engineGetServerSocketFactory", new Class[0]);
        a[5] = javax/net/ssl/SSLContextSpi.getDeclaredMethod("engineGetSocketFactory", new Class[0]);
        a[6] = javax/net/ssl/SSLContextSpi.getDeclaredMethod("engineInit", new Class[] {
            [Ljavax/net/ssl/KeyManager;, [Ljavax/net/ssl/TrustManager;, java/security/SecureRandom
        });
        amethod = a;
        int i = 0;
_L2:
        if (i >= amethod.length)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        Method method;
        method = amethod[i];
        if (method == null)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        method.setAccessible(true);
        break MISSING_BLOCK_LABEL_247;
        try
        {
            afc afc1 = new afc(new afc(), null, null, null);
            afc1.engineCreateSSLEngine();
            afc1.engineCreateSSLEngine(null, 0);
            afc1.engineGetClientSessionContext();
            afc1.engineGetServerSessionContext();
            afc1.engineGetServerSocketFactory();
            afc1.engineGetSocketFactory();
            afc1.engineInit(null, null, null);
            b = true;
            return;
        }
        catch (Throwable throwable)
        {
            b = false;
        }
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
