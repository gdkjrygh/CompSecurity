// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics;

import android.graphics.Bitmap;

class BitmapCompatJellybeanMR2
{

    BitmapCompatJellybeanMR2()
    {
    }

    public static boolean hasMipMap(Bitmap bitmap)
    {
        return bitmap.hasMipMap();
    }

    public static void setHasMipMap(Bitmap bitmap, boolean flag)
    {
        bitmap.setHasMipMap(flag);
    }
}
