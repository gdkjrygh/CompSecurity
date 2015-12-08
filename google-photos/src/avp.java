// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Queue;
import java.util.Set;

public final class avp
{

    public static final anf a;
    public static final anf b;
    static final avr c = new avq();
    private static final Set d;
    private static final Queue e = bag.a(0);
    private final aqm f;
    private final DisplayMetrics g;
    private final aqp h;

    public avp(DisplayMetrics displaymetrics, aqm aqm1, aqp aqp1)
    {
        g = (DisplayMetrics)b.a(displaymetrics, "Argument must not be null");
        f = (aqm)b.a(aqm1, "Argument must not be null");
        h = (aqp)b.a(aqp1, "Argument must not be null");
    }

    private int a(InputStream inputstream)
    {
        Exception exception;
        inputstream.mark(0x500000);
        int i;
        try
        {
            i = (new ImageHeaderParser(inputstream, h)).b();
        }
        catch (IOException ioexception)
        {
            inputstream.reset();
            return -1;
        }
        finally
        {
            inputstream.reset();
        }
        inputstream.reset();
        return i;
        throw exception;
    }

    private android.graphics.Bitmap.Config a(InputStream inputstream, ana ana1)
    {
        boolean flag;
        if (ana1 == ana.a || android.os.Build.VERSION.SDK_INT == 16)
        {
            return android.graphics.Bitmap.Config.ARGB_8888;
        }
        flag = false;
        inputstream.mark(0x500000);
        boolean flag1 = (new ImageHeaderParser(inputstream, h)).a().hasAlpha();
        flag = flag1;
        inputstream.reset();
_L1:
        IOException ioexception;
        if (flag)
        {
            return android.graphics.Bitmap.Config.ARGB_8888;
        } else
        {
            return android.graphics.Bitmap.Config.RGB_565;
        }
        ioexception;
        if (Log.isLoggable("Downsampler", 3))
        {
            String s = String.valueOf("Cannot determine whether the image has alpha or not from header, format ");
            ana1 = String.valueOf(ana1);
            (new StringBuilder(String.valueOf(s).length() + 0 + String.valueOf(ana1).length())).append(s).append(ana1);
        }
        inputstream.reset();
          goto _L1
        ana1;
        inputstream.reset();
        throw ana1;
    }

    private static Bitmap a(InputStream inputstream, android.graphics.BitmapFactory.Options options, avr avr1)
    {
        Bitmap bitmap;
        int i;
        int j;
        if (options.inJustDecodeBounds)
        {
            inputstream.mark(0x500000);
        } else
        {
            avr1.a();
        }
        i = options.outWidth;
        j = options.outHeight;
        avr1 = options.outMimeType;
        try
        {
            bitmap = BitmapFactory.decodeStream(inputstream, null, options);
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            String s = String.valueOf("Exception decoding bitmap, outWidth: ");
            options = String.valueOf(b(options));
            throw new IOException((new StringBuilder(String.valueOf(s).length() + 62 + String.valueOf(avr1).length() + String.valueOf(options).length())).append(s).append(i).append(", outHeight: ").append(j).append(", outMimeType: ").append(avr1).append(", inBitmap: ").append(options).toString(), inputstream);
        }
        if (options.inJustDecodeBounds)
        {
            inputstream.reset();
        }
        return bitmap;
    }

    private static String a(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return null;
        }
        String s;
        int j;
        int k;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            int i = bitmap.getAllocationByteCount();
            s = (new StringBuilder(14)).append(" (").append(i).append(")").toString();
        } else
        {
            s = "";
        }
        j = bitmap.getWidth();
        k = bitmap.getHeight();
        bitmap = String.valueOf(bitmap.getConfig());
        return (new StringBuilder(String.valueOf(bitmap).length() + 26 + String.valueOf(s).length())).append("[").append(j).append("x").append(k).append("] ").append(bitmap).append(s).toString();
    }

    public static boolean a()
    {
        return true;
    }

    private static boolean a(android.graphics.BitmapFactory.Options options)
    {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    private static String b(android.graphics.BitmapFactory.Options options)
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            return a(options.inBitmap);
        } else
        {
            return null;
        }
    }

    public static boolean b()
    {
        return true;
    }

    private boolean b(InputStream inputstream)
    {
        Exception exception;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            return true;
        }
        inputstream.mark(0x500000);
        boolean flag;
        try
        {
            com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType imagetype = (new ImageHeaderParser(inputstream, h)).a();
            flag = d.contains(imagetype);
        }
        catch (IOException ioexception)
        {
            inputstream.reset();
            return false;
        }
        finally
        {
            inputstream.reset();
        }
        inputstream.reset();
        return flag;
        throw exception;
    }

    private static android.graphics.BitmapFactory.Options c()
    {
        avp;
        JVM INSTR monitorenter ;
        android.graphics.BitmapFactory.Options options;
        synchronized (e)
        {
            options = (android.graphics.BitmapFactory.Options)e.poll();
        }
        obj = options;
        if (options != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        obj = new android.graphics.BitmapFactory.Options();
        d(((android.graphics.BitmapFactory.Options) (obj)));
        avp;
        JVM INSTR monitorexit ;
        return ((android.graphics.BitmapFactory.Options) (obj));
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        avp;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static void c(android.graphics.BitmapFactory.Options options)
    {
        d(options);
        synchronized (e)
        {
            e.offer(options);
        }
        return;
        options;
        queue;
        JVM INSTR monitorexit ;
        throw options;
    }

    private static void d(android.graphics.BitmapFactory.Options options)
    {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        if (11 <= android.os.Build.VERSION.SDK_INT)
        {
            options.inBitmap = null;
            options.inMutable = true;
        }
    }

    public final aqa a(InputStream inputstream, int i, int j, ani ani1, avr avr1)
    {
        byte abyte0[];
        android.graphics.BitmapFactory.Options options;
        Object obj;
        Object obj1;
        b.a(inputstream.markSupported(), "You must provide an InputStream that supports mark()");
        abyte0 = h.a(0x10000);
        options = c();
        options.inTempStorage = abyte0;
        obj = (ana)ani1.a(a);
        obj1 = (avk)ani1.a(b);
        options.inJustDecodeBounds = true;
        a(inputstream, options, avr1);
        options.inJustDecodeBounds = false;
        ani1 = new int[2];
        ani1[0] = options.outWidth;
        ani1[1] = options.outHeight;
        int l1;
        int i2;
        l1 = ani1[0];
        i2 = ani1[1];
        int k1;
        int l2;
        ani1 = options.outMimeType;
        l2 = a(inputstream);
        k1 = awc.a(a(inputstream));
        options.inPreferredConfig = a(inputstream, ((ana) (obj)));
        if (options.inPreferredConfig != android.graphics.Bitmap.Config.ARGB_8888)
        {
            options.inDither = true;
        }
          goto _L1
_L13:
        obj = f;
        if (options.inSampleSize != 1 && 19 > android.os.Build.VERSION.SDK_INT || !b(inputstream)) goto _L3; else goto _L2
_L2:
        if (!a(options)) goto _L5; else goto _L4
_L4:
        float f1 = (float)options.inTargetDensity / (float)options.inDensity;
_L12:
        int j1;
        int k = options.inSampleSize;
        j1 = (int)Math.ceil((float)l1 / (float)k);
        k1 = (int)Math.ceil((float)i2 / (float)k);
        j1 = Math.round((float)j1 * f1);
        k1 = Math.round((float)k1 * f1);
        if (Log.isLoggable("Downsampler", 2))
        {
            int j2 = options.inTargetDensity;
            int i3 = options.inDensity;
            (new StringBuilder(192)).append("Calculated target [").append(j1).append("x").append(k1).append("] for source [").append(l1).append("x").append(i2).append("], sampleSize: ").append(k).append(", targetDensity: ").append(j2).append(", density: ").append(i3).append(", density multiplier: ").append(f1);
        }
        if (j1 <= 0 || k1 <= 0) goto _L3; else goto _L6
_L6:
        obj1 = options.inPreferredConfig;
        if (11 <= android.os.Build.VERSION.SDK_INT)
        {
            options.inBitmap = ((aqm) (obj)).b(j1, k1, ((android.graphics.Bitmap.Config) (obj1)));
        }
_L3:
        obj = a(inputstream, options, avr1);
        avr1.a(f, ((Bitmap) (obj)));
        if (Log.isLoggable("Downsampler", 2))
        {
            inputstream = String.valueOf(a(((Bitmap) (obj))));
            avr1 = String.valueOf(b(options));
            int l = options.inSampleSize;
            j1 = options.inDensity;
            k1 = options.inTargetDensity;
            obj1 = String.valueOf(Thread.currentThread().getName());
            (new StringBuilder(String.valueOf(inputstream).length() + 172 + String.valueOf(ani1).length() + String.valueOf(avr1).length() + String.valueOf(obj1).length())).append("Decoded ").append(inputstream).append(" from [").append(l1).append("x").append(i2).append("] ").append(ani1).append(" with inBitmap ").append(avr1).append(" for [").append(i).append("x").append(j).append("], sample size: ").append(l).append(", density: ").append(j1).append(", target density: ").append(k1).append(", thread: ").append(((String) (obj1)));
        }
        inputstream = null;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_750;
        }
        ((Bitmap) (obj)).setDensity(g.densityDpi);
        ani1 = awc.a(f, ((Bitmap) (obj)), l2);
        inputstream = ani1;
        if (obj.equals(ani1))
        {
            break MISSING_BLOCK_LABEL_750;
        }
        f.a(((Bitmap) (obj)));
        inputstream = ani1;
        inputstream = ave.a(inputstream, f);
        c(options);
        h.a(abyte0);
        return inputstream;
_L14:
        int i1;
        if (j == 0x80000000)
        {
            i1 = i2;
        } else
        {
            i1 = j;
        }
        if (i == 0x80000000)
        {
            j1 = l1;
        } else
        {
            j1 = i;
        }
        if (k1 != 90 && k1 != 270)
        {
            break MISSING_BLOCK_LABEL_918;
        }
        f1 = ((avk) (obj1)).a(i2, l1, j1, i1);
_L7:
        if (f1 > 0.0F)
        {
            break MISSING_BLOCK_LABEL_936;
        }
        inputstream = String.valueOf(obj1);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(inputstream).length() + 48)).append("Cannot scale with factor: ").append(f1).append(" from: ").append(inputstream).toString());
        inputstream;
        c(options);
        h.a(abyte0);
        throw inputstream;
        f1 = ((avk) (obj1)).a(l1, i2, j1, i1);
          goto _L7
        int j3 = ((avk) (obj1)).a(l1, i2);
        if (j3 != 0)
        {
            break MISSING_BLOCK_LABEL_963;
        }
        throw new IllegalArgumentException("Cannot round with null rounding");
        int k2;
        k2 = (int)((float)l1 * f1 + 0.5F);
        k1 = (int)((float)i2 * f1 + 0.5F);
        k2 = l1 / k2;
        k1 = i2 / k1;
        if (j3 != avo.a) goto _L9; else goto _L8
_L8:
        k1 = Math.max(k2, k1);
_L10:
        k2 = Math.max(1, Integer.highestOneBit(k1));
        k1 = k2;
        if (j3 != avo.a)
        {
            break MISSING_BLOCK_LABEL_1064;
        }
        k1 = k2;
        if ((float)k2 < 1.0F / f1)
        {
            k1 = k2 << 1;
        }
        float f2 = (float)k1 * f1;
        options.inSampleSize = k1;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            options.inTargetDensity = (int)(1000F * f2 + 0.5F);
            options.inDensity = 1000;
        }
        if (!a(options))
        {
            break MISSING_BLOCK_LABEL_1287;
        }
        options.inScaled = true;
_L11:
        if (!Log.isLoggable("Downsampler", 2))
        {
            break; /* Loop/switch isn't completed */
        }
        String s = String.valueOf("Calculate scaling, source: [");
        k2 = options.inTargetDensity;
        int k3 = options.inDensity;
        (new StringBuilder(String.valueOf(s).length() + 224)).append(s).append(l1).append("x").append(i2).append("], target: [").append(j1).append("x").append(i1).append("], exact scale factor: ").append(f1).append(", power of 2 sample size: ").append(k1).append(", adjusted scale factor: ").append(f2).append(", target density: ").append(k2).append(", density: ").append(k3);
        break; /* Loop/switch isn't completed */
_L9:
        k1 = Math.min(k2, k1);
          goto _L10
        options.inTargetDensity = 0;
        options.inDensity = 0;
          goto _L11
_L5:
        f1 = 1.0F;
          goto _L12
_L1:
        if (l1 > 0 && i2 > 0) goto _L14; else goto _L13
    }

    static 
    {
        a = anf.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", ana.b);
        b = anf.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", avk.c);
        d = Collections.unmodifiableSet(EnumSet.of(com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType.JPEG, com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType.PNG_A, com.bumptech.glide.load.resource.bitmap.ImageHeaderParser.ImageType.PNG));
    }
}
