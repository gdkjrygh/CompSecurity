// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zze;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ch, dx, dw, dz, 
//            dy, hs

public class cn
    implements ch
{

    static final Map a;
    private final zze b;
    private final dx c;

    public cn(zze zze1, dx dx1)
    {
        b = zze1;
        c = dx1;
    }

    public void zza(hs hs, Map map)
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
            zzb.zzaD("Unknown MRAID command called.");
            return;

        case 1: // '\001'
            c.a(map);
            return;

        case 4: // '\004'
            (new dw(hs, map)).a();
            return;

        case 3: // '\003'
            (new dz(hs, map)).a();
            return;

        case 5: // '\005'
            (new dy(hs, map)).a();
            return;

        case 6: // '\006'
            c.a(true);
            break;
        }
    }

    static 
    {
        a = new HashMap();
        a.put("resize", Integer.valueOf(1));
        a.put("playVideo", Integer.valueOf(2));
        a.put("storePicture", Integer.valueOf(3));
        a.put("createCalendarEvent", Integer.valueOf(4));
        a.put("setOrientationProperties", Integer.valueOf(5));
        a.put("closeResizedAd", Integer.valueOf(6));
    }
}
