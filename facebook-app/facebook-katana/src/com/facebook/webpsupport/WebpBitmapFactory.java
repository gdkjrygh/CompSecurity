// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.webpsupport;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import com.facebook.androidcompat.AndroidCompat;
import com.facebook.common.soloader.SoLoaderShim;
import com.facebook.imagepipeline.webp.WebpSupportStatus;
import java.io.BufferedInputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class WebpBitmapFactory
{

    public static final boolean a;

    public WebpBitmapFactory()
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
        AndroidCompat.addSuppressed(options, ((Throwable) (obj)));
          goto _L1
        ((InputStream) (obj)).close();
          goto _L1
        s;
        options = null;
        if (true) goto _L3; else goto _L2
_L2:
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

    private static Bitmap originalDecodeByteArray(byte abyte0[], int i, int j, android.graphics.BitmapFactory.Options options)
    {
        return BitmapFactory.decodeByteArray(abyte0, i, j);
    }

    private static Bitmap originalDecodeFile(String s, android.graphics.BitmapFactory.Options options)
    {
        return BitmapFactory.decodeFile(s, options);
    }

    private static Bitmap originalDecodeFileDescriptor(FileDescriptor filedescriptor, Rect rect, android.graphics.BitmapFactory.Options options)
    {
        return BitmapFactory.decodeFileDescriptor(filedescriptor, rect, options);
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
