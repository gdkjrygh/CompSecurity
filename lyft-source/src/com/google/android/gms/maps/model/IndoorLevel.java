// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.zzh;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException

public final class IndoorLevel
{

    private final zzh a;

    public boolean equals(Object obj)
    {
        if (!(obj instanceof IndoorLevel))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = a.a(((IndoorLevel)obj).a);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new RuntimeRemoteException(((RemoteException) (obj)));
        }
        return flag;
    }

    public int hashCode()
    {
        int i;
        try
        {
            i = a.d();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }
}
