// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;

final class mxa
    implements Runnable, mwz
{

    final Runnable a;
    final mwx b;
    private final long c;
    private pux d;

    mxa(mwx mwx1, Runnable runnable, long l)
    {
        b = mwx1;
        super();
        a = runnable;
        c = l;
    }

    public final void a()
    {
        d = pux.a();
        b.a(this, c);
    }

    public final void b()
    {
        b.w().removeCallbacks(this);
        mwx.b(b, this);
    }

    public final void run()
    {
        pux.a(d, new mxb(this)).run();
    }
}
