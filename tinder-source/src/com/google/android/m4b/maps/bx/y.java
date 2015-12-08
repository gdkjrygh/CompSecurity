// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import com.google.android.m4b.maps.ax.h;
import com.google.android.m4b.maps.az.i;
import com.google.android.m4b.maps.ba.a;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bo.g;
import com.google.android.m4b.maps.bo.m;
import com.google.android.m4b.maps.bw.c;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            l, ab

public final class y extends l
{

    private static final m a = m.a(c.a(new a(0x243d580, 0x81b3200)), c.a(new a(0x1f78a40, 0x88601c0)));

    y(ah ah, com.google.android.m4b.maps.bf.c c1, h h, int j, int k, r.a a1, com.google.android.m4b.maps.bw.g g1)
    {
        super(ah, c1, h, j, k, 0, a1, 256, false, false, false, false, false, false, g1);
    }

    public final void a(d d, b b1, ab ab)
    {
        float f;
        i j;
        j = com.google.android.m4b.maps.az.i.a();
        f = b1.b.b;
        g.a(b1.d);
        if (j != null) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L3:
        Iterator iterator;
        if (flag)
        {
            super.a(d, b1, ab);
            return;
        } else
        {
            n = true;
            return;
        }
_L2:
        iterator = j.d().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_110;
            }
        } while (((com.google.android.m4b.maps.cg.c)iterator.next()).e() >= 0);
        flag = true;
_L4:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_130;
        }
        if (j.c().isEmpty())
        {
            flag = true;
        } else
        {
            if (f > 18F)
            {
                break MISSING_BLOCK_LABEL_130;
            }
            flag = true;
        }
          goto _L3
        flag = false;
          goto _L4
        flag = false;
          goto _L3
    }

    protected final ag.a i()
    {
        return com.google.android.m4b.maps.bx.ag.a.c;
    }

}
