// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bm;


// Referenced classes of package p.bm:
//            c, i

public final class h extends c
{

    private final int c;
    private final String d;
    private final boolean e;

    public i a()
    {
        return i.b;
    }

    public int b()
    {
        return c;
    }

    public String e()
    {
        return d;
    }

    public boolean f()
    {
        return e;
    }

    public String toString()
    {
        return (new StringBuilder()).append("TCPTransportConfig{Port=").append(c).append(", IpAddress='").append(d).append('\'').append(", AutoReconnect=").append(e).append('}').toString();
    }
}
