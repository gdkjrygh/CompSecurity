// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bn;

import com.google.android.m4b.maps.bm.d;
import java.nio.ByteBuffer;
import javax.microedition.khronos.opengles.GL11;

// Referenced classes of package com.google.android.m4b.maps.bn:
//            a, j

public final class b extends a
{

    private final int f[];
    private volatile long g;

    public b(int i)
    {
        super(i);
        f = new int[1];
        g = -1L;
    }

    public b(int i, byte byte0)
    {
        super(i, true);
        f = new int[1];
        g = -1L;
    }

    public final void a(d d1)
    {
        if (f[0] != 0)
        {
            d d2 = com.google.android.m4b.maps.bm.d.a(g);
            if (d2 == d1 && d2 != null)
            {
                ((GL11)d2.a).glDeleteBuffers(1, f, 0);
            }
            f[0] = 0;
            d = 0;
        }
        g = com.google.android.m4b.maps.bm.d.a(d1);
    }

    public final int b()
    {
        int i = 56;
        if (e != null)
        {
            i = e.b() + 56;
        } else
        if (a != null)
        {
            return a.length + 16 + 56;
        }
        return i;
    }

    public final void c(d d1)
    {
        g = com.google.android.m4b.maps.bm.d.a(d1);
        if (d1.g) goto _L2; else goto _L1
_L1:
        super.c(d1);
_L4:
        return;
_L2:
        GL11 gl11;
        gl11 = (GL11)d1.a;
        if (f[0] != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (c == null)
        {
            d(d1);
        }
        if (c.limit() == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        gl11.glGenBuffers(1, f, 0);
        gl11.glBindBuffer(34962, f[0]);
        d = c.limit();
        gl11.glBufferData(34962, d, c, 35044);
        c = null;
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        gl11.glBindBuffer(34962, f[0]);
        gl11.glColorPointer(4, 5121, 0, 0);
        gl11.glBindBuffer(34962, 0);
        return;
    }

    protected final void d(d d1)
    {
        if (d1.g)
        {
            int i = b;
            c = d1.B.a();
            boolean flag;
            if (!com.google.android.m4b.maps.ao.b.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(i * 4, flag);
            return;
        } else
        {
            super.d(d1);
            return;
        }
    }
}
