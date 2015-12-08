// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v4.view.bt;
import android.support.v4.view.dq;
import android.support.v4.view.dz;
import android.support.v4.view.eg;
import android.support.v4.view.ei;
import android.support.v7.a.b;
import android.support.v7.a.g;
import android.support.v7.a.l;
import android.support.v7.app.a;
import android.support.v7.internal.view.i;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.internal.widget.ScrollingTabContainerView;
import android.support.v7.internal.widget.h;
import android.support.v7.internal.widget.y;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.a:
//            f, g, h, i

public final class e extends a
    implements h
{

    private static final Interpolator h = new AccelerateInterpolator();
    private static final Interpolator i = new DecelerateInterpolator();
    private static final boolean j;
    private int A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private i G;
    private boolean H;
    android.support.v7.internal.a.i a;
    android.support.v7.c.a b;
    android.support.v7.c.b c;
    boolean d;
    final eg e;
    final eg f;
    final ei g;
    private Context k;
    private Context l;
    private Activity m;
    private Dialog n;
    private ActionBarOverlayLayout o;
    private ActionBarContainer p;
    private y q;
    private ActionBarContextView r;
    private View s;
    private ScrollingTabContainerView t;
    private ArrayList u;
    private int v;
    private boolean w;
    private boolean x;
    private ArrayList y;
    private boolean z;

    public e(Activity activity, boolean flag)
    {
        u = new ArrayList();
        v = -1;
        y = new ArrayList();
        A = 0;
        B = true;
        F = true;
        e = new f(this);
        f = new android.support.v7.internal.a.g(this);
        g = new android.support.v7.internal.a.h(this);
        m = activity;
        activity = activity.getWindow().getDecorView();
        a(activity);
        if (!flag)
        {
            s = activity.findViewById(0x1020002);
        }
    }

    public e(Dialog dialog)
    {
        u = new ArrayList();
        v = -1;
        y = new ArrayList();
        A = 0;
        B = true;
        F = true;
        e = new f(this);
        f = new android.support.v7.internal.a.g(this);
        g = new android.support.v7.internal.a.h(this);
        n = dialog;
        a(dialog.getWindow().getDecorView());
    }

    private void a(View view)
    {
        Object obj;
        o = (ActionBarOverlayLayout)view.findViewById(g.decor_content_parent);
        if (o != null)
        {
            o.setActionBarVisibilityCallback(this);
        }
        obj = view.findViewById(g.action_bar);
        if (!(obj instanceof y)) goto _L2; else goto _L1
_L1:
        obj = (y)obj;
_L4:
        q = ((y) (obj));
        r = (ActionBarContextView)view.findViewById(g.action_context_bar);
        p = (ActionBarContainer)view.findViewById(g.action_bar_container);
        if (q == null || r == null || p == null)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used with a compatible window decor layout").toString());
        }
        break MISSING_BLOCK_LABEL_196;
_L2:
        if (!(obj instanceof Toolbar))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((Toolbar)obj).getWrapper();
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
        k = q.b();
        int i1;
        if ((q.m() & 4) != 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            w = true;
        }
        view = android.support.v7.internal.view.a.a(k);
        i1 = ((android.support.v7.internal.view.a) (view)).a.getApplicationInfo().targetSdkVersion;
        f(view.a());
        view = k.obtainStyledAttributes(null, l.ActionBar, b.actionBarStyle, 0);
        if (view.getBoolean(l.ActionBar_hideOnContentScroll, false))
        {
            if (!o.a)
            {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            d = true;
            o.setHideOnContentScrollEnabled(true);
        }
        i1 = view.getDimensionPixelSize(l.ActionBar_elevation, 0);
        if (i1 != 0)
        {
            float f1 = i1;
            bt.e(p, f1);
        }
        view.recycle();
        return;
    }

    static boolean a(e e1)
    {
        return e1.B;
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

    static View b(e e1)
    {
        return e1.s;
    }

    static ActionBarContainer c(e e1)
    {
        return e1.p;
    }

    static i d(e e1)
    {
        e1.G = null;
        return null;
    }

    static ActionBarOverlayLayout e(e e1)
    {
        return e1.o;
    }

    private void f(boolean flag)
    {
        boolean flag2 = true;
        z = flag;
        Object obj;
        boolean flag1;
        if (!z)
        {
            q.a(null);
            p.setTabContainer(t);
        } else
        {
            p.setTabContainer(null);
            q.a(t);
        }
        if (q.n() == 2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (t != null)
        {
            if (flag1)
            {
                t.setVisibility(0);
                if (o != null)
                {
                    bt.p(o);
                }
            } else
            {
                t.setVisibility(8);
            }
        }
        obj = q;
        if (!z && flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((y) (obj)).a(flag);
        obj = o;
        if (!z && flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        ((ActionBarOverlayLayout) (obj)).setHasNonEmbeddedTabs(flag);
    }

    static boolean f(e e1)
    {
        return e1.C;
    }

    private void g(boolean flag)
    {
        if (a(C, D, E))
        {
            if (!F)
            {
                F = true;
                if (G != null)
                {
                    G.b();
                }
                p.setVisibility(0);
                if (A == 0 && j && (H || flag))
                {
                    bt.a(p, 0.0F);
                    float f3 = -p.getHeight();
                    float f1 = f3;
                    if (flag)
                    {
                        int ai[] = new int[2];
                        int[] _tmp = ai;
                        ai[0] = 0;
                        ai[1] = 0;
                        p.getLocationInWindow(ai);
                        f1 = f3 - (float)ai[1];
                    }
                    bt.a(p, f1);
                    i i1 = new i();
                    dq dq1 = bt.l(p).b(0.0F);
                    dq1.a(g);
                    i1.a(dq1);
                    if (B && s != null)
                    {
                        bt.a(s, f1);
                        i1.a(bt.l(s).b(0.0F));
                    }
                    i1.a(i);
                    i1.c();
                    i1.a(f);
                    G = i1;
                    i1.a();
                } else
                {
                    bt.b(p, 1.0F);
                    bt.a(p, 0.0F);
                    if (B && s != null)
                    {
                        bt.a(s, 0.0F);
                    }
                    f.b(null);
                }
                if (o != null)
                {
                    bt.p(o);
                }
            }
        } else
        if (F)
        {
            F = false;
            if (G != null)
            {
                G.b();
            }
            if (A == 0 && j && (H || flag))
            {
                bt.b(p, 1.0F);
                p.setTransitioning(true);
                i j1 = new i();
                float f4 = -p.getHeight();
                float f2 = f4;
                if (flag)
                {
                    int ai1[] = new int[2];
                    int[] _tmp1 = ai1;
                    ai1[0] = 0;
                    ai1[1] = 0;
                    p.getLocationInWindow(ai1);
                    f2 = f4 - (float)ai1[1];
                }
                dq dq2 = bt.l(p).b(f2);
                dq2.a(g);
                j1.a(dq2);
                if (B && s != null)
                {
                    j1.a(bt.l(s).b(f2));
                }
                j1.a(h);
                j1.c();
                j1.a(e);
                G = j1;
                j1.a();
                return;
            } else
            {
                e.b(null);
                return;
            }
        }
    }

    static boolean g(e e1)
    {
        return e1.D;
    }

    static ActionBarContextView h(e e1)
    {
        return e1.r;
    }

    static y i(e e1)
    {
        return e1.q;
    }

    static Context j(e e1)
    {
        return e1.k;
    }

    public final int a()
    {
        return q.m();
    }

    public final android.support.v7.c.a a(android.support.v7.c.b b1)
    {
        if (a != null)
        {
            a.c();
        }
        o.setHideOnContentScrollEnabled(false);
        r.b();
        b1 = new android.support.v7.internal.a.i(this, r.getContext(), b1);
        if (b1.e())
        {
            b1.d();
            r.a(b1);
            e(true);
            r.sendAccessibilityEvent(32);
            a = b1;
            return b1;
        } else
        {
            return null;
        }
    }

    public final void a(int i1)
    {
        A = i1;
    }

    public final void a(Configuration configuration)
    {
        f(android.support.v7.internal.view.a.a(k).a());
    }

    public final void a(CharSequence charsequence)
    {
        q.a(charsequence);
    }

    public final void a(boolean flag)
    {
        if (!w)
        {
            byte byte0;
            int i1;
            if (flag)
            {
                byte0 = 4;
            } else
            {
                byte0 = 0;
            }
            i1 = q.m();
            w = true;
            q.c(byte0 & 4 | i1 & -5);
        }
    }

    public final Context b()
    {
        if (l == null)
        {
            TypedValue typedvalue = new TypedValue();
            k.getTheme().resolveAttribute(b.actionBarWidgetTheme, typedvalue, true);
            int i1 = typedvalue.resourceId;
            if (i1 != 0)
            {
                l = new ContextThemeWrapper(k, i1);
            } else
            {
                l = k;
            }
        }
        return l;
    }

    public final void b(boolean flag)
    {
        H = flag;
        if (!flag && G != null)
        {
            G.b();
        }
    }

    public final void c(boolean flag)
    {
        if (flag != x)
        {
            x = flag;
            int j1 = y.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                y.get(i1);
                i1++;
            }
        }
    }

    public final void d(boolean flag)
    {
        B = flag;
    }

    public final boolean d()
    {
        if (q != null && q.c())
        {
            q.d();
            return true;
        } else
        {
            return false;
        }
    }

    public final void e()
    {
        if (D)
        {
            D = false;
            g(true);
        }
    }

    public final void e(boolean flag)
    {
        dq dq1;
        Object obj;
        i i1;
        long l1;
        if (flag)
        {
            if (!E)
            {
                E = true;
                if (o != null)
                {
                    o.setShowingForActionMode(true);
                }
                g(false);
            }
        } else
        if (E)
        {
            E = false;
            if (o != null)
            {
                o.setShowingForActionMode(false);
            }
            g(false);
        }
        if (flag)
        {
            obj = q.a(8, 100L);
            dq1 = r.a(0, 200L);
        } else
        {
            dq1 = q.a(0, 200L);
            obj = r.a(8, 100L);
        }
        i1 = new i();
        i1.a.add(obj);
        obj = (View)((dq) (obj)).a.get();
        if (obj != null)
        {
            l1 = dq.b.a(((View) (obj)));
        } else
        {
            l1 = 0L;
        }
        dq1.b(l1);
        i1.a.add(dq1);
        i1.a();
    }

    public final void f()
    {
        if (!D)
        {
            D = true;
            g(true);
        }
    }

    public final void g()
    {
        if (G != null)
        {
            G.b();
            G = null;
        }
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
    }
}
