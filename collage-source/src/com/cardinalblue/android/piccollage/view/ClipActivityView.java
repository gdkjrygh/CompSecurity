// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.cardinalblue.android.piccollage.controller.k;
import com.cardinalblue.android.piccollage.model.c;
import com.cardinalblue.android.piccollage.model.gson.ClippingPathModel;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.view:
//            g

public class ClipActivityView extends View
    implements com.cardinalblue.android.piccollage.controller.k.b
{
    private static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a e[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/cardinalblue/android/piccollage/view/ClipActivityView$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("MODE_NOTHING", 0);
            b = new a("MODE_PRE_TOUCH", 1);
            c = new a("MODE_DRAWING", 2);
            d = new a("MODE_PINCHING", 3);
            e = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int i1)
        {
            super(s, i1);
        }
    }


    private static final float a[] = {
        7F, 10F
    };
    private g b;
    private Paint c;
    private c d;
    private Drawable e;
    private Drawable f;
    private float g;
    private PointF h;
    private float i;
    private a j;
    private final k k;
    private boolean l;
    private ClippingPathModel m;

    public ClipActivityView(Context context)
    {
        super(context);
        i = 1.0F;
        j = a.a;
        l = false;
        k = new k(this, ViewConfiguration.get(context));
        c();
    }

    public ClipActivityView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = 1.0F;
        j = a.a;
        l = false;
        k = new k(this, ViewConfiguration.get(context));
        c();
    }

    public ClipActivityView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        i = 1.0F;
        j = a.a;
        l = false;
        k = new k(this, ViewConfiguration.get(context));
        c();
    }

    private void c(float f1, float f2)
    {
        d.moveTo(f1, f2);
    }

    private void e()
    {
        float af[] = new float[2];
        af[0] = h.x;
        af[1] = h.y;
        b.Y().mapPoints(af);
        h.x = af[0];
        h.y = af[1];
        float f1 = h.x;
        float f2 = h.y;
        if (d.c() == 0)
        {
            c(f1, f2);
        }
        if (d.a(f1, f2))
        {
            d.a(f1, f2, true);
        } else
        {
            c(f1, f2);
        }
        f.setVisible(false, false);
        invalidate();
        j = com.cardinalblue.android.piccollage.view.a.c;
    }

    private void f()
    {
        d.a();
        f.setVisible(true, false);
        invalidate();
    }

    private void g()
    {
        Object obj;
        if (d != null && e != null)
        {
            if ((obj = d.d()) != null)
            {
                float af[] = new float[2];
                af[0] = ((PointF) (obj)).x;
                af[1] = ((PointF) (obj)).y;
                b.X().mapPoints(af);
                float f1 = e.getMinimumWidth();
                float f2 = e.getMinimumHeight();
                obj = e;
                int i1 = (int)(af[0] - f1 / 2.0F);
                int j1 = (int)(af[1] - f2);
                f2 = af[0];
                ((Drawable) (obj)).setBounds(i1, j1, (int)(f1 / 2.0F + f2), (int)af[1]);
                return;
            }
        }
    }

    private void h()
    {
        Object obj;
        if (d != null && f != null)
        {
            if ((obj = d.e()) != null)
            {
                float af[] = new float[2];
                af[0] = ((PointF) (obj)).x;
                af[1] = ((PointF) (obj)).y;
                b.X().mapPoints(af);
                float f1 = f.getMinimumWidth();
                float f2 = f.getMinimumHeight();
                obj = f;
                int i1 = (int)(af[0] - f1 / 2.0F);
                int j1 = (int)(af[1] - f2 / 2.0F);
                float f3 = af[0];
                ((Drawable) (obj)).setBounds(i1, j1, (int)(f1 / 2.0F + f3), (int)(af[1] + f2 / 2.0F));
                g = d.f() + b.R();
                return;
            }
        }
    }

    private void setPoints(List list)
    {
        d.reset();
        d.a(list);
        g();
        h();
        invalidate();
    }

    public g a(float f1, float f2)
    {
        h = new PointF(f1, f2);
        i = b.P();
        if (b.a(h.x, h.y))
        {
            j = a.b;
            return b;
        } else
        {
            return null;
        }
    }

    public g a(com.cardinalblue.android.piccollage.controller.k.d d1)
    {
        return a(d1.g(), d1.h());
    }

    public void a(g g1, com.cardinalblue.android.piccollage.controller.k.d d1)
    {
        if (g1 != null) goto _L2; else goto _L1
_L1:
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[a.d.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.cardinalblue.android.piccollage.view.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[j.ordinal()];
        JVM INSTR tableswitch 1 3: default 40
    //                   1 48
    //                   2 40
    //                   3 69;
           goto _L3 _L4 _L3 _L5
_L3:
        j = a.a;
_L2:
        return;
_L4:
        d.a(b.P());
        invalidate();
        continue; /* Loop/switch isn't completed */
_L5:
        f();
        invalidate();
        if (true) goto _L3; else goto _L6
_L6:
    }

    public void a(g g1, com.cardinalblue.android.piccollage.controller.k.e e1)
    {
        switch (_cls1.a[j.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            e1.a(b.K(), b.L(), true, b.P(), false, b.P(), b.P(), true, b.Q());
            break;
        }
    }

    public void a(g g1, com.cardinalblue.android.piccollage.controller.k.e e1, com.cardinalblue.android.piccollage.controller.k.d d1)
    {
        g1 = new float[2];
        g1[0] = d1.g();
        g1[1] = d1.h();
        _cls1.a[j.ordinal()];
        JVM INSTR tableswitch 1 3: default 56
    //                   1 105
    //                   2 57
    //                   3 118;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L3:
        if (d1.a())
        {
            j = a.d;
            return;
        }
        if (com.cardinalblue.android.b.k.a(h.x, h.y, g1[0], g1[1], 10F))
        {
            e();
            return;
        }
          goto _L1
_L2:
        b.a(e1);
        invalidate();
        return;
_L4:
        b.Y().mapPoints(g1);
        b.a(g1);
        d.a(g1[0], g1[1], true);
        l = true;
        invalidate();
        return;
    }

    public void a(g g1, ClippingPathModel clippingpathmodel)
    {
        b = g1;
        m = clippingpathmodel;
        d.a(b.P());
        if (m != null)
        {
            m.setScrapWidth(b.S());
            m.setScrapHeight(b.T());
            setPoints(m.getScaledClippingPath());
        }
    }

    public volatile void a(Object obj, com.cardinalblue.android.piccollage.controller.k.d d1)
    {
        a((g)obj, d1);
    }

    public volatile void a(Object obj, com.cardinalblue.android.piccollage.controller.k.e e1)
    {
        a((g)obj, e1);
    }

    public volatile void a(Object obj, com.cardinalblue.android.piccollage.controller.k.e e1, com.cardinalblue.android.piccollage.controller.k.d d1)
    {
        a((g)obj, e1, d1);
    }

    public boolean a()
    {
        return l;
    }

    public Object b(float f1, float f2)
    {
        return a(f1, f2);
    }

    public Object b(com.cardinalblue.android.piccollage.controller.k.d d1)
    {
        return a(d1);
    }

    public void b()
    {
        l = true;
        j = a.a;
        d.reset();
        m.setClippingPoints(null);
        invalidate();
    }

    public void c()
    {
        c = new Paint();
        c.setColor(0xff00ff00);
        c.setStrokeWidth(4F);
        c.setStyle(android.graphics.Paint.Style.STROKE);
        c.setPathEffect(new DashPathEffect(a, 0.0F));
        d = new c(1.0F);
        e = getResources().getDrawable(0x7f02014f);
        f = getResources().getDrawable(0x7f020150);
    }

    public void d()
    {
        d.a();
        e.setVisible(false, false);
        f.setVisible(false, false);
        invalidate();
    }

    public ClippingPathModel getClippingPathModel()
    {
        if (d == null || d.isEmpty())
        {
            return null;
        } else
        {
            return new ClippingPathModel(b.S(), b.T(), d);
        }
    }

    public g getScrap()
    {
        return b;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (b != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        canvas.save();
        b.b(canvas);
        canvas.restore();
        if (d == null || d.c() == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        switch (_cls1.a[j.ordinal()])
        {
        default:
            canvas.save();
            canvas.translate(b.K(), b.L());
            canvas.rotate(b.R(), 0.0F, 0.0F);
            canvas.drawPath(d, c);
            canvas.restore();
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */
        }
_L4:
        if (e.isVisible())
        {
            g();
            e.draw(canvas);
        }
        if (f.isVisible())
        {
            h();
            canvas.rotate(g, f.getBounds().centerX(), f.getBounds().centerY());
            f.draw(canvas);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        canvas.save();
        canvas.translate(b.K(), b.L());
        canvas.rotate(b.R(), 0.0F, 0.0F);
        canvas.scale(b.P() / i, b.P() / i);
        canvas.drawPath(d, c);
        canvas.restore();
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        i1 = android.view.View.MeasureSpec.getSize(i1);
        j1 = android.view.View.MeasureSpec.getSize(j1);
        if (i1 > 0 && j1 > 0)
        {
            float f1 = Math.min((float)i1 / (float)b.S(), (float)j1 / (float)b.T());
            b.a(i1 / 2, j1 / 2, f1 * 0.9F, 0.0F);
            if (d != null)
            {
                d.a(b.P());
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return k.a(motionevent);
    }

}
