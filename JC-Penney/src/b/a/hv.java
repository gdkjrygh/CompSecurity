// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;

// Referenced classes of package b.a:
//            gr, gl, gi, oi, 
//            nj, nh, pe, ow

public final class hv extends gr
{

    public static final gr b = new hv();

    private hv()
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
        return (new StringBuilder()).append(nj1.b(0).k()).append(", ").append(a(((oi) (gl1)))).toString();
    }

    public final void a(ow ow, gl gl1)
    {
        nj nj1 = gl1.f;
        oi oi1 = (oi)((gi)gl1).a;
        short word0;
        if (nj1.b(0).i() == 1)
        {
            word0 = (short)(oi1.g() >>> 16);
        } else
        {
            word0 = (short)(int)(oi1.h() >>> 48);
        }
        a(ow, a(gl1, nj1.b(0).e()), word0);
    }

    public final String b(gl gl1, boolean flag)
    {
        nj nj1 = gl1.f;
        gl1 = (oi)((gi)gl1).a;
        byte byte0;
        if (nj1.b(0).i() == 1)
        {
            byte0 = 32;
        } else
        {
            byte0 = 64;
        }
        return a(gl1, byte0);
    }

    public final boolean b(gl gl1)
    {
        nj nj1 = gl1.f;
        if (!(gl1 instanceof gi) || ((pe) (nj1)).K.length != 1 || !c(nj1.b(0).e()))
        {
            return false;
        }
        gl1 = ((gi)gl1).a;
        if (!(gl1 instanceof oi))
        {
            return false;
        }
        gl1 = (oi)gl1;
        if (nj1.b(0).i() == 1)
        {
            return (gl1.g() & 0xffff) == 0;
        }
        return (gl1.h() & 0xffffffffffffL) == 0L;
    }

    public final BitSet c(gl gl1)
    {
        gl1 = gl1.f;
        BitSet bitset = new BitSet(1);
        bitset.set(0, c(gl1.b(0).e()));
        return bitset;
    }

}
