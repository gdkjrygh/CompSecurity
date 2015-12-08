// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzcv, zzcu, zzl, zzhx, 
//            zzic, zzk, zzhu, zzhy

static final class 
    implements zzcv
{

    public final void zza(zzic zzic1, Map map)
    {
        String s;
        s = (String)map.get("u");
        if (s == null)
        {
            zzhx.zzac("URL missing from click GMSG.");
            return;
        }
        map = Uri.parse(s);
        Object obj = zzic1.zzeI();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        if (!((zzk) (obj)).zzb(map))
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = ((zzk) (obj)).zza(map, zzic1.getContext());
        map = ((Map) (obj));
_L2:
        map = map.toString();
        (new zzhu(zzic1.getContext(), zzic1.zzeJ().zzzH, map)).start();
        return;
        zzl zzl1;
        zzl1;
        zzhx.zzac((new StringBuilder("Unable to append parameter to URL: ")).append(s).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    ()
    {
    }
}
