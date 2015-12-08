// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import com.bumptech.glide.g.h;
import com.bumptech.glide.load.a;
import com.bumptech.glide.load.engine.a.c;
import java.io.IOException;
import java.io.InputStream;
import java.util.EnumSet;
import java.util.Queue;
import java.util.Set;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//            a, ImageHeaderParser, n, q

public abstract class f
    implements com.bumptech.glide.load.resource.bitmap.a
{

    public static final f a = new f() {

        protected int a(int i, int j, int k, int l)
        {
            return Math.min(j / l, i / k);
        }

        public String a()
        {
            return "AT_LEAST.com.bumptech.glide.load.data.bitmap";
        }

    };
    public static final f b = new f() {

        protected int a(int i, int j, int k, int l)
        {
            boolean flag = true;
            i = (int)Math.ceil(Math.max((float)j / (float)l, (float)i / (float)k));
            j = Math.max(1, Integer.highestOneBit(i));
            if (j < i)
            {
                i = ((flag) ? 1 : 0);
            } else
            {
                i = 0;
            }
            return j << i;
        }

        public String a()
        {
            return "AT_MOST.com.bumptech.glide.load.data.bitmap";
        }

    };
    public static final f c = new f() {

        protected int a(int i, int j, int k, int l)
        {
            return 0;
        }

        public String a()
        {
            return "NONE.com.bumptech.glide.load.data.bitmap";
        }

    };
    private static final Set d;
    private static final Queue e = h.a(0);

    public f()
    {
    }

    private int a(int i, int j, int k, int l, int i1)
    {
        int j1 = i1;
        if (i1 == 0x80000000)
        {
            j1 = k;
        }
        i1 = l;
        if (l == 0x80000000)
        {
            i1 = j;
        }
        if (i == 90 || i == 270)
        {
            i = a(k, j, i1, j1);
        } else
        {
            i = a(j, k, i1, j1);
        }
        if (i == 0)
        {
            i = 0;
        } else
        {
            i = Integer.highestOneBit(i);
        }
        return Math.max(1, i);
    }

    private static android.graphics.Bitmap.Config a(InputStream inputstream, a a1)
    {
        if (a1 == a.a || a1 == a.b || android.os.Build.VERSION.SDK_INT == 16)
        {
            return android.graphics.Bitmap.Config.ARGB_8888;
        }
        inputstream.mark(1024);
        boolean flag1 = (new ImageHeaderParser(inputstream)).a();
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
            Log.w("Downsampler", (new StringBuilder()).append("Cannot determine whether the image has alpha or not from header for format ").append(a1).toString(), ioexception);
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

    private Bitmap a(com.bumptech.glide.g.f f1, n n1, android.graphics.BitmapFactory.Options options, c c1, int i, int j, int k, 
            a a1)
    {
        a1 = a(((InputStream) (f1)), a1);
        options.inSampleSize = k;
        options.inPreferredConfig = a1;
        if ((options.inSampleSize == 1 || 19 <= android.os.Build.VERSION.SDK_INT) && a(((InputStream) (f1))))
        {
            a(options, c1.b((int)Math.ceil((double)i / (double)k), (int)Math.ceil((double)j / (double)k), a1));
        }
        return b(f1, n1, options);
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

    private static void a(android.graphics.BitmapFactory.Options options, Bitmap bitmap)
    {
        if (11 <= android.os.Build.VERSION.SDK_INT)
        {
            options.inBitmap = bitmap;
        }
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
        ImageHeaderParser.ImageType imagetype = (new ImageHeaderParser(inputstream)).b();
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

    private static Bitmap b(com.bumptech.glide.g.f f1, n n1, android.graphics.BitmapFactory.Options options)
    {
        if (options.inJustDecodeBounds)
        {
            f1.mark(0x500000);
        } else
        {
            n1.a();
        }
        n1 = BitmapFactory.decodeStream(f1, null, options);
        try
        {
            if (options.inJustDecodeBounds)
            {
                f1.reset();
            }
        }
        // Misplaced declaration of an exception variable
        catch (com.bumptech.glide.g.f f1)
        {
            if (Log.isLoggable("Downsampler", 6))
            {
                Log.e("Downsampler", (new StringBuilder()).append("Exception loading inDecodeBounds=").append(options.inJustDecodeBounds).append(" sample=").append(options.inSampleSize).toString(), f1);
                return n1;
            }
        }
        return n1;
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

    protected abstract int a(int i, int j, int k, int l);

    public Bitmap a(InputStream inputstream, c c1, int i, int j, a a1)
    {
        com.bumptech.glide.g.a a2;
        byte abyte0[];
        byte abyte1[];
        android.graphics.BitmapFactory.Options options;
        com.bumptech.glide.g.c c2;
        Object obj;
        a2 = com.bumptech.glide.g.a.a();
        abyte0 = a2.b();
        abyte1 = a2.b();
        options = b();
        inputstream = new n(inputstream, abyte1);
        c2 = com.bumptech.glide.g.c.a(inputstream);
        obj = new com.bumptech.glide.g.f(c2);
        c2.mark(0x500000);
        int k = (new ImageHeaderParser(c2)).c();
        c2.reset();
_L2:
        int ai[];
        options.inTempStorage = abyte0;
        ai = a(((com.bumptech.glide.g.f) (obj)), ((n) (inputstream)), options);
        int l;
        int i1;
        l = ai[0];
        i1 = ai[1];
        obj = a(((com.bumptech.glide.g.f) (obj)), ((n) (inputstream)), options, c1, l, i1, a(com.bumptech.glide.load.resource.bitmap.q.a(k), l, i1, i, j), a1);
        inputstream = c2.a();
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_304;
        }
        throw new RuntimeException(inputstream);
        inputstream;
        a2.a(abyte0);
        a2.a(abyte1);
        c2.b();
        a(options);
        throw inputstream;
        IOException ioexception;
        ioexception;
        if (!Log.isLoggable("Downsampler", 5)) goto _L2; else goto _L1
_L1:
        Log.w("Downsampler", "Cannot reset the input stream", ioexception);
          goto _L2
        ioexception;
        if (Log.isLoggable("Downsampler", 5))
        {
            Log.w("Downsampler", "Cannot determine the image orientation from header", ioexception);
        }
        c2.reset();
        k = 0;
          goto _L2
        ioexception;
        if (Log.isLoggable("Downsampler", 5))
        {
            Log.w("Downsampler", "Cannot reset the input stream", ioexception);
        }
        k = 0;
          goto _L2
        inputstream;
        c2.reset();
_L4:
        throw inputstream;
        c1;
        if (!Log.isLoggable("Downsampler", 5)) goto _L4; else goto _L3
_L3:
        Log.w("Downsampler", "Cannot reset the input stream", c1);
          goto _L4
        inputstream = null;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_356;
        }
        a1 = com.bumptech.glide.load.resource.bitmap.q.a(((Bitmap) (obj)), c1, k);
        inputstream = a1;
        if (obj.equals(a1))
        {
            break MISSING_BLOCK_LABEL_356;
        }
        inputstream = a1;
        if (c1.a(((Bitmap) (obj))))
        {
            break MISSING_BLOCK_LABEL_356;
        }
        ((Bitmap) (obj)).recycle();
        inputstream = a1;
        a2.a(abyte0);
        a2.a(abyte1);
        c2.b();
        a(options);
        return inputstream;
    }

    public int[] a(com.bumptech.glide.g.f f1, n n1, android.graphics.BitmapFactory.Options options)
    {
        options.inJustDecodeBounds = true;
        b(f1, n1, options);
        options.inJustDecodeBounds = false;
        return (new int[] {
            options.outWidth, options.outHeight
        });
    }

    static 
    {
        d = EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG);
    }
}
