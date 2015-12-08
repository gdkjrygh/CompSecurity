// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cd, gr, di, dh, 
//            dj, gu

public class ch
    implements cd
{

    static final Map qb;

    public ch()
    {
    }

    public void a(gu gu, Map map)
    {
        String s = (String)map.get("a");
        switch (((Integer)qb.get(s)).intValue())
        {
        case 2: // '\002'
        default:
            gr.U("Unknown MRAID command called.");
            return;

        case 1: // '\001'
            (new di(gu, map)).execute();
            return;

        case 4: // '\004'
            (new dh(gu, map)).execute();
            return;

        case 3: // '\003'
            (new dj(gu, map)).execute();
            return;
        }
    }

    static 
    {
        qb = new HashMap();
        qb.put("resize", Integer.valueOf(1));
        qb.put("playVideo", Integer.valueOf(2));
        qb.put("storePicture", Integer.valueOf(3));
        qb.put("createCalendarEvent", Integer.valueOf(4));
    }
}
