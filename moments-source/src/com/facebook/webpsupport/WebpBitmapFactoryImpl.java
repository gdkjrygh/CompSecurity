// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.webpsupport;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.facebook.androidcompat.AndroidCompat;
import com.facebook.common.soloader.SoLoaderShim;
import com.facebook.common.webp.WebpBitmapFactory;
import com.facebook.common.webp.WebpSupportStatus;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class WebpBitmapFactoryImpl
    implements WebpBitmapFactory
{

    public static final boolean a;

    public WebpBitmapFactoryImpl()
    {
    }

    private static InputStream a(InputStream inputstream)
    {
        Object obj = inputstream;
        if (!inputstream.markSupported())
        {
            obj = new BufferedInputStream(inputstream, 20);
        }
        return ((InputStream) (obj));
    }

    private static void a(Bitmap bitmap, android.graphics.BitmapFactory.Options options)
    {
        if (bitmap != null && options != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        int j;
        i = options.inDensity;
        if (i == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        bitmap.setDensity(i);
        j = options.inTargetDensity;
        if (j == 0 || i == j || i == options.inScreenDensity || !options.inScaled) goto _L1; else goto _L3
_L3:
        bitmap.setDensity(j);
        return;
        if (!a || options.inBitmap == null) goto _L1; else goto _L4
_L4:
        bitmap.setDensity(160);
        return;
    }

    private static byte[] a(InputStream inputstream, android.graphics.BitmapFactory.Options options)
    {
        inputstream.mark(20);
        if (options != null && options.inTempStorage != null && options.inTempStorage.length >= 20)
        {
            options = options.inTempStorage;
        } else
        {
            options = new byte[20];
        }
        try
        {
            inputstream.read(options, 0, 20);
            inputstream.reset();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            return null;
        }
        return options;
    }

    private static void b(Bitmap bitmap, android.graphics.BitmapFactory.Options options)
    {
        a(bitmap, options);
        if (options != null)
        {
            options.outMimeType = "image/webp";
        }
    }

    private static Bitmap createBitmap(int i, int j, android.graphics.BitmapFactory.Options options)
    {
        return Bitmap.createBitmap(i, j, android.graphics.Bitmap.Config.ARGB_8888);
    }

    private static Bitmap getInBitmapFromOptions(android.graphics.BitmapFactory.Options options)
    {
        if (a && options != null)
        {
            return options.inBitmap;
        } else
        {
            return null;
        }
    }

    private static byte[] getInTempStorageFromOptions(android.graphics.BitmapFactory.Options options)
    {
        if (options != null && options.inTempStorage != null)
        {
            return options.inTempStorage;
        } else
        {
            return new byte[8192];
        }
    }

    private static float getScaleFromOptions(android.graphics.BitmapFactory.Options options)
    {
        float f1 = 1.0F;
        float f = f1;
        if (options != null)
        {
            int i = options.inSampleSize;
            if (i > 1)
            {
                f1 = 1.0F / (float)i;
            }
            f = f1;
            if (options.inScaled)
            {
                int j = options.inDensity;
                int k = options.inTargetDensity;
                int l = options.inScreenDensity;
                f = f1;
                if (j != 0)
                {
                    f = f1;
                    if (k != 0)
                    {
                        f = f1;
                        if (j != l)
                        {
                            f = (float)k / (float)j;
                        }
                    }
                }
            }
        }
        return f;
    }

    public static Bitmap hookDecodeByteArray(byte abyte0[], int i, int j)
    {
        return hookDecodeByteArray(abyte0, i, j, null);
    }

    public static Bitmap hookDecodeByteArray(byte abyte0[], int i, int j, android.graphics.BitmapFactory.Options options)
    {
        if (WebpSupportStatus.c(abyte0, i, j) && !WebpSupportStatus.a(abyte0, i, j))
        {
            abyte0 = nativeDecodeByteArray(abyte0, i, j, options, getScaleFromOptions(options), getInBitmapFromOptions(options), getInTempStorageFromOptions(options));
            b(abyte0, options);
            return abyte0;
        } else
        {
            return originalDecodeByteArray(abyte0, i, j, options);
        }
    }

    public static Bitmap hookDecodeFile(String s)
    {
        return hookDecodeFile(s, null);
    }

    public static Bitmap hookDecodeFile(String s, android.graphics.BitmapFactory.Options options)
    {
        Object obj;
        try
        {
            obj = new FileInputStream(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        s = hookDecodeStream(((InputStream) (obj)), null, options);
        try
        {
            ((InputStream) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (android.graphics.BitmapFactory.Options options)
        {
            return s;
        }
        return s;
        options;
        throw options;
        s;
_L3:
        if (options == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        ((InputStream) (obj)).close();
_L1:
        throw s;
        obj;
        AndroidCompat.a(options, ((Throwable) (obj)));
          goto _L1
        ((InputStream) (obj)).close();
          goto _L1
        s;
        options = null;
        if (true) goto _L3; else goto _L2
_L2:
    }

    public static Bitmap hookDecodeFileDescriptor(FileDescriptor filedescriptor)
    {
        return hookDecodeFileDescriptor(filedescriptor, null, null);
    }

    public static Bitmap hookDecodeFileDescriptor(FileDescriptor filedescriptor, Rect rect, android.graphics.BitmapFactory.Options options)
    {
        InputStream inputstream;
        long l;
        l = nativeSeek(filedescriptor, 0L, false);
        if (l == -1L)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        inputstream = a(new FileInputStream(filedescriptor));
        byte abyte0[] = a(inputstream, options);
        if (!WebpSupportStatus.c(abyte0, 0, 20) || WebpSupportStatus.a(abyte0, 0, 20))
        {
            break MISSING_BLOCK_LABEL_91;
        }
        filedescriptor = nativeDecodeStream(inputstream, options, getScaleFromOptions(options), getInBitmapFromOptions(options), getInTempStorageFromOptions(options));
        setPaddingDefaultValues(rect);
        b(filedescriptor, options);
_L1:
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Rect rect)
        {
            return filedescriptor;
        }
        return filedescriptor;
        nativeSeek(filedescriptor, l, true);
        filedescriptor = originalDecodeFileDescriptor(filedescriptor, rect, options);
          goto _L1
        filedescriptor;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Rect rect) { }
        throw filedescriptor;
        filedescriptor = hookDecodeStream(new FileInputStream(filedescriptor), rect, options);
        setPaddingDefaultValues(rect);
        return filedescriptor;
    }

    public static Bitmap hookDecodeResource(Resources resources, int i)
    {
        return hookDecodeResource(resources, i, null);
    }

    public static Bitmap hookDecodeResource(Resources resources, int i, android.graphics.BitmapFactory.Options options)
    {
        Resources resources1;
        TypedValue typedvalue;
        Object obj;
        obj = null;
        typedvalue = new TypedValue();
        resources1 = obj;
        Object obj1 = resources.openRawResource(i, typedvalue);
        resources = hookDecodeResourceStream(resources, typedvalue, ((InputStream) (obj1)), null, options);
        resources1 = resources;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        resources1 = resources;
        ((InputStream) (obj1)).close();
        resources1 = resources;
_L5:
        Throwable throwable;
        if (resources1 == null && options != null && options.inBitmap != null)
        {
            throw new IllegalArgumentException("Problem decoding into existing bitmap");
        } else
        {
            return resources1;
        }
        throwable;
        throw throwable;
        resources;
_L6:
        if (obj1 == null) goto _L2; else goto _L1
_L1:
        if (throwable == null) goto _L4; else goto _L3
_L3:
        resources1 = obj;
        ((InputStream) (obj1)).close();
_L2:
        resources1 = obj;
        try
        {
            throw resources;
        }
        // Misplaced declaration of an exception variable
        catch (Resources resources) { }
          goto _L5
        obj1;
        resources1 = obj;
        AndroidCompat.a(throwable, ((Throwable) (obj1)));
          goto _L2
_L4:
        resources1 = obj;
        ((InputStream) (obj1)).close();
          goto _L2
        resources;
        throwable = null;
          goto _L6
    }

    public static Bitmap hookDecodeResourceStream(Resources resources, TypedValue typedvalue, InputStream inputstream, Rect rect, android.graphics.BitmapFactory.Options options)
    {
        android.graphics.BitmapFactory.Options options1;
        options1 = options;
        if (options == null)
        {
            options1 = new android.graphics.BitmapFactory.Options();
        }
        if (options1.inDensity != 0 || typedvalue == null) goto _L2; else goto _L1
_L1:
        int i = typedvalue.density;
        if (i != 0) goto _L4; else goto _L3
_L3:
        options1.inDensity = 160;
_L2:
        if (options1.inTargetDensity == 0 && resources != null)
        {
            options1.inTargetDensity = resources.getDisplayMetrics().densityDpi;
        }
        return hookDecodeStream(inputstream, rect, options1);
_L4:
        if (i != 65535)
        {
            options1.inDensity = i;
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public static Bitmap hookDecodeStream(InputStream inputstream)
    {
        return hookDecodeStream(inputstream, null, null);
    }

    public static Bitmap hookDecodeStream(InputStream inputstream, Rect rect, android.graphics.BitmapFactory.Options options)
    {
        inputstream = a(inputstream);
        byte abyte0[] = a(inputstream, options);
        if (WebpSupportStatus.c(abyte0, 0, 20) && !WebpSupportStatus.a(abyte0, 0, 20))
        {
            inputstream = nativeDecodeStream(inputstream, options, getScaleFromOptions(options), getInBitmapFromOptions(options), getInTempStorageFromOptions(options));
            b(inputstream, options);
            setPaddingDefaultValues(rect);
            return inputstream;
        } else
        {
            return originalDecodeStream(inputstream, rect, options);
        }
    }

    private static native Bitmap nativeDecodeByteArray(byte abyte0[], int i, int j, android.graphics.BitmapFactory.Options options, float f, Bitmap bitmap, byte abyte1[]);

    private static native Bitmap nativeDecodeStream(InputStream inputstream, android.graphics.BitmapFactory.Options options, float f, Bitmap bitmap, byte abyte0[]);

    private static native long nativeSeek(FileDescriptor filedescriptor, long l, boolean flag);

    private static Bitmap originalDecodeByteArray(byte abyte0[], int i, int j)
    {
        return BitmapFactory.decodeByteArray(abyte0, i, j);
    }

    private static Bitmap originalDecodeByteArray(byte abyte0[], int i, int j, android.graphics.BitmapFactory.Options options)
    {
        return BitmapFactory.decodeByteArray(abyte0, i, j, options);
    }

    private static Bitmap originalDecodeFile(String s)
    {
        return BitmapFactory.decodeFile(s);
    }

    private static Bitmap originalDecodeFile(String s, android.graphics.BitmapFactory.Options options)
    {
        return BitmapFactory.decodeFile(s, options);
    }

    private static Bitmap originalDecodeFileDescriptor(FileDescriptor filedescriptor)
    {
        return BitmapFactory.decodeFileDescriptor(filedescriptor);
    }

    private static Bitmap originalDecodeFileDescriptor(FileDescriptor filedescriptor, Rect rect, android.graphics.BitmapFactory.Options options)
    {
        return BitmapFactory.decodeFileDescriptor(filedescriptor, rect, options);
    }

    private static Bitmap originalDecodeResource(Resources resources, int i)
    {
        return BitmapFactory.decodeResource(resources, i);
    }

    private static Bitmap originalDecodeResource(Resources resources, int i, android.graphics.BitmapFactory.Options options)
    {
        return BitmapFactory.decodeResource(resources, i, options);
    }

    private static Bitmap originalDecodeResourceStream(Resources resources, TypedValue typedvalue, InputStream inputstream, Rect rect, android.graphics.BitmapFactory.Options options)
    {
        return BitmapFactory.decodeResourceStream(resources, typedvalue, inputstream, rect, options);
    }

    private static Bitmap originalDecodeStream(InputStream inputstream)
    {
        return BitmapFactory.decodeStream(inputstream);
    }

    private static Bitmap originalDecodeStream(InputStream inputstream, Rect rect, android.graphics.BitmapFactory.Options options)
    {
        return BitmapFactory.decodeStream(inputstream, rect, options);
    }

    private static void setBitmapSize(android.graphics.BitmapFactory.Options options, int i, int j)
    {
        if (options != null)
        {
            options.outWidth = i;
            options.outHeight = j;
        }
    }

    private static boolean setOutDimensions(android.graphics.BitmapFactory.Options options, int i, int j)
    {
        if (options != null && options.inJustDecodeBounds)
        {
            options.outWidth = i;
            options.outHeight = j;
            return true;
        } else
        {
            return false;
        }
    }

    private static void setPaddingDefaultValues(Rect rect)
    {
        if (rect != null)
        {
            rect.top = -1;
            rect.left = -1;
            rect.bottom = -1;
            rect.right = -1;
        }
    }

    private static boolean shouldPremultiply(android.graphics.BitmapFactory.Options options)
    {
        if (android.os.Build.VERSION.SDK_INT >= 19 && options != null)
        {
            return options.inPremultiplied;
        } else
        {
            return true;
        }
    }

    public final Bitmap a(FileDescriptor filedescriptor, android.graphics.BitmapFactory.Options options)
    {
        return hookDecodeFileDescriptor(filedescriptor, null, options);
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        SoLoaderShim.a("webp");
        SoLoaderShim.a("webpsupport");
    }
}
