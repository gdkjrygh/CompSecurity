// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.internal.kn;
import com.google.android.gms.maps.internal.c;
import com.google.android.gms.maps.internal.x;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            CameraUpdateFactory

public final class MapsInitializer
{

    private static void a(c c1)
    {
        try
        {
            CameraUpdateFactory.a(c1.qk());
            BitmapDescriptorFactory.a(c1.ql());
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
        kn.k(context);
        try
        {
            context = x.V(context);
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
