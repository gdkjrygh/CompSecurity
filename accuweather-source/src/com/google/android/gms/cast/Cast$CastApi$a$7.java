// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.internal.gi;

// Referenced classes of package com.google.android.gms.cast:
//            Cast

class zT extends zT
{

    final N zT;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((gi));
    }

    protected void a(gi gi1)
        throws RemoteException
    {
        try
        {
            gi1.d(this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (gi gi1)
        {
            N(2001);
        }
    }

    ( )
    {
        zT = ;
        super(null);
    }
}
