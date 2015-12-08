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
import b;
import ma;
import mb;
import mk;
import ob;
import oo;
import rl;
import wk;
import wv;
import ww;
import wx;
import wy;
import wz;
import xo;
import xp;
import yo;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarContainer, ContentFrameLayout

public class ActionBarOverlayLayout extends ViewGroup
    implements ma, xo
{

    private static int z[];
    private final mb A;
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public wy e;
    private int f;
    private ContentFrameLayout g;
    private ActionBarContainer h;
    private xp i;
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
    private rl u;
    private ob v;
    private final oo w;
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
        w = new wv(this);
        x = new ww(this);
        y = new wx(this);
        a(context);
        A = new mb(this);
    }

    public static ob a(ActionBarOverlayLayout actionbaroverlaylayout, ob ob1)
    {
        actionbaroverlaylayout.v = ob1;
        return ob1;
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
        u = rl.a(context, null);
    }

    public static void a(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        actionbaroverlaylayout.k();
    }

    public static boolean a(ActionBarOverlayLayout actionbaroverlaylayout, boolean flag)
    {
        actionbaroverlaylayout.m = false;
        return false;
    }

    private static boolean a(View view, Rect rect, boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        flag = false;
        view = (wz)view.getLayoutParams();
        if (((wz) (view)).leftMargin != rect.left)
        {
            view.leftMargin = rect.left;
            flag = true;
        }
        if (((wz) (view)).topMargin != rect.top)
        {
            view.topMargin = rect.top;
            flag = true;
        }
        if (((wz) (view)).rightMargin != rect.right)
        {
            view.rightMargin = rect.right;
            flag = true;
        }
        if (flag2 && ((wz) (view)).bottomMargin != rect.bottom)
        {
            view.bottomMargin = rect.bottom;
            return true;
        } else
        {
            return flag;
        }
    }

    public static oo b(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        return actionbaroverlaylayout.w;
    }

    private void b(int i1)
    {
        k();
        i1 = Math.max(0, Math.min(i1, h.getHeight()));
        mk.b(h, -i1);
    }

    public static ActionBarContainer c(ActionBarOverlayLayout actionbaroverlaylayout)
    {
        return actionbaroverlaylayout.h;
    }

    private void j()
    {
        if (g == null)
        {
            g = (ContentFrameLayout)findViewById(b.aQ);
            h = (ActionBarContainer)findViewById(b.aR);
            Object obj = findViewById(b.aP);
            if (obj instanceof xp)
            {
                obj = (xp)obj;
            } else
            if (obj instanceof Toolbar)
            {
                obj = ((Toolbar)obj).i();
            } else
            {
                throw new IllegalStateException((new StringBuilder("Can't make a decor toolbar out of ")).append(obj.getClass().getSimpleName()).toString());
            }
            i = ((xp) (obj));
        }
    }

    private void k()
    {
        removeCallbacks(x);
        removeCallbacks(y);
        if (v != null)
        {
            v.a();
        }
    }

    public final void a(int i1)
    {
        boolean flag = true;
        j();
        switch (i1)
        {
        case 2: // '\002'
        case 5: // '\005'
        default:
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

    public final void a(Menu menu, wk wk)
    {
        j();
        i.a(menu, wk);
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
            return -(int)mk.o(h);
        } else
        {
            return 0;
        }
    }

    public final boolean c()
    {
        j();
        return i.f();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof wz;
    }

    public final boolean d()
    {
        j();
        return i.g();
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (j != null && !k)
        {
            int i1;
            if (h.getVisibility() == 0)
            {
                i1 = (int)((float)h.getBottom() + mk.o(h) + 0.5F);
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
        return i.h();
    }

    public final boolean f()
    {
        j();
        return i.i();
    }

    protected boolean fitSystemWindows(Rect rect)
    {
        j();
        mk.t(this);
        boolean flag = a(h, rect, true, true, false, true);
        r.set(rect);
        yo.a(this, r, o);
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
        return i.j();
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new wz(-1, -1);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new wz(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new wz(layoutparams);
    }

    public int getNestedScrollAxes()
    {
        return A.a;
    }

    public final void h()
    {
        j();
        i.k();
    }

    public final void i()
    {
        j();
        i.l();
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        a(getContext());
        mk.u(this);
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
                wz wz1 = (wz)view.getLayoutParams();
                int i2 = view.getMeasuredWidth();
                int j2 = view.getMeasuredHeight();
                int k2 = wz1.leftMargin + k1;
                int l2 = wz1.topMargin + l1;
                view.layout(k2, l2, i2 + k2, j2 + l2);
            }
        }

    }

    protected void onMeasure(int i1, int j1)
    {
        j();
        measureChildWithMargins(h, i1, 0, j1, 0);
        Object obj = (wz)h.getLayoutParams();
        int i3 = Math.max(0, h.getMeasuredWidth() + ((wz) (obj)).leftMargin + ((wz) (obj)).rightMargin);
        int k1 = h.getMeasuredHeight();
        int l1 = ((wz) (obj)).topMargin;
        int l2 = Math.max(0, ((wz) (obj)).bottomMargin + (k1 + l1));
        int k2 = yo.a(0, mk.k(h));
        int j2;
        if ((mk.t(this) & 0x100) != 0)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (l1 != 0)
        {
            int i2 = f;
            k1 = i2;
            if (c)
            {
                k1 = i2;
                if (h.a != null)
                {
                    k1 = i2 + f;
                }
            }
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
        a(g, q, true, true, true, true);
        if (!t.equals(s))
        {
            t.set(s);
            g.a(s);
        }
        measureChildWithMargins(g, i1, 0, j1, 0);
        obj = (wz)g.getLayoutParams();
        k1 = Math.max(i3, g.getMeasuredWidth() + ((wz) (obj)).leftMargin + ((wz) (obj)).rightMargin);
        l1 = g.getMeasuredHeight();
        j2 = ((wz) (obj)).topMargin;
        l1 = Math.max(l2, ((wz) (obj)).bottomMargin + (l1 + j2));
        j2 = yo.a(k2, mk.k(g));
        k2 = getPaddingLeft();
        l2 = getPaddingRight();
        l1 = Math.max(l1 + (getPaddingTop() + getPaddingBottom()), getSuggestedMinimumHeight());
        setMeasuredDimension(mk.a(Math.max(k1 + (k2 + l2), getSuggestedMinimumWidth()), i1, j2), mk.a(l1, j1, j2 << 16));
    }

    public boolean onNestedFling(View view, float f1, float f2, boolean flag)
    {
        boolean flag1 = false;
        if (!l || !flag)
        {
            return false;
        }
        u.a(0, 0, 0, (int)f2, 0, 0, 0x80000000, 0x7fffffff);
        if (u.d() > h.getHeight())
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
            wy wy1 = e;
            if (flag1)
            {
                flag2 = false;
            }
            wy1.h(flag2);
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
            mk.u(this);
        }
    }

    protected void onWindowVisibilityChanged(int i1)
    {
        super.onWindowVisibilityChanged(i1);
        a = i1;
        if (e != null)
        {
            e.g(i1);
        }
    }

    public boolean shouldDelayChildPressedState()
    {
        return false;
    }

    static 
    {
        z = (new int[] {
            b.h, 0x1010059
        });
    }
}
