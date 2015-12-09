// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.en;

// Referenced classes of package com.google.android.gms.cast:
//            Cast

class xS extends xS
{

    final x xP;
    final String xS;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((en));
    }

    protected void a(en en1)
        throws RemoteException
    {
        if (TextUtils.isEmpty(xS))
        {
            c(2001, "IllegalArgument: sessionId cannot be null or empty");
            return;
        }
        try
        {
            en1.a(xS, this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (en en1)
        {
            x(2001);
        }
    }

    ( , String s)
    {
        xP = ;
        xS = s;
        super(null);
    }
}
