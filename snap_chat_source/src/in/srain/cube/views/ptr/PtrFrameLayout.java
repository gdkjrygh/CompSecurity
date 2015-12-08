// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package in.srain.cube.views.ptr;

import afA;
import afB;
import afC;
import afG;
import afz;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Scroller;
import android.widget.TextView;

public class PtrFrameLayout extends ViewGroup
{
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        public LayoutParams(int i1)
        {
            super(-1, i1);
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
        }
    }

    final class a
        implements Runnable
    {

        Scroller a;
        boolean b;
        private int c;
        private int d;
        private PtrFrameLayout e;

        final void a()
        {
            b = false;
            c = 0;
            e.removeCallbacks(this);
        }

        public final void a(int i1, int j1)
        {
            if (PtrFrameLayout.c(e) == i1)
            {
                return;
            } else
            {
                d = PtrFrameLayout.c(e);
                int k1 = d;
                e.removeCallbacks(this);
                c = 0;
                a = new Scroller(e.getContext());
                a.startScroll(0, 0, 0, i1 - k1, j1);
                e.post(this);
                b = true;
                return;
            }
        }

        public final void run()
        {
            boolean flag;
            int i1;
            int j1;
            if (!a.computeScrollOffset() || a.isFinished())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            i1 = a.getCurrY();
            j1 = c;
            if (!flag)
            {
                c = i1;
                PtrFrameLayout.a(e, i1 - j1);
                e.post(this);
                return;
            } else
            {
                a();
                return;
            }
        }

        public a()
        {
            e = PtrFrameLayout.this;
            super();
            b = false;
            a = new Scroller(getContext());
        }
    }


    private static int a = 1;
    private static byte e = 2;
    private boolean A;
    private MotionEvent B;
    private MotionEvent C;
    private afC D;
    private int E;
    private long F;
    int b;
    boolean c;
    public boolean d;
    private View f;
    private int g;
    private int h;
    private float i;
    private int j;
    private int k;
    private float l;
    private boolean m;
    private View n;
    private afB o;
    private afz p;
    private a q;
    private PointF r;
    private int s;
    private int t;
    private int u;
    private int v;
    private byte w;
    private boolean x;
    private int y;
    private boolean z;

    public PtrFrameLayout(Context context)
    {
        this(context, null);
    }

    public PtrFrameLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PtrFrameLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        Object obj = new StringBuilder("ptr-frame-");
        i1 = a + 1;
        a = i1;
        ((StringBuilder) (obj)).append(i1);
        b = 0;
        g = 0;
        h = 0;
        i = 1.7F;
        j = 200;
        k = 1000;
        l = 1.2F;
        m = true;
        c = false;
        o = new afB();
        r = new PointF();
        s = 0;
        t = 0;
        w = 1;
        x = false;
        d = false;
        y = 0;
        z = false;
        A = false;
        E = 500;
        F = 0L;
        obj = getContext();
        if (!afG.c && obj != null)
        {
            afG.c = true;
            DisplayMetrics displaymetrics = new DisplayMetrics();
            ((WindowManager)((Context) (obj)).getSystemService("window")).getDefaultDisplay().getMetrics(displaymetrics);
            afG.a = displaymetrics.widthPixels;
            i1 = displaymetrics.heightPixels;
            afG.b = displaymetrics.density;
            float f1 = displaymetrics.density;
            f1 = displaymetrics.density;
        }
        context = context.obtainStyledAttributes(attributeset, afD.d.PtrFrameLayout, 0, 0);
        if (context != null)
        {
            g = context.getResourceId(0, g);
            h = context.getResourceId(1, h);
            i = context.getFloat(2, i);
            j = context.getInt(4, j);
            k = context.getInt(5, k);
            l = context.getFloat(3, l);
            m = context.getBoolean(7, m);
            c = context.getBoolean(6, c);
            context.recycle();
        }
        q = new a();
        u = ViewConfiguration.get(getContext()).getScaledTouchSlop() << 1;
    }

    private void a()
    {
        if (!x)
        {
            q.a(0, k);
        }
    }

    private void a(float f1)
    {
        if (f1 < 0.0F && s == 0)
        {
            return;
        }
        int j1 = s + (int)f1;
        int i1 = j1;
        if (j1 < 0)
        {
            i1 = 0;
        }
        s = i1;
        i1 = s - t;
        if (i1 != 0)
        {
            if (t == 0 && s != 0 && o.a())
            {
                if (w == 1)
                {
                    w = 2;
                    o.b(this);
                }
                if (x && A)
                {
                    super.dispatchTouchEvent(MotionEvent.obtain(B.getDownTime(), B.getEventTime() + (long)ViewConfiguration.getLongPressTimeout(), 3, B.getX(), B.getY(), B.getMetaState()));
                }
            }
            if (t != 0 && s == 0)
            {
                d();
                if (x && A)
                {
                    MotionEvent motionevent = C;
                    super.dispatchTouchEvent(MotionEvent.obtain(motionevent.getDownTime(), motionevent.getEventTime(), 0, motionevent.getX(), motionevent.getY(), motionevent.getMetaState()));
                }
            }
            if (w == 2)
            {
                if (x && c && t < b && s >= b)
                {
                    b();
                }
                if (e == 0 && t < v && s >= v)
                {
                    b();
                }
            }
            n.offsetTopAndBottom(i1);
            f.offsetTopAndBottom(i1);
            invalidate();
            float f2;
            if (v == 0)
            {
                f1 = 0.0F;
            } else
            {
                f1 = (float)t / (float)v;
            }
            if (v == 0)
            {
                f2 = 0.0F;
            } else
            {
                f2 = (float)s / (float)v;
            }
            if (o.a())
            {
                o.a(this, x, w, t, s, f1, f2);
            }
        }
        t = s;
    }

    static void a(PtrFrameLayout ptrframelayout)
    {
        ptrframelayout.a(true);
    }

    static void a(PtrFrameLayout ptrframelayout, float f1)
    {
        ptrframelayout.a(f1);
    }

    private void a(boolean flag)
    {
        if (s != 0 && !flag && D != null)
        {
            afC afc = D;
            switch (afc.b)
            {
            case 1: // '\001'
            default:
                return;

            case 0: // '\0'
                afc.b = 1;
                afc.run();
                return;

            case 2: // '\002'
                afc.a();
                break;
            }
            return;
        }
        if (o.a())
        {
            o.d(this);
        }
        a();
        d();
    }

    static void b(PtrFrameLayout ptrframelayout)
    {
        ptrframelayout.e();
    }

    private boolean b()
    {
        if (w == 2 && s >= b)
        {
            w = 3;
            F = System.currentTimeMillis();
            if (o.a())
            {
                o.c(this);
            }
            if (p != null)
            {
                p.a(this);
                return false;
            }
        }
        return false;
    }

    static int c(PtrFrameLayout ptrframelayout)
    {
        return ptrframelayout.s;
    }

    private boolean d()
    {
        if ((w == 4 || w == 2) && s == 0)
        {
            if (o.a())
            {
                o.a(this);
            }
            w = 1;
            return true;
        } else
        {
            return false;
        }
    }

    private void e()
    {
        w = 4;
        a(false);
    }

    public final void a(afA afa)
    {
        afB afb1;
        afb1 = o;
        break MISSING_BLOCK_LABEL_5;
_L2:
        do
        {
            return;
        } while (afa == null || afb1 == null);
        afB afb = afb1;
        if (afb1.a == null)
        {
            afb1.a = afa;
            return;
        }
        do
        {
            boolean flag;
            if (afb.a != null && afb.a == afa)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (afb.b != null)
            {
                afb = afb.b;
            } else
            {
                afB afb2 = new afB();
                afb2.a = afa;
                afb.b = afb2;
                return;
            }
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void c()
    {
        if (D != null)
        {
            D.b = 0;
        }
        int i1 = (int)((long)E - (System.currentTimeMillis() - F));
        if (i1 <= 0)
        {
            e();
            return;
        } else
        {
            postDelayed(new Runnable() {

                private PtrFrameLayout a;

                public final void run()
                {
                    PtrFrameLayout.b(a);
                }

            
            {
                a = PtrFrameLayout.this;
                super();
            }
            }, i1);
            return;
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        boolean flag3;
        boolean flag4;
        flag3 = false;
        flag4 = true;
        if (isEnabled() && f != null && n != null) goto _L2; else goto _L1
_L1:
        flag4 = super.dispatchTouchEvent(motionevent);
_L9:
        return flag4;
_L2:
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 72
    //                   0 189
    //                   1 78
    //                   2 288
    //                   3 78;
           goto _L3 _L4 _L5 _L6 _L5
_L3:
        return super.dispatchTouchEvent(motionevent);
_L5:
        x = false;
        if (s > 0)
        {
            b();
            if (w == 3)
            {
                if (m)
                {
                    if (s > v)
                    {
                        q.a(v, j);
                    }
                } else
                {
                    a();
                }
            } else
            if (w == 4)
            {
                a(false);
            } else
            {
                a();
            }
            if (s == y)
            {
                return super.dispatchTouchEvent(motionevent);
            }
        } else
        {
            return super.dispatchTouchEvent(motionevent);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        B = motionevent;
        r.set(motionevent.getX(), motionevent.getY());
        a a1 = q;
        if (a1.b)
        {
            if (!a1.a.isFinished())
            {
                a1.a.forceFinished(true);
            }
            a1.a();
        }
        x = true;
        z = false;
        if (!A || s <= 0)
        {
            super.dispatchTouchEvent(motionevent);
        }
        y = s;
        return true;
_L6:
        float f2;
        boolean flag1;
        boolean flag2;
        C = motionevent;
        float f1 = motionevent.getX() - r.x;
        f2 = (int)(motionevent.getY() - r.y);
        r.set(motionevent.getX(), motionevent.getY());
        if (d && !z && (Math.abs(f1) > (float)u || Math.abs(f1) > 3F * Math.abs(f2)))
        {
            boolean flag;
            if (s == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                z = true;
            }
        }
        if (z)
        {
            return super.dispatchTouchEvent(motionevent);
        }
        if (f2 > 0.0F)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag1)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (s > 0)
        {
            flag3 = true;
        }
        if (flag1 && p != null && !p.a())
        {
            return super.dispatchTouchEvent(motionevent);
        }
        if ((!flag2 || !flag3) && !flag1) goto _L3; else goto _L7
_L7:
        a((float)((double)f2 / (double)i));
        return true;
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams(-1);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new LayoutParams(layoutparams);
    }

    protected void onFinishInflate()
    {
        int i1;
        i1 = getChildCount();
        if (i1 > 2)
        {
            throw new IllegalStateException("PtrFrameLayout only can host 2 elements");
        }
        if (i1 != 2)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        if (g != 0 && n == null)
        {
            n = findViewById(g);
        }
        if (h != 0 && f == null)
        {
            f = findViewById(h);
        }
        if (f != null && n != null) goto _L2; else goto _L1
_L1:
        View view;
        View view1;
        view1 = getChildAt(0);
        view = getChildAt(1);
        if (!(view1 instanceof afA)) goto _L4; else goto _L3
_L3:
        PtrFrameLayout ptrframelayout;
        n = view1;
        ptrframelayout = this;
_L7:
        ptrframelayout.f = view;
_L2:
        super.onFinishInflate();
        return;
_L4:
        if (!(view instanceof afA)) goto _L6; else goto _L5
_L5:
        n = view;
_L9:
        ptrframelayout = this;
        view = view1;
          goto _L7
_L6:
label0:
        {
            if (f != null || n != null)
            {
                break label0;
            }
            n = view1;
            ptrframelayout = this;
        }
          goto _L7
        if (n != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (f != view1)
        {
            view = view1;
        }
        n = view;
          goto _L2
        if (n != view1) goto _L9; else goto _L8
_L8:
        ptrframelayout = this;
          goto _L7
        if (i1 == 1)
        {
            f = getChildAt(0);
        } else
        {
            TextView textview = new TextView(getContext());
            textview.setClickable(true);
            textview.setTextColor(-39424);
            textview.setGravity(17);
            textview.setTextSize(20F);
            textview.setText("The content view in PtrFrameLayout is empty. Do you forget to specify its id in xml layout file?");
            f = textview;
            addView(f);
        }
          goto _L2
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        i1 = s;
        k1 = getPaddingLeft();
        j1 = getPaddingTop();
        if (n != null)
        {
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)n.getLayoutParams();
            l1 = marginlayoutparams.leftMargin + k1;
            int i2 = (marginlayoutparams.topMargin + j1 + i1) - v;
            int j2 = n.getMeasuredWidth();
            int k2 = n.getMeasuredHeight();
            n.layout(l1, i2, j2 + l1, k2 + i2);
        }
        if (f != null)
        {
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams1 = (android.view.ViewGroup.MarginLayoutParams)f.getLayoutParams();
            k1 += marginlayoutparams1.leftMargin;
            i1 = marginlayoutparams1.topMargin + j1 + i1;
            j1 = f.getMeasuredWidth();
            l1 = f.getMeasuredHeight();
            f.layout(k1, i1, j1 + k1, l1 + i1);
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        if (n != null)
        {
            measureChildWithMargins(n, i1, 0, j1, 0);
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)n.getLayoutParams();
            int k1 = n.getMeasuredHeight();
            int l1 = marginlayoutparams.topMargin;
            v = marginlayoutparams.bottomMargin + (k1 + l1);
            b = (int)((float)v * l);
        }
        if (f != null)
        {
            View view = f;
            android.view.ViewGroup.MarginLayoutParams marginlayoutparams1 = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
            view.measure(getChildMeasureSpec(i1, getPaddingLeft() + getPaddingRight() + marginlayoutparams1.leftMargin + marginlayoutparams1.rightMargin, marginlayoutparams1.width), getChildMeasureSpec(j1, getPaddingTop() + getPaddingBottom() + marginlayoutparams1.topMargin, marginlayoutparams1.height));
        }
    }

    public void setDurationToClose(int i1)
    {
        j = i1;
    }

    public void setDurationToCloseHeader(int i1)
    {
        k = i1;
    }

    public void setHeaderView(View view)
    {
        if (n != null && view != null && n != view)
        {
            removeView(n);
        }
        if (view.getLayoutParams() == null)
        {
            view.setLayoutParams(new LayoutParams(-2));
        }
        n = view;
        addView(view);
    }

    public void setInterceptEventWhileWorking(boolean flag)
    {
        A = flag;
    }

    public void setKeepHeaderWhenRefresh(boolean flag)
    {
        m = flag;
    }

    public void setLoadingMinTime(int i1)
    {
        E = i1;
    }

    public void setOffsetToRefresh(int i1)
    {
        b = i1;
    }

    public void setPtrHandler(afz afz1)
    {
        p = afz1;
    }

    public void setPullToRefresh(boolean flag)
    {
        c = flag;
    }

    public void setRatioOfHeaderHeightToRefresh(float f1)
    {
        l = f1;
        b = (int)((float)v * l);
    }

    public void setRefreshCompleteHook(afC afc)
    {
        D = afc;
        afc.a = new Runnable() {

            private PtrFrameLayout a;

            public final void run()
            {
                PtrFrameLayout.a(a);
            }

            
            {
                a = PtrFrameLayout.this;
                super();
            }
        };
    }

    public void setResistance(float f1)
    {
        i = f1;
    }

}
