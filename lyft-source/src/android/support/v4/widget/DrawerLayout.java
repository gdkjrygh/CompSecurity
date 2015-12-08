// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.content.ContextCompat;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.KeyEventCompat;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewGroupCompat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayoutImpl, ViewDragHelper

public class DrawerLayout extends ViewGroup
    implements DrawerLayoutImpl
{

    static final DrawerLayoutCompatImpl a;
    private static final int b[] = {
        0x10100b3
    };
    private static final boolean c;
    private static final boolean d;
    private Drawable A;
    private CharSequence B;
    private CharSequence C;
    private Object D;
    private boolean E;
    private Drawable F;
    private Drawable G;
    private Drawable H;
    private Drawable I;
    private final ArrayList J;
    private final ChildAccessibilityDelegate e;
    private float f;
    private int g;
    private int h;
    private float i;
    private Paint j;
    private final ViewDragHelper k;
    private final ViewDragHelper l;
    private final ViewDragCallback m;
    private final ViewDragCallback n;
    private int o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private DrawerListener v;
    private float w;
    private float x;
    private Drawable y;
    private Drawable z;

    public DrawerLayout(Context context)
    {
        this(context, null);
    }

    public DrawerLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        e = new ChildAccessibilityDelegate();
        h = 0x99000000;
        j = new Paint();
        q = true;
        F = null;
        G = null;
        H = null;
        I = null;
        setDescendantFocusability(0x40000);
        float f1 = getResources().getDisplayMetrics().density;
        g = (int)(64F * f1 + 0.5F);
        float f2 = 400F * f1;
        m = new ViewDragCallback(3);
        n = new ViewDragCallback(5);
        k = ViewDragHelper.a(this, 1.0F, m);
        k.a(1);
        k.a(f2);
        m.a(k);
        l = ViewDragHelper.a(this, 1.0F, n);
        l.a(2);
        l.a(f2);
        n.a(l);
        setFocusableInTouchMode(true);
        ViewCompat.c(this, 1);
        ViewCompat.a(this, new AccessibilityDelegate());
        ViewGroupCompat.a(this, false);
        if (ViewCompat.r(this))
        {
            a.a(this);
            y = a.a(context);
        }
        f = f1 * 10F;
        J = new ArrayList();
    }

    static View a(DrawerLayout drawerlayout)
    {
        return drawerlayout.k();
    }

    private void a(View view, boolean flag)
    {
        int j1 = getChildCount();
        int i1 = 0;
        while (i1 < j1) 
        {
            View view1 = getChildAt(i1);
            if (!flag && !g(view1) || flag && view1 == view)
            {
                ViewCompat.c(view1, 1);
            } else
            {
                ViewCompat.c(view1, 4);
            }
            i1++;
        }
    }

    private boolean b(Drawable drawable, int i1)
    {
        if (drawable == null || !DrawableCompat.a(drawable))
        {
            return false;
        } else
        {
            DrawableCompat.a(drawable, i1);
            return true;
        }
    }

    static String c(int i1)
    {
        if ((i1 & 3) == 3)
        {
            return "LEFT";
        }
        if ((i1 & 5) == 5)
        {
            return "RIGHT";
        } else
        {
            return Integer.toHexString(i1);
        }
    }

    static int[] d()
    {
        return b;
    }

    static boolean e()
    {
        return c;
    }

    private void f()
    {
        if (d)
        {
            return;
        } else
        {
            z = g();
            A = h();
            return;
        }
    }

    private Drawable g()
    {
        int i1 = ViewCompat.h(this);
        if (i1 == 0)
        {
            if (F != null)
            {
                b(F, i1);
                return F;
            }
        } else
        if (G != null)
        {
            b(G, i1);
            return G;
        }
        return H;
    }

    private Drawable h()
    {
        int i1 = ViewCompat.h(this);
        if (i1 == 0)
        {
            if (G != null)
            {
                b(G, i1);
                return G;
            }
        } else
        if (F != null)
        {
            b(F, i1);
            return F;
        }
        return I;
    }

    private boolean i()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (((LayoutParams)getChildAt(i1).getLayoutParams()).c)
            {
                return true;
            }
        }

        return false;
    }

    private boolean j()
    {
        return k() != null;
    }

    private View k()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (g(view) && k(view))
            {
                return view;
            }
        }

        return null;
    }

    static boolean l(View view)
    {
        return n(view);
    }

    private static boolean m(View view)
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

    private static boolean n(View view)
    {
        return ViewCompat.e(view) != 4 && ViewCompat.e(view) != 2;
    }

    public int a(View view)
    {
        int i1 = e(view);
        if (i1 == 3)
        {
            return r;
        }
        if (i1 == 5)
        {
            return s;
        } else
        {
            return 0;
        }
    }

    View a()
    {
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (((LayoutParams)view.getLayoutParams()).d)
            {
                return view;
            }
        }

        return null;
    }

    public CharSequence a(int i1)
    {
        i1 = GravityCompat.a(i1, ViewCompat.h(this));
        if (i1 == 3)
        {
            return B;
        }
        if (i1 == 5)
        {
            return C;
        } else
        {
            return null;
        }
    }

    public void a(int i1, int j1)
    {
        a(getResources().getDrawable(i1), j1);
    }

    void a(int i1, int j1, View view)
    {
        LayoutParams layoutparams;
        boolean flag = true;
        int k1 = k.a();
        int l1 = l.a();
        i1 = ((flag) ? 1 : 0);
        if (k1 != 1)
        {
            if (l1 == 1)
            {
                i1 = ((flag) ? 1 : 0);
            } else
            if (k1 == 2 || l1 == 2)
            {
                i1 = 2;
            } else
            {
                i1 = 0;
            }
        }
        if (view == null || j1 != 0) goto _L2; else goto _L1
_L1:
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (layoutparams.b != 0.0F) goto _L4; else goto _L3
_L3:
        b(view);
_L2:
        if (i1 != o)
        {
            o = i1;
            if (v != null)
            {
                v.onDrawerStateChanged(i1);
            }
        }
        return;
_L4:
        if (layoutparams.b == 1.0F)
        {
            c(view);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void a(Drawable drawable, int i1)
    {
        if (!d) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((i1 & 0x800003) == 0x800003)
        {
            F = drawable;
        } else
        if ((i1 & 0x800005) == 0x800005)
        {
            G = drawable;
        } else
        {
            if ((i1 & 3) != 3)
            {
                continue; /* Loop/switch isn't completed */
            }
            H = drawable;
        }
_L4:
        f();
        invalidate();
        return;
        if ((i1 & 5) != 5) goto _L1; else goto _L3
_L3:
        I = drawable;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    void a(View view, float f1)
    {
        if (v != null)
        {
            v.onDrawerSlide(view, f1);
        }
    }

    public void a(Object obj, boolean flag)
    {
        D = obj;
        E = flag;
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

    void a(boolean flag)
    {
        int k1 = getChildCount();
        int i1 = 0;
        boolean flag1 = false;
        while (i1 < k1) 
        {
            View view = getChildAt(i1);
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            int j1 = ((flag1) ? 1 : 0);
            if (g(view))
            {
                if (flag && !layoutparams.c)
                {
                    j1 = ((flag1) ? 1 : 0);
                } else
                {
                    j1 = view.getWidth();
                    if (a(view, 3))
                    {
                        flag1 |= k.a(view, -j1, view.getTop());
                    } else
                    {
                        flag1 |= l.a(view, getWidth(), view.getTop());
                    }
                    layoutparams.c = false;
                    j1 = ((flag1) ? 1 : 0);
                }
            }
            i1++;
            flag1 = j1;
        }
        m.a();
        n.a();
        if (flag1)
        {
            invalidate();
        }
    }

    boolean a(View view, int i1)
    {
        return (e(view) & i1) == i1;
    }

    public void addFocusables(ArrayList arraylist, int i1, int j1)
    {
        boolean flag1 = false;
        if (getDescendantFocusability() == 0x60000)
        {
            return;
        }
        int j2 = getChildCount();
        int k1 = 0;
        boolean flag = false;
        while (k1 < j2) 
        {
            View view = getChildAt(k1);
            if (g(view))
            {
                if (j(view))
                {
                    flag = true;
                    view.addFocusables(arraylist, i1, j1);
                }
            } else
            {
                J.add(view);
            }
            k1++;
        }
        if (!flag)
        {
            int i2 = J.size();
            for (int l1 = ((flag1) ? 1 : 0); l1 < i2; l1++)
            {
                View view1 = (View)J.get(l1);
                if (view1.getVisibility() == 0)
                {
                    view1.addFocusables(arraylist, i1, j1);
                }
            }

        }
        J.clear();
    }

    public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        super.addView(view, i1, layoutparams);
        if (a() != null || g(view))
        {
            ViewCompat.c(view, 4);
        } else
        {
            ViewCompat.c(view, 1);
        }
        if (!c)
        {
            ViewCompat.a(view, e);
        }
    }

    View b(int i1)
    {
        int j1 = GravityCompat.a(i1, ViewCompat.h(this));
        int k1 = getChildCount();
        for (i1 = 0; i1 < k1; i1++)
        {
            View view = getChildAt(i1);
            if ((e(view) & 7) == (j1 & 7))
            {
                return view;
            }
        }

        return null;
    }

    public void b()
    {
        a(false);
    }

    public void b(int i1, int j1)
    {
        j1 = GravityCompat.a(j1, ViewCompat.h(this));
        if (j1 == 3)
        {
            r = i1;
        } else
        if (j1 == 5)
        {
            s = i1;
        }
        if (i1 != 0)
        {
            ViewDragHelper viewdraghelper;
            if (j1 == 3)
            {
                viewdraghelper = k;
            } else
            {
                viewdraghelper = l;
            }
            viewdraghelper.e();
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
            h(view);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if ((view = b(j1)) != null)
        {
            i(view);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    void b(View view)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (layoutparams.d)
        {
            layoutparams.d = false;
            if (v != null)
            {
                v.onDrawerClosed(view);
            }
            a(view, false);
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

    void b(View view, float f1)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (f1 == layoutparams.b)
        {
            return;
        } else
        {
            layoutparams.b = f1;
            a(view, f1);
            return;
        }
    }

    void c()
    {
        int i1 = 0;
        if (!u)
        {
            long l1 = SystemClock.uptimeMillis();
            MotionEvent motionevent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
            for (int j1 = getChildCount(); i1 < j1; i1++)
            {
                getChildAt(i1).dispatchTouchEvent(motionevent);
            }

            motionevent.recycle();
            u = true;
        }
    }

    void c(View view)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.d)
        {
            layoutparams.d = true;
            if (v != null)
            {
                v.onDrawerOpened(view);
            }
            a(view, true);
            if (hasWindowFocus())
            {
                sendAccessibilityEvent(32);
            }
            view.requestFocus();
        }
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

        i = f1;
        if (k.a(true) | l.a(true))
        {
            ViewCompat.d(this);
        }
    }

    float d(View view)
    {
        return ((LayoutParams)view.getLayoutParams()).b;
    }

    public void d(int i1)
    {
        View view = b(i1);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No drawer view found with gravity ").append(c(i1)).toString());
        } else
        {
            h(view);
            return;
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        int i1;
        int j1;
        int k1;
        int i2;
        int i3;
        int j3;
        int k3;
        boolean flag1;
        i3 = getHeight();
        flag1 = f(view);
        k1 = 0;
        boolean flag = false;
        i1 = getWidth();
        j3 = canvas.save();
        j1 = i1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_220;
        }
        k3 = getChildCount();
        i2 = 0;
        k1 = ((flag) ? 1 : 0);
_L2:
        if (i2 >= k3)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        View view1 = getChildAt(i2);
        if (view1 == view || view1.getVisibility() != 0 || !m(view1) || !g(view1))
        {
            break; /* Loop/switch isn't completed */
        }
        int k2;
        if (view1.getHeight() < i3)
        {
            k2 = k1;
            j1 = i1;
        } else
        {
label0:
            {
                if (!a(view1, 3))
                {
                    break label0;
                }
                j1 = view1.getRight();
                float f1;
                int j2;
                int l2;
                boolean flag2;
                if (j1 <= k1)
                {
                    j1 = k1;
                }
                k2 = j1;
                j1 = i1;
            }
        }
_L3:
        i2++;
        i1 = j1;
        k1 = k2;
        if (true) goto _L2; else goto _L1
        l2 = view1.getLeft();
        j1 = l2;
        k2 = k1;
        if (l2 < i1) goto _L3; else goto _L1
_L1:
        j1 = i1;
        k2 = k1;
          goto _L3
        canvas.clipRect(k1, 0, i1, getHeight());
        j1 = i1;
        flag2 = super.drawChild(canvas, view, l1);
        canvas.restoreToCount(j3);
        if (i > 0.0F && flag1)
        {
            i1 = (int)((float)((h & 0xff000000) >>> 24) * i);
            j2 = h;
            j.setColor(i1 << 24 | j2 & 0xffffff);
            canvas.drawRect(k1, 0.0F, j1, getHeight(), j);
        } else
        {
            if (z != null && a(view, 3))
            {
                i1 = z.getIntrinsicWidth();
                j1 = view.getRight();
                k1 = k.b();
                f1 = Math.max(0.0F, Math.min((float)j1 / (float)k1, 1.0F));
                z.setBounds(j1, view.getTop(), i1 + j1, view.getBottom());
                z.setAlpha((int)(255F * f1));
                z.draw(canvas);
                return flag2;
            }
            if (A != null && a(view, 5))
            {
                i1 = A.getIntrinsicWidth();
                j1 = view.getLeft();
                k1 = getWidth();
                j2 = l.b();
                f1 = Math.max(0.0F, Math.min((float)(k1 - j1) / (float)j2, 1.0F));
                A.setBounds(j1 - i1, view.getTop(), j1, view.getBottom());
                A.setAlpha((int)(255F * f1));
                A.draw(canvas);
                return flag2;
            }
        }
        return flag2;
    }

    int e(View view)
    {
        return GravityCompat.a(((LayoutParams)view.getLayoutParams()).a, ViewCompat.h(this));
    }

    public void e(int i1)
    {
        View view = b(i1);
        if (view == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No drawer view found with gravity ").append(c(i1)).toString());
        } else
        {
            i(view);
            return;
        }
    }

    public boolean f(int i1)
    {
        View view = b(i1);
        if (view != null)
        {
            return j(view);
        } else
        {
            return false;
        }
    }

    boolean f(View view)
    {
        return ((LayoutParams)view.getLayoutParams()).a == 0;
    }

    public boolean g(int i1)
    {
        View view = b(i1);
        if (view != null)
        {
            return k(view);
        } else
        {
            return false;
        }
    }

    boolean g(View view)
    {
        return (GravityCompat.a(((LayoutParams)view.getLayoutParams()).a, ViewCompat.h(view)) & 7) != 0;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams(-1, -1);
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

    public float getDrawerElevation()
    {
        if (d)
        {
            return f;
        } else
        {
            return 0.0F;
        }
    }

    public Drawable getStatusBarBackgroundDrawable()
    {
        return y;
    }

    public void h(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a sliding drawer").toString());
        }
        if (q)
        {
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            layoutparams.b = 1.0F;
            layoutparams.d = true;
            a(view, true);
        } else
        if (a(view, 3))
        {
            k.a(view, 0, view.getTop());
        } else
        {
            l.a(view, getWidth() - view.getWidth(), view.getTop());
        }
        invalidate();
    }

    public void i(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a sliding drawer").toString());
        }
        if (q)
        {
            view = (LayoutParams)view.getLayoutParams();
            view.b = 0.0F;
            view.d = false;
        } else
        if (a(view, 3))
        {
            k.a(view, -view.getWidth(), view.getTop());
        } else
        {
            l.a(view, getWidth(), view.getTop());
        }
        invalidate();
    }

    public boolean j(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a drawer").toString());
        } else
        {
            return ((LayoutParams)view.getLayoutParams()).d;
        }
    }

    public boolean k(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a drawer").toString());
        }
        return ((LayoutParams)view.getLayoutParams()).b > 0.0F;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        q = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        q = true;
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (E && y != null)
        {
            int i1 = a.a(D);
            if (i1 > 0)
            {
                y.setBounds(0, 0, getWidth(), i1);
                y.draw(canvas);
            }
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag1 = false;
        i1 = MotionEventCompat.a(motionevent);
        flag2 = k.a(motionevent);
        flag3 = l.a(motionevent);
        i1;
        JVM INSTR tableswitch 0 3: default 60
    //                   0 96
    //                   1 196
    //                   2 165
    //                   3 196;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        boolean flag = false;
_L8:
        if (flag2 | flag3 || flag || i() || u)
        {
            flag1 = true;
        }
        return flag1;
_L2:
        float f1;
        float f2;
        f1 = motionevent.getX();
        f2 = motionevent.getY();
        w = f1;
        x = f2;
        if (i <= 0.0F) goto _L6; else goto _L5
_L5:
        motionevent = k.d((int)f1, (int)f2);
        if (motionevent == null || !f(motionevent)) goto _L6; else goto _L7
_L7:
        flag = true;
_L10:
        t = false;
        u = false;
          goto _L8
_L4:
        if (!k.d(3)) goto _L1; else goto _L9
_L9:
        m.a();
        n.a();
        flag = false;
          goto _L8
_L3:
        a(true);
        t = false;
        u = false;
          goto _L1
_L6:
        flag = false;
          goto _L10
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4 && j())
        {
            KeyEventCompat.b(keyevent);
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            keyevent = k();
            if (keyevent != null && a(keyevent) == 0)
            {
                b();
            }
            return keyevent != null;
        } else
        {
            return super.onKeyUp(i1, keyevent);
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int k2;
        int l2;
        p = true;
        k2 = k1 - i1;
        l2 = getChildCount();
        k1 = 0;
_L2:
        View view;
        if (k1 >= l2)
        {
            break MISSING_BLOCK_LABEL_450;
        }
        view = getChildAt(k1);
        if (view.getVisibility() != 8)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        k1++;
        if (true) goto _L2; else goto _L1
_L1:
        LayoutParams layoutparams;
label0:
        {
            layoutparams = (LayoutParams)view.getLayoutParams();
            if (!f(view))
            {
                break label0;
            }
            view.layout(layoutparams.leftMargin, layoutparams.topMargin, layoutparams.leftMargin + view.getMeasuredWidth(), layoutparams.topMargin + view.getMeasuredHeight());
        }
          goto _L3
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
        JVM INSTR lookupswitch 2: default 216
    //                   16: 360
    //                   80: 320;
           goto _L4 _L5 _L6
_L5:
        break MISSING_BLOCK_LABEL_360;
_L4:
        view.layout(i2, layoutparams.topMargin, i3 + i2, j3 + layoutparams.topMargin);
_L7:
        if (flag1)
        {
            b(view, f1);
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
          goto _L3
_L6:
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
        p = false;
        q = false;
        return;
          goto _L3
    }

    protected void onMeasure(int i1, int j1)
    {
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        i2 = 300;
        l2 = android.view.View.MeasureSpec.getMode(i1);
        k2 = android.view.View.MeasureSpec.getMode(j1);
        l1 = android.view.View.MeasureSpec.getSize(i1);
        j2 = android.view.View.MeasureSpec.getSize(j1);
        if (l2 != 0x40000000) goto _L2; else goto _L1
_L1:
        int k1 = l1;
        if (k2 == 0x40000000) goto _L3; else goto _L2
_L2:
        if (!isInEditMode()) goto _L5; else goto _L4
_L4:
        if (l2 != 0x80000000) goto _L7; else goto _L6
_L6:
        k1 = l1;
_L11:
        if (k2 == 0x80000000)
        {
            l1 = j2;
            i2 = k1;
            break MISSING_BLOCK_LABEL_84;
        }
        l1 = i2;
        i2 = k1;
          goto _L8
_L7:
        k1 = l1;
        if (l2 == 0)
        {
            k1 = 300;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        if (k2 == 0) goto _L9; else goto _L3
_L3:
        l1 = j2;
        i2 = k1;
          goto _L9
_L5:
        throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
_L9:
        setMeasuredDimension(i2, l1);
        if (D != null && ViewCompat.r(this))
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        k2 = ViewCompat.h(this);
        l2 = getChildCount();
        j2 = 0;
        while (j2 < l2) 
        {
            View view = getChildAt(j2);
            if (view.getVisibility() != 8)
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                if (k1 != 0)
                {
                    int i3 = GravityCompat.a(layoutparams.a, k2);
                    if (ViewCompat.r(view))
                    {
                        a.a(view, D, i3);
                    } else
                    {
                        a.a(layoutparams, D, i3);
                    }
                }
                if (f(view))
                {
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i2 - layoutparams.leftMargin - layoutparams.rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l1 - layoutparams.topMargin - layoutparams.bottomMargin, 0x40000000));
                } else
                if (g(view))
                {
                    if (d && ViewCompat.q(view) != f)
                    {
                        ViewCompat.f(view, f);
                    }
                    int j3 = e(view) & 7;
                    if ((0 & j3) != 0)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Child drawer has absolute gravity ").append(c(j3)).append(" but this ").append("DrawerLayout").append(" already has a ").append("drawer view along that edge").toString());
                    }
                    view.measure(getChildMeasureSpec(i1, g + layoutparams.leftMargin + layoutparams.rightMargin, layoutparams.width), getChildMeasureSpec(j1, layoutparams.topMargin + layoutparams.bottomMargin, layoutparams.height));
                } else
                {
                    throw new IllegalStateException((new StringBuilder()).append("Child ").append(view).append(" at index ").append(j2).append(" does not have a valid layout_gravity - must be Gravity.LEFT, ").append("Gravity.RIGHT or Gravity.NO_GRAVITY").toString());
                }
            }
            j2++;
        }
        return;
        if (true) goto _L11; else goto _L10
_L10:
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
                h(view);
            }
        }
        b(((SavedState) (parcelable)).b, 3);
        b(((SavedState) (parcelable)).c, 5);
    }

    public void onRtlPropertiesChanged(int i1)
    {
        f();
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        View view = a();
        if (view != null)
        {
            savedstate.a = ((LayoutParams)view.getLayoutParams()).a;
        }
        savedstate.b = r;
        savedstate.c = s;
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        k.b(motionevent);
        l.b(motionevent);
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
        w = f1;
        x = f3;
        t = false;
        u = false;
        return true;
_L3:
        float f2;
        float f4;
        f4 = motionevent.getX();
        f2 = motionevent.getY();
        motionevent = k.d((int)f4, (int)f2);
        if (motionevent == null || !f(motionevent)) goto _L6; else goto _L5
_L5:
        int i1;
        f4 -= w;
        f2 -= x;
        i1 = k.d();
        if (f4 * f4 + f2 * f2 >= (float)(i1 * i1)) goto _L6; else goto _L7
_L7:
        motionevent = a();
        if (motionevent == null) goto _L6; else goto _L8
_L8:
        boolean flag;
        if (a(motionevent) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L10:
        a(flag);
        t = false;
        return true;
_L4:
        a(true);
        t = false;
        u = false;
        return true;
_L6:
        flag = true;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        super.requestDisallowInterceptTouchEvent(flag);
        t = flag;
        if (flag)
        {
            a(true);
        }
    }

    public void requestLayout()
    {
        if (!p)
        {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f1)
    {
        f = f1;
        for (int i1 = 0; i1 < getChildCount(); i1++)
        {
            View view = getChildAt(i1);
            if (g(view))
            {
                ViewCompat.f(view, f);
            }
        }

    }

    public void setDrawerListener(DrawerListener drawerlistener)
    {
        v = drawerlistener;
    }

    public void setDrawerLockMode(int i1)
    {
        b(i1, 3);
        b(i1, 5);
    }

    public void setScrimColor(int i1)
    {
        h = i1;
        invalidate();
    }

    public void setStatusBarBackground(int i1)
    {
        Drawable drawable;
        if (i1 != 0)
        {
            drawable = ContextCompat.getDrawable(getContext(), i1);
        } else
        {
            drawable = null;
        }
        y = drawable;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable)
    {
        y = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i1)
    {
        y = new ColorDrawable(i1);
        invalidate();
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
        c = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        d = flag;
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new DrawerLayoutCompatImplApi21();
        } else
        {
            a = new DrawerLayoutCompatImplBase();
        }
    }

    private class ChildAccessibilityDelegate extends AccessibilityDelegateCompat
    {

        final DrawerLayout b;

        public void a(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            super.a(view, accessibilitynodeinfocompat);
            if (!DrawerLayout.l(view))
            {
                accessibilitynodeinfocompat.c(null);
            }
        }

        ChildAccessibilityDelegate()
        {
            b = DrawerLayout.this;
            super();
        }
    }


    private class ViewDragCallback extends ViewDragHelper.Callback
    {

        final DrawerLayout a;
        private final int b;
        private ViewDragHelper c;
        private final Runnable d = new Runnable() {

            final ViewDragCallback a;

            public void run()
            {
                ViewDragCallback.a(a);
            }

                
                {
                    a = ViewDragCallback.this;
                    super();
                }
        };

        static void a(ViewDragCallback viewdragcallback)
        {
            viewdragcallback.c();
        }

        private void b()
        {
            byte byte0 = 3;
            if (b == 3)
            {
                byte0 = 5;
            }
            View view = a.b(byte0);
            if (view != null)
            {
                a.i(view);
            }
        }

        private void c()
        {
            int i1 = 0;
            int j1 = c.b();
            View view;
            boolean flag;
            if (b == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                view = a.b(3);
                if (view != null)
                {
                    i1 = -view.getWidth();
                }
                i1 += j1;
            } else
            {
                view = a.b(5);
                i1 = a.getWidth();
                i1 -= j1;
            }
            if (view != null && (flag && view.getLeft() < i1 || !flag && view.getLeft() > i1) && a.a(view) == 0)
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                c.a(view, i1, view.getTop());
                layoutparams.c = true;
                a.invalidate();
                b();
                a.c();
            }
        }

        public void a()
        {
            a.removeCallbacks(d);
        }

        public void a(ViewDragHelper viewdraghelper)
        {
            c = viewdraghelper;
        }

        public int clampViewPositionHorizontal(View view, int i1, int j1)
        {
            if (a.a(view, 3))
            {
                return Math.max(-view.getWidth(), Math.min(i1, 0));
            } else
            {
                j1 = a.getWidth();
                return Math.max(j1 - view.getWidth(), Math.min(i1, j1));
            }
        }

        public int clampViewPositionVertical(View view, int i1, int j1)
        {
            return view.getTop();
        }

        public int getViewHorizontalDragRange(View view)
        {
            if (a.g(view))
            {
                return view.getWidth();
            } else
            {
                return 0;
            }
        }

        public void onEdgeDragStarted(int i1, int j1)
        {
            View view;
            if ((i1 & 1) == 1)
            {
                view = a.b(3);
            } else
            {
                view = a.b(5);
            }
            if (view != null && a.a(view) == 0)
            {
                c.a(view, j1);
            }
        }

        public boolean onEdgeLock(int i1)
        {
            return false;
        }

        public void onEdgeTouched(int i1, int j1)
        {
            a.postDelayed(d, 160L);
        }

        public void onViewCaptured(View view, int i1)
        {
            ((LayoutParams)view.getLayoutParams()).c = false;
            b();
        }

        public void onViewDragStateChanged(int i1)
        {
            a.a(b, i1, c.c());
        }

        public void onViewPositionChanged(View view, int i1, int j1, int k1, int l1)
        {
            j1 = view.getWidth();
            float f1;
            if (a.a(view, 3))
            {
                f1 = (float)(j1 + i1) / (float)j1;
            } else
            {
                f1 = (float)(a.getWidth() - i1) / (float)j1;
            }
            a.b(view, f1);
            if (f1 == 0.0F)
            {
                i1 = 4;
            } else
            {
                i1 = 0;
            }
            view.setVisibility(i1);
            a.invalidate();
        }

        public void onViewReleased(View view, float f1, float f2)
        {
            int k1;
            f2 = a.d(view);
            k1 = view.getWidth();
            if (!a.a(view, 3)) goto _L2; else goto _L1
_L1:
            int i1;
            if (f1 > 0.0F || f1 == 0.0F && f2 > 0.5F)
            {
                i1 = 0;
            } else
            {
                i1 = -k1;
            }
_L4:
            c.a(i1, view.getTop());
            a.invalidate();
            return;
_L2:
            int j1 = a.getWidth();
            if (f1 >= 0.0F)
            {
                i1 = j1;
                if (f1 != 0.0F)
                {
                    continue; /* Loop/switch isn't completed */
                }
                i1 = j1;
                if (f2 <= 0.5F)
                {
                    continue; /* Loop/switch isn't completed */
                }
            }
            i1 = j1 - k1;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public boolean tryCaptureView(View view, int i1)
        {
            return a.g(view) && a.a(view, b) && a.a(view) == 0;
        }

        public ViewDragCallback(int i1)
        {
            a = DrawerLayout.this;
            super();
            b = i1;
        }
    }


    private class AccessibilityDelegate extends AccessibilityDelegateCompat
    {

        final DrawerLayout b;
        private final Rect c = new Rect();

        private void a(AccessibilityNodeInfoCompat accessibilitynodeinfocompat, AccessibilityNodeInfoCompat accessibilitynodeinfocompat1)
        {
            Rect rect = c;
            accessibilitynodeinfocompat1.a(rect);
            accessibilitynodeinfocompat.b(rect);
            accessibilitynodeinfocompat1.c(rect);
            accessibilitynodeinfocompat.d(rect);
            accessibilitynodeinfocompat.c(accessibilitynodeinfocompat1.g());
            accessibilitynodeinfocompat.a(accessibilitynodeinfocompat1.o());
            accessibilitynodeinfocompat.b(accessibilitynodeinfocompat1.p());
            accessibilitynodeinfocompat.c(accessibilitynodeinfocompat1.r());
            accessibilitynodeinfocompat.h(accessibilitynodeinfocompat1.l());
            accessibilitynodeinfocompat.f(accessibilitynodeinfocompat1.j());
            accessibilitynodeinfocompat.a(accessibilitynodeinfocompat1.e());
            accessibilitynodeinfocompat.b(accessibilitynodeinfocompat1.f());
            accessibilitynodeinfocompat.d(accessibilitynodeinfocompat1.h());
            accessibilitynodeinfocompat.e(accessibilitynodeinfocompat1.i());
            accessibilitynodeinfocompat.g(accessibilitynodeinfocompat1.k());
            accessibilitynodeinfocompat.a(accessibilitynodeinfocompat1.b());
        }

        private void a(AccessibilityNodeInfoCompat accessibilitynodeinfocompat, ViewGroup viewgroup)
        {
            int j1 = viewgroup.getChildCount();
            for (int i1 = 0; i1 < j1; i1++)
            {
                View view = viewgroup.getChildAt(i1);
                if (DrawerLayout.l(view))
                {
                    accessibilitynodeinfocompat.b(view);
                }
            }

        }

        public void a(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            if (DrawerLayout.e())
            {
                super.a(view, accessibilitynodeinfocompat);
            } else
            {
                AccessibilityNodeInfoCompat accessibilitynodeinfocompat1 = AccessibilityNodeInfoCompat.a(accessibilitynodeinfocompat);
                super.a(view, accessibilitynodeinfocompat1);
                accessibilitynodeinfocompat.a(view);
                android.view.ViewParent viewparent = ViewCompat.i(view);
                if (viewparent instanceof View)
                {
                    accessibilitynodeinfocompat.c((View)viewparent);
                }
                a(accessibilitynodeinfocompat, accessibilitynodeinfocompat1);
                accessibilitynodeinfocompat1.s();
                a(accessibilitynodeinfocompat, (ViewGroup)view);
            }
            accessibilitynodeinfocompat.b(android/support/v4/widget/DrawerLayout.getName());
            accessibilitynodeinfocompat.a(false);
            accessibilitynodeinfocompat.b(false);
            accessibilitynodeinfocompat.a(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.a);
            accessibilitynodeinfocompat.a(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.b);
        }

        public boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
        {
            if (DrawerLayout.e() || DrawerLayout.l(view))
            {
                return super.a(viewgroup, view, accessibilityevent);
            } else
            {
                return false;
            }
        }

        public boolean b(View view, AccessibilityEvent accessibilityevent)
        {
            if (accessibilityevent.getEventType() == 32)
            {
                view = accessibilityevent.getText();
                accessibilityevent = DrawerLayout.a(b);
                if (accessibilityevent != null)
                {
                    int i1 = b.e(accessibilityevent);
                    accessibilityevent = b.a(i1);
                    if (accessibilityevent != null)
                    {
                        view.add(accessibilityevent);
                    }
                }
                return true;
            } else
            {
                return super.b(view, accessibilityevent);
            }
        }

        public void d(View view, AccessibilityEvent accessibilityevent)
        {
            super.d(view, accessibilityevent);
            accessibilityevent.setClassName(android/support/v4/widget/DrawerLayout.getName());
        }

        AccessibilityDelegate()
        {
            b = DrawerLayout.this;
            super();
        }
    }


    private class DrawerLayoutCompatImpl
    {

        public abstract int a(Object obj);

        public abstract Drawable a(Context context);

        public abstract void a(View view);

        public abstract void a(View view, Object obj, int i1);

        public abstract void a(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i1);
    }


    private class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        public int a;
        float b;
        boolean c;
        boolean d;

        public LayoutParams(int i1, int j1)
        {
            super(i1, j1);
            a = 0;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = 0;
            context = context.obtainStyledAttributes(attributeset, DrawerLayout.d());
            a = context.getInt(0, 0);
            context.recycle();
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 0;
            a = layoutparams.a;
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
    }


    private class DrawerListener
    {

        public abstract void onDrawerClosed(View view);

        public abstract void onDrawerOpened(View view);

        public abstract void onDrawerSlide(View view, float f1);

        public abstract void onDrawerStateChanged(int i1);
    }


    private class SavedState extends android.view.View.BaseSavedState
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


    private class DrawerLayoutCompatImplApi21
        implements DrawerLayoutCompatImpl
    {

        public int a(Object obj)
        {
            return DrawerLayoutCompatApi21.a(obj);
        }

        public Drawable a(Context context)
        {
            return DrawerLayoutCompatApi21.a(context);
        }

        public void a(View view)
        {
            DrawerLayoutCompatApi21.a(view);
        }

        public void a(View view, Object obj, int i1)
        {
            DrawerLayoutCompatApi21.a(view, obj, i1);
        }

        public void a(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i1)
        {
            DrawerLayoutCompatApi21.a(marginlayoutparams, obj, i1);
        }

        DrawerLayoutCompatImplApi21()
        {
        }
    }


    private class DrawerLayoutCompatImplBase
        implements DrawerLayoutCompatImpl
    {

        public int a(Object obj)
        {
            return 0;
        }

        public Drawable a(Context context)
        {
            return null;
        }

        public void a(View view)
        {
        }

        public void a(View view, Object obj, int i1)
        {
        }

        public void a(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i1)
        {
        }

        DrawerLayoutCompatImplBase()
        {
        }
    }

}
