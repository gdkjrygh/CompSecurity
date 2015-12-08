// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.aviary.android.feather.headless.filters.NativeToolFilter;
import com.aviary.android.feather.library.d.c;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            TiltShiftPanel

class a extends Thread
{

    boolean a;
    volatile boolean b;
    final Queue c = new LinkedBlockingQueue();
    b d;
    final TiltShiftPanel e;

    void a()
    {
    }

    public void a(float af[], float f1, float f2, float f3, float f4, float f5, float f6)
    {
        this;
        JVM INSTR monitorenter ;
        if (!b) goto _L2; else goto _L1
_L1:
        a a1 = d;
        if (a1 != null) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        d.d();
        d.d(new float[] {
            af[0], af[1], f1, f2, f3, f4, f5, f6
        });
        if (true) goto _L2; else goto _L4
_L4:
        af;
        throw af;
    }

    public void a(float af[], com.aviary.android.feather.sdk.widget.d d1, float f1, float f2, float f3, float f4, float f5, 
            float f6)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Object obj;
        if (d != null)
        {
            d.d();
            d = null;
        }
        if (d1 != com.aviary.android.feather.sdk.widget.d)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        obj = com.aviary.android.feather.headless.filters.ority;
_L3:
        c c1;
        obj = new d(((com.aviary.android.feather.headless.filters.ority) (obj)));
        ((d) (obj)).d(new float[] {
            af[0], af[1], f1, f2, f3, f4, f5, f6
        });
        c1 = e.v;
        if (d1 == com.aviary.android.feather.sdk.widget.e)
        {
            af = "circle";
        } else
        {
            af = "rectangle";
        }
        c1.a(af);
        c.add(obj);
        d = ((d) (obj));
          goto _L1
        af;
        throw af;
        obj = com.aviary.android.feather.headless.filters.ority;
          goto _L3
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        a = true;
        b = false;
        interrupt();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (!b) goto _L2; else goto _L1
_L1:
        interrupt interrupt = d;
        if (interrupt != null) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        d.d();
        d = null;
        if (true) goto _L2; else goto _L4
_L4:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean d()
    {
        return c.size() == 0;
    }

    public int e()
    {
        return c.size();
    }

    public void f()
    {
        if (!b || c == null) goto _L2; else goto _L1
_L1:
        Queue queue = c;
        queue;
        JVM INSTR monitorenter ;
_L3:
        c c1;
        do
        {
            if (c.size() <= 0)
            {
                break MISSING_BLOCK_LABEL_76;
            }
            c1 = (c)c.poll();
        } while (c1 == null);
        e.q.e("end element...");
        c1.e();
          goto _L3
        Exception exception;
        exception;
        queue;
        JVM INSTR monitorexit ;
        throw exception;
        queue;
        JVM INSTR monitorexit ;
_L2:
    }

    public void g()
    {
        if (!b || c == null) goto _L2; else goto _L1
_L1:
        Queue queue = c;
        queue;
        JVM INSTR monitorenter ;
        Iterator iterator = c.iterator();
_L4:
        e e1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_80;
            }
            e1 = (c)iterator.next();
        } while (e1 == null);
        e.q.e("end element...");
        e1.e();
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        queue;
        JVM INSTR monitorexit ;
        throw exception;
        queue;
        JVM INSTR monitorexit ;
_L2:
    }

    public void run()
    {
        while (!a) ;
        boolean flag = false;
        e.q.e("thread.start!");
        e.q.e("filter.init");
        com.aviary.android.feather.sdk.panels.TiltShiftPanel.c(e).a(e.g, e.f);
        RectF rectf = new RectF(0.0F, 0.0F, e.f.getWidth(), e.f.getHeight());
        RectF rectf1 = new RectF();
label0:
        do
        {
            if (!b)
            {
                break;
            }
            if (c.size() > 0 && !isInterrupted())
            {
                e.q.e((new StringBuilder()).append("queue.size: ").append(c.size()).toString());
                if (!flag)
                {
                    flag = true;
                    e.i();
                }
                e e1 = (e)c.element();
                if (e1 == null)
                {
                    c.poll();
                    continue;
                }
                com.aviary.android.feather.headless.filters.upt upt = c(e1);
                com.aviary.android.feather.sdk.panels.TiltShiftPanel.c(e).a(upt);
                do
                {
                    if (e1.e() <= 0 && e1.e() || !b || isInterrupted())
                    {
                        c.poll();
                        continue label0;
                    }
                    float af[] = (float[])e1.c();
                    if (af != null)
                    {
                        float f1 = af[0];
                        float f2 = af[1];
                        float f3 = af[2];
                        float f4 = af[3];
                        float f5 = af[4];
                        float f6 = af[5];
                        float f7 = af[6];
                        float f8 = af[7];
                        com.aviary.android.feather.sdk.panels.TiltShiftPanel.c(e).a(f3, f4, 0, false, new float[] {
                            f1, f2
                        });
                        rectf1.set(f5, f6, f7, f8);
                        rectf.union(rectf1);
                        com.aviary.android.feather.sdk.panels.TiltShiftPanel.c(e).a(rectf);
                        rectf.set(rectf1);
                        TiltShiftPanel.d(e);
                    }
                } while (true);
            }
            if (flag)
            {
                e.j();
                flag = false;
            }
        } while (true);
        e.j();
        e.q.e("thread.end");
    }

    public void start()
    {
        this;
        JVM INSTR monitorenter ;
        a = true;
        b = true;
        super.start();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public (TiltShiftPanel tiltshiftpanel, String s, int i)
    {
        e = tiltshiftpanel;
        super(s);
        setPriority(i);
        a();
    }
}
