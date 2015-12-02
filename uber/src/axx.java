// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.RemoteException;

public final class axx
{

    private static ayk a;

    public static axw a(int i)
    {
        axw axw1;
        try
        {
            axw1 = new axw(a().a(i));
        }
        catch (RemoteException remoteexception)
        {
            throw new ayb(remoteexception);
        }
        return axw1;
    }

    public static axw a(Bitmap bitmap)
    {
        try
        {
            bitmap = new axw(a().a(bitmap));
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            throw new ayb(bitmap);
        }
        return bitmap;
    }

    private static ayk a()
    {
        return (ayk)wn.a(a, "IBitmapDescriptorFactory is not initialized");
    }

    public static void a(ayk ayk1)
    {
        if (a != null)
        {
            return;
        } else
        {
            a = (ayk)wn.a(ayk1);
            return;
        }
    }
}
