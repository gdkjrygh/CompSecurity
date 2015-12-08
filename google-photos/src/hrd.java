// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.RecyclerView;

public final class hrd
    implements ftx, nuc, omb, opn, opv
{

    public final nud a = new ntz(this);
    public hrc b;
    private final Handler c = new Handler(Looper.getMainLooper());
    private noz d;
    private hrc e;
    private int f;
    private final Runnable g = new hre(this);

    public hrd(opd opd1)
    {
        b = hrc.c;
        e = hrc.c;
        opd1.a(this);
    }

    private void a(hrc hrc1)
    {
        if (d.a())
        {
            noy.a("previous", b);
            noy.a("new", hrc1);
        }
        b = hrc1;
        a.b();
    }

    static void a(hrd hrd1, hrc hrc1)
    {
        hrd1.a(hrc1);
    }

    private void b()
    {
        c.removeCallbacks(g);
    }

    public final hrd a(olm olm1)
    {
        olm1.a(hrd, this);
        olm1.b(ftx, this);
        return this;
    }

    public final nud a()
    {
        return a;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = noz.a(context, 2, "Speedometer", new String[0]);
    }

    public final void a(RecyclerView recyclerview, int i)
    {
        if (i == 0 && b != hrc.c)
        {
            b();
            a(hrc.c);
        }
    }

    public final void b(RecyclerView recyclerview, int i)
    {
        recyclerview = hrc.a(Math.abs(i));
        if (recyclerview == e) goto _L2; else goto _L1
_L1:
        f = 1;
        e = recyclerview;
_L4:
        b();
        c.postDelayed(g, 50L);
        return;
_L2:
        i = f + 1;
        f = i;
        if (i >= 5 && recyclerview != b)
        {
            a(recyclerview);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void c()
    {
        b();
    }
}
