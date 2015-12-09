// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.c;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

public class b
{

    static PorterDuffColorFilter a;

    public b()
    {
    }

    public static Bitmap a(Bitmap bitmap, float f, float f1)
    {
        Bitmap bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap1);
        Shader shader = a(bitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(shader);
        canvas.drawRoundRect(new RectF(0.0F, 0.0F, bitmap.getWidth(), bitmap.getHeight()), f, f1, paint);
        return bitmap1;
    }

    public static Bitmap a(Bitmap bitmap, int i)
    {
        Bitmap bitmap1;
        Paint paint;
        try
        {
            bitmap1 = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            return null;
        }
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setAlpha(i);
        (new Canvas(bitmap1)).drawBitmap(bitmap, new Matrix(), paint);
        return bitmap1;
    }

    public static Bitmap a(Bitmap bitmap, int i, int j)
        throws OutOfMemoryError
    {
        return a(bitmap, i, j, 0);
    }

    public static Bitmap a(Bitmap bitmap, int i, int j, int k)
        throws OutOfMemoryError
    {
label0:
        {
            int j1 = bitmap.getWidth();
            int k1 = bitmap.getHeight();
            int l;
            if (k != 90 && k != 270)
            {
                int i1 = i;
                i = j;
                j = i1;
            }
            if (j1 > j || k1 > i)
            {
                Bitmap bitmap1;
                boolean flag;
                if ((double)j1 / (double)j > (double)k1 / (double)i)
                {
                    i = (int)(((double)j / (double)j1) * (double)k1);
                } else
                {
                    j = (int)(((double)i / (double)k1) * (double)j1);
                }
                flag = true;
                l = j;
                j = i;
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 0;
                j = k1;
                l = j1;
            }
            if (i == 0)
            {
                bitmap1 = bitmap;
                if (k == 0)
                {
                    break label0;
                }
            }
            if (k == 0)
            {
                bitmap = Bitmap.createScaledBitmap(bitmap, l, j, true);
            } else
            {
                Matrix matrix = new Matrix();
                matrix.postScale((float)l / (float)j1, (float)j / (float)k1);
                matrix.postRotate(k);
                bitmap = Bitmap.createBitmap(bitmap, 0, 0, j1, k1, matrix, true);
            }
            bitmap1 = bitmap;
        }
        return bitmap1;
    }

    public static Bitmap a(Bitmap bitmap, android.graphics.Bitmap.Config config)
    {
        int i = bitmap.getWidth();
        int j = bitmap.getHeight();
        android.graphics.Bitmap.Config config1 = config;
        if (config == null)
        {
            config1 = android.graphics.Bitmap.Config.ARGB_8888;
        }
        config = Bitmap.createBitmap(i, j, config1);
        (new Canvas(config)).drawBitmap(bitmap, new Matrix(), null);
        return config;
    }

    public static Bitmap a(Drawable drawable, Drawable drawable1, float f, float f1)
    {
        int i = drawable.getIntrinsicWidth();
        int j = drawable.getIntrinsicHeight();
        drawable.setBounds(0, 0, i, j);
        Bitmap bitmap = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        drawable.draw(canvas);
        float f2 = (float)i * f;
        f = (float)j * f;
        float f3 = ((float)i - f2) / 2.0F;
        float f4 = ((float)j - f) / 2.0F;
        f1 = (float)j * f1 + f4;
        drawable1.setBounds((int)f3, (int)f1, (int)(f3 + f2), (int)(f1 + f));
        drawable1.setColorFilter(a);
        drawable1.setFilterBitmap(true);
        drawable1.draw(canvas);
        return bitmap;
    }

    public static Shader a(Bitmap bitmap)
    {
        return new BitmapShader(bitmap, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
    }

    public static void a(Bitmap bitmap, Bitmap bitmap1)
    {
        if (bitmap.getWidth() == bitmap1.getWidth() && bitmap.getHeight() == bitmap1.getHeight())
        {
            (new Canvas(bitmap1)).drawBitmap(bitmap, new Matrix(), null);
            return;
        } else
        {
            Canvas canvas = new Canvas(bitmap1);
            Paint paint = new Paint();
            canvas.drawBitmap(bitmap, null, new Rect(0, 0, bitmap1.getWidth(), bitmap1.getHeight()), paint);
            return;
        }
    }

    public static boolean b(Bitmap bitmap, Bitmap bitmap1)
    {
        while (bitmap == null || bitmap1 == null || bitmap.getWidth() != bitmap1.getWidth() || bitmap1.getHeight() != bitmap1.getHeight()) 
        {
            return true;
        }
        return false;
    }

    static 
    {
        a = new PorterDuffColorFilter(-1, android.graphics.PorterDuff.Mode.MULTIPLY);
    }
}
