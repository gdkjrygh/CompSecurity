// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            zzhb

private static final class zzFD
{

    private long zzFC;
    private long zzFD;

    public Bundle toBundle()
    {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", zzFC);
        bundle.putLong("tclose", zzFD);
        return bundle;
    }

    public long zzfS()
    {
        return zzFD;
    }

    public void zzfT()
    {
        zzFD = SystemClock.elapsedRealtime();
    }

    public void zzfU()
    {
        zzFC = SystemClock.elapsedRealtime();
    }

    public ()
    {
        zzFC = -1L;
        zzFD = -1L;
    }
}
