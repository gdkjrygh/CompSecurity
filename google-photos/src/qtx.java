// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public abstract class qtx
{

    int d;
    int e;
    int f;

    public qtx()
    {
    }

    public final void a(int i, ByteBuffer bytebuffer)
    {
        d = i;
        int j = b.a(bytebuffer.get());
        e = j & 0x7f;
        i = 1;
        while (j >>> 7 == 1) 
        {
            j = b.a(bytebuffer.get());
            i++;
            e = e << 7 | j & 0x7f;
        }
        f = i;
        ByteBuffer bytebuffer1 = bytebuffer.slice();
        bytebuffer1.limit(e);
        a(bytebuffer1);
        bytebuffer.position(bytebuffer.position() + e);
    }

    public abstract void a(ByteBuffer bytebuffer);

    public final int b()
    {
        return e + 1 + f;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("BaseDescriptor");
        stringbuilder.append("{tag=").append(d);
        stringbuilder.append(", sizeOfInstance=").append(e);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }
}
