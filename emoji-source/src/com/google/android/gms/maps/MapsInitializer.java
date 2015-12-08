// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.internal.hm;
import com.google.android.gms.maps.internal.c;
import com.google.android.gms.maps.internal.u;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            CameraUpdateFactory

public final class MapsInitializer
{

    private MapsInitializer()
    {
    }

    public static void a(c c1)
    {
        try
        {
            CameraUpdateFactory.a(c1.jH());
            BitmapDescriptorFactory.a(c1.jI());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (c c1)
        {
            throw new RuntimeRemoteException(c1);
        }
    }

    public static int initialize(Context context)
    {
        hm.f(context);
        try
        {
            context = u.H(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return ((GooglePlayServicesNotAvailableException) (context)).errorCode;
        }
        a(context);
        return 0;
    }
}
