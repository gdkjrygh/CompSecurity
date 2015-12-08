// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bmwgroup.connected.car.internal;

import adm;
import ahn;

// Referenced classes of package com.bmwgroup.connected.car.internal:
//            SdkManager

public final class a
    implements Runnable
{

    private adm a;

    public final void run()
    {
        SdkManager.d().a("notifying listener.onExit()", new Object[0]);
        a.b();
    }

    public (adm adm1)
    {
        a = adm1;
        super();
    }
}
