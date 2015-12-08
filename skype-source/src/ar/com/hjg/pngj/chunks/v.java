// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj.chunks;

import ar.com.hjg.pngj.m;
import ar.com.hjg.pngj.r;

// Referenced classes of package ar.com.hjg.pngj.chunks:
//            z, d

public final class v extends z
{

    private int h;
    private int i;
    private int j;
    private int k;
    private int l;

    public v(m m1)
    {
        super("sBIT", m1);
    }

    public final void a(d d1)
    {
        int k1 = d1.a;
        int i1;
        int j1;
        if (e.f)
        {
            i1 = 1;
        } else
        {
            i1 = 3;
        }
        j1 = i1;
        if (e.e)
        {
            j1 = i1 + 1;
        }
        if (k1 != j1)
        {
            throw new ar.com.hjg.pngj.v((new StringBuilder("bad chunk length ")).append(d1).toString());
        }
        if (e.f)
        {
            h = r.a(d1.d, 0);
            if (e.e)
            {
                i = r.a(d1.d, 1);
            }
        } else
        {
            j = r.a(d1.d, 0);
            k = r.a(d1.d, 1);
            l = r.a(d1.d, 2);
            if (e.e)
            {
                i = r.a(d1.d, 3);
                return;
            }
        }
    }
}
