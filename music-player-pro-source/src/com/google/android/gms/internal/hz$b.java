// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;

// Referenced classes of package com.google.android.gms.internal:
//            hz, hc, hx, hu

private static abstract class .c extends com.google.android.gms.common.api.mplementation.a
{

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((hx));
    }

    protected abstract void a(hu hu)
        throws RemoteException;

    protected final void a(hx hx1)
        throws RemoteException
    {
        a(hx1.fH());
    }

    public gleApiClient(GoogleApiClient googleapiclient)
    {
        super(hc.CG, googleapiclient);
    }
}
