// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            ba, bb, ay, cn

class fv
    implements Runnable
{

    final ba fu;
    final com.google.ads.est.ErrorCode fv;

    public void run()
    {
        try
        {
            ba.a(fu).onAdFailedToLoad(bb.a(fv));
            return;
        }
        catch (RemoteException remoteexception)
        {
            cn.b("Could not call onAdFailedToLoad.", remoteexception);
        }
    }

    (ba ba1, com.google.ads.est.ErrorCode errorcode)
    {
        fu = ba1;
        fv = errorcode;
        super();
    }
}
