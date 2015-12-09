// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            bx, by, bs, dw

class nK
    implements Runnable
{

    final bx nJ;
    final com.google.ads.est.ErrorCode nK;

    public void run()
    {
        try
        {
            bx.a(nJ).onAdFailedToLoad(by.a(nK));
            return;
        }
        catch (RemoteException remoteexception)
        {
            dw.c("Could not call onAdFailedToLoad.", remoteexception);
        }
    }

    (bx bx1, com.google.ads.est.ErrorCode errorcode)
    {
        nJ = bx1;
        nK = errorcode;
        super();
    }
}
