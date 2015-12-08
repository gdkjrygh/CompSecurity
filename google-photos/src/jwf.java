// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;

final class jwf
    implements Runnable
{

    private jwe a;

    jwf(jwe jwe1)
    {
        a = jwe1;
        super();
    }

    public final void run()
    {
        a.a = false;
        long l = SystemClock.elapsedRealtime();
        boolean flag = a.a(l);
        a.a(flag);
    }
}
