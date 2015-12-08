// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bn;

import com.google.android.m4b.maps.ao.b;
import com.google.android.m4b.maps.bm.d;
import java.nio.ShortBuffer;
import javax.microedition.khronos.opengles.GL11;

// Referenced classes of package com.google.android.m4b.maps.bn:
//            c, j

public final class e extends c
{

    private final int f[];
    private volatile long g;

    public e(int i)
    {
        super(i);
        f = new int[1];
        g = -1L;
    }

    public e(int i, byte byte0)
    {
        super(i, true);
        f = new int[1];
        g = -1L;
    }

    public final void a(d d1)
    {
        super.a(d1);
        f[0] = 0;
    }

    public final void a(d d1, int i)
    {
        g = com.google.android.m4b.maps.bm.d.a(d1);
        if (d1.g) goto _L2; else goto _L1
_L1:
        super.a(d1, i);
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
        gl11.glBindBuffer(34963, f[0]);
        d = c.limit() * 2;
        gl11.glBufferData(34963, d, c, 35044);
        c = null;
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        gl11.glBindBuffer(34963, f[0]);
        gl11.glDrawElements(i, b, 5123, 0);
        gl11.glBindBuffer(34963, 0);
        return;
    }

    public final void b(d d1)
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

    public final int d()
    {
        int i = 56;
        if (e != null)
        {
            i = e.b() * 2 + 56;
        } else
        if (a != null)
        {
            return a.length * 2 + 16 + 56;
        }
        return i;
    }

    protected final void d(d d1)
    {
        if (d1.g)
        {
            c = d1.B.b();
            if (e == null)
            {
                c.put(a, 0, b);
            } else
            {
                a();
                e.a(c);
            }
            c.limit(b);
            c.position(0);
            if (!b.a)
            {
                if (e != null)
                {
                    e.c();
                    e = null;
                }
                a = null;
            }
            return;
        } else
        {
            super.d(d1);
            return;
        }
    }
}
