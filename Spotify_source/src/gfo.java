// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;

public final class gfo
    implements dmx, gfn
{

    private long b;

    public gfo()
    {
        b = 0x8000000000000000L;
    }

    public final void a(Throwable throwable)
    {
        long l = SystemClock.elapsedRealtime();
        if (l > b + 30000L)
        {
            gfr gfr1 = (gfr)dmz.a(gfr);
            if (gmm.a() && gya.c())
            {
                gfr1.a();
                akk.d().a.a(throwable);
            }
            b = l;
        }
    }
}
