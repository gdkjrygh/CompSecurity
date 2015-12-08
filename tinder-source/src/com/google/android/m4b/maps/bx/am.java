// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bi.c;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bn.a;
import com.google.android.m4b.maps.bn.k;
import com.google.android.m4b.maps.bo.aq;
import com.google.android.m4b.maps.bo.bc;
import com.google.android.m4b.maps.bo.g;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            r, i, ai, ab, 
//            n

public final class am extends r
{

    private static final float a = (float)Math.tan(0.087266462599716474D);
    private static final float b = (float)Math.tan(0.05235987755982989D);
    private g c;
    private int d;
    private i e;
    private boolean f;
    private final k g = new k(6);
    private final a h = new a(6);
    private final a i = new a(6);
    private final g j = new g();
    private final g k = new g();

    public am()
    {
        d = 1;
        e = i.f;
        int l = a(com.google.android.m4b.maps.bx.ai.a(com.google.android.m4b.maps.bx.i.a));
        h.a(l, 2);
        h.a(l | 0xff, 4);
        l = a(com.google.android.m4b.maps.bx.ai.a(com.google.android.m4b.maps.bx.i.c));
        i.a(l, 2);
        i.a(l | 0xff, 4);
    }

    private static int a(int ai1[])
    {
        return (ai1[0] & 0xff00) << 16 | (ai1[1] & 0xff00) << 8 | ai1[2] & 0xff00;
    }

    public final void a(d d1, b b1, ab ab1)
    {
        i l;
        l = ab1.a;
        boolean flag;
        if (f || l != e)
        {
            e = l;
            f = false;
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        l = ab1.a;
        g.a(d1);
        if (l != i.f && l != i.e && b1.b.c != 0.0F) goto _L3; else goto _L2
_L2:
        if (g.a() == 0)
        {
            return;
        }
        break; /* Loop/switch isn't completed */
_L3:
        float f2 = com.google.android.m4b.maps.bi.b.b(b1.c().c);
        float f1;
        if (l == com.google.android.m4b.maps.bx.i.b)
        {
            f1 = 3F;
        } else
        {
            f1 = 5F;
        }
        f1 = f2 - f1;
        if (b1.b.c + b1.g * 0.5F > f1)
        {
            int i1 = (int)b1.e;
            d = i1;
            bc bc1 = (bc)b1.c(f1).b;
            c = bc1.a[3];
            j.d(0, 0);
            com.google.android.m4b.maps.bo.g.b(bc1.a[2], c, k);
            g.a(j, d);
            g.a(k, d);
            float f3 = c.c(b1.c());
            int j1;
            if (l == com.google.android.m4b.maps.bx.i.b)
            {
                f1 = b;
            } else
            {
                f1 = a;
            }
            j1 = (int)(f1 * f3);
            j.c = j1;
            k.c = j1;
            g.a(j, d);
            g.a(k, d);
            j.c = i1;
            k.c = i1;
            g.a(j, d);
            g.a(k, d);
        }
        if (true) goto _L2; else goto _L4
_L4:
        GL10 gl10 = d1.a;
        gl10.glPushMatrix();
        com.google.android.m4b.maps.bx.n.a(d1, b1, c, d);
        d1.a();
        if ((d1.d & 0x10) == 0)
        {
            d1.a.glEnable(3024);
            d1.a(16, true);
        }
        gl10.glBlendFunc(770, 771);
        g.d(d1);
        if (ab1.a == com.google.android.m4b.maps.bx.i.c)
        {
            i.c(d1);
        } else
        {
            h.c(d1);
        }
        gl10.glDrawArrays(5, 0, g.a());
        gl10.glPopMatrix();
        return;
    }

    public final boolean a(b b1, d d1)
    {
        f = true;
        return true;
    }

    public final r.a d()
    {
        return r.a.m;
    }

}
