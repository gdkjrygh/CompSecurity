// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;

// Referenced classes of package b.a:
//            gr, gl, gi, oi, 
//            nj, nh, pe, ow

public final class hy extends gr
{

    public static final gr b = new hy();

    private hy()
    {
    }

    public final int a()
    {
        return 2;
    }

    public final String a(gl gl1)
    {
        nj nj1 = gl1.f;
        gl1 = (oi)((gi)gl1).a;
        return (new StringBuilder()).append(nj1.b(0).k()).append(", ").append(nj1.b(1).k()).append(", ").append(a(((oi) (gl1)))).toString();
    }

    public final void a(ow ow, gl gl1)
    {
        nj nj1 = gl1.f;
        int i = ((oi)((gi)gl1).a).g();
        a(ow, a(gl1, nj1.b(0).e()), a(nj1.b(1).e(), i & 0xff));
    }

    public final String b(gl gl1, boolean flag)
    {
        return a((oi)((gi)gl1).a, 8);
    }

    public final boolean b(gl gl1)
    {
        nj nj1 = gl1.f;
        if (!(gl1 instanceof gi) || ((pe) (nj1)).K.length != 2 || !c(nj1.b(0).e()) || !c(nj1.b(1).e()))
        {
            return false;
        }
        gl1 = ((gi)gl1).a;
        if (!(gl1 instanceof oi))
        {
            return false;
        }
        gl1 = (oi)gl1;
        return gl1.k_() && b(gl1.g());
    }

    public final BitSet c(gl gl1)
    {
        gl1 = gl1.f;
        BitSet bitset = new BitSet(2);
        bitset.set(0, c(gl1.b(0).e()));
        bitset.set(1, c(gl1.b(1).e()));
        return bitset;
    }

}
