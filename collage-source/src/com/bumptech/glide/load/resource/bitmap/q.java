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
import com.bumptech.glide.load.engine.a.c;

public final class q
{

    private q()
    {
    }

    public static int a(int i)
    {
        switch (i)
        {
        default:
            return 0;

        case 5: // '\005'
        case 6: // '\006'
            return 90;

        case 3: // '\003'
        case 4: // '\004'
            return 180;

        case 7: // '\007'
        case 8: // '\b'
            return 270;
        }
    }

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
        if (bitmap == null)
        {
            bitmap = Bitmap.createBitmap(i, j, a(bitmap1));
        }
        a(bitmap1, bitmap);
        (new Canvas(bitmap)).drawBitmap(bitmap1, matrix, new Paint(6));
        return bitmap;
    }

    public static Bitmap a(Bitmap bitmap, c c1, int i)
    {
        Matrix matrix = new Matrix();
        a(i, matrix);
        if (matrix.isIdentity())
        {
            return bitmap;
        }
        RectF rectf = new RectF(0.0F, 0.0F, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectf);
        i = Math.round(rectf.width());
        int j = Math.round(rectf.height());
        android.graphics.Bitmap.Config config = a(bitmap);
        Bitmap bitmap1 = c1.a(i, j, config);
        c1 = bitmap1;
        if (bitmap1 == null)
        {
            c1 = Bitmap.createBitmap(i, j, config);
        }
        matrix.postTranslate(-rectf.left, -rectf.top);
        (new Canvas(c1)).drawBitmap(bitmap, matrix, new Paint(6));
        return c1;
    }

    public static Bitmap a(Bitmap bitmap, c c1, int i, int j)
    {
        if (bitmap.getWidth() == i && bitmap.getHeight() == j)
        {
            if (Log.isLoggable("TransformationUtils", 2))
            {
                Log.v("TransformationUtils", "requested target size matches input, returning input");
            }
        } else
        {
            float f = Math.min((float)i / (float)bitmap.getWidth(), (float)j / (float)bitmap.getHeight());
            int k = (int)((float)bitmap.getWidth() * f);
            int l = (int)((float)bitmap.getHeight() * f);
            if (bitmap.getWidth() == k && bitmap.getHeight() == l)
            {
                if (Log.isLoggable("TransformationUtils", 2))
                {
                    Log.v("TransformationUtils", "adjusted target size matches input, returning input");
                    return bitmap;
                }
            } else
            {
                Object obj1 = a(bitmap);
                Object obj = c1.a(k, l, ((android.graphics.Bitmap.Config) (obj1)));
                c1 = ((c) (obj));
                if (obj == null)
                {
                    c1 = Bitmap.createBitmap(k, l, ((android.graphics.Bitmap.Config) (obj1)));
                }
                a(bitmap, ((Bitmap) (c1)));
                if (Log.isLoggable("TransformationUtils", 2))
                {
                    Log.v("TransformationUtils", (new StringBuilder()).append("request: ").append(i).append("x").append(j).toString());
                    Log.v("TransformationUtils", (new StringBuilder()).append("toFit:   ").append(bitmap.getWidth()).append("x").append(bitmap.getHeight()).toString());
                    Log.v("TransformationUtils", (new StringBuilder()).append("toReuse: ").append(c1.getWidth()).append("x").append(c1.getHeight()).toString());
                    Log.v("TransformationUtils", (new StringBuilder()).append("minPct:   ").append(f).toString());
                }
                obj = new Canvas(c1);
                obj1 = new Matrix();
                ((Matrix) (obj1)).setScale(f, f);
                ((Canvas) (obj)).drawBitmap(bitmap, ((Matrix) (obj1)), new Paint(6));
                return c1;
            }
        }
        return bitmap;
    }

    static void a(int i, Matrix matrix)
    {
        switch (i)
        {
        default:
            return;

        case 2: // '\002'
            matrix.setScale(-1F, 1.0F);
            return;

        case 3: // '\003'
            matrix.setRotate(180F);
            return;

        case 4: // '\004'
            matrix.setRotate(180F);
            matrix.postScale(-1F, 1.0F);
            return;

        case 5: // '\005'
            matrix.setRotate(90F);
            matrix.postScale(-1F, 1.0F);
            return;

        case 6: // '\006'
            matrix.setRotate(90F);
            return;

        case 7: // '\007'
            matrix.setRotate(-90F);
            matrix.postScale(-1F, 1.0F);
            return;

        case 8: // '\b'
            matrix.setRotate(-90F);
            break;
        }
    }

    public static void a(Bitmap bitmap, Bitmap bitmap1)
    {
        if (android.os.Build.VERSION.SDK_INT >= 12 && bitmap1 != null)
        {
            bitmap1.setHasAlpha(bitmap.hasAlpha());
        }
    }
}
