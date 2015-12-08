// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class oke
    implements oki
{

    private final okf a;
    private final int b;

    public oke(okf okf1, int i)
    {
        a = (okf)p.b(okf1, "source cannot be null");
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "chunkSizeBytes must be positive");
        b = i;
    }

    public final int a()
    {
        return b;
    }

    public final int a(int i, byte abyte0[])
    {
        return a.a(b * i, ByteBuffer.wrap(abyte0));
    }

    public final boolean a(int i, int j)
    {
        return a.a(b * i, b * j);
    }

    public final void b()
    {
        a.a();
    }

    public final void close()
    {
        a.close();
    }
}
