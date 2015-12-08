// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.roidapp.photogrid.common.bl;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.photogrid.release:
//            PhotoGridActivity, ay, PhotoView, cy

public final class az extends SurfaceView
    implements android.view.SurfaceHolder.Callback
{

    public boolean a;
    private ay b;
    private ArrayList c;
    private ArrayList d;
    private ArrayList e;
    private ArrayList f;
    private ArrayList g;
    private float h;
    private int i;
    private Paint j;
    private SurfaceHolder k;
    private boolean l;
    private PhotoGridActivity m;
    private int n;

    public az(PhotoGridActivity photogridactivity)
    {
        super(photogridactivity);
        c = new ArrayList();
        d = new ArrayList();
        e = new ArrayList();
        f = new ArrayList();
        g = new ArrayList();
        h = 12F;
        i = 0xffff0000;
        j = new Paint();
        l = false;
        a = true;
        m = photogridactivity;
        if (android.os.Build.VERSION.SDK_INT > 10)
        {
            bl.a();
            bl.b(this);
        }
        j.setAntiAlias(true);
        j.setStyle(android.graphics.Paint.Style.FILL);
        setZOrderOnTop(true);
        k = getHolder();
        k.setFormat(-2);
        k.addCallback(this);
        n = photogridactivity.getResources().getDimensionPixelSize(0x7f090095);
        a(6F);
    }

    private void j()
    {
        Canvas canvas;
        canvas = k.lockCanvas();
        if (canvas == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        canvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        this;
        JVM INSTR monitorenter ;
        int i1 = 0;
_L2:
        if (i1 >= c.size())
        {
            break; /* Loop/switch isn't completed */
        }
        ((ay)c.get(i1)).a(canvas, j);
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        if (b != null)
        {
            b.a(canvas, j);
        }
        this;
        JVM INSTR monitorexit ;
        k.unlockCanvasAndPost(canvas);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final ArrayList a()
    {
        return c;
    }

    public final void a(float f1)
    {
        h = (float)n * f1;
    }

    public final void a(int i1)
    {
        i = i1;
    }

    public final void a(boolean flag)
    {
        l = flag;
        if (m != null && m.O() != null)
        {
            m.O().a = flag;
        }
        if (flag)
        {
            f.addAll(c);
        }
    }

    public final ArrayList b()
    {
        return d;
    }

    public final ArrayList c()
    {
        return g;
    }

    public final boolean d()
    {
        return l;
    }

    public final void e()
    {
        this;
        JVM INSTR monitorenter ;
        if (e.size() <= 0) goto _L2; else goto _L1
_L1:
        if (c.size() != 0) goto _L4; else goto _L3
_L3:
        c.addAll(e);
        e.clear();
        m.a(true);
_L6:
        j();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (g.size() <= 0) goto _L4; else goto _L5
_L5:
        ay ay1 = (ay)g.get(g.size() - 1);
        d.add(0, ay1);
        g.remove(ay1);
        c.remove(ay1);
        if (c.size() == 0)
        {
            m.a(false);
        }
          goto _L6
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean f()
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        if (d.size() <= 0) goto _L2; else goto _L1
_L1:
        g.add(d.get(0));
        c.add(d.get(0));
        m.a(true);
        d.remove(0);
        j();
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void g()
    {
        e.clear();
        c.clear();
        d.clear();
        g.clear();
        c.addAll(f);
        f.clear();
        i = 0xffff0000;
        a(6F);
        j();
        m.O().invalidate();
    }

    public final void h()
    {
        e.clear();
        f.clear();
        g.clear();
        d.clear();
        i = 0xffff0000;
        a(6F);
    }

    public final void i()
    {
        e.addAll(c);
        c.clear();
        d.clear();
        m.k();
        m.a(false);
        j();
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        float f1;
        float f2;
        if (m == null || m.isFinishing())
        {
            return false;
        }
        if (!l)
        {
            return false;
        }
        cy cy1 = (cy)m.c("FragmentDoodle");
        if (cy1 != null)
        {
            cy1.a();
        }
        f1 = motionevent.getX();
        f2 = motionevent.getY();
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 96
    //                   0 102
    //                   1 228
    //                   2 199
    //                   3 228;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        return super.onTouchEvent(motionevent);
_L2:
        a = false;
        b = new ay();
        b.b = h;
        b.a = i;
        if (d.size() > 0)
        {
            d.clear();
        }
        if (e.size() > 0)
        {
            g.clear();
            e.clear();
        }
        b.a(new PointF(f1, f2));
        return true;
_L4:
        if (l)
        {
            b.a(new PointF(f1, f2));
            j();
        }
        return true;
_L3:
        a = true;
        if (b != null && l && b.a() > 0)
        {
            b.a(new PointF(f1, f2));
            if (d.size() == 0)
            {
                m.k();
            }
            if (e.size() == 0)
            {
                m.a(true);
            }
            g.add(b);
            c.add(b);
            b = null;
            j();
            return true;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public final void surfaceChanged(SurfaceHolder surfaceholder, int i1, int j1, int k1)
    {
    }

    public final void surfaceCreated(SurfaceHolder surfaceholder)
    {
        j();
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
    }
}
