// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            eg

private static final class rO
{

    private long rN;
    private long rO;

    public long bE()
    {
        return rO;
    }

    public void bF()
    {
        rO = SystemClock.elapsedRealtime();
    }

    public void bG()
    {
        rN = SystemClock.elapsedRealtime();
    }

    public Bundle toBundle()
    {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", rN);
        bundle.putLong("tclose", rO);
        return bundle;
    }

    public ()
    {
        rN = -1L;
        rO = -1L;
    }
}
