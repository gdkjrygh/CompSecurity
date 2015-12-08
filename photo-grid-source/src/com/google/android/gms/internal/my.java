// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.formats.zzf;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            fz, mv, ry

final class my
    implements fz
{

    final zzf a;
    final mv b;

    my(mv mv1, zzf zzf)
    {
        b = mv1;
        a = zzf;
        super();
    }

    public final void zza(ry ry, Map map)
    {
        ry = (String)map.get("asset");
        mv.a(b, a, ry);
    }
}
