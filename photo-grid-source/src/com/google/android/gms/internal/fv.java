// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            fz, ry

final class fv
    implements fz
{

    fv()
    {
    }

    public final void zza(ry ry1, Map map)
    {
        map = ry1.h();
        if (map != null)
        {
            map.close();
            return;
        }
        ry1 = ry1.i();
        if (ry1 != null)
        {
            ry1.close();
            return;
        } else
        {
            zzb.zzaH("A GMSG tried to close something that wasn't an overlay.");
            return;
        }
    }
}
