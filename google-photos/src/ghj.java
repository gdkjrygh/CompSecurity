// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.os.Handler;
import com.google.android.libraries.material.butterfly.ButterflyView;

public final class ghj
    implements oou, opn, opt, opu, opv
{

    final Animator a;
    final long b;
    boolean c;
    long d;
    final Runnable e = new ghk(this);
    private boolean f;

    private ghj(ButterflyView butterflyview, opd opd1)
    {
        a = butterflyview.b;
        b = butterflyview.a.a();
        opd1.a(this);
        a.addListener(new ghl(this));
    }

    public static void a(ButterflyView butterflyview, opd opd1)
    {
        new ghj(butterflyview, opd1);
    }

    public final void V_()
    {
        c = false;
        f = a.isStarted();
        a.cancel();
        Runnable runnable = e;
        b.w().removeCallbacks(runnable);
    }

    public final void X_()
    {
        c = true;
        if (f)
        {
            a.cancel();
            a.start();
        }
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            a.cancel();
            a.start();
            return;
        } else
        {
            a.cancel();
            return;
        }
    }

    public final void c()
    {
        a.cancel();
    }
}
