// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.view.af;
import android.support.v4.view.aj;
import android.support.v4.view.ak;
import android.support.v4.view.al;
import android.support.v4.view.x;
import android.support.v7.app.ActionBar;
import android.support.v7.internal.view.a;
import android.support.v7.internal.view.e;
import android.support.v7.internal.view.f;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.internal.widget.ScrollingTabContainerView;
import android.support.v7.internal.widget.g;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class c extends ActionBar
    implements android.support.v7.internal.widget.ActionBarOverlayLayout.a
{
    public final class a extends android.support.v7.view.a
        implements android.support.v7.internal.view.menu.f.a
    {

        final c a;
        private final Context b;
        private final android.support.v7.internal.view.menu.f c;
        private android.support.v7.view.a.a d;
        private WeakReference e;

        public final MenuInflater a()
        {
            return new e(b);
        }

        public final void a(int i1)
        {
            b(c.j(a).getResources().getString(i1));
        }

        public final void a(View view)
        {
            c.h(a).setCustomView(view);
            e = new WeakReference(view);
        }

        public final void a(CharSequence charsequence)
        {
            c.h(a).setSubtitle(charsequence);
        }

        public final void a(boolean flag)
        {
            super.a(flag);
            c.h(a).setTitleOptional(flag);
        }

        public final Menu b()
        {
            return c;
        }

        public final void b(int i1)
        {
            a(c.j(a).getResources().getString(i1));
        }

        public final void b(CharSequence charsequence)
        {
            c.h(a).setTitle(charsequence);
        }

        public final void c()
        {
            if (a.a != this)
            {
                return;
            }
            if (!android.support.v7.internal.app.c.a(android.support.v7.internal.app.c.f(a), android.support.v7.internal.app.c.g(a)))
            {
                a.b = this;
                a.c = d;
            } else
            {
                d.a(this);
            }
            d = null;
            a.g(false);
            c.h(a).d();
            c.i(a).a().sendAccessibilityEvent(32);
            android.support.v7.internal.app.c.e(a).setHideOnContentScrollEnabled(a.d);
            a.a = null;
        }

        public final void d()
        {
            if (a.a != this)
            {
                return;
            }
            c.g();
            d.b(this, c);
            c.h();
            return;
            Exception exception;
            exception;
            c.h();
            throw exception;
        }

        public final boolean e()
        {
            c.g();
            boolean flag = d.a(this, c);
            c.h();
            return flag;
            Exception exception;
            exception;
            c.h();
            throw exception;
        }

        public final CharSequence f()
        {
            return c.h(a).b();
        }

        public final CharSequence g()
        {
            return c.h(a).c();
        }

        public final boolean h()
        {
            return c.h(a).f();
        }

        public final View i()
        {
            if (e != null)
            {
                return (View)e.get();
            } else
            {
                return null;
            }
        }

        public final boolean onMenuItemSelected(android.support.v7.internal.view.menu.f f1, MenuItem menuitem)
        {
            if (d != null)
            {
                return d.a(this, menuitem);
            } else
            {
                return false;
            }
        }

        public final void onMenuModeChange(android.support.v7.internal.view.menu.f f1)
        {
            if (d == null)
            {
                return;
            } else
            {
                d();
                c.h(a).a();
                return;
            }
        }

        public a(Context context, android.support.v7.view.a.a a1)
        {
            a = c.this;
            super();
            b = context;
            d = a1;
            c = (new android.support.v7.internal.view.menu.f(context)).a();
            c.a(this);
        }
    }


    static final boolean h;
    private static final Interpolator i = new AccelerateInterpolator();
    private static final Interpolator j = new DecelerateInterpolator();
    private static final boolean k;
    private boolean A;
    private int B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private f H;
    private boolean I;
    a a;
    android.support.v7.view.a b;
    android.support.v7.view.a.a c;
    boolean d;
    final aj e;
    final aj f;
    final al g;
    private Context l;
    private Context m;
    private Activity n;
    private Dialog o;
    private ActionBarOverlayLayout p;
    private ActionBarContainer q;
    private g r;
    private ActionBarContextView s;
    private View t;
    private ScrollingTabContainerView u;
    private ArrayList v;
    private int w;
    private boolean x;
    private boolean y;
    private ArrayList z;

    public c(Activity activity, boolean flag)
    {
        v = new ArrayList();
        w = -1;
        z = new ArrayList();
        B = 0;
        C = true;
        G = true;
        e = new ak() {

            final c a;

            public final void b(View view)
            {
                if (android.support.v7.internal.app.c.a(a) && c.b(a) != null)
                {
                    android.support.v4.view.x.b(c.b(a), 0.0F);
                    android.support.v4.view.x.b(c.c(a), 0.0F);
                }
                c.c(a).setVisibility(8);
                c.c(a).setTransitioning(false);
                c.d(a);
                view = a;
                if (((c) (view)).c != null)
                {
                    ((c) (view)).c.a(((c) (view)).b);
                    view.b = null;
                    view.c = null;
                }
                if (android.support.v7.internal.app.c.e(a) != null)
                {
                    android.support.v4.view.x.w(android.support.v7.internal.app.c.e(a));
                }
            }

            
            {
                a = c.this;
                super();
            }
        };
        f = new ak() {

            final c a;

            public final void b(View view)
            {
                c.d(a);
                c.c(a).requestLayout();
            }

            
            {
                a = c.this;
                super();
            }
        };
        g = new al() {

            final c a;

            public final void a()
            {
                ((View)c.c(a).getParent()).invalidate();
            }

            
            {
                a = c.this;
                super();
            }
        };
        n = activity;
        activity = activity.getWindow().getDecorView();
        b(activity);
        if (!flag)
        {
            t = activity.findViewById(0x1020002);
        }
    }

    public c(Dialog dialog)
    {
        v = new ArrayList();
        w = -1;
        z = new ArrayList();
        B = 0;
        C = true;
        G = true;
        e = new _cls1();
        f = new _cls2();
        g = new _cls3();
        o = dialog;
        b(dialog.getWindow().getDecorView());
    }

    private void a(int i1, int j1)
    {
        int k1 = r.n();
        if ((j1 & 4) != 0)
        {
            x = true;
        }
        r.c(i1 & j1 | ~j1 & k1);
    }

    static boolean a(c c1)
    {
        return c1.C;
    }

    static boolean a(boolean flag, boolean flag1)
    {
        return a(flag, flag1, false);
    }

    private static boolean a(boolean flag, boolean flag1, boolean flag2)
    {
        while (flag2 || !flag && !flag1) 
        {
            return true;
        }
        return false;
    }

    static View b(c c1)
    {
        return c1.t;
    }

    private void b(View view)
    {
        Object obj;
        p = (ActionBarOverlayLayout)view.findViewById(android.support.v7.appcompat.a.f.decor_content_parent);
        if (p != null)
        {
            p.setActionBarVisibilityCallback(this);
        }
        obj = view.findViewById(android.support.v7.appcompat.a.f.action_bar);
        if (!(obj instanceof g)) goto _L2; else goto _L1
_L1:
        obj = (g)obj;
_L4:
        r = ((g) (obj));
        s = (ActionBarContextView)view.findViewById(android.support.v7.appcompat.a.f.action_context_bar);
        q = (ActionBarContainer)view.findViewById(android.support.v7.appcompat.a.f.action_bar_container);
        if (r == null || s == null || q == null)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used with a compatible window decor layout").toString());
        }
        break MISSING_BLOCK_LABEL_196;
_L2:
        if (!(obj instanceof Toolbar))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((Toolbar)obj).o();
        if (true) goto _L4; else goto _L3
_L3:
        if ((new StringBuilder("Can't make a decor toolbar out of ")).append(obj).toString() != null)
        {
            view = obj.getClass().getSimpleName();
        } else
        {
            view = "null";
        }
        throw new IllegalStateException(view);
        l = r.b();
        boolean flag;
        if ((r.n() & 4) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            x = true;
        }
        view = android.support.v7.internal.view.a.a(l);
        view.f();
        h(view.d());
        view = l.obtainStyledAttributes(null, android.support.v7.appcompat.a.k.ActionBar, android.support.v7.appcompat.a.a.actionBarStyle, 0);
        if (view.getBoolean(android.support.v7.appcompat.a.k.ActionBar_hideOnContentScroll, false))
        {
            if (!p.a())
            {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            d = true;
            p.setHideOnContentScrollEnabled(true);
        }
        int i1 = view.getDimensionPixelSize(android.support.v7.appcompat.a.k.ActionBar_elevation, 0);
        if (i1 != 0)
        {
            float f1 = i1;
            android.support.v4.view.x.f(q, f1);
        }
        view.recycle();
        return;
    }

    static ActionBarContainer c(c c1)
    {
        return c1.q;
    }

    static f d(c c1)
    {
        c1.H = null;
        return null;
    }

    static ActionBarOverlayLayout e(c c1)
    {
        return c1.p;
    }

    static boolean f(c c1)
    {
        return c1.D;
    }

    static boolean g(c c1)
    {
        return c1.E;
    }

    static ActionBarContextView h(c c1)
    {
        return c1.s;
    }

    private void h(boolean flag)
    {
        boolean flag2 = true;
        A = flag;
        Object obj;
        boolean flag1;
        if (!A)
        {
            r.a(null);
            q.setTabContainer(u);
        } else
        {
            q.setTabContainer(null);
            r.a(u);
        }
        if (r.o() == 2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (u != null)
        {
            if (flag1)
            {
                u.setVisibility(0);
                if (p != null)
                {
                    android.support.v4.view.x.w(p);
                }
            } else
            {
                u.setVisibility(8);
            }
        }
        obj = r;
        if (!A && flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((g) (obj)).a(flag);
        obj = p;
        if (!A && flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        ((ActionBarOverlayLayout) (obj)).setHasNonEmbeddedTabs(flag);
    }

    static g i(c c1)
    {
        return c1.r;
    }

    private void i(boolean flag)
    {
        if (a(D, E, F))
        {
            if (!G)
            {
                G = true;
                if (H != null)
                {
                    H.b();
                }
                q.setVisibility(0);
                if (B == 0 && k && (I || flag))
                {
                    android.support.v4.view.x.b(q, 0.0F);
                    float f3 = -q.getHeight();
                    float f1 = f3;
                    if (flag)
                    {
                        int ai[] = new int[2];
                        int[] _tmp = ai;
                        ai[0] = 0;
                        ai[1] = 0;
                        q.getLocationInWindow(ai);
                        f1 = f3 - (float)ai[1];
                    }
                    android.support.v4.view.x.b(q, f1);
                    f f5 = new f();
                    af af1 = android.support.v4.view.x.s(q).c(0.0F);
                    af1.a(g);
                    f5.a(af1);
                    if (C && t != null)
                    {
                        android.support.v4.view.x.b(t, f1);
                        f5.a(android.support.v4.view.x.s(t).c(0.0F));
                    }
                    f5.a(j);
                    f5.c();
                    f5.a(f);
                    H = f5;
                    f5.a();
                } else
                {
                    android.support.v4.view.x.c(q, 1.0F);
                    android.support.v4.view.x.b(q, 0.0F);
                    if (C && t != null)
                    {
                        android.support.v4.view.x.b(t, 0.0F);
                    }
                    f.b(null);
                }
                if (p != null)
                {
                    android.support.v4.view.x.w(p);
                }
            }
        } else
        if (G)
        {
            G = false;
            if (H != null)
            {
                H.b();
            }
            if (B == 0 && k && (I || flag))
            {
                android.support.v4.view.x.c(q, 1.0F);
                q.setTransitioning(true);
                f f6 = new f();
                float f4 = -q.getHeight();
                float f2 = f4;
                if (flag)
                {
                    int ai1[] = new int[2];
                    int[] _tmp1 = ai1;
                    ai1[0] = 0;
                    ai1[1] = 0;
                    q.getLocationInWindow(ai1);
                    f2 = f4 - (float)ai1[1];
                }
                af af2 = android.support.v4.view.x.s(q).c(f2);
                af2.a(g);
                f6.a(af2);
                if (C && t != null)
                {
                    f6.a(android.support.v4.view.x.s(t).c(f2));
                }
                f6.a(i);
                f6.c();
                f6.a(e);
                H = f6;
                f6.a();
                return;
            } else
            {
                e.b(null);
                return;
            }
        }
    }

    static Context j(c c1)
    {
        return c1.l;
    }

    public final android.support.v7.view.a a(android.support.v7.view.a.a a1)
    {
        if (a != null)
        {
            a.c();
        }
        p.setHideOnContentScrollEnabled(false);
        s.e();
        a1 = new a(s.getContext(), a1);
        if (a1.e())
        {
            a1.d();
            s.a(a1);
            g(true);
            s.sendAccessibilityEvent(32);
            a = a1;
            return a1;
        } else
        {
            return null;
        }
    }

    public final void a()
    {
        r.a(0x7f020207);
    }

    public final void a(int i1)
    {
        r.d(i1);
    }

    public final void a(Configuration configuration)
    {
        h(android.support.v7.internal.view.a.a(l).d());
    }

    public final void a(Drawable drawable)
    {
        q.setPrimaryBackground(drawable);
    }

    public final void a(View view)
    {
        r.a(view);
    }

    public final void a(CharSequence charsequence)
    {
        r.b(charsequence);
    }

    public final void a(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        a(byte0, 2);
    }

    public final void b()
    {
        a(0, 8);
    }

    public final void b(int i1)
    {
        r.e(i1);
    }

    public final void b(Drawable drawable)
    {
        r.b(drawable);
    }

    public final void b(CharSequence charsequence)
    {
        r.a(charsequence);
    }

    public final void b(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        a(byte0, 4);
    }

    public final void c()
    {
        a(16, 16);
    }

    public final void c(int i1)
    {
        B = i1;
    }

    public final void c(boolean flag)
    {
        if (!x)
        {
            b(flag);
        }
    }

    public final View d()
    {
        return r.p();
    }

    public final void d(boolean flag)
    {
        I = flag;
        if (!flag && H != null)
        {
            H.b();
        }
    }

    public final int e()
    {
        return r.n();
    }

    public final void e(boolean flag)
    {
        if (flag != y)
        {
            y = flag;
            int j1 = z.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                z.get(i1);
                i1++;
            }
        }
    }

    public final int f()
    {
        return q.getHeight();
    }

    public final void f(boolean flag)
    {
        C = flag;
    }

    public final void g()
    {
        if (D)
        {
            D = false;
            i(false);
        }
    }

    public final void g(boolean flag)
    {
        af af1;
        af af2;
        f f1;
        if (flag)
        {
            if (!F)
            {
                F = true;
                if (p != null)
                {
                    p.setShowingForActionMode(true);
                }
                i(false);
            }
        } else
        if (F)
        {
            F = false;
            if (p != null)
            {
                p.setShowingForActionMode(false);
            }
            i(false);
        }
        if (flag)
        {
            af2 = r.a(8, 100L);
            af1 = s.a(0, 200L);
        } else
        {
            af1 = r.a(0, 200L);
            af2 = s.a(8, 100L);
        }
        f1 = new f();
        f1.a(af2, af1);
        f1.a();
    }

    public final void h()
    {
        if (!D)
        {
            D = true;
            i(false);
        }
    }

    public final boolean i()
    {
        int i1 = q.getHeight();
        return G && (i1 == 0 || p.b() < i1);
    }

    public final Context j()
    {
        if (m == null)
        {
            TypedValue typedvalue = new TypedValue();
            l.getTheme().resolveAttribute(android.support.v7.appcompat.a.a.actionBarWidgetTheme, typedvalue, true);
            int i1 = typedvalue.resourceId;
            if (i1 != 0)
            {
                m = new ContextThemeWrapper(l, i1);
            } else
            {
                m = l;
            }
        }
        return m;
    }

    public final boolean l()
    {
        if (r != null && r.c())
        {
            r.d();
            return true;
        } else
        {
            return false;
        }
    }

    public final void m()
    {
        if (E)
        {
            E = false;
            i(true);
        }
    }

    public final void n()
    {
        if (!E)
        {
            E = true;
            i(true);
        }
    }

    public final void o()
    {
        if (H != null)
        {
            H.b();
            H = null;
        }
    }

    static 
    {
        boolean flag1 = true;
        boolean flag;
        if (!android/support/v7/internal/app/c.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        k = flag;
    }
}
