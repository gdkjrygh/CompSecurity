// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;

final class bpk
    implements Runnable
{

    private bpj a;

    private bpk(bpj bpj1)
    {
        a = bpj1;
        super();
    }

    bpk(bpj bpj1, byte byte0)
    {
        this(bpj1);
    }

    public final void run()
    {
        a.a = false;
        long l = SystemClock.elapsedRealtime();
        boolean flag = a.a(l);
        a.a(flag);
    }
}
