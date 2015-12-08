// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            an, at, ax, cn

class eN
    implements Runnable
{

    final at eN;
    final an eO;

    public void run()
    {
        try
        {
            eN.fn.destroy();
            return;
        }
        catch (RemoteException remoteexception)
        {
            cn.b("Could not destroy mediation adapter.", remoteexception);
        }
    }

    (an an1, at at1)
    {
        eO = an1;
        eN = at1;
        super();
    }
}
