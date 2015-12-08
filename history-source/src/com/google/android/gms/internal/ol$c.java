// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.panorama.Panorama;

// Referenced classes of package com.google.android.gms.internal:
//            ol, om, ok

private static abstract class .c extends com.google.android.gms.common.api.mplementation.a
{

    protected abstract void a(Context context, ok ok1)
        throws RemoteException;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((om));
    }

    protected final void a(om om1)
        throws RemoteException
    {
        a(om1.getContext(), (ok)om1.hw());
    }

    protected gleApiClient(GoogleApiClient googleapiclient)
    {
        super(Panorama.DQ, googleapiclient);
    }
}
