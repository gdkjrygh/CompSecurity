// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzcv, zzcy, zzic

public class zzcx
    implements zzcv
{

    private final zzcy zzrJ;

    public zzcx(zzcy zzcy1)
    {
        zzrJ = zzcy1;
    }

    public void zza(zzic zzic, Map map)
    {
        boolean flag = "1".equals(map.get("transparentBackground"));
        zzrJ.zzd(flag);
    }
}
