// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.zzut;
import com.google.android.gms.internal.zzuv;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.api:
//            zzd

static class zzNj extends zzuv
{

    private WeakReference zzNj;

    public void zza(ConnectionResult connectionresult, zzut zzut)
    {
        zzut = (zzd)zzNj.get();
        if (zzut != null)
        {
            zzd.zzc(zzut, connectionresult);
        }
    }

    sult(zzd zzd1)
    {
        zzNj = new WeakReference(zzd1);
    }
}
