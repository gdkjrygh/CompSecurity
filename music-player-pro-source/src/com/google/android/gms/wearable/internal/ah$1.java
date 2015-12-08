// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            d, ah, ba

class ent extends d
{

    final byte DU[];
    final String axR;
    final String axS;
    final ah axT;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((ba));
    }

    protected void a(ba ba1)
        throws RemoteException
    {
        ba1.a(this, axR, axS, DU);
    }

    protected com.google.android.gms.wearable.geApi.SendMessageResult aI(Status status)
    {
        return new <init>(status, -1);
    }

    protected Result c(Status status)
    {
        return aI(status);
    }

    ent(ah ah1, GoogleApiClient googleapiclient, String s, String s1, byte abyte0[])
    {
        axT = ah1;
        axR = s;
        axS = s1;
        DU = abyte0;
        super(googleapiclient);
    }
}
