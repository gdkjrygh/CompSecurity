// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

public final class nph
    implements ReadableByteChannel
{

    private final npe a;
    private final ReadableByteChannel b;

    public nph(ReadableByteChannel readablebytechannel, npd npd, long l)
    {
        this(readablebytechannel, new npe(npd, l));
    }

    private nph(ReadableByteChannel readablebytechannel, npe npe1)
    {
        b = readablebytechannel;
        a = npe1;
    }

    public final void close()
    {
        b.close();
    }

    public final boolean isOpen()
    {
        return b.isOpen();
    }

    public final int read(ByteBuffer bytebuffer)
    {
        int i = b.read(bytebuffer);
        if (i >= 0)
        {
            a.a(i);
        }
        return i;
    }
}
