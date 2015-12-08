// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.maps.model.internal.zzf;

// Referenced classes of package com.google.android.gms.maps.model:
//            RuntimeRemoteException

public final class GroundOverlay
{

    private final zzf a;

    public boolean equals(Object obj)
    {
        if (!(obj instanceof GroundOverlay))
        {
            return false;
        }
        boolean flag;
        try
        {
            flag = a.a(((GroundOverlay)obj).a);
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
