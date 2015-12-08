// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            ca, cb, bv, eu

class nX
    implements Runnable
{

    final ca nW;
    final com.google.ads.est.ErrorCode nX;

    public void run()
    {
        try
        {
            ca.a(nW).onAdFailedToLoad(cb.a(nX));
            return;
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Could not call onAdFailedToLoad.", remoteexception);
        }
    }

    (ca ca1, com.google.ads.est.ErrorCode errorcode)
    {
        nW = ca1;
        nX = errorcode;
        super();
    }
}
