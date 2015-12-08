// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj.chunks;

import ar.com.hjg.pngj.v;

// Referenced classes of package ar.com.hjg.pngj.chunks:
//            z, d, a

public final class m extends z
{

    private String h;
    private byte i[];

    public m(ar.com.hjg.pngj.m m1)
    {
        super("iCCP", m1);
    }

    public final void a(d d1)
    {
        int j = ar.com.hjg.pngj.chunks.a.c(d1.d);
        h = ar.com.hjg.pngj.chunks.a.a(d1.d, 0, j);
        if ((d1.d[j + 1] & 0xff) != 0)
        {
            throw new v("bad compression for ChunkTypeICCP");
        } else
        {
            int k = d1.d.length - (j + 2);
            i = new byte[k];
            System.arraycopy(d1.d, j + 2, i, 0, k);
            return;
        }
    }
}
