// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            jb, jh

class <init> extends <init>
{

    final long Vq;
    final PendingIntent Vr;
    final jb Vs;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((jh));
    }

    protected void a(jh jh1)
        throws RemoteException
    {
        jh1.requestActivityUpdates(Vq, Vr);
        b(Status.Ek);
    }

    .a(jb jb1, long l, PendingIntent pendingintent)
    {
        Vs = jb1;
        Vq = l;
        Vr = pendingintent;
        super(null);
    }
}
