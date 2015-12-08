// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            fz, at, ar, ry

final class ba
    implements fz
{

    final at a;

    ba(at at1)
    {
        a = at1;
        super();
    }

    public final void zza(ry ry, Map map)
    {
        if (!a.a(map))
        {
            return;
        } else
        {
            zzb.zzaF((new StringBuilder("Received request to untrack: ")).append(at.b(a).d()).toString());
            a.b();
            return;
        }
    }
}
