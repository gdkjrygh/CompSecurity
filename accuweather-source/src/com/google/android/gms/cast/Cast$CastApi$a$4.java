// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.internal.gi;

// Referenced classes of package com.google.android.gms.cast:
//            Cast

class zW extends zW
{

    final N zT;
    final String zU;
    final String zW;

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
            gi1.b(zU, zW, this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (gi gi1)
        {
            N(2001);
        }
    }

    ( , String s, String s1)
    {
        zT = ;
        zU = s;
        zW = s1;
        super(null);
    }
}
