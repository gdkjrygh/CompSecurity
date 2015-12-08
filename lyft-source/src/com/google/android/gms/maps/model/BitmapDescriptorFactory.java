// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.maps.model.internal.zzd;

// Referenced classes of package com.google.android.gms.maps.model:
//            BitmapDescriptor, RuntimeRemoteException

public final class BitmapDescriptorFactory
{

    private static zzd a;

    private BitmapDescriptorFactory()
    {
    }

    public static BitmapDescriptor a(int i)
    {
        BitmapDescriptor bitmapdescriptor;
        try
        {
            bitmapdescriptor = new BitmapDescriptor(a().a(i));
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return bitmapdescriptor;
    }

    public static BitmapDescriptor a(Bitmap bitmap)
    {
        try
        {
            bitmap = new BitmapDescriptor(a().a(bitmap));
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            throw new RuntimeRemoteException(bitmap);
        }
        return bitmap;
    }

    private static zzd a()
    {
        return (zzd)zzu.a(a, "IBitmapDescriptorFactory is not initialized");
    }

    public static void a(zzd zzd1)
    {
        if (a != null)
        {
            return;
        } else
        {
            a = (zzd)zzu.a(zzd1);
            return;
        }
    }
}
