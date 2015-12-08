// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.o;

// Referenced classes of package com.google.android.gms.internal:
//            lc, kk, kp

class <init> extends <init>
{

    final lc TS;
    final o TT;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((kk));
    }

    protected void a(kk kk1)
        throws RemoteException
    {
        ementation.b b = new <init>(this);
        String s = kk1.getContext().getPackageName();
        kk1.jb().a(TT, b, s);
    }

    protected Result c(Status status)
    {
        return d(status);
    }

    protected Status d(Status status)
    {
        return status;
    }

    t.o(lc lc1, o o)
    {
        TS = lc1;
        TT = o;
        super();
    }
}
