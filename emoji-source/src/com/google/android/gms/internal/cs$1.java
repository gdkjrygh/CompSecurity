// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            cs, cv, cz, cw, 
//            dg, eu

class pd
    implements Runnable
{

    final cv pc;
    final Intent pd;
    final cs pe;

    public void run()
    {
        if (cs.a(pe).a(pc.pm, -1, pd))
        {
            cs.c(pe).a(new cw(cs.b(pe), pc.pn, true, -1, pd, pc));
            return;
        }
        try
        {
            cs.c(pe).a(new cw(cs.b(pe), pc.pn, false, -1, pd, pc));
            return;
        }
        catch (RemoteException remoteexception)
        {
            eu.D("Fail to verify and dispatch pending transaction");
        }
        return;
    }

    (cs cs1, cv cv1, Intent intent)
    {
        pe = cs1;
        pc = cv1;
        pd = intent;
        super();
    }
}
