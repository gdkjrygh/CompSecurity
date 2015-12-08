// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            ck, cq, cu, gs

class pU
    implements Runnable
{

    final cq pU;
    final ck pV;

    public void run()
    {
        try
        {
            pU.qz.destroy();
            return;
        }
        catch (RemoteException remoteexception)
        {
            gs.d("Could not destroy mediation adapter.", remoteexception);
        }
    }

    (ck ck1, cq cq1)
    {
        pV = ck1;
        pU = cq1;
        super();
    }
}
