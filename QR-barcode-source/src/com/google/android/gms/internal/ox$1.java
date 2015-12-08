// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            ox, oy

class b extends com.google.android.gms.wallet.t.b
{

    final int adJ;
    final ox auq;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((oy));
    }

    protected void a(oy oy1)
    {
        oy1.fI(adJ);
        b(Status.Jv);
    }

    .a(ox ox1, int i)
    {
        auq = ox1;
        adJ = i;
        super();
    }
}
