// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bmwgroup.connected.car.internal;

import adm;
import aez;
import ahn;

// Referenced classes of package com.bmwgroup.connected.car.internal:
//            SdkManager

public final class b
    implements Runnable
{

    private adm a;
    private aez b;

    public final void run()
    {
        SdkManager.d().a("notifying listener.onDestroy()", new Object[0]);
        a.c();
        b.a.b("setListener(%s)", new Object[] {
            null
        });
    }

    public (adm adm1, aez aez1)
    {
        a = adm1;
        b = aez1;
        super();
    }
}
