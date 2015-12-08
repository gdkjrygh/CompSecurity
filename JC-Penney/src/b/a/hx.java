// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;

// Referenced classes of package b.a:
//            gr, gl, nj, nh, 
//            hl, pe, ow

public final class hx extends gr
{

    public static final gr b = new hx();

    private hx()
    {
    }

    public final int a()
    {
        return 2;
    }

    public final String a(gl gl1)
    {
        nj nj1 = gl1.f;
        return (new StringBuilder()).append(nj1.b(0).k()).append(", ").append(d(gl1)).toString();
    }

    public final void a(ow ow, gl gl1)
    {
        nj nj1 = gl1.f;
        int i = ((hl)gl1).b();
        a(ow, a(gl1, nj1.b(0).e()), (short)i);
    }

    public final boolean a(hl hl1)
    {
        int i = hl1.b();
        return i != 0 && d(i);
    }

    public final String b(gl gl1, boolean flag)
    {
        return e(gl1);
    }

    public final boolean b(gl gl1)
    {
        boolean flag = true;
        nj nj1 = gl1.f;
        if (!(gl1 instanceof hl) || ((pe) (nj1)).K.length != 1 || !c(nj1.b(0).e()))
        {
            flag = false;
        } else
        {
            gl1 = (hl)gl1;
            if (gl1.g())
            {
                return a(gl1);
            }
        }
        return flag;
    }

    public final BitSet c(gl gl1)
    {
        gl1 = gl1.f;
        BitSet bitset = new BitSet(1);
        bitset.set(0, c(gl1.b(0).e()));
        return bitset;
    }

}
