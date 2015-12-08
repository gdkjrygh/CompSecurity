// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.roidapp.baselib.c.x;
import java.io.File;

public final class b
{

    public static Bitmap a(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return null;
        }
        int i = bitmap.getWidth();
        int j = bitmap.getHeight();
        float f;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        Bitmap bitmap1;
        int k;
        if (i <= j)
        {
            f7 = i / 2;
            f = i;
            f3 = f;
            f6 = 0.0F;
            j = i;
            f4 = f;
            float f1 = f;
            k = j;
            f5 = f;
            f = f1;
            j = i;
        } else
        {
            float f2 = j / 2;
            f6 = (i - j) / 2;
            f3 = i;
            f = j;
            f7 = f3 - f6;
            i = j;
            f4 = f;
            f3 = f;
            f5 = f;
            f = f4;
            f4 = f5;
            f5 = f7;
            f7 = f2;
            k = i;
        }
        try
        {
            bitmap1 = Bitmap.createBitmap(k, j, android.graphics.Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmap1);
            Paint paint = new Paint();
            Rect rect = new Rect((int)f6, 0, (int)f5, (int)f3);
            Rect rect1 = new Rect(0, 0, (int)f4, (int)f);
            RectF rectf = new RectF(rect1);
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-1);
            canvas.drawRoundRect(rectf, f7, f7, paint);
            paint.setXfermode(new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, rect, rect1, paint);
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            return null;
        }
        return bitmap1;
    }

    public static boolean a(File file)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag1 = true;
        flag2 = false;
        flag = flag2;
        if (file == null) goto _L2; else goto _L1
_L1:
        flag = flag2;
        if (!file.exists()) goto _L2; else goto _L3
_L3:
        flag = flag2;
        if (!file.isFile()) goto _L2; else goto _L4
_L4:
        flag = flag2;
        if (file.length() <= 0L) goto _L2; else goto _L5
_L5:
        android.graphics.BitmapFactory.Options options;
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        if (options.outWidth <= 0) goto _L7; else goto _L6
_L6:
        int i = options.outHeight;
        if (i <= 0) goto _L7; else goto _L8
_L8:
        flag = flag1;
_L2:
        return flag;
_L7:
        flag = false;
        if (true) goto _L2; else goto _L9
_L9:
        file;
        file.printStackTrace();
        return false;
    }

    public static x b(File file)
    {
        if (!file.exists() || !file.isFile() || file.length() <= 0L)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        if (options.outWidth <= 0 || options.outHeight <= 0)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        file = new x(Integer.valueOf(options.outWidth), Integer.valueOf(options.outHeight));
        return file;
        file;
        file.printStackTrace();
        return null;
    }
}
