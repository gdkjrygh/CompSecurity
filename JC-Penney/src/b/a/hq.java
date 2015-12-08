// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;

// Referenced classes of package b.a:
//            gr, gl, gi, oi, 
//            nj, nh, ow, pe

public final class hq extends gr
{

    public static final gr b = new hq();

    private hq()
    {
    }

    public final int a()
    {
        return 1;
    }

    public final String a(gl gl1)
    {
        nj nj1 = gl1.f;
        gl1 = (oi)((gi)gl1).a;
        return (new StringBuilder()).append(nj1.b(0).k()).append(", ").append(a(((oi) (gl1)))).toString();
    }

    public final void a(ow ow1, gl gl1)
    {
        nj nj1 = gl1.f;
        int i = ((oi)((gi)gl1).a).g();
        ow1.c(a(gl1, b(nj1.b(0).e(), i & 0xf)));
    }

    public final String b(gl gl1, boolean flag)
    {
        return a((oi)((gi)gl1).a, 4);
    }

    public final boolean b(gl gl1)
    {
        nj nj1 = gl1.f;
        if (!(gl1 instanceof gi) || ((pe) (nj1)).K.length != 1 || !a(nj1.b(0).e()))
        {
            return false;
        }
        gl1 = ((gi)gl1).a;
        if (!(gl1 instanceof oi))
        {
            return false;
        }
        gl1 = (oi)gl1;
        if (gl1.k_())
        {
            int i = gl1.g();
            boolean flag;
            if (i >= -8 && i <= 7)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    public final BitSet c(gl gl1)
    {
        gl1 = gl1.f;
        BitSet bitset = new BitSet(1);
        bitset.set(0, a(gl1.b(0).e()));
        return bitset;
    }

}
