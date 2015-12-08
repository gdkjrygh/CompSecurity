// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.fitness.request.j;
import com.google.android.gms.fitness.result.DataTypeResult;

// Referenced classes of package com.google.android.gms.internal:
//            ky, kk, kp

class <init> extends <init>
{

    final ky TF;
    final j TG;

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
        kk1.jb().a(TG, b, s);
    }

    protected Result c(Status status)
    {
        return x(status);
    }

    protected DataTypeResult x(Status status)
    {
        return DataTypeResult.F(status);
    }

    t.j(ky ky1, j j)
    {
        TF = ky1;
        TG = j;
        super();
    }
}
