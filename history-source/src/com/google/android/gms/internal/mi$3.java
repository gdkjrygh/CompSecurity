// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal:
//            mi, lu, lz

class gleApiClient extends gleApiClient
{

    final mi Vc;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((lu));
    }

    protected void a(lu lu1)
        throws RemoteException
    {
        ementation.b b = new <init>(this);
        String s = lu1.getContext().getPackageName();
        lu1.jM().a(b, s);
    }

    gleApiClient(mi mi1, GoogleApiClient googleapiclient)
    {
        Vc = mi1;
        super(googleapiclient);
    }
}
