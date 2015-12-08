// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bg, lf, fj, cb, 
//            by, ce, cd, fl

public final class bj
    implements bg
{

    static final Map a;
    private final lf b;
    private final cb c;

    public bj(lf lf1, cb cb1)
    {
        b = lf1;
        c = cb1;
    }

    public final void a(fl fl, Map map)
    {
        String s = (String)map.get("a");
        int i = ((Integer)a.get(s)).intValue();
        if (i != 5 && b != null && !b.a())
        {
            fj.a("Action was blocked because no click was detected.");
            return;
        }
        switch (i)
        {
        case 2: // '\002'
        default:
            fj.c("Unknown MRAID command called.");
            return;

        case 1: // '\001'
            c.a(map);
            return;

        case 4: // '\004'
            (new by(fl, map)).a();
            return;

        case 3: // '\003'
            (new ce(fl, map)).a();
            return;

        case 5: // '\005'
            (new cd(fl, map)).a();
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
