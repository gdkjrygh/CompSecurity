// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.photoeffect;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class LibPhotoEffect
{

    public LibPhotoEffect()
    {
    }

    public static void a(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            throw new NullPointerException();
        }
        if (bitmap.isRecycled())
        {
            throw new IllegalArgumentException("Bitmap is recycled.");
        }
        if (bitmap.getConfig() != android.graphics.Bitmap.Config.ARGB_8888 && bitmap.getConfig() != android.graphics.Bitmap.Config.RGB_565)
        {
            throw new IllegalArgumentException((new StringBuilder("Unsupported bitmap config: ")).append(bitmap.getConfig()).toString());
        } else
        {
            return;
        }
    }

    public static void a(Bitmap bitmap, Bitmap bitmap1)
    {
        a(bitmap);
        a(bitmap1);
        (new Canvas(bitmap1)).drawBitmap(bitmap, 0.0F, 0.0F, null);
    }

    public native void nativeApplyDesaturateFilter(Bitmap bitmap);

    public native void nativeApplyInstasnapFilter(Bitmap bitmap);

    public native void nativeApplyLookupTable(Bitmap bitmap, Bitmap bitmap1);

    public native void nativeTerminateProcessing();

    static 
    {
        try
        {
            System.loadLibrary("photoeffect");
        }
        catch (Throwable throwable)
        {
            throwable.printStackTrace();
        }
    }
}
