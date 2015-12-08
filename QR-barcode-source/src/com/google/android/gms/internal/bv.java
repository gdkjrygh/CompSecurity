// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            by, gs, bw, gv

public final class bv
    implements by
{

    private final bw pz;

    public bv(bw bw1)
    {
        pz = bw1;
    }

    public void a(gv gv, Map map)
    {
        gv = (String)map.get("name");
        if (gv == null)
        {
            gs.W("App event with no name parameter.");
            return;
        } else
        {
            pz.onAppEvent(gv, (String)map.get("info"));
            return;
        }
    }
}
