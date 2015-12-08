// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.hardware.Camera;

public final class qv
{

    public static double a(rT rt)
    {
        return (double)rt.heightPixels / (double)rt.widthPixels;
    }

    public static int a(int i, int j)
    {
        if (i > j)
        {
            return j;
        }
        if (i < 0)
        {
            return 0;
        } else
        {
            return i;
        }
    }

    public static int a(android.hardware.Camera.CameraInfo acamerainfo[])
    {
        for (int i = 0; i < acamerainfo.length; i++)
        {
            if (acamerainfo[i].facing == 0)
            {
                return i;
            }
        }

        return 0;
    }

    public static Camera a(int i)
    {
        Camera camera;
        try
        {
            camera = Camera.open(i);
        }
        catch (RuntimeException runtimeexception)
        {
            return null;
        }
        return camera;
    }

    public static android.hardware.Camera.CameraInfo[] a()
    {
        int j = Camera.getNumberOfCameras();
        android.hardware.Camera.CameraInfo acamerainfo[] = new android.hardware.Camera.CameraInfo[j];
        for (int i = 0; i < j; i++)
        {
            acamerainfo[i] = new android.hardware.Camera.CameraInfo();
            Camera.getCameraInfo(i, acamerainfo[i]);
        }

        return acamerainfo;
    }
}
