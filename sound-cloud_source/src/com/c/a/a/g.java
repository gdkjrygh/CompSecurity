// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a;

import c.e;
import com.c.a.v;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

// Referenced classes of package com.c.a.a:
//            f, i, a

public class g
{
    private static final class a extends g
    {

        private final f a;
        private final f b;
        private final Method c;
        private final Method d;
        private final f e;
        private final f f;

        public final void a(Socket socket)
            throws SocketException
        {
            if (c == null)
            {
                return;
            }
            try
            {
                c.invoke(null, new Object[] {
                    socket
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Socket socket)
            {
                throw new RuntimeException(socket);
            }
            // Misplaced declaration of an exception variable
            catch (Socket socket)
            {
                throw new RuntimeException(socket.getCause());
            }
        }

        public final void a(Socket socket, InetSocketAddress inetsocketaddress, int j)
            throws IOException
        {
            try
            {
                socket.connect(inetsocketaddress, j);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Socket socket)
            {
                inetsocketaddress = new IOException("Exception in connect");
            }
            inetsocketaddress.initCause(socket);
            throw inetsocketaddress;
        }

        public final void a(SSLSocket sslsocket, String s, List list)
        {
            if (s != null)
            {
                a.a(sslsocket, new Object[] {
                    Boolean.valueOf(true)
                });
                b.a(sslsocket, new Object[] {
                    s
                });
            }
            if (f != null && f.a(sslsocket))
            {
                s = new e();
                int k = list.size();
                for (int j = 0; j < k; j++)
                {
                    v v1 = (v)list.get(j);
                    if (v1 != v.a)
                    {
                        s.a(v1.toString().length());
                        s.a(v1.toString());
                    }
                }

                s = s.m();
                f.b(sslsocket, new Object[] {
                    s
                });
            }
        }

        public final String b(SSLSocket sslsocket)
        {
            if (e == null)
            {
                return null;
            }
            if (!e.a(sslsocket))
            {
                return null;
            }
            sslsocket = (byte[])(byte[])e.b(sslsocket, new Object[0]);
            if (sslsocket != null)
            {
                return new String(sslsocket, i.c);
            } else
            {
                return null;
            }
        }

        public final void b(Socket socket)
            throws SocketException
        {
            if (d == null)
            {
                return;
            }
            try
            {
                d.invoke(null, new Object[] {
                    socket
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Socket socket)
            {
                throw new RuntimeException(socket);
            }
            // Misplaced declaration of an exception variable
            catch (Socket socket)
            {
                throw new RuntimeException(socket.getCause());
            }
        }

        public a(f f1, f f2, Method method, Method method1, f f3, f f4)
        {
            a = f1;
            b = f2;
            c = method;
            d = method1;
            e = f3;
            f = f4;
        }
    }

    private static final class b extends g
    {

        private final Method a;
        private final Method b;
        private final Method c;
        private final Class d;
        private final Class e;

        public final void a(SSLSocket sslsocket)
        {
            try
            {
                c.invoke(null, new Object[] {
                    sslsocket
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (SSLSocket sslsocket) { }
            // Misplaced declaration of an exception variable
            catch (SSLSocket sslsocket) { }
            throw new AssertionError();
        }

        public final void a(SSLSocket sslsocket, String s, List list)
        {
            s = new ArrayList(list.size());
            int j = list.size();
            for (int i = 0; i < j; i++)
            {
                v v1 = (v)list.get(i);
                if (v1 != v.a)
                {
                    s.add(v1.toString());
                }
            }

            try
            {
                list = com/c/a/a/g.getClassLoader();
                Class class1 = d;
                Class class2 = e;
                s = new c(s);
                s = ((String) (Proxy.newProxyInstance(list, new Class[] {
                    class1, class2
                }, s)));
                a.invoke(null, new Object[] {
                    sslsocket, s
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (SSLSocket sslsocket) { }
            // Misplaced declaration of an exception variable
            catch (SSLSocket sslsocket) { }
            throw new AssertionError(sslsocket);
        }

        public final String b(SSLSocket sslsocket)
        {
            sslsocket = (c)Proxy.getInvocationHandler(b.invoke(null, new Object[] {
                sslsocket
            }));
            if (c.a(sslsocket) || c.b(sslsocket) != null)
            {
                break MISSING_BLOCK_LABEL_50;
            }
            com.c.a.a.a.a.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
            return null;
            if (c.a(sslsocket))
            {
                return null;
            }
            sslsocket = c.b(sslsocket);
            return sslsocket;
            sslsocket;
_L2:
            throw new AssertionError();
            sslsocket;
            if (true) goto _L2; else goto _L1
_L1:
        }

        public b(Method method, Method method1, Method method2, Class class1, Class class2)
        {
            a = method;
            b = method1;
            c = method2;
            d = class1;
            e = class2;
        }
    }

    private static final class c
        implements InvocationHandler
    {

        private final List a;
        private boolean b;
        private String c;

        static boolean a(c c1)
        {
            return c1.b;
        }

        static String b(c c1)
        {
            return c1.c;
        }

        public final Object invoke(Object obj, Method method, Object aobj[])
            throws Throwable
        {
            String s = method.getName();
            Class class1 = method.getReturnType();
            obj = ((Object) (aobj));
            if (aobj == null)
            {
                obj = i.b;
            }
            if (s.equals("supports") && Boolean.TYPE == class1)
            {
                return Boolean.valueOf(true);
            }
            if (s.equals("unsupported") && Void.TYPE == class1)
            {
                b = true;
                return null;
            }
            if (s.equals("protocols") && obj.length == 0)
            {
                return a;
            }
            if ((s.equals("selectProtocol") || s.equals("select")) && java/lang/String == class1 && obj.length == 1 && (obj[0] instanceof List))
            {
                obj = (List)obj[0];
                int k = ((List) (obj)).size();
                for (int j = 0; j < k; j++)
                {
                    if (a.contains(((List) (obj)).get(j)))
                    {
                        obj = (String)((List) (obj)).get(j);
                        c = ((String) (obj));
                        return obj;
                    }
                }

                obj = (String)a.get(0);
                c = ((String) (obj));
                return obj;
            }
            if ((s.equals("protocolSelected") || s.equals("selected")) && obj.length == 1)
            {
                c = (String)obj[0];
                return null;
            } else
            {
                return method.invoke(this, ((Object []) (obj)));
            }
        }

        public c(List list)
        {
            a = list;
        }
    }


    private static final g a = c();

    public g()
    {
    }

    public static g a()
    {
        return a;
    }

    public static URI a(URL url)
        throws URISyntaxException
    {
        return url.toURI();
    }

    public static void a(String s)
    {
        System.out.println(s);
    }

    public static String b()
    {
        return "OkHttp";
    }

    private static g c()
    {
        Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
_L1:
        f f1;
        f f2;
        f1 = new f(null, "setUseSessionTickets", new Class[] {
            Boolean.TYPE
        });
        f2 = new f(null, "setHostname", new Class[] {
            java/lang/String
        });
        Object obj;
        Object obj1;
        obj = Class.forName("android.net.TrafficStats");
        obj1 = ((Class) (obj)).getMethod("tagSocket", new Class[] {
            java/net/Socket
        });
        Object obj2 = ((Class) (obj)).getMethod("untagSocket", new Class[] {
            java/net/Socket
        });
        Class.forName("android.net.Network");
        obj = new f([B, "getAlpnSelectedProtocol", new Class[0]);
        Object obj3 = new f(null, "setAlpnProtocols", new Class[] {
            [B
        });
        Object obj5 = obj1;
        obj1 = obj;
        obj = obj5;
_L2:
        try
        {
            return new a(f1, f2, ((Method) (obj)), ((Method) (obj2)), ((f) (obj1)), ((f) (obj3)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        break MISSING_BLOCK_LABEL_164;
        obj;
        Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
          goto _L1
        obj = Class.forName("org.eclipse.jetty.alpn.ALPN");
        obj1 = Class.forName((new StringBuilder()).append("org.eclipse.jetty.alpn.ALPN").append("$Provider").toString());
        obj2 = Class.forName((new StringBuilder()).append("org.eclipse.jetty.alpn.ALPN").append("$ClientProvider").toString());
        obj3 = Class.forName((new StringBuilder()).append("org.eclipse.jetty.alpn.ALPN").append("$ServerProvider").toString());
        obj = new b(((Class) (obj)).getMethod("put", new Class[] {
            javax/net/ssl/SSLSocket, obj1
        }), ((Class) (obj)).getMethod("get", new Class[] {
            javax/net/ssl/SSLSocket
        }), ((Class) (obj)).getMethod("remove", new Class[] {
            javax/net/ssl/SSLSocket
        }), ((Class) (obj2)), ((Class) (obj3)));
        return ((g) (obj));
        obj;
_L3:
        return new g();
        obj;
        obj = null;
_L6:
        Object obj6 = null;
        obj3 = obj1;
        obj1 = obj;
        obj = obj3;
        obj3 = obj6;
          goto _L2
        obj;
        obj = null;
_L4:
        obj2 = null;
        obj3 = null;
        obj1 = obj;
        obj = obj3;
_L5:
        Object obj7 = null;
        obj3 = obj1;
        obj1 = obj;
        obj = obj3;
        obj3 = obj7;
          goto _L2
        obj;
          goto _L3
        obj;
        obj = obj1;
          goto _L4
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
        nosuchmethodexception = null;
        obj2 = null;
        obj1 = null;
          goto _L5
        nosuchmethodexception;
        nosuchmethodexception = null;
        obj2 = null;
          goto _L5
        nosuchmethodexception;
        nosuchmethodexception = null;
          goto _L5
        Object obj4;
        obj4;
          goto _L5
        obj4;
          goto _L6
    }

    public void a(Socket socket)
        throws SocketException
    {
    }

    public void a(Socket socket, InetSocketAddress inetsocketaddress, int i)
        throws IOException
    {
        socket.connect(inetsocketaddress, i);
    }

    public void a(SSLSocket sslsocket)
    {
    }

    public void a(SSLSocket sslsocket, String s, List list)
    {
    }

    public String b(SSLSocket sslsocket)
    {
        return null;
    }

    public void b(Socket socket)
        throws SocketException
    {
    }

}
