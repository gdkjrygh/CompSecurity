// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.cast.internal:
//            c

private final class <init>
    implements Runnable
{

    final c a;

    public final void run()
    {
        a.e = false;
        long l = SystemClock.elapsedRealtime();
        boolean flag = a.a(l);
        a.a(flag);
    }

    private (c c1)
    {
        a = c1;
        super();
    }

    a(c c1, byte byte0)
    {
        this(c1);
    }
}
