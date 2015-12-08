// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.f;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.util.DisplayMetrics;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.roidapp.baselib.f:
//            a

public final class c
{

    private static c a;
    private boolean b;

    public c()
    {
        b = false;
    }

    public static Bitmap a(int i, int j, android.graphics.Bitmap.Config config)
    {
        Object obj;
        boolean flag;
        boolean flag1 = false;
        android.graphics.Bitmap.Config config1 = config;
        if (config == null)
        {
            config1 = android.graphics.Bitmap.Config.ARGB_8888;
        }
        obj = null;
        try
        {
            config = Bitmap.createBitmap(i, j, config1);
        }
        // Misplaced declaration of an exception variable
        catch (android.graphics.Bitmap.Config config)
        {
            config.printStackTrace();
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (android.graphics.Bitmap.Config config)
        {
            config.printStackTrace();
            continue; /* Loop/switch isn't completed */
        }
        obj = config;
_L4:
        config = ((android.graphics.Bitmap.Config) (obj));
        flag = flag1;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        System.gc();
        System.gc();
        config = Bitmap.createBitmap(i, j, config1);
        flag = flag1;
_L2:
        if (config != null)
        {
            obj = config;
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_80;
            }
        }
        System.gc();
        System.gc();
        obj = Bitmap.createBitmap(i, j, config1);
        return ((Bitmap) (obj));
        config;
        config.printStackTrace();
        flag = true;
        config = ((android.graphics.Bitmap.Config) (obj));
        continue; /* Loop/switch isn't completed */
        config;
        config.printStackTrace();
        flag = true;
        config = ((android.graphics.Bitmap.Config) (obj));
        if (true) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj1;
        ((NullPointerException) (obj1)).printStackTrace();
        return config;
        obj1;
        ((IllegalArgumentException) (obj1)).printStackTrace();
        return config;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static Bitmap a(Resources resources, int i, android.graphics.BitmapFactory.Options options)
    {
        try
        {
            resources = resources.openRawResource(i);
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources)
        {
            resources.printStackTrace();
            return null;
        }
        options = BitmapFactory.decodeStream(resources, null, options);
        if (resources != null)
        {
            try
            {
                resources.close();
            }
            // Misplaced declaration of an exception variable
            catch (Resources resources)
            {
                resources.printStackTrace();
                return options;
            }
        }
        return options;
    }

    public static Bitmap a(Resources resources, int i, android.graphics.BitmapFactory.Options options, Bitmap bitmap)
    {
        Bitmap bitmap1 = a(resources, i, options);
        bitmap = bitmap1;
        bitmap1 = bitmap;
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        bitmap1 = a(bitmap, resources.getDisplayMetrics().density);
_L2:
        return bitmap1;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
_L7:
        outofmemoryerror.printStackTrace();
        System.gc();
        bitmap1 = bitmap;
        try
        {
            options.inSampleSize = 2;
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources)
        {
            options.inSampleSize = 1;
            outofmemoryerror.printStackTrace();
            return bitmap1;
        }
        bitmap1 = bitmap;
        bitmap = a(resources, i, options);
        bitmap1 = bitmap;
        options.inSampleSize = 1;
        bitmap1 = bitmap;
        if (bitmap == null) goto _L2; else goto _L1
_L1:
        bitmap1 = bitmap;
        resources = a(bitmap, resources.getDisplayMetrics().density);
        return resources;
        resources;
_L6:
        resources.printStackTrace();
        return bitmap;
        resources;
_L4:
        resources.printStackTrace();
        return bitmap;
        resources;
        if (true) goto _L4; else goto _L3
_L3:
        resources;
        if (true) goto _L6; else goto _L5
_L5:
        outofmemoryerror;
          goto _L7
    }

    public static Bitmap a(Bitmap bitmap, float f)
    {
        Bitmap bitmap1 = a((int)((float)bitmap.getWidth() * f), (int)((float)bitmap.getHeight() * f), a.a);
        if (bitmap1 == null)
        {
            return null;
        } else
        {
            Canvas canvas = new Canvas(bitmap1);
            Matrix matrix = new Matrix();
            matrix.postScale(f, f);
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            canvas.drawBitmap(bitmap, matrix, paint);
            bitmap.recycle();
            return bitmap1;
        }
    }

    public static c a()
    {
        if (a == null)
        {
            a = new c();
        }
        return a;
    }

    public static void b()
    {
        a = null;
    }
}
