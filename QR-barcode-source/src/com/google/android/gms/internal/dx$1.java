// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            dx, ea, ee, eb, 
//            el, gs

class ss
    implements Runnable
{

    final ea sr;
    final Intent ss;
    final dx st;

    public void run()
    {
        if (dx.a(st).a(sr.sB, -1, ss))
        {
            dx.c(st).a(new eb(dx.b(st), sr.sC, true, -1, ss, sr));
            return;
        }
        try
        {
            dx.c(st).a(new eb(dx.b(st), sr.sC, false, -1, ss, sr));
            return;
        }
        catch (RemoteException remoteexception)
        {
            gs.W("Fail to verify and dispatch pending transaction");
        }
        return;
    }

    (dx dx1, ea ea1, Intent intent)
    {
        st = dx1;
        sr = ea1;
        ss = intent;
        super();
    }
}
