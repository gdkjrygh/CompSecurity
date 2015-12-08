// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            cb, bw, ev

class nU
    implements Runnable
{

    final cb nU;

    public void run()
    {
        try
        {
            cb.a(nU).onAdLeftApplication();
            return;
        }
        catch (RemoteException remoteexception)
        {
            ev.c("Could not call onAdLeftApplication.", remoteexception);
        }
    }

    (cb cb1)
    {
        nU = cb1;
        super();
    }
}
