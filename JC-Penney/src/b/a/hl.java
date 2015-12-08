// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            gp, gl, gn, go, 
//            gh, no, nj

public final class hl extends gp
{

    gh a;

    public hl(gn gn1, no no, nj nj, gh gh1)
    {
        super(gn1, no, nj);
        if (gh1 == null)
        {
            throw new NullPointerException("target == null");
        } else
        {
            a = gh1;
            return;
        }
    }

    public final gl a(gn gn1)
    {
        return new hl(gn1, super.e, super.f, a);
    }

    public final gl a(nj nj)
    {
        return new hl(super.d, super.e, nj, a);
    }

    public final hl a(gh gh1)
    {
        gn gn1 = super.d;
        gn1.a;
        JVM INSTR tableswitch 50 61: default 72
    //                   50 96
    //                   51 118
    //                   52 125
    //                   53 132
    //                   54 139
    //                   55 146
    //                   56 153
    //                   57 160
    //                   58 167
    //                   59 174
    //                   60 181
    //                   61 188;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L1:
        throw new IllegalArgumentException((new StringBuilder("bogus opcode: ")).append(gn1).toString());
_L2:
        gn1 = go.aa;
_L15:
        return new hl(gn1, super.e, super.f, gh1);
_L3:
        gn1 = go.Z;
        continue; /* Loop/switch isn't completed */
_L4:
        gn1 = go.ac;
        continue; /* Loop/switch isn't completed */
_L5:
        gn1 = go.ab;
        continue; /* Loop/switch isn't completed */
_L6:
        gn1 = go.ae;
        continue; /* Loop/switch isn't completed */
_L7:
        gn1 = go.ad;
        continue; /* Loop/switch isn't completed */
_L8:
        gn1 = go.ag;
        continue; /* Loop/switch isn't completed */
_L9:
        gn1 = go.af;
        continue; /* Loop/switch isn't completed */
_L10:
        gn1 = go.ai;
        continue; /* Loop/switch isn't completed */
_L11:
        gn1 = go.ah;
        continue; /* Loop/switch isn't completed */
_L12:
        gn1 = go.ak;
        continue; /* Loop/switch isn't completed */
_L13:
        gn1 = go.aj;
        if (true) goto _L15; else goto _L14
_L14:
    }

    protected final String a()
    {
        if (a == null)
        {
            return "????";
        } else
        {
            return a.e();
        }
    }

    public final int b()
    {
        return a.d() - d();
    }

    public final boolean g()
    {
        return c() && a.c();
    }
}
