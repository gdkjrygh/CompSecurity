// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core.display;

import android.graphics.Bitmap;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import com.nostra13.universalimageloader.core.assist.LoadedFrom;
import com.nostra13.universalimageloader.core.imageaware.ImageAware;
import com.nostra13.universalimageloader.core.imageaware.ImageViewAware;

// Referenced classes of package com.nostra13.universalimageloader.core.display:
//            RoundedBitmapDisplayer

public class RoundedVignetteBitmapDisplayer extends RoundedBitmapDisplayer
{
    protected static class RoundedVignetteDrawable extends RoundedBitmapDisplayer.RoundedDrawable
    {

        protected void onBoundsChange(Rect rect)
        {
            super.onBoundsChange(rect);
            float f = mRect.centerX();
            float f1 = (mRect.centerY() * 1.0F) / 0.7F;
            float f2 = mRect.centerX();
            rect = android.graphics.Shader.TileMode.CLAMP;
            rect = new RadialGradient(f, f1, f2 * 1.3F, new int[] {
                0, 0, 0x7f000000
            }, new float[] {
                0.0F, 0.7F, 1.0F
            }, rect);
            Matrix matrix = new Matrix();
            matrix.setScale(1.0F, 0.7F);
            rect.setLocalMatrix(matrix);
            paint.setShader(new ComposeShader(bitmapShader, rect, android.graphics.PorterDuff.Mode.SRC_OVER));
        }

        RoundedVignetteDrawable(Bitmap bitmap, int i, int j)
        {
            super(bitmap, i, j);
        }
    }


    public RoundedVignetteBitmapDisplayer(int i, int j)
    {
        super(i, j);
    }

    public void display(Bitmap bitmap, ImageAware imageaware, LoadedFrom loadedfrom)
    {
        if (!(imageaware instanceof ImageViewAware))
        {
            throw new IllegalArgumentException("ImageAware should wrap ImageView. ImageViewAware is expected.");
        } else
        {
            imageaware.setImageDrawable(new RoundedVignetteDrawable(bitmap, cornerRadius, margin));
            return;
        }
    }
}
