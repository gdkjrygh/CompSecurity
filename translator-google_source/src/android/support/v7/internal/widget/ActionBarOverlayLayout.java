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
import android.support.v4.view.bb;
import android.support.v4.view.bc;
import android.support.v4.view.bt;
import android.support.v4.view.dq;
import android.support.v4.view.eg;
import android.support.v4.widget.bd;
import android.support.v7.a.b;
import android.support.v7.a.g;
import android.support.v7.internal.view.menu.w;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v7.internal.widget:
//            x, e, f, g, 
//            i, ContentFrameLayout, ActionBarContainer, y, 
//            at, h

public class ActionBarOverlayLayout extends ViewGroup
    implements bb, x
{

    static final int b[];
    private final Runnable A;
    private final bc B;
    public boolean a;
    private int c;
    private int d;
    private ContentFrameLayout e;
    private ActionBarContainer f;
    private y g;
    private Drawable h;
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
    private android.support.v4.widget.bc w;
    private dq x;
    private final eg y;
    private final Runnable z;

    public ActionBarOverlayLayout(Context context)
    {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        d = 0;
        o = new Rect();
        p = new Rect();
        q = new Rect();
        r = new Rect();
        s = new Rect();
        t = new Rect();
        v = 600;
        y = new e(this);
        z = new f(this);
        A = new android.support.v7.internal.widget.g(this);
        a(context);
        B = new bc(this);
    }

    static dq a(ActionBarOverlayLayout actionbaroverlaylayout, dq dq1)
    {
        actionbaroverlaylayout.x = dq1;
        return dq1;
    }

    private void a(Context context)
    {
        boolean flag1 = true;
        TypedArray typedarray = getContext().getTheme().obtainStyledAttributes(b);
        c = typedarray.getDimensionPixelSize(0, 0);
        h = typedarray.getDrawable(1);
        boolean flag;
        if (h == null)
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
        i = flag;
        w = android.support.v4.widget.bc.a(context, null);
    }

    static boolean a(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        actionbaroverlaylayout.l = false;
        return false;
    }

    private static boolean a(View view, Rect rect, boolean flag)
    {
        boolean flag1 = false;
        view = (i)view.getLayoutParams();
        if (((i) (view)).leftMargin != rect.left)
        {
            view.leftMargin = rect.left;
            flag1 = true;
        }
        if (((i) (view)).topMargin != rect.top)
        {
            view.topMargin = rect.top;
            flag1 = true;
        }
        if (((i) (view)).rightMargin != rect.right)
        {
            view.rightMargin = rect.right;
            flag1 = true;
        }
        if (flag && ((i) (view)).bottomMargin != rect.bottom)
        {
            view.bottomMargin = rect.bottom;
            return true;
        } else
        {
            return flag1;
        }
    }

    static void b(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        actionbaroverlaylayout.h();
    }

    static eg c(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        return actionbaroverlaylayout.y;
    }

    static ActionBarContainer d(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        return actionbaroverlaylayout.f;
    }

    private void g()
    {
        if (e == null)
        {
            e = (ContentFrameLayout)findViewById(g.action_bar_activity_content);
            f = (ActionBarContainer)findViewById(g.action_bar_container);
            Object obj = findViewById(g.action_bar);
            if (obj instanceof y)
            {
                obj = (y)obj;
            } else
            if (obj instanceof Toolbar)
            {
                obj = ((Toolbar)obj).getWrapper();
            } else
            {
                throw new IllegalStateException((new StringBuilder("Can't make a decor toolbar out of ")).append(obj.getClass().getSimpleName()).toString());
            }
            g = ((y) (obj));
        }
    }

    private void h()
    {
        removeCallbacks(z);
        removeCallbacks(A);
        if (x != null)
        {
            x.a();
        }
    }

    public final void a(int i1)
    {
        g();
        switch (i1)
        {
        case 2: // '\002'
        case 5: // '\005'
        default:
            return;

        case 109: // 'm'
            setOverlayMode(true);
            break;
        }
    }

    public final boolean a()
    {
        g();
        return g.f();
    }

    public final boolean b()
    {
        g();
        return g.g();
    }

    public final boolean c()
    {
        g();
        return g.h();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof i;
    }

    public final boolean d()
    {
        g();
        return g.i();
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (h != null && !i)
        {
            int i1;
            if (f.getVisibility() == 0)
            {
                i1 = (int)((float)f.getBottom() + bt.j(f) + 0.5F);
            } else
            {
                i1 = 0;
            }
            h.setBounds(0, i1, getWidth(), h.getIntrinsicHeight() + i1);
            h.draw(canvas);
        }
    }

    public final boolean e()
    {
        g();
        return g.j();
    }

    public final void f()
    {
        g();
        g.l();
    }

    protected boolean fitSystemWindows(Rect rect)
    {
        g();
        bt.o(this);
        boolean flag = a(f, rect, false);
        r.set(rect);
        at.a(this, r, o);
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
        return new i();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new i(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new i(layoutparams);
    }

    public int getActionBarHideOffset()
    {
        if (f != null)
        {
            return -(int)bt.j(f);
        } else
        {
            return 0;
        }
    }

    public int getNestedScrollAxes()
    {
        return B.a;
    }

    public CharSequence getTitle()
    {
        g();
        return g.e();
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        a(getContext());
        bt.p(this);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        h();
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
        g();
        measureChildWithMargins(f, i1, 0, j1, 0);
        Object obj = (i)f.getLayoutParams();
        int i3 = Math.max(0, f.getMeasuredWidth() + ((i) (obj)).leftMargin + ((i) (obj)).rightMargin);
        int k1 = f.getMeasuredHeight();
        int l1 = ((i) (obj)).topMargin;
        int l2 = Math.max(0, ((i) (obj)).bottomMargin + (k1 + l1));
        int k2 = at.a(0, bt.i(f));
        int j2;
        if ((bt.o(this) & 0x100) != 0)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (l1 != 0)
        {
            int i2 = c;
            k1 = i2;
            if (j)
            {
                k1 = i2;
                if (f.getTabContainer() != null)
                {
                    k1 = i2 + c;
                }
            }
        } else
        if (f.getVisibility() != 8)
        {
            k1 = f.getMeasuredHeight();
        } else
        {
            k1 = 0;
        }
        q.set(o);
        s.set(r);
        if (!a && l1 == 0)
        {
            obj = q;
            obj.top = k1 + ((Rect) (obj)).top;
            obj = q;
            obj.bottom = ((Rect) (obj)).bottom;
        } else
        {
            Rect rect = s;
            rect.top = k1 + rect.top;
            rect = s;
            rect.bottom = rect.bottom;
        }
        a(e, q, true);
        if (!t.equals(s))
        {
            t.set(s);
            e.a(s);
        }
        measureChildWithMargins(e, i1, 0, j1, 0);
        obj = (i)e.getLayoutParams();
        k1 = Math.max(i3, e.getMeasuredWidth() + ((i) (obj)).leftMargin + ((i) (obj)).rightMargin);
        l1 = e.getMeasuredHeight();
        j2 = ((i) (obj)).topMargin;
        l1 = Math.max(l2, ((i) (obj)).bottomMargin + (l1 + j2));
        j2 = at.a(k2, bt.i(e));
        k2 = getPaddingLeft();
        l2 = getPaddingRight();
        l1 = Math.max(l1 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
        setMeasuredDimension(bt.a(Math.max(k1 + (k2 + l2), getSuggestedMinimumWidth()), i1, j2), bt.a(l1, j1, j2 << 16));
    }

    public boolean onNestedFling(View view, float f1, float f2, boolean flag)
    {
        boolean flag1 = false;
        if (!k || !flag)
        {
            return false;
        }
        view = w;
        int i1 = (int)f2;
        ((android.support.v4.widget.bc) (view)).b.a(((android.support.v4.widget.bc) (view)).a, i1);
        if (w.d() > f.getHeight())
        {
            flag1 = true;
        }
        if (flag1)
        {
            h();
            A.run();
        } else
        {
            h();
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
        B.a = i1;
        m = getActionBarHideOffset();
        h();
        if (u != null)
        {
            u.g();
        }
    }

    public boolean onStartNestedScroll(View view, View view1, int i1)
    {
        if ((i1 & 2) == 0 || f.getVisibility() != 0)
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
                if (m > f.getHeight())
                {
                    break label0;
                }
                h();
                postDelayed(z, 600L);
            }
            return;
        }
        h();
        postDelayed(A, 600L);
    }

    public void onWindowSystemUiVisibilityChanged(int i1)
    {
        boolean flag2 = true;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            super.onWindowSystemUiVisibilityChanged(i1);
        }
        g();
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
            h1.d(flag2);
            if (flag || !flag1)
            {
                u.e();
            } else
            {
                u.f();
            }
        }
        if (((j1 ^ i1) & 0x100) != 0 && u != null)
        {
            bt.p(this);
        }
    }

    protected void onWindowVisibilityChanged(int i1)
    {
        super.onWindowVisibilityChanged(i1);
        d = i1;
        if (u != null)
        {
            u.a(i1);
        }
    }

    public void setActionBarHideOffset(int i1)
    {
        h();
        i1 = Math.max(0, Math.min(i1, f.getHeight()));
        bt.a(f, -i1);
    }

    public void setActionBarVisibilityCallback(h h1)
    {
        u = h1;
        if (getWindowToken() != null)
        {
            u.a(d);
            if (n != 0)
            {
                onWindowSystemUiVisibilityChanged(n);
                bt.p(this);
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
                h();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i1)
    {
        g();
        g.a(i1);
    }

    public void setIcon(Drawable drawable)
    {
        g();
        g.a(drawable);
    }

    public void setLogo(int i1)
    {
        g();
        g.b(i1);
    }

    public void setMenu(Menu menu, w w1)
    {
        g();
        g.a(menu, w1);
    }

    public void setMenuPrepared()
    {
        g();
        g.k();
    }

    public void setOverlayMode(boolean flag)
    {
        a = flag;
        if (flag && getContext().getApplicationInfo().targetSdkVersion < 19)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = flag;
    }

    public void setShowingForActionMode(boolean flag)
    {
    }

    public void setUiOptions(int i1)
    {
    }

    public void setWindowCallback(android.view.Window.Callback callback)
    {
        g();
        g.a(callback);
    }

    public void setWindowTitle(CharSequence charsequence)
    {
        g();
        g.a(charsequence);
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }

    static 
    {
        b = (new int[] {
            b.actionBarSize, 0x1010059
        });
    }
}
