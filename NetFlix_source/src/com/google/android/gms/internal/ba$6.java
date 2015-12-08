// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bb, ba, dw, du, 
//            dz, dx

static final class 
    implements bb
{

    public void b(dz dz1, Map map)
    {
        map = (String)map.get("u");
        if (map == null)
        {
            dw.z("URL missing from httpTrack GMSG.");
            return;
        } else
        {
            (new du(dz1.getContext(), dz1.bK().rq, map)).start();
            return;
        }
    }

    ()
    {
    }
}
