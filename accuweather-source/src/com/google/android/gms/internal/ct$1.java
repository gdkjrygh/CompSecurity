// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            ct, cw, da, cx, 
//            dh, ev

class pb
    implements Runnable
{

    final cw pa;
    final Intent pb;
    final ct pc;

    public void run()
    {
        if (ct.a(pc).a(pa.pk, -1, pb))
        {
            ct.c(pc).a(new cx(ct.b(pc), pa.pl, true, -1, pb, pa));
            return;
        }
        try
        {
            ct.c(pc).a(new cx(ct.b(pc), pa.pl, false, -1, pb, pa));
            return;
        }
        catch (RemoteException remoteexception)
        {
            ev.D("Fail to verify and dispatch pending transaction");
        }
        return;
    }

    (ct ct1, cw cw1, Intent intent)
    {
        pc = ct1;
        pa = cw1;
        pb = intent;
        super();
    }
}
