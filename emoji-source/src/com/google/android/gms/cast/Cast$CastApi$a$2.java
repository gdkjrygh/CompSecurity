// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.internal.gh;

// Referenced classes of package com.google.android.gms.cast:
//            Cast

class zX extends zX
{

    final N zW;
    final String zX;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((gh));
    }

    protected void a(gh gh1)
        throws RemoteException
    {
        try
        {
            gh1.a(zX, false, this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (gh gh1)
        {
            N(2001);
        }
    }

    ( , String s)
    {
        zW = ;
        zX = s;
        super(null);
    }
}
