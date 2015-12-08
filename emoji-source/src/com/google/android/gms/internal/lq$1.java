// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            lq, lr

class b extends com.google.android.gms.wallet.t.b
{

    final int UD;
    final lq akG;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((lr));
    }

    protected void a(lr lr1)
    {
        lr1.dQ(UD);
        b(Status.En);
    }

    .a(lq lq1, int i)
    {
        akG = lq1;
        UD = i;
        super();
    }
}
