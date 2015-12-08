// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.Gravity;

// Referenced classes of package android.support.v4.graphics.drawable:
//            RoundedBitmapDrawable

class RoundedBitmapDrawable21 extends RoundedBitmapDrawable
{

    protected RoundedBitmapDrawable21(Resources resources, Bitmap bitmap)
    {
        super(resources, bitmap);
    }

    public void getOutline(Outline outline)
    {
        updateDstRect();
        outline.setRoundRect(mDstRect, getCornerRadius());
    }

    void gravityCompatApply(int i, int j, int k, Rect rect, Rect rect1)
    {
        Gravity.apply(i, j, k, rect, rect1, 0);
    }

    public boolean hasMipMap()
    {
        return mBitmap != null && mBitmap.hasMipMap();
    }

    public void setMipMap(boolean flag)
    {
        if (mBitmap != null)
        {
            mBitmap.setHasMipMap(flag);
            invalidateSelf();
        }
    }
}
