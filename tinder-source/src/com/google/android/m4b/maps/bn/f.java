// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bn;

import com.google.android.m4b.maps.bm.d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL11;

public class f
{
    public static final class a extends f
    {

        public final void a(ByteBuffer bytebuffer)
        {
            throw new UnsupportedOperationException("Immutable");
        }

        public final void b(d d1)
        {
            throw new UnsupportedOperationException("Immutable");
        }

        public a(float af[])
        {
            super(9);
            ByteBuffer bytebuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder());
            bytebuffer.asFloatBuffer().put(af);
            a(bytebuffer);
        }
    }


    public int a;
    private ByteBuffer b;
    private int c;
    private final boolean d;
    private final boolean e;
    private int f;
    private final int g[] = new int[1];
    private boolean h;

    public f(int i)
    {
        boolean flag1 = true;
        super();
        h = false;
        c = i;
        boolean flag;
        if ((i & 8) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        if ((i & 4) != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        e = flag;
        f = 12;
        if (e)
        {
            f = f + 16;
        }
        if (d)
        {
            f = f + 8;
        }
    }

    public final void a(d d1)
    {
        GL11 gl11 = (GL11)d1.a;
        byte byte0;
        if (g[0] == 0)
        {
            d1 = (GL11)d1.a;
            d1.glGenBuffers(1, g, 0);
            d1.glBindBuffer(34962, g[0]);
        } else
        {
            gl11.glBindBuffer(34962, g[0]);
        }
        if (h)
        {
            b.rewind();
            gl11.glBufferData(34962, b.capacity(), b, 35044);
            h = false;
        }
        gl11.glVertexPointer(3, 5126, f, 0);
        if (e)
        {
            gl11.glColorPointer(4, 5126, f, 12);
            byte0 = 28;
        } else
        {
            byte0 = 12;
        }
        if (d)
        {
            gl11.glTexCoordPointer(2, 5126, f, byte0);
        }
        gl11.glBindBuffer(34962, 0);
    }

    public void a(ByteBuffer bytebuffer)
    {
        b = bytebuffer;
        h = true;
        a = b.capacity() / f;
    }

    public void b(d d1)
    {
        c(d1);
        b = null;
    }

    public final void c(d d1)
    {
        if (g[0] != 0)
        {
            if (d1 != null)
            {
                ((GL11)d1.a).glDeleteBuffers(1, g, 0);
            }
            g[0] = 0;
            if (b != null)
            {
                b.clear();
            }
        }
    }
}
