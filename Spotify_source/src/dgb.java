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

public final class dgb
{

    public static Bitmap a(Bitmap bitmap, Drawable drawable, int i, float f, int j, boolean flag)
    {
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Bitmap bitmap2 = bitmap.copy(bitmap.getConfig(), true);
        Canvas canvas = new Canvas(bitmap1);
        Object obj = new Matrix();
        BitmapShader bitmapshader = new BitmapShader(bitmap2, android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.REPEAT);
        Rect rect = canvas.getClipBounds();
        float f1 = rect.centerX();
        float f2 = rect.centerY();
        int k = Math.min(canvas.getWidth(), canvas.getHeight()) / 2;
        float f3 = k;
        ((Matrix) (obj)).preTranslate(-f1, -f2);
        bitmapshader.setLocalMatrix(((Matrix) (obj)));
        canvas.save();
        obj = new Paint(1);
        ((Paint) (obj)).setStyle(android.graphics.Paint.Style.FILL);
        ((Paint) (obj)).setAlpha(j);
        ((Paint) (obj)).setShader(bitmapshader);
        canvas.translate(f1, f2);
        canvas.drawRect(-f3, -f3, f3, f3, ((Paint) (obj)));
        canvas.scale(1.0F, 1.0F);
        dfn.a(bitmap1, i);
        canvas.restore();
        canvas.save();
        canvas.translate(f1, f2);
        drawable.setBounds(-k, -k, k, k);
        drawable.draw(canvas);
        canvas.restore();
        canvas.save();
        drawable = new Paint(1);
        drawable.setStyle(android.graphics.Paint.Style.FILL);
        drawable.setShader(bitmapshader);
        canvas.translate(f1, f2);
        canvas.scale(f, f);
        if (flag)
        {
            canvas.drawCircle(0.0F, 0.0F, f3, drawable);
        } else
        {
            canvas.drawRect(-f3, -f3, f3, f3, drawable);
        }
        canvas.restore();
        bitmap.recycle();
        bitmap2.recycle();
        return bitmap1;
    }
}
