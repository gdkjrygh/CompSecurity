// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zze;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            fz, kg, kd, kj, 
//            ki, ry

public final class gl
    implements fz
{

    static final Map a;
    private final zze b;
    private final kg c;

    public gl(zze zze1, kg kg1)
    {
        b = zze1;
        c = kg1;
    }

    public final void zza(ry ry, Map map)
    {
        String s = (String)map.get("a");
        int i = ((Integer)a.get(s)).intValue();
        if (i != 5 && b != null && !b.zzbe())
        {
            b.zzp(null);
            return;
        }
        switch (i)
        {
        case 2: // '\002'
        default:
            zzb.zzaG("Unknown MRAID command called.");
            return;

        case 1: // '\001'
            c.a(map);
            return;

        case 4: // '\004'
            (new kd(ry, map)).a();
            return;

        case 3: // '\003'
            (new kj(ry, map)).a();
            return;

        case 5: // '\005'
            (new ki(ry, map)).a();
            return;

        case 6: // '\006'
            c.a(true);
            break;
        }
    }

    static 
    {
        HashMap hashmap = new HashMap();
        a = hashmap;
        hashmap.put("resize", Integer.valueOf(1));
        a.put("playVideo", Integer.valueOf(2));
        a.put("storePicture", Integer.valueOf(3));
        a.put("createCalendarEvent", Integer.valueOf(4));
        a.put("setOrientationProperties", Integer.valueOf(5));
        a.put("closeResizedAd", Integer.valueOf(6));
    }
}
