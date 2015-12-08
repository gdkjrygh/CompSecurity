// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.widget.ActionBarContainer;
import android.support.v7.internal.widget.ActionBarContextView;
import android.support.v7.internal.widget.ActionBarOverlayLayout;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.SpinnerAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class uu extends rv
    implements wy
{

    private static final Interpolator e = new AccelerateInterpolator();
    private static final Interpolator f = new DecelerateInterpolator();
    private static final boolean g;
    private boolean A;
    private boolean B;
    private boolean C;
    private vj D;
    private boolean E;
    private oo F;
    private oo G;
    private oq H;
    uy a;
    aav b;
    aaw c;
    boolean d;
    private Context h;
    private Context i;
    private Activity j;
    private ActionBarOverlayLayout k;
    private ActionBarContainer l;
    private xp m;
    private ActionBarContextView n;
    private View o;
    private xx p;
    private ArrayList q;
    private uz r;
    private int s;
    private boolean t;
    private boolean u;
    private ArrayList v;
    private boolean w;
    private int x;
    private boolean y;
    private boolean z;

    public uu(Activity activity, boolean flag)
    {
        q = new ArrayList();
        s = -1;
        v = new ArrayList();
        x = 0;
        y = true;
        C = true;
        F = new uv(this);
        G = new uw(this);
        H = new ux(this);
        j = activity;
        activity = activity.getWindow().getDecorView();
        b(activity);
        if (!flag)
        {
            o = activity.findViewById(0x1020002);
        }
    }

    public uu(Dialog dialog)
    {
        q = new ArrayList();
        s = -1;
        v = new ArrayList();
        x = 0;
        y = true;
        C = true;
        F = new uv(this);
        G = new uw(this);
        H = new ux(this);
        b(dialog.getWindow().getDecorView());
    }

    static vj a(uu uu1, vj vj1)
    {
        uu1.D = null;
        return null;
    }

    private void a(int i1, int j1)
    {
        int k1 = m.m();
        if ((j1 & 4) != 0)
        {
            t = true;
        }
        m.a(k1 & ~j1 | i1 & j1);
    }

    static boolean a(uu uu1)
    {
        return uu1.y;
    }

    static boolean a(boolean flag, boolean flag1, boolean flag2)
    {
        return b(flag, flag1, false);
    }

    static View b(uu uu1)
    {
        return uu1.o;
    }

    private void b(View view)
    {
        Object obj;
        k = (ActionBarOverlayLayout)view.findViewById(b.bd);
        if (k != null)
        {
            ActionBarOverlayLayout actionbaroverlaylayout = k;
            actionbaroverlaylayout.e = this;
            if (actionbaroverlaylayout.getWindowToken() != null)
            {
                actionbaroverlaylayout.e.g(actionbaroverlaylayout.a);
                if (actionbaroverlaylayout.d != 0)
                {
                    actionbaroverlaylayout.onWindowSystemUiVisibilityChanged(actionbaroverlaylayout.d);
                    mk.u(actionbaroverlaylayout);
                }
            }
        }
        obj = view.findViewById(b.aP);
        if (!(obj instanceof xp)) goto _L2; else goto _L1
_L1:
        obj = (xp)obj;
_L4:
        m = ((xp) (obj));
        n = (ActionBarContextView)view.findViewById(b.aU);
        l = (ActionBarContainer)view.findViewById(b.aR);
        if (m == null || n == null || l == null)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getSimpleName()).append(" can only be used with a compatible window decor layout").toString());
        }
        break MISSING_BLOCK_LABEL_237;
_L2:
        if (!(obj instanceof Toolbar))
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((Toolbar)obj).i();
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
        h = m.b();
        boolean flag;
        if ((m.m() & 4) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            t = true;
        }
        view = vb.a(h);
        if (((vb) (view)).a.getApplicationInfo().targetSdkVersion >= 14);
        j(view.a());
        view = h.obtainStyledAttributes(null, uh.a, b.i, 0);
        if (view.getBoolean(uh.k, false))
        {
            if (!k.b)
            {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            d = true;
            k.a(true);
        }
        int i1 = view.getDimensionPixelSize(uh.i, 0);
        if (i1 != 0)
        {
            a(i1);
        }
        view.recycle();
        return;
    }

    private static boolean b(boolean flag, boolean flag1, boolean flag2)
    {
        while (flag2 || !flag && !flag1) 
        {
            return true;
        }
        return false;
    }

    static ActionBarContainer c(uu uu1)
    {
        return uu1.l;
    }

    static ActionBarOverlayLayout d(uu uu1)
    {
        return uu1.k;
    }

    static boolean e(uu uu1)
    {
        return uu1.z;
    }

    static boolean f(uu uu1)
    {
        return uu1.A;
    }

    static ActionBarContextView g(uu uu1)
    {
        return uu1.n;
    }

    static xp h(uu uu1)
    {
        return uu1.m;
    }

    static Context i(uu uu1)
    {
        return uu1.h;
    }

    private void j(boolean flag)
    {
        boolean flag2 = true;
        w = flag;
        Object obj;
        boolean flag1;
        if (!w)
        {
            m.a(null);
            l.a(p);
        } else
        {
            l.a(null);
            m.a(p);
        }
        if (m() == 2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (p != null)
        {
            if (flag1)
            {
                p.setVisibility(0);
                if (k != null)
                {
                    mk.u(k);
                }
            } else
            {
                p.setVisibility(8);
            }
        }
        obj = m;
        if (!w && flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((xp) (obj)).a(flag);
        obj = k;
        if (!w && flag1)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        obj.c = flag;
    }

    private void k(boolean flag)
    {
        if (b(z, A, B))
        {
            if (!C)
            {
                C = true;
                if (D != null)
                {
                    D.b();
                }
                l.setVisibility(0);
                if (x == 0 && g && (E || flag))
                {
                    mk.b(l, 0.0F);
                    float f3 = -l.getHeight();
                    float f1 = f3;
                    if (flag)
                    {
                        int ai[] = new int[2];
                        int[] _tmp = ai;
                        ai[0] = 0;
                        ai[1] = 0;
                        l.getLocationInWindow(ai);
                        f1 = f3 - (float)ai[1];
                    }
                    mk.b(l, f1);
                    vj vj1 = new vj();
                    ob ob1 = mk.r(l).c(0.0F);
                    ob1.a(H);
                    vj1.a(ob1);
                    if (y && o != null)
                    {
                        mk.b(o, f1);
                        vj1.a(mk.r(o).c(0.0F));
                    }
                    vj1.a(f);
                    vj1.a(250L);
                    vj1.a(G);
                    D = vj1;
                    vj1.a();
                } else
                {
                    mk.c(l, 1.0F);
                    mk.b(l, 0.0F);
                    if (y && o != null)
                    {
                        mk.b(o, 0.0F);
                    }
                    G.b(null);
                }
                if (k != null)
                {
                    mk.u(k);
                }
            }
        } else
        if (C)
        {
            C = false;
            if (D != null)
            {
                D.b();
            }
            if (x == 0 && g && (E || flag))
            {
                mk.c(l, 1.0F);
                l.a(true);
                vj vj2 = new vj();
                float f4 = -l.getHeight();
                float f2 = f4;
                if (flag)
                {
                    int ai1[] = new int[2];
                    int[] _tmp1 = ai1;
                    ai1[0] = 0;
                    ai1[1] = 0;
                    l.getLocationInWindow(ai1);
                    f2 = f4 - (float)ai1[1];
                }
                ob ob2 = mk.r(l).c(f2);
                ob2.a(H);
                vj2.a(ob2);
                if (y && o != null)
                {
                    vj2.a(mk.r(o).c(f2));
                }
                vj2.a(e);
                vj2.a(250L);
                vj2.a(F);
                D = vj2;
                vj2.a();
                return;
            } else
            {
                F.b(null);
                return;
            }
        }
    }

    private int m()
    {
        return m.n();
    }

    public final aav a(aaw aaw)
    {
        if (a != null)
        {
            a.c();
        }
        k.a(false);
        n.b();
        aaw = new uy(this, n.getContext(), aaw);
        if (aaw.e())
        {
            aaw.d();
            n.a(aaw);
            i(true);
            n.sendAccessibilityEvent(32);
            a = aaw;
            return aaw;
        } else
        {
            return null;
        }
    }

    public final View a()
    {
        return m.p();
    }

    public final void a(float f1)
    {
        mk.d(l, f1);
    }

    public final void a(int i1)
    {
        a(LayoutInflater.from(g()).inflate(i1, m.a(), false));
    }

    public final void a(Configuration configuration)
    {
        j(vb.a(h).a());
    }

    public final void a(Drawable drawable)
    {
        m.a(null);
    }

    public final void a(View view)
    {
        m.a(view);
    }

    public final void a(View view, rw rw)
    {
        view.setLayoutParams(rw);
        m.a(view);
    }

    public final void a(SpinnerAdapter spinneradapter, rx rx)
    {
        m.a(spinneradapter, new um(rx));
    }

    public final void a(CharSequence charsequence)
    {
        m.b(charsequence);
    }

    public final void a(ry ry1)
    {
        int i1 = -1;
        if (m() != 2)
        {
            if (ry1 != null)
            {
                i1 = ry1.a();
            } else
            {
                i1 = -1;
            }
            s = i1;
        } else
        {
            bp bp1;
            if ((j instanceof ar) && !m.a().isInEditMode())
            {
                bp1 = ((ar)j).c().a().a();
            } else
            {
                bp1 = null;
            }
            if (r == ry1)
            {
                if (r != null)
                {
                    p.b(ry1.a());
                }
            } else
            {
                xx xx1 = p;
                if (ry1 != null)
                {
                    i1 = ry1.a();
                }
                xx1.a(i1);
                r = (uz)ry1;
            }
            if (bp1 != null && !bp1.e())
            {
                bp1.b();
                return;
            }
        }
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

    public final CharSequence b()
    {
        return m.e();
    }

    public final void b(int i1)
    {
        switch (m.n())
        {
        default:
            throw new IllegalStateException("setSelectedNavigationIndex not valid for current navigation mode");

        case 2: // '\002'
            a((ry)q.get(i1));
            return;

        case 1: // '\001'
            m.c(i1);
            return;
        }
    }

    public final void b(Drawable drawable)
    {
        ActionBarContainer actionbarcontainer;
        boolean flag;
        flag = true;
        actionbarcontainer = l;
        if (actionbarcontainer.c != null)
        {
            actionbarcontainer.c.setCallback(null);
            actionbarcontainer.unscheduleDrawable(actionbarcontainer.c);
        }
        actionbarcontainer.c = drawable;
        if (drawable != null)
        {
            drawable.setCallback(actionbarcontainer);
            if (actionbarcontainer.b != null)
            {
                actionbarcontainer.c.setBounds(actionbarcontainer.b.getLeft(), actionbarcontainer.b.getTop(), actionbarcontainer.b.getRight(), actionbarcontainer.b.getBottom());
            }
        }
        if (!actionbarcontainer.f) goto _L2; else goto _L1
_L1:
        if (actionbarcontainer.e != null)
        {
            flag = false;
        }
_L4:
        actionbarcontainer.setWillNotDraw(flag);
        actionbarcontainer.invalidate();
        return;
_L2:
        if (actionbarcontainer.c != null || actionbarcontainer.d != null)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b(CharSequence charsequence)
    {
        m.a(charsequence);
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

    public final int c()
    {
        return m.m();
    }

    public final void c(int i1)
    {
        a(h.getString(i1));
    }

    public final void c(Drawable drawable)
    {
        m.b(drawable);
    }

    public final void c(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        a(byte0, 8);
    }

    public final void d()
    {
        if (z)
        {
            z = false;
            k(false);
        }
    }

    public final void d(int i1)
    {
        int k1;
        boolean flag1;
        flag1 = true;
        k1 = m.n();
        k1;
        JVM INSTR tableswitch 2 2: default 36
    //                   2 148;
           goto _L1 _L2
_L1:
        if (k1 != i1 && !w && k != null)
        {
            mk.u(k);
        }
        m.b(i1);
        i1;
        JVM INSTR tableswitch 2 2: default 92
    //                   2 239;
           goto _L3 _L4
_L3:
        Object obj = m;
        int j1;
        boolean flag;
        if (i1 == 2 && !w)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((xp) (obj)).a(flag);
        obj = k;
        if (i1 == 2 && !w)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        obj.c = flag;
        return;
_L2:
        m.n();
        JVM INSTR tableswitch 1 2: default 180
    //                   1 226
    //                   2 204;
           goto _L5 _L6 _L7
_L5:
        j1 = -1;
_L8:
        s = j1;
        a(((ry) (null)));
        p.setVisibility(8);
          goto _L1
_L7:
        if (r != null)
        {
            obj = r;
            j1 = 0;
        } else
        {
            j1 = -1;
        }
          goto _L8
_L6:
        j1 = m.o();
          goto _L8
_L4:
        if (p == null)
        {
            obj = new xx(h);
            if (w)
            {
                ((xx) (obj)).setVisibility(0);
                m.a(((xx) (obj)));
            } else
            {
                if (m() == 2)
                {
                    ((xx) (obj)).setVisibility(0);
                    if (k != null)
                    {
                        mk.u(k);
                    }
                } else
                {
                    ((xx) (obj)).setVisibility(8);
                }
                l.a(((xx) (obj)));
            }
            p = ((xx) (obj));
        }
        p.setVisibility(0);
        if (s != -1)
        {
            b(s);
            s = -1;
        }
          goto _L3
    }

    public final void d(boolean flag)
    {
        byte byte0;
        if (flag)
        {
            byte0 = 16;
        } else
        {
            byte0 = 0;
        }
        a(byte0, 16);
    }

    public final void e()
    {
        if (!z)
        {
            z = true;
            k(false);
        }
    }

    public final void e(int i1)
    {
        m.d(i1);
    }

    public final void e(boolean flag)
    {
        if (!t)
        {
            b(flag);
        }
    }

    public final void f(int i1)
    {
        m.e(i1);
    }

    public final void f(boolean flag)
    {
        E = flag;
        if (!flag && D != null)
        {
            D.b();
        }
    }

    public final boolean f()
    {
        int i1 = l.getHeight();
        return C && (i1 == 0 || k.b() < i1);
    }

    public final Context g()
    {
        if (i == null)
        {
            TypedValue typedvalue = new TypedValue();
            h.getTheme().resolveAttribute(b.n, typedvalue, true);
            int i1 = typedvalue.resourceId;
            if (i1 != 0)
            {
                i = new ContextThemeWrapper(h, i1);
            } else
            {
                i = h;
            }
        }
        return i;
    }

    public final void g(int i1)
    {
        x = i1;
    }

    public final void g(boolean flag)
    {
        if (flag != u)
        {
            u = flag;
            int j1 = v.size();
            int i1 = 0;
            while (i1 < j1) 
            {
                v.get(i1);
                i1++;
            }
        }
    }

    public final void h(boolean flag)
    {
        y = flag;
    }

    public final void i(boolean flag)
    {
        ob ob1;
        Object obj;
        vj vj1;
        long l1;
        if (flag)
        {
            if (!B)
            {
                B = true;
                if (k != null)
                {
                    ActionBarOverlayLayout.a();
                }
                k(false);
            }
        } else
        if (B)
        {
            B = false;
            if (k != null)
            {
                ActionBarOverlayLayout.a();
            }
            k(false);
        }
        if (flag)
        {
            obj = m.a(8, 100L);
            ob1 = n.a(0, 200L);
        } else
        {
            ob1 = m.a(0, 200L);
            obj = n.a(8, 100L);
        }
        vj1 = new vj();
        vj1.a.add(obj);
        obj = (View)((ob) (obj)).a.get();
        if (obj != null)
        {
            l1 = ob.b.a(((View) (obj)));
        } else
        {
            l1 = 0L;
        }
        obj = (View)ob1.a.get();
        if (obj != null)
        {
            ob.b.b(((View) (obj)), l1);
        }
        vj1.a.add(ob1);
        vj1.a();
    }

    public final boolean i()
    {
        if (m != null && m.c())
        {
            m.d();
            return true;
        } else
        {
            return false;
        }
    }

    public final void j()
    {
        if (A)
        {
            A = false;
            k(true);
        }
    }

    public final void k()
    {
        if (!A)
        {
            A = true;
            k(true);
        }
    }

    public final void l()
    {
        if (D != null)
        {
            D.b();
            D = null;
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
        g = flag;
    }
}
