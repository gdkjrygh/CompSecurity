// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.im;

// Referenced classes of package com.google.android.gms.cast:
//            Cast, LaunchOptions

class ient extends ient
{

    final W Fv;
    final String Fw;
    final LaunchOptions Fx;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((im));
    }

    protected void a(im im1)
        throws RemoteException
    {
        try
        {
            im1.a(Fw, Fx, this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (im im1)
        {
            W(2001);
        }
    }

    ient(ient ient, GoogleApiClient googleapiclient, String s, LaunchOptions launchoptions)
    {
        Fv = ient;
        Fw = s;
        Fx = launchoptions;
        super(googleapiclient);
    }
}
