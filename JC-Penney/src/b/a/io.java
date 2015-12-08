// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;

// Referenced classes of package b.a:
//            gr, gl, nj, nh, 
//            gi, pe, op, ob, 
//            ow

public final class io extends gr
{

    public static final gr b = new io();

    private io()
    {
    }

    public final int a()
    {
        return 5;
    }

    public final String a(gl gl1)
    {
        nj nj1 = gl1.f;
        return (new StringBuilder()).append(nj1.b(0).k()).append(", ").append(nj1.b(1).k()).append(", ").append(f(gl1)).toString();
    }

    public final void a(ow ow, gl gl1)
    {
        nj nj1 = gl1.f;
        int i = ((gi)gl1).b();
        a(ow, h(gl1), i, (short)nj1.b(0).e(), (short)nj1.b(1).e());
    }

    public final String b(gl gl1, boolean flag)
    {
        if (flag)
        {
            return g(gl1);
        } else
        {
            return "";
        }
    }

    public final boolean b(gl gl1)
    {
        if (a)
        {
            nj nj1 = gl1.f;
            if ((gl1 instanceof gi) && ((pe) (nj1)).K.length == 2 && e(nj1.b(0).e()) && e(nj1.b(1).e()))
            {
                gl1 = ((gi)gl1).a;
                if ((gl1 instanceof op) || (gl1 instanceof ob))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public final BitSet c(gl gl1)
    {
        gl1 = gl1.f;
        BitSet bitset = new BitSet(2);
        bitset.set(0, e(gl1.b(0).e()));
        bitset.set(1, e(gl1.b(1).e()));
        return bitset;
    }

}
