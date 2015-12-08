// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public class bcu extends qst
{

    public long a;
    public long b;
    public long c;
    public bct d;
    private long e;

    public bcu()
    {
        super("trex");
    }

    public final void a(ByteBuffer bytebuffer)
    {
        c(bytebuffer);
        a = b.a(bytebuffer);
        e = b.a(bytebuffer);
        b = b.a(bytebuffer);
        c = b.a(bytebuffer);
        d = new bct(bytebuffer);
    }

    protected final void b(ByteBuffer bytebuffer)
    {
        d(bytebuffer);
        bax.b(bytebuffer, a);
        bax.b(bytebuffer, e);
        bax.b(bytebuffer, b);
        bax.b(bytebuffer, c);
        d.a(bytebuffer);
    }

    protected final long e()
    {
        return 24L;
    }
}
