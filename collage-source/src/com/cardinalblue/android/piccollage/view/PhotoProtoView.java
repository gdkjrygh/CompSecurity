// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import bolts.j;
import com.cardinalblue.android.b.a;
import com.cardinalblue.android.piccollage.controller.f;
import com.cardinalblue.android.piccollage.controller.k;
import com.cardinalblue.android.piccollage.model.d;
import com.cardinalblue.android.piccollage.model.g;
import com.cardinalblue.android.piccollage.model.gson.IGsonable;
import com.cardinalblue.android.piccollage.view.b.b;
import com.cardinalblue.android.piccollage.view.b.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.cardinalblue.android.piccollage.view:
//            k, g

public class PhotoProtoView extends ImageView
{
    public static class ShapeChangeEvent
        implements IGsonable
    {

        private final int a;
        private final int b;

        public int a()
        {
            return a;
        }

        public int b()
        {
            return b;
        }

        public ShapeChangeEvent(int i1, int j1)
        {
            a = i1;
            b = j1;
        }
    }

    public static interface a
    {

        public abstract void a(com.cardinalblue.android.piccollage.view.k k1, int i1);

        public abstract void b(int i1, int j1);

        public abstract void c(int i1, int j1);
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b d[];

        public static b valueOf(String s1)
        {
            return (b)Enum.valueOf(com/cardinalblue/android/piccollage/view/PhotoProtoView$b, s1);
        }

        public static b[] values()
        {
            return (b[])d.clone();
        }

        static 
        {
            a = new b("PORTRAIT", 0);
            b = new b("SQUARE", 1);
            c = new b("FREEFORM", 2);
            d = (new b[] {
                a, b, c
            });
        }

        private b(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private boolean a;
    private final List b;
    private k c;
    private boolean d;
    private Paint e;
    private int f;
    private int g;
    private int h;
    private Paint i;
    private Paint j;
    private a k;
    private d l;
    private b m;
    private AtomicBoolean n;
    private boolean o;
    private boolean p;
    private Paint q;
    private Paint r;
    private float s[];

    public PhotoProtoView(Context context)
    {
        super(context);
        b = Collections.synchronizedList(new ArrayList());
        d = false;
        e = new Paint();
        e.setColor(Color.argb(204, 128, 128, 128));
        e.setStrokeWidth(2.0F);
        e.setStyle(android.graphics.Paint.Style.STROKE);
        e.setPathEffect(new DashPathEffect(new float[] {
            5F, 5F, 5F, 5F
        }, 1.0F));
        h = Color.argb(128, 255, 255, 255);
        i = new Paint();
        i.setColor(h);
        j = new Paint();
        j.setStyle(android.graphics.Paint.Style.STROKE);
        j.setColor(Color.argb(128, 74, 185, 227));
        j.setStrokeWidth(10F);
        m = com.cardinalblue.android.piccollage.view.b.a;
        n = new AtomicBoolean(false);
        o = false;
        p = true;
        s = k.q;
        g();
    }

    public PhotoProtoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = Collections.synchronizedList(new ArrayList());
        d = false;
        e = new Paint();
        e.setColor(Color.argb(204, 128, 128, 128));
        e.setStrokeWidth(2.0F);
        e.setStyle(android.graphics.Paint.Style.STROKE);
        e.setPathEffect(new DashPathEffect(new float[] {
            5F, 5F, 5F, 5F
        }, 1.0F));
        h = Color.argb(128, 255, 255, 255);
        i = new Paint();
        i.setColor(h);
        j = new Paint();
        j.setStyle(android.graphics.Paint.Style.STROKE);
        j.setColor(Color.argb(128, 74, 185, 227));
        j.setStrokeWidth(10F);
        m = com.cardinalblue.android.piccollage.view.b.a;
        n = new AtomicBoolean(false);
        o = false;
        p = true;
        s = k.q;
        g();
    }

    public PhotoProtoView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        b = Collections.synchronizedList(new ArrayList());
        d = false;
        e = new Paint();
        e.setColor(Color.argb(204, 128, 128, 128));
        e.setStrokeWidth(2.0F);
        e.setStyle(android.graphics.Paint.Style.STROKE);
        e.setPathEffect(new DashPathEffect(new float[] {
            5F, 5F, 5F, 5F
        }, 1.0F));
        h = Color.argb(128, 255, 255, 255);
        i = new Paint();
        i.setColor(h);
        j = new Paint();
        j.setStyle(android.graphics.Paint.Style.STROKE);
        j.setColor(Color.argb(128, 74, 185, 227));
        j.setStrokeWidth(10F);
        m = com.cardinalblue.android.piccollage.view.b.a;
        n = new AtomicBoolean(false);
        o = false;
        p = true;
        s = k.q;
        g();
    }

    static k a(PhotoProtoView photoprotoview)
    {
        return photoprotoview.c;
    }

    private void a(Canvas canvas, com.cardinalblue.android.piccollage.view.k k1, boolean flag)
    {
        if (flag)
        {
            k1.a(canvas, s[2] * (float)k1.W() * s[0], s[2] * (float)k1.W() * s[1]);
            return;
        } else
        {
            k1.b(canvas);
            return;
        }
    }

    private void a(Canvas canvas, boolean flag)
    {
        Object obj = (com.cardinalblue.android.piccollage.view.k)c.d();
        float f1 = c.b();
        float f2 = c.c();
        boolean flag1;
        int i1;
        if (obj != null && ((com.cardinalblue.android.piccollage.view.k) (obj)).w())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            i1 = getFrame().a(f1, f2, getWidth(), getHeight());
        } else
        {
            i1 = -1;
        }
        if (d)
        {
            int j1 = 0;
            while (j1 < getFrame().b().size()) 
            {
                obj = ((g)getFrame().b().get(j1)).a(canvas.getWidth(), canvas.getHeight());
                if (flag1 && j1 == i1)
                {
                    canvas.drawRect(((android.graphics.RectF) (obj)), i);
                    canvas.drawRect(((android.graphics.RectF) (obj)), j);
                } else
                {
                    canvas.drawRect(((android.graphics.RectF) (obj)), e);
                }
                j1++;
            }
        }
        obj = b.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            com.cardinalblue.android.piccollage.view.k k1 = (com.cardinalblue.android.piccollage.view.k)((Iterator) (obj)).next();
            if (k1.t() != -1)
            {
                canvas.save();
                android.graphics.RectF rectf = getFrame().a(k1.t()).a(getWidth(), getHeight(), false);
                canvas.clipRect(rectf);
                a(canvas, k1, flag);
                canvas.restore();
                if (k1.t() == i1)
                {
                    canvas.drawRect(rectf, i);
                    canvas.drawRect(rectf, j);
                }
            }
        } while (true);
        obj = b.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            com.cardinalblue.android.piccollage.view.k k2 = (com.cardinalblue.android.piccollage.view.k)((Iterator) (obj)).next();
            if (k2.t() == -1)
            {
                canvas.save();
                a(canvas, k2, flag);
                canvas.restore();
            }
        } while (true);
        if (a)
        {
            h();
            a(canvas, i(), 60, 20);
        }
    }

    private void a(Canvas canvas, String as[], int i1, int j1)
    {
        canvas.drawRect(0.0F, (float)i1 - q.getTextSize() - 10F, 150F, (as.length - 1) * j1 + i1 + 10, r);
        for (int k1 = 0; k1 < as.length; k1++)
        {
            canvas.drawText(as[k1], 10F, j1 * k1 + i1, q);
        }

    }

    static a b(PhotoProtoView photoprotoview)
    {
        return photoprotoview.k;
    }

    static d c(PhotoProtoView photoprotoview)
    {
        return photoprotoview.getFrame();
    }

    private void d(com.cardinalblue.android.piccollage.view.k k1)
    {
        if (k1 != null)
        {
            int i1 = k1.t();
            if (!k1.a() || i1 == -1)
            {
                k1.e(false);
                return;
            }
            if (!k1.Z())
            {
                k1.v();
                k1.e(true);
                (new com.cardinalblue.android.piccollage.view.b.b(k1, this, i1) {

                    final int a;
                    final PhotoProtoView b;

                    public void a()
                    {
                        super.a();
                        if (f == com.cardinalblue.android.piccollage.view.PhotoProtoView.a(b).d())
                        {
                            com.cardinalblue.android.piccollage.view.PhotoProtoView.a(b).e();
                        }
                        f.e(false);
                        com.cardinalblue.android.piccollage.view.PhotoProtoView.b(b).a(f, a);
                        b.postInvalidate();
                        super.a();
                    }

            
            {
                b = PhotoProtoView.this;
                a = i1;
                super(k1, photoprotoview1);
            }
                }).d();
                c.a();
                postInvalidate();
                return;
            }
        }
    }

    private void g()
    {
        a = com.cardinalblue.android.b.d.c();
    }

    private d getFrame()
    {
        return l;
    }

    private void h()
    {
        if (q == null)
        {
            q = new Paint();
            q.setTextSize(20F);
            q.setColor(0xffff0000);
            q.setStrokeWidth(5F);
        }
        if (r == null)
        {
            r = new Paint();
            r.setColor(Color.argb(200, 150, 150, 150));
        }
    }

    private String[] i()
    {
        Iterator iterator = b.iterator();
        int j1 = 0;
        int i1 = 0;
        while (iterator.hasNext()) 
        {
            int l1;
            if ((com.cardinalblue.android.piccollage.view.k)iterator.next() instanceof com.cardinalblue.android.piccollage.view.g)
            {
                int k1 = j1 + 1;
                j1 = i1;
                i1 = k1;
            } else
            {
                int i2 = i1 + 1;
                i1 = j1;
                j1 = i2;
            }
            l1 = j1;
            j1 = i1;
            i1 = l1;
        }
        return (new String[] {
            (new StringBuilder()).append("Scrap Num : ").append(j1 + i1).toString(), (new StringBuilder()).append("Image Num : ").append(j1).toString(), (new StringBuilder()).append("Text Num : ").append(i1).toString()
        });
    }

    private void setFrame(d d1)
    {
        l = d1;
        boolean flag;
        if (!d1.d())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }

    public Bitmap a(int i1, int j1)
    {
        return a(i1, j1, f.e);
    }

    public Bitmap a(int i1, int j1, float f1, android.graphics.Bitmap.Config config)
    {
        config = Bitmap.createBitmap(i1, j1, config);
        Canvas canvas = new Canvas(config);
        Matrix matrix = new Matrix();
        matrix.setScale(f1, f1);
        canvas.concat(matrix);
        a(canvas);
        return config;
    }

    public Bitmap a(int i1, int j1, android.graphics.Bitmap.Config config)
    {
        return a(i1, j1, 1.0F, config);
    }

    public void a()
    {
        c.a();
    }

    public void a(float f1)
    {
        if (l != null)
        {
            l.a(f1);
            postInvalidate();
        }
    }

    public void a(float f1, float f2, float f3)
    {
        if (p)
        {
            s[0] = (-1F * f1) / 30F;
            s[1] = f2 / 30F;
            s[2] = 1.0F - f3 / 400F;
            postInvalidate();
        }
    }

    public void a(Canvas canvas)
    {
        boolean flag = d;
        d = false;
        draw(canvas);
        d = flag;
    }

    public void a(com.cardinalblue.android.piccollage.controller.k.b b1, com.cardinalblue.android.piccollage.controller.k.c c1)
    {
        c = new k(b1, ViewConfiguration.get(getContext()));
        c.a(c1);
    }

    public void a(d d1)
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            if (((com.cardinalblue.android.piccollage.view.k)iterator.next()).I())
            {
                return;
            }
        }

        setFrame(d1);
        postInvalidate();
    }

    public void a(b b1)
    {
        while (b1 == m || n.get()) 
        {
            return;
        }
        n.set(true);
        setShape(b1);
    }

    public void a(b b1, int i1, int j1)
    {
        m = b1;
        g = i1;
        f = j1;
        requestLayout();
    }

    public void a(com.cardinalblue.android.piccollage.view.g g1)
    {
        this;
        JVM INSTR monitorenter ;
        Bitmap bitmap = g1.m();
        if (!g1.j()) goto _L2; else goto _L1
_L1:
        g1 = new BitmapDrawable(bitmap);
        g1.setTileModeXY(android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.REPEAT);
        setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
_L3:
        setImageDrawable(g1);
        postInvalidate();
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        long l1 = Math.round((double)g1.Q() / 1.5707963267948966D);
        float f1 = (int)(l1 * 90L);
        g1 = com.cardinalblue.android.b.a.a(bitmap, f1, 2);
_L4:
        g1 = new BitmapDrawable(g1);
        setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
          goto _L3
        g1;
        throw g1;
        g1;
        com.cardinalblue.android.piccollage.a.f.a(g1);
        g1 = bitmap;
          goto _L4
    }

    public void a(com.cardinalblue.android.piccollage.view.k k1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        com.cardinalblue.android.piccollage.a.b.aa();
        if (a)
        {
            k1.g(true);
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        d(k1);
        b.add(k1);
        c();
        this;
        JVM INSTR monitorexit ;
        return;
        k1;
        throw k1;
    }

    public void a(com.cardinalblue.android.piccollage.view.k k1, boolean flag, boolean flag1)
    {
        if (!k1.aa() && !getFrame().d() && k1.t() != -1)
        {
            com.cardinalblue.android.piccollage.view.b.d.a a1 = com.cardinalblue.android.piccollage.view.b.d.a(k1, getFrame().a(k1.t()).a(getMeasuredWidth(), getMeasuredHeight(), true), flag);
            (new com.cardinalblue.android.piccollage.view.b.d(k1, this, a1, a1, flag1, flag) {

                int a;
                final com.cardinalblue.android.piccollage.view.b.d.a b;
                final boolean c;
                final boolean d;
                final PhotoProtoView e;

                public void a()
                {
                    this;
                    JVM INSTR monitorenter ;
                    Object obj = PhotoProtoView.c(e).a(f.t()).a(e.getMeasuredWidth(), e.getMeasuredHeight(), true);
                    obj = com.cardinalblue.android.piccollage.view.b.d.a(f, ((android.graphics.RectF) (obj)), d);
                    f.a(f.K() + ((com.cardinalblue.android.piccollage.view.b.d.a) (obj)).c, f.L() + ((com.cardinalblue.android.piccollage.view.b.d.a) (obj)).d, ((com.cardinalblue.android.piccollage.view.b.d.a) (obj)).f, (float)Math.toRadians(((com.cardinalblue.android.piccollage.view.b.d.a) (obj)).e));
                    if (c)
                    {
                        f.c(a);
                    }
                    f.b(255);
                    f.f(false);
                    if (f == com.cardinalblue.android.piccollage.view.PhotoProtoView.a(e).d())
                    {
                        com.cardinalblue.android.piccollage.view.PhotoProtoView.a(e).e();
                    }
                    super.a();
                    this;
                    JVM INSTR monitorexit ;
                    return;
                    Exception exception;
                    exception;
                    throw exception;
                }

                public void b()
                {
                    super.b();
                    f.a(f.K() + b.c, f.L() + b.d, b.f, (float)Math.toRadians(b.e));
                    f.f(true);
                    if (c)
                    {
                        a = f.t();
                        f.c(-1);
                        f.b(128);
                    }
                }

            
            {
                e = PhotoProtoView.this;
                b = a2;
                c = flag;
                d = flag1;
                super(k1, photoprotoview1, a1);
                a = -1;
            }
            }).d();
        }
    }

    public boolean a(com.cardinalblue.android.piccollage.view.k k1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = b.remove(k1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        c();
        this;
        JVM INSTR monitorexit ;
        return flag;
        k1;
        throw k1;
    }

    public j b(com.cardinalblue.android.piccollage.view.k k1)
    {
        bolts.j.a a1 = bolts.j.a();
        (new com.cardinalblue.android.piccollage.view.b.b(k1, this, a1) {

            final bolts.j.a a;
            final PhotoProtoView b;

            public void a()
            {
                this;
                JVM INSTR monitorenter ;
                super.a();
                a.b(f);
                this;
                JVM INSTR monitorexit ;
                return;
                Exception exception;
                exception;
                throw exception;
            }

            
            {
                b = PhotoProtoView.this;
                a = a1;
                super(k1, photoprotoview1);
            }
        }).d();
        return a1.a();
    }

    public void b()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((com.cardinalblue.android.piccollage.view.k)iterator.next()).ae()) { }
    }

    public boolean b(com.cardinalblue.android.piccollage.view.g g1)
    {
        this;
        JVM INSTR monitorenter ;
        if (g1 == null) goto _L2; else goto _L1
_L1:
        Bitmap bitmap = g1.m();
        if (bitmap != null) goto _L3; else goto _L2
_L2:
        boolean flag = false;
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L3:
        a(g1);
        flag = true;
        if (true) goto _L5; else goto _L4
_L4:
        g1;
        throw g1;
    }

    public j c(com.cardinalblue.android.piccollage.view.k k1)
    {
        bolts.j.a a1 = bolts.j.a();
        (new com.cardinalblue.android.piccollage.view.b.a(k1, this, getScraps(), a1) {

            final bolts.j.a a;
            final PhotoProtoView b;

            public void a()
            {
                super.a();
                a.b(f);
            }

            
            {
                b = PhotoProtoView.this;
                a = a1;
                super(k1, photoprotoview1, list);
            }
        }).d();
        return a1.a();
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        Collections.sort(getScraps(), new Comparator() {

            final PhotoProtoView a;

            public int a(com.cardinalblue.android.piccollage.view.k k1, com.cardinalblue.android.piccollage.view.k k2)
            {
                return k1.W() - k2.W();
            }

            public int compare(Object obj, Object obj1)
            {
                return a((com.cardinalblue.android.piccollage.view.k)obj, (com.cardinalblue.android.piccollage.view.k)obj1);
            }

            
            {
                a = PhotoProtoView.this;
                super();
            }
        });
        postInvalidate();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void d()
    {
        postInvalidate();
    }

    public void e()
    {
        if (!o && b != null)
        {
            b.clear();
        }
    }

    public void f()
    {
        if (!o)
        {
            o = true;
            if (b != null)
            {
                for (Iterator iterator = b.iterator(); iterator.hasNext(); ((com.cardinalblue.android.piccollage.view.k)iterator.next()).E()) { }
                b.clear();
                System.gc();
            }
        }
    }

    public List getScraps()
    {
        return b;
    }

    public b getShape()
    {
        return m;
    }

    protected void onDraw(Canvas canvas)
    {
        if (o)
        {
            return;
        } else
        {
            super.onDraw(canvas);
            a(canvas, true);
            return;
        }
    }

    public void onMeasure(int i1, int j1)
    {
        int k1 = android.view.View.MeasureSpec.getSize(i1);
        int l1 = android.view.View.MeasureSpec.getSize(j1);
        static class _cls6
        {

            static final int a[];

            static 
            {
                a = new int[b.values().length];
                try
                {
                    a[com.cardinalblue.android.piccollage.view.b.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[b.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.cardinalblue.android.piccollage.view.b.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.cardinalblue.android.piccollage.view._cls6.a[m.ordinal()])
        {
        default:
            super.onMeasure(i1, j1);
            if (n.get())
            {
                k.c(k1, l1);
                n.set(false);
                return;
            } else
            {
                k.b(k1, l1);
                return;
            }

        case 1: // '\001'
            if (k1 > l1)
            {
                i1 = l1;
            } else
            {
                i1 = k1;
            }
            setMeasuredDimension(i1, i1);
            if (n.get())
            {
                k.c(i1, i1);
                n.set(false);
                return;
            } else
            {
                k.b(i1, i1);
                return;
            }

        case 2: // '\002'
            setMeasuredDimension(g, f);
            break;
        }
        if (n.get())
        {
            k.c(g, f);
            n.set(false);
            return;
        } else
        {
            k.b(g, f);
            return;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return c.a(motionevent);
    }

    public void setEnableParallaxMode(boolean flag)
    {
        p = flag;
    }

    public void setListener(a a1)
    {
        k = a1;
    }

    public void setShape(b b1)
    {
        a(b1, -1, -1);
    }
}
