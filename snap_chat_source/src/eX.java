// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class eX
{

    public int a;
    public ByteBuffer b;

    public eX()
    {
    }

    public final int a(int i)
    {
        int j = a - b.getInt(a);
        if (i < b.getShort(j))
        {
            return b.getShort(j + i);
        } else
        {
            return 0;
        }
    }

    public final int b(int i)
    {
        return b.getInt(i) + i;
    }

    public final String c(int i)
    {
        i += b.getInt(i);
        if (b.hasArray())
        {
            return new String(b.array(), b.arrayOffset() + i + 4, b.getInt(i), eW.c);
        } else
        {
            ByteBuffer bytebuffer = b.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            byte abyte0[] = new byte[bytebuffer.getInt(i)];
            bytebuffer.position(i + 4);
            bytebuffer.get(abyte0);
            return new String(abyte0, 0, abyte0.length, eW.c);
        }
    }

    public final int d(int i)
    {
        i = a + i;
        int j = b.getInt(i);
        return b.getInt(i + j);
    }

    public final int e(int i)
    {
        i = a + i;
        return i + b.getInt(i) + 4;
    }
}
