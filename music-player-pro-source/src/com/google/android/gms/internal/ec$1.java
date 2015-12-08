// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            ec, ef, ek, eg, 
//            er, gr

class sK
    implements Runnable
{

    final ef sJ;
    final Intent sK;
    final ec sL;

    public void run()
    {
        if (ec.a(sL).a(sJ.sU, -1, sK))
        {
            ec.c(sL).a(new eg(ec.b(sL), sJ.sV, true, -1, sK, sJ));
            return;
        }
        try
        {
            ec.c(sL).a(new eg(ec.b(sL), sJ.sV, false, -1, sK, sJ));
            return;
        }
        catch (RemoteException remoteexception)
        {
            gr.W("Fail to verify and dispatch pending transaction");
        }
        return;
    }

    (ec ec1, ef ef1, Intent intent)
    {
        sL = ec1;
        sJ = ef1;
        sK = intent;
        super();
    }
}
