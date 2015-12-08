// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package javax.jmdns;

import java.io.Closeable;
import java.io.IOException;
import java.net.InetAddress;
import java.util.Collection;
import javax.jmdns.impl.JmDNSImpl;

// Referenced classes of package javax.jmdns:
//            ServiceInfo

public abstract class JmDNS
    implements Closeable
{
    public static interface Delegate
    {

        public abstract void cannotRecoverFromIOError(JmDNS jmdns, Collection collection);
    }


    public JmDNS()
    {
    }

    public static JmDNS create()
        throws IOException
    {
        return new JmDNSImpl(null, null);
    }

    public static JmDNS create(InetAddress inetaddress)
        throws IOException
    {
        return new JmDNSImpl(inetaddress, null);
    }

    public abstract ServiceInfo[] list(String s, long l);
}
