// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget.material;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Adapter;
import android.widget.AdapterView;
import com.nineoldandroids.a.c;
import com.nineoldandroids.a.k;

// Referenced classes of package com.qihoo.security.widget.material:
//            b

public class com.qihoo.security.widget.material.a
{
    private class a
        implements Runnable
    {

        final com.qihoo.security.widget.material.a a;

        private void a(AdapterView adapterview)
        {
            int i1 = adapterview.getPositionForView(com.qihoo.security.widget.material.a.a(a));
            long l1;
            if (adapterview.getAdapter() != null)
            {
                l1 = adapterview.getAdapter().getItemId(i1);
            } else
            {
                l1 = 0L;
            }
            if (i1 != -1)
            {
                adapterview.performItemClick(com.qihoo.security.widget.material.a.a(a), i1, l1);
            }
        }

        public void run()
        {
            if (com.qihoo.security.widget.material.a.a(a).getParent() instanceof AdapterView)
            {
                a((AdapterView)com.qihoo.security.widget.material.a.a(a).getParent());
            }
            if (com.qihoo.security.widget.material.a.h(a) != null)
            {
                com.qihoo.security.widget.material.a.h(a).onClick(com.qihoo.security.widget.material.a.a(a));
            }
        }

        private a()
        {
            a = com.qihoo.security.widget.material.a.this;
            super();
        }

    }

    private final class b
        implements Runnable
    {

        final com.qihoo.security.widget.material.a a;

        public void run()
        {
            com.qihoo.security.widget.material.a.a(a, false);
            com.qihoo.security.widget.material.a.a(a).setPressed(true);
            if (com.qihoo.security.widget.material.a.f(a))
            {
                com.qihoo.security.widget.material.a.g(a);
            }
        }
    }


    private b A;
    private Context B;
    private android.view.View.OnClickListener C;
    private final com.nineoldandroids.util.c D = new com.nineoldandroids.util.c(java/lang/Float, "radius") {

        final com.qihoo.security.widget.material.a a;

        public Float a(com.qihoo.security.widget.material.a a1)
        {
            return Float.valueOf(com.qihoo.security.widget.material.a.e(a1));
        }

        public volatile Object a(Object obj)
        {
            return a((com.qihoo.security.widget.material.a)obj);
        }

        public void a(com.qihoo.security.widget.material.a a1, Float float1)
        {
            a1.a(float1.floatValue());
        }

        public volatile void a(Object obj, Object obj1)
        {
            a((com.qihoo.security.widget.material.a)obj, (Float)obj1);
        }

            
            {
                a = com.qihoo.security.widget.material.a.this;
                super(class1, s1);
            }
    };
    private final com.nineoldandroids.util.c E = new com.nineoldandroids.util.c(java/lang/Integer, "rippleAlpha") {

        final com.qihoo.security.widget.material.a a;

        public Integer a(com.qihoo.security.widget.material.a a1)
        {
            return Integer.valueOf(a1.a());
        }

        public volatile Object a(Object obj)
        {
            return a((com.qihoo.security.widget.material.a)obj);
        }

        public void a(com.qihoo.security.widget.material.a a1, Integer integer)
        {
            a1.a(integer);
        }

        public volatile void a(Object obj, Object obj1)
        {
            a((com.qihoo.security.widget.material.a)obj, (Integer)obj1);
        }

            
            {
                a = com.qihoo.security.widget.material.a.this;
                super(class1, s1);
            }
    };
    private View a;
    private final Paint b = new Paint(1);
    private final Rect c = new Rect();
    private int d;
    private boolean e;
    private boolean f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private int k;
    private boolean l;
    private Drawable m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private float r;
    private AdapterView s;
    private c t;
    private k u;
    private final Point v = new Point();
    private Point w;
    private boolean x;
    private boolean y;
    private int z;

    public com.qihoo.security.widget.material.a()
    {
        w = new Point();
    }

    static float a(Resources resources, float f1)
    {
        return TypedValue.applyDimension(1, f1, resources.getDisplayMetrics());
    }

    static View a(com.qihoo.security.widget.material.a a1)
    {
        return a1.a;
    }

    private void a(Runnable runnable)
    {
        if (x)
        {
            return;
        }
        float f1 = f();
        e();
        t = new c();
        t.a(new com.nineoldandroids.a.b(runnable) {

            final Runnable a;
            final com.qihoo.security.widget.material.a b;

            public void b(com.nineoldandroids.a.a a1)
            {
                if (!com.qihoo.security.widget.material.a.b(b))
                {
                    b.a(0.0F);
                    b.a(Integer.valueOf(com.qihoo.security.widget.material.a.c(b)));
                }
                if (a != null && com.qihoo.security.widget.material.a.d(b))
                {
                    a.run();
                }
                com.qihoo.security.widget.material.a.a(b).setPressed(false);
            }

            
            {
                b = com.qihoo.security.widget.material.a.this;
                a = runnable;
                super();
            }
        });
        runnable = com.nineoldandroids.a.k.a(this, D, new float[] {
            r, f1
        });
        runnable.c(h);
        runnable.a(new DecelerateInterpolator());
        k k1 = com.nineoldandroids.a.k.a(this, E, new int[] {
            i, 0
        });
        k1.c(k);
        k1.a(new AccelerateInterpolator());
        k1.a(h - k - 50);
        if (l)
        {
            t.a(runnable);
        } else
        if (j() > f1)
        {
            k1.a(0L);
            t.a(k1);
        } else
        {
            t.a(new com.nineoldandroids.a.a[] {
                runnable, k1
            });
        }
        t.a();
    }

    static boolean a(com.qihoo.security.widget.material.a a1, boolean flag)
    {
        a1.y = flag;
        return flag;
    }

    private Resources b()
    {
        return B.getResources();
    }

    private void b(Canvas canvas)
    {
        if (a instanceof com.qihoo.security.widget.material.b)
        {
            ((com.qihoo.security.widget.material.b)a).a(canvas);
        }
    }

    static boolean b(com.qihoo.security.widget.material.a a1)
    {
        return a1.l;
    }

    static int c(com.qihoo.security.widget.material.a a1)
    {
        return a1.i;
    }

    private void c()
    {
        if (A != null)
        {
            a.removeCallbacks(A);
            y = false;
        }
    }

    private void d()
    {
        if (x)
        {
            return;
        }
        if (u != null)
        {
            u.b();
        }
        float f1 = (float)(Math.sqrt(Math.pow(a.getWidth(), 2D) + Math.pow(a.getHeight(), 2D)) * 1.2000000476837158D);
        u = com.nineoldandroids.a.k.a(this, D, new float[] {
            (float)g, f1
        }).c(0L);
        u.a(new LinearInterpolator());
        u.a();
    }

    static boolean d(com.qihoo.security.widget.material.a a1)
    {
        return a1.j;
    }

    static float e(com.qihoo.security.widget.material.a a1)
    {
        return a1.j();
    }

    private void e()
    {
        if (t != null)
        {
            t.b();
            t.g();
        }
        if (u != null)
        {
            u.b();
        }
    }

    private float f()
    {
        int i1 = a.getWidth();
        int j1 = a.getHeight();
        int k1 = i1 / 2;
        int l1 = j1 / 2;
        double d1;
        float f1;
        float f2;
        if (k1 > v.x)
        {
            f1 = i1 - v.x;
        } else
        {
            f1 = v.x;
        }
        if (l1 > v.y)
        {
            f2 = j1 - v.y;
        } else
        {
            f2 = v.y;
        }
        d1 = Math.pow(f1, 2D);
        return (float)Math.sqrt(Math.pow(f2, 2D) + d1) * 1.2F;
    }

    static boolean f(com.qihoo.security.widget.material.a a1)
    {
        return a1.f;
    }

    private AdapterView g()
    {
        if (s != null)
        {
            return s;
        }
        ViewParent viewparent = a.getParent();
        do
        {
            if (viewparent instanceof AdapterView)
            {
                s = (AdapterView)viewparent;
                return s;
            }
            try
            {
                viewparent = viewparent.getParent();
            }
            catch (NullPointerException nullpointerexception)
            {
                throw new RuntimeException("Could not find a parent AdapterView");
            }
        } while (true);
    }

    static void g(com.qihoo.security.widget.material.a a1)
    {
        a1.d();
    }

    static android.view.View.OnClickListener h(com.qihoo.security.widget.material.a a1)
    {
        return a1.C;
    }

    private void h()
    {
        if (n)
        {
            z = g().getPositionForView(a);
        }
    }

    private boolean i()
    {
        if (n)
        {
            int i1 = g().getPositionForView(a);
            boolean flag;
            if (i1 != z)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            z = i1;
            if (flag)
            {
                c();
                e();
                a.setPressed(false);
                a(0.0F);
            }
            return flag;
        } else
        {
            return false;
        }
    }

    private float j()
    {
        return r;
    }

    public int a()
    {
        return b.getAlpha();
    }

    public void a(float f1)
    {
        r = f1;
        a.invalidate();
    }

    protected void a(int i1, int j1, int k1, int l1)
    {
        c.set(0, 0, i1, j1);
        m.setBounds(c);
    }

    public void a(Context context, AttributeSet attributeset, int i1, View view)
    {
        B = context;
        a = view;
        a.setWillNotDraw(false);
        context = context.obtainStyledAttributes(attributeset, com.qihoo.security.lite.a.MaterialRippleLayout);
        d = context.getColor(0, 0xff000000);
        g = context.getDimensionPixelSize(1, (int)a(b(), 35F));
        e = context.getBoolean(2, true);
        f = context.getBoolean(6, true);
        h = context.getInt(4, 150);
        h = 0;
        i = (int)(255F * context.getFloat(3, 0.1F));
        j = context.getBoolean(8, true);
        k = context.getInteger(5, 50);
        m = new ColorDrawable(context.getColor(7, 0));
        l = context.getBoolean(9, false);
        o = context.getBoolean(11, false);
        p = context.getBoolean(12, false);
        q = context.getBoolean(13, false);
        context.recycle();
        b.setColor(d);
        b.setAlpha(i);
    }

    public void a(Canvas canvas)
    {
        boolean flag = i();
        if (e)
        {
            if (!flag)
            {
                m.draw(canvas);
            }
            b(canvas);
            if (!flag)
            {
                canvas.drawCircle(v.x, v.y, r, b);
            }
            return;
        }
        if (!flag)
        {
            m.draw(canvas);
            canvas.drawCircle(v.x, v.y, r, b);
        }
        b(canvas);
    }

    public void a(android.view.View.OnClickListener onclicklistener)
    {
        C = onclicklistener;
    }

    public void a(Integer integer)
    {
        b.setAlpha(integer.intValue());
        a.invalidate();
    }

    public boolean a(MotionEvent motionevent, boolean flag, boolean flag1)
    {
        if (!flag1)
        {
            return flag;
        }
        flag = c.contains((int)motionevent.getX(), (int)motionevent.getY());
        if (flag)
        {
            w.set(v.x, v.y);
            v.set((int)motionevent.getX(), (int)motionevent.getY());
        }
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 100
    //                   0 161
    //                   1 102
    //                   2 268
    //                   3 192;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return true;
_L3:
        if (y)
        {
            a.setPressed(true);
            a.postDelayed(new Runnable() {

                final com.qihoo.security.widget.material.a a;

                public void run()
                {
                    com.qihoo.security.widget.material.a.a(a).setPressed(false);
                }

            
            {
                a = com.qihoo.security.widget.material.a.this;
                super();
            }
            }, ViewConfiguration.getPressedStateDuration());
        }
        if (flag)
        {
            a(((Runnable) (new a())));
        }
        c();
        continue; /* Loop/switch isn't completed */
_L2:
        h();
        x = false;
        a.setPressed(true);
        if (f)
        {
            d();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (n)
        {
            v.set(w.x, w.y);
            w = new Point();
        }
        if (f)
        {
            if (!y)
            {
                a(((Runnable) (null)));
            }
        } else
        {
            a.setPressed(false);
        }
        c();
        continue; /* Loop/switch isn't completed */
_L4:
        if (f)
        {
            if (!flag || x)
            {
                break; /* Loop/switch isn't completed */
            }
            a.invalidate();
        }
_L8:
        if (!flag)
        {
            c();
            if (u != null)
            {
                u.b();
            }
            x = true;
        }
        if (true) goto _L1; else goto _L6
_L6:
        if (flag) goto _L8; else goto _L7
_L7:
        a(((Runnable) (null)));
          goto _L8
    }
}
