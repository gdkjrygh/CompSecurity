// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

final class mya extends FilterOutputStream
{

    private final ByteBuffer a = ByteBuffer.allocate(4);

    public mya(OutputStream outputstream)
    {
        super(outputstream);
    }

    public final mya a(int i)
    {
        a.rewind();
        a.putInt(i);
        out.write(a.array());
        return this;
    }

    public final mya a(ByteOrder byteorder)
    {
        a.order(byteorder);
        return this;
    }

    public final mya a(short word0)
    {
        a.rewind();
        a.putShort(word0);
        out.write(a.array(), 0, 2);
        return this;
    }
}
