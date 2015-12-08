// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import c.f;
import com.squareup.okhttp.Protocol;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import javax.net.ssl.SSLSocket;

// Referenced classes of package com.squareup.okhttp.internal:
//            OptionalMethod

public class Platform
{

    private static final Platform PLATFORM = findPlatform();

    public Platform()
    {
    }

    static byte[] concatLengthPrefixed(List list)
    {
        f f1 = new f();
        int j = list.size();
        int i = 0;
        while (i < j) 
        {
            Protocol protocol = (Protocol)list.get(i);
            if (protocol != Protocol.HTTP_1_0)
            {
                f1.b(protocol.toString().length());
                f1.a(protocol.toString());
            }
            i++;
        }
        return f1.s();
    }

    private static Platform findPlatform()
    {
        Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
_L1:
        OptionalMethod optionalmethod;
        OptionalMethod optionalmethod1;
        optionalmethod = new OptionalMethod(null, "setUseSessionTickets", new Class[] {
            Boolean.TYPE
        });
        optionalmethod1 = new OptionalMethod(null, "setHostname", new Class[] {
            java/lang/String
        });
        Object obj;
        Object obj2;
        obj = Class.forName("android.net.TrafficStats");
        obj2 = ((Class) (obj)).getMethod("tagSocket", new Class[] {
            java/net/Socket
        });
        obj = ((Class) (obj)).getMethod("untagSocket", new Class[] {
            java/net/Socket
        });
        Object obj1;
        Class.forName("android.net.Network");
        obj1 = new OptionalMethod([B, "getAlpnSelectedProtocol", new Class[0]);
        Object obj3 = new OptionalMethod(null, "setAlpnProtocols", new Class[] {
            [B
        });
_L2:
        try
        {
            return new Android(optionalmethod, optionalmethod1, ((Method) (obj2)), ((Method) (obj)), ((OptionalMethod) (obj1)), ((OptionalMethod) (obj3)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        break MISSING_BLOCK_LABEL_156;
        obj;
        Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
          goto _L1
        obj = Class.forName("org.eclipse.jetty.alpn.ALPN");
        obj1 = Class.forName((new StringBuilder()).append("org.eclipse.jetty.alpn.ALPN").append("$Provider").toString());
        obj2 = Class.forName((new StringBuilder()).append("org.eclipse.jetty.alpn.ALPN").append("$ClientProvider").toString());
        obj3 = Class.forName((new StringBuilder()).append("org.eclipse.jetty.alpn.ALPN").append("$ServerProvider").toString());
        obj = new JdkWithJettyBootPlatform(((Class) (obj)).getMethod("put", new Class[] {
            javax/net/ssl/SSLSocket, obj1
        }), ((Class) (obj)).getMethod("get", new Class[] {
            javax/net/ssl/SSLSocket
        }), ((Class) (obj)).getMethod("remove", new Class[] {
            javax/net/ssl/SSLSocket
        }), ((Class) (obj2)), ((Class) (obj3)));
        return ((Platform) (obj));
        obj;
_L3:
        return new Platform();
        obj1;
        obj1 = null;
_L6:
        obj3 = null;
          goto _L2
        obj;
        obj = null;
_L5:
        obj1 = null;
        obj3 = null;
        obj2 = obj;
        obj = obj3;
_L4:
        Object obj7 = null;
        obj3 = obj;
        obj = obj1;
        obj1 = obj3;
        obj3 = obj7;
          goto _L2
        obj;
          goto _L3
        obj;
        obj = null;
        obj1 = null;
        obj2 = null;
          goto _L4
        obj;
        obj = null;
        obj1 = null;
          goto _L4
        obj1;
        Object obj4 = null;
        obj1 = obj;
        obj = obj4;
          goto _L4
        Object obj5;
        obj5;
        Object obj6 = obj;
        obj = obj1;
        obj1 = obj6;
          goto _L4
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        classnotfoundexception = ((ClassNotFoundException) (obj2));
          goto _L5
        obj6;
          goto _L6
    }

    public static Platform get()
    {
        return PLATFORM;
    }

    public void afterHandshake(SSLSocket sslsocket)
    {
    }

    public void configureTlsExtensions(SSLSocket sslsocket, String s, List list)
    {
    }

    public void connectSocket(Socket socket, InetSocketAddress inetsocketaddress, int i)
    {
        socket.connect(inetsocketaddress, i);
    }

    public String getPrefix()
    {
        return "OkHttp";
    }

    public String getSelectedProtocol(SSLSocket sslsocket)
    {
        return null;
    }

    public void logW(String s)
    {
        System.out.println(s);
    }

    public void tagSocket(Socket socket)
    {
    }

    public void untagSocket(Socket socket)
    {
    }


    private class Android extends Platform
    {

        private final OptionalMethod getAlpnSelectedProtocol;
        private final OptionalMethod setAlpnProtocols;
        private final OptionalMethod setHostname;
        private final OptionalMethod setUseSessionTickets;
        private final Method trafficStatsTagSocket;
        private final Method trafficStatsUntagSocket;

        public void configureTlsExtensions(SSLSocket sslsocket, String s, List list)
        {
            if (s != null)
            {
                setUseSessionTickets.invokeOptionalWithoutCheckedException(sslsocket, new Object[] {
                    Boolean.valueOf(true)
                });
                setHostname.invokeOptionalWithoutCheckedException(sslsocket, new Object[] {
                    s
                });
            }
            if (setAlpnProtocols != null && setAlpnProtocols.isSupported(sslsocket))
            {
                s = concatLengthPrefixed(list);
                setAlpnProtocols.invokeWithoutCheckedException(sslsocket, new Object[] {
                    s
                });
            }
        }

        public void connectSocket(Socket socket, InetSocketAddress inetsocketaddress, int i)
        {
            try
            {
                socket.connect(inetsocketaddress, i);
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

        public String getSelectedProtocol(SSLSocket sslsocket)
        {
            while (getAlpnSelectedProtocol == null || !getAlpnSelectedProtocol.isSupported(sslsocket)) 
            {
                return null;
            }
            sslsocket = (byte[])(byte[])getAlpnSelectedProtocol.invokeWithoutCheckedException(sslsocket, new Object[0]);
            if (sslsocket != null)
            {
                sslsocket = new String(sslsocket, Util.UTF_8);
            } else
            {
                sslsocket = null;
            }
            return sslsocket;
        }

        public void tagSocket(Socket socket)
        {
            if (trafficStatsTagSocket == null)
            {
                return;
            }
            try
            {
                trafficStatsTagSocket.invoke(null, new Object[] {
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

        public void untagSocket(Socket socket)
        {
            if (trafficStatsUntagSocket == null)
            {
                return;
            }
            try
            {
                trafficStatsUntagSocket.invoke(null, new Object[] {
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

        public Android(OptionalMethod optionalmethod, OptionalMethod optionalmethod1, Method method, Method method1, OptionalMethod optionalmethod2, OptionalMethod optionalmethod3)
        {
            setUseSessionTickets = optionalmethod;
            setHostname = optionalmethod1;
            trafficStatsTagSocket = method;
            trafficStatsUntagSocket = method1;
            getAlpnSelectedProtocol = optionalmethod2;
            setAlpnProtocols = optionalmethod3;
        }
    }


    private class JdkWithJettyBootPlatform extends Platform
    {

        private final Class clientProviderClass;
        private final Method getMethod;
        private final Method putMethod;
        private final Method removeMethod;
        private final Class serverProviderClass;

        public void afterHandshake(SSLSocket sslsocket)
        {
            try
            {
                removeMethod.invoke(null, new Object[] {
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

        public void configureTlsExtensions(SSLSocket sslsocket, String s, List list)
        {
            s = new ArrayList(list.size());
            int j = list.size();
            int i = 0;
            while (i < j) 
            {
                Protocol protocol = (Protocol)list.get(i);
                if (protocol != Protocol.HTTP_1_0)
                {
                    s.add(protocol.toString());
                }
                i++;
            }
            try
            {
                list = com/squareup/okhttp/internal/Platform.getClassLoader();
                Class class1 = clientProviderClass;
                Class class2 = serverProviderClass;
                s = new JettyNegoProvider(s);
                s = ((String) (Proxy.newProxyInstance(list, new Class[] {
                    class1, class2
                }, s)));
                putMethod.invoke(null, new Object[] {
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

        public String getSelectedProtocol(SSLSocket sslsocket)
        {
            sslsocket = (JettyNegoProvider)Proxy.getInvocationHandler(getMethod.invoke(null, new Object[] {
                sslsocket
            }));
            if (((JettyNegoProvider) (sslsocket)).unsupported || ((JettyNegoProvider) (sslsocket)).selected != null)
            {
                break MISSING_BLOCK_LABEL_50;
            }
            Internal.logger.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
            return null;
label0:
            {
                if (((JettyNegoProvider) (sslsocket)).unsupported)
                {
                    sslsocket = null;
                    break label0;
                }
                try
                {
                    sslsocket = ((JettyNegoProvider) (sslsocket)).selected;
                    break label0;
                }
                // Misplaced declaration of an exception variable
                catch (SSLSocket sslsocket) { }
                // Misplaced declaration of an exception variable
                catch (SSLSocket sslsocket) { }
                throw new AssertionError();
            }
            return sslsocket;
        }

        public JdkWithJettyBootPlatform(Method method, Method method1, Method method2, Class class1, Class class2)
        {
            putMethod = method;
            getMethod = method1;
            removeMethod = method2;
            clientProviderClass = class1;
            serverProviderClass = class2;
        }

        private class JettyNegoProvider
            implements InvocationHandler
        {

            private final List protocols;
            private String selected;
            private boolean unsupported;

            public Object invoke(Object obj, Method method, Object aobj[])
            {
                String s = method.getName();
                Class class1 = method.getReturnType();
                obj = ((Object) (aobj));
                if (aobj == null)
                {
                    obj = Util.EMPTY_STRING_ARRAY;
                }
                if (s.equals("supports") && Boolean.TYPE == class1)
                {
                    return Boolean.valueOf(true);
                }
                if (s.equals("unsupported") && Void.TYPE == class1)
                {
                    unsupported = true;
                    return null;
                }
                if (s.equals("protocols") && obj.length == 0)
                {
                    return protocols;
                }
                if ((s.equals("selectProtocol") || s.equals("select")) && java/lang/String == class1 && obj.length == 1 && (obj[0] instanceof List))
                {
                    obj = (List)obj[0];
                    int j = ((List) (obj)).size();
                    for (int i = 0; i < j; i++)
                    {
                        if (protocols.contains(((List) (obj)).get(i)))
                        {
                            obj = (String)((List) (obj)).get(i);
                            selected = ((String) (obj));
                            return obj;
                        }
                    }

                    obj = (String)protocols.get(0);
                    selected = ((String) (obj));
                    return obj;
                }
                if ((s.equals("protocolSelected") || s.equals("selected")) && obj.length == 1)
                {
                    selected = (String)obj[0];
                    return null;
                } else
                {
                    return method.invoke(this, ((Object []) (obj)));
                }
            }



            public JettyNegoProvider(List list)
            {
                protocols = list;
            }
        }

    }

}
