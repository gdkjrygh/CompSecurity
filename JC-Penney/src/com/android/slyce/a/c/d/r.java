// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import com.android.slyce.a.aj;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.android.slyce.a.c.d:
//            l, g, p

final class r
{

    r()
    {
    }

    aj a(List list)
    {
        aj aj1 = new aj();
        ByteBuffer bytebuffer = aj.c(8192);
        int j = list.size();
        int i = 0;
        while (i < j) 
        {
            if (bytebuffer.remaining() < bytebuffer.capacity() / 2)
            {
                bytebuffer.flip();
                aj1.a(bytebuffer);
                bytebuffer = aj.c(bytebuffer.capacity() * 2);
            }
            g g1 = ((l)list.get(i)).h.c();
            Integer integer = (Integer)p.b().get(g1);
            if (integer != null)
            {
                a(bytebuffer, integer.intValue() + 1, 15, 0);
                a(bytebuffer, ((l)list.get(i)).i);
            } else
            {
                bytebuffer.put((byte)0);
                a(bytebuffer, g1);
                a(bytebuffer, ((l)list.get(i)).i);
            }
            i++;
        }
        aj1.a(bytebuffer);
        return aj1;
    }

    void a(ByteBuffer bytebuffer, int i, int j, int k)
    {
        if (i < j)
        {
            bytebuffer.put((byte)(k | i));
            return;
        }
        bytebuffer.put((byte)(k | j));
        for (i -= j; i >= 128; i >>>= 7)
        {
            bytebuffer.put((byte)(i & 0x7f | 0x80));
        }

        bytebuffer.put((byte)i);
    }

    void a(ByteBuffer bytebuffer, g g1)
    {
        a(bytebuffer, g1.d(), 127, 0);
        bytebuffer.put(g1.e());
    }
}
