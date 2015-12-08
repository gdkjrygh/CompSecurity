// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj.chunks;

import ar.com.hjg.pngj.m;
import ar.com.hjg.pngj.r;
import ar.com.hjg.pngj.v;

// Referenced classes of package ar.com.hjg.pngj.chunks:
//            r, d, a

public final class w extends ar.com.hjg.pngj.chunks.r
{

    private String h;
    private int i;
    private int j[];

    public w(m m)
    {
        super("sPLT", m);
    }

    public final void a(d d1)
    {
        int i1 = -1;
        int k = 0;
        int l;
label0:
        do
        {
label1:
            {
                l = i1;
                if (k < d1.d.length)
                {
                    if (d1.d[k] != 0)
                    {
                        break label1;
                    }
                    l = k;
                }
                if (l <= 0 || l > d1.d.length - 2)
                {
                    throw new v("bad sPLT chunk: no separator found");
                }
                break label0;
            }
            k++;
        } while (true);
        h = ar.com.hjg.pngj.chunks.a.a(d1.d, 0, l);
        i = r.a(d1.d, l + 1);
        i1 = l + 2;
        l = d1.d.length;
        int j2;
        if (i == 8)
        {
            k = 6;
        } else
        {
            k = 10;
        }
        j2 = (l - i1) / k;
        j = new int[j2 * 5];
        k = 0;
        l = 0;
        while (k < j2) 
        {
            int ai[];
            int j1;
            int k1;
            int l1;
            int i2;
            int k2;
            int l2;
            if (i == 8)
            {
                byte abyte0[] = d1.d;
                k1 = i1 + 1;
                i2 = r.a(abyte0, i1);
                abyte0 = d1.d;
                j1 = k1 + 1;
                l1 = r.a(abyte0, k1);
                abyte0 = d1.d;
                i1 = j1 + 1;
                k1 = r.a(abyte0, j1);
                j1 = r.a(d1.d, i1);
                i1++;
            } else
            {
                i2 = r.b(d1.d, i1);
                i1 += 2;
                l1 = r.b(d1.d, i1);
                i1 += 2;
                k1 = r.b(d1.d, i1);
                i1 += 2;
                j1 = r.b(d1.d, i1);
                i1 += 2;
            }
            k2 = r.b(d1.d, i1);
            ai = j;
            l2 = l + 1;
            ai[l] = i2;
            ai = j;
            l = l2 + 1;
            ai[l2] = l1;
            ai = j;
            l1 = l + 1;
            ai[l] = k1;
            ai = j;
            l = l1 + 1;
            ai[l1] = j1;
            j[l] = k2;
            k++;
            l++;
            i1 += 2;
        }
    }
}
