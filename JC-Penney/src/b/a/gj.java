// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            hc, gm, hd, gv, 
//            gc, gf

public final class gj
{

    public final int a;
    public hc b;
    public gc c;
    public gf d;
    public hd e;
    public gv f;
    private gm g;

    public gj(int i, hc hc1, gc gc1)
    {
        if (hc1 == null)
        {
            throw new NullPointerException("unprocessedInsns == null");
        }
        if (gc1 == null)
        {
            throw new NullPointerException("unprocessedCatches == null");
        } else
        {
            a = i;
            b = hc1;
            c = gc1;
            d = null;
            e = null;
            f = null;
            g = null;
            return;
        }
    }

    public final void a()
    {
        if (g != null)
        {
            return;
        }
        hc hc1 = b;
        if (hc1.e >= 0)
        {
            throw new UnsupportedOperationException("already processed");
        } else
        {
            gn agn[] = hc1.a();
            hc1.a(agn);
            hc1.b(agn);
            hc1.b();
            java.util.ArrayList arraylist = hc1.b;
            int i = hc1.e;
            g = gm.a(arraylist, hc1.a + i);
            e = hd.a(g, a);
            f = gv.a(g);
            d = c.a();
            b = null;
            c = null;
            return;
        }
    }

    public final gm b()
    {
        a();
        return g;
    }
}
