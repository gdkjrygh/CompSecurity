// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.i;


// Referenced classes of package com.ford.syncV4.i:
//            f, q

public final class p extends f
{

    private final int c;
    private final String d;
    private final boolean e;

    public final int a()
    {
        return q.b;
    }

    public final int b()
    {
        return c;
    }

    public final String e()
    {
        return d;
    }

    public final boolean f()
    {
        return e;
    }

    public final String toString()
    {
        return (new StringBuilder("TCPTransportConfig{Port=")).append(c).append(", IpAddress='").append(d).append('\'').append(", AutoReconnect=").append(e).append('}').toString();
    }
}
