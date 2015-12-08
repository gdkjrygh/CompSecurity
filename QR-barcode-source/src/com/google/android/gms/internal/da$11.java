// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            da, cv, gs

class qI
    implements Runnable
{

    final da qI;

    public void run()
    {
        try
        {
            da.a(qI).onAdLeftApplication();
            return;
        }
        catch (RemoteException remoteexception)
        {
            gs.d("Could not call onAdLeftApplication.", remoteexception);
        }
    }

    (da da1)
    {
        qI = da1;
        super();
    }
}
