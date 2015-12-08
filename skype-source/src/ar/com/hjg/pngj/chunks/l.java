// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj.chunks;

import ar.com.hjg.pngj.m;
import ar.com.hjg.pngj.r;
import ar.com.hjg.pngj.v;

// Referenced classes of package ar.com.hjg.pngj.chunks:
//            z, d

public final class l extends z
{

    private int h[];

    public l(m m1)
    {
        super("hIST", m1);
        h = new int[0];
    }

    public final void a(d d1)
    {
        if (!e.g)
        {
            throw new v("only indexed images accept a HIST chunk");
        }
        h = new int[d1.d.length / 2];
        for (int i = 0; i < h.length; i++)
        {
            h[i] = r.b(d1.d, i * 2);
        }

    }
}
