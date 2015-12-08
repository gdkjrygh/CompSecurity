// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzk, zzx

public final class <init> extends <init>
{

    final zzk zzPT;

    protected final boolean zzje()
    {
        boolean flag;
        if (zzk.zzc(zzPT) && zzk.zzd(zzPT) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzx.zza(flag, "PostValidationCallback should not happen when mReportProgress is false ormConnectionProgressReportCallbacks is null");
        zzk.zzd(zzPT).zzib();
        return true;
    }

    public nt.zza(zzk zzk1, int i, Bundle bundle)
    {
        zzPT = zzk1;
        super(zzk1, i, bundle);
    }
}
