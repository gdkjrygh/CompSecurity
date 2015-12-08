// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            eh

private static final class rL
{

    private long rK;
    private long rL;

    public void bA()
    {
        rL = SystemClock.elapsedRealtime();
    }

    public void bB()
    {
        rK = SystemClock.elapsedRealtime();
    }

    public long bz()
    {
        return rL;
    }

    public Bundle toBundle()
    {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", rK);
        bundle.putLong("tclose", rL);
        return bundle;
    }

    public ()
    {
        rK = -1L;
        rL = -1L;
    }
}
