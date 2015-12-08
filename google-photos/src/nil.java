// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class nil extends nzc
{

    private final int a = 0;
    private final pmv b;
    private final pnc c[];
    private final boolean d;
    private final boolean e;

    nil(Context context, String s, String s1, int i, pmv pmv, pnc apnc[], boolean flag, 
            boolean flag1)
    {
        super(context, new nyg(s, s1), "mobileoutofboxflow", new pbz(), new pca());
        b = pmv;
        c = apnc;
        d = flag;
        e = flag1;
    }

    protected final void a(qlw qlw)
    {
        qlw = (pbz)qlw;
        png png1 = new png();
        qlw.a = png1;
        ((pbz) (qlw)).a.e = Boolean.valueOf(d);
        png1.d = 3;
        png1.c = a;
        png1.b = b;
        png1.a = c;
        png1.f = Boolean.valueOf(e);
    }
}
