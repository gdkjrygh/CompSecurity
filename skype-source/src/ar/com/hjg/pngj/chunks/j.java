// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj.chunks;

import ar.com.hjg.pngj.m;
import ar.com.hjg.pngj.r;
import ar.com.hjg.pngj.v;

// Referenced classes of package ar.com.hjg.pngj.chunks:
//            z, d

public final class j extends z
{

    private double h;
    private double i;
    private double j;
    private double k;
    private double l;
    private double m;
    private double n;
    private double o;

    public j(m m1)
    {
        super("cHRM", m1);
    }

    public final void a(d d1)
    {
        if (d1.a != 32)
        {
            throw new v((new StringBuilder("bad chunk ")).append(d1).toString());
        } else
        {
            h = r.a(r.c(d1.d, 0));
            i = r.a(r.c(d1.d, 4));
            j = r.a(r.c(d1.d, 8));
            k = r.a(r.c(d1.d, 12));
            l = r.a(r.c(d1.d, 16));
            m = r.a(r.c(d1.d, 20));
            n = r.a(r.c(d1.d, 24));
            o = r.a(r.c(d1.d, 28));
            return;
        }
    }
}
