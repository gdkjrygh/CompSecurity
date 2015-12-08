// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            ja, jg

class <init> extends <init>
{

    final long Vt;
    final PendingIntent Vu;
    final ja Vv;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((jg));
    }

    protected void a(jg jg1)
        throws RemoteException
    {
        jg1.requestActivityUpdates(Vt, Vu);
        b(Status.En);
    }

    .a(ja ja1, long l, PendingIntent pendingintent)
    {
        Vv = ja1;
        Vt = l;
        Vu = pendingintent;
        super(null);
    }
}
