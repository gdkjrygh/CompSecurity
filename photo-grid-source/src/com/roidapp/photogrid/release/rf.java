// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Environment;
import android.os.StatFs;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.roidapp.cloudlib.template.f;
import com.roidapp.photogrid.common.aj;
import com.roidapp.photogrid.common.az;
import com.roidapp.photogrid.common.bb;
import com.roidapp.photogrid.common.bn;
import com.roidapp.photogrid.common.bo;
import com.roidapp.photogrid.release.a.b;
import com.roidapp.videolib.gl.GPUVideoView;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.roidapp.photogrid.release:
//            ig, ih, rg, ic, 
//            lc, if, rn, rh

public final class rf
{

    private static rf d = new rf();
    public float a;
    public int b;
    public int c;

    private rf()
    {
        a = 1.0F;
        b = 1;
        c = 2;
    }

    private static int a(int i)
    {
        int k;
        if (i <= 8)
        {
            int j = 1;
            do
            {
                k = j;
                if (j >= i)
                {
                    break;
                }
                j <<= 1;
            } while (true);
        } else
        {
            k = ((i + 7) / 8) * 8;
        }
        return k;
    }

    public static int a(Context context)
    {
        char c2 = '\u0140';
        int i = context.getResources().getDisplayMetrics().widthPixels;
        char c1;
        if (i > 800)
        {
            c1 = '\u0190';
        } else
        {
            c1 = c2;
            if (i <= 600)
            {
                c1 = c2;
                if (i <= 320)
                {
                    return i <= 240 ? 160 : 240;
                }
            }
        }
        return c1;
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

    public static Bitmap a(Context context, int i, float f1)
    {
        Object obj;
        obj = new android.graphics.BitmapFactory.Options();
        obj.inJustDecodeBounds = true;
        obj.inSampleSize = 1;
        context = context.getResources().openRawResource(i);
        i = 0;
_L1:
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        BitmapFactory.decodeStream(context, null, ((android.graphics.BitmapFactory.Options) (obj)));
        if (((android.graphics.BitmapFactory.Options) (obj)).outWidth <= 0 || ((android.graphics.BitmapFactory.Options) (obj)).outHeight <= 0)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        if (((android.graphics.BitmapFactory.Options) (obj)).outWidth > ((android.graphics.BitmapFactory.Options) (obj)).outHeight)
        {
            if ((float)((android.graphics.BitmapFactory.Options) (obj)).outWidth > 2.0F * f1)
            {
                obj.inSampleSize = 2;
            }
        } else
        if ((float)((android.graphics.BitmapFactory.Options) (obj)).outHeight > 2.0F * f1)
        {
            obj.inSampleSize = 2;
        }
        obj.inJustDecodeBounds = false;
        try
        {
            context.reset();
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            i = 1;
        }
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        obj = BitmapFactory.decodeStream(context, null, ((android.graphics.BitmapFactory.Options) (obj)));
_L2:
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
                return ((Bitmap) (obj));
            }
        }
        return ((Bitmap) (obj));
        context;
        context.printStackTrace();
        i = 1;
        context = null;
          goto _L1
        obj = null;
          goto _L2
    }

    public static Bitmap a(Context context, int i, android.graphics.BitmapFactory.Options options)
    {
        return a(context.getResources(), i, options);
    }

    public static Bitmap a(Context context, int i, android.graphics.BitmapFactory.Options options, Bitmap bitmap)
    {
        Bitmap bitmap1 = a(context, i, options);
        bitmap = bitmap1;
        bitmap1 = bitmap;
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        float f1 = context.getResources().getDisplayMetrics().density;
        bitmap1 = a(bitmap, f1, f1);
_L2:
        return bitmap1;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
_L5:
        outofmemoryerror.printStackTrace();
        System.gc();
        bitmap1 = bitmap;
        float f2;
        try
        {
            options.inSampleSize = 2;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            options.inSampleSize = 1;
            outofmemoryerror.printStackTrace();
            return bitmap1;
        }
        bitmap1 = bitmap;
        bitmap = a(context, i, options);
        bitmap1 = bitmap;
        options.inSampleSize = 1;
        bitmap1 = bitmap;
        if (bitmap == null) goto _L2; else goto _L1
_L1:
        bitmap1 = bitmap;
        f2 = context.getResources().getDisplayMetrics().density;
        bitmap1 = bitmap;
        context = a(bitmap, f2, f2);
        return context;
        context;
_L4:
        context.printStackTrace();
        return bitmap;
        context;
        if (true) goto _L4; else goto _L3
_L3:
        outofmemoryerror;
          goto _L5
    }

    public static Bitmap a(Context context, String s, float f1)
    {
        android.graphics.BitmapFactory.Options options;
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize = 1;
        context = context.getAssets().open(s);
        boolean flag = false;
_L1:
        if (flag)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        BitmapFactory.decodeStream(context, null, options);
        if (options.outWidth <= 0 || options.outHeight <= 0)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        if (options.outWidth > options.outHeight)
        {
            if ((float)options.outWidth > 2.0F * f1)
            {
                options.inSampleSize = 2;
            }
        } else
        if ((float)options.outHeight > 2.0F * f1)
        {
            options.inSampleSize = 2;
        }
        options.inJustDecodeBounds = false;
        try
        {
            context.reset();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            flag = true;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        s = BitmapFactory.decodeStream(context, null, options);
_L2:
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
                return s;
            }
        }
        return s;
        context;
        context.printStackTrace();
        flag = true;
        context = null;
          goto _L1
        s = null;
          goto _L2
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
            break MISSING_BLOCK_LABEL_37;
        }
        float f1 = resources.getDisplayMetrics().density;
        bitmap1 = a(bitmap, f1, f1);
_L2:
        return bitmap1;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
_L7:
        outofmemoryerror.printStackTrace();
        System.gc();
        bitmap1 = bitmap;
        float f2;
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
        f2 = resources.getDisplayMetrics().density;
        bitmap1 = bitmap;
        resources = a(bitmap, f2, f2);
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

    private Bitmap a(Bitmap bitmap)
    {
        System.gc();
        Object obj;
        Object obj1;
        int ai[];
        int i;
        int l;
        int i1;
        l = bitmap.getWidth();
        i1 = bitmap.getHeight();
        obj = new int[l * i1];
        obj1 = new int[l * i1];
        ai = new int[l * i1];
        bitmap.getPixels(((int []) (obj)), 0, l, 0, 0, l, i1);
        bitmap.recycle();
        break MISSING_BLOCK_LABEL_61;
_L10:
        bitmap = new float[61];
        f2 = (float)Math.sqrt(628.31854248046875D);
        f1 = 0.0F;
        j = 0;
        i = -30;
_L2:
        if (i > 30)
        {
            break; /* Loop/switch isn't completed */
        }
        bitmap[j] = (float)Math.exp(-(float)(i * i) / 200F) / f2;
        f1 += bitmap[j];
        j++;
        i++;
        if (true) goto _L2; else goto _L1
_L3:
        if (i >= 61)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        bitmap[i] = bitmap[i] / f1;
        i++;
          goto _L3
        ai = (int[])ai.clone();
        int ai1[] = (int[])((int []) (obj)).clone();
        a(((float []) (bitmap)), ai, ai1, l, i1, b);
        a(((float []) (bitmap)), ai1, ai, i1, l, b);
        System.arraycopy(ai, 0, obj, 0, obj.length);
        i = 0;
_L4:
        if (i >= obj1.length)
        {
            break MISSING_BLOCK_LABEL_404;
        }
        j = obj[i];
        j1 = obj1[i];
        l1 = obj[i];
        obj[i] = b(j1 + (j1 * l1) / (256 - l1));
        j1 = obj1[i];
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_380;
        }
        j = 0;
_L5:
        obj1[i] = b(j);
        obj[i] = obj[i] + obj1[i];
        obj[i] = b(obj[i]);
        obj[i] = 0xff000000 | obj[i] << 16 | obj[i] << 8 | obj[i];
        i++;
          goto _L4
        j = j1 - ((255 - j1) * (255 - j)) / j;
          goto _L5
        bitmap = Bitmap.createBitmap(l, i1, android.graphics.Bitmap.Config.ARGB_4444);
        bitmap.setPixels(((int []) (obj)), 0, l, 0, 0, l, i1);
        return bitmap;
        obj1;
        bitmap = null;
_L9:
        obj = bitmap;
        if (bitmap != null)
        {
            obj = bitmap;
            if (!bitmap.isRecycled())
            {
                bitmap.recycle();
                obj = null;
            }
        }
        ((Exception) (obj1)).printStackTrace();
_L7:
        System.gc();
        return ((Bitmap) (obj));
        obj1;
        bitmap = null;
_L8:
        obj = bitmap;
        if (bitmap != null)
        {
            obj = bitmap;
            if (!bitmap.isRecycled())
            {
                bitmap.recycle();
                obj = null;
            }
        }
        ((OutOfMemoryError) (obj1)).printStackTrace();
        if (true) goto _L7; else goto _L6
_L6:
        obj1;
          goto _L8
        obj1;
          goto _L9
        float f1;
        float f2;
        int j;
        int j1;
        int l1;
        i = 0;
        while (i < i1) 
        {
            for (int k = 0; k < l; k++)
            {
                int k1 = i * l + k;
                int i2 = obj[k1];
                int j2 = obj[k1];
                int k2 = obj[k1];
                obj1[k1] = (int)(0.114D * (double)(i2 >> 16 & 0xff) + 0.58699999999999997D * (double)(j2 >> 8 & 0xff) + 0.29899999999999999D * (double)(k2 & 0xff));
                ai[k1] = 255 - obj1[k1];
            }

            i++;
        }
          goto _L10
_L1:
        i = 0;
          goto _L3
    }

    public static Bitmap a(Bitmap bitmap, float f1, float f2)
    {
        Bitmap bitmap1 = a((int)((float)bitmap.getWidth() * f1), (int)((float)bitmap.getHeight() * f2), az.c);
        if (bitmap1 == null)
        {
            return null;
        } else
        {
            Canvas canvas = new Canvas(bitmap1);
            Matrix matrix = new Matrix();
            matrix.postScale(f1, f2);
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            canvas.drawBitmap(bitmap, matrix, paint);
            bitmap.recycle();
            return bitmap1;
        }
    }

    public static Bitmap a(Bitmap bitmap, int i)
    {
        Object obj;
        Matrix matrix;
        int j;
        int k;
        if (i % 180 != 0)
        {
            k = bitmap.getHeight();
            j = bitmap.getWidth();
        } else
        {
            k = bitmap.getWidth();
            j = bitmap.getHeight();
        }
        matrix = new Matrix();
        matrix.postTranslate((float)(-bitmap.getWidth()) / 2.0F, (float)(-bitmap.getHeight()) / 2.0F);
        matrix.postRotate(i);
        matrix.postTranslate((float)k / 2.0F, (float)j / 2.0F);
        try
        {
            obj = a(k, j, android.graphics.Bitmap.Config.ARGB_8888);
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
            ((NullPointerException) (obj)).printStackTrace();
            obj = null;
        }
        if (obj == null)
        {
            try
            {
                obj = a(k / 2, j / 2, android.graphics.Bitmap.Config.ARGB_8888);
                matrix.postScale(0.5F, 0.5F);
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
                ((NullPointerException) (obj)).printStackTrace();
                obj = null;
            }
        }
        if (obj == null)
        {
            return null;
        } else
        {
            Canvas canvas = new Canvas(((Bitmap) (obj)));
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            canvas.drawBitmap(bitmap, matrix, paint);
            bitmap.recycle();
            return ((Bitmap) (obj));
        }
    }

    public static Bitmap a(ig ig1)
    {
        return a(ig1, 100, 100, Boolean.valueOf(false));
    }

    public static Bitmap a(ig ig1, int i, int j, Boolean boolean1)
    {
        if (i <= 0 || j <= 0)
        {
            return null;
        }
        Object obj;
        android.graphics.BitmapFactory.Options options;
        int l;
        int i1;
        if (az.q == 6)
        {
            if (ig1.e == null)
            {
                obj = ig1.n;
            } else
            {
                obj = ig1.e;
            }
        } else
        {
            obj = ig1.d();
        }
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(((String) (obj)), options);
        i1 = options.outWidth;
        l = options.outHeight;
        if (i1 <= 0 || l <= 0)
        {
            return null;
        }
        int j1 = bb.a(((String) (obj)));
        int k = j1;
        if (ih.C().W() == 2)
        {
            k = j1 + ig1.q;
        }
        if ((k / 90) % 2 == 1)
        {
            i1 = options.outHeight;
            l = options.outWidth;
        }
        float f1 = (float)j / (float)i;
        boolean flag;
        if ((float)i1 / (float)l > f1)
        {
            l /= i;
            flag = true;
            j = i;
            i = l;
        } else
        {
            i = i1 / j;
            flag = false;
        }
        l = i;
        if (i <= 0)
        {
            l = 1;
        }
        try
        {
            obj = a(ig1, options, l, j, k, flag);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            if (!boolean1.booleanValue())
            {
                ig1 = a(ig1, options, (int)Math.round(Math.pow(2D, (int)Math.ceil(Math.log10(l) / Math.log10(2D)) + 1)), j, k, flag);
                outofmemoryerror.printStackTrace();
                return ig1;
            } else
            {
                throw new OutOfMemoryError("load bitmap oom isHDtest");
            }
        }
        return ((Bitmap) (obj));
    }

    private static Bitmap a(ig ig1, android.graphics.BitmapFactory.Options options, int i, int j, int k, boolean flag)
    {
        Object obj;
        int l = i;
        if (i <= 1)
        {
            l = 1;
        }
        options.inSampleSize = l;
        if (az.a != -1)
        {
            options.inDensity = az.a;
        }
        if (az.a != -1)
        {
            options.inTargetDensity = az.a;
        }
        if (az.b != null)
        {
            options.inScaled = az.b.booleanValue();
        }
        options.inJustDecodeBounds = false;
        float f1;
        float f2;
        Object obj1;
        Canvas canvas;
        Paint paint;
        int i1;
        try
        {
            obj = ig1.d();
            ig1 = BitmapFactory.decodeFile(((String) (obj)), options);
        }
        // Misplaced declaration of an exception variable
        catch (ig ig1)
        {
            obj = null;
            options = null;
            continue; /* Loop/switch isn't completed */
        }
        if (ig1 != null) goto _L2; else goto _L1
_L1:
        System.gc();
        System.gc();
        Thread.sleep(1000L);
_L3:
        options = BitmapFactory.decodeFile(((String) (obj)), options);
        ig1 = options;
        if (options == null)
        {
            return null;
        }
          goto _L2
        obj1;
        ((InterruptedException) (obj1)).printStackTrace();
          goto _L3
        obj1;
        options = null;
        obj = ig1;
        ig1 = ((ig) (obj1));
_L23:
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            ((Bitmap) (obj)).recycle();
        }
        if (options != null && !options.isRecycled())
        {
            options.recycle();
        }
        ig1.printStackTrace();
        throw new OutOfMemoryError("load bitmap oom");
_L2:
        if (k % 180 == 0) goto _L5; else goto _L4
_L4:
        i1 = ig1.getWidth();
        l = ig1.getHeight();
_L12:
        if (!flag) goto _L7; else goto _L6
_L6:
        f1 = (float)j / (float)i1;
_L10:
        if (f1 < 1.0F)
        {
            break; /* Loop/switch isn't completed */
        }
        if (k != 0) goto _L9; else goto _L8
_L8:
        options = ig1.copy(android.graphics.Bitmap.Config.ARGB_8888, true);
        if (options == null)
        {
            break; /* Loop/switch isn't completed */
        }
        ig1.recycle();
        return options;
_L5:
        try
        {
            l = ig1.getWidth();
            i1 = ig1.getHeight();
            continue; /* Loop/switch isn't completed */
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            options = null;
            obj = ig1;
            ig1 = outofmemoryerror;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        f1 = (float)j / (float)l;
          goto _L10
_L9:
        return a(((Bitmap) (ig1)), k);
        if (true) goto _L12; else goto _L11
_L11:
        obj = new Matrix();
        ((Matrix) (obj)).postTranslate((float)(-ig1.getWidth()) / 2.0F, (float)(-ig1.getHeight()) / 2.0F);
        ((Matrix) (obj)).postRotate(k);
        ((Matrix) (obj)).postTranslate((float)l / 2.0F, (float)i1 / 2.0F);
        if (!flag) goto _L14; else goto _L13
_L13:
        i = Math.round(f1 * (float)l);
_L19:
        if (i <= 4096 || j <= 4096) goto _L16; else goto _L15
_L15:
        if (i <= j) goto _L18; else goto _L17
_L17:
        f1 = 4096F / (float)j;
        i = (int)((float)i * f1);
        j = 4096;
_L20:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_538;
        }
        f1 = (float)j / (float)i1;
_L21:
        ((Matrix) (obj)).postScale(f1, f1);
        options = a(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        if (options == null)
        {
            try
            {
                throw new OutOfMemoryError("create bitmap border_bitmap==null");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                obj = ig1;
                ig1 = ((ig) (obj1));
            }
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_549;
_L14:
        f2 = i1;
        k = Math.round(f1 * f2);
        i = j;
        j = k;
          goto _L19
_L18:
        j = (int)((4096F / (float)i) * (float)j);
        i = 4096;
          goto _L20
_L16:
        if (i > 4096)
        {
            j = (int)((4096F / (float)i) * (float)j);
            i = 4096;
        } else
        if (j > 4096)
        {
            f1 = 4096F / (float)j;
            i = (int)((float)i * f1);
            j = 4096;
        }
          goto _L20
        f1 = (float)i / (float)l;
          goto _L21
        canvas = new Canvas(options);
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setColor(0);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        paint.setColor(-1);
        canvas.drawBitmap(ig1, ((Matrix) (obj)), paint);
        ig1.recycle();
        return options;
        if (true) goto _L23; else goto _L22
_L22:
        return ig1;
    }

    public static Bitmap a(String s, float f1)
    {
        Object obj1;
        android.graphics.BitmapFactory.Options options;
        boolean flag;
        Object obj3 = null;
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize = 1;
        Object obj;
        Object obj2;
        try
        {
            obj = com.roidapp.photogrid.release.a.b.a(s);
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
            flag = true;
            ioexception = null;
            continue; /* Loop/switch isn't completed */
        }
        flag = false;
_L8:
        obj1 = obj3;
        obj2 = obj;
        if (flag) goto _L2; else goto _L1
_L1:
        BitmapFactory.decodeStream(((InputStream) (obj)), null, options);
        obj1 = obj3;
        obj2 = obj;
        if (options.outWidth <= 0) goto _L2; else goto _L3
_L3:
        obj1 = obj3;
        obj2 = obj;
        if (options.outHeight <= 0) goto _L2; else goto _L4
_L4:
        if (options.outWidth > options.outHeight)
        {
            if ((float)options.outWidth > 2.0F * f1)
            {
                options.inSampleSize = 2;
            }
        } else
        if ((float)options.outHeight > 2.0F * f1)
        {
            options.inSampleSize = 2;
        }
        options.inJustDecodeBounds = false;
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((IOException) (obj1)).printStackTrace();
            }
        }
        s = com.roidapp.photogrid.release.a.b.a(s);
        obj = s;
_L6:
        obj1 = obj3;
        obj2 = obj;
        if (!flag)
        {
            obj1 = BitmapFactory.decodeStream(((InputStream) (obj)), null, options);
            obj2 = obj;
        }
_L2:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        ((InputStream) (obj2)).close();
        return ((Bitmap) (obj1));
        s;
        s.printStackTrace();
        flag = true;
        if (true) goto _L6; else goto _L5
_L5:
        s;
        s.printStackTrace();
        return ((Bitmap) (obj1));
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static Bitmap a(String s, int i)
    {
        int i1 = bb.a(s);
        Object obj1 = new android.graphics.BitmapFactory.Options();
        obj1.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj1)));
        obj1.inJustDecodeBounds = false;
        Object obj;
        int j;
        int k;
        if (i1 % 180 == 0)
        {
            j = ((android.graphics.BitmapFactory.Options) (obj1)).outWidth;
        } else
        {
            j = ((android.graphics.BitmapFactory.Options) (obj1)).outHeight;
        }
        k = (int)Math.floor((float)j / (float)i);
        j = k;
        if (k <= 0)
        {
            j = 1;
        }
        obj1.inSampleSize = j;
        try
        {
            obj = BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((OutOfMemoryError) (obj)).printStackTrace();
            obj = null;
        }
        if (obj == null)
        {
            int l = a(j);
            float f1;
            Canvas canvas;
            Paint paint;
            if (l <= j)
            {
                j = l * 2;
            } else
            {
                j = l;
            }
            obj1.inSampleSize = j;
            obj = BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj1)));
            s = ((String) (obj));
            if (obj == null)
            {
                return null;
            }
        } else
        {
            s = ((String) (obj));
        }
        if (i1 % 180 == 0)
        {
            f1 = (float)i / (float)s.getWidth();
            j = (int)((float)s.getHeight() * f1);
        } else
        {
            f1 = (float)i / (float)s.getHeight();
            j = (int)((float)s.getWidth() * f1);
        }
        obj = a(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        if (obj == null)
        {
            throw new OutOfMemoryError("free save createbitmap == null");
        } else
        {
            obj1 = new Matrix();
            ((Matrix) (obj1)).postTranslate((float)(-s.getWidth()) / 2.0F, (float)(-s.getHeight()) / 2.0F);
            ((Matrix) (obj1)).postRotate(i1);
            ((Matrix) (obj1)).postScale(f1, f1);
            ((Matrix) (obj1)).postTranslate((float)i / 2.0F, (float)j / 2.0F);
            canvas = new Canvas(((Bitmap) (obj)));
            paint = new Paint();
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
            canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
            canvas.drawBitmap(s, ((Matrix) (obj1)), paint);
            s.recycle();
            return ((Bitmap) (obj));
        }
    }

    public static Bitmap a(String s, int i, int j)
    {
        boolean flag = true;
        Bitmap bitmap;
        Object obj;
        int k;
        if (i <= j)
        {
            i = j;
        }
        k = i / 2;
        obj = new android.graphics.BitmapFactory.Options();
        obj.inJustDecodeBounds = true;
        bitmap = BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj)));
        try
        {
            obj.inJustDecodeBounds = false;
            i = ((android.graphics.BitmapFactory.Options) (obj)).outWidth;
            j = ((android.graphics.BitmapFactory.Options) (obj)).outHeight;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            continue; /* Loop/switch isn't completed */
        }
_L3:
        if (i <= j)
        {
            i = j;
        }
        i = (int)Math.floor((float)i / (float)k);
        if (i <= 0)
        {
            i = ((flag) ? 1 : 0);
        }
        obj = new android.graphics.BitmapFactory.Options();
        obj.inSampleSize = i;
        obj = BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj)));
        if (s.toLowerCase(Locale.ENGLISH).lastIndexOf(".gif") < 0) goto _L2; else goto _L1
_L1:
        s = ((Bitmap) (obj)).copy(android.graphics.Bitmap.Config.ARGB_8888, true);
        if (s == null)
        {
            return ((Bitmap) (obj));
        }
        ((Bitmap) (obj)).recycle();
        return s;
        s;
        bitmap = null;
_L5:
        if (bitmap != null && !bitmap.isRecycled())
        {
            bitmap.recycle();
        }
        s.printStackTrace();
        return null;
        s;
        bitmap = null;
_L4:
        if (bitmap != null && !bitmap.isRecycled())
        {
            bitmap.recycle();
        }
        s.printStackTrace();
        return null;
        s;
        bitmap = ((Bitmap) (obj));
        if (true) goto _L4; else goto _L3
        s;
        bitmap = ((Bitmap) (obj));
        if (true) goto _L5; else goto _L2
_L2:
        return ((Bitmap) (obj));
    }

    public static rf a()
    {
        return d;
    }

    public static String a(long l)
    {
        int i = 3;
        if (l >= 0x40000000L)
        {
            float f1 = (float)l / 1.073742E+09F;
            StringBuilder stringbuilder = new StringBuilder();
            BigDecimal bigdecimal = new BigDecimal(f1);
            if (f1 >= 1000F)
            {
                i = (int)Math.ceil(Math.log10(f1));
            }
            return stringbuilder.append(bigdecimal.round(new MathContext(i)).toPlainString()).append("GB").toString();
        }
        if (l >= 0x100000L)
        {
            float f2 = (float)l / 1048576F;
            StringBuilder stringbuilder1 = new StringBuilder();
            BigDecimal bigdecimal1 = new BigDecimal(f2);
            if (f2 >= 1000F)
            {
                i = (int)Math.ceil(Math.log10(f2));
            }
            return stringbuilder1.append(bigdecimal1.round(new MathContext(i)).toPlainString()).append("MB").toString();
        }
        if (l >= 1024L)
        {
            float f3 = (float)l / 1024F;
            StringBuilder stringbuilder2 = new StringBuilder();
            BigDecimal bigdecimal2 = new BigDecimal(f3);
            if (f3 >= 1000F)
            {
                i = (int)Math.ceil(Math.log10(f3));
            }
            return stringbuilder2.append(bigdecimal2.round(new MathContext(i)).toPlainString()).append("KB").toString();
        } else
        {
            return (new StringBuilder()).append(String.valueOf(l)).append("B").toString();
        }
    }

    private static String a(Context context, Uri uri, String s, String as[], boolean flag)
    {
        Object obj = null;
        if (!flag) goto _L2; else goto _L1
_L1:
        uri = context.getContentResolver().query(uri, new String[] {
            "_data", "title", "artist"
        }, s, as, null);
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_387;
        }
        uri.moveToFirst();
        as = uri.getString(uri.getColumnIndex("_data"));
        s = uri.getString(uri.getColumnIndex("title"));
        context = uri.getString(uri.getColumnIndex("artist"));
        if (s == null || context == null) goto _L4; else goto _L3
_L3:
        s = (new StringBuilder()).append("Music: ").append(s).toString();
        s = (new StringBuilder()).append(s).append(" - ").toString();
        context = (new StringBuilder()).append(s).append(context).toString();
_L7:
        ih.C().f(context);
        s = uri;
        context = as;
_L8:
        uri = context;
        if (s != null)
        {
            int i;
            int j;
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                uri.printStackTrace();
                return context;
            }
            uri = context;
        }
_L9:
        return uri;
_L4:
        i = as.lastIndexOf("/");
        j = as.lastIndexOf(".");
        if (i == -1 || j == -1) goto _L6; else goto _L5
_L5:
        context = (new StringBuilder()).append("Music: ").append(as.substring(i + 1, j)).toString();
          goto _L7
        context;
        uri = null;
_L12:
        context.printStackTrace();
        context = null;
        s = uri;
          goto _L8
_L2:
        context = context.getContentResolver().query(uri, new String[] {
            "_data"
        }, s, as, null);
        uri = obj;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_333;
        }
        context.moveToFirst();
        uri = context.getString(context.getColumnIndex("_data"));
        s = context;
        context = uri;
_L10:
        uri = context;
        if (s != null)
        {
            try
            {
                s.close();
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                uri.printStackTrace();
                return context;
            }
            return context;
        }
          goto _L9
        s;
        uri = null;
_L11:
        s.printStackTrace();
        context = null;
        s = uri;
          goto _L10
        s;
        uri = context;
          goto _L11
        context;
          goto _L12
_L6:
        context = null;
          goto _L7
        context = null;
        s = uri;
          goto _L8
    }

    public static void a(Context context, ArrayList arraylist, int ai[], int i, int j)
    {
        if (az.q != 4) goto _L2; else goto _L1
_L1:
        if (ih.C().h() && ih.C().W() != 4) goto _L4; else goto _L3
_L3:
        context = c();
_L11:
        Object obj = context.iterator();
_L8:
        if (!((Iterator) (obj)).hasNext()) goto _L6; else goto _L5
_L5:
        rg rg1;
        ic ic2;
        rg1 = (rg)((Iterator) (obj)).next();
        ic2 = new ic();
        ai = ic2.b;
        context = ai;
        if (ai != null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        context = new lc();
        ic2.b = context;
        ic2.c = rg1.a;
        a(((lc) (context)), rg1);
        if (arraylist == null) goto _L8; else goto _L7
_L7:
        arraylist.add(ic2);
          goto _L8
        context;
        context.printStackTrace();
_L6:
        return;
_L4:
        obj = ih.C().az();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        if (((List) (obj)).size() != j)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        context = ((List) (obj)).iterator();
        i = 1;
_L10:
        if (!context.hasNext()) goto _L6; else goto _L9
_L9:
        ai = (lc)context.next();
        obj = new ic();
        obj.b = ai;
        obj.c = i;
        arraylist.add(obj);
        i++;
          goto _L10
        context = b(context, ai[i]);
          goto _L11
_L2:
        obj = ih.C().az();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_320;
        }
        if (((List) (obj)).size() != j)
        {
            break MISSING_BLOCK_LABEL_320;
        }
        context = ((List) (obj)).iterator();
        i = 1;
_L13:
        if (!context.hasNext()) goto _L6; else goto _L12
_L12:
        ai = (lc)context.next();
        ic ic1 = new ic();
        ic1.b = ai;
        ic1.c = i;
        arraylist.add(ic1);
        i++;
          goto _L13
label0:
        {
            if (ih.C().W() != 4)
            {
                break label0;
            }
            context = c();
        }
          goto _L11
        if (i >= ai.length) goto _L15; else goto _L14
_L14:
        int k = i;
        if (ai[i] >= 20) goto _L16; else goto _L15
_L15:
        k = aj.a().a[j - 1];
        com.roidapp.photogrid.common.b.a((new StringBuilder("Shape/Error/Load/")).append(j).toString());
        if (az.q != 5)
        {
            break MISSING_BLOCK_LABEL_437;
        }
        ih.C().k(1);
_L17:
        ih.C().p(true);
        ih.C().i(k);
        ih.C().r(k);
_L16:
        context = b(context, ai[k]);
          goto _L11
        ih.C().k(0);
          goto _L17
        context;
        context.printStackTrace();
        return;
          goto _L11
    }

    public static void a(View view, RelativeLayout relativelayout, Context context)
    {
        view = view.getLayoutParams();
        if (ih.C().R() < 0.0F)
        {
            ih.C().d(0.0F);
        }
        ih.C().c(96.7F);
        if (ih.C().R() > 48.35F)
        {
            ih.C().d(48.35F);
        }
        if (ih.C().S() > 48.35F)
        {
            ih.C().e(48.35F);
        }
        int i = ((android.view.ViewGroup.LayoutParams) (view)).width;
        int j = ((android.view.ViewGroup.LayoutParams) (view)).height;
        float f1;
        GPUVideoView gpuvideoview;
        if (ih.C().t() < 1.0F)
        {
            f1 = i;
        } else
        if (ih.C().t() > 1.0F)
        {
            f1 = j;
        } else
        if (ih.C().t() == 1.0F)
        {
            f1 = i;
        } else
        {
            f1 = 0.0F;
        }
        view = (android.view.ViewGroup.MarginLayoutParams)relativelayout.getLayoutParams();
        view.setMargins(0, 0, 0, 0);
        view.width = i;
        view.height = j;
        relativelayout.setLayoutParams(view);
        f1 = (ih.C().Q() * f1) / 100F;
        if ((float)(int)((ih.C().V() / f1) * 200F) > 100F)
        {
            ih.C().f(f1 / 2.0F);
        }
        gpuvideoview = (GPUVideoView)relativelayout.findViewById(1);
        view = gpuvideoview;
        if (gpuvideoview == null)
        {
            view = new GPUVideoView(context);
            view.setId(1);
            relativelayout.addView(view);
        }
        relativelayout = new android.widget.RelativeLayout.LayoutParams(i, j);
        relativelayout.setMargins(0, 0, 0, 0);
        view.setLayoutParams(relativelayout);
    }

    public static void a(View view, RelativeLayout relativelayout, LinearLayout linearlayout, Activity activity, ig aig[], ArrayList arraylist)
    {
        float f1;
        Object obj;
        Object obj1;
        obj1 = view.getLayoutParams();
        f1 = 100F;
        obj = ih.C();
        if (az.q != 4) goto _L2; else goto _L1
_L1:
        if (((ih) (obj)).h()) goto _L4; else goto _L3
_L3:
        view = ((ih) (obj)).n();
_L10:
        Iterator iterator = arraylist.iterator();
_L8:
        if (!iterator.hasNext()) goto _L6; else goto _L5
_L4:
        if (((ih) (obj)).W() == 4)
        {
            view = ((ih) (obj)).n();
            continue; /* Loop/switch isn't completed */
        }
          goto _L7
_L2:
        if (((ih) (obj)).W() == 4)
        {
            view = ((ih) (obj)).n();
            continue; /* Loop/switch isn't completed */
        }
          goto _L7
_L5:
        Object obj2 = (ic)iterator.next();
        boolean flag = false;
        obj2 = ((ic) (obj2)).b;
        Object obj3 = ((lc) (obj2)).b;
        int j = ((List) (obj3)).size();
        int i = 0;
        while (i < j - 1) 
        {
            PointF pointf1 = (PointF)((List) (obj3)).get(i);
            PointF pointf2 = (PointF)((List) (obj3)).get(i + 1);
            float f3 = Math.abs(pointf2.x - pointf1.x);
            float f4 = Math.abs(pointf2.y - pointf1.y);
            float f2;
            boolean flag1;
            if (f3 > f4)
            {
                f2 = f3;
            } else
            {
                f2 = f4;
            }
            flag1 = flag;
            if (f3 != 0.0F)
            {
                flag1 = flag;
                if (f4 != 0.0F)
                {
                    flag1 = true;
                }
            }
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            PointF pointf;
            int k;
            int l;
            int i1;
            int j1;
            int k1;
            int l1;
            int i2;
            int j2;
            if (f2 <= 3F || f1 <= f2)
            {
                f2 = f1;
            }
            i++;
            f1 = f2;
            flag = flag1;
        }
        pointf1 = (PointF)((List) (obj3)).get(0);
        obj3 = (PointF)((List) (obj3)).get(((List) (obj3)).size() - 1);
        f3 = Math.abs(((PointF) (obj3)).x - pointf1.x);
        f4 = Math.abs(((PointF) (obj3)).y - pointf1.y);
        if (f3 > f4)
        {
            f2 = f3;
        } else
        {
            f2 = f4;
        }
        if (f3 != 0.0F && f4 != 0.0F)
        {
            flag = true;
        }
        if (f2 <= 3F || f1 <= f2)
        {
            f2 = f1;
        }
        obj2.f = flag;
        f1 = f2;
        if (true) goto _L8; else goto _L6
_L6:
        if (((ih) (obj)).R() < 0.0F)
        {
            ((ih) (obj)).d(0.0F);
        }
        f7 = f1 - 1.0F - 2.3F;
        ((ih) (obj)).c(f7);
        if (((ih) (obj)).R() > f7 / 2.0F)
        {
            ((ih) (obj)).d(f7 / 2.0F);
        }
        if (((ih) (obj)).S() > f7 / 2.0F)
        {
            ((ih) (obj)).e(f7 / 2.0F);
        }
        i = ((android.view.ViewGroup.LayoutParams) (obj1)).width;
        k = ((android.view.ViewGroup.LayoutParams) (obj1)).height;
        f1 = ((ih) (obj)).R();
        f8 = ((ih) (obj)).S();
        f9 = ((ih) (obj)).t();
        if (f9 < 1.0F)
        {
            f2 = (float)i / (float)k;
            f3 = i;
            f2 *= f1;
            f4 = f1;
        } else
        if (f9 > 1.0F)
        {
            f4 = (float)k / (float)i;
            f3 = k;
            f2 = f1;
            f4 *= f1;
        } else
        if (f9 == 1.0F)
        {
            f3 = i;
            f2 = f1;
            f4 = f1;
        } else
        {
            f2 = 0.0F;
            f4 = 0.0F;
            f3 = 0.0F;
        }
        if (az.q != 4 && az.q != 8)
        {
            if (f9 < 1.0F)
            {
                f6 = 0.0115F * f3;
                f5 = f6;
                f6 *= f9;
            } else
            if (f9 > 1.0F)
            {
                f6 = 0.0115F * f3;
                f5 = f6 / f9;
            } else
            {
                f6 = 0.0115F * f3;
                f5 = f6;
            }
        } else
        {
            f5 = 0.0F;
            f6 = 0.0F;
        }
        if (linearlayout != null)
        {
            obj1 = (android.widget.RelativeLayout.LayoutParams)linearlayout.getLayoutParams();
            l = (int)Math.ceil(f6);
            i1 = (int)Math.ceil(f5);
            obj1.width = i - l * 2;
            obj1.height = k - i1 * 2;
            ((android.widget.RelativeLayout.LayoutParams) (obj1)).setMargins(l, i1, l, i1);
            linearlayout.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        }
        linearlayout = (android.view.ViewGroup.MarginLayoutParams)relativelayout.getLayoutParams();
        if (((ih) (obj)).A() != 0 && !((ih) (obj)).B() && (f8 != 0.0F || f1 != 0.0F))
        {
            if (arraylist.size() > 1)
            {
                f1 = 0.004791666F;
            } else
            {
                f1 = 0.009583333F;
            }
        } else
        {
            f1 = 0.0F;
        }
        i1 = Math.round((f8 / 100F + f1) * f3 + f6);
        j1 = Math.round((f1 + f8 / 100F) * f3 + f5);
        i -= i1 * 2;
        l = k - j1 * 2;
        linearlayout.setMargins(i1, j1, i1, j1);
        if (((ih) (obj)).W() == 4)
        {
            if (i > l)
            {
                k = l;
                i = l;
            } else
            {
                k = i;
                l = i;
                i = k;
                k = l;
            }
        } else
        {
            k = l;
        }
        linearlayout.width = i;
        linearlayout.height = k;
        relativelayout.setLayoutParams(linearlayout);
        f1 = (f7 * f3) / 100F;
        if ((float)(int)((((ih) (obj)).V() / f1) * 200F) > 100F)
        {
            ((ih) (obj)).f(f1 / 2.0F);
            activity.getPreferences(0).edit().putFloat("CORNER_RADIOUS", f1 / 2.0F).apply();
        }
        i1 = ((ih) (obj)).I();
        ((ih) (obj)).j(f4);
        ((ih) (obj)).k(f2);
        obj1 = arraylist.iterator();
        l = 0;
        while (((Iterator) (obj1)).hasNext()) 
        {
            linearlayout = (ic)((Iterator) (obj1)).next();
            obj = ((ic) (linearlayout)).b.a();
            arraylist = ((lc) (obj)).e;
            f1 = ((PointF) (arraylist)).x;
            f3 = ((PointF) (arraylist)).y;
            obj.j = ((lc) (obj)).j + f4;
            obj.k = ((lc) (obj)).k + f2;
            arraylist = ((lc) (obj)).b.iterator();
            do
            {
                if (!arraylist.hasNext())
                {
                    break;
                }
                pointf = (PointF)arraylist.next();
                if (pointf.x > f1)
                {
                    pointf.x = pointf.x - 2.0F * f4;
                }
                if (pointf.y > f3)
                {
                    pointf.y = pointf.y - 2.0F * f2;
                }
            } while (true);
            obj.l = ((lc) (obj)).l - 2.0F * f4;
            obj.m = ((lc) (obj)).m - 2.0F * f2;
            obj.e = new PointF(((lc) (obj)).l / 2.0F, ((lc) (obj)).m / 2.0F);
            if (((lc) (obj)).l <= 0.0F)
            {
                obj.l = 1.0F;
            }
            if (((lc) (obj)).m <= 0.0F)
            {
                obj.m = 1.0F;
            }
            j1 = (int)Math.floor(((float)i * ((lc) (obj)).j) / 100F);
            k1 = (int)Math.floor(((float)k * ((lc) (obj)).k) / 100F);
            l1 = (int)Math.ceil(((float)i * ((lc) (obj)).l) / 100F);
            i2 = (int)Math.ceil(((float)k * ((lc) (obj)).m) / 100F);
            j2 = ((ic) (linearlayout)).c;
            arraylist = (if)relativelayout.findViewById(j2);
            if (arraylist == null)
            {
                arraylist = null;
                linearlayout = arraylist;
                if (view != null)
                {
                    linearlayout = arraylist;
                    if (!view.isEmpty())
                    {
                        linearlayout = b((String)view.get(l), l1, i2);
                    }
                }
                if (aig == null || l >= aig.length || aig[l] == null)
                {
                    throw new OutOfMemoryError("create OOM");
                }
                linearlayout = new if(activity, linearlayout, ((lc) (obj)), aig[l], l1, i2, i, k, i1);
                aig[l].y = ((lc) (obj));
                aig[l].C = l1;
                aig[l].D = i2;
                linearlayout.x = ((if) (linearlayout)).x + (float)(int)(((lc) (obj)).i.x * (float)l1);
                linearlayout.y = ((if) (linearlayout)).y + (float)(int)(((lc) (obj)).i.y * (float)i2);
                linearlayout.z = ((if) (linearlayout)).z + (float)(int)((lc) (obj)).g;
                linearlayout.o = ((if) (linearlayout)).o * ((lc) (obj)).h;
                linearlayout.setId(j2);
                relativelayout.addView(linearlayout);
            } else
            {
                if (aig == null || aig[l] == null)
                {
                    throw new OutOfMemoryError("create OOM");
                }
                aig[l].y = ((lc) (obj));
                aig[l].C = l1;
                aig[l].D = i2;
                arraylist.a(((lc) (obj)), l1, i2, i, k);
                if (((if) (arraylist)).B != i1)
                {
                    arraylist.B = i1;
                    obj = null;
                    linearlayout = ((LinearLayout) (obj));
                    if (view != null)
                    {
                        linearlayout = ((LinearLayout) (obj));
                        if (!view.isEmpty())
                        {
                            linearlayout = b((String)view.get(l), l1, i2);
                        }
                    }
                    arraylist.c(linearlayout);
                    linearlayout = arraylist;
                } else
                {
                    linearlayout = arraylist;
                    if (((if) (arraylist)).e != null)
                    {
                        arraylist.f();
                        linearlayout = arraylist;
                    }
                }
            }
            arraylist = new android.widget.RelativeLayout.LayoutParams(l1, i2);
            arraylist.setMargins(j1, k1, 0, 0);
            linearlayout.setLayoutParams(arraylist);
            l++;
        }
        return;
_L7:
        view = null;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public static void a(LinearLayout linearlayout, Context context, ig aig[])
    {
        int l = aig.length;
        RelativeLayout relativelayout = new RelativeLayout(context);
        relativelayout.setBackgroundColor(-1);
        int i1 = b(context);
        int j1 = (int)((float)i1 * 0.75F);
        int i = Math.round(0.01041667F * (float)i1);
        if (i < 2)
        {
            i = 2;
        }
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(i * 2 + i1, i * l + j1 * l + i);
        int k = 0;
        for (int j = i; k < l; j = j + j1 + i)
        {
            Object obj = new lc();
            Object obj1 = aig[k];
            c(context);
            obj1 = new rn(context, ((lc) (obj)), ((ig) (obj1)), i1, j1);
            ((rn) (obj1)).setBackgroundColor(0xff888888);
            LinearLayout linearlayout1 = new LinearLayout(context);
            linearlayout1.setTag((new StringBuilder("mask")).append(k).toString());
            ((rn) (obj1)).setId(k + 1);
            ((rn) (obj1)).setTag(obj);
            aig[k].y = ((lc) (obj));
            obj = new android.widget.RelativeLayout.LayoutParams(i1, j1);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).setMargins(i, j, 0, 0);
            ((rn) (obj1)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            linearlayout1.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            relativelayout.addView(((View) (obj1)));
            relativelayout.addView(linearlayout1);
            k++;
        }

        linearlayout.addView(relativelayout, layoutparams);
        linearlayout.setBackgroundColor(-1);
    }

    private static void a(lc lc1, float f1, float f2, float f3, float f4)
    {
        lc1.l = f1 - f2;
        lc1.m = f3 - f4;
        lc1.j = f2;
        lc1.k = f4;
        for (Iterator iterator = lc1.b.iterator(); iterator.hasNext();)
        {
            PointF pointf = (PointF)iterator.next();
            pointf.x = pointf.x - f2;
            pointf.y = pointf.y - f4;
        }

        lc1.e = new PointF(lc1.l / 2.0F, lc1.m / 2.0F);
    }

    private static void a(lc lc1, rg rg1)
    {
        Object obj = rg1.b;
        f f6 = rg1.i;
        ArrayList arraylist = new ArrayList();
        obj = ((List) (obj)).iterator();
        float f1 = 100F;
        float f4 = 0.0F;
        float f5 = 100F;
        float f2;
        float f3;
        for (f3 = 0.0F; ((Iterator) (obj)).hasNext(); f3 = f2)
        {
            PointF pointf1 = c((String)((Iterator) (obj)).next());
            f2 = f3;
            if (pointf1.x > f3)
            {
                f2 = pointf1.x;
            }
            f3 = f5;
            if (pointf1.x < f5)
            {
                f3 = pointf1.x;
            }
            f5 = f4;
            if (pointf1.y > f4)
            {
                f5 = pointf1.y;
            }
            if (pointf1.y < f1)
            {
                f1 = pointf1.y;
            }
            arraylist.add(pointf1);
            f4 = f5;
            f5 = f3;
        }

        lc1.b = arraylist;
        PointF pointf;
        for (Iterator iterator = lc1.b.iterator(); iterator.hasNext(); lc1.c.add(pointf))
        {
            pointf = (PointF)iterator.next();
            pointf = new PointF(pointf.x, pointf.y);
        }

        lc1.g = rg1.h;
        lc1.h = rg1.g;
        if (f6 == null)
        {
            lc1.i = new PointF(0.0F, 0.0F);
        } else
        {
            lc1.i = new PointF(f6.a, f6.b);
        }
        a(lc1, f3, f5, f4, f1);
    }

    public static void a(ArrayList arraylist, int i)
    {
        List list = ih.C().az();
        Iterator iterator;
        if (list == null || list.size() != i)
        {
            list = (new rh(ih.C().N())).a(0);
            i = 1;
        } else
        {
            i = 0;
        }
        iterator = list.iterator();
        for (int j = 1; iterator.hasNext(); j++)
        {
            lc lc1 = (lc)iterator.next();
            if (lc1.c.size() == 0)
            {
                PointF pointf;
                for (Iterator iterator1 = lc1.b.iterator(); iterator1.hasNext(); lc1.c.add(new PointF(pointf.x + lc1.j, pointf.y + lc1.k)))
                {
                    pointf = (PointF)iterator1.next();
                }

            }
            ic ic1 = new ic();
            lc1.g = 0.0F;
            lc1.h = 1.0F;
            lc1.i = new PointF(0.0F, 0.0F);
            ic1.b = lc1;
            ic1.c = j;
            arraylist.add(ic1);
        }

        if (i != 0)
        {
            ih.C().m(list);
        }
    }

    public static void a(ArrayList arraylist, String s)
    {
        if (ih.C().W() == 4)
        {
            Iterator iterator = c().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                rg rg1 = (rg)iterator.next();
                ic ic2 = new ic();
                lc lc1 = ic2.b;
                s = lc1;
                if (lc1 == null)
                {
                    s = new lc();
                    ic2.b = s;
                }
                ic2.c = rg1.a;
                a(((lc) (s)), rg1);
                if (arraylist != null)
                {
                    arraylist.add(ic2);
                }
            } while (true);
        } else
        {
            String as[] = s.split("@");
            int l = as.length;
            int j = 1;
            for (int i = 0; i < l; i++)
            {
                String s1 = as[i];
                ic ic1 = new ic();
                s = ic1.b;
                if (s == null)
                {
                    s = new lc();
                    ic1.b = s;
                }
                ic1.c = j;
                String as1[] = s1.split("_");
                ArrayList arraylist1 = new ArrayList();
                float f2 = 0.0F;
                float f4 = 100F;
                float f3 = 0.0F;
                float f1 = 100F;
                int i1 = as1.length;
                for (int k = 0; k < i1; k++)
                {
                    PointF pointf1 = c(as1[k]);
                    if (pointf1.x > f2)
                    {
                        f2 = pointf1.x;
                    }
                    if (pointf1.x < f4)
                    {
                        f4 = pointf1.x;
                    }
                    if (pointf1.y > f3)
                    {
                        f3 = pointf1.y;
                    }
                    if (pointf1.y < f1)
                    {
                        f1 = pointf1.y;
                    }
                    arraylist1.add(pointf1);
                }

                s.b = arraylist1;
                PointF pointf;
                for (Iterator iterator1 = ((lc) (s)).b.iterator(); iterator1.hasNext(); ((lc) (s)).c.add(pointf))
                {
                    pointf = (PointF)iterator1.next();
                    pointf = new PointF(pointf.x, pointf.y);
                }

                s.g = 0.0F;
                s.h = 1.0F;
                s.i = new PointF(0.0F, 0.0F);
                a(((lc) (s)), f2, f4, f3, f1);
                if (arraylist != null)
                {
                    arraylist.add(ic1);
                }
                j++;
            }

        }
    }

    private void a(float af[], int ai[], int ai1[], int i, int j, int k)
    {
        int i1 = 0;
        while (i1 < j) 
        {
            int k1 = 0;
            int j1 = i1;
            while (k1 < i) 
            {
                float f1 = 0.0F;
                float f2 = 0.0F;
                float f3 = 0.0F;
                int l1 = -30;
                while (l1 <= 30) 
                {
                    float f6 = af[l1 + 30];
                    if (f6 != 0.0F)
                    {
                        int i2 = k1 + l1;
                        float f4;
                        float f7;
                        float f8;
                        int l;
                        if (i2 < 0)
                        {
                            if (k == b)
                            {
                                l = 0;
                            } else
                            {
                                l = i2;
                                if (k == c)
                                {
                                    l = (k1 + i) % i;
                                }
                            }
                        } else
                        {
                            l = i2;
                            if (i2 >= i)
                            {
                                if (k == b)
                                {
                                    l = i - 1;
                                } else
                                {
                                    l = i2;
                                    if (k == c)
                                    {
                                        l = (k1 + i) % i;
                                    }
                                }
                            }
                        }
                        l = ai[l + i1 * i];
                        f7 = l >> 16 & 0xff;
                        f8 = l >> 8 & 0xff;
                        f4 = (float)(l & 0xff) * f6 + f3;
                        f2 += f8 * f6;
                        f3 = f1 + f7 * f6;
                        f1 = f4;
                    } else
                    {
                        float f5 = f1;
                        f1 = f3;
                        f3 = f5;
                    }
                    l1++;
                    f4 = f3;
                    f3 = f1;
                    f1 = f4;
                }
                ai1[j1] = (int)f1 << 16 | (int)f2 << 8 | (int)f3;
                k1++;
                j1 += j;
            }
            i1++;
        }
    }

    public static boolean a(Context context, int i)
    {
        boolean flag = true;
        boolean flag3 = true;
        boolean flag2 = true;
        boolean flag1 = flag3;
        Object obj;
        File file;
        long l;
        try
        {
            context = PreferenceManager.getDefaultSharedPreferences(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return flag1;
        }
        flag1 = flag3;
        if (context.getInt("get_memory_error", 0) == 1)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        flag1 = flag3;
        context.edit().putInt("get_memory_error", 1).apply();
        flag = flag2;
        flag1 = flag3;
        if (!Environment.getExternalStorageState().equals("mounted"))
        {
            break MISSING_BLOCK_LABEL_190;
        }
        flag1 = flag3;
        obj = context.getString("SAVEPATH", Environment.getExternalStorageDirectory().getPath());
        flag1 = flag3;
        file = new File(((String) (obj)));
        flag1 = flag3;
        if (file.exists())
        {
            break MISSING_BLOCK_LABEL_133;
        }
        flag1 = flag3;
        file.mkdirs();
        flag1 = flag3;
        obj = new StatFs(((String) (obj)));
        flag1 = flag3;
        l = ((StatFs) (obj)).getBlockSize();
        flag1 = flag3;
        l = ((long)((StatFs) (obj)).getAvailableBlocks() * l) / 0x100000L;
        flag = flag2;
        if ((long)i > l)
        {
            flag = false;
        }
        flag1 = flag;
        context.edit().putInt("get_memory_error", 2).apply();
        return flag;
    }

    public static boolean a(File file)
    {
        return com.roidapp.baselib.a.b.a(file);
    }

    public static boolean a(String s)
    {
        return (new File(s)).exists();
    }

    public static int[] a(View view)
    {
        return (new int[] {
            view.getLayoutParams().width, view.getLayoutParams().height
        });
    }

    public static lc[] a(Context context, int i, int j)
    {
        lc alc[] = new lc[j];
        Object obj1;
        XmlResourceParser xmlresourceparser;
        obj1 = new ArrayList();
        xmlresourceparser = context.getResources().getXml(i);
        i = xmlresourceparser.getEventType();
        Object obj = null;
          goto _L1
_L14:
        i = xmlresourceparser.next();
        obj = context;
          goto _L1
_L12:
        if ("control".equals(xmlresourceparser.getName()))
        {
            context = new rg();
            break; /* Loop/switch isn't completed */
        }
          goto _L2
        context;
        context.printStackTrace();
_L4:
        return alc;
_L2:
        if (!"ID".equals(xmlresourceparser.getName()))
        {
            break MISSING_BLOCK_LABEL_137;
        }
        xmlresourceparser.next();
        obj.a = Integer.parseInt(xmlresourceparser.getText());
        context = ((Context) (obj));
        break; /* Loop/switch isn't completed */
        context;
        context.printStackTrace();
        return alc;
        if (!"x".equals(xmlresourceparser.getName()))
        {
            break MISSING_BLOCK_LABEL_180;
        }
        xmlresourceparser.next();
        obj.c = Float.parseFloat(xmlresourceparser.getText());
        context = ((Context) (obj));
        break; /* Loop/switch isn't completed */
        if (!"y".equals(xmlresourceparser.getName()))
        {
            break MISSING_BLOCK_LABEL_223;
        }
        xmlresourceparser.next();
        obj.d = Float.parseFloat(xmlresourceparser.getText());
        context = ((Context) (obj));
        break; /* Loop/switch isn't completed */
        if (!"maxedge".equals(xmlresourceparser.getName()))
        {
            break MISSING_BLOCK_LABEL_266;
        }
        xmlresourceparser.next();
        obj.e = Float.parseFloat(xmlresourceparser.getText());
        context = ((Context) (obj));
        break; /* Loop/switch isn't completed */
        context = ((Context) (obj));
        if (!"rotate".equals(xmlresourceparser.getName()))
        {
            break; /* Loop/switch isn't completed */
        }
        xmlresourceparser.next();
        obj.f = Integer.parseInt(xmlresourceparser.getText());
        context = ((Context) (obj));
        break; /* Loop/switch isn't completed */
_L10:
        context = ((Context) (obj));
        if (!"control".equals(xmlresourceparser.getName()))
        {
            break; /* Loop/switch isn't completed */
        }
        ((List) (obj1)).add(obj);
        context = ((Context) (obj));
        break; /* Loop/switch isn't completed */
_L7:
        context = ((List) (obj1)).iterator();
        i = 0;
_L5:
        if (!context.hasNext()) goto _L4; else goto _L3
_L3:
        obj = (rg)context.next();
        obj1 = new lc();
        obj1.o = ((rg) (obj)).f;
        obj1.n = ((rg) (obj)).e / 100F;
        obj1.j = ((rg) (obj)).c / 100F;
        obj1.k = ((rg) (obj)).d / 100F;
        alc[i] = ((lc) (obj1));
        i++;
          goto _L5
          goto _L4
_L1:
        if (i == 1) goto _L7; else goto _L6
_L6:
        i;
        JVM INSTR tableswitch 2 3: default 472
    //                   2 51
    //                   3 311;
           goto _L8 _L9 _L10
_L9:
        break; /* Loop/switch isn't completed */
_L8:
        context = ((Context) (obj));
        break; /* Loop/switch isn't completed */
        if (true) goto _L12; else goto _L11
_L11:
        if (true) goto _L14; else goto _L13
_L13:
    }

    public static String[] a(Context context, Uri uri, boolean flag)
    {
        Object obj;
        obj = null;
        if (uri.getAuthority() != null)
        {
            if ("com.google.android.apps.docs.storage".equals(uri.getAuthority()))
            {
                return (new String[] {
                    "-1", null
                });
            }
            if ("com.google.android.apps.docs.files".equals(uri.getAuthority()))
            {
                return (new String[] {
                    "-1", null
                });
            }
            if ("com.google.android.apps.photos.content".equals(uri.getAuthority()))
            {
                return (new String[] {
                    "-1", null
                });
            }
            if ("com.google.android.apps.docs.storage.legacy".equals(uri.getAuthority()))
            {
                return (new String[] {
                    "-1", null
                });
            }
        }
        if (!uri.toString().startsWith("file:///")) goto _L2; else goto _L1
_L1:
        context = Uri.decode(uri.getEncodedPath());
_L4:
        if (context == null || !(new File(context)).exists())
        {
            return (new String[] {
                "-2", context
            });
        }
        break; /* Loop/switch isn't completed */
_L2:
        int j;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            bo.a();
            if (bo.a(context, uri))
            {
                if ("com.android.providers.media.documents".equals(uri.getAuthority()))
                {
                    bo.a();
                    uri = bo.a(uri).split(":")[1];
                    if (flag)
                    {
                        context = a(context, android.provider.MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[] {
                            uri
                        }, flag);
                    } else
                    {
                        context = a(context, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id=?", new String[] {
                            uri
                        }, flag);
                    }
                    continue; /* Loop/switch isn't completed */
                }
                if ("com.android.providers.downloads.documents".equals(uri.getAuthority()))
                {
                    bo.a();
                    uri = bo.a(uri);
                    context = a(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(uri).longValue()), ((String) (null)), ((String []) (null)), flag);
                    continue; /* Loop/switch isn't completed */
                }
                if ("com.android.externalstorage.documents".equals(uri.getAuthority()))
                {
                    bo.a();
                    uri = bo.a(uri).split(":");
                    context = uri[0];
                    uri = uri[1];
                    if ("primary".equalsIgnoreCase(context))
                    {
                        context = (new StringBuilder()).append(Environment.getExternalStorageDirectory()).append("/").append(uri).toString();
                        continue; /* Loop/switch isn't completed */
                    }
                    File afile[] = (new File("/storage")).listFiles();
                    if (afile == null)
                    {
                        return (new String[] {
                            "-2", null
                        });
                    }
                    int i = 0;
                    do
                    {
                        context = obj;
                        if (i >= afile.length)
                        {
                            continue; /* Loop/switch isn't completed */
                        }
                        if ((new File(afile[i].getAbsolutePath(), uri)).exists())
                        {
                            context = (new StringBuilder()).append(afile[i].getAbsolutePath()).append("/").append(uri).toString();
                            continue; /* Loop/switch isn't completed */
                        }
                        i++;
                    } while (true);
                }
                try
                {
                    bo.a();
                    context = bo.a(uri);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    return (new String[] {
                        "-1", null
                    });
                }
                continue; /* Loop/switch isn't completed */
            }
        }
        if (!"com.google.android.apps.photos.contentprovider".equals(uri.getAuthority()))
        {
            break MISSING_BLOCK_LABEL_637;
        }
        try
        {
            uri = Uri.decode(uri.toString());
            j = uri.indexOf("content://media/");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return (new String[] {
                "-2", null
            });
        }
        if (j < 0)
        {
            return (new String[] {
                "-2", null
            });
        }
        uri = Uri.parse(uri.substring(j, uri.indexOf("/ACTUAL")));
        context = a(context, uri, ((String) (null)), ((String []) (null)), flag);
        continue; /* Loop/switch isn't completed */
        context = a(context, uri, ((String) (null)), ((String []) (null)), flag);
        if (true) goto _L4; else goto _L3
_L3:
        if (flag)
        {
            if (context.substring(context.lastIndexOf("/") + 1) != null)
            {
                uri = context.substring(context.lastIndexOf(".") + 1).toLowerCase(Locale.ENGLISH);
                if (!uri.equals("mp3") && !uri.equals("m4a") && !uri.equals("amr") && !uri.equals("aac") && !uri.equals("ogg") && !uri.equals("flac") && !uri.equals("3gpp") && !uri.equals("3ga") && !uri.equals("wav"))
                {
                    return (new String[] {
                        "-3", context
                    });
                }
            } else
            {
                return (new String[] {
                    "-3", context
                });
            }
        } else
        {
            uri = context.toLowerCase(Locale.ENGLISH);
            if (uri.endsWith(".png") || uri.endsWith(".jpg") || uri.endsWith(".gif") || uri.endsWith(".bmp") || uri.endsWith(".jpeg") || uri.endsWith(".mpo") || bn.a(context))
            {
                if (!b(context))
                {
                    return (new String[] {
                        "-2", context
                    });
                }
            } else
            {
                return (new String[] {
                    "-3", context
                });
            }
        }
        return (new String[] {
            "1", context
        });
    }

    private static int b(int i)
    {
        int j;
        if (i < 0)
        {
            j = 0;
        } else
        {
            j = i;
            if (i > 255)
            {
                return 255;
            }
        }
        return j;
    }

    public static int b(Context context)
    {
        return (int)((float)a(context) * c(context));
    }

    public static Bitmap b(Context context, int i, int j)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inScaled = false;
        Bitmap bitmap1;
        try
        {
            a(context, i, options);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return null;
        }
        if (options.outWidth == -1 || options.outHeight == -1)
        {
            bitmap1 = null;
        } else
        {
            options.inJustDecodeBounds = false;
            float f1 = ((float)options.outWidth * 1.0F) / (float)j;
            Bitmap bitmap;
            if (f1 < 1.0F)
            {
                options.inSampleSize = 1;
            } else
            {
                options.inSampleSize = (int)Math.floor(f1);
            }
            try
            {
                bitmap = a(context, i, options);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                outofmemoryerror.printStackTrace();
                outofmemoryerror = null;
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                exception = null;
            }
            bitmap1 = bitmap;
            if (bitmap == null)
            {
                options.inSampleSize = options.inSampleSize * 2;
                try
                {
                    context = a(context, i, options);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    context.printStackTrace();
                    return null;
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    context.printStackTrace();
                    return null;
                }
                return context;
            }
        }
        return bitmap1;
    }

    public static Bitmap b(String s, float f1)
    {
        Object obj;
        android.graphics.BitmapFactory.Options options;
        boolean flag;
        flag = true;
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inSampleSize = 1;
        obj = null;
        BitmapFactory.decodeFile(s, options);
        flag = false;
_L1:
        Bitmap bitmap = obj;
        if (!flag)
        {
            bitmap = obj;
            if (options.outWidth > 0)
            {
                bitmap = obj;
                if (options.outHeight > 0)
                {
                    Exception exception;
                    if (options.outWidth > options.outHeight)
                    {
                        if ((float)options.outWidth > 2.0F * f1)
                        {
                            options.inSampleSize = 2;
                        }
                    } else
                    if ((float)options.outHeight > 2.0F * f1)
                    {
                        options.inSampleSize = 2;
                    }
                    options.inJustDecodeBounds = false;
                    bitmap = BitmapFactory.decodeFile(s, options);
                }
            }
        }
        return bitmap;
        exception;
        exception.printStackTrace();
          goto _L1
    }

    public static Bitmap b(String s, int i, int j)
    {
        if ("null".equals(s))
        {
            return null;
        }
        Object obj2 = new android.graphics.BitmapFactory.Options();
        obj2.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj2)));
        int k = ((android.graphics.BitmapFactory.Options) (obj2)).outHeight;
        int l = ((android.graphics.BitmapFactory.Options) (obj2)).outWidth;
        float f1 = 1.0F;
        if (k > j || l > i)
        {
            f1 = (float)k / (float)j;
            float f2 = (float)l / (float)i;
            if (f1 > f2)
            {
                f1 = f2;
            }
        }
        obj2.inSampleSize = Math.round(f1);
        obj2.inJustDecodeBounds = false;
        Object obj1 = BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj2)));
        Object obj = obj1;
        if (obj1 == null)
        {
            System.gc();
            System.gc();
            try
            {
                Thread.sleep(1000L);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((InterruptedException) (obj)).printStackTrace();
            }
            s = BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj2)));
            obj = s;
            if (s == null)
            {
                return null;
            }
        }
        s = Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        obj1 = new Canvas(s);
        obj2 = new Matrix();
        ((Matrix) (obj2)).postScale((float)i / (float)((Bitmap) (obj)).getWidth(), (float)j / (float)((Bitmap) (obj)).getHeight());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        ((Canvas) (obj1)).setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        ((Canvas) (obj1)).drawBitmap(((Bitmap) (obj)), ((Matrix) (obj2)), paint);
        ((Bitmap) (obj)).recycle();
        return s;
    }

    private static List b(Context context, int i)
    {
        List list;
        ArrayList arraylist;
        XmlResourceParser xmlresourceparser;
        list = null;
        arraylist = new ArrayList();
        xmlresourceparser = context.getResources().getXml(i);
        i = xmlresourceparser.getEventType();
        context = null;
_L2:
        Object obj;
        Object obj1;
        if (i == 1)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        switch (i)
        {
        default:
            obj1 = context;
            obj = list;
            break;

        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 3: // '\003'
            break MISSING_BLOCK_LABEL_214;
        }
_L3:
        i = xmlresourceparser.next();
        list = ((List) (obj));
        context = ((Context) (obj1));
        if (true) goto _L2; else goto _L1
_L1:
        if ("control".equals(xmlresourceparser.getName()))
        {
            obj1 = new rg();
            obj = new ArrayList();
        } else
        if ("ID".equals(xmlresourceparser.getName()))
        {
            xmlresourceparser.next();
            context.a = Integer.parseInt(xmlresourceparser.getText());
            obj = list;
            obj1 = context;
        } else
        {
            obj = list;
            obj1 = context;
            if ("P".equals(xmlresourceparser.getName()))
            {
                xmlresourceparser.next();
                list.add(xmlresourceparser.getText());
                obj = list;
                obj1 = context;
            }
        }
          goto _L3
        obj = list;
        obj1 = context;
        if ("control".equals(xmlresourceparser.getName()))
        {
            context.b = list;
            arraylist.add(context);
            obj = list;
            obj1 = context;
        }
          goto _L3
        return arraylist;
    }

    public static void b(LinearLayout linearlayout, Context context, ig aig[])
    {
        int l = aig.length;
        RelativeLayout relativelayout = new RelativeLayout(context);
        relativelayout.setBackgroundColor(-1);
        int i1 = b(context);
        int j1 = (int)((float)i1 * 0.75F);
        int i = Math.round(0.01041667F * (float)i1);
        if (i < 2)
        {
            i = 2;
        }
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(i * l + j1 * l + i, i * 2 + i1);
        int k = 0;
        for (int j = i; k < l; j = j + j1 + i)
        {
            Object obj = new lc();
            Object obj1 = aig[k];
            c(context);
            obj1 = new rn(context, ((lc) (obj)), ((ig) (obj1)), j1, i1);
            ((rn) (obj1)).setBackgroundColor(0xff888888);
            LinearLayout linearlayout1 = new LinearLayout(context);
            linearlayout1.setTag((new StringBuilder("mask")).append(k).toString());
            ((rn) (obj1)).setId(k + 1);
            ((rn) (obj1)).setTag(obj);
            aig[k].y = ((lc) (obj));
            obj = new android.widget.RelativeLayout.LayoutParams(j1, i1);
            ((android.widget.RelativeLayout.LayoutParams) (obj)).setMargins(j, i, 0, 0);
            ((rn) (obj1)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            linearlayout1.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            relativelayout.addView(((View) (obj1)));
            relativelayout.addView(linearlayout1);
            k++;
        }

        linearlayout.addView(relativelayout, layoutparams);
        linearlayout.setBackgroundColor(-1);
    }

    public static boolean b()
    {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean b(String s)
    {
        return !TextUtils.isEmpty(s) && com.roidapp.baselib.a.b.a(new File(s));
    }

    private static float c(Context context)
    {
        int i = context.getResources().getDisplayMetrics().widthPixels;
        if (i > 800)
        {
            return 2.0F;
        }
        return i <= 600 ? 1.0F : 1.5F;
    }

    private static PointF c(String s)
    {
        s = s.split("#");
        return new PointF(Float.parseFloat(s[0]), Float.parseFloat(s[1]));
    }

    private static List c()
    {
        boolean flag2 = false;
        int i = 1;
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist = (ArrayList)ih.C().i();
        List list = ih.C().j();
        List list1 = ih.C().k();
        List list2 = ih.C().l();
        Iterator iterator;
        boolean flag;
        boolean flag1;
        if (list == null || list.size() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (list1 == null || list1.size() == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (list2 == null || list2.size() == 0)
        {
            flag2 = true;
        }
        iterator = arraylist.iterator();
        while (iterator.hasNext()) 
        {
            Object obj = (List)iterator.next();
            rg rg1 = new rg();
            rg1.a = i;
            rg1.b = ((List) (obj));
            Float float1;
            if (flag)
            {
                obj = null;
            } else
            {
                obj = (Float)list.get(i - 1);
            }
            if (flag1)
            {
                float1 = null;
            } else
            {
                float1 = (Float)list1.get(i - 1);
            }
            if (obj != null)
            {
                rg1.g = ((Float) (obj)).floatValue();
            }
            if (float1 != null)
            {
                rg1.h = float1.floatValue();
            }
            if (flag2)
            {
                obj = null;
            } else
            {
                obj = (f)list2.get(i - 1);
            }
            rg1.i = ((f) (obj));
            arraylist1.add(rg1);
            i++;
        }
        return arraylist1;
    }

    public final Bitmap a(ig ig1, int i, int j)
    {
        Bitmap bitmap = a(ig1, i, j, Boolean.valueOf(false));
        ig1 = bitmap;
        if (bitmap != null)
        {
            ig1 = a(bitmap);
        }
        return ig1;
    }

}
