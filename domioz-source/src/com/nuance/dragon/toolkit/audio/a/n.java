// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.a;

import com.nuance.dragon.toolkit.a;
import com.nuance.dragon.toolkit.audio.b;
import com.nuance.dragon.toolkit.audio.e;
import com.nuance.dragon.toolkit.audio.f;
import com.nuance.dragon.toolkit.audio.g;
import com.nuance.dragon.toolkit.audio.h;
import com.nuance.dragon.toolkit.audio.util.SpeexEncoder;

// Referenced classes of package com.nuance.dragon.toolkit.audio.a:
//            e

public final class n extends com.nuance.dragon.toolkit.audio.a.e
{

    private int a;
    private final SpeexEncoder b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;

    public n()
    {
        this(1, 0, 50, 15, 7, 0, 50, 5, 35);
    }

    public n(int l, int i1, int j1, int k1, int l1, int i2, int j2, 
            int k2, int l2)
    {
        c = l;
        d = i1;
        e = j1;
        f = k1;
        g = l1;
        h = i2;
        i = j2;
        j = k2;
        k = l2;
        b = new SpeexEncoder();
    }

    private static e c(e e1)
    {
        if (e1.l == 8000)
        {
            return e.h;
        } else
        {
            return e.g;
        }
    }

    public final e a()
    {
        Object obj = j();
        if (obj != null)
        {
            obj = ((b) (obj)).a();
            if (obj != null)
            {
                return c(((e) (obj)));
            }
        }
        return e.k;
    }

    protected final void a(e e1)
    {
        int l;
        if (e1.l == 8000)
        {
            l = 160;
        } else
        {
            l = 320;
        }
        a = l;
        b.a(c(e1), c, d, e, f, g, h, i, j, k);
    }

    protected final h[] a(h h1)
    {
        g g1 = (g)h1;
        (new StringBuilder("[LATCHK] convert() start raw:")).append(g1);
        int l = g1.c.length % a;
        h1 = g1;
        if (l != 0)
        {
            com.nuance.dragon.toolkit.d.e.c(this, "Padding audio chunk for Speex since not aligned on 20ms.");
            int j1 = g1.c.length;
            h1 = new short[(a - l) + j1];
            System.arraycopy(g1.c, 0, h1, 0, g1.c.length);
            h1 = new g(g1.a, h1, g1.e);
        }
        h1 = b.a(((g) (h1)).c, 0, ((g) (h1)).c.length);
        if (a.a)
        {
            StringBuilder stringbuilder = new StringBuilder();
            int k1 = h1.length;
            for (int i1 = 0; i1 < k1; i1++)
            {
                stringbuilder.append(h1[i1]);
                stringbuilder.append("; ");
            }

            (new StringBuilder("[LATCHK] convert() end chunk:")).append(stringbuilder);
        }
        return h1;
    }

    protected final boolean b(e e1)
    {
        return e1.m == f.a;
    }
}
