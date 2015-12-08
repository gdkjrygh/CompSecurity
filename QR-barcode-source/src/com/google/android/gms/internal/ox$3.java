// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWalletRequest;

// Referenced classes of package com.google.android.gms.internal:
//            ox, oy

class b extends com.google.android.gms.wallet.t.b
{

    final int adJ;
    final ox auq;
    final FullWalletRequest aus;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((oy));
    }

    protected void a(oy oy1)
    {
        oy1.a(aus, adJ);
        b(Status.Jv);
    }

    letRequest(ox ox1, FullWalletRequest fullwalletrequest, int i)
    {
        auq = ox1;
        aus = fullwalletrequest;
        adJ = i;
        super();
    }
}
