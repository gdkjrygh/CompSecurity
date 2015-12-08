// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

// Referenced classes of package com.google.android.gms.internal:
//            v, eg, ey

class kF
    implements ComponentCallbacks
{

    final v kF;

    public void onConfigurationChanged(Configuration configuration)
    {
        if (v.a(kF) != null && v.a(kF).kS != null && v.a(kF).kS.ow != null)
        {
            v.a(kF).kS.ow.bS();
        }
    }

    public void onLowMemory()
    {
    }

    (v v1)
    {
        kF = v1;
        super();
    }
}
