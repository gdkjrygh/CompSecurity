// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            by, gs, dd, dc, 
//            de, gv

public class cc
    implements by
{

    static final Map pK;

    public cc()
    {
    }

    public void a(gv gv, Map map)
    {
        String s = (String)map.get("a");
        switch (((Integer)pK.get(s)).intValue())
        {
        case 2: // '\002'
        default:
            gs.U("Unknown MRAID command called.");
            return;

        case 1: // '\001'
            (new dd(gv, map)).execute();
            return;

        case 4: // '\004'
            (new dc(gv, map)).execute();
            return;

        case 3: // '\003'
            (new de(gv, map)).execute();
            return;
        }
    }

    static 
    {
        pK = new HashMap();
        pK.put("resize", Integer.valueOf(1));
        pK.put("playVideo", Integer.valueOf(2));
        pK.put("storePicture", Integer.valueOf(3));
        pK.put("createCalendarEvent", Integer.valueOf(4));
    }
}
