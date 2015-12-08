// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Log;
import com.bumptech.glide.load.b.a.e;

public final class x
{

    private static android.graphics.Bitmap.Config a(Bitmap bitmap)
    {
        if (bitmap.getConfig() != null)
        {
            return bitmap.getConfig();
        } else
        {
            return android.graphics.Bitmap.Config.ARGB_8888;
        }
    }

    public static Bitmap a(Bitmap bitmap, Bitmap bitmap1, int i, int j)
    {
        float f = 0.0F;
        if (bitmap1 != null) goto _L2; else goto _L1
_L1:
        Bitmap bitmap2 = null;
_L4:
        return bitmap2;
_L2:
        if (bitmap1.getWidth() != i)
        {
            break; /* Loop/switch isn't completed */
        }
        bitmap2 = bitmap1;
        if (bitmap1.getHeight() == j) goto _L4; else goto _L3
_L3:
        Matrix matrix = new Matrix();
        float f1;
        float f2;
        Bitmap bitmap3;
        if (bitmap1.getWidth() * j > bitmap1.getHeight() * i)
        {
            f2 = (float)j / (float)bitmap1.getHeight();
            f1 = ((float)i - (float)bitmap1.getWidth() * f2) * 0.5F;
        } else
        {
            f2 = (float)i / (float)bitmap1.getWidth();
            f = j;
            float f3 = bitmap1.getHeight();
            f1 = 0.0F;
            f = (f - f3 * f2) * 0.5F;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((int)(f1 + 0.5F), (int)(f + 0.5F));
        bitmap3 = bitmap;
        if (bitmap == null)
        {
            bitmap3 = Bitmap.createBitmap(i, j, a(bitmap1));
        }
        a(bitmap1, bitmap3);
        (new Canvas(bitmap3)).drawBitmap(bitmap1, matrix, new Paint(6));
        return bitmap3;
    }

    public static Bitmap a(Bitmap bitmap, e e1, int i)
    {
        Matrix matrix = new Matrix();
        i;
        JVM INSTR tableswitch 2 8: default 52
    //                   2 62
    //                   3 73
    //                   4 83
    //                   5 102
    //                   6 121
    //                   7 131
    //                   8 150;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (matrix.isIdentity())
        {
            return bitmap;
        }
        break; /* Loop/switch isn't completed */
_L2:
        matrix.setScale(-1F, 1.0F);
        continue; /* Loop/switch isn't completed */
_L3:
        matrix.setRotate(180F);
        continue; /* Loop/switch isn't completed */
_L4:
        matrix.setRotate(180F);
        matrix.postScale(-1F, 1.0F);
        continue; /* Loop/switch isn't completed */
_L5:
        matrix.setRotate(90F);
        matrix.postScale(-1F, 1.0F);
        continue; /* Loop/switch isn't completed */
_L6:
        matrix.setRotate(90F);
        continue; /* Loop/switch isn't completed */
_L7:
        matrix.setRotate(-90F);
        matrix.postScale(-1F, 1.0F);
        continue; /* Loop/switch isn't completed */
_L8:
        matrix.setRotate(-90F);
        if (true) goto _L1; else goto _L9
_L9:
        RectF rectf = new RectF(0.0F, 0.0F, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectf);
        i = Math.round(rectf.width());
        int j = Math.round(rectf.height());
        android.graphics.Bitmap.Config config = a(bitmap);
        Bitmap bitmap1 = e1.a(i, j, config);
        e1 = bitmap1;
        if (bitmap1 == null)
        {
            e1 = Bitmap.createBitmap(i, j, config);
        }
        matrix.postTranslate(-rectf.left, -rectf.top);
        (new Canvas(e1)).drawBitmap(bitmap, matrix, new Paint(6));
        return e1;
    }

    public static Bitmap a(Bitmap bitmap, e e1, int i, int j)
    {
        if (bitmap.getWidth() == i && bitmap.getHeight() == j)
        {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        float f = Math.min((float)i / (float)bitmap.getWidth(), (float)j / (float)bitmap.getHeight());
        int k = (int)((float)bitmap.getWidth() * f);
        int l = (int)((float)bitmap.getHeight() * f);
        if (bitmap.getWidth() == k && bitmap.getHeight() == l)
        {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        Object obj1 = a(bitmap);
        Object obj = e1.a(k, l, ((android.graphics.Bitmap.Config) (obj1)));
        e1 = ((e) (obj));
        if (obj == null)
        {
            e1 = Bitmap.createBitmap(k, l, ((android.graphics.Bitmap.Config) (obj1)));
        }
        a(bitmap, ((Bitmap) (e1)));
        if (Log.isLoggable("TransformationUtils", 2))
        {
            (new StringBuilder("request: ")).append(i).append("x").append(j);
            (new StringBuilder("toFit:   ")).append(bitmap.getWidth()).append("x").append(bitmap.getHeight());
            (new StringBuilder("toReuse: ")).append(e1.getWidth()).append("x").append(e1.getHeight());
        }
        obj = new Canvas(e1);
        obj1 = new Matrix();
        ((Matrix) (obj1)).setScale(f, f);
        ((Canvas) (obj)).drawBitmap(bitmap, ((Matrix) (obj1)), new Paint(6));
        return e1;
    }

    private static void a(Bitmap bitmap, Bitmap bitmap1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 12 && bitmap1 != null)
        {
            bitmap1.setHasAlpha(bitmap.hasAlpha());
        }
    }
}
