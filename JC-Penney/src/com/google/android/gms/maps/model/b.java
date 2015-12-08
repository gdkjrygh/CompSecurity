// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.graphics.Bitmap;
import android.os.RemoteException;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.maps.model.a.d;

// Referenced classes of package com.google.android.gms.maps.model:
//            a, f

public final class b
{

    private static d a;

    private static d a()
    {
        return (d)u.a(a, "IBitmapDescriptorFactory is not initialized");
    }

    public static a a(int i)
    {
        a a1;
        try
        {
            a1 = new a(a().a(i));
        }
        catch (RemoteException remoteexception)
        {
            throw new f(remoteexception);
        }
        return a1;
    }

    public static a a(Bitmap bitmap)
    {
        try
        {
            bitmap = new a(a().a(bitmap));
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            throw new f(bitmap);
        }
        return bitmap;
    }

    public static void a(d d1)
    {
        if (a != null)
        {
            return;
        } else
        {
            a = (d)u.a(d1);
            return;
        }
    }
}
