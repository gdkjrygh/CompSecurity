// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj.chunks;

import ar.com.hjg.pngj.m;

// Referenced classes of package ar.com.hjg.pngj.chunks:
//            ad, d, a

public final class aa extends ad
{

    public aa(m m)
    {
        super("tEXt", m);
    }

    public final void a(d d1)
    {
        int i;
        for (i = 0; i < d1.d.length && d1.d[i] != 0; i++) { }
        h = ar.com.hjg.pngj.chunks.a.a(d1.d, 0, i);
        i++;
        if (i < d1.d.length)
        {
            d1 = ar.com.hjg.pngj.chunks.a.a(d1.d, i, d1.d.length - i);
        } else
        {
            d1 = "";
        }
        this.i = d1;
    }
}
