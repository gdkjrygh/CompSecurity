// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            by, bx, gs, gq, 
//            gv, gt

static final class 
    implements by
{

    public void a(gv gv1, Map map)
    {
        map = (String)map.get("u");
        if (map == null)
        {
            gs.W("URL missing from httpTrack GMSG.");
            return;
        } else
        {
            (new gq(gv1.getContext(), gv1.dx().wD, map)).start();
            return;
        }
    }

    ()
    {
    }
}
