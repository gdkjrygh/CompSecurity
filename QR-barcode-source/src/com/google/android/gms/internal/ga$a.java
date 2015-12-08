// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            ga

private static final class vI
{

    private long vH;
    private long vI;

    public long cR()
    {
        return vI;
    }

    public void cS()
    {
        vI = SystemClock.elapsedRealtime();
    }

    public void cT()
    {
        vH = SystemClock.elapsedRealtime();
    }

    public Bundle toBundle()
    {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", vH);
        bundle.putLong("tclose", vI);
        return bundle;
    }

    public ()
    {
        vH = -1L;
        vI = -1L;
    }
}
