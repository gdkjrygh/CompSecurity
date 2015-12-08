// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;

// Referenced classes of package b.a:
//            gr, gl, nj, nh, 
//            hj, pe, ow

public final class ie extends gr
{

    public static final gr b = new ie();

    private ie()
    {
    }

    public final int a()
    {
        return 2;
    }

    public final String a(gl gl1)
    {
        gl1 = gl1.f;
        return (new StringBuilder()).append(gl1.b(0).k()).append(", ").append(gl1.b(1).k()).append(", ").append(gl1.b(2).k()).toString();
    }

    public final void a(ow ow, gl gl1)
    {
        nj nj1 = gl1.f;
        a(ow, a(gl1, nj1.b(0).e()), a(nj1.b(1).e(), nj1.b(2).e()));
    }

    public final String b(gl gl1, boolean flag)
    {
        return "";
    }

    public final boolean b(gl gl1)
    {
        nj nj1 = gl1.f;
        return (gl1 instanceof hj) && ((pe) (nj1)).K.length == 3 && c(nj1.b(0).e()) && c(nj1.b(1).e()) && c(nj1.b(2).e());
    }

    public final BitSet c(gl gl1)
    {
        gl1 = gl1.f;
        BitSet bitset = new BitSet(3);
        bitset.set(0, c(gl1.b(0).e()));
        bitset.set(1, c(gl1.b(1).e()));
        bitset.set(2, c(gl1.b(2).e()));
        return bitset;
    }

}
