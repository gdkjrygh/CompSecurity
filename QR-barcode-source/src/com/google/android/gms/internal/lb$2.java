// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.af;

// Referenced classes of package com.google.android.gms.internal:
//            lb, kk, kp

class <init> extends <init>
{

    final lb TO;
    final af TP;

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
        kk1.jb().a(TP, b, s);
    }

    t.af(lb lb1, af af)
    {
        TO = lb1;
        TP = af;
        super();
    }
}
