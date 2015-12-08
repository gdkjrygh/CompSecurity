// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class bbn extends qsr
{

    private byte a[];

    public bbn()
    {
        super("skip");
    }

    public final void a(ByteBuffer bytebuffer)
    {
        a = new byte[bytebuffer.remaining()];
        bytebuffer.get(a);
    }

    protected final void b(ByteBuffer bytebuffer)
    {
        bytebuffer.put(a);
    }

    protected final long e()
    {
        return (long)a.length;
    }

    public final String toString()
    {
        int i = a.length;
        String s = super.k;
        return (new StringBuilder(String.valueOf(s).length() + 36)).append("FreeSpaceBox[size=").append(i).append(";type=").append(s).append("]").toString();
    }
}
