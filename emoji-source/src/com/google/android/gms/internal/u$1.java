// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

// Referenced classes of package com.google.android.gms.internal:
//            u, ef, ex

class kH
    implements ComponentCallbacks
{

    final u kH;

    public void onConfigurationChanged(Configuration configuration)
    {
        if (u.a(kH) != null && u.a(kH).kU != null && u.a(kH).kU.oy != null)
        {
            u.a(kH).kU.oy.bX();
        }
    }

    public void onLowMemory()
    {
    }

    (u u1)
    {
        kH = u1;
        super();
    }
}
