// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

// Referenced classes of package com.google.android.gms.internal:
//            u, fz, gv

class lw
    implements ComponentCallbacks
{

    final u lw;

    public void onConfigurationChanged(Configuration configuration)
    {
        if (u.a(lw) != null && u.a(lw).lI != null && u.a(lw).lI.rN != null)
        {
            u.a(lw).lI.rN.bS();
        }
    }

    public void onLowMemory()
    {
    }

    (u u1)
    {
        lw = u1;
        super();
    }
}
