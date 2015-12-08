// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            da, db, cv, gs

class qJ
    implements Runnable
{

    final da qI;
    final com.google.ads.uest.ErrorCode qJ;

    public void run()
    {
        try
        {
            da.a(qI).onAdFailedToLoad(db.a(qJ));
            return;
        }
        catch (RemoteException remoteexception)
        {
            gs.d("Could not call onAdFailedToLoad.", remoteexception);
        }
    }

    (da da1, com.google.ads.uest.ErrorCode errorcode)
    {
        qI = da1;
        qJ = errorcode;
        super();
    }
}
