// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            c

public class al extends c
{

    private final com.google.android.gms.common.api.a.d wH;

    public al(com.google.android.gms.common.api.a.d d)
    {
        wH = d;
    }

    public void m(Status status)
        throws RemoteException
    {
        wH.b(status);
    }

    public void onSuccess()
        throws RemoteException
    {
        wH.b(Status.Bv);
    }
}
