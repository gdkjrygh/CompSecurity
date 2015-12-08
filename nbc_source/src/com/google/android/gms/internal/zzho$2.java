// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;

// Referenced classes of package com.google.android.gms.internal:
//            zzho, zzr

class zzGw
    implements 
{

    final c zzGw;
    final zzho zzGx;
    final String zzwJ;

    public void zze(zzr zzr1)
    {
        zzb.zzaC((new StringBuilder()).append("Failed to load URL: ").append(zzwJ).append("\n").append(zzr1.toString()).toString());
        zzGw.zzb(null);
    }

    c(zzho zzho1, String s, c c)
    {
        zzGx = zzho1;
        zzwJ = s;
        zzGw = c;
        super();
    }
}
