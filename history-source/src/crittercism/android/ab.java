// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

// Referenced classes of package crittercism.android:
//            aa, dx, e, d

public final class ab extends SSLSocketFactory
{

    private SSLSocketFactory a;
    private e b;
    private d c;

    public ab(SSLSocketFactory sslsocketfactory, e e, d d)
    {
        a = sslsocketfactory;
        b = e;
        c = d;
    }

    private Socket a(Socket socket)
    {
        Object obj = socket;
        if (socket != null)
        {
            obj = socket;
            try
            {
                if (socket instanceof SSLSocket)
                {
                    obj = new aa((SSLSocket)socket, b, c);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Socket socket)
            {
                throw socket;
            }
            catch (Throwable throwable)
            {
                dx.a(throwable);
                return socket;
            }
        }
        return ((Socket) (obj));
    }

    public final SSLSocketFactory a()
    {
        return a;
    }

    public final Socket createSocket()
    {
        return a(a.createSocket());
    }

    public final Socket createSocket(String s, int i)
    {
        return a(a.createSocket(s, i));
    }

    public final Socket createSocket(String s, int i, InetAddress inetaddress, int j)
    {
        return a(a.createSocket(s, i, inetaddress, j));
    }

    public final Socket createSocket(InetAddress inetaddress, int i)
    {
        return a(a.createSocket(inetaddress, i));
    }

    public final Socket createSocket(InetAddress inetaddress, int i, InetAddress inetaddress1, int j)
    {
        return a(a.createSocket(inetaddress, i, inetaddress1, j));
    }

    public final Socket createSocket(Socket socket, String s, int i, boolean flag)
    {
        return a(a.createSocket(socket, s, i, flag));
    }

    public final String[] getDefaultCipherSuites()
    {
        return a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites()
    {
        return a.getSupportedCipherSuites();
    }
}
