// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;

// Referenced classes of package b.a:
//            gr, gl, nj, nh, 
//            gi, pe, op, ob, 
//            oo, ow

public final class ig extends gr
{

    public static final gr b = new ig();

    private ig()
    {
    }

    public final int a()
    {
        return 3;
    }

    public final String a(gl gl1)
    {
        nj nj1 = gl1.f;
        return (new StringBuilder()).append(nj1.b(0).k()).append(", ").append(f(gl1)).toString();
    }

    public final void a(ow ow, gl gl1)
    {
        nj nj1 = gl1.f;
        int i = ((gi)gl1).b();
        a(ow, a(gl1, nj1.b(0).e()), i);
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
        nj nj1;
        if (!(gl1 instanceof gi))
        {
            return false;
        }
        nj1 = gl1.f;
        ((pe) (nj1)).K.length;
        JVM INSTR tableswitch 1 2: default 44
    //                   1 46
    //                   2 65;
           goto _L1 _L2 _L3
_L1:
        return false;
_L2:
        nh nh1 = nj1.b(0);
_L5:
        if (!c(nh1.e()))
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
_L3:
        nh nh2 = nj1.b(0);
        nh1 = nh2;
        if (nh2.e() != nj1.b(1).e())
        {
            return false;
        }
        if (true) goto _L5; else goto _L4
_L4:
        gl1 = ((gi)gl1).a;
        return (gl1 instanceof op) || (gl1 instanceof ob) || (gl1 instanceof oo);
    }

    public final BitSet c(gl gl1)
    {
        gl1 = gl1.f;
        int i = ((pe) (gl1)).K.length;
        BitSet bitset = new BitSet(i);
        boolean flag = c(gl1.b(0).e());
        if (i == 1)
        {
            bitset.set(0, flag);
        } else
        if (gl1.b(0).e() == gl1.b(1).e())
        {
            bitset.set(0, flag);
            bitset.set(1, flag);
            return bitset;
        }
        return bitset;
    }

}
