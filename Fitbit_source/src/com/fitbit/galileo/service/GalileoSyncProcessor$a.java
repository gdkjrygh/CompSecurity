// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.service;

import com.fitbit.data.domain.device.Device;
import com.fitbit.galileo.GalileoTrackerType;
import com.fitbit.util.p;

// Referenced classes of package com.fitbit.galileo.service:
//            GalileoSyncProcessor

public static class d
{

    public final String a;
    public final String b;
    public final GalileoTrackerType c;
    public final boolean d;

    public (Device device)
    {
        a = device.c();
        b = device.d();
        c = GalileoTrackerType.a(device.j());
        d = p.d(device);
    }
}
