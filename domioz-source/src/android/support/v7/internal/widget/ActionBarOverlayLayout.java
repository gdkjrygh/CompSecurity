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
import android.support.v4.view.bg;
import android.support.v4.view.bh;
import android.support.v4.view.bp;
import android.support.v4.view.cy;
import android.support.v4.view.do;
import android.support.v4.widget.ae;
import android.support.v7.a.b;
import android.support.v7.a.g;
import android.support.v7.internal.view.menu.y;
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v7.internal.widget:
//            aa, h, i, j, 
//            k, ActionBarContainer, ContentFrameLayout, ab, 
//            l, be

public class ActionBarOverlayLayout extends ViewGroup
    implements bg, aa
{

    static final int a[];
    private final do A;
    private final do B;
    private final Runnable C;
    private final Runnable D;
    private final bh E;
    private int b;
    private int c;
    private ContentFrameLayout d;
    private ActionBarContainer e;
    private ActionBarContainer f;
    private ab g;
    private Drawable h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private final Rect p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private final Rect u;
    private l v;
    private final int w;
    private ae x;
    private cy y;
    private cy z;

    public ActionBarOverlayLayout(Context context)
    {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 0;
        p = new Rect();
        q = new Rect();
        r = new Rect();
        s = new Rect();
        t = new Rect();
        u = new Rect();
        w = 600;
        A = new h(this);
        B = new i(this);
        C = new j(this);
        D = new k(this);
        a(context);
        E = new bh(this);
    }

    static cy a(ActionBarOverlayLayout actionbaroverlaylayout, cy cy1)
    {
        actionbaroverlaylayout.y = cy1;
        return cy1;
    }

    private void a(Context context)
    {
        boolean flag1 = true;
        TypedArray typedarray = getContext().getTheme().obtainStyledAttributes(a);
        b = typedarray.getDimensionPixelSize(0, 0);
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
        x = ae.a(context);
    }

    static boolean a(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        actionbaroverlaylayout.m = false;
        return false;
    }

    private static boolean a(View view, Rect rect, boolean flag, boolean flag1)
    {
        boolean flag2 = false;
        view = (LayoutParams)view.getLayoutParams();
        if (((LayoutParams) (view)).leftMargin != rect.left)
        {
            view.leftMargin = rect.left;
            flag2 = true;
        }
        boolean flag3 = flag2;
        if (flag)
        {
            flag3 = flag2;
            if (((LayoutParams) (view)).topMargin != rect.top)
            {
                view.topMargin = rect.top;
                flag3 = true;
            }
        }
        if (((LayoutParams) (view)).rightMargin != rect.right)
        {
            view.rightMargin = rect.right;
            flag3 = true;
        }
        if (flag1 && ((LayoutParams) (view)).bottomMargin != rect.bottom)
        {
            view.bottomMargin = rect.bottom;
            return true;
        } else
        {
            return flag3;
        }
    }

    static cy b(ActionBarOverlayLayout actionbaroverlaylayout, cy cy1)
    {
        actionbaroverlaylayout.z = cy1;
        return cy1;
    }

    public static void b()
    {
    }

    private void b(int i1)
    {
        k();
        int j1 = f.getHeight();
        i1 = Math.max(0, Math.min(i1, j1));
        bp.b(f, -i1);
        if (e != null && e.getVisibility() != 8)
        {
            i1 = (int)(((float)i1 / (float)j1) * (float)e.getHeight());
            bp.b(e, i1);
        }
    }

    static void b(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        actionbaroverlaylayout.k();
    }

    static do c(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        return actionbaroverlaylayout.A;
    }

    static ActionBarContainer d(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        return actionbaroverlaylayout.f;
    }

    static ActionBarContainer e(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        return actionbaroverlaylayout.e;
    }

    static do f(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        return actionbaroverlaylayout.B;
    }

    private void j()
    {
        if (d == null)
        {
            d = (ContentFrameLayout)findViewById(g.b);
            f = (ActionBarContainer)findViewById(g.c);
            Object obj = findViewById(g.a);
            if (obj instanceof ab)
            {
                obj = (ab)obj;
            } else
            if (obj instanceof Toolbar)
            {
                obj = ((Toolbar)obj).n();
            } else
            {
                throw new IllegalStateException((new StringBuilder("Can't make a decor toolbar out of ")).append(obj.getClass().getSimpleName()).toString());
            }
            g = ((ab) (obj));
            e = (ActionBarContainer)findViewById(g.t);
        }
    }

    private void k()
    {
        removeCallbacks(C);
        removeCallbacks(D);
        if (y != null)
        {
            y.b();
        }
        if (z != null)
        {
            z.b();
        }
    }

    public final void a(int i1)
    {
        boolean flag = true;
        j();
        switch (i1)
        {
        default:
            return;

        case 2: // '\002'
            g.e();
            return;

        case 5: // '\005'
            g.f();
            return;

        case 9: // '\t'
            j = true;
            break;
        }
        if (getContext().getApplicationInfo().targetSdkVersion >= 19)
        {
            flag = false;
        }
        i = flag;
    }

    public final void a(l l1)
    {
        v = l1;
        if (getWindowToken() != null)
        {
            v.a(c);
            if (o != 0)
            {
                onWindowSystemUiVisibilityChanged(o);
                bp.r(this);
            }
        }
    }

    public final void a(Menu menu, y y1)
    {
        j();
        g.a(menu, y1);
    }

    public final void a(android.view.Window.Callback callback)
    {
        j();
        g.a(callback);
    }

    public final void a(CharSequence charsequence)
    {
        j();
        g.a(charsequence);
    }

    public final void a(boolean flag)
    {
        k = flag;
    }

    public final boolean a()
    {
        return j;
    }

    public final void b(boolean flag)
    {
        if (flag != l)
        {
            l = flag;
            if (!flag)
            {
                k();
                b(0);
            }
        }
    }

    public final boolean c()
    {
        j();
        return g.g();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    public final boolean d()
    {
        j();
        return g.h();
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (h != null && !i)
        {
            int i1;
            if (f.getVisibility() == 0)
            {
                i1 = (int)((float)f.getBottom() + bp.l(f) + 0.5F);
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
        j();
        return g.i();
    }

    public final boolean f()
    {
        j();
        return g.j();
    }

    protected boolean fitSystemWindows(Rect rect)
    {
        j();
        bp.q(this);
        boolean flag1 = a(f, rect, true, false);
        boolean flag = flag1;
        if (e != null)
        {
            flag = flag1 | a(e, rect, false, true);
        }
        s.set(rect);
        be.a(this, s, p);
        if (!q.equals(p))
        {
            q.set(p);
            flag = true;
        }
        if (flag)
        {
            requestLayout();
        }
        return true;
    }

    public final boolean g()
    {
        j();
        return g.k();
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
        return new LayoutParams(layoutparams);
    }

    public int getNestedScrollAxes()
    {
        return E.a();
    }

    public final void h()
    {
        j();
        g.l();
    }

    public final void i()
    {
        j();
        g.m();
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        a(getContext());
        bp.r(this);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        k();
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int i2 = getChildCount();
        int j2 = getPaddingLeft();
        getPaddingRight();
        int k2 = getPaddingTop();
        int l2 = getPaddingBottom();
        i1 = 0;
        while (i1 < i2) 
        {
            View view = getChildAt(i1);
            if (view.getVisibility() != 8)
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                int i3 = view.getMeasuredWidth();
                int j3 = view.getMeasuredHeight();
                int k3 = layoutparams.leftMargin + j2;
                if (view == e)
                {
                    k1 = l1 - j1 - l2 - j3 - layoutparams.bottomMargin;
                } else
                {
                    k1 = layoutparams.topMargin + k2;
                }
                view.layout(k3, k1, i3 + k3, j3 + k1);
            }
            i1++;
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        j();
        measureChildWithMargins(f, i1, 0, j1, 0);
        Object obj = (LayoutParams)f.getLayoutParams();
        int l2 = Math.max(0, f.getMeasuredWidth() + ((LayoutParams) (obj)).leftMargin + ((LayoutParams) (obj)).rightMargin);
        int k1 = f.getMeasuredHeight();
        int l1 = ((LayoutParams) (obj)).topMargin;
        int k2 = Math.max(0, ((LayoutParams) (obj)).bottomMargin + (k1 + l1));
        k1 = be.a(0, bp.j(f));
        int i2 = k1;
        int j2 = l2;
        l1 = k2;
        if (e != null)
        {
            measureChildWithMargins(e, i1, 0, j1, 0);
            obj = (LayoutParams)e.getLayoutParams();
            j2 = Math.max(l2, e.getMeasuredWidth() + ((LayoutParams) (obj)).leftMargin + ((LayoutParams) (obj)).rightMargin);
            l1 = e.getMeasuredHeight();
            i2 = ((LayoutParams) (obj)).topMargin;
            l1 = Math.max(k2, ((LayoutParams) (obj)).bottomMargin + (l1 + i2));
            i2 = be.a(k1, bp.j(e));
        }
        if ((bp.q(this) & 0x100) != 0)
        {
            k2 = 1;
        } else
        {
            k2 = 0;
        }
        if (k2 != 0)
        {
            int i3 = b;
            k1 = i3;
            if (k)
            {
                k1 = i3;
                if (f.a() != null)
                {
                    k1 = i3 + b;
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
        r.set(p);
        t.set(s);
        if (!j && k2 == 0)
        {
            obj = r;
            obj.top = k1 + ((Rect) (obj)).top;
            obj = r;
            obj.bottom = ((Rect) (obj)).bottom + 0;
        } else
        {
            Rect rect = t;
            rect.top = k1 + rect.top;
            rect = t;
            rect.bottom = rect.bottom + 0;
        }
        a(d, r, true, true);
        if (!u.equals(t))
        {
            u.set(t);
            d.a(t);
        }
        measureChildWithMargins(d, i1, 0, j1, 0);
        obj = (LayoutParams)d.getLayoutParams();
        k1 = Math.max(j2, d.getMeasuredWidth() + ((LayoutParams) (obj)).leftMargin + ((LayoutParams) (obj)).rightMargin);
        j2 = d.getMeasuredHeight();
        k2 = ((LayoutParams) (obj)).topMargin;
        l1 = Math.max(l1, ((LayoutParams) (obj)).bottomMargin + (j2 + k2));
        i2 = be.a(i2, bp.j(d));
        j2 = getPaddingLeft();
        k2 = getPaddingRight();
        l1 = Math.max(l1 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
        setMeasuredDimension(bp.a(Math.max(k1 + (j2 + k2), getSuggestedMinimumWidth()), i1, i2), bp.a(l1, j1, i2 << 16));
    }

    public boolean onNestedFling(View view, float f1, float f2, boolean flag)
    {
        boolean flag1 = false;
        if (!l || !flag)
        {
            return false;
        }
        x.a(0, (int)f2, 0, 0);
        if (x.e() > f.getHeight())
        {
            flag1 = true;
        }
        if (flag1)
        {
            k();
            D.run();
        } else
        {
            k();
            C.run();
        }
        m = true;
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
        n = n + j1;
        b(n);
    }

    public void onNestedScrollAccepted(View view, View view1, int i1)
    {
        E.a(i1);
        if (f != null)
        {
            i1 = -(int)bp.l(f);
        } else
        {
            i1 = 0;
        }
        n = i1;
        k();
        if (v != null)
        {
            v.g();
        }
    }

    public boolean onStartNestedScroll(View view, View view1, int i1)
    {
        if ((i1 & 2) == 0 || f.getVisibility() != 0)
        {
            return false;
        } else
        {
            return l;
        }
    }

    public void onStopNestedScroll(View view)
    {
label0:
        {
            if (l && !m)
            {
                if (n > f.getHeight())
                {
                    break label0;
                }
                k();
                postDelayed(C, 600L);
            }
            return;
        }
        k();
        postDelayed(D, 600L);
    }

    public void onWindowSystemUiVisibilityChanged(int i1)
    {
        boolean flag2 = true;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            super.onWindowSystemUiVisibilityChanged(i1);
        }
        j();
        int j1 = o;
        o = i1;
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
        if (v != null)
        {
            l l1 = v;
            if (flag1)
            {
                flag2 = false;
            }
            l1.d(flag2);
            if (flag || !flag1)
            {
                v.e();
            } else
            {
                v.f();
            }
        }
        if (((j1 ^ i1) & 0x100) != 0 && v != null)
        {
            bp.r(this);
        }
    }

    protected void onWindowVisibilityChanged(int i1)
    {
        super.onWindowVisibilityChanged(i1);
        c = i1;
        if (v != null)
        {
            v.a(i1);
        }
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }

    static 
    {
        a = (new int[] {
            b.b, 0x1010059
        });
    }

    private class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        public LayoutParams()
        {
            super(-1, -1);
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

}
