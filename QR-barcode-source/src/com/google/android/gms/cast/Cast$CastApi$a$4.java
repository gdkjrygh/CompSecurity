// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.os.RemoteException;
import com.google.android.gms.internal.ij;

// Referenced classes of package com.google.android.gms.cast:
//            Cast

class EJ extends EJ
{

    final V EG;
    final String EH;
    final String EJ;

    protected volatile void a(com.google.android.gms.common.api. )
        throws RemoteException
    {
        a((ij));
    }

    protected void a(ij ij1)
        throws RemoteException
    {
        try
        {
            ij1.b(EH, EJ, this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ij ij1)
        {
            V(2001);
        }
    }

    ( , String s, String s1)
    {
        EG = ;
        EH = s;
        EJ = s1;
        super(null);
    }
}
