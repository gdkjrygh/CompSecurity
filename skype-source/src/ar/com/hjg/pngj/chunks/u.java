// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj.chunks;

import ar.com.hjg.pngj.m;
import ar.com.hjg.pngj.v;

// Referenced classes of package ar.com.hjg.pngj.chunks:
//            z, d

public final class u extends z
{

    private int h;
    private int i[];

    public u(m m)
    {
        super("PLTE", m);
        h = 0;
    }

    public final void a(d d1)
    {
        h = d1.a / 3;
        if (h <= 0 || h > 256)
        {
            throw new v((new StringBuilder("invalid pallette - nentries=")).append(h).toString());
        }
        if (i == null || i.length != h)
        {
            i = new int[h];
        }
        int j = 0;
        for (int k = 0; j < h; k++)
        {
            byte abyte0[] = d1.d;
            int l = k + 1;
            byte byte0 = abyte0[k];
            abyte0 = d1.d;
            k = l + 1;
            l = abyte0[l];
            byte byte1 = d1.d[k];
            i[j] = (byte0 & 0xff) << 16 | (l & 0xff) << 8 | byte1 & 0xff;
            j++;
        }

    }

    public final int b()
    {
        return h;
    }

    public final int b(int j)
    {
        return i[j];
    }
}
