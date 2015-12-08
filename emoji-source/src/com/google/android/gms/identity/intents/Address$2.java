// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.identity.intents;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.iw;

// Referenced classes of package com.google.android.gms.identity.intents:
//            Address, UserAddressRequest

static final class <init> extends <init>
{

    final UserAddressRequest UC;
    final int UD;

    protected volatile void a(com.google.android.gms.common.api.ess._cls2 _pcls2)
        throws RemoteException
    {
        a((iw)_pcls2);
    }

    protected void a(iw iw1)
        throws RemoteException
    {
        iw1.a(UC, UD);
        b(Status.En);
    }

    sRequest(UserAddressRequest useraddressrequest, int i)
    {
        UC = useraddressrequest;
        UD = i;
        super();
    }
}
