// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bd, ev, bb, ey

public final class ba
    implements bd
{

    private final bb mQ;

    public ba(bb bb1)
    {
        mQ = bb1;
    }

    public void b(ey ey, Map map)
    {
        ey = (String)map.get("name");
        if (ey == null)
        {
            ev.D("App event with no name parameter.");
            return;
        } else
        {
            mQ.onAppEvent(ey, (String)map.get("info"));
            return;
        }
    }
}
