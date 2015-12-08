// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.fitness.data.DataSet;

// Referenced classes of package com.google.android.gms.internal:
//            kz, kk, kp

class <init> extends <init>
{

    final DataSet TH;
    final kz TI;

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
        kk1.jb().a((new com.google.android.gms.fitness.request.init>()).(TH).j(), b, s);
    }

    ataSet(kz kz1, DataSet dataset)
    {
        TI = kz1;
        TH = dataset;
        super();
    }
}
