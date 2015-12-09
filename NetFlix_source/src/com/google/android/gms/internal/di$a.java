// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            di

private static final class qI
{

    private long qH;
    private long qI;

    public long bn()
    {
        return qI;
    }

    public void bo()
    {
        qI = SystemClock.elapsedRealtime();
    }

    public void bp()
    {
        qH = SystemClock.elapsedRealtime();
    }

    public Bundle toBundle()
    {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", qH);
        bundle.putLong("tclose", qI);
        return bundle;
    }

    public ()
    {
        qH = -1L;
        qI = -1L;
    }
}
