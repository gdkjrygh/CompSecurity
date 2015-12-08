// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal:
//            ca, bv, eu

class nW
    implements Runnable
{

    final ca nW;

    public void run()
    {
        try
        {
            ca.a(nW).onAdLeftApplication();
            return;
        }
        catch (RemoteException remoteexception)
        {
            eu.c("Could not call onAdLeftApplication.", remoteexception);
        }
    }

    (ca ca1)
    {
        nW = ca1;
        super();
    }
}
