// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj.chunks;

import ar.com.hjg.pngj.m;
import ar.com.hjg.pngj.r;
import ar.com.hjg.pngj.v;
import ar.com.hjg.pngj.x;
import java.io.ByteArrayInputStream;

// Referenced classes of package ar.com.hjg.pngj.chunks:
//            z, d

public final class p extends z
{

    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;

    public p(m m1)
    {
        super("IHDR", m1);
    }

    public final void a(d d1)
    {
        if (d1.a != 13)
        {
            throw new v((new StringBuilder("Bad IDHR len ")).append(d1.a).toString());
        } else
        {
            d1 = new ByteArrayInputStream(d1.d);
            h = r.b(d1);
            i = r.b(d1);
            j = r.a(d1);
            k = r.a(d1);
            l = r.a(d1);
            m = r.a(d1);
            n = r.a(d1);
            return;
        }
    }

    public final int b()
    {
        return h;
    }

    public final int c()
    {
        return i;
    }

    public final int d()
    {
        return j;
    }

    public final int e()
    {
        return k;
    }

    public final int f()
    {
        return n;
    }

    public final void g()
    {
        if (h <= 0 || i <= 0 || l != 0 || m != 0)
        {
            throw new x("bad IHDR: col/row/compmethod/filmethod invalid");
        }
        if (j != 1 && j != 2 && j != 4 && j != 8 && j != 16)
        {
            throw new x("bad IHDR: bitdepth invalid");
        }
        if (n < 0 || n > 1)
        {
            throw new x("bad IHDR: interlace invalid");
        }
        switch (k)
        {
        case 1: // '\001'
        case 5: // '\005'
        default:
            throw new x("bad IHDR: invalid colormodel");

        case 0: // '\0'
            break;

        case 3: // '\003'
            if (j == 16)
            {
                throw new x("bad IHDR: bitdepth invalid");
            }
            break;

        case 2: // '\002'
        case 4: // '\004'
        case 6: // '\006'
            if (j != 8 && j != 16)
            {
                throw new x("bad IHDR: bitdepth invalid");
            }
            break;
        }
    }
}
