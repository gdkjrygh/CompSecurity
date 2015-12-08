// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj.chunks;

import ar.com.hjg.pngj.m;
import ar.com.hjg.pngj.r;
import ar.com.hjg.pngj.v;

// Referenced classes of package ar.com.hjg.pngj.chunks:
//            z, d

public final class ab extends z
{

    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    public ab(m m1)
    {
        super("tIME", m1);
    }

    public final void a(d d1)
    {
        if (d1.a != 7)
        {
            throw new v((new StringBuilder("bad chunk ")).append(d1).toString());
        } else
        {
            h = r.b(d1.d, 0);
            i = r.a(d1.d, 2);
            j = r.a(d1.d, 3);
            k = r.a(d1.d, 4);
            l = r.a(d1.d, 5);
            m = r.a(d1.d, 6);
            return;
        }
    }
}
