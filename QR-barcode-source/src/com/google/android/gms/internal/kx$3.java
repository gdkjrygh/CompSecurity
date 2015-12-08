// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.b;

// Referenced classes of package com.google.android.gms.internal:
//            kx, kk, kp

class <init> extends <init>
{

    final kx TA;
    final String TC;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((kk));
    }

    protected void a(kk kk1)
        throws RemoteException
    {
        ementation.b b1 = new <init>(this);
        String s = kk1.getContext().getPackageName();
        kk1.jb().a(new b(TC), b1, s);
    }

    .a(kx kx1, String s)
    {
        TA = kx1;
        TC = s;
        super();
    }
}
