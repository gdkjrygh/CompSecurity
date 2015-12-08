// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.common.internal:
//            e, o

public static final class LI extends LI
{

    private e LI;

    public void b(int i, IBinder ibinder, Bundle bundle)
    {
        o.b("onPostInitComplete can be called only once per call to getServiceFromBroker", LI);
        LI.a(i, ibinder, bundle);
        LI = null;
    }

    public (e e1)
    {
        LI = e1;
    }
}
