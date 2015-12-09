// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal:
//            ff, fq

public static final class Dk extends Dk
{

    private ff Dk;

    public void b(int i, IBinder ibinder, Bundle bundle)
    {
        fq.b("onPostInitComplete can be called only once per call to getServiceFromBroker", Dk);
        Dk.a(i, ibinder, bundle);
        Dk = null;
    }

    public (ff ff1)
    {
        Dk = ff1;
    }
}
