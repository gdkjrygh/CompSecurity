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
import android.support.v4.view.af;
import android.support.v4.view.aj;
import android.support.v4.view.ak;
import android.support.v4.view.p;
import android.support.v4.view.q;
import android.support.v4.view.x;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v7.internal.widget:
//            f, ContentFrameLayout, ActionBarContainer, g, 
//            r

public class ActionBarOverlayLayout extends ViewGroup
    implements p, f
{
    public static interface a
    {

        public abstract void c(int i1);

        public abstract void f(boolean flag);

        public abstract void m();

        public abstract void n();

        public abstract void o();
    }

    public static final class b extends android.view.ViewGroup.MarginLayoutParams
    {

        public b()
        {
            super(-1, -1);
        }

        public b(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }

        public b(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
        }
    }


    static final int a[];
    private final Runnable A;
    private final q B;
    private int b;
    private int c;
    private ContentFrameLayout d;
    private ActionBarContainer e;
    private g f;
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
    private a u;
    private final int v;
    private android.support.v4.widget.p w;
    private af x;
    private final aj y;
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
        y = new ak() {

            final ActionBarOverlayLayout a;

            public final void b(View view)
            {
                ActionBarOverlayLayout.a(a, null);
                ActionBarOverlayLayout.a(a);
            }

            public final void c(View view)
            {
                ActionBarOverlayLayout.a(a, null);
                ActionBarOverlayLayout.a(a);
            }

            
            {
                a = ActionBarOverlayLayout.this;
                super();
            }
        };
        z = new Runnable() {

            final ActionBarOverlayLayout a;

            public final void run()
            {
                ActionBarOverlayLayout.b(a);
                ActionBarOverlayLayout.a(a, android.support.v4.view.x.s(ActionBarOverlayLayout.d(a)).c(0.0F).a(ActionBarOverlayLayout.c(a)));
            }

            
            {
                a = ActionBarOverlayLayout.this;
                super();
            }
        };
        A = new Runnable() {

            final ActionBarOverlayLayout a;

            public final void run()
            {
                ActionBarOverlayLayout.b(a);
                ActionBarOverlayLayout.a(a, android.support.v4.view.x.s(ActionBarOverlayLayout.d(a)).c(-ActionBarOverlayLayout.d(a).getHeight()).a(ActionBarOverlayLayout.c(a)));
            }

            
            {
                a = ActionBarOverlayLayout.this;
                super();
            }
        };
        a(context);
        B = new q(this);
    }

    static af a(ActionBarOverlayLayout actionbaroverlaylayout, af af1)
    {
        actionbaroverlaylayout.x = af1;
        return af1;
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
        w = android.support.v4.widget.p.a(context);
    }

    static boolean a(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        actionbaroverlaylayout.l = false;
        return false;
    }

    private static boolean a(View view, Rect rect, boolean flag)
    {
        boolean flag1 = false;
        view = (b)view.getLayoutParams();
        if (((b) (view)).leftMargin != rect.left)
        {
            flag1 = true;
            view.leftMargin = rect.left;
        }
        if (((b) (view)).topMargin != rect.top)
        {
            flag1 = true;
            view.topMargin = rect.top;
        }
        if (((b) (view)).rightMargin != rect.right)
        {
            flag1 = true;
            view.rightMargin = rect.right;
        }
        boolean flag2 = flag1;
        if (flag)
        {
            flag2 = flag1;
            if (((b) (view)).bottomMargin != rect.bottom)
            {
                flag2 = true;
                view.bottomMargin = rect.bottom;
            }
        }
        return flag2;
    }

    static void b(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        actionbaroverlaylayout.j();
    }

    static aj c(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        return actionbaroverlaylayout.y;
    }

    static ActionBarContainer d(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        return actionbaroverlaylayout.e;
    }

    private void i()
    {
        if (d == null)
        {
            d = (ContentFrameLayout)findViewById(android.support.v7.appcompat.a.f.action_bar_activity_content);
            e = (ActionBarContainer)findViewById(android.support.v7.appcompat.a.f.action_bar_container);
            Object obj = findViewById(android.support.v7.appcompat.a.f.action_bar);
            if (obj instanceof g)
            {
                obj = (g)obj;
            } else
            if (obj instanceof Toolbar)
            {
                obj = ((Toolbar)obj).o();
            } else
            {
                throw new IllegalStateException((new StringBuilder("Can't make a decor toolbar out of ")).append(obj.getClass().getSimpleName()).toString());
            }
            f = ((g) (obj));
        }
    }

    private void j()
    {
        removeCallbacks(z);
        removeCallbacks(A);
        if (x != null)
        {
            x.d();
        }
    }

    public final void a(int i1)
    {
        i();
        switch (i1)
        {
        default:
            return;

        case 2: // '\002'
            f.e();
            return;

        case 5: // '\005'
            f.f();
            return;

        case 109: // 'm'
            setOverlayMode(true);
            break;
        }
    }

    public final boolean a()
    {
        return i;
    }

    public final int b()
    {
        if (e != null)
        {
            return -(int)android.support.v4.view.x.p(e);
        } else
        {
            return 0;
        }
    }

    public final boolean c()
    {
        i();
        return f.g();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof b;
    }

    public final boolean d()
    {
        i();
        return f.h();
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (g != null && !h)
        {
            int i1;
            if (e.getVisibility() == 0)
            {
                i1 = (int)((float)e.getBottom() + android.support.v4.view.x.p(e) + 0.5F);
            } else
            {
                i1 = 0;
            }
            g.setBounds(0, i1, getWidth(), g.getIntrinsicHeight() + i1);
            g.draw(canvas);
        }
    }

    public final boolean e()
    {
        i();
        return f.i();
    }

    public final boolean f()
    {
        i();
        return f.j();
    }

    protected boolean fitSystemWindows(Rect rect)
    {
        i();
        android.support.v4.view.x.v(this);
        boolean flag = a(e, rect, false);
        r.set(rect);
        android.support.v7.internal.widget.r.a(this, r, o);
        if (!p.equals(o))
        {
            flag = true;
            p.set(o);
        }
        if (flag)
        {
            requestLayout();
        }
        return true;
    }

    public final boolean g()
    {
        i();
        return f.k();
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new b();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new b(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new b(layoutparams);
    }

    public int getNestedScrollAxes()
    {
        return B.a();
    }

    public final void h()
    {
        i();
        f.m();
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        a(getContext());
        android.support.v4.view.x.w(this);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        j();
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
                b b1 = (b)view.getLayoutParams();
                int i2 = view.getMeasuredWidth();
                int j2 = view.getMeasuredHeight();
                int k2 = k1 + b1.leftMargin;
                int l2 = l1 + b1.topMargin;
                view.layout(k2, l2, k2 + i2, l2 + j2);
            }
        }

    }

    protected void onMeasure(int i1, int j1)
    {
        i();
        int k1 = 0;
        measureChildWithMargins(e, i1, 0, j1, 0);
        Object obj = (b)e.getLayoutParams();
        int i3 = Math.max(0, e.getMeasuredWidth() + ((b) (obj)).leftMargin + ((b) (obj)).rightMargin);
        int l2 = Math.max(0, e.getMeasuredHeight() + ((b) (obj)).topMargin + ((b) (obj)).bottomMargin);
        int k2 = android.support.v7.internal.widget.r.a(0, android.support.v4.view.x.l(e));
        int l1;
        int j2;
        if ((android.support.v4.view.x.v(this) & 0x100) != 0)
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
                if (e.a() != null)
                {
                    k1 = i2 + b;
                }
            }
        } else
        if (e.getVisibility() != 8)
        {
            k1 = e.getMeasuredHeight();
        }
        q.set(o);
        s.set(r);
        if (!i && l1 == 0)
        {
            obj = q;
            obj.top = ((Rect) (obj)).top + k1;
            obj = q;
            obj.bottom = ((Rect) (obj)).bottom + 0;
        } else
        {
            Rect rect = s;
            rect.top = rect.top + k1;
            rect = s;
            rect.bottom = rect.bottom + 0;
        }
        a(d, q, true);
        if (!t.equals(s))
        {
            t.set(s);
            d.a(s);
        }
        measureChildWithMargins(d, i1, 0, j1, 0);
        obj = (b)d.getLayoutParams();
        k1 = Math.max(i3, d.getMeasuredWidth() + ((b) (obj)).leftMargin + ((b) (obj)).rightMargin);
        l1 = Math.max(l2, d.getMeasuredHeight() + ((b) (obj)).topMargin + ((b) (obj)).bottomMargin);
        j2 = android.support.v7.internal.widget.r.a(k2, android.support.v4.view.x.l(d));
        k2 = getPaddingLeft();
        l2 = getPaddingRight();
        l1 = Math.max(getPaddingTop() + getPaddingBottom() + l1, getSuggestedMinimumHeight());
        setMeasuredDimension(android.support.v4.view.x.a(Math.max(k1 + (k2 + l2), getSuggestedMinimumWidth()), i1, j2), android.support.v4.view.x.a(l1, j1, j2 << 16));
    }

    public boolean onNestedFling(View view, float f1, float f2, boolean flag)
    {
        boolean flag1 = false;
        if (!k || !flag)
        {
            return false;
        }
        w.a(0, 0, (int)f2, 0, 0, 0x80000000, 0x7fffffff);
        if (w.e() > e.getHeight())
        {
            flag1 = true;
        }
        if (flag1)
        {
            j();
            A.run();
        } else
        {
            j();
            z.run();
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
        B.a(i1);
        m = b();
        j();
        if (u != null)
        {
            u.o();
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
label0:
        {
            if (k && !l)
            {
                if (m > e.getHeight())
                {
                    break label0;
                }
                j();
                postDelayed(z, 600L);
            }
            return;
        }
        j();
        postDelayed(A, 600L);
    }

    public void onWindowSystemUiVisibilityChanged(int i1)
    {
        boolean flag2 = true;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            super.onWindowSystemUiVisibilityChanged(i1);
        }
        i();
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
            a a1 = u;
            if (flag1)
            {
                flag2 = false;
            }
            a1.f(flag2);
            if (flag || !flag1)
            {
                u.m();
            } else
            {
                u.n();
            }
        }
        if (((j1 ^ i1) & 0x100) != 0 && u != null)
        {
            android.support.v4.view.x.w(this);
        }
    }

    protected void onWindowVisibilityChanged(int i1)
    {
        super.onWindowVisibilityChanged(i1);
        c = i1;
        if (u != null)
        {
            u.c(i1);
        }
    }

    public void setActionBarHideOffset(int i1)
    {
        j();
        i1 = Math.max(0, Math.min(i1, e.getHeight()));
        android.support.v4.view.x.b(e, -i1);
    }

    public void setActionBarVisibilityCallback(a a1)
    {
        u = a1;
        if (getWindowToken() != null)
        {
            u.c(c);
            if (n != 0)
            {
                onWindowSystemUiVisibilityChanged(n);
                android.support.v4.view.x.w(this);
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
                j();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i1)
    {
        i();
        f.a(i1);
    }

    public void setIcon(Drawable drawable)
    {
        i();
        f.a(drawable);
    }

    public void setLogo(int i1)
    {
        i();
        f.b(i1);
    }

    public void setMenu(Menu menu, android.support.v7.internal.view.menu.l.a a1)
    {
        i();
        f.a(menu, a1);
    }

    public void setMenuPrepared()
    {
        i();
        f.l();
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
        i();
        f.a(callback);
    }

    public void setWindowTitle(CharSequence charsequence)
    {
        i();
        f.a(charsequence);
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }

    static 
    {
        a = (new int[] {
            android.support.v7.appcompat.a.a.actionBarSize, 0x1010059
        });
    }
}
