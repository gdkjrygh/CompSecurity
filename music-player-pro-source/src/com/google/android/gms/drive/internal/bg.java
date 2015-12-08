// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.drive.internal:
//            c

public class bg extends c
{

    private final com.google.android.gms.common.api.BaseImplementation.b Ea;

    public bg(com.google.android.gms.common.api.BaseImplementation.b b)
    {
        Ea = b;
    }

    public void n(Status status)
        throws RemoteException
    {
        Ea.b(status);
    }

    public void onSuccess()
        throws RemoteException
    {
        Ea.b(Status.Kw);
    }
}
