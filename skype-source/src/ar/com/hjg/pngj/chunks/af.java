// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj.chunks;

import ar.com.hjg.pngj.m;
import ar.com.hjg.pngj.v;

// Referenced classes of package ar.com.hjg.pngj.chunks:
//            ad, d, a

public final class af extends ad
{

    public af(m m)
    {
        super("zTXt", m);
    }

    public final void a(d d1)
    {
        byte byte0 = -1;
        int i = 0;
        int j;
label0:
        do
        {
label1:
            {
                j = byte0;
                if (i < d1.d.length)
                {
                    if (d1.d[i] != 0)
                    {
                        break label1;
                    }
                    j = i;
                }
                if (j < 0 || j > d1.d.length - 2)
                {
                    throw new v("bad zTXt chunk: no separator found");
                }
                break label0;
            }
            i++;
        } while (true);
        h = ar.com.hjg.pngj.chunks.a.a(d1.d, 0, j);
        if (d1.d[j + 1] != 0)
        {
            throw new v("bad zTXt chunk: unknown compression method");
        } else
        {
            this.i = ar.com.hjg.pngj.chunks.a.a(ar.com.hjg.pngj.chunks.a.c(d1.d, j + 2, d1.d.length - j - 2));
            return;
        }
    }
}
