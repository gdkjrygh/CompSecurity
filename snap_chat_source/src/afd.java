// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

public final class afd extends SSLSocketFactory
{

    private static final String b[] = {
        "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl", "com.android.org.conscrypt.SSLParametersImpl"
    };
    private static final String c[] = {
        "org.apache.harmony.xnet.provider.jsse.OpenSSLSocketFactoryImpl", "com.android.org.conscrypt.OpenSSLSocketFactoryImpl"
    };
    private static Class d;
    private static Throwable e = null;
    SSLSocketFactory a;
    private abW f;
    private abv g;
    private aaA h;
    private Object i;

    public afd(SSLSocketFactory sslsocketfactory, abW abw, abv abv, aaA aaa)
    {
        a(sslsocketfactory.getClass());
        a = sslsocketfactory;
        f = abw;
        g = abv;
        h = aaa;
        i = b();
    }

    public static Throwable a()
    {
        return e;
    }

    private Socket a(Socket socket, Class aclass[], Object aobj[])
    {
        try
        {
            aclass = b(socket, aclass, aobj);
        }
        // Misplaced declaration of an exception variable
        catch (Socket socket)
        {
            throw socket;
        }
        // Misplaced declaration of an exception variable
        catch (Class aclass[])
        {
            abk.a(aclass);
            return socket;
        }
        return aclass;
    }

    private static void a(Class class1)
    {
        String as[];
        int j;
        boolean flag1;
        flag1 = false;
        as = c;
        j = 0;
_L2:
        Object obj;
        boolean flag;
        flag = flag1;
        if (j >= 2)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        obj = as[j];
        obj = Class.forName(((String) (obj)));
        if (!((Class) (obj)).isAssignableFrom(class1))
        {
            break MISSING_BLOCK_LABEL_54;
        }
        flag = true;
        ClassNotFoundException classnotfoundexception;
        if (!flag)
        {
            throw new aaC("Unrecognized SSLSocketFactory class.");
        } else
        {
            return;
        }
        classnotfoundexception;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private Object b()
    {
        Object obj;
        try
        {
            obj = aeu.a(a.getClass(), d, false);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            abk.a(((Throwable) (obj)));
            obj = null;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = aeu.a(((java.lang.reflect.Field) (obj)), a);
_L4:
        Object obj1 = obj;
        if (obj != null)
        {
            try
            {
                obj1 = d.getDeclaredMethod("clone", new Class[0]);
                ((Method) (obj1)).setAccessible(true);
                obj1 = ((Method) (obj1)).invoke(obj, new Object[0]);
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                abk.a(nosuchmethodexception);
                return obj;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                abk.a(illegalargumentexception);
                return obj;
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                abk.a(illegalaccessexception);
                return obj;
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                abk.a(invocationtargetexception);
                return obj;
            }
        }
        return obj1;
        obj;
        abk.a(((Throwable) (obj)));
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private Socket b(Socket socket, Class aclass[], Object aobj[])
    {
        Object obj = null;
        if (socket != null && (socket instanceof SSLSocket))
        {
            afe afe1 = new afe(f, g, (SSLSocket)socket);
            try
            {
                aclass = (Socket)h.a(socket.getClass(), afe1, aclass, aobj);
            }
            // Misplaced declaration of an exception variable
            catch (Class aclass[])
            {
                abk.a(aclass);
                aclass = obj;
            }
            // Misplaced declaration of an exception variable
            catch (Class aclass[])
            {
                abk.a(aclass);
                aclass = obj;
            }
            if (aclass != null)
            {
                ((SSLSocket)aclass).setSSLParameters(((SSLSocket)socket).getSSLParameters());
                return aclass;
            }
        }
        return socket;
    }

    public final Socket createSocket()
    {
        Socket socket = a.createSocket();
        Class class1 = d;
        Object obj = i;
        return a(socket, new Class[] {
            class1
        }, new Object[] {
            obj
        });
    }

    public final Socket createSocket(String s, int j)
    {
        Socket socket = a.createSocket(s, j);
        Class class1 = Integer.TYPE;
        Class class2 = d;
        Object obj = i;
        return a(socket, new Class[] {
            java/lang/String, class1, class2
        }, new Object[] {
            s, Integer.valueOf(j), obj
        });
    }

    public final Socket createSocket(String s, int j, InetAddress inetaddress, int k)
    {
        Socket socket = a.createSocket(s, j, inetaddress, k);
        Class class1 = Integer.TYPE;
        Class class2 = Integer.TYPE;
        Class class3 = d;
        Object obj = i;
        return a(socket, new Class[] {
            java/lang/String, class1, java/net/InetAddress, class2, class3
        }, new Object[] {
            s, Integer.valueOf(j), inetaddress, Integer.valueOf(k), obj
        });
    }

    public final Socket createSocket(InetAddress inetaddress, int j)
    {
        Socket socket = a.createSocket(inetaddress, j);
        Class class1 = Integer.TYPE;
        Class class2 = d;
        Object obj = i;
        return a(socket, new Class[] {
            java/net/InetAddress, class1, class2
        }, new Object[] {
            inetaddress, Integer.valueOf(j), obj
        });
    }

    public final Socket createSocket(InetAddress inetaddress, int j, InetAddress inetaddress1, int k)
    {
        Socket socket = a.createSocket(inetaddress, j, inetaddress1, k);
        Class class1 = Integer.TYPE;
        Class class2 = Integer.TYPE;
        Class class3 = d;
        Object obj = i;
        return a(socket, new Class[] {
            java/net/InetAddress, class1, java/net/InetAddress, class2, class3
        }, new Object[] {
            inetaddress, Integer.valueOf(j), inetaddress1, Integer.valueOf(k), obj
        });
    }

    public final Socket createSocket(Socket socket, String s, int j, boolean flag)
    {
        Socket socket1 = a.createSocket(socket, s, j, flag);
        Class class1 = Integer.TYPE;
        Class class2 = Boolean.TYPE;
        Class class3 = d;
        Object obj = i;
        return a(socket1, new Class[] {
            java/net/Socket, java/lang/String, class1, class2, class3
        }, new Object[] {
            socket, s, Integer.valueOf(j), Boolean.valueOf(flag), obj
        });
    }

    public final String[] getDefaultCipherSuites()
    {
        return a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites()
    {
        return a.getSupportedCipherSuites();
    }

    static 
    {
        int j = 0;
        d = null;
        String as[] = b;
        while (j < 2) 
        {
            String s = as[j];
            try
            {
                d = Class.forName(s);
            }
            catch (ClassNotFoundException classnotfoundexception) { }
            j++;
        }
        if (d == null)
        {
            e = new ClassNotFoundException("Cannot find SSL Parameters class");
        }
    }
}
