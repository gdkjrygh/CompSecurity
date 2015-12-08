// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.identity.intents;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.gw;

// Referenced classes of package com.google.android.gms.identity.intents:
//            Address, UserAddressRequest

static final class <init> extends <init>
{

    final UserAddressRequest Nw;
    final int Nx;

    protected volatile void a(com.google.android.gms.common.api.ess._cls2 _pcls2)
        throws RemoteException
    {
        a((gw)_pcls2);
    }

    protected void a(gw gw1)
        throws RemoteException
    {
        gw1.a(Nw, Nx);
        a(((com.google.android.gms.common.api.Result) (Status.Bv)));
    }

    sRequest(UserAddressRequest useraddressrequest, int i)
    {
        Nw = useraddressrequest;
        Nx = i;
        super();
    }
}
