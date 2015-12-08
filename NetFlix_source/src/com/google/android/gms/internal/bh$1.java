// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            bh, bn, br, dw

class mU
    implements Runnable
{

    final bn mU;
    final bh mV;

    public void run()
    {
        try
        {
            mU.ny.destroy();
            return;
        }
        catch (RemoteException remoteexception)
        {
            dw.c("Could not destroy mediation adapter.", remoteexception);
        }
    }

    (bh bh1, bn bn1)
    {
        mV = bh1;
        mU = bn1;
        super();
    }
}
