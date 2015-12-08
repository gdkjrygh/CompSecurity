// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import com.google.android.gms.common.internal.zzaa;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.api:
//            zzd

static class zzNj extends com.google.android.gms.common.internal.
{

    private WeakReference zzNj;

    public void zzb(zzaa zzaa)
    {
        zzd zzd1 = (zzd)zzNj.get();
        if (zzd1 != null)
        {
            zzd.zza(zzd1, zzaa);
        }
    }

    a(zzd zzd1)
    {
        zzNj = new WeakReference(zzd1);
    }
}
