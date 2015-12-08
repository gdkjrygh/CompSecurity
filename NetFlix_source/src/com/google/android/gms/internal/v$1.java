// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentCallbacks;
import android.content.res.Configuration;

// Referenced classes of package com.google.android.gms.internal:
//            v, dh, dz

class kE
    implements ComponentCallbacks
{

    final v kE;

    public void onConfigurationChanged(Configuration configuration)
    {
        if (v.a(kE) != null && v.a(kE).kO != null && v.a(kE).kO.oj != null)
        {
            v.a(kE).kO.oj.bE();
        }
    }

    public void onLowMemory()
    {
    }

    (v v1)
    {
        kE = v1;
        super();
    }
}
