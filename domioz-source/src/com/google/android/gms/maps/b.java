// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.RemoteException;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.maps.internal.a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.e;

// Referenced classes of package com.google.android.gms.maps:
//            a

public final class b
{

    private static a a;

    public static com.google.android.gms.maps.a a(LatLng latlng)
    {
        try
        {
            latlng = new com.google.android.gms.maps.a(((a)ap.a(a, "CameraUpdateFactory is not initialized")).a(latlng, 17F));
        }
        // Misplaced declaration of an exception variable
        catch (LatLng latlng)
        {
            throw new e(latlng);
        }
        return latlng;
    }

    public static void a(a a1)
    {
        a = (a)ap.a(a1);
    }
}
