// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gmi
{

    final String a;
    final ehe b;
    final gmj c;

    private gmi(String s, ehe ehe, gmj gmj)
    {
        a = s;
        b = ehe;
        c = gmj;
    }

    gmi(String s, ehe ehe, gmj gmj, byte byte0)
    {
        this(s, ehe, gmj);
    }

    public final String toString()
    {
        return (new StringBuilder("ConnectionInfo{mNodeId='")).append(a).append('\'').append(", mSession=").append(b).append(", mPacketIo=").append(c).append('}').toString();
    }
}
