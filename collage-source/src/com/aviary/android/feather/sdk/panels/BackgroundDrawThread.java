// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import com.aviary.android.feather.common.a.a;
import com.aviary.android.feather.headless.filters.MoaJavaToolStrokeResult;
import com.aviary.android.feather.headless.filters.NativeToolFilter;
import com.aviary.android.feather.headless.moa.l;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

final class BackgroundDrawThread extends Thread
{
    static class a extends LinkedBlockingQueue
    {

        private com.aviary.android.feather.headless.filters.NativeToolFilter.a a;
        private float b;
        private volatile boolean c;
        private PointF d;

        public PointF a()
        {
            return d;
        }

        public com.aviary.android.feather.headless.filters.NativeToolFilter.a b()
        {
            return a;
        }

        public float c()
        {
            return b;
        }

        public void d()
        {
            c = true;
        }

        public boolean e()
        {
            return c;
        }

        public a(com.aviary.android.feather.headless.filters.NativeToolFilter.a a1, float f1, float af[])
        {
            a = a1;
            b = f1;
            c = false;
            d = new PointF();
            if (af != null && af.length >= 2)
            {
                d.x = af[0];
                d.y = af[1];
            }
            add(af);
        }
    }


    static final com.aviary.android.feather.common.a.a.c a;
    SoftReference b;
    SoftReference c;
    private boolean d;
    private boolean e;
    private volatile boolean f;
    private final Queue g = new LinkedBlockingQueue();
    private a h;
    private final PointF i = new PointF();
    private NativeToolFilter j;
    private Handler k;
    private double l;
    private boolean m;

    public BackgroundDrawThread(String s, int i1, NativeToolFilter nativetoolfilter, Handler handler, double d1)
    {
        super(s);
        j = nativetoolfilter;
        k = handler;
        l = d1;
        setPriority(i1);
        a();
    }

    private void a(Canvas canvas, Paint paint, Bitmap bitmap)
    {
        if (!isInterrupted() && canvas != null && paint != null && bitmap != null && !bitmap.isRecycled())
        {
            paint.setColor(bitmap.getPixel(0, 0));
            canvas.drawPoint(0.0F, 0.0F, paint);
        }
    }

    public void a()
    {
    }

    public void a(float f1, float af[], com.aviary.android.feather.headless.filters.NativeToolFilter.a a1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = f;
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a.b("pathStart");
        if (h != null)
        {
            h.d();
            h = null;
        }
        i.set(af[0], af[1]);
        af = new a(a1, f1, af);
        g.add(af);
        h = af;
        if (true) goto _L1; else goto _L3
_L3:
        af;
        throw af;
    }

    public void a(Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a.b("start");
        b = new SoftReference(bitmap);
        e = true;
        f = true;
        super.start();
        if (true) goto _L1; else goto _L3
_L3:
        bitmap;
        throw bitmap;
    }

    public void a(Bitmap bitmap, Bitmap bitmap1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = e;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        a.b("start");
        b = new SoftReference(bitmap);
        c = new SoftReference(bitmap1);
        e = true;
        f = true;
        super.start();
        if (true) goto _L1; else goto _L3
_L3:
        bitmap;
        throw bitmap;
    }

    public void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        d = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(float af[])
    {
        if (!f || h == null)
        {
            return;
        }
        float f1 = PointF.length(Math.abs(i.x - af[0]), Math.abs(i.y - af[1]));
        if (f1 > 10F)
        {
            i.set(af[0], af[1]);
            h.add(af);
            return;
        } else
        {
            a.c((new StringBuilder()).append("skipping point, too close... ").append(f1).toString());
            return;
        }
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        a.b("quit");
        e = true;
        f = false;
        j = null;
        interrupt();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void b(boolean flag)
    {
        m = flag;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (!f) goto _L2; else goto _L1
_L1:
        a a1 = h;
        if (a1 != null) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        a.b("pathEnd");
        if (!d) goto _L5; else goto _L4
_L4:
        h.add(new float[] {
            i.x, i.y
        });
_L6:
        h.d();
        h = null;
          goto _L2
        Exception exception;
        exception;
        throw exception;
_L5:
label0:
        {
            if (i.equals(h.a()))
            {
                break label0;
            }
            a.a("adding tail");
            h.add(new float[] {
                i.x, i.y
            });
        }
          goto _L6
        a.a("skipping tail");
          goto _L6
    }

    public boolean d()
    {
        return g.size() == 0;
    }

    public int e()
    {
        return g.size();
    }

    public void f()
    {
        a.b("clear");
        if (!f || g == null) goto _L2; else goto _L1
_L1:
        Queue queue = g;
        queue;
        JVM INSTR monitorenter ;
_L3:
        a a1;
        do
        {
            if (g.size() <= 0)
            {
                break MISSING_BLOCK_LABEL_82;
            }
            a1 = (a)g.poll();
        } while (a1 == null);
        a.a("end element...");
        a1.d();
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
        a.b("finish");
        if (!f || g == null) goto _L2; else goto _L1
_L1:
        Queue queue = g;
        queue;
        JVM INSTR monitorenter ;
        Iterator iterator = g.iterator();
_L4:
        a a1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_86;
            }
            a1 = (a)iterator.next();
        } while (a1 == null);
        a.a("end element...");
        a1.d();
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

    public boolean isInterrupted()
    {
        if (!f)
        {
            return true;
        } else
        {
            return super.isInterrupted();
        }
    }

    public void run()
    {
        Object obj;
        Object obj1;
        MoaJavaToolStrokeResult moajavatoolstrokeresult;
        Object obj2;
        Rect rect;
        Paint paint;
        boolean flag;
        while (!e) ;
        rect = new Rect();
        Object obj3;
        if (m)
        {
            moajavatoolstrokeresult = new MoaJavaToolStrokeResult();
        } else
        {
            moajavatoolstrokeresult = null;
        }
        a.a("thread.start!");
        paint = new Paint();
        if (j == null || isInterrupted() || b == null) goto _L2; else goto _L1
_L1:
        obj = (Bitmap)b.get();
        if (c != null)
        {
            obj1 = (Bitmap)c.get();
        } else
        {
            obj1 = null;
        }
        if (obj == null || ((Bitmap) (obj)).isRecycled() || obj1 != null && ((Bitmap) (obj1)).isRecycled()) goto _L2; else goto _L3
_L3:
        j.a(((Bitmap) (obj)), ((Bitmap) (obj1)));
        double d1;
        float f1;
        float f2;
        float f3;
        float af[];
        a a1;
        com.aviary.android.feather.headless.filters.NativeToolFilter.a a2;
        l l1;
        ArrayList arraylist;
        boolean flag1;
        int i1;
        byte byte0;
        int j1;
        int k1;
        int i2;
        int j2;
        boolean flag2;
        if (obj1 != null)
        {
            obj = new Canvas(((Bitmap) (obj1)));
        } else
        if (obj != null)
        {
            obj2 = new Canvas(((Bitmap) (obj)));
            obj1 = obj;
            obj = obj2;
        } else
        {
            obj = null;
            obj1 = null;
        }
        if (j != null && !isInterrupted())
        {
            j.d();
        }
        if (k != null && !isInterrupted())
        {
            a(((Canvas) (obj)), paint, ((Bitmap) (obj1)));
            k.sendEmptyMessage(12);
            k.sendEmptyMessage(1000);
        }
        obj3 = null;
        flag = false;
        obj2 = obj1;
        obj1 = obj;
        obj = obj3;
_L9:
label0:
        {
            if (!isInterrupted())
            {
                if (!isInterrupted())
                {
                    break label0;
                }
                a.a("isInterrupted:true");
            }
            a.a((new StringBuilder()).append("exiting while isInterrupted: ").append(isInterrupted()).toString());
            if (k != null && !isInterrupted())
            {
                k.sendEmptyMessage(5);
            }
            k = null;
            a.a("exiting thread...");
            return;
        }
        if (g.size() <= 0 || isInterrupted())
        {
            break MISSING_BLOCK_LABEL_1509;
        }
        a.a((new StringBuilder()).append("queue.size: ").append(g.size()).toString());
        if (!flag)
        {
            flag1 = true;
            flag = flag1;
            if (k != null)
            {
                k.sendEmptyMessage(4);
                flag = flag1;
            }
        }
        a1 = (a)g.element();
        if (a1 == null)
        {
            g.poll();
            continue; /* Loop/switch isn't completed */
        }
        f1 = a1.c();
        a.b("radius: %.2f", new Object[] {
            Float.valueOf(f1)
        });
        a2 = a1.b();
        l1 = new l(a2, f1);
        arraylist = new ArrayList();
        byte0 = 0;
        flag1 = true;
_L5:
        while (a1.size() <= 0 && a1.e() || isInterrupted() || j == null) 
        {
            if (j != null && !isInterrupted())
            {
                j.a(l1);
            }
            g.poll();
            continue; /* Loop/switch isn't completed */
        }
        af = (float[])a1.poll();
        if (af == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        rect.set((int)((double)af[0] - (double)f1 * l), (int)((double)af[1] - (double)f1 * l), (int)((double)af[0] + (double)f1 * l), (int)((double)af[1] + (double)f1 * l));
        l1.a(af);
        arraylist.add(Float.valueOf(af[0]));
        arraylist.add(Float.valueOf(af[1]));
        if (j != null && !isInterrupted())
        {
            j.a(a2);
            j.a(f1, 0.0D, rect.centerX(), rect.centerY(), moajavatoolstrokeresult);
            if (moajavatoolstrokeresult != null)
            {
                a.b("strokeResult: %s", new Object[] {
                    moajavatoolstrokeresult
                });
                l1.a(moajavatoolstrokeresult);
            }
            if (j != null)
            {
                j.a(rect);
            }
        }
        if (k != null && !isInterrupted())
        {
            a(((Canvas) (obj1)), paint, ((Bitmap) (obj2)));
            k.sendEmptyMessage(12);
            i1 = 2;
            flag1 = false;
        } else
        {
            i1 = 2;
            flag1 = false;
        }
_L7:
        obj = af;
        byte0 = i1;
        if (true) goto _L5; else goto _L4
_L4:
        if (obj == null) goto _L5; else goto _L6
_L6:
        a.b("path.size: %d", new Object[] {
            Integer.valueOf(arraylist.size())
        });
        a.b("element.iscompleted: %b", new Object[] {
            Boolean.valueOf(a1.e())
        });
        a.b("element.size: %d", new Object[] {
            Integer.valueOf(a1.size())
        });
        if (arraylist.size() == 2 && a1.e() && a1.size() == 0 && d)
        {
            a.c("single tap!");
            f2 = ((Float)arraylist.get(arraylist.size() - 2)).floatValue();
            f3 = ((Float)arraylist.get(arraylist.size() - 1)).floatValue();
            if (f2 != af[0] || f3 != af[1])
            {
                arraylist.add(Float.valueOf(af[0]));
                arraylist.add(Float.valueOf(af[1]));
                l1.a(af[0], af[1]);
                i1 = 2;
            } else
            {
                a.c("dont add more points..");
                i1 = 0;
            }
        } else
        {
            arraylist.add(Float.valueOf(af[0]));
            arraylist.add(Float.valueOf(af[1]));
            l1.a(af[0], af[1]);
            i1 = 2;
        }
        j1 = (int)obj[0];
        k1 = (int)af[0];
        i2 = (int)obj[1];
        j2 = (int)af[1];
        rect.set(Math.min(j1, k1), Math.min(i2, j2), Math.max(j1, k1), Math.max(i2, j2));
        rect.sort();
        rect.inset(-(int)((double)f1 * l), -(int)((double)f1 * l));
        if (a1.e())
        {
            a.a((new StringBuilder()).append("size: ").append(a1.size()).append(", empty: ").append(a1.isEmpty()).toString());
        }
        if (j != null && !isInterrupted())
        {
            obj = j;
            d1 = f1;
            if (a1.e() && a1.isEmpty())
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            obj = ((NativeToolFilter) (obj)).a(d1, 0.0D, byte0, flag2, com.aviary.android.feather.library.c.a.a(arraylist));
            if (obj != null && obj.length == 4)
            {
                rect.set((int)obj[0], (int)obj[1], (int)obj[2], (int)obj[3]);
            }
            if (j != null)
            {
                j.a(rect);
            }
        }
        i1 = byte0 + i1;
        if (k != null && !isInterrupted())
        {
            a(((Canvas) (obj1)), paint, ((Bitmap) (obj2)));
            k.sendEmptyMessage(12);
        }
          goto _L7
        if (flag)
        {
            if (k != null && !isInterrupted())
            {
                k.sendEmptyMessage(5);
            }
            flag = false;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        obj1 = null;
        obj2 = null;
        obj = null;
        flag = false;
        if (true) goto _L9; else goto _L8
_L8:
    }

    static 
    {
        a = com.aviary.android.feather.common.a.a.a("BackgroundDrawThread", com.aviary.android.feather.common.a.a.d.a);
    }
}
