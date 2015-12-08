// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps;

import android.os.RemoteException;
import com.google.android.m4b.maps.df.q;
import com.google.android.m4b.maps.j.x;
import com.google.android.m4b.maps.model.LatLng;
import com.google.android.m4b.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.m4b.maps:
//            a

public final class b
{

    static q a;

    public static a a(LatLng latlng)
    {
        try
        {
            latlng = new a(a().a(latlng));
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
        return latlng;
    }

    private static q a()
    {
        return (q)x.a(a, "CameraUpdateFactory is not initialized");
    }

    public static a b(LatLng latlng)
    {
        try
        {
            latlng = new a(a().a(latlng, 10F));
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new RuntimeRemoteException(latlng);
        }
        return latlng;
    }
}
