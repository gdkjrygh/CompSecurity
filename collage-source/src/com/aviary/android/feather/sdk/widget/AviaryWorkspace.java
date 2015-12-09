// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.widget.EdgeEffectCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.Adapter;
import android.widget.Scroller;
import com.aviary.android.feather.common.a.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            AviaryWorkspaceIndicator, CellLayout

public class AviaryWorkspace extends ViewGroup
{
    public static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState a(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public SavedState[] a(int i1)
            {
                return new SavedState[i1];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i1)
            {
                return a(i1);
            }

        };
        int a;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(a);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            a = -1;
            a = parcel.readInt();
        }


        SavedState(Parcelable parcelable)
        {
            super(parcelable);
            a = -1;
        }
    }

    public static interface a
    {

        public abstract void a(int i1, int j1);
    }

    class b extends DataSetObserver
    {

        final AviaryWorkspace a;

        public void onChanged()
        {
            Log.i("Workspace", "onChanged");
            super.onChanged();
            a.b();
            AviaryWorkspace.d(a);
        }

        public void onInvalidated()
        {
            Log.i("Workspace", "onInvalidated");
            super.onInvalidated();
            a.b();
            AviaryWorkspace.d(a);
        }

        b()
        {
            a = AviaryWorkspace.this;
            super();
        }
    }


    private static final float A = (float)(0.016D / Math.log(0.75D));
    private static final boolean B;
    private float C;
    private float D;
    private Interpolator E;
    private List F;
    private int G;
    private int H;
    private EdgeEffectCompat I;
    private EdgeEffectCompat J;
    private int K;
    private boolean L;
    private boolean M;
    private a N;
    private View O;
    protected Adapter a;
    protected DataSetObserver b;
    protected boolean c;
    protected int d;
    protected int e;
    protected int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private Scroller p;
    private VelocityTracker q;
    private float r;
    private float s;
    private float t;
    private int u;
    private boolean v;
    private int w;
    private int x;
    private int y;
    private AviaryWorkspaceIndicator z;

    public AviaryWorkspace(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
        a(context, attributeset, 0);
    }

    public AviaryWorkspace(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        g = -1;
        h = 0;
        m = -1;
        n = -1;
        o = -1;
        u = 0;
        v = true;
        y = -1;
        e = 0;
        f = 1;
        L = true;
        M = false;
        a(context, attributeset, i1);
    }

    private int a(View view, boolean flag)
    {
        return j;
    }

    private View a(int i1, int j1, int k1, boolean flag)
    {
        if (!c)
        {
            int l1 = a.getItemViewType(i1);
            View view = (View)((Queue)F.get(l1)).poll();
            if (view != null)
            {
                view = a.getView(i1, view, this);
                a(view, j1, k1, flag);
                return view;
            }
        }
        View view1 = a.getView(i1, null, this);
        a(view1, j1, k1, flag);
        return view1;
    }

    static a a(AviaryWorkspace aviaryworkspace)
    {
        return aviaryworkspace.N;
    }

    private void a(int i1, int j1, boolean flag)
    {
        int k1 = Math.max(0, Math.min(i1, e - 1));
        a(m, k1);
        setNextSelectedPositionInt(k1);
        View view = getFocusedChild();
        if (view != null && k1 != m && view == getChildAt(m))
        {
            view.clearFocus();
        }
        i1 = Math.max(1, Math.abs(k1 - m));
        int l1 = getWidth() * k1 - getScrollX();
        i1 = (i1 + 1) * 100;
        if (!p.isFinished())
        {
            p.abortAnimation();
        }
        j1 = Math.abs(j1);
        if (j1 > 0)
        {
            float f1 = i1;
            i1 = (int)(((float)i1 / ((float)j1 / 2500F)) * 0.4F + f1);
        } else
        {
            i1 += 100;
        }
        p.startScroll(getScrollX(), 0, l1, 0, i1);
        i1 = getOverScroll();
        if (l1 != 0 && i1 == 2)
        {
            a(k1, l1, j1);
        }
        invalidate();
    }

    private void a(Context context, AttributeSet attributeset, int i1)
    {
        attributeset = context.getTheme().obtainStyledAttributes(attributeset, com.aviary.android.feather.sdk.R.styleable.AviaryWorkspace, i1, 0);
        h = attributeset.getInt(0, 0);
        i1 = attributeset.getInt(1, 0);
        attributeset.recycle();
        setHapticFeedbackEnabled(false);
        E = new DecelerateInterpolator(1.0F);
        p = new Scroller(context, E);
        g = -1;
        context = ViewConfiguration.get(getContext());
        w = context.getScaledTouchSlop();
        x = context.getScaledMaximumFlingVelocity();
        j = getPaddingTop();
        l = getPaddingBottom();
        i = getPaddingLeft();
        k = getPaddingRight();
        setOverScroll(i1);
    }

    private void a(Canvas canvas)
    {
        if (I != null)
        {
            int i1 = getWidth();
            int j1 = getHeight() - getPaddingTop() - getPaddingBottom();
            if (!I.isFinished())
            {
                int k1 = canvas.save();
                canvas.rotate(270F);
                canvas.translate(-j1 + getPaddingTop(), 0.0F);
                I.setSize(j1, i1);
                if (I.draw(canvas))
                {
                    postInvalidate();
                }
                canvas.restoreToCount(k1);
            }
            if (!J.isFinished())
            {
                int l1 = canvas.save();
                canvas.rotate(90F);
                canvas.translate(-getPaddingTop(), -(D + (float)i1));
                J.setSize(j1, i1);
                if (J.draw(canvas))
                {
                    postInvalidate();
                }
                canvas.restoreToCount(l1);
            }
        }
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = (motionevent.getAction() & 0xff00) >> 8;
        if (motionevent.getPointerId(i1) == y)
        {
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            r = motionevent.getX(i1);
            s = motionevent.getX(i1);
            t = motionevent.getY(i1);
            y = motionevent.getPointerId(i1);
            if (q != null)
            {
                q.clear();
            }
        }
    }

    private void a(View view, int i1, int j1, boolean flag)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        if (layoutparams == null)
        {
            layoutparams = generateDefaultLayoutParams();
        }
        int k1;
        int l1;
        int i2;
        if (flag)
        {
            i1 = -1;
        } else
        {
            i1 = 0;
        }
        addViewInLayout(view, i1, layoutparams);
        if (!L);
        i1 = ViewGroup.getChildMeasureSpec(G, j + l, layoutparams.height);
        view.measure(ViewGroup.getChildMeasureSpec(H, i + k, layoutparams.width), i1);
        k1 = a(view, true);
        l1 = view.getMeasuredHeight();
        i2 = view.getMeasuredWidth();
        if (flag)
        {
            i1 = j1;
            j1 = i2 + j1;
        } else
        {
            i1 = j1 - i2;
        }
        view.layout(i1, k1, j1, k1 + l1);
    }

    private void a(boolean flag)
    {
        int j1;
        int k1;
        int j2;
        j1 = 0;
        k1 = 0;
        j2 = getChildCount();
        if (!flag) goto _L2; else goto _L1
_L1:
        int i1;
        int k2;
        int l2;
        k2 = i;
        l2 = d(m - 1);
        j1 = 0;
        i1 = 0;
_L7:
        int l1;
        int i2;
        l1 = i1;
        i2 = k1;
        if (j1 >= j2) goto _L4; else goto _L3
_L3:
        View view = getChildAt(j1);
        if (view.getRight() <= k2 + l2) goto _L6; else goto _L5
_L5:
        i2 = k1;
        l1 = i1;
_L4:
        detachViewsFromParent(i2, l1);
        if (flag && l1 > 0)
        {
            d = l1 + d;
        }
        return;
_L6:
        l1 = a.getItemViewType(d + j1);
        ((Queue)F.get(l1)).offer(view);
        j1++;
        i1++;
          goto _L7
_L2:
        k2 = getTotalWidth();
        l2 = d(m + 1);
        i1 = j2 - 1;
        l1 = 0;
        k1 = j1;
        j1 = l1;
_L10:
        l1 = j1;
        i2 = k1;
        if (i1 < 0) goto _L4; else goto _L8
_L8:
        view = getChildAt(i1);
        l1 = j1;
        i2 = k1;
        if (view.getLeft() < k2 + l2) goto _L4; else goto _L9
_L9:
        k1 = a.getItemViewType(d + i1);
        ((Queue)F.get(k1)).offer(view);
        j1++;
        k1 = i1;
        i1--;
          goto _L10
    }

    static int b(AviaryWorkspace aviaryworkspace)
    {
        return aviaryworkspace.m;
    }

    private void b(int i1, int j1)
    {
        getHandler().post(new Runnable(i1, j1) {

            final int a;
            final int b;
            final AviaryWorkspace c;

            public void run()
            {
                if (AviaryWorkspace.c(c) != null)
                {
                    AviaryWorkspace.c(c).a(a, b);
                }
            }

            
            {
                c = AviaryWorkspace.this;
                a = i1;
                b = j1;
                super();
            }
        });
    }

    private void b(MotionEvent motionevent)
    {
        if (q == null)
        {
            q = VelocityTracker.obtain();
        }
        q.addMovement(motionevent);
    }

    static AviaryWorkspaceIndicator c(AviaryWorkspace aviaryworkspace)
    {
        return aviaryworkspace.z;
    }

    private void c(int i1)
    {
        boolean flag1;
        int j1 = m;
        View view;
        boolean flag;
        boolean flag2;
        if (i1 > m)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i1 < m)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (i1 != m)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        m = i1;
        if (z != null)
        {
            z.a(m, e);
        }
        setNextSelectedPositionInt(-1);
        g();
        h();
        if (!flag) goto _L2; else goto _L1
_L1:
        a(true);
_L4:
        if (!flag2)
        {
            if (e == 1);
        }
        view = getChildAt(m - d);
        if (view != null)
        {
            if (L)
            {
                if (O != null)
                {
                    O.setSelected(false);
                    O = null;
                }
                view.setSelected(true);
                O = view;
            }
            view.requestFocus();
        }
        c();
        if (N != null && i1 != g)
        {
            post(new Runnable(j1) {

                final int a;
                final AviaryWorkspace b;

                public void run()
                {
                    if (com.aviary.android.feather.sdk.widget.AviaryWorkspace.a(b) != null)
                    {
                        com.aviary.android.feather.sdk.widget.AviaryWorkspace.a(b).a(AviaryWorkspace.b(b), a);
                    }
                }

            
            {
                b = AviaryWorkspace.this;
                a = i1;
                super();
            }
            });
        }
        b(m, e);
        g = i1;
        return;
_L2:
        if (flag1)
        {
            a(false);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int d(int i1)
    {
        return getTotalWidth() * i1;
    }

    private void d()
    {
        int i1 = 0;
        if (a != null)
        {
            f = a.getViewTypeCount();
            e = a.getCount();
            F = Collections.synchronizedList(new ArrayList());
            for (; i1 < f; i1++)
            {
                F.add(new LinkedList());
            }

        } else
        {
            e = 0;
        }
        c = true;
        requestLayout();
    }

    static void d(AviaryWorkspace aviaryworkspace)
    {
        aviaryworkspace.d();
    }

    private void e()
    {
        if (e > 0)
        {
            setNextSelectedPositionInt(0);
            return;
        } else
        {
            m = -1;
            g = -1;
            setNextSelectedPositionInt(-1);
            return;
        }
    }

    private void f()
    {
        int l1 = getTotalPages();
        int j1 = i;
        int i1 = 0;
        while (i1 < l1) 
        {
            View view = b(i1);
            if (view != null)
            {
                android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
                int k1 = ViewGroup.getChildMeasureSpec(G, j + l, layoutparams.height);
                view.measure(ViewGroup.getChildMeasureSpec(H, i + k, layoutparams.width), k1);
                int i2 = a(view, true);
                int j2 = view.getMeasuredHeight();
                k1 = view.getMeasuredWidth() + j1;
                view.layout(j1, i2, k1, i2 + j2);
                j1 = k1;
            }
            i1++;
        }
    }

    private void g()
    {
        int k1 = d(m + 2);
        int i1 = getChildCount();
        int l1 = e;
        View view = getChildAt(i1 - 1);
        int j1;
        if (view != null)
        {
            j1 = d + i1;
            i1 = view.getRight() + 0;
        } else
        {
            j1 = e - 1;
            d = j1;
            i1 = i;
        }
        for (; i1 < k1 && j1 < l1; j1++)
        {
            i1 = a(j1, j1 - m, i1, true).getRight() + 0;
        }

    }

    private int getTotalWidth()
    {
        return getWidth();
    }

    private void h()
    {
        int k1 = d(m - 1);
        View view = getChildAt(0);
        int i1;
        int j1;
        if (view != null)
        {
            j1 = d - 1;
            i1 = view.getLeft() - 0;
        } else
        {
            i1 = getRight() - getLeft() - k;
            j1 = 0;
        }
        for (; i1 > k1 && j1 >= 0; j1--)
        {
            View view1 = a(j1, j1 - m, i1, false);
            d = j1;
            i1 = view1.getLeft() - 0;
        }

    }

    private void i()
    {
        if (F != null)
        {
            for (; F.size() > 0; ((Queue)F.remove(0)).clear()) { }
            F.clear();
        }
    }

    private void j()
    {
        if (q != null)
        {
            q.recycle();
            q = null;
        }
    }

    private void setNextSelectedPositionInt(int i1)
    {
        n = i1;
    }

    private void setSelectedPositionInt(int i1)
    {
        m = i1;
    }

    void a()
    {
        if (m != o)
        {
            o = m;
        }
    }

    void a(int i1)
    {
        a(i1, 0, false);
    }

    public void a(int i1, int j1)
    {
        if (M)
        {
            int k1;
            if (i1 <= j1)
            {
                int l1 = i1;
                i1 = j1;
                j1 = l1;
            }
            k1 = getChildCount();
            j1 = Math.max(j1, 0);
            k1 = Math.min(i1, k1 - 1);
            i1 = j1;
            while (i1 <= k1) 
            {
                CellLayout celllayout = (CellLayout)getChildAt(i1);
                celllayout.setChildrenDrawnWithCacheEnabled(true);
                celllayout.setChildrenDrawingCacheEnabled(true);
                i1++;
            }
        }
    }

    void a(int i1, int j1, int k1)
    {
label0:
        {
            if (i1 == 0 || i1 == e - 1)
            {
                if (j1 >= 0)
                {
                    break label0;
                }
                I.onAbsorb(k1);
            }
            return;
        }
        J.onAbsorb(k1);
    }

    public void addFocusables(ArrayList arraylist, int i1, int j1)
    {
        if (isEnabled())
        {
            View view = getChildAt(m);
            if (view != null)
            {
                view.addFocusables(arraylist, i1);
            }
            if (i1 == 17)
            {
                if (m > 0)
                {
                    View view1 = getChildAt(m - 1);
                    if (view1 != null)
                    {
                        view1.addFocusables(arraylist, i1);
                    }
                }
            } else
            if (i1 == 66 && m < e - 1)
            {
                View view2 = getChildAt(m + 1);
                if (view2 != null)
                {
                    view2.addFocusables(arraylist, i1);
                    return;
                }
            }
        }
    }

    public void addView(View view)
    {
        if (!(view instanceof CellLayout))
        {
            throw new IllegalArgumentException("A Workspace can only have CellLayout children.");
        } else
        {
            super.addView(view);
            return;
        }
    }

    public void addView(View view, int i1)
    {
        if (!(view instanceof CellLayout))
        {
            throw new IllegalArgumentException("A Workspace can only have CellLayout children.");
        } else
        {
            super.addView(view, i1);
            return;
        }
    }

    public void addView(View view, int i1, int j1)
    {
        if (!(view instanceof CellLayout))
        {
            throw new IllegalArgumentException("A Workspace can only have CellLayout children.");
        } else
        {
            super.addView(view, i1, j1);
            return;
        }
    }

    public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (!(view instanceof CellLayout))
        {
            throw new IllegalArgumentException("A Workspace can only have CellLayout children.");
        } else
        {
            super.addView(view, i1, layoutparams);
            return;
        }
    }

    public void addView(View view, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (!(view instanceof CellLayout))
        {
            throw new IllegalArgumentException("A Workspace can only have CellLayout children.");
        } else
        {
            super.addView(view, layoutparams);
            return;
        }
    }

    public View b(int i1)
    {
        return getChildAt(i1 - d);
    }

    void b()
    {
        View view;
        for (; getChildCount() > 0; removeDetachedView(view, false))
        {
            view = getChildAt(0);
            detachViewFromParent(view);
        }

        i();
        o = -1;
        setSelectedPositionInt(-1);
        setNextSelectedPositionInt(-1);
        g = -1;
        postInvalidate();
    }

    public void c()
    {
        if (M)
        {
            int j1 = getChildCount();
            int i1 = 0;
            while (i1 < j1) 
            {
                CellLayout celllayout = (CellLayout)getChildAt(i1);
                celllayout.setChildrenDrawnWithCacheEnabled(false);
                celllayout.setChildrenDrawingCacheEnabled(false);
                i1++;
            }
        }
    }

    public void computeScroll()
    {
        if (p.computeScrollOffset())
        {
            D = p.getCurrX();
            float f1 = D;
            C = (float)System.nanoTime() / 1E+09F;
            float f3 = p.getCurrY();
            scrollTo((int)f1, (int)f3);
            postInvalidate();
        } else
        {
            if (n != -1)
            {
                c(Math.max(0, Math.min(n, e - 1)));
                return;
            }
            if (u == 1)
            {
                float f2 = (float)System.nanoTime() / 1E+09F;
                float f4 = (float)Math.exp((f2 - C) / A);
                float f5 = D - (float)getScrollX();
                scrollTo((int)(f4 * f5 + (float)getScrollX()), 0);
                C = f2;
                if (f5 > 1.0F || f5 < -1F)
                {
                    postInvalidate();
                    return;
                }
            }
        }
    }

    protected void dispatchDraw(Canvas canvas)
    {
_L2:
        return;
        if (e < 1 || m < 0) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (u != 1 && n == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            drawChild(canvas, getChildAt(m - d), getDrawingTime());
        }
        catch (RuntimeException runtimeexception)
        {
            runtimeexception.printStackTrace();
        }
_L4:
        if (I != null && e > 1)
        {
            a(canvas);
            return;
        }
        if (true) goto _L2; else goto _L3
_L3:
        long l1 = getDrawingTime();
        float f1 = (float)getScrollX() / (float)getTotalWidth();
        int i1 = (int)f1;
        int j1 = i1 + 1;
        if (i1 >= 0)
        {
            try
            {
                drawChild(canvas, getChildAt(i1 - d), l1);
            }
            catch (RuntimeException runtimeexception2)
            {
                runtimeexception2.printStackTrace();
            }
        }
        if (f1 != (float)i1 && j1 < e)
        {
            try
            {
                drawChild(canvas, getChildAt(j1 - d), l1);
            }
            catch (RuntimeException runtimeexception1)
            {
                runtimeexception1.printStackTrace();
            }
        }
          goto _L4
        if (true) goto _L2; else goto _L5
_L5:
    }

    public boolean dispatchUnhandledMove(View view, int i1)
    {
        if (i1 == 17)
        {
            if (getCurrentScreen() > 0)
            {
                a(getCurrentScreen() - 1);
                return true;
            }
        } else
        if (i1 == 66 && getCurrentScreen() < e - 1)
        {
            a(getCurrentScreen() + 1);
            return true;
        }
        return super.dispatchUnhandledMove(view, i1);
    }

    public void focusableViewAvailable(View view)
    {
        View view1;
        View view2;
        view2 = getChildAt(m);
        view1 = view;
_L6:
        if (view1 != view2) goto _L2; else goto _L1
_L1:
        super.focusableViewAvailable(view);
_L4:
        return;
_L2:
        if (view1 == this || !(view1.getParent() instanceof View)) goto _L4; else goto _L3
_L3:
        view1 = (View)view1.getParent();
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new android.widget.LinearLayout.LayoutParams(-1, -1);
    }

    public Adapter getAdapter()
    {
        return a;
    }

    public int getCurrentScreen()
    {
        return m;
    }

    public int getOverScroll()
    {
        return K;
    }

    public int getTotalPages()
    {
        return e;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag2;
        flag2 = true;
        i1 = motionevent.getAction();
        if (isEnabled()) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L4:
        return flag1;
_L2:
        if (i1 != 2)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag2;
        if (u != 0) goto _L4; else goto _L3
_L3:
        b(motionevent);
        i1 & 0xff;
        JVM INSTR tableswitch 0 6: default 92
    //                   0 270
    //                   1 337
    //                   2 105
    //                   3 337
    //                   4 92
    //                   5 92
    //                   6 363;
           goto _L5 _L6 _L7 _L8 _L7 _L5 _L5 _L9
_L9:
        break MISSING_BLOCK_LABEL_363;
_L5:
        break; /* Loop/switch isn't completed */
_L8:
        break; /* Loop/switch isn't completed */
_L12:
        flag1 = flag2;
        if (u == 0)
        {
            return false;
        }
        if (true) goto _L4; else goto _L10
_L10:
        i1 = motionevent.findPointerIndex(y);
        flag1 = flag2;
        if (i1 < 0) goto _L4; else goto _L11
_L11:
        float f1 = motionevent.getX(i1);
        float f3 = motionevent.getY(i1);
        i1 = (int)Math.abs(f1 - r);
        int k1 = (int)Math.abs(f3 - t);
        int l1 = w;
        boolean flag;
        if (i1 > l1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (k1 > l1)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        s = f1;
        if ((flag || k1) && flag)
        {
            u = 1;
            r = f1;
            D = getScrollX();
            C = (float)System.nanoTime() / 1E+09F;
            a(m - 1, m + 1);
        }
          goto _L12
_L6:
        float f2 = motionevent.getX();
        float f4 = motionevent.getY();
        r = f2;
        s = f2;
        t = f4;
        y = motionevent.getPointerId(0);
        v = true;
        int j1;
        if (p.isFinished())
        {
            j1 = 0;
        } else
        {
            j1 = 1;
        }
        u = j1;
          goto _L12
_L7:
        c();
        u = 0;
        y = -1;
        v = false;
        j();
          goto _L12
        a(motionevent);
          goto _L12
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        if (flag || c)
        {
            e();
        }
        if (e >= 1)
        {
            if (c)
            {
                if (m > -1)
                {
                    scrollTo((k1 - i1) * m, 0);
                } else
                {
                    scrollTo(0, 0);
                }
            }
            if (n > -1)
            {
                setSelectedPositionInt(n);
            }
            if (c)
            {
                d = h;
                i1 = i;
                j1 = getRight();
                k1 = getLeft();
                l1 = i;
                int i2 = k;
                View view = a(m, 0, 0, true);
                view.offsetLeftAndRight((i1 + (j1 - k1 - (l1 + i2)) / 2) - view.getWidth() / 2);
                g();
                h();
                a();
            }
            c = false;
            setNextSelectedPositionInt(m);
            if (flag && !c)
            {
                f();
                return;
            }
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        H = i1;
        G = j1;
        i1 = android.view.View.MeasureSpec.getMode(i1);
        j1 = android.view.View.MeasureSpec.getMode(j1);
        if (i1 == 0x40000000);
        if (j1 == 0x40000000);
    }

    protected boolean onRequestFocusInDescendants(int i1, Rect rect)
    {
        if (e >= 1 && isEnabled())
        {
            int j1;
            if (n != -1)
            {
                j1 = n;
            } else
            {
                j1 = m;
            }
            if (j1 != -1)
            {
                View view = getChildAt(j1);
                if (view != null)
                {
                    view.requestFocus(i1, rect);
                    return false;
                }
            }
        }
        return false;
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).a != -1)
        {
            m = ((SavedState) (parcelable)).a;
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = m;
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        i1 = motionevent.getAction();
        if (!isEnabled())
        {
            if (!p.isFinished())
            {
                p.abortAnimation();
            }
            a(m);
            return false;
        }
        b(motionevent);
        i1 & 0xff;
        JVM INSTR tableswitch 0 6: default 92
    //                   0 94
    //                   1 473
    //                   2 163
    //                   3 707
    //                   4 92
    //                   5 92
    //                   6 779;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L1 _L6
_L1:
        return true;
_L2:
        if (!p.isFinished())
        {
            p.abortAnimation();
        }
        r = motionevent.getX();
        s = motionevent.getX();
        y = motionevent.getPointerId(0);
        if (u == 1)
        {
            a(m - 1, m + 1);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (u == 1)
        {
            float f4 = motionevent.getX(motionevent.findPointerIndex(y));
            float f1 = r - f4;
            float f3 = s - f4;
            int j1 = K;
            r = f4;
            if (f1 < 0.0F)
            {
                D = D + f1;
                C = (float)System.nanoTime() / 1E+09F;
                if (D < 0.0F && j1 != 0)
                {
                    r = 0.0F;
                    D = 0.0F;
                    if (I != null && f3 < 0.0F)
                    {
                        I.onPull(f1 / (float)getWidth());
                        if (!J.isFinished())
                        {
                            J.onRelease();
                        }
                    }
                }
                invalidate();
            } else
            if (f1 > 0.0F)
            {
                int k2 = d(e - 1);
                float f5 = (float)d(e) - D;
                C = (float)System.nanoTime() / 1E+09F;
                D = D + Math.min(f5, f1);
                if (f5 <= (float)getWidth() && j1 != 0)
                {
                    float f6 = k2;
                    r = f6;
                    D = f6;
                    if (I != null && f3 > 0.0F)
                    {
                        J.onPull(f1 / (float)getWidth());
                        if (!I.isFinished())
                        {
                            I.onRelease();
                        }
                    }
                }
                invalidate();
            } else
            {
                awakenScrollBars();
            }
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (u == 1)
        {
            motionevent = q;
            motionevent.computeCurrentVelocity(1000, x);
            int l2 = (int)motionevent.getXVelocity(y);
            int k1 = getWidth();
            int i3 = (getScrollX() + k1 / 2) / k1;
            float f2 = (float)getScrollX() / (float)k1;
            if (l2 > 600 && m > 0)
            {
                int l1;
                if (f2 < (float)i3)
                {
                    l1 = m - 1;
                } else
                {
                    l1 = m;
                }
                a(Math.min(i3, l1), l2, true);
            } else
            if (l2 < -600 && m < e - 1)
            {
                int i2;
                if (f2 > (float)i3)
                {
                    i2 = m + 1;
                } else
                {
                    i2 = m;
                }
                a(Math.max(i3, i2), l2, true);
            } else
            {
                a(i3, 0, true);
            }
            if (I != null)
            {
                I.onRelease();
                J.onRelease();
            }
        }
        u = 0;
        y = -1;
        j();
        continue; /* Loop/switch isn't completed */
_L5:
        if (u == 1)
        {
            int j2 = getWidth();
            a((getScrollX() + j2 / 2) / j2, 0, true);
        }
        u = 0;
        y = -1;
        j();
        if (I != null)
        {
            I.onRelease();
            J.onRelease();
        }
        continue; /* Loop/switch isn't completed */
_L6:
        a(motionevent);
        if (true) goto _L1; else goto _L7
_L7:
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
    {
        int i1 = indexOfChild(view) + d;
        if (i1 != m || !p.isFinished())
        {
            a(i1);
            return true;
        } else
        {
            return false;
        }
    }

    public void scrollTo(int i1, int j1)
    {
        super.scrollTo(i1, j1);
        D = i1;
        C = (float)System.nanoTime() / 1E+09F;
    }

    public void setAdapter(Adapter adapter)
    {
        if (a != null)
        {
            a.unregisterDataSetObserver(b);
            a = null;
        }
        a = adapter;
        b();
        if (a != null)
        {
            b = new b();
            a.registerDataSetObserver(b);
        }
        d();
    }

    public void setAllowChildSelection(boolean flag)
    {
        L = flag;
    }

    public void setAllowLongPress(boolean flag)
    {
        v = flag;
    }

    public void setCacheEnabled(boolean flag)
    {
        M = flag;
    }

    void setCurrentScreen(int i1)
    {
        if (B)
        {
            Log.i("Workspace", (new StringBuilder()).append("setCurrentScreen: ").append(i1).toString());
        }
        if (!p.isFinished())
        {
            p.abortAnimation();
        }
        m = Math.max(0, Math.min(i1, e - 1));
        if (z != null)
        {
            z.a(m, e);
        }
        scrollTo(m * getWidth(), 0);
        invalidate();
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        for (int i1 = 0; i1 < getChildCount(); i1++)
        {
            getChildAt(i1).setEnabled(flag);
        }

    }

    public void setIndicator(AviaryWorkspaceIndicator aviaryworkspaceindicator)
    {
        z = aviaryworkspaceindicator;
        z.a(m, e);
    }

    public void setOnPageChangeListener(a a1)
    {
        N = a1;
    }

    public void setOverScroll(int i1)
    {
        if (i1 != 0)
        {
            if (I == null)
            {
                I = new EdgeEffectCompat(getContext());
                J = new EdgeEffectCompat(getContext());
            }
        } else
        {
            I = null;
            J = null;
        }
        K = i1;
    }

    static 
    {
        B = com.aviary.android.feather.common.a.a.a;
    }
}
