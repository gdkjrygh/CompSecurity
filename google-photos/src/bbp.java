// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class bbp extends bay
{

    private int a;
    private int b;
    private long c;
    private long d;

    public bbp()
    {
        super("hmhd");
    }

    public final void a(ByteBuffer bytebuffer)
    {
        c(bytebuffer);
        a = b.c(bytebuffer);
        b = b.c(bytebuffer);
        c = b.a(bytebuffer);
        d = b.a(bytebuffer);
        b.a(bytebuffer);
    }

    protected final void b(ByteBuffer bytebuffer)
    {
        d(bytebuffer);
        bax.b(bytebuffer, a);
        bax.b(bytebuffer, b);
        bax.b(bytebuffer, c);
        bax.b(bytebuffer, d);
        bax.b(bytebuffer, 0L);
    }

    protected final long e()
    {
        return 20L;
    }

    public final String toString()
    {
        String s = String.valueOf("HintMediaHeaderBox{maxPduSize=");
        int i = a;
        int j = b;
        long l = c;
        long l1 = d;
        return (new StringBuilder(String.valueOf(s).length() + 102)).append(s).append(i).append(", avgPduSize=").append(j).append(", maxBitrate=").append(l).append(", avgBitrate=").append(l1).append("}").toString();
    }
}
