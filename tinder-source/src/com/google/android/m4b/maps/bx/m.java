// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.ax.h;
import com.google.android.m4b.maps.bf.c;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bq.j;
import com.google.android.m4b.maps.bw.g;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            l, ab

public final class m extends l
{

    private float a;
    private boolean b;

    m(c c1, h h, int k, int i1, r.a a1, g g)
    {
        super(c1.c.e(), c1, h, k, i1, 0, a1, 256, false, true, false, false, false, false, g);
        b = false;
        a = 30F;
    }

    public final void a(d d, b b1, ab ab)
    {
        if (b1.b.b < a)
        {
            if (b)
            {
                super.a(b1, d);
            }
            super.a(d, b1, ab);
            return;
        } else
        {
            n = true;
            return;
        }
    }

    public final boolean a(b b1, d d)
    {
        if (b1.b.b < a)
        {
            b = false;
            return super.a(b1, d);
        } else
        {
            b = true;
            return true;
        }
    }

    protected final ag.a i()
    {
        return ag.a.i;
    }
}
