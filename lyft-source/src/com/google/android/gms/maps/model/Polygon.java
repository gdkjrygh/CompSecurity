// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.zzj;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException

public final class Polygon
{

    private final zzj a;

    public boolean equals(Object obj)
    {
        if (!(obj instanceof Polygon))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = a.a(((Polygon)obj).a);
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
            i = a.k();
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return i;
    }
}
