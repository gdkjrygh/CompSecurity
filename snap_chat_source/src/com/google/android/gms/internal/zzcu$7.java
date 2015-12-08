// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzcv, zzcu, zzhx, zzhu, 
//            zzic, zzhy

static final class 
    implements zzcv
{

    public final void zza(zzic zzic1, Map map)
    {
        map = (String)map.get("u");
        if (map == null)
        {
            zzhx.zzac("URL missing from httpTrack GMSG.");
            return;
        } else
        {
            (new zzhu(zzic1.getContext(), zzic1.zzeJ().zzzH, map)).start();
            return;
        }
    }

    ()
    {
    }
}
