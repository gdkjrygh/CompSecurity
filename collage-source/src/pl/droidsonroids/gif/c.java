// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package pl.droidsonroids.gif;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import java.io.File;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package pl.droidsonroids.gif:
//            GifInfoHandle, f, RenderTask, h, 
//            e

public class c extends Drawable
    implements Animatable, android.widget.MediaController.MediaPlayerControl
{
    public static interface a
    {

        public abstract void e();
    }


    final ScheduledThreadPoolExecutor a;
    volatile boolean b;
    long c;
    protected final Paint d;
    final Bitmap e;
    final GifInfoHandle f;
    final ConcurrentLinkedQueue g;
    final boolean h;
    final h i;
    ScheduledFuture j;
    private final Rect k;
    private ColorStateList l;
    private PorterDuffColorFilter m;
    private android.graphics.PorterDuff.Mode n;
    private final RenderTask o;
    private final Rect p;
    private int q;
    private int r;
    private float s;
    private final RectF t;
    private a u;

    public c(ContentResolver contentresolver, Uri uri)
        throws IOException
    {
        this(GifInfoHandle.a(contentresolver, uri, false), null, null, true);
    }

    public c(AssetFileDescriptor assetfiledescriptor)
        throws IOException
    {
        this(GifInfoHandle.a(assetfiledescriptor, false), null, null, true);
    }

    public c(Resources resources, int i1)
        throws android.content.res.Resources.NotFoundException, IOException
    {
        this(resources.openRawResourceFd(i1));
        float f1 = pl.droidsonroids.gif.f.a(resources, i1);
        r = (int)((float)f.b * f1);
        q = (int)(f1 * (float)f.a);
    }

    public c(File file)
        throws IOException
    {
        this(GifInfoHandle.openFile(file.getPath(), false), null, null, true);
    }

    public c(String s1)
        throws IOException
    {
        this(GifInfoHandle.openFile(s1, false), null, null, true);
    }

    c(GifInfoHandle gifinfohandle, c c1, ScheduledThreadPoolExecutor scheduledthreadpoolexecutor, boolean flag)
    {
        GifInfoHandle gifinfohandle1;
        b = true;
        c = 0x8000000000000000L;
        k = new Rect();
        d = new Paint(6);
        g = new ConcurrentLinkedQueue();
        o = new RenderTask(this);
        t = new RectF();
        h = flag;
        if (scheduledthreadpoolexecutor == null)
        {
            scheduledthreadpoolexecutor = pl.droidsonroids.gif.e.a();
        }
        a = scheduledthreadpoolexecutor;
        f = gifinfohandle;
        gifinfohandle = null;
        scheduledthreadpoolexecutor = null;
        if (c1 == null) goto _L2; else goto _L1
_L1:
        gifinfohandle1 = c1.f;
        gifinfohandle1;
        JVM INSTR monitorenter ;
        gifinfohandle = scheduledthreadpoolexecutor;
        if (c1.f.k())
        {
            break MISSING_BLOCK_LABEL_175;
        }
        gifinfohandle = scheduledthreadpoolexecutor;
        if (c1.f.b < f.b)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        gifinfohandle = scheduledthreadpoolexecutor;
        if (c1.f.a >= f.a)
        {
            c1.g();
            gifinfohandle = c1.e;
            gifinfohandle.eraseColor(0);
        }
        gifinfohandle1;
        JVM INSTR monitorexit ;
_L2:
        if (gifinfohandle == null)
        {
            e = Bitmap.createBitmap(f.a, f.b, android.graphics.Bitmap.Config.ARGB_8888);
        } else
        {
            e = gifinfohandle;
        }
        p = new Rect(0, 0, f.a, f.b);
        i = new h(this);
        o.a();
        q = f.a;
        r = f.b;
        return;
        gifinfohandle;
        gifinfohandle1;
        JVM INSTR monitorexit ;
        throw gifinfohandle;
    }

    public c(byte abyte0[])
        throws IOException
    {
        this(GifInfoHandle.openByteArray(abyte0, false), null, null, true);
    }

    private PorterDuffColorFilter a(ColorStateList colorstatelist, android.graphics.PorterDuff.Mode mode)
    {
        if (colorstatelist == null || mode == null)
        {
            return null;
        } else
        {
            return new PorterDuffColorFilter(colorstatelist.getColorForState(getState(), 0), mode);
        }
    }

    private void g()
    {
        b = false;
        i.removeMessages(-1);
        f.a();
    }

    private void h()
    {
        if (j != null)
        {
            j.cancel(false);
        }
        i.removeMessages(-1);
    }

    public Bitmap a(int i1)
    {
        if (i1 < 0)
        {
            throw new IllegalArgumentException("Position is not positive");
        } else
        {
            f.a(i1, e);
            return e;
        }
    }

    public void a()
    {
        g();
        e.recycle();
    }

    void a(long l1)
    {
        if (h)
        {
            c = 0L;
            i.sendEmptyMessageAtTime(-1, 0L);
            return;
        } else
        {
            h();
            j = a.schedule(o, Math.max(l1, 0L), TimeUnit.MILLISECONDS);
            return;
        }
    }

    public void a(a a1)
    {
        u = a1;
    }

    public Bitmap b(int i1)
    {
        if (i1 < 0)
        {
            throw new IndexOutOfBoundsException("Frame index is not positive");
        } else
        {
            f.b(i1, e);
            return e;
        }
    }

    public boolean b()
    {
        return f.k();
    }

    public int c(int i1)
    {
        return f.a(i1);
    }

    public void c()
    {
        a.execute(new GifDrawable._cls1(this, this));
    }

    public boolean canPause()
    {
        return true;
    }

    public boolean canSeekBackward()
    {
        return d() > 1;
    }

    public boolean canSeekForward()
    {
        return d() > 1;
    }

    public int d()
    {
        return f.c;
    }

    public void draw(Canvas canvas)
    {
        boolean flag;
        if (m != null && d.getColorFilter() == null)
        {
            d.setColorFilter(m);
            flag = true;
        } else
        {
            flag = false;
        }
        if (d.getShader() == null)
        {
            canvas.drawBitmap(e, p, k, d);
        } else
        {
            canvas.drawRoundRect(t, s, s, d);
        }
        if (flag)
        {
            d.setColorFilter(null);
        }
        if (h && b && c != 0x8000000000000000L)
        {
            long l1 = Math.max(0L, c - SystemClock.uptimeMillis());
            c = 0x8000000000000000L;
            a.remove(o);
            j = a.schedule(o, l1, TimeUnit.MILLISECONDS);
        }
    }

    public int e()
    {
        return f.i();
    }

    public int f()
    {
        int i1 = f.j();
        if (i1 == 0 || i1 < f.e())
        {
            return i1;
        } else
        {
            return i1 - 1;
        }
    }

    public int getAlpha()
    {
        return d.getAlpha();
    }

    public int getAudioSessionId()
    {
        return 0;
    }

    public int getBufferPercentage()
    {
        return 100;
    }

    public ColorFilter getColorFilter()
    {
        return d.getColorFilter();
    }

    public int getCurrentPosition()
    {
        return f.h();
    }

    public int getDuration()
    {
        return f.g();
    }

    public int getIntrinsicHeight()
    {
        return r;
    }

    public int getIntrinsicWidth()
    {
        return q;
    }

    public int getOpacity()
    {
        return -2;
    }

    public void invalidateSelf()
    {
        super.invalidateSelf();
        if (u != null)
        {
            u.e();
        }
    }

    public boolean isPlaying()
    {
        return b;
    }

    public boolean isRunning()
    {
        return b;
    }

    public boolean isStateful()
    {
        return super.isStateful() || l != null && l.isStateful();
    }

    protected void onBoundsChange(Rect rect)
    {
        k.set(rect);
        t.set(k);
        rect = d.getShader();
        if (rect != null)
        {
            Matrix matrix = new Matrix();
            matrix.setTranslate(t.left, t.top);
            matrix.preScale(t.width() / (float)e.getWidth(), t.height() / (float)e.getHeight());
            rect.setLocalMatrix(matrix);
            d.setShader(rect);
        }
    }

    protected boolean onStateChange(int ai[])
    {
        if (l != null && n != null)
        {
            m = a(l, n);
            return true;
        } else
        {
            return false;
        }
    }

    public void pause()
    {
        stop();
    }

    public void seekTo(int i1)
    {
        if (i1 < 0)
        {
            throw new IllegalArgumentException("Position is not positive");
        } else
        {
            a.execute(new GifDrawable._cls2(this, this, i1));
            return;
        }
    }

    public void setAlpha(int i1)
    {
        d.setAlpha(i1);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        d.setColorFilter(colorfilter);
    }

    public void setDither(boolean flag)
    {
        d.setDither(flag);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean flag)
    {
        d.setFilterBitmap(flag);
        invalidateSelf();
    }

    public void setTintList(ColorStateList colorstatelist)
    {
        l = colorstatelist;
        m = a(colorstatelist, n);
        invalidateSelf();
    }

    public void setTintMode(android.graphics.PorterDuff.Mode mode)
    {
        n = mode;
        m = a(l, mode);
        invalidateSelf();
    }

    public boolean setVisible(boolean flag, boolean flag1)
    {
        boolean flag2 = super.setVisible(flag, flag1);
        if (!h)
        {
            if (flag)
            {
                if (flag1)
                {
                    c();
                }
                if (flag2)
                {
                    start();
                }
            } else
            if (flag2)
            {
                stop();
                return flag2;
            }
        }
        return flag2;
    }

    public void start()
    {
        this;
        JVM INSTR monitorenter ;
        if (!b)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        b = true;
        this;
        JVM INSTR monitorexit ;
        a(f.b());
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void stop()
    {
        this;
        JVM INSTR monitorenter ;
        if (b)
        {
            break MISSING_BLOCK_LABEL_12;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        b = false;
        this;
        JVM INSTR monitorexit ;
        h();
        f.d();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String toString()
    {
        return String.format(Locale.US, "GIF: size: %dx%d, frames: %d, error: %d", new Object[] {
            Integer.valueOf(f.a), Integer.valueOf(f.b), Integer.valueOf(f.c), Integer.valueOf(f.f())
        });
    }
}
