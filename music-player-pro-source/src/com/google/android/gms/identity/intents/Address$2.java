// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.identity.intents;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.mw;

// Referenced classes of package com.google.android.gms.identity.intents:
//            Address, UserAddressRequest

static final class <init> extends <init>
{

    final UserAddressRequest afF;
    final int afG;

    protected volatile void a(com.google.android.gms.common.api.ess._cls2 _pcls2)
        throws RemoteException
    {
        a((mw)_pcls2);
    }

    protected void a(mw mw1)
        throws RemoteException
    {
        mw1.a(afF, afG);
        b(Status.Kw);
    }

    sRequest(GoogleApiClient googleapiclient, UserAddressRequest useraddressrequest, int i)
    {
        afF = useraddressrequest;
        afG = i;
        super(googleapiclient);
    }
}
