// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.pandora.radio.util.d;

public class SlidingDrawer extends ViewGroup
{
    private class a
        implements android.view.View.OnClickListener
    {

        final SlidingDrawer a;

        public void onClick(View view)
        {
            if (SlidingDrawer.a(a))
            {
                return;
            }
            if (SlidingDrawer.b(a))
            {
                a.b();
                return;
            } else
            {
                a.a();
                return;
            }
        }

        private a()
        {
            a = SlidingDrawer.this;
            super();
        }

    }

    public static interface b
    {

        public abstract void f();
    }

    public static interface c
    {

        public abstract void g();
    }

    public static interface d
    {

        public abstract void a(float f1);

        public abstract void h();

        public abstract void i();
    }

    private class e extends Handler
    {

        final SlidingDrawer a;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return;

            case 1000: 
                SlidingDrawer.c(a);
                break;
            }
        }

        private e()
        {
            a = SlidingDrawer.this;
            super();
        }

    }


    private boolean A;
    private boolean B;
    private boolean C;
    private final int D;
    private final int E;
    private final int F;
    private final int G;
    private final int H;
    private final int I;
    private final int J;
    private float K;
    private float L;
    private final int a;
    private final int b;
    private View c;
    private View d;
    private final Rect e;
    private final Rect f;
    private boolean g;
    private boolean h;
    private VelocityTracker i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private c q;
    private b r;
    private d s;
    private final Handler t;
    private float u;
    private float v;
    private float w;
    private long x;
    private long y;
    private int z;

    public SlidingDrawer(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SlidingDrawer(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        e = new Rect();
        f = new Rect();
        t = new e();
        context = context.obtainStyledAttributes(attributeset, com.pandora.android.R.styleable.SlidingDrawer, i1, 0);
        boolean flag;
        if (context.getInt(2, 1) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        l = (int)context.getDimension(3, 0.0F);
        m = (int)context.getDimension(4, 0.0F);
        B = context.getBoolean(5, true);
        C = context.getBoolean(6, true);
        i1 = context.getResourceId(0, 0);
        if (i1 == 0)
        {
            throw new IllegalArgumentException("The handle attribute is required and must refer to a valid child.");
        }
        int j1 = context.getResourceId(1, 0);
        if (j1 == 0)
        {
            throw new IllegalArgumentException("The content attribute is required and must refer to a valid child.");
        }
        if (i1 == j1)
        {
            throw new IllegalArgumentException("The content and handle attributes must refer to different children.");
        } else
        {
            a = i1;
            b = j1;
            float f1 = getResources().getDisplayMetrics().density;
            D = (int)(6F * f1 + 0.5F);
            E = (int)(100F * f1 + 0.5F);
            F = (int)(150F * f1 + 0.5F);
            G = (int)(200F * f1 + 0.5F);
            H = (int)(2000F * f1 + 0.5F);
            I = (int)(f1 * 1000F + 0.5F);
            J = ViewConfiguration.get(getContext()).getScaledTouchSlop();
            context.recycle();
            setAlwaysDrawnWithCacheEnabled(false);
            return;
        }
    }

    private void a(int i1)
    {
        c(i1);
        a(i1, H, true);
    }

    private void a(int i1, float f1, boolean flag)
    {
        w = i1;
        v = f1;
        if (!k) goto _L2; else goto _L1
_L1:
        if (flag || f1 > (float)G) goto _L4; else goto _L3
_L3:
        int l1 = m;
        int j1;
        long l2;
        if (j)
        {
            j1 = n;
        } else
        {
            j1 = o;
        }
        if (i1 <= j1 + l1 || f1 <= (float)(-G)) goto _L5; else goto _L4
_L4:
        u = H;
        if (f1 < 0.0F)
        {
            v = 0.0F;
        }
_L7:
        l2 = SystemClock.uptimeMillis();
        x = l2;
        y = l2 + 16L;
        A = true;
        t.removeMessages(1000);
        t.sendMessageAtTime(t.obtainMessage(1000), y);
        i();
        return;
_L5:
        u = -H;
        if (f1 > 0.0F)
        {
            v = 0.0F;
        }
        continue; /* Loop/switch isn't completed */
_L2:
label0:
        {
            if (flag)
            {
                break label0;
            }
            if (f1 <= (float)G)
            {
                int k1;
                if (j)
                {
                    k1 = getHeight();
                } else
                {
                    k1 = getWidth();
                }
                if (i1 <= k1 / 2 || f1 <= (float)(-G))
                {
                    break label0;
                }
            }
            u = H;
            if (f1 < 0.0F)
            {
                v = 0.0F;
            }
            continue; /* Loop/switch isn't completed */
        }
        u = -H;
        if (f1 > 0.0F)
        {
            v = 0.0F;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void a(View view)
    {
        view.getViewTreeObserver().dispatchOnPreDraw();
        if (!view.isHardwareAccelerated())
        {
            view.buildDrawingCache();
        }
    }

    static boolean a(SlidingDrawer slidingdrawer)
    {
        return slidingdrawer.h;
    }

    private void b(int i1)
    {
        c(i1);
        a(i1, -H, true);
    }

    static boolean b(SlidingDrawer slidingdrawer)
    {
        return slidingdrawer.C;
    }

    private void c(int i1)
    {
        g = true;
        i = VelocityTracker.obtain();
        int j1;
        if (!k)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 != 0)
        {
            u = H;
            v = G;
            j1 = l;
            long l1;
            if (j)
            {
                i1 = getHeight() - n;
            } else
            {
                i1 = getWidth() - o;
            }
            w = i1 + j1;
            d((int)w);
            A = true;
            t.removeMessages(1000);
            l1 = SystemClock.uptimeMillis();
            x = l1;
            y = l1 + 16L;
            A = true;
            return;
        }
        if (A)
        {
            A = false;
            t.removeMessages(1000);
        }
        d(i1);
    }

    static void c(SlidingDrawer slidingdrawer)
    {
        slidingdrawer.j();
    }

    private void d(int i1)
    {
        View view = c;
        if (!j) goto _L2; else goto _L1
_L1:
        if (i1 != -10001) goto _L4; else goto _L3
_L3:
        view.offsetTopAndBottom(m - view.getTop());
        invalidate();
_L6:
        return;
_L4:
        int j1;
        int k1;
        if (i1 == -10002)
        {
            view.offsetTopAndBottom((l + getBottom()) - getTop() - n - view.getTop());
            invalidate();
            return;
        }
        k1 = view.getTop();
        j1 = i1 - k1;
        if (i1 >= m)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = m - k1;
_L7:
        view.offsetTopAndBottom(i1);
        Rect rect = e;
        Rect rect2 = f;
        view.getHitRect(rect);
        rect2.set(rect);
        rect2.union(rect.left, rect.top - i1, rect.right, rect.bottom - i1);
        rect2.union(0, rect.bottom - i1, getWidth(), (rect.bottom - i1) + d.getHeight());
        invalidate(rect2);
        if (p != 0)
        {
            float f1 = (float)(p - view.getTop() - getTop()) / (float)p;
            if (s != null && com.pandora.radio.util.d.d(f1, 1.0D) && com.pandora.radio.util.d.b(f1, 0.0D))
            {
                s.a(f1);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        i1 = j1;
        if (j1 > (l + getBottom()) - getTop() - n - k1)
        {
            i1 = (l + getBottom()) - getTop() - n - k1;
        }
          goto _L7
        if (true) goto _L6; else goto _L2
_L2:
        if (i1 == -10001)
        {
            view.offsetLeftAndRight(m - view.getLeft());
            invalidate();
            return;
        }
        if (i1 == -10002)
        {
            view.offsetLeftAndRight((l + getRight()) - getLeft() - o - view.getLeft());
            invalidate();
            return;
        }
        k1 = view.getLeft();
        j1 = i1 - k1;
        if (i1 >= m) goto _L9; else goto _L8
_L8:
        i1 = m - k1;
_L11:
        view.offsetLeftAndRight(i1);
        Rect rect1 = e;
        Rect rect3 = f;
        view.getHitRect(rect1);
        rect3.set(rect1);
        rect3.union(rect1.left - i1, rect1.top, rect1.right - i1, rect1.bottom);
        rect3.union(rect1.right - i1, 0, (rect1.right - i1) + d.getWidth(), getHeight());
        invalidate(rect3);
        return;
_L9:
        i1 = j1;
        if (j1 > (l + getRight()) - getLeft() - o - k1)
        {
            i1 = (l + getRight()) - getLeft() - o - k1;
        }
        if (true) goto _L11; else goto _L10
_L10:
    }

    private void h()
    {
        if (A)
        {
            return;
        }
        View view = d;
        if (view.isLayoutRequested())
        {
            if (j)
            {
                int i1 = n;
                int k1 = getBottom();
                int l1 = getTop();
                int i2 = m;
                view.measure(android.view.View.MeasureSpec.makeMeasureSpec(getRight() - getLeft(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k1 - l1 - i1 - i2, 0x40000000));
                view.layout(0, m + i1, view.getMeasuredWidth(), i1 + m + view.getMeasuredHeight());
            } else
            {
                int j1 = c.getWidth();
                view.measure(android.view.View.MeasureSpec.makeMeasureSpec(getRight() - getLeft() - j1 - m, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(getBottom() - getTop(), 0x40000000));
                view.layout(m + j1, 0, j1 + m + view.getMeasuredWidth(), view.getMeasuredHeight());
            }
        }
        a(view);
        view.setVisibility(8);
    }

    private void i()
    {
        c.setPressed(false);
        g = false;
        if (s != null)
        {
            s.i();
        }
        if (i != null)
        {
            i.recycle();
            i = null;
        }
    }

    private void j()
    {
label0:
        {
            if (A)
            {
                k();
                float f1 = w;
                int j1 = l;
                int i1;
                if (j)
                {
                    i1 = getHeight();
                } else
                {
                    i1 = getWidth();
                }
                if (f1 < (float)((i1 + j1) - 1))
                {
                    break label0;
                }
                A = false;
                l();
            }
            return;
        }
        if (w < (float)m)
        {
            A = false;
            m();
            return;
        } else
        {
            d((int)w);
            y = y + 16L;
            t.sendMessageAtTime(t.obtainMessage(1000), y);
            return;
        }
    }

    private void k()
    {
        long l1 = SystemClock.uptimeMillis();
        float f1 = (float)(l1 - x) / 1000F;
        float f2 = w;
        float f3 = v;
        float f4 = u;
        w = f2 + f3 * f1 + 0.5F * f4 * f1 * f1;
        v = f1 * f4 + f3;
        x = l1;
    }

    private void l()
    {
        d(-10002);
        d.setVisibility(8);
        d.destroyDrawingCache();
        if (s != null)
        {
            s.a(0.0F);
        }
        if (!g())
        {
            return;
        }
        if (r != null)
        {
            r.f();
        }
        k = false;
    }

    private void m()
    {
        d(-10001);
        d.setVisibility(0);
        if (s != null)
        {
            s.a(1.0F);
        }
        if (g())
        {
            return;
        }
        if (q != null)
        {
            q.g();
        }
        k = true;
    }

    public void a()
    {
        if (!k)
        {
            m();
        } else
        {
            l();
        }
        invalidate();
        requestLayout();
    }

    public void b()
    {
        if (!k)
        {
            e();
            return;
        } else
        {
            d();
            return;
        }
    }

    public void c()
    {
        l();
        invalidate();
        requestLayout();
    }

    public void d()
    {
        h();
        d d1 = s;
        if (d1 != null)
        {
            d1.h();
        }
        int i1;
        if (j)
        {
            i1 = c.getTop();
        } else
        {
            i1 = c.getLeft();
        }
        a(i1);
        if (d1 != null)
        {
            d1.i();
        }
    }

    protected void dispatchDraw(Canvas canvas)
    {
        float f2;
        View view;
        long l1;
        boolean flag;
        f2 = 0.0F;
        l1 = getDrawingTime();
        view = c;
        flag = j;
        drawChild(canvas, view, l1);
        if (!g && !A) goto _L2; else goto _L1
_L1:
        android.graphics.Bitmap bitmap = d.getDrawingCache();
        if (bitmap == null) goto _L4; else goto _L3
_L3:
        if (!flag) goto _L6; else goto _L5
_L5:
        canvas.drawBitmap(bitmap, 0.0F, view.getBottom(), null);
_L8:
        return;
_L6:
        canvas.drawBitmap(bitmap, view.getRight(), 0.0F, null);
        return;
_L4:
        canvas.save();
        float f1;
        if (flag)
        {
            f1 = 0.0F;
        } else
        {
            f1 = view.getLeft() - m;
        }
        if (flag)
        {
            f2 = view.getTop() - m;
        }
        canvas.translate(f1, f2);
        drawChild(canvas, d, l1);
        canvas.restore();
        return;
_L2:
        if (k)
        {
            drawChild(canvas, d, l1);
            return;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void e()
    {
        h();
        d d1 = s;
        if (d1 != null)
        {
            d1.h();
        }
        int i1;
        if (j)
        {
            i1 = c.getTop();
        } else
        {
            i1 = c.getLeft();
        }
        b(i1);
        sendAccessibilityEvent(32);
        if (d1 != null)
        {
            d1.i();
        }
    }

    public void f()
    {
        h = true;
    }

    public boolean g()
    {
        return k;
    }

    public View getContent()
    {
        return d;
    }

    public View getHandle()
    {
        return c;
    }

    protected void onFinishInflate()
    {
        c = findViewById(a);
        if (c == null)
        {
            throw new IllegalArgumentException("The handle attribute is must refer to an existing child.");
        }
        c.setOnClickListener(new a());
        d = findViewById(b);
        if (d == null)
        {
            throw new IllegalArgumentException("The content attribute is must refer to an existing child.");
        } else
        {
            d.setVisibility(8);
            return;
        }
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(com/pandora/android/view/SlidingDrawer.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName(com/pandora/android/view/SlidingDrawer.getName());
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        float f2;
        float f3;
        View view;
        int i1;
        if (h)
        {
            return false;
        }
        i1 = motionevent.getActionMasked();
        if (i1 == 3 || i1 == 1)
        {
            g = false;
            return false;
        }
        f2 = motionevent.getX();
        f3 = motionevent.getY();
        Rect rect = e;
        view = c;
        view.getHitRect(rect);
        if (!g && !rect.contains((int)f2, (int)f3))
        {
            return false;
        }
        i1;
        JVM INSTR tableswitch 0 2: default 116
    //                   0 118
    //                   1 116
    //                   2 132;
           goto _L1 _L2 _L1 _L3
_L1:
        return false;
_L2:
        K = f2;
        L = f3;
        continue; /* Loop/switch isn't completed */
_L3:
        if (g)
        {
            return true;
        }
        float f1;
        if (j)
        {
            f1 = Math.abs(f3 - L);
        } else
        {
            f1 = Math.abs(f2 - K);
        }
        if (f1 > (float)J)
        {
            K = f2;
            L = f3;
            g = true;
            view.setPressed(true);
            h();
            if (s != null)
            {
                s.h();
            }
            if (j)
            {
                int j1 = c.getTop();
                z = (int)f3 - j1;
                c(j1);
            } else
            {
                int k1 = c.getLeft();
                z = (int)f2 - k1;
                c(k1);
            }
            i.addMovement(motionevent);
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        if (g)
        {
            return;
        }
        i1 = k1 - i1;
        j1 = l1 - j1;
        View view = c;
        l1 = view.getMeasuredWidth();
        int i2 = view.getMeasuredHeight();
        View view1 = d;
        if (j)
        {
            k1 = (i1 - l1) / 2;
            if (k)
            {
                i1 = m;
            } else
            {
                i1 = (j1 - i2) + l;
            }
            view1.layout(0, m + i2, view1.getMeasuredWidth(), m + i2 + view1.getMeasuredHeight());
            j1 = i1;
        } else
        {
            if (k)
            {
                i1 = m;
            } else
            {
                i1 = (i1 - l1) + l;
            }
            j1 = (j1 - i2) / 2;
            view1.layout(m + l1, 0, m + l1 + view1.getMeasuredWidth(), view1.getMeasuredHeight());
            k1 = i1;
        }
        view.layout(k1, j1, k1 + l1, j1 + i2);
        n = view.getHeight();
        o = view.getWidth();
        p = getHeight() - n;
    }

    protected void onMeasure(int i1, int j1)
    {
        int i2 = android.view.View.MeasureSpec.getMode(i1);
        int k1 = android.view.View.MeasureSpec.getSize(i1);
        int j2 = android.view.View.MeasureSpec.getMode(j1);
        int l1 = android.view.View.MeasureSpec.getSize(j1);
        if (i2 == 0 || j2 == 0)
        {
            super.onMeasure(i1, j1);
        }
        View view = c;
        measureChild(view, i1, j1);
        if (j)
        {
            i1 = view.getMeasuredHeight();
            j1 = m;
            d.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l1 - i1 - j1, 0x40000000));
        } else
        {
            i1 = view.getMeasuredWidth();
            j1 = m;
            d.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1 - i1 - j1, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l1, 0x40000000));
        }
        setMeasuredDimension(k1, l1);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (h)
        {
            return true;
        }
        if (!g) goto _L2; else goto _L1
_L1:
        i.addMovement(motionevent);
        motionevent.getAction();
        JVM INSTR tableswitch 1 3: default 56
    //                   1 118
    //                   2 84
    //                   3 118;
           goto _L2 _L3 _L4 _L3
_L2:
        float f1;
        float f2;
        float f3;
        float f4;
        int i1;
        int j1;
        float f5;
        VelocityTracker velocitytracker;
        boolean flag;
        if (g || A || super.onTouchEvent(motionevent))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
_L4:
        if (j)
        {
            f1 = motionevent.getY();
        } else
        {
            f1 = motionevent.getX();
        }
        d((int)f1 - z);
          goto _L2
_L3:
        velocitytracker = i;
        velocitytracker.computeCurrentVelocity(I);
        f1 = velocitytracker.getYVelocity();
        f2 = velocitytracker.getXVelocity();
        flag = j;
        if (flag)
        {
            if (f1 < 0.0F)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            f5 = f2;
            if (f2 < 0.0F)
            {
                f5 = -f2;
            }
            f3 = f5;
            f4 = f1;
            j1 = i1;
            if (f5 <= (float)F)
            {
                break MISSING_BLOCK_LABEL_589;
            }
            f3 = F;
            f2 = f1;
            f1 = f3;
        } else
        {
            if (f2 < 0.0F)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            f5 = f1;
            if (f1 < 0.0F)
            {
                f5 = -f1;
            }
            f3 = f2;
            f4 = f5;
            j1 = i1;
            if (f5 <= (float)F)
            {
                break MISSING_BLOCK_LABEL_589;
            }
            f3 = F;
            f1 = f2;
            f2 = f3;
        }
_L5:
        f1 = (float)Math.hypot(f1, f2);
        if (i1 != 0)
        {
            f1 = -f1;
        }
        i1 = c.getTop();
        j1 = c.getLeft();
        if (Math.abs(f1) < (float)E)
        {
            if (flag ? k && i1 < D + m || !k && i1 > (l + getBottom()) - getTop() - n - D : k && j1 < D + m || !k && j1 > (l + getRight()) - getLeft() - o - D)
            {
                if (B)
                {
                    playSoundEffect(0);
                    if (k)
                    {
                        if (!flag)
                        {
                            i1 = j1;
                        }
                        a(i1);
                    } else
                    {
                        if (!flag)
                        {
                            i1 = j1;
                        }
                        b(i1);
                    }
                } else
                {
                    if (!flag)
                    {
                        i1 = j1;
                    }
                    a(i1, f1, false);
                }
            } else
            {
                if (!flag)
                {
                    i1 = j1;
                }
                a(i1, f1, false);
            }
        } else
        {
            if (!flag)
            {
                i1 = j1;
            }
            a(i1, f1, false);
        }
          goto _L2
        f2 = f4;
        f1 = f3;
        i1 = j1;
          goto _L5
    }

    public void setOnDrawerCloseListener(b b1)
    {
        r = b1;
    }

    public void setOnDrawerOpenListener(c c1)
    {
        q = c1;
    }

    public void setOnDrawerScrollListener(d d1)
    {
        s = d1;
    }
}
