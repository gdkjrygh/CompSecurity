// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.model.internal.zzg;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException

public final class IndoorBuilding
{

    private final zzg a;

    public IndoorBuilding(zzg zzg1)
    {
        a = (zzg)zzu.a(zzg1);
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof IndoorBuilding))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = a.a(((IndoorBuilding)obj).a);
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
            i = a.e();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }
}
