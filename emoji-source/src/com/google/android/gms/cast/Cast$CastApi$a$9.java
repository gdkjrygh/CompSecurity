// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.gh;

// Referenced classes of package com.google.android.gms.cast:
//            Cast

class zZ extends zZ
{

    final N zW;
    final String zZ;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((gh));
    }

    protected void a(gh gh1)
        throws RemoteException
    {
        if (TextUtils.isEmpty(zZ))
        {
            c(2001, "IllegalArgument: sessionId cannot be null or empty");
            return;
        }
        try
        {
            gh1.a(zZ, this);
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
        zZ = s;
        super(null);
    }
}
