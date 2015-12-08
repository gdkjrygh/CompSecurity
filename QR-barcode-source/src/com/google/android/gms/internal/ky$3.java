// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            ky, kk, kp

class <init> extends <init>
{

    final ky TF;

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
        kk1.jb().a(b, s);
    }

    .a(ky ky1)
    {
        TF = ky1;
        super();
    }
}
