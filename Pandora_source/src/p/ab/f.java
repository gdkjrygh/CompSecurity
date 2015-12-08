// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ab;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.EnumSet;
import java.util.Queue;
import java.util.Set;
import p.ap.h;
import p.q.a;
import p.t.c;

// Referenced classes of package p.ab:
//            a, l, o, r

public abstract class f
    implements p.ab.a
{

    public static final f a = new f() {

        protected int a(int i, int j, int k, int i1)
        {
            return Math.min(j / i1, i / k);
        }

        public String a()
        {
            return "AT_LEAST.com.bumptech.glide.load.data.bitmap";
        }

    };
    public static final f b = new f() {

        protected int a(int i, int j, int k, int i1)
        {
            boolean flag = true;
            i = (int)Math.ceil(Math.max((float)j / (float)i1, (float)i / (float)k));
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

        protected int a(int i, int j, int k, int i1)
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

    private int a(int i, int j, int k, int i1, int j1)
    {
        int k1 = j1;
        if (j1 == 0x80000000)
        {
            k1 = k;
        }
        j1 = i1;
        if (i1 == 0x80000000)
        {
            j1 = j;
        }
        if (i == 90 || i == 270)
        {
            i = a(k, j, j1, k1);
        } else
        {
            i = a(j, k, j1, k1);
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
        boolean flag1 = (new l(inputstream)).a();
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

    private Bitmap a(p.ap.f f1, o o1, android.graphics.BitmapFactory.Options options, c c1, int i, int j, int k, 
            a a1)
    {
        a1 = a(((InputStream) (f1)), a1);
        options.inSampleSize = k;
        options.inPreferredConfig = a1;
        if ((options.inSampleSize == 1 || 19 <= android.os.Build.VERSION.SDK_INT) && a(((InputStream) (f1))))
        {
            a(options, c1.b((int)Math.ceil((double)i / (double)k), (int)Math.ceil((double)j / (double)k), a1));
        }
        return b(f1, o1, options);
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
        l.a a1 = (new l(inputstream)).b();
        flag1 = d.contains(a1);
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

    private static Bitmap b(p.ap.f f1, o o1, android.graphics.BitmapFactory.Options options)
    {
        if (options.inJustDecodeBounds)
        {
            f1.mark(0x500000);
        } else
        {
            o1.a();
        }
        o1 = BitmapFactory.decodeStream(f1, null, options);
        try
        {
            if (options.inJustDecodeBounds)
            {
                f1.reset();
            }
        }
        // Misplaced declaration of an exception variable
        catch (p.ap.f f1)
        {
            if (Log.isLoggable("Downsampler", 6))
            {
                Log.e("Downsampler", (new StringBuilder()).append("Exception loading inDecodeBounds=").append(options.inJustDecodeBounds).append(" sample=").append(options.inSampleSize).toString(), f1);
                return o1;
            }
        }
        return o1;
    }

    private static android.graphics.BitmapFactory.Options b()
    {
        p/ab/f;
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
        p/ab/f;
        JVM INSTR monitorexit ;
        return ((android.graphics.BitmapFactory.Options) (obj));
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        p/ab/f;
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

    protected abstract int a(int i, int j, int k, int i1);

    public Bitmap a(InputStream inputstream, c c1, int i, int j, a a1)
    {
        p.ap.a a2;
        byte abyte0[];
        byte abyte1[];
        android.graphics.BitmapFactory.Options options;
        p.ap.c c2;
        Object obj;
        a2 = p.ap.a.a();
        abyte0 = a2.b();
        abyte1 = a2.b();
        options = b();
        inputstream = new o(inputstream, abyte1);
        c2 = p.ap.c.a(inputstream);
        obj = new p.ap.f(c2);
        c2.mark(0x500000);
        int k = (new l(c2)).c();
        c2.reset();
_L2:
        int ai[];
        options.inTempStorage = abyte0;
        ai = a(((p.ap.f) (obj)), ((o) (inputstream)), options);
        int i1;
        int j1;
        i1 = ai[0];
        j1 = ai[1];
        obj = a(((p.ap.f) (obj)), ((o) (inputstream)), options, c1, i1, j1, a(p.ab.r.a(k), i1, j1, i, j), a1);
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
        a1 = p.ab.r.a(((Bitmap) (obj)), c1, k);
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

    public int[] a(p.ap.f f1, o o1, android.graphics.BitmapFactory.Options options)
    {
        options.inJustDecodeBounds = true;
        b(f1, o1, options);
        options.inJustDecodeBounds = false;
        return (new int[] {
            options.outWidth, options.outHeight
        });
    }

    static 
    {
        d = EnumSet.of(l.a.b, p.ab.l.a.c, l.a.d);
    }
}
