// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            bx, bs, dw

class nJ
    implements Runnable
{

    final bx nJ;

    public void run()
    {
        try
        {
            bx.a(nJ).onAdClosed();
            return;
        }
        catch (RemoteException remoteexception)
        {
            dw.c("Could not call onAdClosed.", remoteexception);
        }
    }

    (bx bx1)
    {
        nJ = bx1;
        super();
    }
}
