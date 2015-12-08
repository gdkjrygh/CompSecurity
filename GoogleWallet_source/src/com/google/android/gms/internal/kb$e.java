// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal:
//            kb, kn

public static final class VW extends VW
{

    private kb VW;

    public final void b(int i, IBinder ibinder, Bundle bundle)
    {
        kn.b("onPostInitComplete can be called only once per call to getServiceFromBroker", VW);
        VW.a(i, ibinder, bundle);
        VW = null;
    }

    public (kb kb1)
    {
        VW = kb1;
    }
}
