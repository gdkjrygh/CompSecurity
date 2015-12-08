// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.internal.dm;
import com.google.android.gms.maps.internal.c;
import com.google.android.gms.maps.internal.q;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;

// Referenced classes of package com.google.android.gms.maps:
//            CameraUpdateFactory

public final class MapsInitializer
{

    private MapsInitializer()
    {
    }

    public static void initialize(Context context)
        throws GooglePlayServicesNotAvailableException
    {
        dm.e(context);
        context = q.u(context);
        try
        {
            CameraUpdateFactory.a(context.cG());
            BitmapDescriptorFactory.a(context.cH());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeRemoteException(context);
        }
    }
}
