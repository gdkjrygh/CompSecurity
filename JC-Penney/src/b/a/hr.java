// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;

// Referenced classes of package b.a:
//            gr, gl, nj, nh, 
//            ow, hj, pe

public final class hr extends gr
{

    public static final gr b = new hr();

    private hr()
    {
    }

    public final int a()
    {
        return 1;
    }

    public final String a(gl gl1)
    {
        return gl1.f.b(0).k();
    }

    public final void a(ow ow1, gl gl1)
    {
        ow1.c(a(gl1, gl1.f.b(0).e()));
    }

    public final String b(gl gl1, boolean flag)
    {
        return "";
    }

    public final boolean b(gl gl1)
    {
        nj nj1 = gl1.f;
        return (gl1 instanceof hj) && ((pe) (nj1)).K.length == 1 && c(nj1.b(0).e());
    }

    public final BitSet c(gl gl1)
    {
        gl1 = gl1.f;
        BitSet bitset = new BitSet(1);
        bitset.set(0, c(gl1.b(0).e()));
        return bitset;
    }

}
