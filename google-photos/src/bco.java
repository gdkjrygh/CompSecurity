// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class bco extends qsr
{

    private ByteBuffer a;

    public bco(String s)
    {
        super(s);
    }

    public final void a(ByteBuffer bytebuffer)
    {
        a = bytebuffer;
        bytebuffer.position(bytebuffer.position() + bytebuffer.remaining());
    }

    protected final void b(ByteBuffer bytebuffer)
    {
        a.rewind();
        bytebuffer.put(a);
    }

    protected final long e()
    {
        return (long)a.limit();
    }
}
