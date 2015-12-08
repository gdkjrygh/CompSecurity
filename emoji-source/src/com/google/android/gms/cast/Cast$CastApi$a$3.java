// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.internal.gh;

// Referenced classes of package com.google.android.gms.cast:
//            Cast, LaunchOptions

class zY extends zY
{

    final N zW;
    final String zX;
    final LaunchOptions zY;

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
            gh1.a(zX, zY, this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (gh gh1)
        {
            N(2001);
        }
    }

    ( , String s, LaunchOptions launchoptions)
    {
        zW = ;
        zX = s;
        zY = launchoptions;
        super(null);
    }
}
