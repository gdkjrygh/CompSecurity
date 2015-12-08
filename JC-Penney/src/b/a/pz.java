// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package b.a:
//            eu, de, qa, da, 
//            oh, gt, fg

public final class pz extends SSLSocketFactory
{

    private static final String a[] = {
        "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl", "com.android.org.conscrypt.SSLParametersImpl"
    };
    private static final String b[] = {
        "org.apache.harmony.xnet.provider.jsse.OpenSSLSocketFactoryImpl", "com.android.org.conscrypt.OpenSSLSocketFactoryImpl"
    };
    private static Class c;
    private static Throwable d = null;
    private SSLSocketFactory e;
    private gt f;
    private fg g;
    private da h;
    private Object i;

    public pz(SSLSocketFactory sslsocketfactory, gt gt, fg fg, da da1)
    {
        a(sslsocketfactory.getClass());
        e = sslsocketfactory;
        f = gt;
        g = fg;
        h = da1;
        i = c();
    }

    public static Throwable a()
    {
        return d;
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
            eu.a(aclass);
            return socket;
        }
        return aclass;
    }

    private static void a(Class class1)
    {
        String as[];
        int j;
        boolean flag1;
        int k;
        flag1 = false;
        as = b;
        k = as.length;
        j = 0;
_L2:
        Object obj;
        boolean flag;
        flag = flag1;
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_43;
        }
        obj = as[j];
        obj = Class.forName(((String) (obj)));
        if (!((Class) (obj)).isAssignableFrom(class1))
        {
            break MISSING_BLOCK_LABEL_59;
        }
        flag = true;
        ClassNotFoundException classnotfoundexception;
        if (!flag)
        {
            throw new de("Unrecognized SSLSocketFactory class.");
        } else
        {
            return;
        }
        classnotfoundexception;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private Socket b(Socket socket, Class aclass[], Object aobj[])
    {
        Object obj = null;
        if (socket != null && (socket instanceof SSLSocket))
        {
            qa qa1 = new qa(f, g, (SSLSocket)socket);
            try
            {
                aclass = (Socket)h.a(socket.getClass(), qa1, aclass, aobj);
            }
            // Misplaced declaration of an exception variable
            catch (Class aclass[])
            {
                eu.a(aclass);
                aclass = obj;
            }
            // Misplaced declaration of an exception variable
            catch (Class aclass[])
            {
                eu.a(aclass);
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

    private Object c()
    {
        Object obj;
        try
        {
            obj = oh.a(e.getClass(), c, false);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            eu.a(((Throwable) (obj)));
            obj = null;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = oh.a(((java.lang.reflect.Field) (obj)), e);
_L4:
        Object obj1 = obj;
        if (obj != null)
        {
            try
            {
                obj1 = c.getDeclaredMethod("clone", new Class[0]);
                ((Method) (obj1)).setAccessible(true);
                obj1 = ((Method) (obj1)).invoke(obj, new Object[0]);
            }
            catch (NoSuchMethodException nosuchmethodexception)
            {
                eu.a(nosuchmethodexception);
                return obj;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                eu.a(illegalargumentexception);
                return obj;
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                eu.a(illegalaccessexception);
                return obj;
            }
            catch (InvocationTargetException invocationtargetexception)
            {
                eu.a(invocationtargetexception);
                return obj;
            }
        }
        return obj1;
        obj;
        eu.a(((Throwable) (obj)));
_L2:
        obj = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final SSLSocketFactory b()
    {
        return e;
    }

    public final Socket createSocket()
    {
        Socket socket = e.createSocket();
        Class class1 = c;
        Object obj = i;
        return a(socket, new Class[] {
            class1
        }, new Object[] {
            obj
        });
    }

    public final Socket createSocket(String s, int j)
    {
        Socket socket = e.createSocket(s, j);
        Class class1 = Integer.TYPE;
        Class class2 = c;
        Object obj = i;
        return a(socket, new Class[] {
            java/lang/String, class1, class2
        }, new Object[] {
            s, Integer.valueOf(j), obj
        });
    }

    public final Socket createSocket(String s, int j, InetAddress inetaddress, int k)
    {
        Socket socket = e.createSocket(s, j, inetaddress, k);
        Class class1 = Integer.TYPE;
        Class class2 = Integer.TYPE;
        Class class3 = c;
        Object obj = i;
        return a(socket, new Class[] {
            java/lang/String, class1, java/net/InetAddress, class2, class3
        }, new Object[] {
            s, Integer.valueOf(j), inetaddress, Integer.valueOf(k), obj
        });
    }

    public final Socket createSocket(InetAddress inetaddress, int j)
    {
        Socket socket = e.createSocket(inetaddress, j);
        Class class1 = Integer.TYPE;
        Class class2 = c;
        Object obj = i;
        return a(socket, new Class[] {
            java/net/InetAddress, class1, class2
        }, new Object[] {
            inetaddress, Integer.valueOf(j), obj
        });
    }

    public final Socket createSocket(InetAddress inetaddress, int j, InetAddress inetaddress1, int k)
    {
        Socket socket = e.createSocket(inetaddress, j, inetaddress1, k);
        Class class1 = Integer.TYPE;
        Class class2 = Integer.TYPE;
        Class class3 = c;
        Object obj = i;
        return a(socket, new Class[] {
            java/net/InetAddress, class1, java/net/InetAddress, class2, class3
        }, new Object[] {
            inetaddress, Integer.valueOf(j), inetaddress1, Integer.valueOf(k), obj
        });
    }

    public final Socket createSocket(Socket socket, String s, int j, boolean flag)
    {
        Socket socket1 = e.createSocket(socket, s, j, flag);
        Class class1 = Integer.TYPE;
        Class class2 = Boolean.TYPE;
        Class class3 = c;
        Object obj = i;
        return a(socket1, new Class[] {
            java/net/Socket, java/lang/String, class1, class2, class3
        }, new Object[] {
            socket, s, Integer.valueOf(j), Boolean.valueOf(flag), obj
        });
    }

    public final String[] getDefaultCipherSuites()
    {
        return e.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites()
    {
        return e.getSupportedCipherSuites();
    }

    static 
    {
        int j = 0;
        c = null;
        String as[] = a;
        int k = as.length;
        while (j < k) 
        {
            String s = as[j];
            try
            {
                c = Class.forName(s);
            }
            catch (ClassNotFoundException classnotfoundexception) { }
            j++;
        }
        if (c == null)
        {
            d = new ClassNotFoundException("Cannot find SSL Parameters class");
        }
    }
}
