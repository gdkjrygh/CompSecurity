// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class dfu
{

    public static Bitmap a(Bitmap bitmap, Drawable drawable, boolean flag)
    {
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(bitmap1);
        Paint paint = new Paint(1);
        Matrix matrix = new Matrix();
        BitmapShader bitmapshader = new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
        Rect rect = canvas.getClipBounds();
        float f = rect.centerX();
        float f1 = rect.centerY();
        int i = Math.min(canvas.getWidth(), canvas.getHeight()) / 2;
        matrix.postTranslate(-f, -f1);
        bitmapshader.setLocalMatrix(matrix);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        paint.setShader(bitmapshader);
        canvas.save();
        canvas.translate(f, f1);
        drawable.setBounds(-i, -i, i, i);
        drawable.draw(canvas);
        canvas.restore();
        canvas.save();
        canvas.translate(f, f1);
        canvas.scale(0.63F, 0.63F);
        if (flag)
        {
            canvas.drawCircle(0.0F, 0.0F, i, paint);
        } else
        {
            canvas.drawRect(-i, -i, i, i, paint);
        }
        canvas.restore();
        bitmap.recycle();
        return bitmap1;
    }
}
