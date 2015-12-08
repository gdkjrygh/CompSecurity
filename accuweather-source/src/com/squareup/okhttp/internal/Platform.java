// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.InetSocketAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import javax.net.ssl.SSLSocket;

// Referenced classes of package com.squareup.okhttp.internal:
//            Util

public class Platform
{
    private static class Android23 extends Java6
    {

        protected final Class openSslSocketClass;
        private final Method setHostname;
        private final Method setUseSessionTickets;

        public void connectSocket(Socket socket, InetSocketAddress inetsocketaddress, int i)
            throws IOException
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

        public void enableTlsExtensions(SSLSocket sslsocket, String s)
        {
            super.enableTlsExtensions(sslsocket, s);
            if (!openSslSocketClass.isInstance(sslsocket))
            {
                break MISSING_BLOCK_LABEL_54;
            }
            setUseSessionTickets.invoke(sslsocket, new Object[] {
                Boolean.valueOf(true)
            });
            setHostname.invoke(sslsocket, new Object[] {
                s
            });
            return;
            sslsocket;
            throw new RuntimeException(sslsocket);
            sslsocket;
            throw new AssertionError(sslsocket);
        }

        private Android23(Method method, Class class1, Method method1, Method method2)
        {
            super(method);
            openSslSocketClass = class1;
            setUseSessionTickets = method1;
            setHostname = method2;
        }

    }

    private static class Android41 extends Android23
    {

        private final Method getNpnSelectedProtocol;
        private final Method setNpnProtocols;

        public byte[] getNpnSelectedProtocol(SSLSocket sslsocket)
        {
            if (!openSslSocketClass.isInstance(sslsocket))
            {
                return null;
            }
            try
            {
                sslsocket = (byte[])(byte[])getNpnSelectedProtocol.invoke(sslsocket, new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (SSLSocket sslsocket)
            {
                throw new RuntimeException(sslsocket);
            }
            // Misplaced declaration of an exception variable
            catch (SSLSocket sslsocket)
            {
                throw new AssertionError(sslsocket);
            }
            return sslsocket;
        }

        public void setNpnProtocols(SSLSocket sslsocket, byte abyte0[])
        {
            if (!openSslSocketClass.isInstance(sslsocket))
            {
                return;
            }
            try
            {
                setNpnProtocols.invoke(sslsocket, new Object[] {
                    abyte0
                });
                return;
            }
            // Misplaced declaration of an exception variable
            catch (SSLSocket sslsocket)
            {
                throw new AssertionError(sslsocket);
            }
            // Misplaced declaration of an exception variable
            catch (SSLSocket sslsocket)
            {
                throw new RuntimeException(sslsocket);
            }
        }

        private Android41(Method method, Class class1, Method method1, Method method2, Method method3, Method method4)
        {
            super(method, class1, method1, method2);
            setNpnProtocols = method3;
            getNpnSelectedProtocol = method4;
        }

    }

    private static class Java6 extends Platform
    {

        private final Method getMtu;

        public int getMtu(Socket socket)
            throws IOException
        {
            NetworkInterface networkinterface;
            int i;
            try
            {
                networkinterface = NetworkInterface.getByInetAddress(socket.getLocalAddress());
            }
            catch (NullPointerException nullpointerexception)
            {
                return getMtu(socket);
            }
            catch (SocketException socketexception)
            {
                return getMtu(socket);
            }
            // Misplaced declaration of an exception variable
            catch (Socket socket)
            {
                throw new AssertionError(socket);
            }
            // Misplaced declaration of an exception variable
            catch (Socket socket)
            {
                if (socket.getCause() instanceof IOException)
                {
                    throw (IOException)socket.getCause();
                } else
                {
                    throw new RuntimeException(socket.getCause());
                }
            }
            if (networkinterface != null)
            {
                break MISSING_BLOCK_LABEL_18;
            }
            return getMtu(socket);
            i = ((Integer)getMtu.invoke(networkinterface, new Object[0])).intValue();
            return i;
        }

        private Java6(Method method)
        {
            getMtu = method;
        }

    }

    private static class JdkWithJettyNpnPlatform extends Java6
    {

        private final Class clientProviderClass;
        private final Method getMethod;
        private final Method putMethod;
        private final Class serverProviderClass;

        public byte[] getNpnSelectedProtocol(SSLSocket sslsocket)
        {
            sslsocket = (JettyNpnProvider)Proxy.getInvocationHandler(getMethod.invoke(null, new Object[] {
                sslsocket
            }));
            if (((JettyNpnProvider) (sslsocket)).unsupported || ((JettyNpnProvider) (sslsocket)).selected != null)
            {
                break MISSING_BLOCK_LABEL_52;
            }
            Logger.getLogger("com.squareup.okhttp.OkHttpClient").log(Level.INFO, "NPN callback dropped so SPDY is disabled. Is npn-boot on the boot class path?");
            return null;
label0:
            {
                try
                {
                    if (((JettyNpnProvider) (sslsocket)).unsupported)
                    {
                        break label0;
                    }
                    sslsocket = ((JettyNpnProvider) (sslsocket)).selected.getBytes("US-ASCII");
                }
                // Misplaced declaration of an exception variable
                catch (SSLSocket sslsocket)
                {
                    throw new AssertionError();
                }
                // Misplaced declaration of an exception variable
                catch (SSLSocket sslsocket)
                {
                    throw new AssertionError();
                }
                // Misplaced declaration of an exception variable
                catch (SSLSocket sslsocket)
                {
                    throw new AssertionError();
                }
                return sslsocket;
            }
            return null;
        }

        public void setNpnProtocols(SSLSocket sslsocket, byte abyte0[])
        {
            Object obj;
            Class class1;
            Class class2;
            int i;
            int j;
            try
            {
                obj = new ArrayList();
            }
            // Misplaced declaration of an exception variable
            catch (SSLSocket sslsocket)
            {
                throw new AssertionError(sslsocket);
            }
            // Misplaced declaration of an exception variable
            catch (SSLSocket sslsocket)
            {
                throw new AssertionError(sslsocket);
            }
            // Misplaced declaration of an exception variable
            catch (SSLSocket sslsocket)
            {
                throw new AssertionError(sslsocket);
            }
            i = 0;
            if (i >= abyte0.length)
            {
                break; /* Loop/switch isn't completed */
            }
            j = i + 1;
            i = abyte0[i];
            ((List) (obj)).add(new String(abyte0, j, i, "US-ASCII"));
            i = j + i;
            if (true) goto _L2; else goto _L1
_L2:
            break MISSING_BLOCK_LABEL_11;
_L1:
            abyte0 = com/squareup/okhttp/internal/Platform.getClassLoader();
            class1 = clientProviderClass;
            class2 = serverProviderClass;
            obj = new JettyNpnProvider(((List) (obj)));
            abyte0 = ((byte []) (Proxy.newProxyInstance(abyte0, new Class[] {
                class1, class2
            }, ((InvocationHandler) (obj)))));
            putMethod.invoke(null, new Object[] {
                sslsocket, abyte0
            });
            return;
        }

        public JdkWithJettyNpnPlatform(Method method, Method method1, Method method2, Class class1, Class class2)
        {
            super(method);
            putMethod = method1;
            getMethod = method2;
            clientProviderClass = class1;
            serverProviderClass = class2;
        }
    }

    private static class JettyNpnProvider
        implements InvocationHandler
    {

        private final List protocols;
        private String selected;
        private boolean unsupported;

        public Object invoke(Object obj, Method method, Object aobj[])
            throws Throwable
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
            if (s.equals("selectProtocol") && java/lang/String == class1 && obj.length == 1 && (obj[0] == null || (obj[0] instanceof List)))
            {
                obj = (List)obj[0];
                selected = (String)protocols.get(0);
                return selected;
            }
            if (s.equals("protocolSelected") && obj.length == 1)
            {
                selected = (String)obj[0];
                return null;
            } else
            {
                return method.invoke(this, ((Object []) (obj)));
            }
        }



        public JettyNpnProvider(List list)
        {
            protocols = list;
        }
    }


    private static final Platform PLATFORM = findPlatform();
    private Constructor deflaterConstructor;

    public Platform()
    {
    }

    private static Platform findPlatform()
    {
        Object obj;
        Method method;
        Method method1;
        Method method2;
        Android41 android41;
        try
        {
            method = java/net/NetworkInterface.getMethod("getMTU", new Class[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return new Platform();
        }
        obj = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
_L1:
        method1 = ((Class) (obj)).getMethod("setUseSessionTickets", new Class[] {
            Boolean.TYPE
        });
        method2 = ((Class) (obj)).getMethod("setHostname", new Class[] {
            java/lang/String
        });
        android41 = new Android41(method, ((Class) (obj)), method1, method2, ((Class) (obj)).getMethod("setNpnProtocols", new Class[] {
            [B
        }), ((Class) (obj)).getMethod("getNpnSelectedProtocol", new Class[0]));
        return android41;
        obj;
        obj = Class.forName("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
          goto _L1
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
        obj = new Android23(method, ((Class) (obj)), method1, method2);
        return ((Platform) (obj));
        Object obj1;
        obj1;
_L5:
        obj1 = Class.forName("org.eclipse.jetty.npn.NextProtoNego");
        Class class1 = Class.forName((new StringBuilder()).append("org.eclipse.jetty.npn.NextProtoNego").append("$Provider").toString());
        Class class2 = Class.forName((new StringBuilder()).append("org.eclipse.jetty.npn.NextProtoNego").append("$ClientProvider").toString());
        Class class3 = Class.forName((new StringBuilder()).append("org.eclipse.jetty.npn.NextProtoNego").append("$ServerProvider").toString());
        obj1 = new JdkWithJettyNpnPlatform(method, ((Class) (obj1)).getMethod("put", new Class[] {
            javax/net/ssl/SSLSocket, class1
        }), ((Class) (obj1)).getMethod("get", new Class[] {
            javax/net/ssl/SSLSocket
        }), class2, class3);
        return ((Platform) (obj1));
        obj1;
_L3:
        return new Java6(method);
        obj1;
        if (true) goto _L3; else goto _L2
_L2:
        obj1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static Platform get()
    {
        return PLATFORM;
    }

    public void connectSocket(Socket socket, InetSocketAddress inetsocketaddress, int i)
        throws IOException
    {
        socket.connect(inetsocketaddress, i);
    }

    public void enableTlsExtensions(SSLSocket sslsocket, String s)
    {
    }

    public int getMtu(Socket socket)
        throws IOException
    {
        return 1400;
    }

    public byte[] getNpnSelectedProtocol(SSLSocket sslsocket)
    {
        return null;
    }

    public String getPrefix()
    {
        return "OkHttp";
    }

    public void logW(String s)
    {
        System.out.println(s);
    }

    public OutputStream newDeflaterOutputStream(OutputStream outputstream, Deflater deflater, boolean flag)
    {
        Constructor constructor;
        Constructor constructor1;
        try
        {
            constructor1 = deflaterConstructor;
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            throw new UnsupportedOperationException("Cannot SPDY; no SYNC_FLUSH available");
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            if (outputstream.getCause() instanceof RuntimeException)
            {
                outputstream = (RuntimeException)outputstream.getCause();
            } else
            {
                outputstream = new RuntimeException(outputstream.getCause());
            }
            throw outputstream;
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            throw new RuntimeException(outputstream);
        }
        // Misplaced declaration of an exception variable
        catch (OutputStream outputstream)
        {
            throw new AssertionError();
        }
        constructor = constructor1;
        if (constructor1 != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        constructor = java/util/zip/DeflaterOutputStream.getConstructor(new Class[] {
            java/io/OutputStream, java/util/zip/Deflater, Boolean.TYPE
        });
        deflaterConstructor = constructor;
        outputstream = (OutputStream)constructor.newInstance(new Object[] {
            outputstream, deflater, Boolean.valueOf(flag)
        });
        return outputstream;
    }

    public void setNpnProtocols(SSLSocket sslsocket, byte abyte0[])
    {
    }

    public void supportTlsIntolerantServer(SSLSocket sslsocket)
    {
        sslsocket.setEnabledProtocols(new String[] {
            "SSLv3"
        });
    }

    public void tagSocket(Socket socket)
        throws SocketException
    {
    }

    public URI toUriLenient(URL url)
        throws URISyntaxException
    {
        return url.toURI();
    }

    public void untagSocket(Socket socket)
        throws SocketException
    {
    }

}
