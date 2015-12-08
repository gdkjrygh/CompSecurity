// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.maps.model.a.b;

// Referenced classes of package com.google.android.gms.maps.model:
//            a, c

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
    private static b zzaGO;

    private BitmapDescriptorFactory()
    {
    }

    public static a defaultMarker()
    {
        a a1;
        try
        {
            a1 = new a(zzxb().a());
        }
        catch (RemoteException remoteexception)
        {
            throw new c(remoteexception);
        }
        return a1;
    }

    public static a defaultMarker(float f)
    {
        a a1;
        try
        {
            a1 = new a(zzxb().a(f));
        }
        catch (RemoteException remoteexception)
        {
            throw new c(remoteexception);
        }
        return a1;
    }

    public static a fromAsset(String s)
    {
        try
        {
            s = new a(zzxb().a(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new c(s);
        }
        return s;
    }

    public static a fromBitmap(Bitmap bitmap)
    {
        try
        {
            bitmap = new a(zzxb().a(bitmap));
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            throw new c(bitmap);
        }
        return bitmap;
    }

    public static a fromFile(String s)
    {
        try
        {
            s = new a(zzxb().b(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new c(s);
        }
        return s;
    }

    public static a fromPath(String s)
    {
        try
        {
            s = new a(zzxb().c(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new c(s);
        }
        return s;
    }

    public static a fromResource(int i)
    {
        a a1;
        try
        {
            a1 = new a(zzxb().a(i));
        }
        catch (RemoteException remoteexception)
        {
            throw new c(remoteexception);
        }
        return a1;
    }

    public static void zza(b b1)
    {
        if (zzaGO != null)
        {
            return;
        } else
        {
            zzaGO = (b)y.a(b1);
            return;
        }
    }

    private static b zzxb()
    {
        return (b)y.a(zzaGO, "IBitmapDescriptorFactory is not initialized");
    }
}
