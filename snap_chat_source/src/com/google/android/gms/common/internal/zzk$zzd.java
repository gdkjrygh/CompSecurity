// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzk, zzx

public static final class zzPV extends zzPV
{

    private zzk zzPV;

    private void zzji()
    {
        zzPV = null;
    }

    public final void zzb(int i, IBinder ibinder, Bundle bundle)
    {
        zzx.zzb(zzPV, "onPostInitComplete can be called only once per call to getRemoteService");
        zzPV.zza(i, ibinder, bundle);
        zzji();
    }

    public final void zzc(int i, Bundle bundle)
    {
        zzx.zzb(zzPV, "onAccountValidationComplete can be called only once per call to validateAccount");
        zzPV.zzb(i, bundle);
        zzji();
    }

    public (zzk zzk1)
    {
        zzPV = zzk1;
    }
}
