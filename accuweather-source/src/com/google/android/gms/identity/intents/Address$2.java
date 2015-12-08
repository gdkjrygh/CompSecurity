// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.identity.intents;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ix;

// Referenced classes of package com.google.android.gms.identity.intents:
//            Address, UserAddressRequest

static final class <init> extends <init>
{

    final int UA;
    final UserAddressRequest Uz;

    protected volatile void a(com.google.android.gms.common.api.ess._cls2 _pcls2)
        throws RemoteException
    {
        a((ix)_pcls2);
    }

    protected void a(ix ix1)
        throws RemoteException
    {
        ix1.a(Uz, UA);
        b(Status.Ek);
    }

    sRequest(UserAddressRequest useraddressrequest, int i)
    {
        Uz = useraddressrequest;
        UA = i;
        super();
    }
}
