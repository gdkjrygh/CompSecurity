// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import com.squareup.okhttp.Protocol;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

// Referenced classes of package com.squareup.okhttp.internal:
//            Platform, Internal

private static class serverProviderClass extends Platform
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
        int i = 0;
        int j = list.size();
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
            s = new serverProviderClass(s);
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
        sslsocket = (putMethod)Proxy.getInvocationHandler(getMethod.invoke(null, new Object[] {
            sslsocket
        }));
        if (_mth000(sslsocket) || _mth100(sslsocket) != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        Internal.logger.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
        return null;
        if (_mth000(sslsocket))
        {
            break MISSING_BLOCK_LABEL_77;
        }
        sslsocket = _mth100(sslsocket);
        return sslsocket;
        sslsocket;
_L2:
        throw new AssertionError();
        sslsocket;
        if (true) goto _L2; else goto _L1
_L1:
        return null;
    }

    public (Method method, Method method1, Method method2, Class class1, Class class2)
    {
        putMethod = method;
        getMethod = method1;
        removeMethod = method2;
        clientProviderClass = class1;
        serverProviderClass = class2;
    }
}
