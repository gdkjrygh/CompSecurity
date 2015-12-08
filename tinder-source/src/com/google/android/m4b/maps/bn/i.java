// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bn;

import com.google.android.m4b.maps.ao.b;
import com.google.android.m4b.maps.bm.d;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import javax.microedition.khronos.opengles.GL11;

// Referenced classes of package com.google.android.m4b.maps.bn:
//            g, j

public class i extends g
{
    public static final class a extends i
    {

        public final void a(float f1, float f2)
        {
            throw new UnsupportedOperationException("Immutable");
        }

        public final void a(int i1, int j1)
        {
            throw new UnsupportedOperationException("Immutable");
        }

        public final void a(d d1)
        {
            throw new UnsupportedOperationException("Immutable");
        }

        public final void a(int ai[], int i1, int j1)
        {
            throw new UnsupportedOperationException("Immutable");
        }

        public a(int ai[])
        {
            super(4, (byte)0);
            b = ai;
            c = 4;
            d = c;
            i = 8;
        }
    }


    private final int k[];
    private volatile long l;

    public i(int i1)
    {
        super(i1);
        k = new int[1];
        l = -1L;
    }

    public i(int i1, byte byte0)
    {
        super(i1, true);
        k = new int[1];
        l = -1L;
    }

    public i(int i1, char c1)
    {
        super(i1, (byte)0);
        k = new int[1];
        l = -1L;
    }

    private boolean f(d d1)
    {
        if (e == null)
        {
            e(d1);
        }
        if (e.limit() == 0)
        {
            return false;
        } else
        {
            d1 = (GL11)d1.a;
            d1.glGenBuffers(1, k, 0);
            d1.glBindBuffer(34962, k[0]);
            a = e.limit() * g;
            d1.glBufferData(34962, a, e, 35044);
            e = null;
            return true;
        }
    }

    public void a(d d1)
    {
        super.a(d1);
        k[0] = 0;
    }

    public final void a(d d1, int i1)
    {
        l = com.google.android.m4b.maps.bm.d.a(d1);
        if (!d1.g)
        {
            super.a(d1, i1);
        } else
        if (k[0] != 0 || f(d1))
        {
            d1 = (GL11)d1.a;
            d1.glBindBuffer(34962, k[0]);
            d1.glTexCoordPointer(2, f, 0, i1 * 2 * g);
            d1.glBindBuffer(34962, 0);
            return;
        }
    }

    public final void b(d d1)
    {
        if (k[0] != 0)
        {
            d d2 = com.google.android.m4b.maps.bm.d.a(l);
            if (d2 == d1 && d2 != null)
            {
                ((GL11)d2.a).glDeleteBuffers(1, k, 0);
            }
            k[0] = 0;
            a = 0;
        }
        l = com.google.android.m4b.maps.bm.d.a(d1);
    }

    public final int c()
    {
        int i1 = 56;
        if (j != null)
        {
            i1 = j.b() * 4 + 56;
        } else
        if (b != null)
        {
            return b.length * 4 + 16 + 56;
        }
        return i1;
    }

    public final void d(d d1)
    {
        l = com.google.android.m4b.maps.bm.d.a(d1);
        if (!d1.g)
        {
            super.d(d1);
        } else
        if (k[0] != 0 || f(d1))
        {
            d1 = (GL11)d1.a;
            d1.glBindBuffer(34962, k[0]);
            d1.glTexCoordPointer(2, f, 0, 0);
            d1.glBindBuffer(34962, 0);
            return;
        }
    }

    protected final void e(d d1)
    {
        if (d1.g)
        {
            int i1 = d * 2;
            if (f == 5122)
            {
                e = d1.B.b();
                if (j == null)
                {
                    a((ShortBuffer)e, i1);
                } else
                {
                    a();
                    j.a((ShortBuffer)e, h);
                }
            } else
            if (f == 5121 || f == 5120)
            {
                e = d1.B.a();
                if (j == null)
                {
                    a((ByteBuffer)e, i1);
                } else
                {
                    a();
                    j.a((ByteBuffer)e, h);
                }
            } else
            {
                e = d1.B.c();
                if (j == null)
                {
                    ((IntBuffer)e).put(b, 0, i1);
                } else
                {
                    a();
                    j.a((IntBuffer)e);
                }
            }
            e.limit(i1);
            e.position(0);
            if (!b.a)
            {
                if (j != null)
                {
                    j.c();
                    j = null;
                }
                b = null;
            }
            return;
        } else
        {
            super.e(d1);
            return;
        }
    }
}
