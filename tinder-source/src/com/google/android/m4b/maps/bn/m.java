// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bn;

import com.google.android.m4b.maps.ao.b;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bo.g;
import java.nio.IntBuffer;
import javax.microedition.khronos.opengles.GL11;

// Referenced classes of package com.google.android.m4b.maps.bn:
//            k, j

public class m extends k
{
    public static final class a extends m
    {

        public final void a(float f, float f1, float f2)
        {
            throw new UnsupportedOperationException("Immutable");
        }

        public final void a(d d1)
        {
            throw new UnsupportedOperationException("Immutable");
        }

        public final void a(g g, int l)
        {
            throw new UnsupportedOperationException("Immutable");
        }

        public a(int ai[])
        {
            super(4, (byte)0);
            b = ai;
            c = 4;
            d = c;
            f = 12;
        }
    }


    private final int h[];
    private volatile long i;

    public m(int l)
    {
        super(l);
        h = new int[1];
        i = -1L;
    }

    public m(int l, byte byte0)
    {
        super(l, true);
        h = new int[1];
        i = -1L;
    }

    public void a(d d1)
    {
        super.a(d1);
        h[0] = 0;
    }

    public final void b(d d1)
    {
        if (h[0] != 0)
        {
            d d2 = com.google.android.m4b.maps.bm.d.a(i);
            if (d2 == d1 && d2 != null)
            {
                ((GL11)d2.a).glDeleteBuffers(1, h, 0);
            }
            h[0] = 0;
            a = 0;
        }
        i = com.google.android.m4b.maps.bm.d.a(d1);
    }

    public final int d()
    {
        int l = 56;
        if (g != null)
        {
            l = g.b() * 4 + 56;
        } else
        if (b != null)
        {
            return b.length * 4 + 16 + 56;
        }
        return l;
    }

    public final void d(d d1)
    {
        i = com.google.android.m4b.maps.bm.d.a(d1);
        if (d1.g) goto _L2; else goto _L1
_L1:
        super.d(d1);
_L4:
        return;
_L2:
        GL11 gl11;
        gl11 = (GL11)d1.a;
        if (h[0] != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (e == null)
        {
            e(d1);
        }
        if (e.limit() == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        gl11.glGenBuffers(1, h, 0);
        gl11.glBindBuffer(34962, h[0]);
        a = e.limit() * 4;
        gl11.glBufferData(34962, a, e, 35044);
        e = null;
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        gl11.glBindBuffer(34962, h[0]);
        gl11.glVertexPointer(3, 5132, 0, 0);
        gl11.glBindBuffer(34962, 0);
        return;
    }

    protected final void e(d d1)
    {
        if (d1.g)
        {
            int l = d * 3;
            e = d1.B.c();
            if (g == null)
            {
                e.put(b, 0, l);
            } else
            {
                b();
                g.a(e);
            }
            e.limit(l);
            e.position(0);
            if (!b.a)
            {
                if (g != null)
                {
                    g.c();
                    g = null;
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
