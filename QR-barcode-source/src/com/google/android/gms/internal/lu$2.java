// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.location.Location;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            lu, lz

class <init> extends <init>
{

    final lu aeG;
    final Location aeH;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((lz));
    }

    protected void a(lz lz1)
        throws RemoteException
    {
        lz1.setMockLocation(aeH);
        b(Status.Jv);
    }

    .a(lu lu1, Location location)
    {
        aeG = lu1;
        aeH = location;
        super(null);
    }
}
