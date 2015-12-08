// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            jc, jh

class <init> extends <init>
{

    final jc Vv;
    final Location Vy;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((jh));
    }

    protected void a(jh jh1)
        throws RemoteException
    {
        jh1.setMockLocation(Vy);
        b(Status.Ek);
    }

    .a(jc jc1, Location location)
    {
        Vv = jc1;
        Vy = location;
        super(null);
    }
}
