// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.Protocol;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;

final class gsm extends gsk
{

    private final Method a;
    private final Method b;
    private final Method c;
    private final Class d;
    private final Class e;

    public gsm(Method method, Method method1, Method method2, Class class1, Class class2)
    {
        a = method;
        b = method1;
        c = method2;
        d = class1;
        e = class2;
    }

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
            Protocol protocol = (Protocol)list.get(i);
            if (protocol != Protocol.a)
            {
                s.add(protocol.toString());
            }
        }

        try
        {
            list = gsk.getClassLoader();
            Class class1 = d;
            Class class2 = e;
            s = new gsn(s);
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
        sslsocket = (gsn)Proxy.getInvocationHandler(b.invoke(null, new Object[] {
            sslsocket
        }));
        if (gsn.a(sslsocket) || gsn.b(sslsocket) != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        gsf.a.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
        return null;
        if (gsn.a(sslsocket))
        {
            return null;
        }
        sslsocket = gsn.b(sslsocket);
        return sslsocket;
        sslsocket;
_L2:
        throw new AssertionError();
        sslsocket;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
