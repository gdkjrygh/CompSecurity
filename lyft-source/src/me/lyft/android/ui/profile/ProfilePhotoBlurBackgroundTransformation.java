// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.squareup.picasso.Transformation;
import me.lyft.android.utils.VersionUtils;

public class ProfilePhotoBlurBackgroundTransformation
    implements Transformation
{

    private static final float BLUR_RADIUS = 24F;
    private final int darkOverlay;
    private final int greyBackground;
    private RenderScript renderScript;
    private int viewHeight;
    private int viewWidth;

    public ProfilePhotoBlurBackgroundTransformation(Context context, int i, int j)
    {
        renderScript = RenderScript.create(context.getApplicationContext());
        darkOverlay = context.getResources().getColor(0x7f0c0003);
        greyBackground = context.getResources().getColor(0x7f0c006d);
        viewWidth = i;
        viewHeight = j;
    }

    private static Matrix createCenterCropMatrix(Bitmap bitmap, Bitmap bitmap1)
    {
        float f = 0.0F;
        Matrix matrix = new Matrix();
        int i = bitmap.getWidth();
        int j = bitmap.getHeight();
        int k = bitmap1.getHeight();
        int l = bitmap1.getWidth();
        float f1;
        float f2;
        if (i * k > l * j)
        {
            f2 = (float)k / (float)j;
            f1 = ((float)l - (float)i * f2) * 0.5F;
        } else
        {
            f2 = (float)l / (float)i;
            f = k;
            float f3 = j;
            f1 = 0.0F;
            f = (f - f3 * f2) * 0.5F;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((int)(f1 + 0.5F), (int)(f + 0.5F));
        return matrix;
    }

    private static Matrix createCenterInsideMatrix(Bitmap bitmap, Bitmap bitmap1)
    {
        Matrix matrix = new Matrix();
        int i = bitmap.getWidth();
        int j = bitmap.getHeight();
        int k = bitmap1.getHeight();
        int l = bitmap1.getWidth();
        float f;
        float f1;
        float f2;
        if (i <= l && j <= k)
        {
            f = 1.0F;
        } else
        {
            f = Math.min((float)l / (float)i, (float)k / (float)j);
        }
        f1 = (int)(((float)l - (float)i * f) * 0.5F + 0.5F);
        f2 = (int)(((float)k - (float)j * f) * 0.5F + 0.5F);
        matrix.setScale(f, f);
        matrix.postTranslate(f1, f2);
        return matrix;
    }

    public String key()
    {
        return (new StringBuilder()).append(viewWidth).append("x").append(viewHeight).toString();
    }

    public Bitmap transform(Bitmap bitmap)
    {
        if (bitmap.getWidth() > bitmap.getHeight())
        {
            return bitmap;
        }
        Bitmap bitmap1 = Bitmap.createBitmap(viewWidth, viewHeight, bitmap.getConfig());
        Paint paint = new Paint();
        Canvas canvas = new Canvas(bitmap1);
        if (VersionUtils.hasKitKat())
        {
            canvas.drawBitmap(bitmap, createCenterCropMatrix(bitmap, bitmap1), paint);
            Allocation allocation = Allocation.createFromBitmap(renderScript, bitmap1);
            Allocation allocation1 = Allocation.createTyped(renderScript, allocation.getType());
            ScriptIntrinsicBlur scriptintrinsicblur = ScriptIntrinsicBlur.create(renderScript, Element.U8_4(renderScript));
            scriptintrinsicblur.setRadius(24F);
            scriptintrinsicblur.setInput(allocation);
            scriptintrinsicblur.forEach(allocation1);
            allocation1.copyTo(bitmap1);
            canvas.drawColor(darkOverlay);
        } else
        {
            canvas.drawColor(greyBackground);
        }
        canvas.drawBitmap(bitmap, createCenterInsideMatrix(bitmap, bitmap1), paint);
        bitmap.recycle();
        return bitmap1;
    }
}
