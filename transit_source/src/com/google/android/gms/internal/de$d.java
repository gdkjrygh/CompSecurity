// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal:
//            de, dm

public static final class kR extends kR
{

    private de kR;

    public void b(int i, IBinder ibinder, Bundle bundle)
    {
        dm.a("onPostInitComplete can be called only once per call to getServiceFromBroker", kR);
        kR.a(i, ibinder, bundle);
        kR = null;
    }

    public (de de1)
    {
        kR = de1;
    }
}
