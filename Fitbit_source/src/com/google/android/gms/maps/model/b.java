// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.internal.am;
import com.google.android.gms.maps.model.internal.h;

// Referenced classes of package com.google.android.gms.maps.model:
//            a, RuntimeRemoteException

public final class b
{

    public static final float a = 0F;
    public static final float b = 30F;
    public static final float c = 60F;
    public static final float d = 120F;
    public static final float e = 180F;
    public static final float f = 210F;
    public static final float g = 240F;
    public static final float h = 270F;
    public static final float i = 300F;
    public static final float j = 330F;
    private static h k;

    private b()
    {
    }

    public static a a()
    {
        a a1;
        try
        {
            a1 = new a(b().a());
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return a1;
    }

    public static a a(float f1)
    {
        a a1;
        try
        {
            a1 = new a(b().a(f1));
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return a1;
    }

    public static a a(int l)
    {
        a a1;
        try
        {
            a1 = new a(b().a(l));
        }
        catch (RemoteException remoteexception)
        {
            throw new RuntimeRemoteException(remoteexception);
        }
        return a1;
    }

    public static a a(Bitmap bitmap)
    {
        try
        {
            bitmap = new a(b().a(bitmap));
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            throw new RuntimeRemoteException(bitmap);
        }
        return bitmap;
    }

    public static a a(String s)
    {
        try
        {
            s = new a(b().a(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeRemoteException(s);
        }
        return s;
    }

    public static void a(h h1)
    {
        if (k != null)
        {
            return;
        } else
        {
            k = (h)am.a(h1);
            return;
        }
    }

    public static a b(String s)
    {
        try
        {
            s = new a(b().b(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeRemoteException(s);
        }
        return s;
    }

    private static h b()
    {
        return (h)am.a(k, "IBitmapDescriptorFactory is not initialized");
    }

    public static a c(String s)
    {
        try
        {
            s = new a(b().c(s));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new RuntimeRemoteException(s);
        }
        return s;
    }
}
