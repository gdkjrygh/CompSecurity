// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;

final class pd
{

    private long a;
    private long b;

    public pd()
    {
        a = -1L;
        b = -1L;
    }

    public final long a()
    {
        return b;
    }

    public final void b()
    {
        b = SystemClock.elapsedRealtime();
    }

    public final void c()
    {
        a = SystemClock.elapsedRealtime();
    }

    public final Bundle d()
    {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", a);
        bundle.putLong("tclose", b);
        return bundle;
    }
}
