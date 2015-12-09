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
import android.support.v7.widget.Toolbar;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import jw;
import jx;
import km;
import me;
import mr;
import ms;
import pz;
import uv;
import vg;
import vo;
import vp;
import we;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarContainer, ContentFrameLayout

public class ActionBarOverlayLayout extends ViewGroup
    implements jw, vo
{

    private static int z[] = {
        0x7f0100ea, 0x1010059
    };
    private final jx A;
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public vg e;
    private int f;
    private ContentFrameLayout g;
    private ActionBarContainer h;
    private vp i;
    private Drawable j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private final Rect o;
    private final Rect p;
    private final Rect q;
    private final Rect r;
    private final Rect s;
    private final Rect t;
    private pz u;
    private me v;
    private final mr w;
    private final Runnable x;
    private final Runnable y;

    public ActionBarOverlayLayout(Context context)
    {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0;
        o = new Rect();
        p = new Rect();
        q = new Rect();
        r = new Rect();
        s = new Rect();
        t = new Rect();
        w = new ms() {

            private ActionBarOverlayLayout a;

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
        x = new Runnable() {

            private ActionBarOverlayLayout a;

            public final void run()
            {
                ActionBarOverlayLayout.b(a);
                ActionBarOverlayLayout.a(a, km.q(ActionBarOverlayLayout.d(a)).c(0.0F).a(ActionBarOverlayLayout.c(a)));
            }

            
            {
                a = ActionBarOverlayLayout.this;
                super();
            }
        };
        y = new Runnable() {

            private ActionBarOverlayLayout a;

            public final void run()
            {
                ActionBarOverlayLayout.b(a);
                ActionBarOverlayLayout.a(a, km.q(ActionBarOverlayLayout.d(a)).c(-ActionBarOverlayLayout.d(a).getHeight()).a(ActionBarOverlayLayout.c(a)));
            }

            
            {
                a = ActionBarOverlayLayout.this;
                super();
            }
        };
        a(context);
        A = new jx();
    }

    static me a(ActionBarOverlayLayout actionbaroverlaylayout, me me1)
    {
        actionbaroverlaylayout.v = me1;
        return me1;
    }

    public static void a()
    {
    }

    private void a(Context context)
    {
        boolean flag1 = true;
        TypedArray typedarray = getContext().getTheme().obtainStyledAttributes(z);
        f = typedarray.getDimensionPixelSize(0, 0);
        j = typedarray.getDrawable(1);
        boolean flag;
        if (j == null)
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
        k = flag;
        u = pz.a(context, null);
    }

    static boolean a(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        actionbaroverlaylayout.m = false;
        return false;
    }

    private static boolean a(View view, Rect rect, boolean flag)
    {
        boolean flag1 = false;
        view = (LayoutParams)view.getLayoutParams();
        if (((LayoutParams) (view)).leftMargin != rect.left)
        {
            view.leftMargin = rect.left;
            flag1 = true;
        }
        if (((LayoutParams) (view)).topMargin != rect.top)
        {
            view.topMargin = rect.top;
            flag1 = true;
        }
        if (((LayoutParams) (view)).rightMargin != rect.right)
        {
            view.rightMargin = rect.right;
            flag1 = true;
        }
        if (flag && ((LayoutParams) (view)).bottomMargin != rect.bottom)
        {
            view.bottomMargin = rect.bottom;
            return true;
        } else
        {
            return flag1;
        }
    }

    private void b(int i1)
    {
        k();
        i1 = Math.max(0, Math.min(i1, h.getHeight()));
        km.b(h, -i1);
    }

    static void b(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        actionbaroverlaylayout.k();
    }

    static mr c(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        return actionbaroverlaylayout.w;
    }

    static ActionBarContainer d(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        return actionbaroverlaylayout.h;
    }

    private void j()
    {
        if (g == null)
        {
            g = (ContentFrameLayout)findViewById(0x7f110000);
            h = (ActionBarContainer)findViewById(0x7f110284);
            Object obj = findViewById(0x7f110285);
            if (obj instanceof vp)
            {
                obj = (vp)obj;
            } else
            if (obj instanceof Toolbar)
            {
                obj = ((Toolbar)obj).j();
            } else
            {
                throw new IllegalStateException((new StringBuilder("Can't make a decor toolbar out of ")).append(obj.getClass().getSimpleName()).toString());
            }
            i = ((vp) (obj));
        }
    }

    private void k()
    {
        removeCallbacks(x);
        removeCallbacks(y);
        if (v != null)
        {
            v.c();
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
            i.e();
            return;

        case 5: // '\005'
            i.f();
            return;

        case 109: // 'm'
            b = true;
            break;
        }
        if (getContext().getApplicationInfo().targetSdkVersion >= 19)
        {
            flag = false;
        }
        k = flag;
    }

    public final void a(Menu menu, uv uv)
    {
        j();
        i.a(menu, uv);
    }

    public final void a(android.view.Window.Callback callback)
    {
        j();
        i.a(callback);
    }

    public final void a(CharSequence charsequence)
    {
        j();
        i.a(charsequence);
    }

    public final void a(boolean flag)
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

    public final int b()
    {
        if (h != null)
        {
            return -(int)km.n(h);
        } else
        {
            return 0;
        }
    }

    public final boolean c()
    {
        j();
        return i.g();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    public final boolean d()
    {
        j();
        return i.h();
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (j != null && !k)
        {
            int i1;
            if (h.getVisibility() == 0)
            {
                i1 = (int)((float)h.getBottom() + km.n(h) + 0.5F);
            } else
            {
                i1 = 0;
            }
            j.setBounds(0, i1, getWidth(), j.getIntrinsicHeight() + i1);
            j.draw(canvas);
        }
    }

    public final boolean e()
    {
        j();
        return i.i();
    }

    public final boolean f()
    {
        j();
        return i.j();
    }

    protected boolean fitSystemWindows(Rect rect)
    {
        j();
        km.s(this);
        boolean flag = a(h, rect, false);
        r.set(rect);
        we.a(this, r, o);
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

    public final boolean g()
    {
        j();
        return i.k();
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
        return A.a;
    }

    public final void h()
    {
        j();
        i.l();
    }

    public final void i()
    {
        j();
        i.m();
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        a(getContext());
        km.t(this);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        k();
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
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                int i2 = view.getMeasuredWidth();
                int j2 = view.getMeasuredHeight();
                int k2 = layoutparams.leftMargin + k1;
                int l2 = layoutparams.topMargin + l1;
                view.layout(k2, l2, i2 + k2, j2 + l2);
            }
        }

    }

    protected void onMeasure(int i1, int j1)
    {
        j();
        measureChildWithMargins(h, i1, 0, j1, 0);
        Object obj = (LayoutParams)h.getLayoutParams();
        int k2 = Math.max(0, h.getMeasuredWidth() + ((LayoutParams) (obj)).leftMargin + ((LayoutParams) (obj)).rightMargin);
        int k1 = h.getMeasuredHeight();
        int l1 = ((LayoutParams) (obj)).topMargin;
        int j2 = Math.max(0, ((LayoutParams) (obj)).bottomMargin + (k1 + l1));
        int i2 = we.a(0, km.l(h));
        if ((km.s(this) & 0x100) != 0)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (l1 != 0)
        {
            k1 = f;
        } else
        if (h.getVisibility() != 8)
        {
            k1 = h.getMeasuredHeight();
        } else
        {
            k1 = 0;
        }
        q.set(o);
        s.set(r);
        if (!b && l1 == 0)
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
        a(g, q, true);
        if (!t.equals(s))
        {
            t.set(s);
            g.a(s);
        }
        measureChildWithMargins(g, i1, 0, j1, 0);
        obj = (LayoutParams)g.getLayoutParams();
        k1 = Math.max(k2, g.getMeasuredWidth() + ((LayoutParams) (obj)).leftMargin + ((LayoutParams) (obj)).rightMargin);
        l1 = g.getMeasuredHeight();
        k2 = ((LayoutParams) (obj)).topMargin;
        l1 = Math.max(j2, ((LayoutParams) (obj)).bottomMargin + (l1 + k2));
        i2 = we.a(i2, km.l(g));
        j2 = getPaddingLeft();
        k2 = getPaddingRight();
        l1 = Math.max(l1 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
        setMeasuredDimension(km.a(Math.max(k1 + (j2 + k2), getSuggestedMinimumWidth()), i1, i2), km.a(l1, j1, i2 << 16));
    }

    public boolean onNestedFling(View view, float f1, float f2, boolean flag)
    {
        boolean flag1 = false;
        if (!l || !flag)
        {
            return false;
        }
        u.a(0, (int)f2, 0, 0);
        if (u.e() > h.getHeight())
        {
            flag1 = true;
        }
        if (flag1)
        {
            k();
            y.run();
        } else
        {
            k();
            x.run();
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
        A.a = i1;
        n = b();
        k();
        if (e != null)
        {
            e.l();
        }
    }

    public boolean onStartNestedScroll(View view, View view1, int i1)
    {
        if ((i1 & 2) == 0 || h.getVisibility() != 0)
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
                if (n > h.getHeight())
                {
                    break label0;
                }
                k();
                postDelayed(x, 600L);
            }
            return;
        }
        k();
        postDelayed(y, 600L);
    }

    public void onWindowSystemUiVisibilityChanged(int i1)
    {
        boolean flag2 = true;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            super.onWindowSystemUiVisibilityChanged(i1);
        }
        j();
        int j1 = d;
        d = i1;
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
        if (e != null)
        {
            vg vg1 = e;
            if (flag1)
            {
                flag2 = false;
            }
            vg1.e(flag2);
            if (flag || !flag1)
            {
                e.j();
            } else
            {
                e.k();
            }
        }
        if (((j1 ^ i1) & 0x100) != 0 && e != null)
        {
            km.t(this);
        }
    }

    protected void onWindowVisibilityChanged(int i1)
    {
        super.onWindowVisibilityChanged(i1);
        a = i1;
        if (e != null)
        {
            e.b(i1);
        }
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
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
