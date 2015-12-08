// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;

public final class nki extends mzc
{

    private final Resources a;
    private final int b;
    private final int c;

    public nki(Resources resources)
    {
        a = resources;
        b = c.fR;
        c = resources.getColor(b.GF);
    }

    protected final Object a()
    {
        Bitmap bitmap = BitmapFactory.decodeResource(a, b);
        int i = bitmap.getHeight();
        int j = bitmap.getWidth();
        Bitmap bitmap1 = Bitmap.createBitmap(j, i, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap1);
        Paint paint = new Paint();
        paint.setShader(new RadialGradient(i / 2, j / 2, i / 2, c, 0, android.graphics.Shader.TileMode.MIRROR));
        canvas.drawCircle(i / 2, j / 2, i / 2, paint);
        canvas.drawBitmap(bitmap, 0.0F, 0.0F, null);
        return bitmap1;
    }
}
