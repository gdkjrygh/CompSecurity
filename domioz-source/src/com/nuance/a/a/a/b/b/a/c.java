// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.b.b.a;

import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

// Referenced classes of package com.nuance.a.a.a.b.b.a:
//            b, a

public final class c
{

    public static Socket a(String s, int i, a a1)
    {
        return a(a1).createSocket(s, i);
    }

    public static Socket a(Socket socket, String s, int i, a a1)
    {
        return a(a1).createSocket(socket, s, i, true);
    }

    private static SSLSocketFactory a(a a1)
    {
        try
        {
            a1 = new b(a1);
            SSLContext sslcontext = SSLContext.getInstance("TLS");
            sslcontext.init(null, new TrustManager[] {
                a1
            }, null);
            a1 = sslcontext.getSocketFactory();
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new SecurityException((new StringBuilder("No such algorithm exception ")).append(a1).toString());
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new SecurityException((new StringBuilder("Failed to initialize the client-side SSLContext ")).append(a1).toString());
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new SecurityException((new StringBuilder("General security exception ")).append(a1).toString());
        }
        return a1;
    }
}
