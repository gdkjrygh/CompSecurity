// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.java_websocket;

import java.net.InetSocketAddress;
import org.java_websocket.d.e;
import org.java_websocket.d.f;
import org.java_websocket.e.i;

// Referenced classes of package org.java_websocket:
//            f, a

public abstract class d
    implements org.java_websocket.f
{

    public d()
    {
    }

    public final String a(a a1)
    {
        a1 = a1.d();
        if (a1 == null)
        {
            throw new org.java_websocket.c.d("socket not bound");
        } else
        {
            StringBuffer stringbuffer = new StringBuffer(90);
            stringbuffer.append("<cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"");
            stringbuffer.append(a1.getPort());
            stringbuffer.append("\" /></cross-domain-policy>\0");
            return stringbuffer.toString();
        }
    }

    public final void a(a a1, org.java_websocket.d.d d1)
    {
        d1 = new f(d1);
        d1.a(e.e);
        a1.a(d1);
    }

    public final i f()
    {
        return new org.java_websocket.e.e();
    }
}
