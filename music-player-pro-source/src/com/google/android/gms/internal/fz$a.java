// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            fz

private static final class vW
{

    private long vV;
    private long vW;

    public long cZ()
    {
        return vW;
    }

    public void da()
    {
        vW = SystemClock.elapsedRealtime();
    }

    public void db()
    {
        vV = SystemClock.elapsedRealtime();
    }

    public Bundle toBundle()
    {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", vV);
        bundle.putLong("tclose", vW);
        return bundle;
    }

    public ()
    {
        vV = -1L;
        vW = -1L;
    }
}
