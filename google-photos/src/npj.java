// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

public final class npj
    implements WritableByteChannel
{

    public final npe a;
    public final WritableByteChannel b;

    public npj(WritableByteChannel writablebytechannel, npd npd)
    {
        b = writablebytechannel;
        a = new npe(npd);
    }

    public final void close()
    {
        b.close();
    }

    public final boolean isOpen()
    {
        return b.isOpen();
    }

    public final int write(ByteBuffer bytebuffer)
    {
        int i = b.write(bytebuffer);
        a.a(i);
        return i;
    }
}
