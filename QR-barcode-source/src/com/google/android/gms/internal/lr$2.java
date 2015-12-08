// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            lr, lz

class <init> extends <init>
{

    final PendingIntent aeC;
    final lr aeD;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((lz));
    }

    protected void a(lz lz1)
        throws RemoteException
    {
        lz1.removeActivityUpdates(aeC);
        b(Status.Jv);
    }

    .a(lr lr1, PendingIntent pendingintent)
    {
        aeD = lr1;
        aeC = pendingintent;
        super(null);
    }
}
