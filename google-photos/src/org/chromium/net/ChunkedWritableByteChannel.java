// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;

public class ChunkedWritableByteChannel
    implements WritableByteChannel
{

    final ArrayList a = new ArrayList();
    ByteBuffer b;
    private ByteBuffer c;
    private int d;
    private boolean e;

    public ChunkedWritableByteChannel()
    {
    }

    public final ByteBuffer a()
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        b.flip();
        c = b;
        b = null;
_L4:
        return c;
_L2:
        if (c == null || d != c.capacity())
        {
            if (c == null && a.size() == 1)
            {
                c = (ByteBuffer)a.get(0);
            } else
            {
                c = ByteBuffer.allocateDirect(d);
                int j = a.size();
                for (int i = 0; i < j; i++)
                {
                    c.put((ByteBuffer)a.get(i));
                }

                c.rewind();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final byte[] b()
    {
        byte abyte0[] = new byte[d];
        if (b != null)
        {
            b.flip();
            b.get(abyte0);
        } else
        {
            int k = a.size();
            int i = 0;
            int j = 0;
            while (i < k) 
            {
                ByteBuffer bytebuffer = (ByteBuffer)a.get(i);
                int l = bytebuffer.remaining();
                bytebuffer.get(abyte0, j, l);
                bytebuffer.rewind();
                j += l;
                i++;
            }
        }
        return abyte0;
    }

    public void close()
    {
        e = true;
    }

    public boolean isOpen()
    {
        return !e;
    }

    public int write(ByteBuffer bytebuffer)
    {
        if (e)
        {
            throw new ClosedChannelException();
        }
        int i = bytebuffer.remaining();
        d = d + i;
        if (b != null)
        {
            if (i <= b.remaining())
            {
                b.put(bytebuffer);
                return i;
            }
            b.flip();
            a.add(b);
            b = null;
        }
        ByteBuffer bytebuffer1 = ByteBuffer.allocateDirect(i);
        bytebuffer1.put(bytebuffer).rewind();
        a.add(bytebuffer1);
        return i;
    }
}
