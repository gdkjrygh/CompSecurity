// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.ij;

// Referenced classes of package com.google.android.gms.cast:
//            Cast

class EJ extends EJ
{

    final V EG;
    final String EJ;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((ij));
    }

    protected void a(ij ij1)
        throws RemoteException
    {
        if (TextUtils.isEmpty(EJ))
        {
            e(2001, "IllegalArgument: sessionId cannot be null or empty");
            return;
        }
        try
        {
            ij1.a(EJ, this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ij ij1)
        {
            V(2001);
        }
    }

    ( , String s)
    {
        EG = ;
        EJ = s;
        super(null);
    }
}
