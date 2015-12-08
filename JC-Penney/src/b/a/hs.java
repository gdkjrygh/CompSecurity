// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;

// Referenced classes of package b.a:
//            gr, gl, pe, nj, 
//            nh, ow, hj

public final class hs extends gr
{

    public static final gr b = new hs();

    private hs()
    {
    }

    public final int a()
    {
        return 1;
    }

    public final String a(gl gl1)
    {
        gl1 = gl1.f;
        int i = ((pe) (gl1)).K.length;
        return (new StringBuilder()).append(gl1.b(i - 2).k()).append(", ").append(gl1.b(i - 1).k()).toString();
    }

    public final void a(ow ow1, gl gl1)
    {
        nj nj1 = gl1.f;
        int i = ((pe) (nj1)).K.length;
        ow1.c(a(gl1, b(nj1.b(i - 2).e(), nj1.b(i - 1).e())));
    }

    public final String b(gl gl1, boolean flag)
    {
        return "";
    }

    public final boolean b(gl gl1)
    {
        nh nh1;
        nj nj1;
        if (!(gl1 instanceof hj))
        {
            return false;
        }
        nj1 = gl1.f;
        switch (((pe) (nj1)).K.length)
        {
        default:
            return false;

        case 3: // '\003'
            break MISSING_BLOCK_LABEL_82;

        case 2: // '\002'
            gl1 = nj1.b(0);
            nh1 = nj1.b(1);
            break;
        }
_L1:
        nh nh2;
        return a(gl1.e()) && a(nh1.e());
        nh2 = nj1.b(1);
        nh1 = nj1.b(2);
        gl1 = nh2;
        if (nh2.e() != nj1.b(0).e())
        {
            return false;
        }
          goto _L1
    }

    public final BitSet c(gl gl1)
    {
        gl1 = gl1.f;
        BitSet bitset = new BitSet(2);
        bitset.set(0, a(gl1.b(0).e()));
        bitset.set(1, a(gl1.b(1).e()));
        return bitset;
    }

}
