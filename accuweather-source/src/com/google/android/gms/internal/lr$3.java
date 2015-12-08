// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.FullWalletRequest;

// Referenced classes of package com.google.android.gms.internal:
//            lr, ls

class b extends com.google.android.gms.wallet.t.b
{

    final int UA;
    final lr akD;
    final FullWalletRequest akF;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((ls));
    }

    protected void a(ls ls1)
    {
        ls1.a(akF, UA);
        b(Status.Ek);
    }

    letRequest(lr lr1, FullWalletRequest fullwalletrequest, int i)
    {
        akD = lr1;
        akF = fullwalletrequest;
        UA = i;
        super();
    }
}
