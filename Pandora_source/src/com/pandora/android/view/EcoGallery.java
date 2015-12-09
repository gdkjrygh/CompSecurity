// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Transformation;
import android.widget.Scroller;
import android.widget.SpinnerAdapter;
import java.lang.reflect.Field;
import p.df.a;

// Referenced classes of package com.pandora.android.view:
//            EcoGalleryAbsSpinner

public class EcoGallery extends EcoGalleryAbsSpinner
    implements android.view.GestureDetector.OnGestureListener
{
    public static class LayoutParams extends android.view.ViewGroup.LayoutParams
    {

        public LayoutParams(int i, int j)
        {
            super(i, j);
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

    private class a
        implements Runnable
    {

        final EcoGallery a;
        private Scroller b;
        private int c;

        static Scroller a(a a1)
        {
            return a1.b;
        }

        private void a()
        {
            a.removeCallbacks(this);
        }

        static void a(a a1, boolean flag)
        {
            a1.b(flag);
        }

        private void b(boolean flag)
        {
            b.forceFinished(true);
            if (flag)
            {
                EcoGallery.c(a);
            }
        }

        public void a(int i)
        {
            if (i == 0)
            {
                return;
            }
            a();
            int j;
            if (i < 0)
            {
                j = 0x7fffffff;
            } else
            {
                j = 0;
            }
            c = j;
            b.fling(j, 0, i, 0, 0, 0x7fffffff, 0, 0x7fffffff);
            a.post(this);
        }

        public void a(boolean flag)
        {
            a.removeCallbacks(this);
            b(flag);
        }

        public void b(int i)
        {
            if (i == 0)
            {
                return;
            } else
            {
                a();
                c = 0;
                b.startScroll(0, 0, -i, 0, EcoGallery.b(a));
                a.post(this);
                return;
            }
        }

        public void run()
        {
            if (a.A == 0)
            {
                b(true);
                return;
            }
            EcoGallery.b(a, false);
            Scroller scroller = b;
            boolean flag = scroller.computeScrollOffset();
            int j = scroller.getCurrX();
            int i = c - j;
            if (i > 0)
            {
                com.pandora.android.view.EcoGallery.a(a, a.k);
                i = Math.min(a.getWidth() - a.getPaddingLeft() - a.getPaddingRight() - 1, i);
            } else
            {
                int k = a.getChildCount();
                com.pandora.android.view.EcoGallery.a(a, (k - 1) + a.k);
                i = Math.max(-(a.getWidth() - a.getPaddingRight() - a.getPaddingLeft() - 1), i);
            }
            a.a(i);
            if (flag && !EcoGallery.d(a))
            {
                c = j;
                a.post(this);
                return;
            } else
            {
                b(true);
                return;
            }
        }

        public a()
        {
            a = EcoGallery.this;
            super();
            b = new Scroller(getContext());
        }
    }


    private int F;
    private int G;
    private float H;
    private int I;
    private GestureDetector J;
    private int K;
    private View L;
    private a M;
    private Runnable N;
    private boolean O;
    private View P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private EcoGalleryAdapterView.a U;
    private boolean V;
    private boolean W;

    public EcoGallery(Context context)
    {
        this(context, null);
    }

    public EcoGallery(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0x7f010022);
    }

    public EcoGallery(Context context, AttributeSet attributeset, int i)
    {
        int j;
        int k;
        super(context, attributeset, i);
        F = 0;
        G = 200;
        M = new a();
        N = new Runnable() {

            final EcoGallery a;

            public void run()
            {
                com.pandora.android.view.EcoGallery.a(a, false);
                a.a();
            }

            
            {
                a = EcoGallery.this;
                super();
            }
        };
        Q = true;
        R = true;
        W = true;
        J = new GestureDetector(context, this);
        J.setIsLongpressEnabled(true);
        context = context.obtainStyledAttributes(attributeset, com.pandora.android.R.styleable.EcoGallery, i, 0);
        i = context.getInt(0, -1);
        if (i >= 0)
        {
            setGravity(i);
        }
        i = context.getInt(1, -1);
        if (i > 0)
        {
            setAnimationDuration(i);
        }
        setSpacing(context.getDimensionPixelOffset(3, 0));
        setUnselectedAlpha(context.getFloat(2, 0.5F));
        context.recycle();
        k = 1024;
        i = k;
        j = k;
        context = android/view/ViewGroup.getDeclaredField("FLAG_USE_CHILD_DRAWING_ORDER");
        i = k;
        j = k;
        attributeset = android/view/ViewGroup.getDeclaredField("FLAG_SUPPORT_STATIC_TRANSFORMATIONS");
        i = k;
        j = k;
        context.setAccessible(true);
        i = k;
        j = k;
        attributeset.setAccessible(true);
        i = k;
        j = k;
        k = context.getInt(this);
        i = k;
        j = k;
        int l = attributeset.getInt(this);
        j = l;
        i = k;
        k = j;
_L2:
        try
        {
            context = android/view/ViewGroup.getDeclaredField("mGroupFlags");
            context.setAccessible(true);
            context.set(this, Integer.valueOf(k | (i | context.getInt(this))));
            W = false;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            p.df.a.c("EcoGallery", context.getMessage(), context);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            p.df.a.c("EcoGallery", context.getMessage(), context);
        }
        break MISSING_BLOCK_LABEL_346;
        context;
        p.df.a.c("EcoGallery", context.getMessage(), context);
        k = 2048;
        continue; /* Loop/switch isn't completed */
        context;
        p.df.a.c("EcoGallery", context.getMessage(), context);
        k = 2048;
        i = j;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private int a(View view, boolean flag)
    {
        int i;
        int j;
        if (flag)
        {
            i = getMeasuredHeight();
        } else
        {
            i = getHeight();
        }
        if (flag)
        {
            j = view.getMeasuredHeight();
        } else
        {
            j = view.getHeight();
        }
        switch (I)
        {
        default:
            return 0;

        case 48: // '0'
            return this.i.top;

        case 16: // '\020'
            int k = this.i.bottom;
            int l = this.i.top;
            int i1 = this.i.top;
            return (i - k - l - j) / 2 + i1;

        case 80: // 'P'
            return i - this.i.bottom - j;
        }
    }

    static int a(EcoGallery ecogallery, int i)
    {
        ecogallery.K = i;
        return i;
    }

    private View a(int i, int j, int k, boolean flag)
    {
        View view = this.j.a();
        view = a.getView(i, view, this);
        a(view, j, k, flag);
        return view;
    }

    private void a(View view, int i, int j, boolean flag)
    {
        boolean flag1 = false;
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (layoutparams == null)
        {
            layoutparams = (LayoutParams)generateDefaultLayoutParams();
        }
        int k;
        int l;
        int i1;
        if (flag)
        {
            k = -1;
        } else
        {
            k = 0;
        }
        addViewInLayout(view, k, layoutparams);
        if (i == 0)
        {
            flag1 = true;
        }
        view.setSelected(flag1);
        i = ViewGroup.getChildMeasureSpec(b, this.i.top + this.i.bottom, layoutparams.height);
        view.measure(ViewGroup.getChildMeasureSpec(c, this.i.left + this.i.right, layoutparams.width), i);
        k = a(view, true);
        l = view.getMeasuredHeight();
        i1 = view.getMeasuredWidth();
        if (flag)
        {
            i = j;
            j = i1 + j;
        } else
        {
            i = j - i1;
        }
        view.layout(i, k, j, k + l);
    }

    static void a(EcoGallery ecogallery)
    {
        ecogallery.s();
    }

    private void a(boolean flag)
    {
        int j;
        int k;
        int j1;
        int k1;
        j = 0;
        k = 0;
        k1 = getChildCount();
        j1 = this.k;
        if (!flag) goto _L2; else goto _L1
_L1:
        int i;
        int l1;
        l1 = getPaddingLeft();
        j = 0;
        i = 0;
_L7:
        int l;
        int i1;
        l = i;
        i1 = k;
        if (j >= k1) goto _L4; else goto _L3
_L3:
        View view = getChildAt(j);
        if (view.getRight() < l1) goto _L6; else goto _L5
_L5:
        i1 = k;
        l = i;
_L4:
        detachViewsFromParent(i1, l);
        if (flag)
        {
            this.k = l + this.k;
        }
        return;
_L6:
        this.j.b(j1 + j, view);
        j++;
        i++;
          goto _L7
_L2:
        int i2;
        l1 = getWidth();
        i2 = getPaddingRight();
        i = k1 - 1;
        l = 0;
        k = j;
        j = l;
_L10:
        l = j;
        i1 = k;
        if (i < 0) goto _L4; else goto _L8
_L8:
        view = getChildAt(i);
        l = j;
        i1 = k;
        if (view.getLeft() <= l1 - i2) goto _L4; else goto _L9
_L9:
        this.j.b(j1 + i, view);
        j++;
        k = i;
        i--;
          goto _L10
    }

    static boolean a(EcoGallery ecogallery, boolean flag)
    {
        ecogallery.S = flag;
        return flag;
    }

    static int b(EcoGallery ecogallery)
    {
        return ecogallery.G;
    }

    private boolean b(View view, int i, long l)
    {
        boolean flag;
        boolean flag1;
        if (u != null)
        {
            flag = u.a(this, L, K, l);
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (!flag)
        {
            U = new EcoGalleryAdapterView.a(view, i, l);
            flag1 = super.showContextMenuForChild(this);
        }
        if (flag1)
        {
            performHapticFeedback(0);
        }
        return flag1;
    }

    static boolean b(EcoGallery ecogallery, boolean flag)
    {
        ecogallery.O = flag;
        return flag;
    }

    private void c(int i)
    {
        for (int j = getChildCount() - 1; j >= 0; j--)
        {
            getChildAt(j).offsetLeftAndRight(i);
        }

    }

    static void c(EcoGallery ecogallery)
    {
        ecogallery.n();
    }

    private static int d(View view)
    {
        return view.getLeft() + view.getWidth() / 2;
    }

    private boolean d(int i)
    {
        View view = getChildAt(i);
        if (view != null)
        {
            i = getCenterOfGallery();
            int j = d(view);
            M.b(i - j);
            return true;
        } else
        {
            return false;
        }
    }

    static boolean d(EcoGallery ecogallery)
    {
        return ecogallery.O;
    }

    private void e(View view)
    {
        if (view != null)
        {
            view.setPressed(true);
        }
        setPressed(true);
    }

    private int getCenterOfGallery()
    {
        int i = getPaddingLeft();
        return i + (getWidth() - i - getPaddingRight()) / 2;
    }

    private void n()
    {
        if (getChildCount() == 0 || P == null)
        {
            return;
        }
        int i = d(P);
        i = getCenterOfGallery() - i;
        if (i != 0)
        {
            M.b(i);
            return;
        } else
        {
            o();
            return;
        }
    }

    private void o()
    {
        if (S)
        {
            S = false;
            super.a();
        }
        invalidate();
    }

    private void p()
    {
        View view = P;
        if (P != null) goto _L2; else goto _L1
_L1:
        int j1;
        return;
_L2:
        if (view.getLeft() <= (j1 = getCenterOfGallery()) && view.getRight() >= j1) goto _L1; else goto _L3
_L3:
        int i;
        int j;
        int k;
        k = 0x7fffffff;
        j = 0;
        i = getChildCount() - 1;
_L6:
        if (i < 0)
        {
            break MISSING_BLOCK_LABEL_177;
        }
        view = getChildAt(i);
        if (view.getLeft() > j1 || view.getRight() < j1) goto _L5; else goto _L4
_L4:
        i = this.k + i;
        if (i != y)
        {
            setSelectedPositionInt(i);
            setNextSelectedPositionInt(i);
            k();
            return;
        }
          goto _L1
_L5:
        int l = Math.min(Math.abs(view.getLeft() - j1), Math.abs(view.getRight() - j1));
        if (l < k)
        {
            k = i;
            j = l;
        } else
        {
            int i1 = k;
            k = j;
            j = i1;
        }
        i--;
        l = j;
        j = k;
        k = l;
          goto _L6
        i = j;
          goto _L4
    }

    private void q()
    {
        int k = F;
        int l = getPaddingLeft();
        View view = getChildAt(0);
        int i;
        int j;
        if (view != null)
        {
            j = this.k - 1;
            i = view.getLeft() - k;
        } else
        {
            i = getRight() - getLeft() - getPaddingRight();
            O = true;
            j = 0;
        }
        for (; i > l && j >= 0; j--)
        {
            View view1 = a(j, j - y, i, false);
            this.k = j;
            i = view1.getLeft() - k;
        }

    }

    private void r()
    {
        int k = F;
        int l = getRight();
        int i1 = getLeft();
        int j1 = getPaddingRight();
        int i = getChildCount();
        int k1 = A;
        View view = getChildAt(i - 1);
        int j;
        if (view != null)
        {
            j = this.k + i;
            i = view.getRight() + k;
        } else
        {
            j = A - 1;
            this.k = j;
            i = getPaddingLeft();
            O = true;
        }
        for (; i < l - i1 - j1 && j < k1; j++)
        {
            i = a(j, j - y, i, true).getRight() + k;
        }

    }

    private void s()
    {
        for (int i = getChildCount() - 1; i >= 0; i--)
        {
            getChildAt(i).setPressed(false);
        }

        setPressed(false);
    }

    private void t()
    {
        View view = P;
        View view1 = getChildAt(y - k);
        P = view1;
        if (view1 != null)
        {
            view1.setSelected(true);
            view1.setFocusable(true);
            if (hasFocus())
            {
                view1.requestFocus();
            }
            if (view != null)
            {
                view.setSelected(false);
                view.setFocusable(false);
                return;
            }
        }
    }

    int a(View view)
    {
        return view.getMeasuredHeight();
    }

    int a(boolean flag, int i)
    {
        View view;
        int j;
        boolean flag1;
        flag1 = false;
        if (flag)
        {
            j = A - 1;
        } else
        {
            j = 0;
        }
        view = getChildAt(j - this.k);
        if (view != null) goto _L2; else goto _L1
_L1:
        j = i;
_L4:
        return j;
_L2:
        int l;
        int i1;
        l = d(view);
        i1 = getCenterOfGallery();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        j = ((flag1) ? 1 : 0);
        if (l <= i1) goto _L4; else goto _L3
_L3:
        int k = i1 - l;
        if (flag)
        {
            i = Math.max(k, i);
        } else
        {
            i = Math.min(k, i);
        }
        return i;
        if (l >= i1)
        {
            return 0;
        }
          goto _L3
    }

    void a()
    {
        if (!S)
        {
            super.a();
        }
    }

    void a(int i)
    {
        if (getChildCount() == 0)
        {
            return;
        }
        int j;
        boolean flag;
        if (i < 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = a(flag, i);
        if (j != i)
        {
            com.pandora.android.view.a.a(M, false);
            o();
        }
        c(j);
        a(flag);
        if (flag)
        {
            r();
        } else
        {
            q();
        }
        p();
        invalidate();
    }

    void a(int i, boolean flag)
    {
        i = this.i.left;
        int j = getRight();
        int k = getLeft();
        int l = this.i.left;
        int i1 = this.i.right;
        if (v)
        {
            h();
        }
        if (A == 0)
        {
            f();
            return;
        }
        if (w >= 0)
        {
            setSelectedPositionInt(w);
        }
        g();
        detachAllViewsFromParent();
        this.k = y;
        View view = a(y, 0, 0, true);
        view.offsetLeftAndRight((i + (j - k - l - i1) / 2) - view.getWidth() / 2);
        r();
        q();
        invalidate();
        k();
        v = false;
        p = false;
        setNextSelectedPositionInt(y);
        t();
    }

    void b()
    {
        if (com.pandora.android.view.a.a(M).isFinished())
        {
            n();
        }
        s();
    }

    void c()
    {
        b();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    protected int computeHorizontalScrollExtent()
    {
        return 1;
    }

    protected int computeHorizontalScrollOffset()
    {
        return y;
    }

    protected int computeHorizontalScrollRange()
    {
        return A;
    }

    boolean d()
    {
        if (A > 0 && y > 0)
        {
            d(y - k - 1);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return keyevent.dispatch(this, null, null);
    }

    protected void dispatchSetPressed(boolean flag)
    {
        if (P != null)
        {
            P.setPressed(flag);
        }
    }

    public void dispatchSetSelected(boolean flag)
    {
    }

    boolean e()
    {
        if (A > 0 && y < A - 1)
        {
            d((y - k) + 1);
            return true;
        } else
        {
            return false;
        }
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams(-2, -2);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new LayoutParams(layoutparams);
    }

    protected int getChildDrawingOrder(int i, int j)
    {
        int k = y - this.k;
        if (k >= 0)
        {
            if (j == i - 1)
            {
                return k;
            }
            if (j >= k)
            {
                return j + 1;
            }
        }
        return j;
    }

    protected boolean getChildStaticTransformation(View view, Transformation transformation)
    {
        transformation.clear();
        float f;
        if (view == P)
        {
            f = 1.0F;
        } else
        {
            f = H;
        }
        transformation.setAlpha(f);
        return true;
    }

    protected android.view.ContextMenu.ContextMenuInfo getContextMenuInfo()
    {
        return U;
    }

    public boolean onDown(MotionEvent motionevent)
    {
        M.a(false);
        K = a((int)motionevent.getX(), (int)motionevent.getY());
        if (K >= 0)
        {
            L = getChildAt(K - k);
            L.setPressed(true);
        }
        V = true;
        return true;
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (!Q)
        {
            removeCallbacks(N);
            if (!S)
            {
                S = true;
            }
        }
        M.a((int)(-f));
        return true;
    }

    protected void onFocusChanged(boolean flag, int i, Rect rect)
    {
        super.onFocusChanged(flag, i, rect);
        if (flag && P != null)
        {
            P.requestFocus(i);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        boolean flag = true;
        i;
        JVM INSTR lookupswitch 4: default 44
    //                   21: 53
    //                   22: 67
    //                   23: 81
    //                   66: 81;
           goto _L1 _L2 _L3 _L4 _L4
_L1:
        flag = super.onKeyDown(i, keyevent);
_L6:
        return flag;
_L2:
        if (!d()) goto _L6; else goto _L5
_L5:
        playSoundEffect(1);
        return true;
_L3:
        if (!e()) goto _L6; else goto _L7
_L7:
        playSoundEffect(3);
        return true;
_L4:
        T = true;
        if (true) goto _L1; else goto _L8
_L8:
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        switch (i)
        {
        default:
            return super.onKeyUp(i, keyevent);

        case 23: // '\027'
        case 66: // 'B'
            break;
        }
        if (T && A > 0)
        {
            e(P);
            postDelayed(new Runnable() {

                final EcoGallery a;

                public void run()
                {
                    com.pandora.android.view.EcoGallery.a(a);
                }

            
            {
                a = EcoGallery.this;
                super();
            }
            }, ViewConfiguration.getPressedStateDuration());
            a(getChildAt(y - k), y, a.getItemId(y));
        }
        T = false;
        return true;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        r = true;
        a(0, false);
        r = false;
    }

    public void onLongPress(MotionEvent motionevent)
    {
        if (K < 0)
        {
            return;
        } else
        {
            performHapticFeedback(0);
            long l = b(K);
            b(L, K, l);
            return;
        }
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        getParent().requestDisallowInterceptTouchEvent(true);
        if (Q) goto _L2; else goto _L1
_L1:
        if (V)
        {
            if (!S)
            {
                S = true;
            }
            postDelayed(N, 250L);
        }
_L4:
        a((int)f * -1);
        V = false;
        return true;
_L2:
        if (S)
        {
            S = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onShowPress(MotionEvent motionevent)
    {
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        if (K >= 0)
        {
            d(K - k);
            if (R || K == y)
            {
                a(L, K, a.getItemId(K));
            }
            return true;
        } else
        {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = J.onTouchEvent(motionevent);
        int i = motionevent.getAction();
        if (i == 1)
        {
            b();
        } else
        if (i == 3)
        {
            c();
            return flag;
        }
        return flag;
    }

    public void setAnimationDuration(int i)
    {
        G = i;
    }

    public void setCallbackDuringFling(boolean flag)
    {
        Q = flag;
    }

    public void setCallbackOnUnselectedItemClick(boolean flag)
    {
        R = flag;
    }

    public void setGravity(int i)
    {
        if (I != i)
        {
            I = i;
            requestLayout();
        }
    }

    void setSelectedPositionInt(int i)
    {
        super.setSelectedPositionInt(i);
        t();
    }

    public void setSpacing(int i)
    {
        F = i;
    }

    public void setUnselectedAlpha(float f)
    {
        H = f;
    }

    public boolean showContextMenu()
    {
        if (isPressed() && y >= 0)
        {
            return b(getChildAt(y - k), y, z);
        } else
        {
            return false;
        }
    }

    public boolean showContextMenuForChild(View view)
    {
        int i = c(view);
        if (i < 0)
        {
            return false;
        } else
        {
            return b(view, i, a.getItemId(i));
        }
    }
}
