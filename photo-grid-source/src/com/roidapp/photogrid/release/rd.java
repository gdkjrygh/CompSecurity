// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PaintFlagsDrawFilter;
import com.roidapp.photogrid.common.bb;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

// Referenced classes of package com.roidapp.photogrid.release:
//            rf

public final class rd
{

    private static rd a;

    private rd()
    {
    }

    public static Bitmap a(Context context, int i, int j, int k)
    {
        boolean flag = true;
        Object obj = new android.graphics.BitmapFactory.Options();
        obj.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(context.getResources(), i, ((android.graphics.BitmapFactory.Options) (obj)));
        int l;
        if (((android.graphics.BitmapFactory.Options) (obj)).outHeight > ((android.graphics.BitmapFactory.Options) (obj)).outWidth)
        {
            l = ((android.graphics.BitmapFactory.Options) (obj)).outHeight / j;
        } else
        {
            l = ((android.graphics.BitmapFactory.Options) (obj)).outWidth / k;
        }
        if (l == 0)
        {
            l = ((flag) ? 1 : 0);
        }
        obj.inSampleSize = l;
        obj.inJustDecodeBounds = false;
        try
        {
            rf.a();
            context = rf.a(context, i, ((android.graphics.BitmapFactory.Options) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            context = null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            context = null;
        }
        if (context == null)
        {
            return null;
        }
        float f;
        Canvas canvas;
        Matrix matrix;
        if (context.getWidth() < context.getHeight())
        {
            obj = (new BigDecimal(j)).divide(new BigDecimal(context.getHeight()), 2, 4);
        } else
        {
            obj = (new BigDecimal(k)).divide(new BigDecimal(context.getWidth()), 2, 4);
        }
        f = ((BigDecimal) (obj)).floatValue();
        rf.a();
        obj = rf.a((int)((float)context.getWidth() * f), (int)((float)context.getHeight() * f), android.graphics.Bitmap.Config.ARGB_8888);
        canvas = new Canvas(((Bitmap) (obj)));
        matrix = new Matrix();
        matrix.postScale(f, f);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.drawBitmap(context, matrix, null);
        context.recycle();
        return ((Bitmap) (obj));
    }

    public static Bitmap a(Context context, String s, int i, int j)
    {
        boolean flag = true;
        int k;
        try
        {
            context = context.getAssets().open(s);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        s = new android.graphics.BitmapFactory.Options();
        s.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(context, null, s);
        if (((android.graphics.BitmapFactory.Options) (s)).outHeight > ((android.graphics.BitmapFactory.Options) (s)).outWidth)
        {
            k = ((android.graphics.BitmapFactory.Options) (s)).outHeight / i;
        } else
        {
            k = ((android.graphics.BitmapFactory.Options) (s)).outWidth / j;
        }
        if (k == 0)
        {
            k = ((flag) ? 1 : 0);
        }
        s.inSampleSize = k;
        s.inJustDecodeBounds = false;
        if (context != null)
        {
            try
            {
                context.reset();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
                return null;
            }
        }
        s = BitmapFactory.decodeStream(context, null, s);
        if (context != null)
        {
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                context.printStackTrace();
            }
        }
        if (s == null)
        {
            return null;
        }
        float f;
        Canvas canvas;
        Matrix matrix;
        if (s.getWidth() < s.getHeight())
        {
            context = (new BigDecimal(i)).divide(new BigDecimal(s.getHeight()), 2, 4);
        } else
        {
            context = (new BigDecimal(j)).divide(new BigDecimal(s.getWidth()), 2, 4);
        }
        f = context.floatValue();
        rf.a();
        context = rf.a((int)((float)s.getWidth() * f), (int)((float)s.getHeight() * f), android.graphics.Bitmap.Config.ARGB_8888);
        canvas = new Canvas(context);
        matrix = new Matrix();
        matrix.postScale(f, f);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.drawBitmap(s, matrix, null);
        s.recycle();
        return context;
    }

    public static Bitmap a(String s, int i, int j)
    {
        rf.a();
        Object obj;
        if (!rf.a(s))
        {
            return null;
        }
        Bitmap bitmap;
        try
        {
            obj = c(s, i, j);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((OutOfMemoryError) (obj)).printStackTrace();
            obj = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
            obj = null;
        }
_L4:
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        bitmap = c(s, i / 2, j / 2);
        obj = bitmap;
_L2:
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1;
        try
        {
            s = bb.a(((Bitmap) (obj)), s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            if (obj != null && !((Bitmap) (obj)).isRecycled())
            {
                ((Bitmap) (obj)).recycle();
                return null;
            }
            break MISSING_BLOCK_LABEL_174;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            if (obj != null && !((Bitmap) (obj)).isRecycled())
            {
                ((Bitmap) (obj)).recycle();
                return null;
            }
            break MISSING_BLOCK_LABEL_174;
        }
        return s;
        obj1;
        ((OutOfMemoryError) (obj1)).printStackTrace();
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            ((Bitmap) (obj)).recycle();
        }
        obj = null;
        continue; /* Loop/switch isn't completed */
        obj1;
        ((Exception) (obj1)).printStackTrace();
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            ((Bitmap) (obj)).recycle();
        }
        obj = null;
        if (true) goto _L2; else goto _L1
_L1:
        return ((Bitmap) (obj));
        return null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static rd a()
    {
        com/roidapp/photogrid/release/rd;
        JVM INSTR monitorenter ;
        rd rd1;
        if (a == null)
        {
            a = new rd();
        }
        rd1 = a;
        com/roidapp/photogrid/release/rd;
        JVM INSTR monitorexit ;
        return rd1;
        Exception exception;
        exception;
        throw exception;
    }

    public static Bitmap b(String s, int i, int j)
    {
        Bitmap bitmap = c(s, i, j);
        Object obj = bitmap;
        if (bitmap != null) goto _L2; else goto _L1
_L1:
        return null;
        obj;
        ((OutOfMemoryError) (obj)).printStackTrace();
        if (false)
        {
            throw new NullPointerException();
        }
        obj = null;
_L2:
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s = bb.a(((Bitmap) (obj)), s);
        return s;
        obj;
        ((Exception) (obj)).printStackTrace();
        if (false)
        {
            throw new NullPointerException();
        }
        obj = null;
        if (true) goto _L2; else goto _L3
_L3:
        break; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            ((Bitmap) (obj)).recycle();
            return null;
        }
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            ((Bitmap) (obj)).recycle();
            return null;
        }
        if (true) goto _L1; else goto _L4
_L4:
        return ((Bitmap) (obj));
    }

    private static Bitmap c(String s, int i, int j)
    {
        android.graphics.BitmapFactory.Options options;
        boolean flag1;
        boolean flag2;
        flag2 = true;
        flag1 = false;
        options = new android.graphics.BitmapFactory.Options();
        options.inSampleSize = 1;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, options);
        if (options.outWidth == -1) goto _L2; else goto _L1
_L1:
        if (options.outHeight == -1)
        {
            return null;
        }
        int k;
        int l;
        k = options.outWidth;
        l = options.outHeight;
        Object obj;
        boolean flag;
        if ((l * j) / k < i)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if ((k * i) / l >= j)
        {
            flag1 = true;
        }
          goto _L3
_L9:
        if (flag || !flag1) goto _L5; else goto _L4
_L4:
        i = options.outHeight / i;
_L8:
        i = (int)Math.floor(i);
        if (i < 0)
        {
            i = ((flag2) ? 1 : 0);
        }
        try
        {
            options.inSampleSize = i;
            options.inJustDecodeBounds = false;
            options.inDither = false;
            options.inScaled = false;
            obj = BitmapFactory.decodeFile(s, options);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((OutOfMemoryError) (obj)).printStackTrace();
            obj = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
            obj = null;
        }
        if (obj != null) goto _L7; else goto _L6
_L6:
        options.inSampleSize = options.inSampleSize * 2;
        s = BitmapFactory.decodeFile(s, options);
        return s;
_L5:
        i = options.outWidth / j;
          goto _L8
        s;
        s.printStackTrace();
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            ((Bitmap) (obj)).recycle();
            return null;
        }
          goto _L2
        s;
        s.printStackTrace();
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            ((Bitmap) (obj)).recycle();
            return null;
        }
          goto _L2
_L7:
        return ((Bitmap) (obj));
_L2:
        return null;
_L3:
        if (flag && !flag1) goto _L5; else goto _L9
    }
}
