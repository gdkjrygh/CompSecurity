// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationListener;

// Referenced classes of package com.google.android.gms.internal:
//            jc, jh

class <init> extends <init>
{

    final LocationListener Vu;
    final jc Vv;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((jh));
    }

    protected void a(jh jh1)
        throws RemoteException
    {
        jh1.removeLocationUpdates(Vu);
        b(Status.Ek);
    }

    ionListener(jc jc1, LocationListener locationlistener)
    {
        Vv = jc1;
        Vu = locationlistener;
        super(null);
    }
}
