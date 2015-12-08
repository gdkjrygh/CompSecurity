// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.bh;
import android.support.v4.view.bq;
import android.support.v4.view.dn;
import android.support.v4.view.ec;
import android.support.v4.widget.ap;
import android.support.v7.b.b;
import android.support.v7.b.f;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v7.internal.widget:
//            e, f, g, u, 
//            ActionBarContainer, i, ContentFrameLayout, aq, 
//            h

public class ActionBarOverlayLayout extends ViewGroup
{

    static final int a[];
    private final Runnable A;
    private final bh B;
    private int b;
    private int c;
    private ContentFrameLayout d;
    private ActionBarContainer e;
    private u f;
    private Drawable g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private final Rect o;
    private final Rect p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private h u;
    private final int v;
    private ap w;
    private dn x;
    private final ec y;
    private final Runnable z;

    public ActionBarOverlayLayout(Context context)
    {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 0;
        o = new Rect();
        p = new Rect();
        q = new Rect();
        r = new Rect();
        s = new Rect();
        t = new Rect();
        v = 600;
        y = new e(this);
        z = new android.support.v7.internal.widget.f(this);
        A = new g(this);
        a(context);
        B = new bh(this);
    }

    static dn a(ActionBarOverlayLayout actionbaroverlaylayout, dn dn1)
    {
        actionbaroverlaylayout.x = dn1;
        return dn1;
    }

    private u a(View view)
    {
        if (view instanceof u)
        {
            return (u)view;
        }
        if (view instanceof Toolbar)
        {
            return ((Toolbar)view).getWrapper();
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("Can't make a decor toolbar out of ").append(view.getClass().getSimpleName()).toString());
        }
    }

    private void a(Context context)
    {
        boolean flag1 = true;
        TypedArray typedarray = getContext().getTheme().obtainStyledAttributes(a);
        b = typedarray.getDimensionPixelSize(0, 0);
        g = typedarray.getDrawable(1);
        boolean flag;
        if (g == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        typedarray.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        h = flag;
        w = ap.a(context);
    }

    static void a(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        actionbaroverlaylayout.c();
    }

    private boolean a(float f1, float f2)
    {
        boolean flag = false;
        w.a(0, 0, 0, (int)f2, 0, 0, 0x80000000, 0x7fffffff);
        if (w.d() > e.getHeight())
        {
            flag = true;
        }
        return flag;
    }

    static boolean a(ActionBarOverlayLayout actionbaroverlaylayout, boolean flag)
    {
        actionbaroverlaylayout.l = flag;
        return flag;
    }

    private boolean a(View view, Rect rect, boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        boolean flag5 = false;
        view = (i)view.getLayoutParams();
        boolean flag4 = flag5;
        if (flag)
        {
            flag4 = flag5;
            if (((i) (view)).leftMargin != rect.left)
            {
                view.leftMargin = rect.left;
                flag4 = true;
            }
        }
        flag = flag4;
        if (flag1)
        {
            flag = flag4;
            if (((i) (view)).topMargin != rect.top)
            {
                view.topMargin = rect.top;
                flag = true;
            }
        }
        flag1 = flag;
        if (flag3)
        {
            flag1 = flag;
            if (((i) (view)).rightMargin != rect.right)
            {
                view.rightMargin = rect.right;
                flag1 = true;
            }
        }
        if (flag2 && ((i) (view)).bottomMargin != rect.bottom)
        {
            view.bottomMargin = rect.bottom;
            return true;
        } else
        {
            return flag1;
        }
    }

    static ec b(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        return actionbaroverlaylayout.y;
    }

    static ActionBarContainer c(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        return actionbaroverlaylayout.e;
    }

    private void c()
    {
        removeCallbacks(z);
        removeCallbacks(A);
        if (x != null)
        {
            x.a();
        }
    }

    private void d()
    {
        c();
        postDelayed(z, 600L);
    }

    private void e()
    {
        c();
        postDelayed(A, 600L);
    }

    private void f()
    {
        c();
        z.run();
    }

    private void g()
    {
        c();
        A.run();
    }

    protected i a()
    {
        return new i(-1, -1);
    }

    public i a(AttributeSet attributeset)
    {
        return new i(getContext(), attributeset);
    }

    void b()
    {
        if (d == null)
        {
            d = (ContentFrameLayout)findViewById(f.action_bar_activity_content);
            e = (ActionBarContainer)findViewById(f.action_bar_container);
            f = a(findViewById(f.action_bar));
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof i;
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (g != null && !h)
        {
            int i1;
            if (e.getVisibility() == 0)
            {
                i1 = (int)((float)e.getBottom() + bq.h(e) + 0.5F);
            } else
            {
                i1 = 0;
            }
            g.setBounds(0, i1, getWidth(), g.getIntrinsicHeight() + i1);
            g.draw(canvas);
        }
    }

    protected boolean fitSystemWindows(Rect rect)
    {
        b();
        if ((bq.l(this) & 0x100) == 0);
        boolean flag = a(e, rect, true, true, false, true);
        r.set(rect);
        aq.a(this, r, o);
        if (!p.equals(o))
        {
            p.set(o);
            flag = true;
        }
        if (flag)
        {
            requestLayout();
        }
        return true;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return a();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new i(layoutparams);
    }

    public int getActionBarHideOffset()
    {
        if (e != null)
        {
            return -(int)bq.h(e);
        } else
        {
            return 0;
        }
    }

    public int getNestedScrollAxes()
    {
        return B.a();
    }

    public CharSequence getTitle()
    {
        b();
        return f.a();
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        a(getContext());
        bq.m(this);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        c();
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        j1 = getChildCount();
        k1 = getPaddingLeft();
        getPaddingRight();
        l1 = getPaddingTop();
        getPaddingBottom();
        for (i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (view.getVisibility() != 8)
            {
                i i2 = (i)view.getLayoutParams();
                int j2 = view.getMeasuredWidth();
                int k2 = view.getMeasuredHeight();
                int l2 = i2.leftMargin + k1;
                int i3 = i2.topMargin + l1;
                view.layout(l2, i3, j2 + l2, k2 + i3);
            }
        }

    }

    protected void onMeasure(int i1, int j1)
    {
        b();
        measureChildWithMargins(e, i1, 0, j1, 0);
        Object obj = (i)e.getLayoutParams();
        int i3 = Math.max(0, e.getMeasuredWidth() + ((i) (obj)).leftMargin + ((i) (obj)).rightMargin);
        int k1 = e.getMeasuredHeight();
        int l1 = ((i) (obj)).topMargin;
        int l2 = Math.max(0, ((i) (obj)).bottomMargin + (k1 + l1));
        int k2 = aq.a(0, bq.g(e));
        int j2;
        if ((bq.l(this) & 0x100) != 0)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (l1 != 0)
        {
            int i2 = b;
            k1 = i2;
            if (j)
            {
                k1 = i2;
                if (e.getTabContainer() != null)
                {
                    k1 = i2 + b;
                }
            }
        } else
        if (e.getVisibility() != 8)
        {
            k1 = e.getMeasuredHeight();
        } else
        {
            k1 = 0;
        }
        q.set(o);
        s.set(r);
        if (!i && l1 == 0)
        {
            obj = q;
            obj.top = k1 + ((Rect) (obj)).top;
            obj = q;
            obj.bottom = ((Rect) (obj)).bottom + 0;
        } else
        {
            Rect rect = s;
            rect.top = k1 + rect.top;
            rect = s;
            rect.bottom = rect.bottom + 0;
        }
        a(d, q, true, true, true, true);
        if (!t.equals(s))
        {
            t.set(s);
            d.a(s);
        }
        measureChildWithMargins(d, i1, 0, j1, 0);
        obj = (i)d.getLayoutParams();
        k1 = Math.max(i3, d.getMeasuredWidth() + ((i) (obj)).leftMargin + ((i) (obj)).rightMargin);
        l1 = d.getMeasuredHeight();
        j2 = ((i) (obj)).topMargin;
        l1 = Math.max(l2, ((i) (obj)).bottomMargin + (l1 + j2));
        j2 = aq.a(k2, bq.g(d));
        k2 = getPaddingLeft();
        l2 = getPaddingRight();
        l1 = Math.max(l1 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
        setMeasuredDimension(bq.a(Math.max(k1 + (k2 + l2), getSuggestedMinimumWidth()), i1, j2), bq.a(l1, j1, j2 << 16));
    }

    public boolean onNestedFling(View view, float f1, float f2, boolean flag)
    {
        if (!k || !flag)
        {
            return false;
        }
        if (a(f1, f2))
        {
            g();
        } else
        {
            f();
        }
        l = true;
        return true;
    }

    public boolean onNestedPreFling(View view, float f1, float f2)
    {
        return false;
    }

    public void onNestedPreScroll(View view, int i1, int j1, int ai[])
    {
    }

    public void onNestedScroll(View view, int i1, int j1, int k1, int l1)
    {
        m = m + j1;
        setActionBarHideOffset(m);
    }

    public void onNestedScrollAccepted(View view, View view1, int i1)
    {
        B.a(view, view1, i1);
        m = getActionBarHideOffset();
        c();
        if (u != null)
        {
            u.c();
        }
    }

    public boolean onStartNestedScroll(View view, View view1, int i1)
    {
        if ((i1 & 2) == 0 || e.getVisibility() != 0)
        {
            return false;
        } else
        {
            return k;
        }
    }

    public void onStopNestedScroll(View view)
    {
        if (k && !l)
        {
            if (m <= e.getHeight())
            {
                d();
            } else
            {
                e();
            }
        }
        if (u != null)
        {
            u.d();
        }
    }

    public void onWindowSystemUiVisibilityChanged(int i1)
    {
        boolean flag2 = true;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            super.onWindowSystemUiVisibilityChanged(i1);
        }
        b();
        int j1 = n;
        n = i1;
        boolean flag;
        boolean flag1;
        if ((i1 & 4) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((i1 & 0x100) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (u != null)
        {
            h h1 = u;
            if (flag1)
            {
                flag2 = false;
            }
            h1.a(flag2);
            if (flag || !flag1)
            {
                u.a();
            } else
            {
                u.b();
            }
        }
        if (((j1 ^ i1) & 0x100) != 0 && u != null)
        {
            bq.m(this);
        }
    }

    protected void onWindowVisibilityChanged(int i1)
    {
        super.onWindowVisibilityChanged(i1);
        c = i1;
        if (u != null)
        {
            u.a(i1);
        }
    }

    public void setActionBarHideOffset(int i1)
    {
        c();
        i1 = Math.max(0, Math.min(i1, e.getHeight()));
        bq.a(e, -i1);
    }

    public void setActionBarVisibilityCallback(h h1)
    {
        u = h1;
        if (getWindowToken() != null)
        {
            u.a(c);
            if (n != 0)
            {
                onWindowSystemUiVisibilityChanged(n);
                bq.m(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean flag)
    {
        j = flag;
    }

    public void setHideOnContentScrollEnabled(boolean flag)
    {
        if (flag != k)
        {
            k = flag;
            if (!flag)
            {
                c();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i1)
    {
        b();
        f.a(i1);
    }

    public void setIcon(Drawable drawable)
    {
        b();
        f.a(drawable);
    }

    public void setLogo(int i1)
    {
        b();
        f.b(i1);
    }

    public void setOverlayMode(boolean flag)
    {
        i = flag;
        if (flag && getContext().getApplicationInfo().targetSdkVersion < 19)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
    }

    public void setShowingForActionMode(boolean flag)
    {
    }

    public void setUiOptions(int i1)
    {
    }

    public void setWindowCallback(android.view.Window.Callback callback)
    {
        b();
        f.a(callback);
    }

    public void setWindowTitle(CharSequence charsequence)
    {
        b();
        f.a(charsequence);
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }

    static 
    {
        a = (new int[] {
            b.actionBarSize, 0x1010059
        });
    }
}
