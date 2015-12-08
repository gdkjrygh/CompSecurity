// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj.chunks;

import ar.com.hjg.pngj.m;
import ar.com.hjg.pngj.r;

// Referenced classes of package ar.com.hjg.pngj.chunks:
//            z, d

public final class ac extends z
{

    private int h;
    private int i;
    private int j;
    private int k;
    private int l[];

    public ac(m m1)
    {
        super("tRNS", m1);
        l = new int[0];
    }

    public final void a(d d1)
    {
        if (e.f)
        {
            h = r.b(d1.d, 0);
        } else
        if (e.g)
        {
            int j1 = d1.d.length;
            l = new int[j1];
            int i1 = 0;
            while (i1 < j1) 
            {
                l[i1] = d1.d[i1] & 0xff;
                i1++;
            }
        } else
        {
            i = r.b(d1.d, 0);
            j = r.b(d1.d, 2);
            k = r.b(d1.d, 4);
            return;
        }
    }

    public final int[] b()
    {
        return l;
    }
}
