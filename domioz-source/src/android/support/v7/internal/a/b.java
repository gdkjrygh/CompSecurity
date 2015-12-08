// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.a;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.view.bp;
import android.support.v4.view.cy;
import android.support.v4.view.do;
import android.support.v4.view.dq;
import android.support.v7.a.g;
import android.support.v7.app.ActionBar;
import android.support.v7.internal.view.a;
import android.support.v7.internal.view.i;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.internal.widget.ab;
import android.support.v7.internal.widget.ah;
import android.support.v7.internal.widget.l;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.internal.a:
//            c, d, e, f

public class b extends ActionBar
    implements l
{

    static final boolean h;
    private static final boolean i;
    private boolean A;
    private int B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private i H;
    private boolean I;
    f a;
    android.support.v7.c.a b;
    android.support.v7.c.b c;
    boolean d;
    final do e;
    final do f;
    final dq g;
    private Context j;
    private Context k;
    private Activity l;
    private Dialog m;
    private ActionBarOverlayLayout n;
    private ActionBarContainer o;
    private ab p;
    private ActionBarContextView q;
    private ActionBarContainer r;
    private View s;
    private ah t;
    private ArrayList u;
    private int v;
    private boolean w;
    private boolean x;
    private ArrayList y;
    private int z;

    public b(Activity activity, boolean flag)
    {
        u = new ArrayList();
        v = -1;
        y = new ArrayList();
        B = 0;
        C = true;
        G = true;
        e = new c(this);
        f = new d(this);
        g = new e(this);
        l = activity;
        activity = activity.getWindow().getDecorView();
        a(activity);
        if (!flag)
        {
            s = activity.findViewById(0x1020002);
        }
    }

    public b(Dialog dialog)
    {
        u = new ArrayList();
        v = -1;
        y = new ArrayList();
        B = 0;
        C = true;
        G = true;
        e = new c(this);
        f = new d(this);
        g = new e(this);
        m = dialog;
        a(dialog.getWindow().getDecorView());
    }

    private void a(View view)
    {
        Object obj;
        n = (ActionBarOverlayLayout)view.findViewById(g.o);
        if (n != null)
        {
            n.a(this);
        }
        obj = view.findViewById(g.a);
        if (!(obj instanceof ab)) goto _L2; else goto _L1
_L1:
        obj = (ab)obj;
_L4:
        p = ((ab) (obj));
        q = (ActionBarContextView)view.findViewById(g.f);
        o = (ActionBarContainer)view.findViewById(g.c);
        r = (ActionBarContainer)view.findViewById(g.t);
        if (p == null || q == null || o == null)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used with a compatible window decor layout").toString());
        }
        break MISSING_BLOCK_LABEL_210;
_L2:
        if (!(obj instanceof Toolbar))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((Toolbar)obj).n();
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
        j = p.b();
        z = 0;
        boolean flag;
        if ((p.n() & 4) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            w = true;
        }
        view = android.support.v7.internal.view.a.a(j);
        view.f();
        f(view.d());
        view = j.obtainStyledAttributes(null, android.support.v7.a.l.a, android.support.v7.a.b.c, 0);
        if (view.getBoolean(android.support.v7.a.l.m, false))
        {
            if (!n.a())
            {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            d = true;
            n.b(true);
        }
        int i1 = view.getDimensionPixelSize(android.support.v7.a.l.k, 0);
        if (i1 != 0)
        {
            float f1 = i1;
            bp.f(o, f1);
            if (r != null)
            {
                bp.f(r, f1);
            }
        }
        view.recycle();
        return;
    }

    static boolean a(b b1)
    {
        return b1.C;
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

    static View b(b b1)
    {
        return b1.s;
    }

    static ActionBarContainer c(b b1)
    {
        return b1.o;
    }

    static ActionBarContainer d(b b1)
    {
        return b1.r;
    }

    static int e(b b1)
    {
        return b1.z;
    }

    static i f(b b1)
    {
        b1.H = null;
        return null;
    }

    private void f(boolean flag)
    {
        boolean flag2 = true;
        A = flag;
        Object obj;
        boolean flag1;
        if (!A)
        {
            p.a(null);
            o.a(t);
        } else
        {
            o.a(null);
            p.a(t);
        }
        if (p.o() == 2)
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
                if (n != null)
                {
                    bp.r(n);
                }
            } else
            {
                t.setVisibility(8);
            }
        }
        obj = p;
        if (!A && flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((ab) (obj)).a(flag);
        obj = n;
        if (!A && flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        ((ActionBarOverlayLayout) (obj)).a(flag);
    }

    static ActionBarOverlayLayout g(b b1)
    {
        return b1.n;
    }

    private void g(boolean flag)
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
                o.setVisibility(0);
                if (B == 0 && i && (I || flag))
                {
                    bp.b(o, 0.0F);
                    float f3 = -o.getHeight();
                    float f1 = f3;
                    if (flag)
                    {
                        int ai[] = new int[2];
                        int[] _tmp = ai;
                        ai[0] = 0;
                        ai[1] = 0;
                        o.getLocationInWindow(ai);
                        f1 = f3 - (float)ai[1];
                    }
                    bp.b(o, f1);
                    i i1 = new i();
                    cy cy1 = bp.o(o).c(0.0F);
                    cy1.a(g);
                    i1.a(cy1);
                    if (C && s != null)
                    {
                        bp.b(s, f1);
                        i1.a(bp.o(s).c(0.0F));
                    }
                    if (r != null && z == 1)
                    {
                        bp.b(r, r.getHeight());
                        r.setVisibility(0);
                        i1.a(bp.o(r).c(0.0F));
                    }
                    i1.a(AnimationUtils.loadInterpolator(j, 0x10a0006));
                    i1.c();
                    i1.a(f);
                    H = i1;
                    i1.a();
                } else
                {
                    bp.c(o, 1.0F);
                    bp.b(o, 0.0F);
                    if (C && s != null)
                    {
                        bp.b(s, 0.0F);
                    }
                    if (r != null && z == 1)
                    {
                        bp.c(r, 1.0F);
                        bp.b(r, 0.0F);
                        r.setVisibility(0);
                    }
                    f.b(null);
                }
                if (n != null)
                {
                    bp.r(n);
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
            if (B == 0 && i && (I || flag))
            {
                bp.c(o, 1.0F);
                o.a(true);
                i j1 = new i();
                float f4 = -o.getHeight();
                float f2 = f4;
                if (flag)
                {
                    int ai1[] = new int[2];
                    int[] _tmp1 = ai1;
                    ai1[0] = 0;
                    ai1[1] = 0;
                    o.getLocationInWindow(ai1);
                    f2 = f4 - (float)ai1[1];
                }
                cy cy2 = bp.o(o).c(f2);
                cy2.a(g);
                j1.a(cy2);
                if (C && s != null)
                {
                    j1.a(bp.o(s).c(f2));
                }
                if (r != null && r.getVisibility() == 0)
                {
                    bp.c(r, 1.0F);
                    j1.a(bp.o(r).c(r.getHeight()));
                }
                j1.a(AnimationUtils.loadInterpolator(j, 0x10a0005));
                j1.c();
                j1.a(e);
                H = j1;
                j1.a();
                return;
            } else
            {
                e.b(null);
                return;
            }
        }
    }

    static boolean h(b b1)
    {
        return b1.D;
    }

    static boolean i(b b1)
    {
        return b1.E;
    }

    static ActionBarContextView j(b b1)
    {
        return b1.q;
    }

    static ab k(b b1)
    {
        return b1.p;
    }

    static Context l(b b1)
    {
        return b1.j;
    }

    public final int a()
    {
        return p.n();
    }

    public final android.support.v7.c.a a(android.support.v7.c.b b1)
    {
        if (a != null)
        {
            a.c();
        }
        n.b(false);
        q.e();
        b1 = new f(this, q.getContext(), b1);
        if (b1.e())
        {
            b1.d();
            q.a(b1);
            e(true);
            if (r != null && z == 1 && r.getVisibility() != 0)
            {
                r.setVisibility(0);
                if (n != null)
                {
                    bp.r(n);
                }
            }
            q.sendAccessibilityEvent(32);
            a = b1;
            return b1;
        } else
        {
            return null;
        }
    }

    public final void a(int i1)
    {
        B = i1;
    }

    public final void a(CharSequence charsequence)
    {
        p.a(charsequence);
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
            i1 = p.n();
            w = true;
            p.a(byte0 & 4 | i1 & -5);
        }
    }

    public final Context b()
    {
        if (k == null)
        {
            TypedValue typedvalue = new TypedValue();
            j.getTheme().resolveAttribute(android.support.v7.a.b.g, typedvalue, true);
            int i1 = typedvalue.resourceId;
            if (i1 != 0)
            {
                k = new ContextThemeWrapper(j, i1);
            } else
            {
                k = j;
            }
        }
        return k;
    }

    public final void b(boolean flag)
    {
        I = flag;
        if (!flag && H != null)
        {
            H.b();
        }
    }

    public final void c()
    {
        f(android.support.v7.internal.view.a.a(j).d());
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
        C = flag;
    }

    public final boolean d()
    {
        if (p != null && p.c())
        {
            p.d();
            return true;
        } else
        {
            return false;
        }
    }

    public final void e()
    {
        if (E)
        {
            E = false;
            g(true);
        }
    }

    public final void e(boolean flag)
    {
        boolean flag1 = false;
        Object obj;
        int i1;
        if (flag)
        {
            if (!F)
            {
                F = true;
                if (n != null)
                {
                    ActionBarOverlayLayout.b();
                }
                g(false);
            }
        } else
        if (F)
        {
            F = false;
            if (n != null)
            {
                ActionBarOverlayLayout.b();
            }
            g(false);
        }
        obj = p;
        if (flag)
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        ((ab) (obj)).b(i1);
        obj = q;
        if (flag)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        ((ActionBarContextView) (obj)).b(i1);
    }

    public final void f()
    {
        if (!E)
        {
            E = true;
            g(true);
        }
    }

    public final void g()
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
        if (!android/support/v7/internal/a/b.desiredAssertionStatus())
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
        i = flag;
    }
}
