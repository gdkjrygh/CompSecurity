// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.OverScroller;

public class ResolverDrawerLayout extends ViewGroup
{
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        public boolean a;
        public boolean b;

        public LayoutParams(int i1, int j1)
        {
            super(i1, j1);
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            context = context.obtainStyledAttributes(attributeset, com.pandora.android.R.styleable.ResolverDrawerLayout_LayoutParams);
            a = context.getBoolean(1, false);
            b = context.getBoolean(2, false);
            context.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            a = layoutparams.a;
            b = layoutparams.b;
        }
    }

    static class SavedState extends android.view.View.BaseSavedState
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
        boolean a;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            if (a)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a = flag;
        }


        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }


    private int a;
    private int b;
    private int c;
    private boolean d;
    private float e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private boolean j;
    private final int k;
    private final float l;
    private final OverScroller m;
    private final VelocityTracker n;
    private android.view.View.OnClickListener o;
    private float p;
    private float q;
    private float r;
    private int s;
    private final Rect t;
    private final android.view.ViewTreeObserver.OnTouchModeChangeListener u;

    public ResolverDrawerLayout(Context context)
    {
        this(context, null);
    }

    public ResolverDrawerLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ResolverDrawerLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        s = -1;
        t = new Rect();
        u = new android.view.ViewTreeObserver.OnTouchModeChangeListener() {

            final ResolverDrawerLayout a;

            public void onTouchModeChanged(boolean flag)
            {
                if (!flag && a.hasFocus() && ResolverDrawerLayout.a(a, a.getFocusedChild()))
                {
                    ResolverDrawerLayout.a(a, 0, 0.0F);
                }
            }

            
            {
                a = ResolverDrawerLayout.this;
                super();
            }
        };
        attributeset = context.obtainStyledAttributes(attributeset, com.pandora.android.R.styleable.ResolverDrawerLayout, i1, 0);
        a = attributeset.getDimensionPixelSize(2, -1);
        b = attributeset.getDimensionPixelSize(0, 0);
        c = attributeset.getDimensionPixelSize(1, b);
        attributeset.recycle();
        m = new OverScroller(context, AnimationUtils.loadInterpolator(context, 0x10c0005));
        n = VelocityTracker.obtain();
        context = ViewConfiguration.get(context);
        k = context.getScaledTouchSlop();
        l = context.getScaledMinimumFlingVelocity();
    }

    private float a(float f1)
    {
        float f2 = 0.0F;
        float f3 = Math.max(0.0F, Math.min(e + f1, f));
        f1 = f2;
        if (f3 != e)
        {
            f1 = f3 - e;
            int j1 = getChildCount();
            for (int i1 = 0; i1 < j1; i1++)
            {
                View view = getChildAt(i1);
                if (!((LayoutParams)view.getLayoutParams()).b)
                {
                    view.offsetTopAndBottom((int)f1);
                }
            }

            e = f3;
            g = (int)((float)g + f1);
        }
        return f1;
    }

    private View a(float f1, float f2)
    {
        return a(((ViewGroup) (this)), f1, f2);
    }

    private static View a(ViewGroup viewgroup, float f1, float f2)
    {
        for (int i1 = viewgroup.getChildCount() - 1; i1 >= 0; i1--)
        {
            View view = viewgroup.getChildAt(i1);
            if (a(view, f1, f2))
            {
                return view;
            }
        }

        return null;
    }

    private void a(int i1, float f1)
    {
        if (getMaxCollapsedHeight() != 0)
        {
            m.abortAnimation();
            int j1 = (int)e;
            int k1 = i1 - j1;
            if (k1 != 0)
            {
                i1 = getHeight();
                int l1 = i1 / 2;
                float f4 = Math.min(1.0F, ((float)Math.abs(k1) * 1.0F) / (float)i1);
                float f2 = l1;
                float f3 = l1;
                f4 = b(f4);
                f1 = Math.abs(f1);
                if (f1 > 0.0F)
                {
                    i1 = Math.round(1000F * Math.abs((f3 * f4 + f2) / f1)) * 4;
                } else
                {
                    i1 = (int)(((float)Math.abs(k1) / (float)i1 + 1.0F) * 100F);
                }
                i1 = Math.min(i1, 300);
                m.startScroll(0, j1, 0, k1, i1);
                return;
            }
        }
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = motionevent.getActionIndex();
        if (motionevent.getPointerId(i1) == s)
        {
            float f1;
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            p = motionevent.getX(i1);
            f1 = motionevent.getY(i1);
            r = f1;
            q = f1;
            s = motionevent.getPointerId(i1);
        }
    }

    static void a(ResolverDrawerLayout resolverdrawerlayout, int i1, float f1)
    {
        resolverdrawerlayout.a(i1, f1);
    }

    private boolean a(View view)
    {
        t.set(0, 0, view.getWidth(), view.getHeight());
        offsetDescendantRectToMyCoords(view, t);
        int i1;
        int j1;
        int k1;
        int l1;
        if (view.getParent() != this)
        {
            android.view.ViewParent viewparent = view.getParent();
            while (viewparent != this) 
            {
                view = (View)viewparent;
                viewparent = view.getParent();
            }
        }
        j1 = getHeight();
        l1 = getPaddingBottom();
        k1 = getChildCount();
        i1 = indexOfChild(view);
        j1 -= l1;
        i1++;
        while (i1 < k1) 
        {
            view = getChildAt(i1);
            if (view.getVisibility() != 8)
            {
                j1 = Math.min(j1, view.getTop());
            }
            i1++;
        }
        return t.bottom > j1;
    }

    private static boolean a(View view, float f1, float f2)
    {
        float f3 = view.getX();
        float f4 = view.getY();
        float f5 = view.getWidth();
        float f6 = view.getHeight();
        return f1 >= f3 && f2 >= f4 && f1 < f5 + f3 && f2 < f6 + f4;
    }

    static boolean a(ResolverDrawerLayout resolverdrawerlayout, View view)
    {
        return resolverdrawerlayout.a(view);
    }

    private float b(float f1)
    {
        return (float)Math.sin((float)((double)(f1 - 0.5F) * 0.4712389167638204D));
    }

    private View b(float f1, float f2)
    {
        View view = a(f1, f2);
        do
        {
label0:
            {
                View view1 = view;
                if (view != null)
                {
                    f1 -= view.getX();
                    f2 -= view.getY();
                    if (!(view instanceof AbsListView))
                    {
                        break label0;
                    }
                    view1 = a((ViewGroup)view, f1, f2);
                }
                return view1;
            }
            if (view instanceof ViewGroup)
            {
                view = a((ViewGroup)view, f1, f2);
            } else
            {
                view = null;
            }
        } while (true);
    }

    private void b()
    {
        s = -1;
        h = false;
        i = false;
        r = 0.0F;
        q = 0.0F;
        p = 0.0F;
        n.clear();
    }

    private boolean c(float f1, float f2)
    {
        View view = b(f1, f2);
        return view != null && a(view);
    }

    private int getMaxCollapsedHeight()
    {
        if (a())
        {
            return c;
        } else
        {
            return b;
        }
    }

    public boolean a()
    {
        return d;
    }

    public void computeScroll()
    {
        super.computeScroll();
        if (!m.isFinished())
        {
            boolean flag = m.computeScrollOffset();
            a((float)m.getCurrY() - e);
            if (!flag);
        }
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams(-1, -2);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof LayoutParams)
        {
            return new LayoutParams((LayoutParams)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnTouchModeChangeListener(u);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnTouchModeChangeListener(u);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag2;
        flag2 = false;
        i1 = motionevent.getActionMasked();
        if (i1 == 0)
        {
            n.clear();
        }
        n.addMovement(motionevent);
        i1;
        JVM INSTR tableswitch 0 6: default 72
    //                   0 110
    //                   1 281
    //                   2 169
    //                   3 281
    //                   4 72
    //                   5 72
    //                   6 273;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L1 _L5
_L1:
        boolean flag;
label0:
        {
            if (h)
            {
                m.abortAnimation();
            }
            if (!h)
            {
                flag = flag2;
                if (!i)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
_L2:
        float f1 = motionevent.getX();
        float f3 = motionevent.getY();
        p = f1;
        r = f3;
        q = f3;
        boolean flag1;
        if (c(f1, f3) && f > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        i = flag1;
        continue; /* Loop/switch isn't completed */
_L4:
        float f2 = motionevent.getX();
        float f4 = motionevent.getY();
        float f5 = f4 - q;
        if (Math.abs(f5) > (float)k && a(f2, f4) != null && (getNestedScrollAxes() & 2) == 0)
        {
            s = motionevent.getPointerId(0);
            h = true;
            r = Math.max(r - (float)k, Math.min(r + f5, r + (float)k));
        }
        continue; /* Loop/switch isn't completed */
_L5:
        a(motionevent);
        continue; /* Loop/switch isn't completed */
_L3:
        b();
        if (true) goto _L1; else goto _L6
_L6:
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        l1 = getWidth();
        i1 = g;
        int i2 = getPaddingLeft();
        int j2 = getPaddingRight();
        int k2 = getChildCount();
        j1 = 0;
        while (j1 < k2) 
        {
            View view = getChildAt(j1);
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            if (view.getVisibility() != 8)
            {
                k1 = i1 + layoutparams.topMargin;
                i1 = k1;
                if (layoutparams.b)
                {
                    i1 = (int)((float)k1 - e);
                }
                k1 = view.getMeasuredHeight() + i1;
                int l2 = view.getMeasuredWidth();
                int i3 = (l1 - j2 - i2 - l2) / 2 + i2;
                view.layout(i3, i1, l2 + i3, k1);
                i1 = layoutparams.bottomMargin + k1;
            }
            j1++;
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int j2 = android.view.View.MeasureSpec.getSize(i1);
        int k2 = android.view.View.MeasureSpec.getSize(j1);
        float f1;
        int l1;
        int l2;
        int i3;
        int j3;
        int k3;
        if (a >= 0)
        {
            i1 = Math.min(j2, a);
        } else
        {
            i1 = j2;
        }
        l2 = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
        i3 = android.view.View.MeasureSpec.makeMeasureSpec(k2, 0x40000000);
        j3 = getPaddingLeft() + getPaddingRight();
        i1 = getPaddingTop() + getPaddingBottom();
        k3 = getChildCount();
        for (j1 = 0; j1 < k3;)
        {
            View view = getChildAt(j1);
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            int k1 = i1;
            if (layoutparams.a)
            {
                k1 = i1;
                if (view.getVisibility() != 8)
                {
                    measureChildWithMargins(view, l2, j3, i3, i1);
                    k1 = i1 + (layoutparams.topMargin + view.getMeasuredHeight() + layoutparams.bottomMargin);
                }
            }
            j1++;
            i1 = k1;
        }

        j1 = 0;
        int i2;
        for (l1 = i1; j1 < k3; l1 = i2)
        {
            View view1 = getChildAt(j1);
            LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
            i2 = l1;
            if (!layoutparams1.a)
            {
                i2 = l1;
                if (view1.getVisibility() != 8)
                {
                    measureChildWithMargins(view1, l2, j3, i3, l1);
                    i2 = layoutparams1.topMargin;
                    int l3 = view1.getMeasuredHeight();
                    i2 = l1 + (layoutparams1.bottomMargin + (i2 + l3));
                }
            }
            j1++;
        }

        f = Math.max(0, l1 - i1 - getMaxCollapsedHeight());
        if (j)
        {
            f1 = 0.0F;
        } else
        {
            f1 = f;
        }
        e = f1;
        g = Math.max(0, k2 - l1) + (int)e;
        setMeasuredDimension(j2, k2);
    }

    public boolean onNestedFling(View view, float f1, float f2, boolean flag)
    {
        boolean flag2 = false;
        int i1 = 0;
        boolean flag1 = flag2;
        if (!flag)
        {
            flag1 = flag2;
            if (Math.abs(f2) > l)
            {
                if (f2 <= 0.0F)
                {
                    i1 = f;
                }
                a(i1, f2);
                flag1 = true;
            }
        }
        return flag1;
    }

    public boolean onNestedPreFling(View view, float f1, float f2)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (f2 > l)
        {
            flag = flag1;
            if (e != 0.0F)
            {
                a(0, f2);
                flag = true;
            }
        }
        return flag;
    }

    public void onNestedPreScroll(View view, int i1, int j1, int ai[])
    {
        if (j1 > 0)
        {
            ai[1] = (int)(-a(-j1));
        }
    }

    public void onNestedScroll(View view, int i1, int j1, int k1, int l1)
    {
        if (l1 < 0)
        {
            a(-l1);
        }
    }

    public void onNestedScrollAccepted(View view, View view1, int i1)
    {
        super.onNestedScrollAccepted(view, view1, i1);
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        j = ((SavedState) (parcelable)).a;
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        boolean flag;
        if (f > 0 && e == 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        savedstate.a = flag;
        return savedstate;
    }

    public boolean onStartNestedScroll(View view, View view1, int i1)
    {
        return (i1 & 2) != 0;
    }

    public void onStopNestedScroll(View view)
    {
        super.onStopNestedScroll(view);
        if (m.isFinished())
        {
            int i1;
            if (e < (float)(f / 2))
            {
                i1 = 0;
            } else
            {
                i1 = f;
            }
            a(i1, 0.0F);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        int j1;
        int k1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        j1 = 1;
        flag1 = false;
        i1 = 0;
        flag2 = false;
        k1 = motionevent.getActionMasked();
        n.addMovement(motionevent);
        flag = flag2;
        k1;
        JVM INSTR tableswitch 0 6: default 76
    //                   0 83
    //                   1 464
    //                   2 177
    //                   3 693
    //                   4 80
    //                   5 402
    //                   6 452;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L5:
        break MISSING_BLOCK_LABEL_693;
_L6:
        break; /* Loop/switch isn't completed */
_L1:
        flag = flag2;
_L10:
        return flag;
_L2:
        float f1 = motionevent.getX();
        float f2 = motionevent.getY();
        p = f1;
        r = f2;
        q = f2;
        s = motionevent.getPointerId(0);
        float f3;
        if (a(p, q) == null && o != null)
        {
            h = true;
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (f <= 0)
        {
            j1 = 0;
        }
        flag = i1 | j1;
        m.abortAnimation();
        continue; /* Loop/switch isn't completed */
_L4:
        j1 = motionevent.findPointerIndex(s);
        i1 = j1;
        if (j1 < 0)
        {
            Log.e("ResolverDrawerLayout", (new StringBuilder()).append("Bad pointer id ").append(s).append(", resetting").toString());
            s = motionevent.getPointerId(0);
            p = motionevent.getX();
            f1 = motionevent.getY();
            r = f1;
            q = f1;
            i1 = 0;
        }
        f1 = motionevent.getX(i1);
        f2 = motionevent.getY(i1);
        flag = flag1;
        if (!h)
        {
            f3 = f2 - q;
            flag = flag1;
            if (Math.abs(f3) > (float)k)
            {
                flag = flag1;
                if (a(f1, f2) != null)
                {
                    h = true;
                    r = Math.max(r - (float)k, Math.min(r + f3, r + (float)k));
                    flag = true;
                }
            }
        }
        if (h)
        {
            a(f2 - r);
        }
        r = f2;
        continue; /* Loop/switch isn't completed */
_L7:
        i1 = motionevent.getActionIndex();
        s = motionevent.getPointerId(i1);
        p = motionevent.getX(i1);
        f1 = motionevent.getY(i1);
        r = f1;
        q = f1;
        flag = flag2;
        continue; /* Loop/switch isn't completed */
_L8:
        a(motionevent);
        flag = flag2;
        continue; /* Loop/switch isn't completed */
_L3:
        h = false;
        if (!h && a(p, q) == null && a(motionevent.getX(), motionevent.getY()) == null && o != null)
        {
            o.onClick(this);
            b();
            return true;
        }
        if (i && Math.abs(motionevent.getX() - p) < (float)k && Math.abs(motionevent.getY() - q) < (float)k)
        {
            a(0, 0.0F);
            return true;
        }
        n.computeCurrentVelocity(1000);
        f1 = n.getYVelocity(s);
        if (Math.abs(f1) <= l)
        {
            break; /* Loop/switch isn't completed */
        }
        if (f1 < 0.0F)
        {
            i1 = 0;
        } else
        {
            i1 = f;
        }
        a(i1, f1);
_L11:
        b();
        flag = flag2;
        if (true) goto _L10; else goto _L9
_L9:
        if (e < (float)(f / 2))
        {
            i1 = 0;
        } else
        {
            i1 = f;
        }
        a(i1, 0.0F);
          goto _L11
        if (true) goto _L10; else goto _L12
_L12:
        if (h)
        {
            if (e >= (float)(f / 2))
            {
                i1 = f;
            }
            a(i1, 0.0F);
        }
        b();
        return true;
    }

    public void requestChildFocus(View view, View view1)
    {
        super.requestChildFocus(view, view1);
        if (!isInTouchMode() && a(view1))
        {
            a(0, 0.0F);
        }
    }

    public void setOnClickOutsideListener(android.view.View.OnClickListener onclicklistener)
    {
        o = onclicklistener;
    }

    public void setSmallCollapsed(boolean flag)
    {
        d = flag;
        requestLayout();
    }
}
