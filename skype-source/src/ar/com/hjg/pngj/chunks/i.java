// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj.chunks;

import ar.com.hjg.pngj.m;
import ar.com.hjg.pngj.r;

// Referenced classes of package ar.com.hjg.pngj.chunks:
//            z, d

public final class i extends z
{

    private int h;
    private int i;
    private int j;
    private int k;
    private int l;

    public i(m m1)
    {
        super("bKGD", m1);
    }

    public final void a(d d1)
    {
        if (e.f)
        {
            h = r.b(d1.d, 0);
            return;
        }
        if (e.g)
        {
            l = d1.d[0] & 0xff;
            return;
        } else
        {
            i = r.b(d1.d, 0);
            j = r.b(d1.d, 2);
            k = r.b(d1.d, 4);
            return;
        }
    }
}
