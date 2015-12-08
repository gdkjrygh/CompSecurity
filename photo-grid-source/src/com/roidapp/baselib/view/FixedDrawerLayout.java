// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.KeyEventCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewGroupCompat;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.roidapp.baselib.view:
//            i, l, h, j

public class FixedDrawerLayout extends ViewGroup
{

    private static final int a[] = {
        0x10100b3
    };
    private final i b;
    private int c;
    private int d;
    private float e;
    private Paint f;
    private final ViewDragHelper g;
    private final ViewDragHelper h;
    private final l i;
    private final l j;
    private int k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private j r;
    private float s;
    private float t;
    private Drawable u;
    private Drawable v;
    private CharSequence w;
    private CharSequence x;
    private boolean y;

    public FixedDrawerLayout(Context context)
    {
        this(context, null);
    }

    public FixedDrawerLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public FixedDrawerLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        b = new i(this);
        d = 0x99000000;
        f = new Paint();
        m = true;
        float f1 = getResources().getDisplayMetrics().density;
        c = (int)(64F * f1 + 0.5F);
        f1 *= 400F;
        i = new l(this, 3);
        j = new l(this, 5);
        g = ViewDragHelper.create(this, 1.0F, i);
        g.setEdgeTrackingEnabled(1);
        g.setMinVelocity(f1);
        i.a(g);
        h = ViewDragHelper.create(this, 1.0F, j);
        h.setEdgeTrackingEnabled(2);
        h.setMinVelocity(f1);
        j.a(h);
        setFocusableInTouchMode(true);
        ViewCompat.setImportantForAccessibility(this, 1);
        ViewCompat.setAccessibilityDelegate(this, new h(this));
        ViewGroupCompat.setMotionEventSplittingEnabled(this, false);
    }

    static View a(FixedDrawerLayout fixeddrawerlayout)
    {
        return fixeddrawerlayout.d();
    }

    private void a(int i1, int j1)
    {
        j1 = GravityCompat.getAbsoluteGravity(j1, ViewCompat.getLayoutDirection(this));
        if (j1 == 3)
        {
            n = i1;
        } else
        if (j1 == 5)
        {
            o = i1;
        }
        if (i1 != 0)
        {
            ViewDragHelper viewdraghelper;
            if (j1 == 3)
            {
                viewdraghelper = g;
            } else
            {
                viewdraghelper = h;
            }
            viewdraghelper.cancel();
        }
        i1;
        JVM INSTR tableswitch 1 2: default 60
    //                   1 98
    //                   2 82;
           goto _L1 _L2 _L3
_L1:
        View view;
        return;
_L3:
        if ((view = b(j1)) != null)
        {
            e(view);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if ((view = b(j1)) != null)
        {
            f(view);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void a(boolean flag)
    {
        int l1 = getChildCount();
        int j1 = 0;
        int i1 = 0;
        while (j1 < l1) 
        {
label0:
            {
                View view = getChildAt(j1);
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                int k1 = i1;
                if (!d(view))
                {
                    break label0;
                }
                if (flag)
                {
                    k1 = i1;
                    if (!layoutparams.c)
                    {
                        break label0;
                    }
                }
                k1 = view.getWidth();
                if (a(view, 3))
                {
                    i1 |= g.smoothSlideViewTo(view, -k1, view.getTop());
                } else
                {
                    i1 |= h.smoothSlideViewTo(view, getWidth(), view.getTop());
                }
                layoutparams.c = false;
                k1 = i1;
            }
            j1++;
            i1 = k1;
        }
        i.a();
        j.a();
        if (i1 != 0)
        {
            invalidate();
        }
    }

    static float b(View view)
    {
        return ((LayoutParams)view.getLayoutParams()).b;
    }

    static int[] c()
    {
        return a;
    }

    private View d()
    {
        int j1 = getChildCount();
        boolean flag;
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (!d(view))
            {
                continue;
            }
            if (!d(view))
            {
                throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a drawer").toString());
            }
            if (((LayoutParams)view.getLayoutParams()).b > 0.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return view;
            }
        }

        return null;
    }

    static boolean d(View view)
    {
        return (GravityCompat.getAbsoluteGravity(((LayoutParams)view.getLayoutParams()).a, ViewCompat.getLayoutDirection(view)) & 7) != 0;
    }

    public static boolean g(View view)
    {
        if (!d(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a drawer").toString());
        } else
        {
            return ((LayoutParams)view.getLayoutParams()).d;
        }
    }

    static boolean h(View view)
    {
        return ViewCompat.getImportantForAccessibility(view) != 4 && ViewCompat.getImportantForAccessibility(view) != 2;
    }

    private static boolean i(View view)
    {
        if (view == null)
        {
            return false;
        }
        return ((LayoutParams)view.getLayoutParams()).a == 0;
    }

    public final int a(View view)
    {
        int i1 = c(view);
        if (i1 == 3)
        {
            return n;
        }
        if (i1 == 5)
        {
            return o;
        } else
        {
            return 0;
        }
    }

    public final CharSequence a(int i1)
    {
        i1 = GravityCompat.getAbsoluteGravity(i1, ViewCompat.getLayoutDirection(this));
        if (i1 == 3)
        {
            return w;
        }
        if (i1 == 5)
        {
            return x;
        } else
        {
            return null;
        }
    }

    final void a()
    {
        int i1 = 0;
        if (!q)
        {
            long l1 = SystemClock.uptimeMillis();
            MotionEvent motionevent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
            for (int j1 = getChildCount(); i1 < j1; i1++)
            {
                getChildAt(i1).dispatchTouchEvent(motionevent);
            }

            motionevent.recycle();
            q = true;
        }
    }

    final void a(int i1, View view)
    {
        Object obj;
        int j1 = g.getViewDragState();
        int k1 = h.getViewDragState();
        if (j1 == 1 || k1 == 1)
        {
            j1 = 1;
        } else
        if (j1 == 2 || k1 == 2)
        {
            j1 = 2;
        } else
        {
            j1 = 0;
        }
        if (view == null || i1 != 0) goto _L2; else goto _L1
_L1:
        obj = (LayoutParams)view.getLayoutParams();
        if (((LayoutParams) (obj)).b != 0.0F) goto _L4; else goto _L3
_L3:
        obj = (LayoutParams)view.getLayoutParams();
        if (((LayoutParams) (obj)).d)
        {
            obj.d = false;
            if (r != null)
            {
                r.b();
            }
            obj = getChildAt(0);
            if (obj != null)
            {
                ViewCompat.setImportantForAccessibility(((View) (obj)), 1);
            }
            ViewCompat.setImportantForAccessibility(view, 4);
            if (hasWindowFocus())
            {
                view = getRootView();
                if (view != null)
                {
                    view.sendAccessibilityEvent(32);
                }
            }
        }
_L2:
        if (j1 != k)
        {
            k = j1;
            if (r != null)
            {
                r.a(j1);
            }
        }
        return;
_L4:
        if (((LayoutParams) (obj)).b == 1.0F)
        {
            Object obj1 = (LayoutParams)view.getLayoutParams();
            if (!((LayoutParams) (obj1)).d)
            {
                obj1.d = true;
                if (r != null)
                {
                    r.a();
                }
                obj1 = getChildAt(0);
                if (obj1 != null)
                {
                    ViewCompat.setImportantForAccessibility(((View) (obj1)), 4);
                }
                ViewCompat.setImportantForAccessibility(view, 1);
                sendAccessibilityEvent(32);
                view.requestFocus();
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    final void a(View view, float f1)
    {
        view = (LayoutParams)view.getLayoutParams();
        if (f1 != ((LayoutParams) (view)).b)
        {
            view.b = f1;
            if (r != null)
            {
                r.a(f1);
                return;
            }
        }
    }

    public final void a(j j1)
    {
        r = j1;
    }

    final boolean a(View view, int i1)
    {
        return (c(view) & i1) == i1;
    }

    public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (i1 > 0 || i1 < 0 && getChildCount() > 0)
        {
            ViewCompat.setImportantForAccessibility(view, 4);
            ViewCompat.setAccessibilityDelegate(view, b);
        } else
        {
            ViewCompat.setImportantForAccessibility(view, 1);
        }
        super.addView(view, i1, layoutparams);
    }

    final View b(int i1)
    {
        int j1 = GravityCompat.getAbsoluteGravity(i1, ViewCompat.getLayoutDirection(this));
        int k1 = getChildCount();
        for (i1 = 0; i1 < k1; i1++)
        {
            View view = getChildAt(i1);
            if ((c(view) & 7) == (j1 & 7))
            {
                return view;
            }
        }

        return null;
    }

    public final void b()
    {
        y = true;
    }

    final int c(View view)
    {
        return GravityCompat.getAbsoluteGravity(((LayoutParams)view.getLayoutParams()).a, ViewCompat.getLayoutDirection(this));
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
        int j1 = getChildCount();
        float f1 = 0.0F;
        for (int i1 = 0; i1 < j1; i1++)
        {
            f1 = Math.max(f1, ((LayoutParams)getChildAt(i1).getLayoutParams()).b);
        }

        e = f1;
        if (g.continueSettling(true) | h.continueSettling(true))
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        int i1;
        int j2;
        int i3;
        int l3;
        int i5;
        int j5;
        int k5;
        boolean flag1;
        i5 = getHeight();
        flag1 = i(view);
        j2 = 0;
        boolean flag = false;
        i1 = getWidth();
        j5 = canvas.save();
        i3 = i1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        k5 = getChildCount();
        l3 = 0;
        j2 = ((flag) ? 1 : 0);
_L6:
        View view1;
        if (l3 >= k5)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        view1 = getChildAt(l3);
        if (view1 == view || view1.getVisibility() != 0) goto _L2; else goto _L1
_L1:
        int k4;
        Drawable drawable = view1.getBackground();
        if (drawable != null)
        {
            if (drawable.getOpacity() == -1)
            {
                i3 = 1;
            } else
            {
                i3 = 0;
            }
        } else
        {
            i3 = 0;
        }
        if (i3 == 0 || !d(view1) || view1.getHeight() < i5) goto _L2; else goto _L3
_L3:
        if (!a(view1, 3)) goto _L5; else goto _L4
_L4:
        i3 = view1.getRight();
        if (i3 > j2)
        {
            j2 = i3;
        }
        k4 = j2;
        i3 = i1;
_L7:
        l3++;
        i1 = i3;
        j2 = k4;
          goto _L6
_L5:
        int l4;
        l4 = view1.getLeft();
        i3 = l4;
        k4 = j2;
        if (l4 < i1) goto _L7; else goto _L2
_L2:
        i3 = i1;
        k4 = j2;
          goto _L7
        canvas.clipRect(j2, 0, i1, getHeight());
        i3 = i1;
        boolean flag2 = super.drawChild(canvas, view, l1);
        canvas.restoreToCount(j5);
        if (e > 0.0F && flag1)
        {
            int j1 = (int)((float)((d & 0xff000000) >>> 24) * e);
            int i4 = d;
            f.setColor(j1 << 24 | i4 & 0xffffff);
            canvas.drawRect(j2, 0.0F, i3, getHeight(), f);
        } else
        {
            if (u != null && a(view, 3))
            {
                int k1 = u.getIntrinsicWidth();
                int k2 = view.getRight();
                int j3 = g.getEdgeSize();
                float f1 = Math.max(0.0F, Math.min((float)k2 / (float)j3, 1.0F));
                u.setBounds(k2, view.getTop(), k1 + k2, view.getBottom());
                u.setAlpha((int)(255F * f1));
                u.draw(canvas);
                return flag2;
            }
            if (v != null && a(view, 5))
            {
                int i2 = v.getIntrinsicWidth();
                int l2 = view.getLeft();
                int k3 = getWidth();
                int j4 = h.getEdgeSize();
                float f2 = Math.max(0.0F, Math.min((float)(k3 - l2) / (float)j4, 1.0F));
                v.setBounds(l2 - i2, view.getTop(), l2, view.getBottom());
                v.setAlpha((int)(255F * f2));
                v.draw(canvas);
                return flag2;
            }
        }
        return flag2;
    }

    public final void e(View view)
    {
        if (!d(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a sliding drawer").toString());
        }
        if (m)
        {
            view = (LayoutParams)view.getLayoutParams();
            view.b = 1.0F;
            view.d = true;
        } else
        if (a(view, 3))
        {
            g.smoothSlideViewTo(view, 0, view.getTop());
        } else
        {
            h.smoothSlideViewTo(view, getWidth() - view.getWidth(), view.getTop());
        }
        invalidate();
    }

    public final void f(View view)
    {
        if (!d(view))
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a sliding drawer").toString());
        }
        if (m)
        {
            view = (LayoutParams)view.getLayoutParams();
            view.b = 0.0F;
            view.d = false;
        } else
        if (a(view, 3))
        {
            g.smoothSlideViewTo(view, -view.getWidth(), view.getTop());
        } else
        {
            h.smoothSlideViewTo(view, getWidth(), view.getTop());
        }
        invalidate();
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
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
        m = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        m = true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        flag = false;
        i1 = MotionEventCompat.getActionMasked(motionevent);
        flag1 = g.shouldInterceptTouchEvent(motionevent);
        flag2 = h.shouldInterceptTouchEvent(motionevent);
        i1;
        JVM INSTR tableswitch 0 3: default 60
    //                   0 131
    //                   1 224
    //                   2 193
    //                   3 224;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        i1 = 0;
_L12:
        if (flag1 | flag2 || i1 != 0) goto _L6; else goto _L5
_L5:
        int j1;
        j1 = getChildCount();
        i1 = 0;
_L14:
        if (i1 >= j1) goto _L8; else goto _L7
_L7:
        if (!((LayoutParams)getChildAt(i1).getLayoutParams()).c) goto _L10; else goto _L9
_L9:
        i1 = 1;
_L15:
        if (i1 == 0 && !q) goto _L11; else goto _L6
_L6:
        flag = true;
_L11:
        return flag;
_L2:
        float f1 = motionevent.getX();
        float f2 = motionevent.getY();
        s = f1;
        t = f2;
        if (e > 0.0F && i(g.findTopChildUnder((int)f1, (int)f2)))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        p = false;
        q = false;
          goto _L12
_L4:
        if (!g.checkTouchSlop(3)) goto _L1; else goto _L13
_L13:
        i.a();
        j.a();
        i1 = 0;
          goto _L12
_L3:
        a(true);
        p = false;
        q = false;
          goto _L1
_L10:
        i1++;
          goto _L14
_L8:
        i1 = 0;
          goto _L15
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            boolean flag;
            if (d() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                KeyEventCompat.startTracking(keyevent);
                return true;
            }
        }
        return super.onKeyDown(i1, keyevent);
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        boolean flag = false;
        if (i1 == 4)
        {
            keyevent = d();
            if (keyevent != null && a(keyevent) == 0)
            {
                a(false);
            }
            if (keyevent != null)
            {
                flag = true;
            }
            return flag;
        } else
        {
            return super.onKeyUp(i1, keyevent);
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int k2;
        int l2;
        l = true;
        k2 = k1 - i1;
        l2 = getChildCount();
        k1 = 0;
_L2:
        View view;
        LayoutParams layoutparams;
        if (k1 >= l2)
        {
            break MISSING_BLOCK_LABEL_446;
        }
        view = getChildAt(k1);
        if (view.getVisibility() != 8)
        {
            layoutparams = (LayoutParams)view.getLayoutParams();
            if (!i(view))
            {
                break; /* Loop/switch isn't completed */
            }
            view.layout(layoutparams.leftMargin, layoutparams.topMargin, layoutparams.leftMargin + view.getMeasuredWidth(), layoutparams.topMargin + view.getMeasuredHeight());
        }
_L6:
        k1++;
        if (true) goto _L2; else goto _L1
_L1:
        int i2;
        int i3;
        int j3;
        i3 = view.getMeasuredWidth();
        j3 = view.getMeasuredHeight();
        float f1;
        boolean flag1;
        if (a(view, 3))
        {
            i1 = -i3;
            i2 = (int)((float)i3 * layoutparams.b) + i1;
            f1 = (float)(i3 + i2) / (float)i3;
        } else
        {
            i2 = k2 - (int)((float)i3 * layoutparams.b);
            f1 = (float)(k2 - i2) / (float)i3;
        }
        if (f1 != layoutparams.b)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        layoutparams.a & 0x70;
        JVM INSTR lookupswitch 2: default 212
    //                   16: 356
    //                   80: 316;
           goto _L3 _L4 _L5
_L4:
        break MISSING_BLOCK_LABEL_356;
_L3:
        view.layout(i2, layoutparams.topMargin, i3 + i2, j3 + layoutparams.topMargin);
_L7:
        if (flag1)
        {
            a(view, f1);
        }
        int j2;
        int k3;
        if (layoutparams.b > 0.0F)
        {
            i1 = 0;
        } else
        {
            i1 = 4;
        }
        if (view.getVisibility() != i1)
        {
            view.setVisibility(i1);
        }
          goto _L6
_L5:
        i1 = l1 - j1;
        view.layout(i2, i1 - layoutparams.bottomMargin - view.getMeasuredHeight(), i3 + i2, i1 - layoutparams.bottomMargin);
          goto _L7
        k3 = l1 - j1;
        j2 = (k3 - j3) / 2;
        if (j2 < layoutparams.topMargin)
        {
            i1 = layoutparams.topMargin;
        } else
        {
            i1 = j2;
            if (j2 + j3 > k3 - layoutparams.bottomMargin)
            {
                i1 = k3 - layoutparams.bottomMargin - j3;
            }
        }
        view.layout(i2, i1, i3 + i2, j3 + i1);
          goto _L7
        l = false;
        m = false;
        return;
          goto _L6
    }

    protected void onMeasure(int i1, int j1)
    {
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        j2 = 300;
        i3 = android.view.View.MeasureSpec.getMode(i1);
        l2 = android.view.View.MeasureSpec.getMode(j1);
        i2 = android.view.View.MeasureSpec.getSize(i1);
        k2 = android.view.View.MeasureSpec.getSize(j1);
        if (i3 != 0x40000000) goto _L2; else goto _L1
_L1:
        int l1 = i2;
        if (l2 == 0x40000000) goto _L3; else goto _L2
_L2:
        int k1;
        if (isInEditMode())
        {
            k1 = i2;
            if (i3 != 0x80000000)
            {
                k1 = i2;
                if (i3 == 0)
                {
                    k1 = 300;
                }
            }
            l1 = k1;
            if (l2 != 0x80000000)
            {
label0:
                {
                    l1 = k1;
                    if (l2 == 0)
                    {
                        l1 = k1;
                        k1 = j2;
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
        setMeasuredDimension(l1, k1);
        j2 = getChildCount();
        i2 = 0;
        while (i2 < j2) 
        {
            Object obj = getChildAt(i2);
            if (((View) (obj)).getVisibility() != 8)
            {
                Object obj1 = (LayoutParams)((View) (obj)).getLayoutParams();
                if (i(((View) (obj))))
                {
                    ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(l1 - ((LayoutParams) (obj1)).leftMargin - ((LayoutParams) (obj1)).rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k1 - ((LayoutParams) (obj1)).topMargin - ((LayoutParams) (obj1)).bottomMargin, 0x40000000));
                } else
                if (d(((View) (obj))))
                {
                    k2 = c(((View) (obj))) & 7;
                    if ((k2 & 0) != 0)
                    {
                        obj1 = new StringBuilder("Child drawer has absolute gravity ");
                        if ((k2 & 3) == 3)
                        {
                            obj = "LEFT";
                        } else
                        if ((k2 & 5) == 5)
                        {
                            obj = "RIGHT";
                        } else
                        {
                            obj = Integer.toHexString(k2);
                        }
                        throw new IllegalStateException(((StringBuilder) (obj1)).append(((String) (obj))).append(" but this DrawerLayout already has a drawer view along that edge").toString());
                    }
                    ((View) (obj)).measure(getChildMeasureSpec(i1, c + ((LayoutParams) (obj1)).leftMargin + ((LayoutParams) (obj1)).rightMargin, ((LayoutParams) (obj1)).width), getChildMeasureSpec(j1, ((LayoutParams) (obj1)).topMargin + ((LayoutParams) (obj1)).bottomMargin, ((LayoutParams) (obj1)).height));
                } else
                {
                    throw new IllegalStateException((new StringBuilder("Child ")).append(obj).append(" at index ").append(i2).append(" does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY").toString());
                }
            }
            i2++;
        }
        return;
_L3:
        k1 = k2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        super.onRestoreInstanceState(parcelable.getSuperState());
        if (((SavedState) (parcelable)).a != 0)
        {
            View view = b(((SavedState) (parcelable)).a);
            if (view != null)
            {
                e(view);
            }
        }
        a(((SavedState) (parcelable)).b, 3);
        a(((SavedState) (parcelable)).c, 5);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        int j1 = getChildCount();
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < j1)
                {
                    Object obj = getChildAt(i1);
                    if (!d(((View) (obj))))
                    {
                        break label0;
                    }
                    obj = (LayoutParams)((View) (obj)).getLayoutParams();
                    if (!((LayoutParams) (obj)).d)
                    {
                        break label0;
                    }
                    savedstate.a = ((LayoutParams) (obj)).a;
                }
                savedstate.b = n;
                savedstate.c = o;
                return savedstate;
            }
            i1++;
        } while (true);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (y)
        {
            return false;
        }
        g.processTouchEvent(motionevent);
        h.processTouchEvent(motionevent);
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 3: default 64
    //                   0 66
    //                   1 99
    //                   2 64
    //                   3 258;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return true;
_L2:
        float f1 = motionevent.getX();
        float f3 = motionevent.getY();
        s = f1;
        t = f3;
        p = false;
        q = false;
          goto _L1
_L3:
        int i1;
        int j1;
        float f4 = motionevent.getX();
        float f2 = motionevent.getY();
        motionevent = g.findTopChildUnder((int)f4, (int)f2);
        if (motionevent == null || !i(motionevent))
        {
            break MISSING_BLOCK_LABEL_276;
        }
        f4 -= s;
        f2 -= t;
        i1 = g.getTouchSlop();
        if (f4 * f4 + f2 * f2 >= (float)(i1 * i1))
        {
            break MISSING_BLOCK_LABEL_276;
        }
        j1 = getChildCount();
        i1 = 0;
_L9:
        if (i1 >= j1) goto _L6; else goto _L5
_L5:
        motionevent = getChildAt(i1);
        if (!((LayoutParams)motionevent.getLayoutParams()).d) goto _L8; else goto _L7
_L7:
        boolean flag;
        if (motionevent == null)
        {
            break MISSING_BLOCK_LABEL_276;
        }
        if (a(motionevent) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L10:
        a(flag);
        p = false;
          goto _L1
_L8:
        i1++;
          goto _L9
_L6:
        motionevent = null;
          goto _L7
_L4:
        a(true);
        p = false;
        q = false;
          goto _L1
        flag = true;
          goto _L10
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        super.requestDisallowInterceptTouchEvent(flag);
        p = flag;
        if (flag)
        {
            a(true);
        }
    }

    public void requestLayout()
    {
        if (!l)
        {
            super.requestLayout();
        }
    }


    private class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        public int a;
        float b;
        boolean c;
        boolean d;

        public LayoutParams()
        {
            super(-1, -1);
            a = 0;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = 0;
            context = context.obtainStyledAttributes(attributeset, FixedDrawerLayout.c());
            a = context.getInt(0, 0);
            context.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            a = 0;
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 0;
            a = layoutparams.a;
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new k();
        int a;
        int b;
        int c;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
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

}
