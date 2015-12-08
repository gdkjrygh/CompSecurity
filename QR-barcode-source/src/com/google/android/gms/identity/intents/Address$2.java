// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.identity.intents;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.lm;

// Referenced classes of package com.google.android.gms.identity.intents:
//            Address, UserAddressRequest

static final class <init> extends <init>
{

    final UserAddressRequest adI;
    final int adJ;

    protected volatile void a(com.google.android.gms.common.api.ess._cls2 _pcls2)
        throws RemoteException
    {
        a((lm)_pcls2);
    }

    protected void a(lm lm1)
        throws RemoteException
    {
        lm1.a(adI, adJ);
        b(Status.Jv);
    }

    sRequest(UserAddressRequest useraddressrequest, int i)
    {
        adI = useraddressrequest;
        adJ = i;
        super();
    }
}
