// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ford.syncV4.transport.TransportType;

public final class axq extends axl
{

    final int a;
    final String d;
    final boolean e;

    public final TransportType a()
    {
        return TransportType.b;
    }

    public final String toString()
    {
        return (new StringBuilder("TCPTransportConfig{Port=")).append(a).append(", IpAddress='").append(d).append('\'').append(", AutoReconnect=").append(e).append('}').toString();
    }
}
