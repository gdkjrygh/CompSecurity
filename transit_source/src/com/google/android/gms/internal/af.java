// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ai, cn, ag, cq

public final class af
    implements ai
{

    private final ag ey;

    public af(ag ag1)
    {
        ey = ag1;
    }

    public void a(cq cq, Map map)
    {
        cq = (String)map.get("name");
        if (cq == null)
        {
            cn.q("App event with no name parameter.");
            return;
        } else
        {
            ey.a(cq, (String)map.get("info"));
            return;
        }
    }
}
