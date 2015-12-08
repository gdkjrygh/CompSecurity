// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Looper;

final class ouf
    implements osj
{

    final jif a;
    final jif b;
    final Looper c;
    private Handler d;

    ouf(oue oue, jif jif, jif jif1, Looper looper)
    {
        a = jif;
        b = jif1;
        c = looper;
        super();
        d = new oug(this);
    }

    public final void a(osb osb1)
    {
        if (osb1.b() != null)
        {
            osb1 = String.valueOf(osb1.b());
            orw.a((new StringBuilder(String.valueOf(osb1).length() + 35)).append("Audioswap mixing ended with error: ").append(osb1).toString());
        }
        d.sendEmptyMessage(1);
    }
}
