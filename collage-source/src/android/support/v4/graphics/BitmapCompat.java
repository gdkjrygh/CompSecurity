// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics;

import android.graphics.Bitmap;

// Referenced classes of package android.support.v4.graphics:
//            BitmapCompatHoneycombMr1, BitmapCompatJellybeanMR2, BitmapCompatKitKat

public class BitmapCompat
{
    static class BaseBitmapImpl
        implements BitmapImpl
    {

        public int getAllocationByteCount(Bitmap bitmap)
        {
            return bitmap.getRowBytes() * bitmap.getHeight();
        }

        public boolean hasMipMap(Bitmap bitmap)
        {
            return false;
        }

        public void setHasMipMap(Bitmap bitmap, boolean flag)
        {
        }

        BaseBitmapImpl()
        {
        }
    }

    static interface BitmapImpl
    {

        public abstract int getAllocationByteCount(Bitmap bitmap);

        public abstract boolean hasMipMap(Bitmap bitmap);

        public abstract void setHasMipMap(Bitmap bitmap, boolean flag);
    }

    static class HcMr1BitmapCompatImpl extends BaseBitmapImpl
    {

        public int getAllocationByteCount(Bitmap bitmap)
        {
            return BitmapCompatHoneycombMr1.getAllocationByteCount(bitmap);
        }

        HcMr1BitmapCompatImpl()
        {
        }
    }

    static class JbMr2BitmapCompatImpl extends HcMr1BitmapCompatImpl
    {

        public boolean hasMipMap(Bitmap bitmap)
        {
            return BitmapCompatJellybeanMR2.hasMipMap(bitmap);
        }

        public void setHasMipMap(Bitmap bitmap, boolean flag)
        {
            BitmapCompatJellybeanMR2.setHasMipMap(bitmap, flag);
        }

        JbMr2BitmapCompatImpl()
        {
        }
    }

    static class KitKatBitmapCompatImpl extends JbMr2BitmapCompatImpl
    {

        public int getAllocationByteCount(Bitmap bitmap)
        {
            return BitmapCompatKitKat.getAllocationByteCount(bitmap);
        }

        KitKatBitmapCompatImpl()
        {
        }
    }


    static final BitmapImpl IMPL;

    public BitmapCompat()
    {
    }

    public static int getAllocationByteCount(Bitmap bitmap)
    {
        return IMPL.getAllocationByteCount(bitmap);
    }

    public static boolean hasMipMap(Bitmap bitmap)
    {
        return IMPL.hasMipMap(bitmap);
    }

    public static void setHasMipMap(Bitmap bitmap, boolean flag)
    {
        IMPL.setHasMipMap(bitmap, flag);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 19)
        {
            IMPL = new KitKatBitmapCompatImpl();
        } else
        if (i >= 18)
        {
            IMPL = new JbMr2BitmapCompatImpl();
        } else
        if (i >= 12)
        {
            IMPL = new HcMr1BitmapCompatImpl();
        } else
        {
            IMPL = new BaseBitmapImpl();
        }
    }
}
