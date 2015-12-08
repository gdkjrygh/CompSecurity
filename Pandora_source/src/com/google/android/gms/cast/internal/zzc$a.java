// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.cast.internal:
//            zzc

private class <init>
    implements Runnable
{

    final zzc a;

    public void run()
    {
        a.zzNt = false;
        long l = SystemClock.elapsedRealtime();
        boolean flag = a.zzx(l);
        a.zzM(flag);
    }

    private (zzc zzc1)
    {
        a = zzc1;
        super();
    }

    a(zzc zzc1, a a1)
    {
        this(zzc1);
    }
}
