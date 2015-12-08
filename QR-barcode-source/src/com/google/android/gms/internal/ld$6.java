// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.fitness.request.aa;

// Referenced classes of package com.google.android.gms.internal:
//            ld, kk, kp

class <init> extends <init>
{

    final ld TZ;
    final PendingIntent Ud;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((kk));
    }

    protected void a(kk kk1)
        throws RemoteException
    {
        ementation.b b = new <init>(this);
        aa aa1 = new aa(Ud);
        String s = kk1.getContext().getPackageName();
        kk1.jb().a(aa1, b, s);
    }

    .a(ld ld1, PendingIntent pendingintent)
    {
        TZ = ld1;
        Ud = pendingintent;
        super();
    }
}
