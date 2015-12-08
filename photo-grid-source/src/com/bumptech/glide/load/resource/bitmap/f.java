// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.bumptech.glide.i.c;
import com.bumptech.glide.i.h;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.b.a.e;
import java.io.IOException;
import java.io.InputStream;
import java.util.EnumSet;
import java.util.Queue;
import java.util.Set;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            a, g, h, i, 
//            ImageHeaderParser, t, x

public abstract class f
    implements com.bumptech.glide.load.resource.bitmap.a
{

    public static final f a = new g();
    public static final f b = new com.bumptech.glide.load.resource.bitmap.h();
    public static final f c = new i();
    private static final Set d;
    private static final Queue e = h.a(0);

    public f()
    {
    }

    private static android.graphics.Bitmap.Config a(InputStream inputstream, a a1)
    {
        if (a1 == a.a || a1 == a.b || android.os.Build.VERSION.SDK_INT == 16)
        {
            return android.graphics.Bitmap.Config.ARGB_8888;
        }
        inputstream.mark(1024);
        boolean flag1 = (new ImageHeaderParser(inputstream)).a().hasAlpha();
        inputstream.reset();
        boolean flag = flag1;
_L1:
        IOException ioexception;
        if (flag)
        {
            return android.graphics.Bitmap.Config.ARGB_8888;
        } else
        {
            return android.graphics.Bitmap.Config.RGB_565;
        }
        inputstream;
        flag = flag1;
        if (Log.isLoggable("Downsampler", 5))
        {
            Log.w("Downsampler", "Cannot reset the input stream", inputstream);
            flag = flag1;
        }
          goto _L1
        ioexception;
        if (Log.isLoggable("Downsampler", 5))
        {
            Log.w("Downsampler", (new StringBuilder("Cannot determine whether the image has alpha or not from header for format ")).append(a1).toString(), ioexception);
        }
        inputstream.reset();
        flag = false;
          goto _L1
        inputstream;
        if (Log.isLoggable("Downsampler", 5))
        {
            Log.w("Downsampler", "Cannot reset the input stream", inputstream);
        }
        flag = false;
          goto _L1
        a1;
        inputstream.reset();
_L3:
        throw a1;
        inputstream;
        if (Log.isLoggable("Downsampler", 5))
        {
            Log.w("Downsampler", "Cannot reset the input stream", inputstream);
        }
        if (true) goto _L3; else goto _L2
_L2:
    }

    private static Bitmap a(com.bumptech.glide.i.f f1, t t1, android.graphics.BitmapFactory.Options options)
    {
        if (options.inJustDecodeBounds)
        {
            f1.mark(0x500000);
        } else
        {
            t1.a();
        }
        t1 = BitmapFactory.decodeStream(f1, null, options);
        try
        {
            if (options.inJustDecodeBounds)
            {
                f1.reset();
            }
        }
        // Misplaced declaration of an exception variable
        catch (com.bumptech.glide.i.f f1)
        {
            if (Log.isLoggable("Downsampler", 6))
            {
                Log.e("Downsampler", (new StringBuilder("Exception loading inDecodeBounds=")).append(options.inJustDecodeBounds).append(" sample=").append(options.inSampleSize).toString(), f1);
                return t1;
            }
        }
        return t1;
    }

    private static void a(android.graphics.BitmapFactory.Options options)
    {
        b(options);
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

    private static boolean a(InputStream inputstream)
    {
        if (19 > android.os.Build.VERSION.SDK_INT) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        inputstream.mark(1024);
        boolean flag1;
        ImageHeaderParser.ImageType imagetype = (new ImageHeaderParser(inputstream)).a();
        flag1 = d.contains(imagetype);
        inputstream.reset();
        return flag1;
        inputstream;
        flag = flag1;
        if (Log.isLoggable("Downsampler", 5))
        {
            Log.w("Downsampler", "Cannot reset the input stream", inputstream);
            return flag1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        obj;
        if (Log.isLoggable("Downsampler", 5))
        {
            Log.w("Downsampler", "Cannot determine the image type from header", ((Throwable) (obj)));
        }
        inputstream.reset();
_L6:
        return false;
        inputstream;
        if (Log.isLoggable("Downsampler", 5))
        {
            Log.w("Downsampler", "Cannot reset the input stream", inputstream);
        }
        if (true) goto _L6; else goto _L5
_L5:
        obj;
        inputstream.reset();
_L8:
        throw obj;
        inputstream;
        if (Log.isLoggable("Downsampler", 5))
        {
            Log.w("Downsampler", "Cannot reset the input stream", inputstream);
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    private static android.graphics.BitmapFactory.Options b()
    {
        com/bumptech/glide/load/resource/bitmap/f;
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
        b(((android.graphics.BitmapFactory.Options) (obj)));
        com/bumptech/glide/load/resource/bitmap/f;
        JVM INSTR monitorexit ;
        return ((android.graphics.BitmapFactory.Options) (obj));
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        com/bumptech/glide/load/resource/bitmap/f;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static void b(android.graphics.BitmapFactory.Options options)
    {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        if (11 <= android.os.Build.VERSION.SDK_INT)
        {
            options.inBitmap = null;
            options.inMutable = true;
        }
    }

    protected abstract int a(int j, int k, int l, int i1);

    public final Bitmap a(InputStream inputstream, e e1, int j, int k, a a1)
    {
        com.bumptech.glide.i.a a2;
        byte abyte0[];
        byte abyte1[];
        android.graphics.BitmapFactory.Options options;
        c c1;
        Object obj;
        a2 = com.bumptech.glide.i.a.a();
        abyte0 = a2.b();
        abyte1 = a2.b();
        options = b();
        inputstream = new t(inputstream, abyte1);
        c1 = com.bumptech.glide.i.c.a(inputstream);
        obj = new com.bumptech.glide.i.f(c1);
        c1.mark(0x500000);
        int l = (new ImageHeaderParser(c1)).b();
        c1.reset();
_L9:
        int ai[];
        options.inTempStorage = abyte0;
        options.inJustDecodeBounds = true;
        a(((com.bumptech.glide.i.f) (obj)), ((t) (inputstream)), options);
        options.inJustDecodeBounds = false;
        ai = new int[2];
        ai[0] = options.outWidth;
        ai[1] = options.outHeight;
        int k1;
        int l1;
        k1 = ai[0];
        l1 = ai[1];
        l;
        JVM INSTR tableswitch 3 8: default 570
    //                   3 637
    //                   4 637
    //                   5 630
    //                   6 630
    //                   7 645
    //                   8 645;
           goto _L1 _L2 _L2 _L3 _L3 _L4 _L4
_L13:
        int j1;
        j = a(l1, k1, k, j1);
          goto _L5
_L12:
        j = Math.max(1, j);
        a1 = a(((InputStream) (obj)), a1);
        options.inSampleSize = j;
        options.inPreferredConfig = a1;
        if ((options.inSampleSize == 1 || 19 <= android.os.Build.VERSION.SDK_INT) && a(((InputStream) (obj))))
        {
            a1 = e1.b((int)Math.ceil((double)k1 / (double)j), (int)Math.ceil((double)l1 / (double)j), a1);
            if (11 <= android.os.Build.VERSION.SDK_INT)
            {
                options.inBitmap = a1;
            }
        }
        obj = a(((com.bumptech.glide.i.f) (obj)), ((t) (inputstream)), options);
        inputstream = c1.a();
        if (inputstream == null) goto _L7; else goto _L6
_L6:
        throw new RuntimeException(inputstream);
        inputstream;
        a2.a(abyte0);
        a2.a(abyte1);
        c1.b();
        a(options);
        throw inputstream;
        IOException ioexception;
        ioexception;
        if (!Log.isLoggable("Downsampler", 5)) goto _L9; else goto _L8
_L8:
        Log.w("Downsampler", "Cannot reset the input stream", ioexception);
          goto _L9
        ioexception;
        if (Log.isLoggable("Downsampler", 5))
        {
            Log.w("Downsampler", "Cannot determine the image orientation from header", ioexception);
        }
        c1.reset();
        l = 0;
          goto _L9
        ioexception;
        if (Log.isLoggable("Downsampler", 5))
        {
            Log.w("Downsampler", "Cannot reset the input stream", ioexception);
        }
        l = 0;
          goto _L9
        inputstream;
        c1.reset();
_L11:
        throw inputstream;
        e1;
        if (!Log.isLoggable("Downsampler", 5)) goto _L11; else goto _L10
_L10:
        Log.w("Downsampler", "Cannot reset the input stream", e1);
          goto _L11
_L14:
        j = a(k1, l1, k, j1);
          goto _L5
_L16:
        j = Integer.highestOneBit(j);
          goto _L12
_L7:
        inputstream = null;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_542;
        }
        a1 = com.bumptech.glide.load.resource.bitmap.x.a(((Bitmap) (obj)), e1, l);
        inputstream = a1;
        if (obj.equals(a1))
        {
            break MISSING_BLOCK_LABEL_542;
        }
        inputstream = a1;
        if (e1.a(((Bitmap) (obj))))
        {
            break MISSING_BLOCK_LABEL_542;
        }
        ((Bitmap) (obj)).recycle();
        inputstream = a1;
        a2.a(abyte0);
        a2.a(abyte1);
        c1.b();
        a(options);
        return inputstream;
_L1:
        int i1 = 0;
_L17:
        j1 = k;
        if (k == 0x80000000)
        {
            j1 = l1;
        }
        k = j;
        if (j == 0x80000000)
        {
            k = k1;
        }
        if (i1 != 90 && i1 != 270) goto _L14; else goto _L13
_L5:
        if (j != 0) goto _L16; else goto _L15
_L15:
        j = 0;
          goto _L12
_L3:
        i1 = 90;
          goto _L17
_L2:
        i1 = 180;
          goto _L17
_L4:
        i1 = 270;
          goto _L17
    }

    static 
    {
        d = EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG);
    }
}
