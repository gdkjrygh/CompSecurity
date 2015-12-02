// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.widget;

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
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import com.nineoldandroids.a.a;
import com.nineoldandroids.a.c;
import com.nineoldandroids.a.k;

public class MaterialRippleLayout extends FrameLayout
{
    private class a
        implements Runnable
    {

        final MaterialRippleLayout a;

        private void a(AdapterView adapterview)
        {
            int i1 = adapterview.getPositionForView(a);
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
                adapterview.performItemClick(a, i1, l1);
            }
        }

        public void run()
        {
            if (a.getParent() instanceof AdapterView)
            {
                a((AdapterView)a.getParent());
            } else
            {
                if (MaterialRippleLayout.f(a))
                {
                    a(MaterialRippleLayout.g(a));
                    return;
                }
                if (!MaterialRippleLayout.h(a))
                {
                    com.qihoo.security.widget.MaterialRippleLayout.a(a).performClick();
                    return;
                }
            }
        }

        private a()
        {
            a = MaterialRippleLayout.this;
            super();
        }

    }

    private final class b
        implements Runnable
    {

        final MaterialRippleLayout a;
        private final MotionEvent b;

        public void run()
        {
            com.qihoo.security.widget.MaterialRippleLayout.a(a, false);
            com.qihoo.security.widget.MaterialRippleLayout.a(a).onTouchEvent(b);
            com.qihoo.security.widget.MaterialRippleLayout.a(a).setPressed(true);
            if (MaterialRippleLayout.i(a))
            {
                MaterialRippleLayout.j(a);
            }
        }
    }


    private GestureDetector A;
    private a B;
    private b C;
    private final android.view.GestureDetector.SimpleOnGestureListener D;
    private final com.nineoldandroids.util.c E;
    private final com.nineoldandroids.util.c F;
    private final Paint a;
    private final Rect b;
    private int c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private boolean i;
    private int j;
    private boolean k;
    private Drawable l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;
    private float q;
    private AdapterView r;
    private View s;
    private c t;
    private k u;
    private final Point v;
    private Point w;
    private boolean x;
    private boolean y;
    private int z;

    public MaterialRippleLayout(Context context)
    {
        this(context, null, 0);
    }

    public MaterialRippleLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MaterialRippleLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = new Paint(1);
        b = new Rect();
        v = new Point();
        w = new Point();
        D = new android.view.GestureDetector.SimpleOnGestureListener() {

            final MaterialRippleLayout a;

            public void onLongPress(MotionEvent motionevent)
            {
                a.performLongClick();
            }

            
            {
                a = MaterialRippleLayout.this;
                super();
            }
        };
        E = new com.nineoldandroids.util.c(java/lang/Float, "radius") {

            final MaterialRippleLayout a;

            public Float a(MaterialRippleLayout materialripplelayout)
            {
                return Float.valueOf(MaterialRippleLayout.e(materialripplelayout));
            }

            public volatile Object a(Object obj)
            {
                return a((MaterialRippleLayout)obj);
            }

            public void a(MaterialRippleLayout materialripplelayout, Float float1)
            {
                materialripplelayout.setRadius(float1.floatValue());
            }

            public volatile void a(Object obj, Object obj1)
            {
                a((MaterialRippleLayout)obj, (Float)obj1);
            }

            
            {
                a = MaterialRippleLayout.this;
                super(class1, s1);
            }
        };
        F = new com.nineoldandroids.util.c(java/lang/Integer, "rippleAlpha") {

            final MaterialRippleLayout a;

            public Integer a(MaterialRippleLayout materialripplelayout)
            {
                return Integer.valueOf(materialripplelayout.getRippleAlpha());
            }

            public volatile Object a(Object obj)
            {
                return a((MaterialRippleLayout)obj);
            }

            public void a(MaterialRippleLayout materialripplelayout, Integer integer)
            {
                materialripplelayout.setRippleAlpha(integer);
            }

            public volatile void a(Object obj, Object obj1)
            {
                a((MaterialRippleLayout)obj, (Integer)obj1);
            }

            
            {
                a = MaterialRippleLayout.this;
                super(class1, s1);
            }
        };
        setWillNotDraw(false);
        context = context.obtainStyledAttributes(attributeset, com.qihoo.security.lite.a.a.MaterialRippleLayout);
        c = context.getColor(0, 0xff000000);
        f = context.getDimensionPixelSize(1, (int)a(getResources(), 35F));
        d = context.getBoolean(2, true);
        e = context.getBoolean(6, true);
        g = context.getInt(4, 150);
        h = (int)(255F * context.getFloat(3, 0.1F));
        i = context.getBoolean(8, true);
        j = context.getInteger(5, 50);
        l = new ColorDrawable(context.getColor(7, 0));
        k = context.getBoolean(9, false);
        n = context.getBoolean(11, false);
        o = context.getBoolean(12, false);
        p = context.getBoolean(13, false);
        context.recycle();
        a.setColor(c);
        a.setAlpha(h);
    }

    static float a(Resources resources, float f1)
    {
        return TypedValue.applyDimension(1, f1, resources.getDisplayMetrics());
    }

    static View a(MaterialRippleLayout materialripplelayout)
    {
        return materialripplelayout.s;
    }

    private void a()
    {
        if (A == null)
        {
            A = new GestureDetector(getContext(), D);
        }
    }

    private void a(Runnable runnable)
    {
        if (x)
        {
            return;
        }
        float f1 = getEndRadius();
        d();
        t = new c();
        t.a(new com.nineoldandroids.a.b(runnable) {

            final Runnable a;
            final MaterialRippleLayout b;

            public void b(com.nineoldandroids.a.a a1)
            {
                if (!MaterialRippleLayout.b(b))
                {
                    b.setRadius(0.0F);
                    b.setRippleAlpha(Integer.valueOf(com.qihoo.security.widget.MaterialRippleLayout.c(b)));
                }
                if (a != null && MaterialRippleLayout.d(b))
                {
                    a.run();
                }
                com.qihoo.security.widget.MaterialRippleLayout.a(b).setPressed(false);
            }

            
            {
                b = MaterialRippleLayout.this;
                a = runnable;
                super();
            }
        });
        runnable = com.nineoldandroids.a.k.a(this, E, new float[] {
            q, f1
        });
        runnable.c(g);
        runnable.a(new DecelerateInterpolator());
        k k1 = com.nineoldandroids.a.k.a(this, F, new int[] {
            h, 0
        });
        k1.c(j);
        k1.a(new AccelerateInterpolator());
        k1.a(g - j - 50);
        if (k)
        {
            t.a(runnable);
        } else
        if (getRadius() > f1)
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

    static boolean a(MaterialRippleLayout materialripplelayout, boolean flag)
    {
        materialripplelayout.y = flag;
        return flag;
    }

    private void b()
    {
        if (C != null)
        {
            removeCallbacks(C);
            y = false;
        }
    }

    static boolean b(MaterialRippleLayout materialripplelayout)
    {
        return materialripplelayout.k;
    }

    static int c(MaterialRippleLayout materialripplelayout)
    {
        return materialripplelayout.h;
    }

    private void c()
    {
        if (x)
        {
            return;
        }
        if (u != null)
        {
            u.b();
        }
        float f1 = (float)(Math.sqrt(Math.pow(getWidth(), 2D) + Math.pow(getHeight(), 2D)) * 1.2000000476837158D);
        u = com.nineoldandroids.a.k.a(this, E, new float[] {
            (float)f, f1
        }).c(0L);
        u.a(new LinearInterpolator());
        u.a();
    }

    private void d()
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

    static boolean d(MaterialRippleLayout materialripplelayout)
    {
        return materialripplelayout.i;
    }

    static float e(MaterialRippleLayout materialripplelayout)
    {
        return materialripplelayout.getRadius();
    }

    private AdapterView e()
    {
        if (r != null)
        {
            return r;
        }
        ViewParent viewparent = getParent();
        do
        {
            if (viewparent instanceof AdapterView)
            {
                r = (AdapterView)viewparent;
                return r;
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

    private void f()
    {
        if (m)
        {
            z = e().getPositionForView(this);
        }
    }

    static boolean f(MaterialRippleLayout materialripplelayout)
    {
        return materialripplelayout.m;
    }

    static AdapterView g(MaterialRippleLayout materialripplelayout)
    {
        return materialripplelayout.e();
    }

    private boolean g()
    {
        if (m)
        {
            int i1 = e().getPositionForView(this);
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
                b();
                d();
                s.setPressed(false);
                setRadius(0.0F);
            }
            return flag;
        } else
        {
            return false;
        }
    }

    private float getEndRadius()
    {
        int i1 = getWidth();
        int j1 = getHeight();
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

    private float getRadius()
    {
        return q;
    }

    static boolean h(MaterialRippleLayout materialripplelayout)
    {
        return materialripplelayout.p;
    }

    static boolean i(MaterialRippleLayout materialripplelayout)
    {
        return materialripplelayout.e;
    }

    static void j(MaterialRippleLayout materialripplelayout)
    {
        materialripplelayout.c();
    }

    public final void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (getChildCount() > 0)
        {
            throw new IllegalStateException("MaterialRippleLayout can host only one child");
        } else
        {
            s = view;
            super.addView(view, i1, layoutparams);
            return;
        }
    }

    public void draw(Canvas canvas)
    {
        boolean flag = g();
        if (d)
        {
            if (!flag)
            {
                l.draw(canvas);
            }
            super.draw(canvas);
            if (!flag)
            {
                canvas.drawCircle(v.x, v.y, q, a);
            }
            return;
        }
        if (!flag)
        {
            l.draw(canvas);
            canvas.drawCircle(v.x, v.y, q, a);
        }
        super.draw(canvas);
    }

    public View getChildView()
    {
        return s;
    }

    public int getRippleAlpha()
    {
        return a.getAlpha();
    }

    public boolean isInEditMode()
    {
        return true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (!n)
        {
            if (o)
            {
                super.onTouchEvent(motionevent);
            } else
            {
                onTouchEvent(motionevent);
            }
        }
        return n;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        b.set(0, 0, i1, j1);
        l.setBounds(b);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = super.onTouchEvent(motionevent);
        if (isEnabled() && s.isEnabled()) goto _L2; else goto _L1
_L1:
        return flag;
_L2:
        boolean flag2;
        flag2 = b.contains((int)motionevent.getX(), (int)motionevent.getY());
        if (flag2)
        {
            w.set(v.x, v.y);
            v.set((int)motionevent.getX(), (int)motionevent.getY());
        }
        a();
        flag = flag1;
        if (A.onTouchEvent(motionevent))
        {
            continue; /* Loop/switch isn't completed */
        }
        switch (motionevent.getActionMasked())
        {
        default:
            return true;

        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 0: // '\0'
            f();
            x = false;
            s.onTouchEvent(motionevent);
            s.setPressed(true);
            flag = flag1;
            if (e)
            {
                c();
                return true;
            }
            break;

        case 1: // '\001'
            B = new a();
            if (y)
            {
                s.setPressed(true);
                postDelayed(new Runnable() {

                    final MaterialRippleLayout a;

                    public void run()
                    {
                        com.qihoo.security.widget.MaterialRippleLayout.a(a).setPressed(false);
                    }

            
            {
                a = MaterialRippleLayout.this;
                super();
            }
                }, ViewConfiguration.getPressedStateDuration());
            }
            if (flag2)
            {
                a(B);
            } else
            if (!e)
            {
                setRadius(0.0F);
            }
            if (!i && flag2)
            {
                B.run();
            }
            b();
            return true;

        case 3: // '\003'
            if (m)
            {
                v.set(w.x, w.y);
                w = new Point();
            }
            s.onTouchEvent(motionevent);
            if (e)
            {
                if (!y)
                {
                    a(((Runnable) (null)));
                }
            } else
            {
                s.setPressed(false);
            }
            b();
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (e)
        {
            if (flag2 && !x)
            {
                invalidate();
            } else
            if (!flag2)
            {
                a(((Runnable) (null)));
            }
        }
        flag = flag1;
        if (!flag2)
        {
            b();
            if (u != null)
            {
                u.b();
            }
            s.onTouchEvent(motionevent);
            x = true;
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void setAvoidTwiceTouch(boolean flag)
    {
        p = flag;
    }

    public void setDefaultRippleAlpha(int i1)
    {
        h = i1;
        a.setAlpha(i1);
        invalidate();
    }

    public void setInterceptTouchEvent(boolean flag)
    {
        n = flag;
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        if (s == null)
        {
            throw new IllegalStateException("MaterialRippleLayout must have a child view to handle clicks");
        } else
        {
            s.setOnClickListener(onclicklistener);
            return;
        }
    }

    public void setRadius(float f1)
    {
        q = f1;
        invalidate();
    }

    public void setRippleAlpha(Integer integer)
    {
        a.setAlpha(integer.intValue());
        invalidate();
    }

    public void setRippleBackground(int i1)
    {
        l = new ColorDrawable(i1);
        l.setBounds(b);
        invalidate();
    }

    public void setRippleColor(int i1)
    {
        c = i1;
        a.setColor(i1);
        a.setAlpha(h);
        invalidate();
    }

    public void setRippleDelayClick(boolean flag)
    {
        i = flag;
    }

    public void setRippleDiameter(int i1)
    {
        f = i1;
    }

    public void setRippleDuration(int i1)
    {
        g = i1;
    }

    public void setRippleFadeDuration(int i1)
    {
        j = i1;
    }

    public void setRippleHover(boolean flag)
    {
        e = flag;
    }

    public void setRippleInAdapter(boolean flag)
    {
        m = flag;
    }

    public void setRippleOverlay(boolean flag)
    {
        d = flag;
    }

    public void setRipplePersistent(boolean flag)
    {
        k = flag;
    }

    public void setSuperTouchEvent(boolean flag)
    {
        o = flag;
    }
}
