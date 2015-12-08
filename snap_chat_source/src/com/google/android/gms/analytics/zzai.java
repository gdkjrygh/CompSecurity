// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzra;
import com.google.android.gms.internal.zzrg;

// Referenced classes of package com.google.android.gms.analytics:
//            zzq

class zzai
    implements zzq
{

    private final zzra zzAM;

    zzai(zzra zzra1)
    {
        zzx.zzl(zzra1);
        zzAM = zzra1;
    }

    public String getValue(String s)
    {
        if ("&sr".equals(s))
        {
            return zzgC();
        } else
        {
            return null;
        }
    }

    protected String zzgC()
    {
        zzrg zzrg1 = zzAM.zzqV();
        return (new StringBuilder()).append(zzrg1.zzrb()).append("x").append(zzrg1.zzrc()).toString();
    }
}
