// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj.chunks;

import ar.com.hjg.pngj.m;
import ar.com.hjg.pngj.r;
import ar.com.hjg.pngj.v;

// Referenced classes of package ar.com.hjg.pngj.chunks:
//            z, d

public final class s extends z
{

    private long h;
    private long i;
    private int j;

    public s(m m)
    {
        super("oFFs", m);
    }

    public final void a(d d1)
    {
        if (d1.a != 9)
        {
            throw new v((new StringBuilder("bad chunk length ")).append(d1).toString());
        }
        h = r.c(d1.d, 0);
        if (h < 0L)
        {
            h = h + 0x100000000L;
        }
        i = r.c(d1.d, 4);
        if (i < 0L)
        {
            i = i + 0x100000000L;
        }
        j = r.a(d1.d, 8);
    }
}
