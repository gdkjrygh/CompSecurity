// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class fye extends nzc
{

    private qhj a;
    private hto b;

    fye(Context context, int i, hto hto1)
    {
        super(context, new nyg(context, i), "registerphotosuser", new pct(), new pcu());
        b = hto1;
    }

    static fyd a(fye fye1)
    {
        if (fye1.a == null) goto _L2; else goto _L1
_L1:
        fye1.a.a;
        JVM INSTR tableswitch 1 3: default 40
    //                   1 48
    //                   2 44
    //                   3 44;
           goto _L2 _L3 _L4 _L4
_L2:
        return fyd.c;
_L4:
        return fyd.b;
_L3:
        return fyd.a;
    }

    protected final void a(qlw qlw)
    {
        qlw = (pct)qlw;
        qlw.a = new qhi();
        qlw = ((pct) (qlw)).a;
        int i;
        if (b == hto.b)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        qlw.a = i;
    }

    protected final void b(qlw qlw)
    {
        a = ((pcu)qlw).a;
    }
}
