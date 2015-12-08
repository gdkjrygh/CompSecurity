// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj.chunks;

import ar.com.hjg.pngj.m;
import ar.com.hjg.pngj.v;

// Referenced classes of package ar.com.hjg.pngj.chunks:
//            ad, d, a

public final class q extends ad
{

    private boolean j;
    private String k;
    private String l;

    public q(m m)
    {
        super("iTXt", m);
        j = false;
        k = "";
        l = "";
    }

    public final void a(d d1)
    {
        boolean flag = false;
        int i1 = 0;
        int ai[] = new int[3];
        int i = 0;
        int k1;
        do
        {
            k1 = i1;
            if (i >= d1.d.length)
            {
                break;
            }
            k1 = i;
            int j1 = i1;
            if (d1.d[i] == 0)
            {
                ai[i1] = i;
                j1 = i1 + 1;
                i1 = i;
                if (j1 == 1)
                {
                    i1 = i + 2;
                }
                k1 = j1;
                if (j1 == 3)
                {
                    break;
                }
                k1 = i1;
            }
            i = k1 + 1;
            i1 = j1;
        } while (true);
        if (k1 != 3)
        {
            throw new v("Bad formed PngChunkITXT chunk");
        }
        h = ar.com.hjg.pngj.chunks.a.a(d1.d, 0, ai[0]);
        i = ai[0] + 1;
        if (d1.d[i] != 0)
        {
            flag = true;
        }
        j = flag;
        i++;
        if (j && d1.d[i] != 0)
        {
            throw new v("Bad formed PngChunkITXT chunk - bad compression method ");
        }
        k = ar.com.hjg.pngj.chunks.a.a(d1.d, i, ai[1] - i);
        l = ar.com.hjg.pngj.chunks.a.b(d1.d, ai[1] + 1, ai[2] - ai[1] - 1);
        i = ai[2] + 1;
        if (j)
        {
            this.i = ar.com.hjg.pngj.chunks.a.b(ar.com.hjg.pngj.chunks.a.c(d1.d, i, d1.d.length - i));
            return;
        } else
        {
            this.i = ar.com.hjg.pngj.chunks.a.b(d1.d, i, d1.d.length - i);
            return;
        }
    }
}
