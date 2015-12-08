// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.support.rastermill.FrameSequence;

public final class g extends Drawable
    implements Animatable, Runnable
{

    private static final Object h = new Object();
    private static HandlerThread i;
    private static Handler j;
    public final Object a;
    public final j b;
    public boolean c;
    public Bitmap d;
    public Bitmap e;
    public int f;
    public int g;
    private final FrameSequence k;
    private final c l;
    private final Paint m;
    private BitmapShader n;
    private BitmapShader o;
    private final Rect p;
    private int q;
    private long r;
    private long s;
    private int t;
    private Runnable u;
    private Runnable v;

    public g(FrameSequence framesequence, j j1)
    {
label0:
        {
            a = new Object();
            c = false;
            g = 3;
            u = new h(this);
            v = new i(this);
            if (framesequence == null || j1 == null)
            {
                throw new IllegalArgumentException();
            }
            k = framesequence;
            l = framesequence.a();
            int i1 = framesequence.a;
            int k1 = framesequence.b;
            b = j1;
            d = a(j1, i1, k1);
            e = a(j1, i1, k1);
            p = new Rect(0, 0, i1, k1);
            m = new Paint();
            m.setFilterBitmap(true);
            n = new BitmapShader(d, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
            o = new BitmapShader(e, android.graphics.Shader.TileMode.CLAMP, android.graphics.Shader.TileMode.CLAMP);
            r = 0L;
            t = -1;
            l.a(0, d, -1);
            synchronized (h)
            {
                if (i == null)
                {
                    break label0;
                }
            }
            return;
        }
        j1 = new HandlerThread("FrameSequence decoding thread", 10);
        i = j1;
        j1.start();
        j = new Handler(i.getLooper());
        framesequence;
        JVM INSTR monitorexit ;
        return;
        j1;
        framesequence;
        JVM INSTR monitorexit ;
        throw j1;
    }

    static int a(g g1, int i1)
    {
        g1.f = i1;
        return i1;
    }

    static long a(g g1, long l1)
    {
        g1.s = l1;
        return l1;
    }

    static Bitmap a(g g1, Bitmap bitmap)
    {
        g1.e = null;
        return null;
    }

    private static Bitmap a(j j1, int i1, int k1)
    {
        j1 = j1.a(i1, k1);
        if (j1.getWidth() < i1 || j1.getHeight() < k1 || j1.getConfig() != android.graphics.Bitmap.Config.ARGB_8888)
        {
            throw new IllegalArgumentException("Invalid bitmap provided");
        } else
        {
            return j1;
        }
    }

    static Object a(g g1)
    {
        return g1.a;
    }

    private void b()
    {
        f = 1;
        t = (t + 1) % k.d;
        j.post(u);
    }

    static boolean b(g g1)
    {
        return g1.c;
    }

    static int c(g g1)
    {
        return g1.t;
    }

    static Bitmap d(g g1)
    {
        return g1.e;
    }

    static c e(g g1)
    {
        return g1.l;
    }

    static int f(g g1)
    {
        return g1.f;
    }

    static long g(g g1)
    {
        return g1.r;
    }

    static long h(g g1)
    {
        return g1.s;
    }

    static j i(g g1)
    {
        return g1.b;
    }

    public void a()
    {
        if (c)
        {
            throw new IllegalStateException("Cannot perform operation on recycled drawable");
        } else
        {
            return;
        }
    }

    public final void draw(Canvas canvas)
    {
        boolean flag1 = true;
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        a();
        if (f == 3 && s - SystemClock.uptimeMillis() <= 0L)
        {
            f = 4;
        }
        if (!isRunning() || f != 4) goto _L2; else goto _L1
_L1:
        Object obj1 = e;
        e = d;
        d = ((Bitmap) (obj1));
        obj1 = o;
        o = n;
        n = ((BitmapShader) (obj1));
        r = SystemClock.uptimeMillis();
        boolean flag = flag1;
        if (t != k.d - 1) goto _L4; else goto _L3
_L3:
        q = q + 1;
        if (g == 1 && q == 1) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (g != 3) goto _L4; else goto _L7
_L7:
        flag = flag1;
        if (q != k.e) goto _L4; else goto _L6
_L4:
        if (!flag) goto _L9; else goto _L8
_L8:
        b();
_L2:
        obj;
        JVM INSTR monitorexit ;
        m.setShader(null);
        canvas.drawBitmap(d, p, getBounds(), m);
        return;
_L9:
        scheduleSelf(v, 0L);
          goto _L2
        canvas;
        obj;
        JVM INSTR monitorexit ;
        throw canvas;
_L6:
        flag = false;
        if (true) goto _L4; else goto _L10
_L10:
    }

    protected final void finalize()
    {
        l.a();
        super.finalize();
        return;
        Exception exception;
        exception;
        super.finalize();
        throw exception;
    }

    public final int getIntrinsicHeight()
    {
        return k.b;
    }

    public final int getIntrinsicWidth()
    {
        return k.a;
    }

    public final int getOpacity()
    {
        return !k.c ? -2 : -1;
    }

    public final boolean isRunning()
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (t >= 0 && !c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void run()
    {
        boolean flag1 = false;
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        boolean flag = flag1;
        if (t < 0)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        flag = flag1;
        if (f != 3)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        f = 4;
        flag = true;
        obj;
        JVM INSTR monitorexit ;
        if (flag)
        {
            invalidateSelf();
        }
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void setAlpha(int i1)
    {
        m.setAlpha(i1);
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        m.setColorFilter(colorfilter);
    }

    public final void setFilterBitmap(boolean flag)
    {
        m.setFilterBitmap(flag);
    }

    public final boolean setVisible(boolean flag, boolean flag1)
    {
        boolean flag2 = super.setVisible(flag, flag1);
        if (!flag)
        {
            stop();
        } else
        if (flag1 || flag2)
        {
            stop();
            start();
            return flag2;
        }
        return flag2;
    }

    public final void start()
    {
label0:
        {
            if (isRunning())
            {
                break MISSING_BLOCK_LABEL_46;
            }
            synchronized (a)
            {
                a();
                if (f != 1)
                {
                    break label0;
                }
            }
            return;
        }
        q = 0;
        b();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void stop()
    {
        if (isRunning())
        {
            unscheduleSelf(this);
        }
    }

    public final void unscheduleSelf(Runnable runnable)
    {
        synchronized (a)
        {
            t = -1;
            f = 0;
        }
        super.unscheduleSelf(runnable);
        return;
        runnable;
        obj;
        JVM INSTR monitorexit ;
        throw runnable;
    }

}
