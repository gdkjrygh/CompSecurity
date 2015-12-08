// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;

final class oun
    implements WritableByteChannel
{

    long a;
    boolean b;
    private ArrayList c;
    private final long d = 0x989680L;
    private long e;

    public oun(oul oul, ArrayList arraylist, long l)
    {
        p.a(arraylist);
        c = arraylist;
        e = 0L;
    }

    public final void close()
    {
        if (a % d != 0L)
        {
            c.add(Long.valueOf(e));
        }
        b = true;
    }

    public final boolean isOpen()
    {
        return !b;
    }

    public final int write(ByteBuffer bytebuffer)
    {
        int i = 0;
        int j;
        boolean flag;
        if (!b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        for (j = bytebuffer.remaining(); i < j; i++)
        {
            byte byte0 = bytebuffer.get();
            a = a + 1L;
            long l = e;
            e = (long)(byte0 & 0xff) + l;
            if (a % d == 0L)
            {
                c.add(Long.valueOf(e));
                e = 0L;
            }
        }

        return j;
    }
}
