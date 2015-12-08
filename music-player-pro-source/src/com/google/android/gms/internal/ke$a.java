// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            kb, ke

private static class Ea extends kb
{

    private final com.google.android.gms.common.api.mplementation.b Ea;

    public void aI(int i)
        throws RemoteException
    {
        Ea.b(new Status(i));
    }

    public ementation.b(com.google.android.gms.common.api.mplementation.b b)
    {
        Ea = b;
    }
}
