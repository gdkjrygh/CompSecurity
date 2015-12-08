// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.m;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;

// Referenced classes of package com.google.android.gms.internal:
//            lb, kk, kp

class <init> extends <init>
{

    final m TN;
    final lb TO;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((kk));
    }

    protected void a(kk kk1)
        throws RemoteException
    {
        ementation.b b = new <init>(this, null);
        String s = kk1.getContext().getPackageName();
        kk1.jb().a(TN, b, s);
    }

    protected Result c(Status status)
    {
        return z(status);
    }

    protected ListSubscriptionsResult z(Status status)
    {
        return ListSubscriptionsResult.G(status);
    }

    t.m(lb lb1, m m)
    {
        TO = lb1;
        TN = m;
        super();
    }
}
