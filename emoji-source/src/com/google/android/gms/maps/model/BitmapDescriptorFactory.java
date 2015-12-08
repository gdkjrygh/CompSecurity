// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.internal.hm;
import com.google.android.gms.maps.model.internal.a;

// Referenced classes of package com.google.android.gms.maps.model:
//            BitmapDescriptor, RuntimeRemoteException

public final class BitmapDescriptorFactory
{

    public static final float HUE_AZURE = 210F;
    public static final float HUE_BLUE = 240F;
    public static final float HUE_CYAN = 180F;
    public static final float HUE_GREEN = 120F;
    public static final float HUE_MAGENTA = 300F;
    public static final float HUE_ORANGE = 30F;
    public static final float HUE_RED = 0F;
    public static final float HUE_ROSE = 330F;
    public static final float HUE_VIOLET = 270F;
    public static final float HUE_YELLOW = 60F;
    private static a aam;

    private BitmapDescriptorFactory()
    {
    }

    public static void a(a a1)
    {
        if (aam != null)
        {
            return;
        } else
        {
            aam = (a)hm.f(a1);
            return;
        }
    }

    public static BitmapDescriptor defaultMarker()
    {
        BitmapDescriptor bitmapdescriptor;
        try
        {
            bitmapdescriptor = new BitmapDescriptor(jM().jR());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return bitmapdescriptor;
    }

    public static BitmapDescriptor defaultMarker(float f)
    {
        BitmapDescriptor bitmapdescriptor;
        try
        {
            bitmapdescriptor = new BitmapDescriptor(jM().c(f));
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return bitmapdescriptor;
    }

    public static BitmapDescriptor fromAsset(String s)
    {
        try
        {
            s = new BitmapDescriptor(jM().bs(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeRemoteException(s);
        }
        return s;
    }

    public static BitmapDescriptor fromBitmap(Bitmap bitmap)
    {
        try
        {
            bitmap = new BitmapDescriptor(jM().b(bitmap));
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            throw new RuntimeRemoteException(bitmap);
        }
        return bitmap;
    }

    public static BitmapDescriptor fromFile(String s)
    {
        try
        {
            s = new BitmapDescriptor(jM().bt(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeRemoteException(s);
        }
        return s;
    }

    public static BitmapDescriptor fromPath(String s)
    {
        try
        {
            s = new BitmapDescriptor(jM().bu(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeRemoteException(s);
        }
        return s;
    }

    public static BitmapDescriptor fromResource(int i)
    {
        BitmapDescriptor bitmapdescriptor;
        try
        {
            bitmapdescriptor = new BitmapDescriptor(jM().cX(i));
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return bitmapdescriptor;
    }

    private static a jM()
    {
        return (a)hm.b(aam, "IBitmapDescriptorFactory is not initialized");
    }
}
