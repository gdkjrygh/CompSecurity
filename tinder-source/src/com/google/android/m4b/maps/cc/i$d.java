// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cc;

import com.google.android.m4b.maps.bm.d;
import com.google.android.m4b.maps.bm.j;
import com.google.android.m4b.maps.bo.t;
import com.google.android.m4b.maps.bo.y;
import com.google.android.m4b.maps.bo.z;
import com.google.android.m4b.maps.bx.i;
import com.google.android.m4b.maps.bx.k;

// Referenced classes of package com.google.android.m4b.maps.cc:
//            i, h

public static final class i
    implements i
{

    private final k a;
    private final String b;
    private final int c;
    private final t d;
    private final com.google.android.m4b.maps.bx.i e;
    private final float f;
    private final float g;
    private final float h;
    private final float i;
    private final int j;

    public final float a()
    {
        return f;
    }

    public final j a(d d1, i l)
    {
label0:
        {
            int j1 = com.google.android.m4b.maps.cc.h.b(d, l);
            int l1 = com.google.android.m4b.maps.cc.h.a(d, l);
            int i1 = l1;
            if (j == 0)
            {
                break label0;
            }
            boolean flag = false;
            if (l != i.b)
            {
                i1 = l1;
                j1 = ((flag) ? 1 : 0);
                if (l != i.c)
                {
                    break label0;
                }
            }
            j1 = j;
            i1 = com.google.android.m4b.maps.cc.h.a(j1, 255);
            k k1;
            String s;
            com.google.android.m4b.maps.bx.f f1;
            if (com.google.android.m4b.maps.cc.h.b(j1) < 192)
            {
                i1 |= 0xffffff;
            }
            j1 = ((flag) ? 1 : 0);
        }
        k1 = a;
        s = b;
        f1 = e;
        if (d != null)
        {
            l = d.d;
        } else
        {
            l = null;
        }
        return k1.a(d1, s, f1, l, c, i1, j1, j);
    }

    public final j a(i l)
    {
        k k1 = a;
        String s = b;
        com.google.android.m4b.maps.bx.j j1 = e;
        z z1;
        if (d != null)
        {
            z1 = d.d;
        } else
        {
            z1 = null;
        }
        return k1.a(s, j1, z1, c, com.google.android.m4b.maps.cc.h.a(d, l), com.google.android.m4b.maps.cc.h.b(d, l), j);
    }

    public final float b()
    {
        return g;
    }

    public final float c()
    {
        return h;
    }

    public final float d()
    {
        return i;
    }

    public final float e()
    {
        return g - h - i;
    }

    (k k1, String s, int l, t t1, com.google.android.m4b.maps.bx. )
    {
        a = k1;
        b = s;
        c = l;
        d = t1;
        float f1 = 1.0F;
        int i1;
        if (t1.f())
        {
            i1 = t1.e.a;
        } else
        {
            i1 = 0;
        }
        j = i1;
        if (t1.e())
        {
            f1 = t1.d.d;
        }
        e = ;
        if (d != null)
        {
            t1 = d.d;
        } else
        {
            t1 = null;
        }
        k1 = k1.a(s, , t1, l, true, f1);
        if ( == k.e)
        {
            f = k1[0] * 0.8F;
        } else
        {
            f = k1[0];
        }
        g = k1[1];
        h = k1[2];
        i = k1[3];
    }
}
