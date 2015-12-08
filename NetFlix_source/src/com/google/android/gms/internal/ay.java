// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bb, dw, az, dz

public final class ay
    implements bb
{

    private final az mF;

    public ay(az az1)
    {
        mF = az1;
    }

    public void b(dz dz, Map map)
    {
        dz = (String)map.get("name");
        if (dz == null)
        {
            dw.z("App event with no name parameter.");
            return;
        } else
        {
            mF.onAppEvent(dz, (String)map.get("info"));
            return;
        }
    }
}
