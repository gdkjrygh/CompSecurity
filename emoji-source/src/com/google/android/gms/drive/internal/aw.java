// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            c

public class aw extends c
{

    private final com.google.android.gms.common.api.a.d yR;

    public aw(com.google.android.gms.common.api.a.d d)
    {
        yR = d;
    }

    public void o(Status status)
        throws RemoteException
    {
        yR.a(status);
    }

    public void onSuccess()
        throws RemoteException
    {
        yR.a(Status.En);
    }
}
