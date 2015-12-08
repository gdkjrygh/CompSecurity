// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            fz, ae, ry, ad, 
//            rb

final class fu
    implements fz
{

    fu()
    {
    }

    public final void zza(ry ry1, Map map)
    {
        String s;
        s = (String)map.get("u");
        if (s == null)
        {
            zzb.zzaH("URL missing from click GMSG.");
            return;
        }
        map = Uri.parse(s);
        Object obj = ry1.m();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        if (!((ad) (obj)).a(map))
        {
            break MISSING_BLOCK_LABEL_63;
        }
        obj = ((ad) (obj)).a(map, ry1.getContext());
        map = ((Map) (obj));
_L2:
        map = map.toString();
        (new rb(ry1.getContext(), ry1.n().zzJu, map)).zzgz();
        return;
        ae ae1;
        ae1;
        zzb.zzaH((new StringBuilder("Unable to append parameter to URL: ")).append(s).toString());
        if (true) goto _L2; else goto _L1
_L1:
    }
}
