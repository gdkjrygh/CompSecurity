// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.MaskedWalletRequest;

// Referenced classes of package com.google.android.gms.internal:
//            jf, jg

class b extends com.google.android.gms.wallet.t.b
{

    final int Nx;
    final jf acV;
    final MaskedWalletRequest acW;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((jg));
    }

    protected void a(jg jg1)
    {
        jg1.a(acW, Nx);
        a(((com.google.android.gms.common.api.Result) (Status.Bv)));
    }

    alletRequest(jf jf1, MaskedWalletRequest maskedwalletrequest, int i)
    {
        acV = jf1;
        acW = maskedwalletrequest;
        Nx = i;
        super();
    }
}
