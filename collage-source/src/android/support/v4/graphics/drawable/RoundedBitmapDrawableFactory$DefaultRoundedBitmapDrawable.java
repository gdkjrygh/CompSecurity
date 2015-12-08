// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.support.v4.graphics.BitmapCompat;
import android.support.v4.view.GravityCompat;

// Referenced classes of package android.support.v4.graphics.drawable:
//            RoundedBitmapDrawable, RoundedBitmapDrawableFactory

private static class  extends RoundedBitmapDrawable
{

    void gravityCompatApply(int i, int j, int k, Rect rect, Rect rect1)
    {
        GravityCompat.apply(i, j, k, rect, rect1, 0);
    }

    public boolean hasMipMap()
    {
        return mBitmap != null && BitmapCompat.hasMipMap(mBitmap);
    }

    public void setMipMap(boolean flag)
    {
        if (mBitmap != null)
        {
            BitmapCompat.setHasMipMap(mBitmap, flag);
            invalidateSelf();
        }
    }

    (Resources resources, Bitmap bitmap)
    {
        super(resources, bitmap);
    }
}
