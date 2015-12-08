// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import com.roidapp.baselib.c.v;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

public class a
{

    private static a b;
    private Bitmap a;

    public a()
    {
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

    private static int a(android.graphics.BitmapFactory.Options options, int i)
    {
        boolean flag = true;
        double d = options.outWidth;
        double d1 = options.outHeight;
        int j;
        int k;
        if (i == -1)
        {
            j = 1;
        } else
        {
            j = (int)Math.ceil(Math.sqrt((d * d1) / (double)i));
        }
        k = j;
        if (128 >= j)
        {
            k = j;
            if (i == -1)
            {
                k = 1;
            }
        }
        if (k <= 8)
        {
            i = ((flag) ? 1 : 0);
            do
            {
                j = i;
                if (i >= k)
                {
                    break;
                }
                i <<= 1;
            } while (true);
        } else
        {
            j = ((k + 7) / 8) * 8;
        }
        return j;
    }

    private static int a(String s)
    {
        if (android.os.Build.VERSION.SDK_INT <= 5)
        {
            return 0;
        }
        Class aclass[];
        Class class1;
        class1 = Class.forName("android.media.ExifInterface");
        aclass = new Class[1];
        aclass[0] = java/lang/String;
        s = ((String) (class1.getConstructor(aclass).newInstance(new Object[] {
            s
        })));
        if (s == null)
        {
            return 0;
        }
        Method method = s.getClass().getMethod("getAttribute", aclass);
        if (method == null)
        {
            return 0;
        }
        s = (String)method.invoke(s, new Object[] {
            "Orientation"
        });
        if (s == null)
        {
            return 0;
        }
        if (s.equals("3"))
        {
            return 180;
        }
        if (s.equals("6"))
        {
            return 90;
        }
        boolean flag = s.equals("8");
        return !flag ? 0 : 270;
        s;
        s.printStackTrace();
_L2:
        return 0;
        s;
        s.printStackTrace();
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        continue; /* Loop/switch isn't completed */
        s;
        s.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static int a(String s, android.graphics.BitmapFactory.Options options, int i, int j)
    {
        int l = options.outWidth;
        int k = options.outHeight;
        if ((a(s) / 90) % 2 == 1)
        {
            l = options.outHeight;
            k = options.outWidth;
        }
        if (l <= i && k <= j)
        {
            return 1;
        }
        if ((float)i / (float)j > (float)l / (float)k)
        {
            return (int)(((float)k * 1.0F) / (float)j);
        } else
        {
            return (int)(((float)l * 1.0F) / (float)i);
        }
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

    public static Bitmap a(Context context, int i, float f)
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
            if ((float)((android.graphics.BitmapFactory.Options) (obj)).outWidth > 2.0F * f)
            {
                obj.inSampleSize = 2;
            }
        } else
        if ((float)((android.graphics.BitmapFactory.Options) (obj)).outHeight > 2.0F * f)
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

    public static Bitmap a(Bitmap bitmap, float f)
    {
        return a(bitmap, f, f, true);
    }

    private static Bitmap a(Bitmap bitmap, float f, float f1, boolean flag)
    {
        int i = (int)((float)bitmap.getWidth() * f);
        int j = (int)((float)bitmap.getHeight() * f1);
        Object obj;
        try
        {
            obj = a(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = null;
        }
        if (obj == null)
        {
            return null;
        }
        Canvas canvas = new Canvas(((Bitmap) (obj)));
        Matrix matrix = new Matrix();
        matrix.postScale(f, f1);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        canvas.drawBitmap(bitmap, matrix, paint);
        if (flag)
        {
            bitmap.recycle();
        }
        return ((Bitmap) (obj));
    }

    private static Bitmap a(Bitmap bitmap, int i)
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

    public static Bitmap a(Bitmap bitmap, int i, int j)
    {
        Bitmap bitmap1;
        try
        {
            bitmap1 = a(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            bitmap.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            bitmap.printStackTrace();
            return null;
        }
        if (bitmap1 == null)
        {
            return null;
        }
        Canvas canvas = new Canvas(bitmap1);
        canvas.drawColor(-1);
        Matrix matrix = new Matrix();
        float f;
        int k;
        int l;
        int i1;
        int j1;
        if (bitmap.getWidth() > bitmap.getHeight())
        {
            k = bitmap.getWidth();
        } else
        {
            k = bitmap.getHeight();
        }
        f = (float)i / (float)k;
        k = i / 2;
        l = bitmap.getWidth() / 2;
        i1 = j / 2;
        j1 = bitmap.getHeight() / 2;
        matrix.postTranslate(k - l, i1 - j1);
        matrix.postScale(f, f, i / 2, j / 2);
        canvas.drawBitmap(bitmap, matrix, new Paint());
        return bitmap1;
    }

    private static Bitmap a(Bitmap bitmap, String s)
    {
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        Bitmap bitmap1;
        if (bitmap.isRecycled())
        {
            break MISSING_BLOCK_LABEL_65;
        }
        bitmap1 = bitmap;
        if (android.os.Build.VERSION.SDK_INT <= 5)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        int i = 0;
        try
        {
            if (s.length() > 0)
            {
                i = a(s);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return bitmap;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return bitmap;
        }
        bitmap1 = bitmap;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        s = a(bitmap, i);
        return s;
        bitmap1 = null;
        return bitmap1;
    }

    public static Bitmap a(FileInputStream fileinputstream, int i, int j, android.graphics.Bitmap.Config config)
    {
        String s;
        Object obj;
        android.graphics.BitmapFactory.Options options;
        s = null;
        obj = null;
        options = new android.graphics.BitmapFactory.Options();
        options.inPreferredConfig = config;
        options.inJustDecodeBounds = true;
        config = fileinputstream.getFD();
        BitmapFactory.decodeFileDescriptor(config, null, options);
        options.inSampleSize = a(options, i * j);
        options.inJustDecodeBounds = false;
        config = BitmapFactory.decodeFileDescriptor(config, null, options);
        if (options.outWidth == -1) goto _L2; else goto _L1
_L1:
        if (options.outHeight == -1)
        {
            return null;
        }
        s = v.a(fileinputstream);
        fileinputstream.close();
        if (!s.contains("FFD8FF")) goto _L4; else goto _L3
_L3:
        fileinputstream = "jpg";
_L6:
        if (!fileinputstream.equals("gif"))
        {
            return config;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (s.contains("89504E47"))
        {
            fileinputstream = "png";
            continue; /* Loop/switch isn't completed */
        }
        if (s.contains("47494638"))
        {
            fileinputstream = "gif";
            continue; /* Loop/switch isn't completed */
        }
        if (s.contains("49492A00"))
        {
            fileinputstream = "tif";
            continue; /* Loop/switch isn't completed */
        }
        fileinputstream = s;
        if (s.contains("424D"))
        {
            fileinputstream = "bmp";
        }
        if (true) goto _L6; else goto _L5
_L5:
        fileinputstream = config.copy(android.graphics.Bitmap.Config.ARGB_8888, true);
        config.recycle();
        return fileinputstream;
        fileinputstream;
_L9:
        fileinputstream.printStackTrace();
        return config;
        config;
        fileinputstream = s;
_L8:
        com/roidapp/baselib/a/a.getSimpleName();
        config.getMessage();
        config.getMessage();
        return fileinputstream;
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        fileinputstream = config;
        config = outofmemoryerror;
        if (true) goto _L8; else goto _L7
_L7:
        fileinputstream;
        config = obj;
        if (true) goto _L9; else goto _L2
_L2:
        return null;
    }

    public static Bitmap a(String s, int i)
    {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, options);
        int k = options.outWidth;
        int j = options.outHeight;
        if ((a(s) / 90) % 2 == 1)
        {
            k = options.outHeight;
            j = options.outWidth;
        }
        options.inJustDecodeBounds = false;
        Object obj;
        Object obj1;
        if (k <= j)
        {
            k = j;
        }
        j = (int)((float)k / (float)i);
        i = j;
        if (j <= 0)
        {
            i = 1;
        }
        options.inSampleSize = i;
        options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        try
        {
            obj = BitmapFactory.decodeFile(s, options);
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            try
            {
                System.gc();
                options.inSampleSize = i * 2;
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
                ((NullPointerException) (obj)).printStackTrace();
                obj = null;
            }
            outofmemoryerror.printStackTrace();
        }
        catch (NullPointerException nullpointerexception)
        {
            nullpointerexception.printStackTrace();
            nullpointerexception = null;
        }
        obj1 = obj;
        if (obj != null)
        {
            obj1 = a(((Bitmap) (obj)), s);
        }
        return ((Bitmap) (obj1));
    }

    public static Bitmap a(String s, int i, int j)
    {
        Object obj1;
        obj1 = new android.graphics.BitmapFactory.Options();
        obj1.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj1)));
        obj1.inSampleSize = a(s, ((android.graphics.BitmapFactory.Options) (obj1)), i, j);
        obj1.inJustDecodeBounds = false;
        Bitmap bitmap = BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj1)));
        if (s.toLowerCase(Locale.ENGLISH).lastIndexOf(".gif") < 0) goto _L2; else goto _L1
_L1:
        Matrix matrix = new Matrix();
        float f = 1.0F / (float)((android.graphics.BitmapFactory.Options) (obj1)).inSampleSize;
        matrix.postScale(f, f);
        obj1 = a((int)((float)bitmap.getWidth() * f), (int)(f * (float)bitmap.getHeight()), android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(((Bitmap) (obj1)));
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.drawBitmap(bitmap, matrix, null);
        bitmap.recycle();
_L4:
        return ((Bitmap) (obj1));
_L2:
        obj1 = bitmap;
        if (bitmap == null) goto _L4; else goto _L3
_L3:
        return a(bitmap, s);
        Object obj;
        obj;
        ((OutOfMemoryError) (obj)).printStackTrace();
        obj = null;
          goto _L2
        obj;
        ((NullPointerException) (obj)).printStackTrace();
        obj = null;
          goto _L2
    }

    public static Bitmap a(String s, int i, int j, boolean flag, boolean flag1)
    {
label0:
        {
label1:
            {
label2:
                {
                    if (s == null || !(new File(s)).exists())
                    {
                        break label0;
                    }
                    if (!flag1)
                    {
                        break label1;
                    }
                    a();
                    Bitmap bitmap = b(s, i);
                    if (bitmap == null)
                    {
                        break label0;
                    }
                    if (bitmap.getWidth() == i)
                    {
                        s = bitmap;
                        if (bitmap.getHeight() == j)
                        {
                            break label2;
                        }
                    }
                    s = a().a(bitmap, i, j, flag);
                    bitmap.recycle();
                }
                return s;
            }
            a();
            return b(s, i);
        }
        return null;
    }

    public static a a()
    {
        if (b == null)
        {
            b = new a();
        }
        return b;
    }

    private static Bitmap b(String s, int i)
    {
        Object obj = new android.graphics.BitmapFactory.Options();
        obj.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj)));
        int k = ((android.graphics.BitmapFactory.Options) (obj)).outWidth;
        int j = ((android.graphics.BitmapFactory.Options) (obj)).outHeight;
        if ((a(s) / 90) % 2 == 1)
        {
            k = ((android.graphics.BitmapFactory.Options) (obj)).outHeight;
            j = ((android.graphics.BitmapFactory.Options) (obj)).outWidth;
        }
        obj.inJustDecodeBounds = false;
        Bitmap bitmap;
        int l;
        int i1;
        if (k > j)
        {
            l = j;
        } else
        {
            l = k;
        }
        i1 = j;
        if (k > j)
        {
            i1 = k;
        }
        j = i1;
        if ((double)((float)i1 / (float)l) <= 1.7778D)
        {
            j = l;
        }
        j = (int)((float)j / (float)i);
        i = j;
        if (j <= 0)
        {
            i = 1;
        }
        obj.inSampleSize = i;
        obj.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        try
        {
            bitmap = BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj)));
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            outofmemoryerror.printStackTrace();
            outofmemoryerror = null;
        }
        catch (NullPointerException nullpointerexception)
        {
            nullpointerexception.printStackTrace();
            nullpointerexception = null;
        }
        if (bitmap == null)
        {
            try
            {
                System.gc();
                obj.inSampleSize = i * 2;
                bitmap = BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj)));
            }
            catch (OutOfMemoryError outofmemoryerror1)
            {
                outofmemoryerror1.printStackTrace();
                outofmemoryerror1 = null;
            }
            catch (NullPointerException nullpointerexception1)
            {
                nullpointerexception1.printStackTrace();
                nullpointerexception1 = null;
            }
        }
        obj = bitmap;
        if (bitmap != null)
        {
            obj = a(bitmap, s);
        }
        return ((Bitmap) (obj));
    }

    public static Bitmap b(String s, int i, int j)
    {
        Object obj1;
        boolean flag;
        flag = true;
        obj1 = new android.graphics.BitmapFactory.Options();
        obj1.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj1)));
        if (((android.graphics.BitmapFactory.Options) (obj1)).outWidth != -1 && ((android.graphics.BitmapFactory.Options) (obj1)).outHeight != -1) goto _L2; else goto _L1
_L1:
        obj1 = null;
_L4:
        return ((Bitmap) (obj1));
_L2:
        Object obj;
        i = a(s, ((android.graphics.BitmapFactory.Options) (obj1)), i, j);
        if (i <= 0)
        {
            i = ((flag) ? 1 : 0);
        }
        obj1.inSampleSize = i;
        obj1.inJustDecodeBounds = false;
        obj1.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
        try
        {
            obj = BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj1)));
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            outofmemoryerror.printStackTrace();
            outofmemoryerror = null;
        }
        catch (NullPointerException nullpointerexception)
        {
            nullpointerexception.printStackTrace();
            nullpointerexception = null;
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        j = a(i);
        if (j <= i)
        {
            i = j * 2;
        } else
        {
            i = j;
        }
        try
        {
            obj1.inSampleSize = i;
            obj = BitmapFactory.decodeFile(s, ((android.graphics.BitmapFactory.Options) (obj1)));
        }
        catch (OutOfMemoryError outofmemoryerror1)
        {
            outofmemoryerror1.printStackTrace();
            outofmemoryerror1 = null;
        }
        catch (NullPointerException nullpointerexception1)
        {
            nullpointerexception1.printStackTrace();
            nullpointerexception1 = null;
        }
        obj1 = obj;
        if (obj != null)
        {
            return a(((Bitmap) (obj)), s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void b()
    {
        if (b == null)
        {
            return;
        }
        Bitmap bitmap = b.a;
        if (bitmap != null && !bitmap.isRecycled())
        {
            bitmap.recycle();
        }
        b = null;
    }

    public final Bitmap a(Bitmap bitmap, int i, int j, boolean flag)
    {
        Bitmap bitmap1;
        try
        {
            bitmap1 = a(i, j, android.graphics.Bitmap.Config.ARGB_8888);
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            bitmap.printStackTrace();
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Bitmap bitmap)
        {
            bitmap.printStackTrace();
            return null;
        }
        if (bitmap1 == null)
        {
            return null;
        }
        Canvas canvas = new Canvas(bitmap1);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.drawColor(-1);
        Matrix matrix = new Matrix();
        float f;
        int k;
        if (bitmap.getWidth() < bitmap.getHeight())
        {
            k = bitmap.getWidth();
        } else
        {
            k = bitmap.getHeight();
        }
        f = (float)i / (float)k;
        matrix.postTranslate((float)i / 2.0F - (float)bitmap.getWidth() / 2.0F, (float)j / 2.0F - (float)bitmap.getHeight() / 2.0F);
        matrix.postScale(f, f, (float)i / 2.0F, (float)j / 2.0F);
        canvas.drawBitmap(bitmap, matrix, new Paint());
        if (flag && a != null && !a.isRecycled())
        {
            float f1 = ((float)i * 0.27F) / (float)a.getWidth();
            try
            {
                bitmap = a(a, f1, f1, false);
            }
            // Misplaced declaration of an exception variable
            catch (Bitmap bitmap)
            {
                bitmap = null;
            }
            if (bitmap == null)
            {
                return null;
            }
            f1 = (float)i * 0.02F;
            canvas.drawBitmap(bitmap, (float)(i - bitmap.getWidth()) - f1, (float)(j - bitmap.getHeight()) - f1, new Paint());
            bitmap.recycle();
        }
        return bitmap1;
    }

    public final void a(Bitmap bitmap)
    {
        a = bitmap;
    }
}
