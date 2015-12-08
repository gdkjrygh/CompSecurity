// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.c.a.a;
import android.support.v4.view.ac;
import android.support.v4.view.f;
import android.support.v4.view.g;
import android.support.v4.view.n;
import android.support.v4.view.x;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.widget:
//            h, u, g

public class DrawerLayout extends ViewGroup
    implements android.support.v4.widget.h
{
    protected static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object[] newArray(int i)
            {
                return new SavedState[i];
            }

        };
        int a;
        int b;
        int c;

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeInt(a);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            a = 0;
            b = 0;
            c = 0;
            a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
            a = 0;
            b = 0;
            c = 0;
        }
    }

    final class a extends android.support.v4.view.a
    {

        final DrawerLayout a;
        private final Rect b = new Rect();

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            if (accessibilityevent.getEventType() == 32)
            {
                view = accessibilityevent.getText();
                accessibilityevent = a.findVisibleDrawer();
                if (accessibilityevent != null)
                {
                    int i = a.getDrawerViewAbsoluteGravity(accessibilityevent);
                    accessibilityevent = a.getDrawerTitle(i);
                    if (accessibilityevent != null)
                    {
                        view.add(accessibilityevent);
                    }
                }
                return true;
            } else
            {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityevent);
            }
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityevent)
        {
            super.onInitializeAccessibilityEvent(view, accessibilityevent);
            accessibilityevent.setClassName(android/support/v4/widget/DrawerLayout.getName());
        }

        public final void onInitializeAccessibilityNodeInfo(View view, android.support.v4.view.a.c c1)
        {
            if (DrawerLayout.CAN_HIDE_DESCENDANTS)
            {
                super.onInitializeAccessibilityNodeInfo(view, c1);
            } else
            {
                android.support.v4.view.a.c c2 = android.support.v4.view.a.c.a(c1);
                super.onInitializeAccessibilityNodeInfo(view, c2);
                android.support.v4.view.a.c.a.c(c1.b, view);
                Object obj = x.i(view);
                if (obj instanceof View)
                {
                    c1.b((View)obj);
                }
                obj = b;
                c2.a(((Rect) (obj)));
                c1.b(((Rect) (obj)));
                c2.c(((Rect) (obj)));
                c1.d(((Rect) (obj)));
                c1.c(android.support.v4.view.a.c.a.r(c2.b));
                c1.a(c2.i());
                c1.b(c2.j());
                c1.c(c2.l());
                c1.e(c2.h());
                boolean flag = c2.f();
                android.support.v4.view.a.c.a.a(c1.b, flag);
                c1.a(c2.c());
                c1.b(c2.d());
                c1.d(android.support.v4.view.a.c.a.s(c2.b));
                flag = c2.e();
                android.support.v4.view.a.c.a.g(c1.b, flag);
                flag = c2.g();
                android.support.v4.view.a.c.a.e(c1.b, flag);
                c1.a(c2.b());
                android.support.v4.view.a.c.a.q(c2.b);
                view = (ViewGroup)view;
                int j = view.getChildCount();
                int i = 0;
                while (i < j) 
                {
                    View view1 = view.getChildAt(i);
                    if (DrawerLayout.includeChildForAccessibility(view1))
                    {
                        android.support.v4.view.a.c.a.a(c1.b, view1);
                    }
                    i++;
                }
            }
            c1.b(android/support/v4/widget/DrawerLayout.getName());
            c1.a(false);
            c1.b(false);
            c1.a(android.support.v4.view.a.c.a.a);
            c1.a(android.support.v4.view.a.c.a.b);
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            if (DrawerLayout.CAN_HIDE_DESCENDANTS || DrawerLayout.includeChildForAccessibility(view))
            {
                return super.onRequestSendAccessibilityEvent(viewgroup, view, accessibilityevent);
            } else
            {
                return false;
            }
        }

        a()
        {
            a = DrawerLayout.this;
            super();
        }
    }

    final class b extends android.support.v4.view.a
    {

        final DrawerLayout a;

        public final void onInitializeAccessibilityNodeInfo(View view, android.support.v4.view.a.c c1)
        {
            super.onInitializeAccessibilityNodeInfo(view, c1);
            if (!DrawerLayout.includeChildForAccessibility(view))
            {
                c1.b(null);
            }
        }

        b()
        {
            a = DrawerLayout.this;
            super();
        }
    }

    static interface c
    {

        public abstract int a(Object obj);

        public abstract Drawable a(Context context);

        public abstract void a(View view);

        public abstract void a(View view, Object obj, int i);

        public abstract void a(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i);
    }

    static final class d
        implements c
    {

        public final int a(Object obj)
        {
            return android.support.v4.widget.g.a(obj);
        }

        public final Drawable a(Context context)
        {
            return android.support.v4.widget.g.a(context);
        }

        public final void a(View view)
        {
            android.support.v4.widget.g.a(view);
        }

        public final void a(View view, Object obj, int i)
        {
            android.support.v4.widget.g.a(view, obj, i);
        }

        public final void a(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i)
        {
            android.support.v4.widget.g.a(marginlayoutparams, obj, i);
        }

        d()
        {
        }
    }

    static final class e
        implements c
    {

        public final int a(Object obj)
        {
            return 0;
        }

        public final Drawable a(Context context)
        {
            return null;
        }

        public final void a(View view)
        {
        }

        public final void a(View view, Object obj, int i)
        {
        }

        public final void a(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i)
        {
        }

        e()
        {
        }
    }

    public static interface f
    {

        public abstract void onDrawerClosed(View view);

        public abstract void onDrawerOpened(View view);

        public abstract void onDrawerSlide(View view, float f1);

        public abstract void onDrawerStateChanged(int i);
    }

    public static final class g extends android.view.ViewGroup.MarginLayoutParams
    {

        public int a;
        float b;
        boolean c;
        boolean d;

        public g()
        {
            super(-1, -1);
            a = 0;
        }

        public g(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = 0;
            context = context.obtainStyledAttributes(attributeset, DrawerLayout.LAYOUT_ATTRS);
            a = context.getInt(0, 0);
            context.recycle();
        }

        public g(g g1)
        {
            super(g1);
            a = 0;
            a = g1.a;
        }

        public g(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 0;
        }

        public g(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            a = 0;
        }
    }

    private final class h extends u.a
    {

        final int a;
        u b;
        final DrawerLayout c;
        private final Runnable d = new _cls1(this);

        public final int a(View view, int i)
        {
            if (c.checkDrawerViewAbsoluteGravity(view, 3))
            {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            } else
            {
                int j = c.getWidth();
                return Math.max(j - view.getWidth(), Math.min(i, j));
            }
        }

        public final void a()
        {
            c.removeCallbacks(d);
        }

        public final void a(int i)
        {
            c.updateDrawerState(a, i, b.k);
        }

        public final void a(int i, int j)
        {
            View view;
            if ((i & 1) == 1)
            {
                view = c.findDrawerWithGravity(3);
            } else
            {
                view = c.findDrawerWithGravity(5);
            }
            if (view != null && c.getDrawerLockMode(view) == 0)
            {
                b.a(view, j);
            }
        }

        public final void a(View view, float f1)
        {
            float f2;
            int k;
            f2 = c.getDrawerViewOffset(view);
            k = view.getWidth();
            if (!c.checkDrawerViewAbsoluteGravity(view, 3)) goto _L2; else goto _L1
_L1:
            int i;
            if (f1 > 0.0F || f1 == 0.0F && f2 > 0.5F)
            {
                i = 0;
            } else
            {
                i = -k;
            }
_L4:
            b.a(i, view.getTop());
            c.invalidate();
            return;
_L2:
            int j = c.getWidth();
            if (f1 >= 0.0F)
            {
                i = j;
                if (f1 != 0.0F)
                {
                    continue; /* Loop/switch isn't completed */
                }
                i = j;
                if (f2 <= 0.5F)
                {
                    continue; /* Loop/switch isn't completed */
                }
            }
            i = j - k;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final boolean a(View view)
        {
            return c.isDrawerView(view) && c.checkDrawerViewAbsoluteGravity(view, a) && c.getDrawerLockMode(view) == 0;
        }

        public final int b(View view)
        {
            if (c.isDrawerView(view))
            {
                return view.getWidth();
            } else
            {
                return 0;
            }
        }

        final void b()
        {
            byte byte0 = 3;
            if (a == 3)
            {
                byte0 = 5;
            }
            View view = c.findDrawerWithGravity(byte0);
            if (view != null)
            {
                c.closeDrawer(view);
            }
        }

        public final void b(View view, int i)
        {
            int j = view.getWidth();
            float f1;
            if (c.checkDrawerViewAbsoluteGravity(view, 3))
            {
                f1 = (float)(j + i) / (float)j;
            } else
            {
                f1 = (float)(c.getWidth() - i) / (float)j;
            }
            c.setDrawerViewOffset(view, f1);
            if (f1 == 0.0F)
            {
                i = 4;
            } else
            {
                i = 0;
            }
            view.setVisibility(i);
            c.invalidate();
        }

        public final int c(View view)
        {
            return view.getTop();
        }

        public final void c()
        {
            c.postDelayed(d, 160L);
        }

        public final void d(View view)
        {
            ((g)view.getLayoutParams()).c = false;
            b();
        }

        public h(int i)
        {
            c = DrawerLayout.this;
            super();
            a = i;
        }
    }


    private static final boolean ALLOW_EDGE_LOCK = false;
    private static final boolean CAN_HIDE_DESCENDANTS;
    private static final boolean CHILDREN_DISALLOW_INTERCEPT = true;
    private static final int DEFAULT_SCRIM_COLOR = 0x99000000;
    private static final int DRAWER_ELEVATION = 10;
    static final c IMPL;
    private static final int LAYOUT_ATTRS[] = {
        0x10100b3
    };
    public static final int LOCK_MODE_LOCKED_CLOSED = 1;
    public static final int LOCK_MODE_LOCKED_OPEN = 2;
    public static final int LOCK_MODE_UNLOCKED = 0;
    private static final int MIN_DRAWER_MARGIN = 64;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final int PEEK_DELAY = 160;
    private static final boolean SET_DRAWER_SHADOW_FROM_ELEVATION;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "DrawerLayout";
    private static final float TOUCH_SLOP_SENSITIVITY = 1F;
    private final b mChildAccessibilityDelegate;
    private boolean mChildrenCanceledTouch;
    private boolean mDisallowInterceptRequested;
    private boolean mDrawStatusBarBackground;
    private float mDrawerElevation;
    private int mDrawerState;
    private boolean mFirstLayout;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private Object mLastInsets;
    private final h mLeftCallback;
    private final u mLeftDragger;
    private f mListener;
    private int mLockModeLeft;
    private int mLockModeRight;
    private int mMinDrawerMargin;
    private final ArrayList mNonDrawerViews;
    private final h mRightCallback;
    private final u mRightDragger;
    private int mScrimColor;
    private float mScrimOpacity;
    private Paint mScrimPaint;
    private Drawable mShadowEnd;
    private Drawable mShadowLeft;
    private Drawable mShadowLeftResolved;
    private Drawable mShadowRight;
    private Drawable mShadowRightResolved;
    private Drawable mShadowStart;
    private Drawable mStatusBarBackground;
    private CharSequence mTitleLeft;
    private CharSequence mTitleRight;

    public DrawerLayout(Context context)
    {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        mChildAccessibilityDelegate = new b();
        mScrimColor = 0x99000000;
        mScrimPaint = new Paint();
        mFirstLayout = true;
        mShadowStart = null;
        mShadowEnd = null;
        mShadowLeft = null;
        mShadowRight = null;
        setDescendantFocusability(0x40000);
        float f1 = getResources().getDisplayMetrics().density;
        mMinDrawerMargin = (int)(64F * f1 + 0.5F);
        float f2 = 400F * f1;
        mLeftCallback = new h(3);
        mRightCallback = new h(5);
        mLeftDragger = android.support.v4.widget.u.a(this, 1.0F, mLeftCallback);
        mLeftDragger.j = 1;
        mLeftDragger.h = f2;
        mLeftCallback.b = mLeftDragger;
        mRightDragger = android.support.v4.widget.u.a(this, 1.0F, mRightCallback);
        mRightDragger.j = 2;
        mRightDragger.h = f2;
        mRightCallback.b = mRightDragger;
        setFocusableInTouchMode(true);
        x.d(this, 1);
        x.a(this, new a());
        ac.a(this);
        if (x.x(this))
        {
            IMPL.a(this);
            mStatusBarBackground = IMPL.a(context);
        }
        mDrawerElevation = f1 * 10F;
        mNonDrawerViews = new ArrayList();
    }

    private View findVisibleDrawer()
    {
        int j = getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view = getChildAt(i);
            if (isDrawerView(view) && isDrawerVisible(view))
            {
                return view;
            }
        }

        return null;
    }

    static String gravityToString(int i)
    {
        if ((i & 3) == 3)
        {
            return "LEFT";
        }
        if ((i & 5) == 5)
        {
            return "RIGHT";
        } else
        {
            return Integer.toHexString(i);
        }
    }

    private static boolean hasOpaqueBackground(View view)
    {
        boolean flag1 = false;
        view = view.getBackground();
        boolean flag = flag1;
        if (view != null)
        {
            flag = flag1;
            if (view.getOpacity() == -1)
            {
                flag = true;
            }
        }
        return flag;
    }

    private boolean hasPeekingDrawer()
    {
        int j = getChildCount();
        for (int i = 0; i < j; i++)
        {
            if (((g)getChildAt(i).getLayoutParams()).c)
            {
                return true;
            }
        }

        return false;
    }

    private boolean hasVisibleDrawer()
    {
        return findVisibleDrawer() != null;
    }

    private static boolean includeChildForAccessibility(View view)
    {
        return x.e(view) != 4 && x.e(view) != 2;
    }

    private boolean mirror(Drawable drawable, int i)
    {
        if (drawable == null || !android.support.v4.c.a.a.b(drawable))
        {
            return false;
        } else
        {
            android.support.v4.c.a.a.b(drawable, i);
            return true;
        }
    }

    private Drawable resolveLeftShadow()
    {
        int i = x.h(this);
        if (i == 0)
        {
            if (mShadowStart != null)
            {
                mirror(mShadowStart, i);
                return mShadowStart;
            }
        } else
        if (mShadowEnd != null)
        {
            mirror(mShadowEnd, i);
            return mShadowEnd;
        }
        return mShadowLeft;
    }

    private Drawable resolveRightShadow()
    {
        int i = x.h(this);
        if (i == 0)
        {
            if (mShadowEnd != null)
            {
                mirror(mShadowEnd, i);
                return mShadowEnd;
            }
        } else
        if (mShadowStart != null)
        {
            mirror(mShadowStart, i);
            return mShadowStart;
        }
        return mShadowRight;
    }

    private void resolveShadowDrawables()
    {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION)
        {
            return;
        } else
        {
            mShadowLeftResolved = resolveLeftShadow();
            mShadowRightResolved = resolveRightShadow();
            return;
        }
    }

    private void updateChildrenImportantForAccessibility(View view, boolean flag)
    {
        int j = getChildCount();
        int i = 0;
        while (i < j) 
        {
            View view1 = getChildAt(i);
            if (!flag && !isDrawerView(view1) || flag && view1 == view)
            {
                x.d(view1, 1);
            } else
            {
                x.d(view1, 4);
            }
            i++;
        }
    }

    public void addFocusables(ArrayList arraylist, int i, int j)
    {
        boolean flag1 = false;
        if (getDescendantFocusability() == 0x60000)
        {
            return;
        }
        int j1 = getChildCount();
        int k = 0;
        boolean flag = false;
        while (k < j1) 
        {
            View view = getChildAt(k);
            if (isDrawerView(view))
            {
                if (isDrawerOpen(view))
                {
                    flag = true;
                    view.addFocusables(arraylist, i, j);
                }
            } else
            {
                mNonDrawerViews.add(view);
            }
            k++;
        }
        if (!flag)
        {
            int i1 = mNonDrawerViews.size();
            for (int l = ((flag1) ? 1 : 0); l < i1; l++)
            {
                View view1 = (View)mNonDrawerViews.get(l);
                if (view1.getVisibility() == 0)
                {
                    view1.addFocusables(arraylist, i, j);
                }
            }

        }
        mNonDrawerViews.clear();
    }

    public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addView(view, i, layoutparams);
        if (findOpenDrawer() != null || isDrawerView(view))
        {
            x.d(view, 4);
        } else
        {
            x.d(view, 1);
        }
        if (!CAN_HIDE_DESCENDANTS)
        {
            x.a(view, mChildAccessibilityDelegate);
        }
    }

    void cancelChildViewTouch()
    {
        int i = 0;
        if (!mChildrenCanceledTouch)
        {
            long l = SystemClock.uptimeMillis();
            MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
            for (int j = getChildCount(); i < j; i++)
            {
                getChildAt(i).dispatchTouchEvent(motionevent);
            }

            motionevent.recycle();
            mChildrenCanceledTouch = true;
        }
    }

    boolean checkDrawerViewAbsoluteGravity(View view, int i)
    {
        return (getDrawerViewAbsoluteGravity(view) & i) == i;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof g) && super.checkLayoutParams(layoutparams);
    }

    public void closeDrawer(int i)
    {
        View view = findDrawerWithGravity(i);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder("No drawer view found with gravity ")).append(gravityToString(i)).toString());
        } else
        {
            closeDrawer(view);
            return;
        }
    }

    public void closeDrawer(View view)
    {
        if (!isDrawerView(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a sliding drawer").toString());
        }
        if (mFirstLayout)
        {
            view = (g)view.getLayoutParams();
            view.b = 0.0F;
            view.d = false;
        } else
        if (checkDrawerViewAbsoluteGravity(view, 3))
        {
            mLeftDragger.a(view, -view.getWidth(), view.getTop());
        } else
        {
            mRightDragger.a(view, getWidth(), view.getTop());
        }
        invalidate();
    }

    public void closeDrawers()
    {
        closeDrawers(false);
    }

    void closeDrawers(boolean flag)
    {
        int l = getChildCount();
        int j = 0;
        int i = 0;
        while (j < l) 
        {
label0:
            {
                View view = getChildAt(j);
                g g1 = (g)view.getLayoutParams();
                int k = i;
                if (!isDrawerView(view))
                {
                    break label0;
                }
                if (flag)
                {
                    k = i;
                    if (!g1.c)
                    {
                        break label0;
                    }
                }
                k = view.getWidth();
                if (checkDrawerViewAbsoluteGravity(view, 3))
                {
                    i |= mLeftDragger.a(view, -k, view.getTop());
                } else
                {
                    i |= mRightDragger.a(view, getWidth(), view.getTop());
                }
                g1.c = false;
                k = i;
            }
            j++;
            i = k;
        }
        mLeftCallback.a();
        mRightCallback.a();
        if (i != 0)
        {
            invalidate();
        }
    }

    public void computeScroll()
    {
        int j = getChildCount();
        float f1 = 0.0F;
        for (int i = 0; i < j; i++)
        {
            f1 = Math.max(f1, ((g)getChildAt(i).getLayoutParams()).b);
        }

        mScrimOpacity = f1;
        if (mLeftDragger.c() | mRightDragger.c())
        {
            x.d(this);
        }
    }

    void dispatchOnDrawerClosed(View view)
    {
        g g1 = (g)view.getLayoutParams();
        if (g1.d)
        {
            g1.d = false;
            if (mListener != null)
            {
                mListener.onDrawerClosed(view);
            }
            updateChildrenImportantForAccessibility(view, false);
            if (hasWindowFocus())
            {
                view = getRootView();
                if (view != null)
                {
                    view.sendAccessibilityEvent(32);
                }
            }
        }
    }

    void dispatchOnDrawerOpened(View view)
    {
        g g1 = (g)view.getLayoutParams();
        if (!g1.d)
        {
            g1.d = true;
            if (mListener != null)
            {
                mListener.onDrawerOpened(view);
            }
            updateChildrenImportantForAccessibility(view, true);
            if (hasWindowFocus())
            {
                sendAccessibilityEvent(32);
            }
            view.requestFocus();
        }
    }

    void dispatchOnDrawerSlide(View view, float f1)
    {
        if (mListener != null)
        {
            mListener.onDrawerSlide(view, f1);
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long l)
    {
        int i;
        int j1;
        int i2;
        int l2;
        int i4;
        int j4;
        int k4;
        boolean flag1;
        i4 = getHeight();
        flag1 = isContentView(view);
        j1 = 0;
        boolean flag = false;
        i = getWidth();
        j4 = canvas.save();
        i2 = i;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_213;
        }
        k4 = getChildCount();
        l2 = 0;
        j1 = ((flag) ? 1 : 0);
_L5:
        View view1;
        if (l2 >= k4)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        view1 = getChildAt(l2);
        if (view1 == view || view1.getVisibility() != 0 || !hasOpaqueBackground(view1) || !isDrawerView(view1) || view1.getHeight() < i4) goto _L2; else goto _L1
_L1:
        if (!checkDrawerViewAbsoluteGravity(view1, 3)) goto _L4; else goto _L3
_L3:
        int k3;
        i2 = view1.getRight();
        if (i2 > j1)
        {
            j1 = i2;
        }
        k3 = j1;
        i2 = i;
_L6:
        l2++;
        i = i2;
        j1 = k3;
          goto _L5
_L4:
        int l3;
        l3 = view1.getLeft();
        i2 = l3;
        k3 = j1;
        if (l3 < i) goto _L6; else goto _L2
_L2:
        i2 = i;
        k3 = j1;
          goto _L6
        canvas.clipRect(j1, 0, i, getHeight());
        i2 = i;
        boolean flag2 = super.drawChild(canvas, view, l);
        canvas.restoreToCount(j4);
        if (mScrimOpacity > 0.0F && flag1)
        {
            int j = (int)((float)((mScrimColor & 0xff000000) >>> 24) * mScrimOpacity);
            int i3 = mScrimColor;
            mScrimPaint.setColor(j << 24 | i3 & 0xffffff);
            canvas.drawRect(j1, 0.0F, i2, getHeight(), mScrimPaint);
        } else
        {
            if (mShadowLeftResolved != null && checkDrawerViewAbsoluteGravity(view, 3))
            {
                int k = mShadowLeftResolved.getIntrinsicWidth();
                int k1 = view.getRight();
                int j2 = mLeftDragger.i;
                float f1 = Math.max(0.0F, Math.min((float)k1 / (float)j2, 1.0F));
                mShadowLeftResolved.setBounds(k1, view.getTop(), k + k1, view.getBottom());
                mShadowLeftResolved.setAlpha((int)(255F * f1));
                mShadowLeftResolved.draw(canvas);
                return flag2;
            }
            if (mShadowRightResolved != null && checkDrawerViewAbsoluteGravity(view, 5))
            {
                int i1 = mShadowRightResolved.getIntrinsicWidth();
                int l1 = view.getLeft();
                int k2 = getWidth();
                int j3 = mRightDragger.i;
                float f2 = Math.max(0.0F, Math.min((float)(k2 - l1) / (float)j3, 1.0F));
                mShadowRightResolved.setBounds(l1 - i1, view.getTop(), l1, view.getBottom());
                mShadowRightResolved.setAlpha((int)(255F * f2));
                mShadowRightResolved.draw(canvas);
                return flag2;
            }
        }
        return flag2;
    }

    View findDrawerWithGravity(int i)
    {
        int j = android.support.v4.view.f.a(i, x.h(this));
        int k = getChildCount();
        for (i = 0; i < k; i++)
        {
            View view = getChildAt(i);
            if ((getDrawerViewAbsoluteGravity(view) & 7) == (j & 7))
            {
                return view;
            }
        }

        return null;
    }

    View findOpenDrawer()
    {
        int j = getChildCount();
        for (int i = 0; i < j; i++)
        {
            View view = getChildAt(i);
            if (((g)view.getLayoutParams()).d)
            {
                return view;
            }
        }

        return null;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new g();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new g(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof g)
        {
            return new g((g)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new g((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new g(layoutparams);
        }
    }

    public float getDrawerElevation()
    {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION)
        {
            return mDrawerElevation;
        } else
        {
            return 0.0F;
        }
    }

    public int getDrawerLockMode(int i)
    {
        i = android.support.v4.view.f.a(i, x.h(this));
        if (i == 3)
        {
            return mLockModeLeft;
        }
        if (i == 5)
        {
            return mLockModeRight;
        } else
        {
            return 0;
        }
    }

    public int getDrawerLockMode(View view)
    {
        int i = getDrawerViewAbsoluteGravity(view);
        if (i == 3)
        {
            return mLockModeLeft;
        }
        if (i == 5)
        {
            return mLockModeRight;
        } else
        {
            return 0;
        }
    }

    public CharSequence getDrawerTitle(int i)
    {
        i = android.support.v4.view.f.a(i, x.h(this));
        if (i == 3)
        {
            return mTitleLeft;
        }
        if (i == 5)
        {
            return mTitleRight;
        } else
        {
            return null;
        }
    }

    int getDrawerViewAbsoluteGravity(View view)
    {
        return android.support.v4.view.f.a(((g)view.getLayoutParams()).a, x.h(this));
    }

    float getDrawerViewOffset(View view)
    {
        return ((g)view.getLayoutParams()).b;
    }

    public Drawable getStatusBarBackgroundDrawable()
    {
        return mStatusBarBackground;
    }

    boolean isContentView(View view)
    {
        return ((g)view.getLayoutParams()).a == 0;
    }

    public boolean isDrawerOpen(int i)
    {
        View view = findDrawerWithGravity(i);
        if (view != null)
        {
            return isDrawerOpen(view);
        } else
        {
            return false;
        }
    }

    public boolean isDrawerOpen(View view)
    {
        if (!isDrawerView(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a drawer").toString());
        } else
        {
            return ((g)view.getLayoutParams()).d;
        }
    }

    boolean isDrawerView(View view)
    {
        return (android.support.v4.view.f.a(((g)view.getLayoutParams()).a, x.h(view)) & 7) != 0;
    }

    public boolean isDrawerVisible(int i)
    {
        View view = findDrawerWithGravity(i);
        if (view != null)
        {
            return isDrawerVisible(view);
        } else
        {
            return false;
        }
    }

    public boolean isDrawerVisible(View view)
    {
        if (!isDrawerView(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a drawer").toString());
        }
        return ((g)view.getLayoutParams()).b > 0.0F;
    }

    void moveDrawerToOffset(View view, float f1)
    {
        float f2 = getDrawerViewOffset(view);
        int i = view.getWidth();
        int j = (int)(f2 * (float)i);
        i = (int)((float)i * f1) - j;
        if (!checkDrawerViewAbsoluteGravity(view, 3))
        {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        setDrawerViewOffset(view, f1);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        mFirstLayout = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        mFirstLayout = true;
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (mDrawStatusBarBackground && mStatusBarBackground != null)
        {
            int i = IMPL.a(mLastInsets);
            if (i > 0)
            {
                mStatusBarBackground.setBounds(0, 0, getWidth(), i);
                mStatusBarBackground.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag1 = false;
        i = n.a(motionevent);
        flag2 = mLeftDragger.a(motionevent);
        flag3 = mRightDragger.a(motionevent);
        i;
        JVM INSTR tableswitch 0 3: default 60
    //                   0 96
    //                   1 329
    //                   2 165
    //                   3 329;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        boolean flag = false;
_L8:
        if (flag3 | flag2 || flag || hasPeekingDrawer() || mChildrenCanceledTouch)
        {
            flag1 = true;
        }
        return flag1;
_L2:
        float f1;
        float f3;
        f1 = motionevent.getX();
        f3 = motionevent.getY();
        mInitialMotionX = f1;
        mInitialMotionY = f3;
        if (mScrimOpacity <= 0.0F) goto _L6; else goto _L5
_L5:
        motionevent = mLeftDragger.b((int)f1, (int)f3);
        if (motionevent == null || !isContentView(motionevent)) goto _L6; else goto _L7
_L7:
        flag = true;
_L16:
        mDisallowInterceptRequested = false;
        mChildrenCanceledTouch = false;
          goto _L8
_L4:
        int j;
        int k;
        motionevent = mLeftDragger;
        k = ((u) (motionevent)).c.length;
        j = 0;
_L14:
        if (j >= k) goto _L10; else goto _L9
_L9:
        if ((((u) (motionevent)).g & 1 << j) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            float f2 = ((u) (motionevent)).e[j] - ((u) (motionevent)).c[j];
            float f4 = ((u) (motionevent)).f[j] - ((u) (motionevent)).d[j];
            if (f2 * f2 + f4 * f4 > (float)(((u) (motionevent)).b * ((u) (motionevent)).b))
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        if (!flag) goto _L12; else goto _L11
_L11:
        flag = true;
_L15:
        if (!flag) goto _L1; else goto _L13
_L13:
        mLeftCallback.a();
        mRightCallback.a();
        flag = false;
          goto _L8
_L12:
        j++;
          goto _L14
_L10:
        flag = false;
          goto _L15
_L3:
        closeDrawers(true);
        mDisallowInterceptRequested = false;
        mChildrenCanceledTouch = false;
          goto _L1
_L6:
        flag = false;
          goto _L16
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4 && hasVisibleDrawer())
        {
            android.support.v4.view.g.c(keyevent);
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            keyevent = findVisibleDrawer();
            if (keyevent != null && getDrawerLockMode(keyevent) == 0)
            {
                closeDrawers();
            }
            return keyevent != null;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        int k1;
        int l1;
        mInLayout = true;
        k1 = k - i;
        l1 = getChildCount();
        k = 0;
_L2:
        View view;
        g g1;
        if (k >= l1)
        {
            break MISSING_BLOCK_LABEL_446;
        }
        view = getChildAt(k);
        if (view.getVisibility() != 8)
        {
            g1 = (g)view.getLayoutParams();
            if (!isContentView(view))
            {
                break; /* Loop/switch isn't completed */
            }
            view.layout(g1.leftMargin, g1.topMargin, g1.leftMargin + view.getMeasuredWidth(), g1.topMargin + view.getMeasuredHeight());
        }
_L6:
        k++;
        if (true) goto _L2; else goto _L1
_L1:
        int i1;
        int i2;
        int j2;
        i2 = view.getMeasuredWidth();
        j2 = view.getMeasuredHeight();
        float f1;
        boolean flag1;
        if (checkDrawerViewAbsoluteGravity(view, 3))
        {
            i = -i2;
            i1 = (int)((float)i2 * g1.b) + i;
            f1 = (float)(i2 + i1) / (float)i2;
        } else
        {
            i1 = k1 - (int)((float)i2 * g1.b);
            f1 = (float)(k1 - i1) / (float)i2;
        }
        if (f1 != g1.b)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        g1.a & 0x70;
        JVM INSTR lookupswitch 2: default 212
    //                   16: 356
    //                   80: 316;
           goto _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_356;
_L3:
        view.layout(i1, g1.topMargin, i2 + i1, j2 + g1.topMargin);
_L7:
        if (flag1)
        {
            setDrawerViewOffset(view, f1);
        }
        int j1;
        int k2;
        if (g1.b > 0.0F)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        if (view.getVisibility() != i)
        {
            view.setVisibility(i);
        }
          goto _L6
_L5:
        i = l - j;
        view.layout(i1, i - g1.bottomMargin - view.getMeasuredHeight(), i2 + i1, i - g1.bottomMargin);
          goto _L7
        k2 = l - j;
        j1 = (k2 - j2) / 2;
        if (j1 < g1.topMargin)
        {
            i = g1.topMargin;
        } else
        {
            i = j1;
            if (j1 + j2 > k2 - g1.bottomMargin)
            {
                i = k2 - g1.bottomMargin - j2;
            }
        }
        view.layout(i1, i, i2 + i1, j2 + i);
          goto _L7
        mInLayout = false;
        mFirstLayout = false;
        return;
          goto _L6
    }

    protected void onMeasure(int i, int j)
    {
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int l2;
        k1 = 300;
        j1 = 0;
        l2 = android.view.View.MeasureSpec.getMode(i);
        i2 = android.view.View.MeasureSpec.getMode(j);
        i1 = android.view.View.MeasureSpec.getSize(i);
        l1 = android.view.View.MeasureSpec.getSize(j);
        if (l2 != 0x40000000) goto _L2; else goto _L1
_L1:
        int l = i1;
        if (i2 == 0x40000000) goto _L3; else goto _L2
_L2:
        int k;
        boolean flag;
        if (isInEditMode())
        {
            k = i1;
            if (l2 != 0x80000000)
            {
                k = i1;
                if (l2 == 0)
                {
                    k = 300;
                }
            }
            l = k;
            if (i2 != 0x80000000)
            {
label0:
                {
                    l = k;
                    if (i2 == 0)
                    {
                        l = k;
                        k = k1;
                        break label0;
                    }
                }
            }
        } else
        {
            throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
        }
          goto _L3
_L5:
        setMeasuredDimension(l, k);
        if (mLastInsets != null && x.x(this))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k1 = x.h(this);
        l1 = getChildCount();
        while (j1 < l1) 
        {
            View view = getChildAt(j1);
            if (view.getVisibility() != 8)
            {
                g g1 = (g)view.getLayoutParams();
                if (flag)
                {
                    int j2 = android.support.v4.view.f.a(g1.a, k1);
                    if (x.x(view))
                    {
                        IMPL.a(view, mLastInsets, j2);
                    } else
                    {
                        IMPL.a(g1, mLastInsets, j2);
                    }
                }
                if (isContentView(view))
                {
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l - g1.leftMargin - g1.rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k - g1.topMargin - g1.bottomMargin, 0x40000000));
                } else
                if (isDrawerView(view))
                {
                    if (SET_DRAWER_SHADOW_FROM_ELEVATION && x.u(view) != mDrawerElevation)
                    {
                        x.f(view, mDrawerElevation);
                    }
                    int k2 = getDrawerViewAbsoluteGravity(view) & 7;
                    if ((k2 & 0) != 0)
                    {
                        throw new IllegalStateException((new StringBuilder("Child drawer has absolute gravity ")).append(gravityToString(k2)).append(" but this DrawerLayout already has a drawer view along that edge").toString());
                    }
                    view.measure(getChildMeasureSpec(i, mMinDrawerMargin + g1.leftMargin + g1.rightMargin, g1.width), getChildMeasureSpec(j, g1.topMargin + g1.bottomMargin, g1.height));
                } else
                {
                    throw new IllegalStateException((new StringBuilder("Child ")).append(view).append(" at index ").append(j1).append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY").toString());
                }
            }
            j1++;
        }
        return;
_L3:
        k = l1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).a != 0)
        {
            View view = findDrawerWithGravity(((SavedState) (parcelable)).a);
            if (view != null)
            {
                openDrawer(view);
            }
        }
        setDrawerLockMode(((SavedState) (parcelable)).b, 3);
        setDrawerLockMode(((SavedState) (parcelable)).c, 5);
    }

    public void onRtlPropertiesChanged(int i)
    {
        resolveShadowDrawables();
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        View view = findOpenDrawer();
        if (view != null)
        {
            savedstate.a = ((g)view.getLayoutParams()).a;
        }
        savedstate.b = mLockModeLeft;
        savedstate.c = mLockModeRight;
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        mLeftDragger.b(motionevent);
        mRightDragger.b(motionevent);
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 3: default 56
    //                   0 58
    //                   1 90
    //                   2 56
    //                   3 204;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return true;
_L2:
        float f1 = motionevent.getX();
        float f3 = motionevent.getY();
        mInitialMotionX = f1;
        mInitialMotionY = f3;
        mDisallowInterceptRequested = false;
        mChildrenCanceledTouch = false;
        return true;
_L3:
        float f2;
        float f4;
        f4 = motionevent.getX();
        f2 = motionevent.getY();
        motionevent = mLeftDragger.b((int)f4, (int)f2);
        if (motionevent == null || !isContentView(motionevent)) goto _L6; else goto _L5
_L5:
        int i;
        f4 -= mInitialMotionX;
        f2 -= mInitialMotionY;
        i = mLeftDragger.b;
        if (f4 * f4 + f2 * f2 >= (float)(i * i)) goto _L6; else goto _L7
_L7:
        motionevent = findOpenDrawer();
        if (motionevent == null) goto _L6; else goto _L8
_L8:
        boolean flag;
        if (getDrawerLockMode(motionevent) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L10:
        closeDrawers(flag);
        mDisallowInterceptRequested = false;
        return true;
_L4:
        closeDrawers(true);
        mDisallowInterceptRequested = false;
        mChildrenCanceledTouch = false;
        return true;
_L6:
        flag = true;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void openDrawer(int i)
    {
        View view = findDrawerWithGravity(i);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder("No drawer view found with gravity ")).append(gravityToString(i)).toString());
        } else
        {
            openDrawer(view);
            return;
        }
    }

    public void openDrawer(View view)
    {
        if (!isDrawerView(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a sliding drawer").toString());
        }
        if (mFirstLayout)
        {
            g g1 = (g)view.getLayoutParams();
            g1.b = 1.0F;
            g1.d = true;
            updateChildrenImportantForAccessibility(view, true);
        } else
        if (checkDrawerViewAbsoluteGravity(view, 3))
        {
            mLeftDragger.a(view, 0, view.getTop());
        } else
        {
            mRightDragger.a(view, getWidth() - view.getWidth(), view.getTop());
        }
        invalidate();
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        super.requestDisallowInterceptTouchEvent(flag);
        mDisallowInterceptRequested = flag;
        if (flag)
        {
            closeDrawers(true);
        }
    }

    public void requestLayout()
    {
        if (!mInLayout)
        {
            super.requestLayout();
        }
    }

    public void setChildInsets(Object obj, boolean flag)
    {
        mLastInsets = obj;
        mDrawStatusBarBackground = flag;
        if (!flag && getBackground() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        requestLayout();
    }

    public void setDrawerElevation(float f1)
    {
        mDrawerElevation = f1;
        for (int i = 0; i < getChildCount(); i++)
        {
            View view = getChildAt(i);
            if (isDrawerView(view))
            {
                x.f(view, mDrawerElevation);
            }
        }

    }

    public void setDrawerListener(f f1)
    {
        mListener = f1;
    }

    public void setDrawerLockMode(int i)
    {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setDrawerLockMode(int i, int j)
    {
        j = android.support.v4.view.f.a(j, x.h(this));
        if (j == 3)
        {
            mLockModeLeft = i;
        } else
        if (j == 5)
        {
            mLockModeRight = i;
        }
        if (i != 0)
        {
            u u1;
            if (j == 3)
            {
                u1 = mLeftDragger;
            } else
            {
                u1 = mRightDragger;
            }
            u1.a();
        }
        i;
        JVM INSTR tableswitch 1 2: default 60
    //                   1 98
    //                   2 82;
           goto _L1 _L2 _L3
_L1:
        View view;
        return;
_L3:
        if ((view = findDrawerWithGravity(j)) != null)
        {
            openDrawer(view);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if ((view = findDrawerWithGravity(j)) != null)
        {
            closeDrawer(view);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void setDrawerLockMode(int i, View view)
    {
        if (!isDrawerView(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a drawer with appropriate layout_gravity").toString());
        } else
        {
            setDrawerLockMode(i, ((g)view.getLayoutParams()).a);
            return;
        }
    }

    public void setDrawerShadow(int i, int j)
    {
        setDrawerShadow(getResources().getDrawable(i), j);
    }

    public void setDrawerShadow(Drawable drawable, int i)
    {
        if (!SET_DRAWER_SHADOW_FROM_ELEVATION) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((i & 0x800003) == 0x800003)
        {
            mShadowStart = drawable;
        } else
        if ((i & 0x800005) == 0x800005)
        {
            mShadowEnd = drawable;
        } else
        {
            if ((i & 3) != 3)
            {
                continue; /* Loop/switch isn't completed */
            }
            mShadowLeft = drawable;
        }
_L4:
        resolveShadowDrawables();
        invalidate();
        return;
        if ((i & 5) != 5) goto _L1; else goto _L3
_L3:
        mShadowRight = drawable;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void setDrawerTitle(int i, CharSequence charsequence)
    {
        i = android.support.v4.view.f.a(i, x.h(this));
        if (i == 3)
        {
            mTitleLeft = charsequence;
        } else
        if (i == 5)
        {
            mTitleRight = charsequence;
            return;
        }
    }

    void setDrawerViewOffset(View view, float f1)
    {
        g g1 = (g)view.getLayoutParams();
        if (f1 == g1.b)
        {
            return;
        } else
        {
            g1.b = f1;
            dispatchOnDrawerSlide(view, f1);
            return;
        }
    }

    public void setScrimColor(int i)
    {
        mScrimColor = i;
        invalidate();
    }

    public void setStatusBarBackground(int i)
    {
        Drawable drawable;
        if (i != 0)
        {
            drawable = android.support.v4.b.a.a(getContext(), i);
        } else
        {
            drawable = null;
        }
        mStatusBarBackground = drawable;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable)
    {
        mStatusBarBackground = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i)
    {
        mStatusBarBackground = new ColorDrawable(i);
        invalidate();
    }

    void updateDrawerState(int i, int j, View view)
    {
        g g1;
        boolean flag = true;
        int k = mLeftDragger.a;
        int l = mRightDragger.a;
        i = ((flag) ? 1 : 0);
        if (k != 1)
        {
            if (l == 1)
            {
                i = ((flag) ? 1 : 0);
            } else
            if (k == 2 || l == 2)
            {
                i = 2;
            } else
            {
                i = 0;
            }
        }
        if (view == null || j != 0) goto _L2; else goto _L1
_L1:
        g1 = (g)view.getLayoutParams();
        if (g1.b != 0.0F) goto _L4; else goto _L3
_L3:
        dispatchOnDrawerClosed(view);
_L2:
        if (i != mDrawerState)
        {
            mDrawerState = i;
            if (mListener != null)
            {
                mListener.onDrawerStateChanged(i);
            }
        }
        return;
_L4:
        if (g1.b == 1.0F)
        {
            dispatchOnDrawerOpened(view);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    static 
    {
        boolean flag1 = true;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        CAN_HIDE_DESCENDANTS = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        SET_DRAWER_SHADOW_FROM_ELEVATION = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            IMPL = new d();
        } else
        {
            IMPL = new e();
        }
    }





    // Unreferenced inner class android/support/v4/widget/DrawerLayout$h$1

/* anonymous class */
    final class h._cls1
        implements Runnable
    {

        final h a;

        public final void run()
        {
            int i = 0;
            h h1 = a;
            int j = h1.b.i;
            View view;
            boolean flag;
            if (h1.a == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                view = h1.c.findDrawerWithGravity(3);
                if (view != null)
                {
                    i = -view.getWidth();
                }
                i += j;
            } else
            {
                view = h1.c.findDrawerWithGravity(5);
                i = h1.c.getWidth();
                i -= j;
            }
            if (view != null && (flag && view.getLeft() < i || !flag && view.getLeft() > i) && h1.c.getDrawerLockMode(view) == 0)
            {
                g g1 = (g)view.getLayoutParams();
                h1.b.a(view, i, view.getTop());
                g1.c = true;
                h1.c.invalidate();
                h1.b();
                h1.c.cancelChildViewTouch();
            }
        }

            
            {
                a = h1;
                super();
            }
    }

}
