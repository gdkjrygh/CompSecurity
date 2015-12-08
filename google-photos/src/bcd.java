// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class bcd extends bay
{

    private float a;

    public bcd()
    {
        super("smhd");
    }

    public final void a(ByteBuffer bytebuffer)
    {
        c(bytebuffer);
        a = b.h(bytebuffer);
        b.c(bytebuffer);
    }

    protected final void b(ByteBuffer bytebuffer)
    {
        d(bytebuffer);
        bax.c(bytebuffer, a);
        bax.b(bytebuffer, 0);
    }

    protected final long e()
    {
        return 8L;
    }

    public final String toString()
    {
        float f = a;
        return (new StringBuilder(44)).append("SoundMediaHeaderBox[balance=").append(f).append("]").toString();
    }
}
