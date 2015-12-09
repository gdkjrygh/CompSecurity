// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.RectF;

public final class efe
    implements gwk
{

    public efe()
    {
    }

    public final Bitmap a(Bitmap bitmap)
    {
        int i = bitmap.getWidth();
        int j = bitmap.getHeight();
        int k = j / 3;
        Bitmap bitmap1 = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap1);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP));
        canvas.drawRoundRect(new RectF(0.0F, 0.0F, i, j), 10F, 10F, paint);
        paint.setShader(new LinearGradient(0.0F, j - k, 0.0F, j, 0, 0x99000000, android.graphics.Shader.TileMode.CLAMP));
        canvas.drawRoundRect(new RectF(0.0F, j - k, i, j), 10F, 10F, paint);
        bitmap.recycle();
        return bitmap1;
    }

    public final String a()
    {
        return getClass().getSimpleName();
    }
}
