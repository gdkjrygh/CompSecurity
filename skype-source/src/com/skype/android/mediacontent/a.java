// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mediacontent;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import ar.com.hjg.pngj.x;
import com.skype.android.app.common.BitmapDecoder;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

// Referenced classes of package com.skype.android.mediacontent:
//            EmoticonContent, EmoticonSize, b

final class a extends Drawable
    implements Animatable, Runnable
{

    private static Executor a;
    private String b;
    private EmoticonContent c;
    private EmoticonSize d;
    private Bitmap e;
    private Bitmap f;
    private BitmapDecoder g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m[];
    private BlockingQueue n;
    private BlockingQueue o;
    private Drawable p;

    a(EmoticonContent emoticoncontent, EmoticonSize emoticonsize, String s)
    {
        c = emoticoncontent;
        d = emoticonsize;
        b = s;
        k = s.endsWith("anim");
        h = emoticonsize.a(emoticoncontent.p());
        i = 0;
        n = new ArrayBlockingQueue(2);
        o = new ArrayBlockingQueue(2);
        l = true;
        setBounds(0, 0, h, h);
        p = emoticoncontent.p().getResources().getDrawable(0x7f02007e);
    }

    private void c()
    {
        int i1 = 1000;
        if (g != null)
        {
            i1 = 1000 / c.h().d();
        }
        unscheduleSelf(this);
        scheduleSelf(this, SystemClock.uptimeMillis() + (long)i1);
    }

    private InputStream d()
    {
        InputStream inputstream;
        try
        {
            inputstream = c.a(b, h, true);
        }
        catch (IOException ioexception)
        {
            l = false;
            return null;
        }
        return inputstream;
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        InputStream inputstream = d();
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        g = new BitmapDecoder(inputstream);
        if (m == null)
        {
            m = new int[h * h];
        }
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        ((x) (obj)).printStackTrace();
        l = false;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    private void f()
    {
        this;
        JVM INSTR monitorenter ;
        if (g != null)
        {
            g.close();
            g = null;
            m = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final Bitmap a()
    {
        Bitmap bitmap1 = e;
        Bitmap bitmap = bitmap1;
        if (bitmap1 == null)
        {
            Bitmap bitmap2 = f;
            bitmap = bitmap2;
            if (bitmap2 == null)
            {
                bitmap = c.a(EmoticonSize.a);
                f = bitmap;
            }
        }
        return bitmap;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        l = true;
        f();
        c();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void draw(Canvas canvas)
    {
        Bitmap bitmap = a();
        if (bitmap != null)
        {
            canvas.drawBitmap(bitmap, null, getBounds(), null);
            return;
        } else
        {
            p.setBounds(getBounds());
            p.draw(canvas);
            return;
        }
    }

    public final int getIntrinsicHeight()
    {
        return h;
    }

    public final int getIntrinsicWidth()
    {
        return h;
    }

    public final int getOpacity()
    {
        return -1;
    }

    public final boolean isRunning()
    {
        return j;
    }

    public final void run()
    {
        if (Looper.getMainLooper() != Looper.myLooper()) goto _L2; else goto _L1
_L1:
        if (j)
        {
            a.execute(this);
        }
        if (k && e != null)
        {
            o.offer(e);
        }
        e = (Bitmap)n.poll();
        if (e != null) goto _L4; else goto _L3
_L3:
        c();
_L9:
        return;
_L4:
        invalidateSelf();
        return;
_L2:
        if (!k)
        {
            break MISSING_BLOCK_LABEL_292;
        }
        if (!j)
        {
            continue; /* Loop/switch isn't completed */
        }
        c();
_L5:
        if (!j || n.remainingCapacity() <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        Object obj = null;
        this;
        JVM INSTR monitorenter ;
        if (g == null && l)
        {
            e();
        }
        if (g == null)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        i = i + 1;
        if ((i + 1) * h <= g.getHeight())
        {
            break MISSING_BLOCK_LABEL_205;
        }
        i = 0;
        obj = d();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        g.reset(((InputStream) (obj)));
        obj = (Bitmap)o.poll();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_242;
        }
        obj = Bitmap.createBitmap(h, h, android.graphics.Bitmap.Config.ARGB_8888);
        ((Bitmap) (obj)).setDensity(0);
        g.decodeFrame(m, ((Bitmap) (obj)));
_L6:
        this;
        JVM INSTR monitorexit ;
        if (obj != null)
        {
            n.offer(obj);
        }
          goto _L5
        Exception exception1;
        exception1;
        exception1.printStackTrace();
        l = false;
          goto _L6
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        f = c.a(d);
        invalidateSelf();
        return;
        if (true) goto _L5; else goto _L7
_L7:
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final void setAlpha(int i1)
    {
        throw new UnsupportedOperationException();
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        throw new UnsupportedOperationException();
    }

    public final void start()
    {
        j = true;
        c();
    }

    public final void stop()
    {
        j = false;
        f();
        unscheduleSelf(this);
        n.clear();
        o.clear();
    }

    static 
    {
        java.util.concurrent.ExecutorService executorservice = Executors.newSingleThreadExecutor();
        a = executorservice;
        executorservice.execute(new Runnable() {

            public final void run()
            {
                Process.setThreadPriority(10);
            }

        });
    }
}
