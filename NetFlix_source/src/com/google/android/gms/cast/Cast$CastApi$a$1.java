// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.internal.en;

// Referenced classes of package com.google.android.gms.cast:
//            Cast

class xO extends xO
{

    final String xN;
    final String xO;
    final x xP;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((en));
    }

    protected void a(en en1)
        throws RemoteException
    {
        try
        {
            en1.a(xN, xO, this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (en en1)
        {
            x(2001);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (en en1)
        {
            x(2001);
        }
    }

    ( , String s, String s1)
    {
        xP = ;
        xN = s;
        xO = s1;
        super(null);
    }
}
