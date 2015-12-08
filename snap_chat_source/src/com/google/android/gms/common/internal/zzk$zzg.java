// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;


// Referenced classes of package com.google.android.gms.common.internal:
//            zzk, zzx

public final class <init> extends <init>
{

    final zzk zzPT;

    protected final boolean zzje()
    {
        if (zzk.zzc(zzPT))
        {
            boolean flag;
            if (zzk.zzd(zzPT) != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzx.zza(flag, "mConnectionProgressReportCallbacks should not be null if mReportProgress");
            zzk.zzd(zzPT).zzia();
            return true;
        } else
        {
            zzPT.zzb(null);
            return true;
        }
    }

    public nt.zza(zzk zzk1)
    {
        zzPT = zzk1;
        super(zzk1, 0, null);
    }
}
