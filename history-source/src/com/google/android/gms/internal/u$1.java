// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

// Referenced classes of package com.google.android.gms.internal:
//            u, fy, gu

class lG
    implements ComponentCallbacks
{

    final u lG;

    public void onConfigurationChanged(Configuration configuration)
    {
        if (u.a(lG) != null && u.a(lG).lT != null && u.a(lG).lT.se != null)
        {
            u.a(lG).lT.se.cb();
        }
    }

    public void onLowMemory()
    {
    }

    (u u1)
    {
        lG = u1;
        super();
    }
}
