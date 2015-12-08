// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            CameraUpdate

public final class CameraUpdateFactory
{

    private static ICameraUpdateFactoryDelegate a;

    private CameraUpdateFactory()
    {
    }

    public static CameraUpdate a(CameraPosition cameraposition)
    {
        try
        {
            cameraposition = new CameraUpdate(a().a(cameraposition));
        }
        // Misplaced declaration of an exception variable
        catch (CameraPosition cameraposition)
        {
            throw new RuntimeRemoteException(cameraposition);
        }
        return cameraposition;
    }

    public static CameraUpdate a(LatLngBounds latlngbounds, int i, int j, int k)
    {
        try
        {
            latlngbounds = new CameraUpdate(a().a(latlngbounds, i, j, k));
        }
        // Misplaced declaration of an exception variable
        catch (LatLngBounds latlngbounds)
        {
            throw new RuntimeRemoteException(latlngbounds);
        }
        return latlngbounds;
    }

    private static ICameraUpdateFactoryDelegate a()
    {
        return (ICameraUpdateFactoryDelegate)zzu.a(a, "CameraUpdateFactory is not initialized");
    }

    public static void a(ICameraUpdateFactoryDelegate icameraupdatefactorydelegate)
    {
        a = (ICameraUpdateFactoryDelegate)zzu.a(icameraupdatefactorydelegate);
    }
}
