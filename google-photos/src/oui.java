// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;

final class oui
    implements jih
{

    private jif a;
    private jif b;
    private Looper c;
    private oue d;

    oui(oue oue1, jif jif1, jif jif2, Looper looper)
    {
        d = oue1;
        a = jif1;
        b = jif2;
        c = looper;
        super();
    }

    public final void a(jie jie1)
    {
        oue.a(d, jie1);
        jie1 = String.valueOf(jie1.toString());
        if (jie1.length() != 0)
        {
            jie1 = "audioSwapPlayer triggered onPlayerError: ".concat(jie1);
        } else
        {
            jie1 = new String("audioSwapPlayer triggered onPlayerError: ");
        }
        orw.a(jie1);
        a.c();
        a.d();
        b.d();
        c.quit();
    }

    public final void a(boolean flag, int i)
    {
    }

    public final void z_()
    {
    }
}
