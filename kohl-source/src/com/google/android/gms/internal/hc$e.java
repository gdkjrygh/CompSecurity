// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal:
//            hc, hn

public static final class Gi extends Gi
{

    private hc Gi;

    public void b(int i, IBinder ibinder, Bundle bundle)
    {
        hn.b("onPostInitComplete can be called only once per call to getServiceFromBroker", Gi);
        Gi.a(i, ibinder, bundle);
        Gi = null;
    }

    public (hc hc1)
    {
        Gi = hc1;
    }
}
