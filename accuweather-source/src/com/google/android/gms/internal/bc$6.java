// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bd, bc, ev, et, 
//            ey, ew

static final class 
    implements bd
{

    public void b(ey ey1, Map map)
    {
        map = (String)map.get("u");
        if (map == null)
        {
            ev.D("URL missing from httpTrack GMSG.");
            return;
        } else
        {
            (new et(ey1.getContext(), ey1.bY().st, map)).start();
            return;
        }
    }

    ()
    {
    }
}
