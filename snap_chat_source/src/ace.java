// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ace extends abP
{

    abI a;

    public ace(abN abn, adZ adz, adU adu, abI abi)
    {
        super(abn, adz, adu);
        if (abi == null)
        {
            throw new NullPointerException("target == null");
        } else
        {
            a = abi;
            return;
        }
    }

    public final abL a(abN abn)
    {
        return new ace(abn, super.d, super.e, a);
    }

    public final abL a(adU adu)
    {
        return new ace(super.c, super.d, adu, a);
    }

    public final ace a(abI abi)
    {
        abN abn = super.c;
        abn.a;
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
        throw new IllegalArgumentException((new StringBuilder("bogus opcode: ")).append(abn).toString());
_L2:
        abn = abO.P;
_L15:
        return new ace(abn, super.d, super.e, abi);
_L3:
        abn = abO.O;
        continue; /* Loop/switch isn't completed */
_L4:
        abn = abO.R;
        continue; /* Loop/switch isn't completed */
_L5:
        abn = abO.Q;
        continue; /* Loop/switch isn't completed */
_L6:
        abn = abO.T;
        continue; /* Loop/switch isn't completed */
_L7:
        abn = abO.S;
        continue; /* Loop/switch isn't completed */
_L8:
        abn = abO.V;
        continue; /* Loop/switch isn't completed */
_L9:
        abn = abO.U;
        continue; /* Loop/switch isn't completed */
_L10:
        abn = abO.X;
        continue; /* Loop/switch isn't completed */
_L11:
        abn = abO.W;
        continue; /* Loop/switch isn't completed */
_L12:
        abn = abO.Z;
        continue; /* Loop/switch isn't completed */
_L13:
        abn = abO.Y;
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
