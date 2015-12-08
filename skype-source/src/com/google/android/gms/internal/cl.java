// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.e;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cf, dw, dv, dy, 
//            dx, hi

public final class cl
    implements cf
{

    static final Map a;
    private final e b;
    private final dw c;

    public cl(e e1, dw dw1)
    {
        b = e1;
        c = dw1;
    }

    public final void a(hi hi, Map map)
    {
        String s = (String)map.get("a");
        int i = ((Integer)a.get(s)).intValue();
        if (i != 5 && b != null && !b.b())
        {
            b.a(null);
            return;
        }
        switch (i)
        {
        case 2: // '\002'
        default:
            com.google.android.gms.ads.internal.util.client.b.b("Unknown MRAID command called.");
            return;

        case 1: // '\001'
            c.a(map);
            return;

        case 4: // '\004'
            (new dv(hi, map)).a();
            return;

        case 3: // '\003'
            (new dy(hi, map)).a();
            return;

        case 5: // '\005'
            (new dx(hi, map)).a();
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
