// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.maps.a.a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.f;

// Referenced classes of package com.google.android.gms.maps:
//            a

public final class b
{

    private static a a;

    private static a a()
    {
        return (a)u.a(a, "CameraUpdateFactory is not initialized");
    }

    public static com.google.android.gms.maps.a a(LatLng latlng, float f1)
    {
        try
        {
            latlng = new com.google.android.gms.maps.a(a().a(latlng, f1));
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new f(latlng);
        }
        return latlng;
    }

    public static com.google.android.gms.maps.a a(LatLngBounds latlngbounds, int i)
    {
        try
        {
            latlngbounds = new com.google.android.gms.maps.a(a().a(latlngbounds, i));
        }
        // Misplaced declaration of an exception variable
        catch (LatLngBounds latlngbounds)
        {
            throw new f(latlngbounds);
        }
        return latlngbounds;
    }

    public static void a(a a1)
    {
        a = (a)u.a(a1);
    }
}
