// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal:
//            jl, jx

public static final class MT extends MT
{

    private jl MT;

    public void b(int i, IBinder ibinder, Bundle bundle)
    {
        jx.b("onPostInitComplete can be called only once per call to getServiceFromBroker", MT);
        MT.a(i, ibinder, bundle);
        MT = null;
    }

    public (jl jl1)
    {
        MT = jl1;
    }
}
