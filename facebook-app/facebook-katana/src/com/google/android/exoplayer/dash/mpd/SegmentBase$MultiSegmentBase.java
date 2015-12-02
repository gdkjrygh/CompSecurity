// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.dash.mpd;

import com.google.android.exoplayer.util.Util;
import java.util.List;

// Referenced classes of package com.google.android.exoplayer.dash.mpd:
//            SegmentBase, RangedUri, Representation

public abstract class g extends SegmentBase
{

    final long d;
    final int e;
    final long f;
    final List g;

    public final int a(long l)
    {
_L2:
        int j;
        while (j <= k) 
        {
            int j1 = (j + k) / 2;
            long l2 = b(j1);
            if (l2 < l)
            {
                j = j1 + 1;
            } else
            if (l2 > l)
            {
                k = j1 - 1;
            } else
            {
                return j1;
            }
        }
        if (j == i1)
        {
            return j;
        } else
        {
            return k;
        }
        int i1 = b();
        int k = c();
        if (g == null)
        {
            long l1 = (f * 0xf4240L) / b;
            int i = e;
            i = (int)(l / l1) + i;
            if (i < i1)
            {
                return i1;
            }
            if (k != -1 && i > k)
            {
                return k;
            } else
            {
                return i;
            }
        }
        j = i1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final long a(int i)
    {
        if (g != null)
        {
            return (((ement)g.get(i - e)).b * 0xf4240L) / b;
        }
        if (i == c())
        {
            return d * 1000L - b(i);
        } else
        {
            return (f * 0xf4240L) / b;
        }
    }

    public abstract RangedUri a(Representation representation, int i);

    public final int b()
    {
        return e;
    }

    public final long b(int i)
    {
        long l;
        if (g != null)
        {
            l = ((ement)g.get(i - e)).a - c;
        } else
        {
            l = (long)(i - e) * f;
        }
        return Util.a(l, 0xf4240L, b);
    }

    public abstract int c();

    public boolean d()
    {
        return g != null;
    }

    public ement(RangedUri rangeduri, long l, long l1, long l2, 
            int i, long l3, List list)
    {
        super(rangeduri, l, l1);
        d = l2;
        e = i;
        f = l3;
        g = list;
    }
}
