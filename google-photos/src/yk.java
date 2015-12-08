// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public final class yk
    implements xp
{

    Toolbar a;
    CharSequence b;
    android.view.Window.Callback c;
    boolean d;
    private int e;
    private View f;
    private Spinner g;
    private View h;
    private Drawable i;
    private Drawable j;
    private Drawable k;
    private boolean l;
    private CharSequence m;
    private CharSequence n;
    private aay o;
    private int p;
    private final yh q;
    private int r;
    private Drawable s;

    public yk(Toolbar toolbar, boolean flag)
    {
        this(toolbar, flag, b.bH, b.ao);
    }

    private yk(Toolbar toolbar, boolean flag, int i1, int j1)
    {
        p = 0;
        r = 0;
        a = toolbar;
        b = toolbar.k;
        m = toolbar.l;
        yl yl1;
        boolean flag1;
        if (b != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        l = flag1;
        k = toolbar.e();
        if (flag)
        {
            toolbar = yj.a(toolbar.getContext(), null, uh.a, b.i, 0);
            Object obj = toolbar.c(uh.r);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                b(((CharSequence) (obj)));
            }
            obj = toolbar.c(uh.p);
            if (!TextUtils.isEmpty(((CharSequence) (obj))))
            {
                m = ((CharSequence) (obj));
                if ((e & 8) != 0)
                {
                    a.b(((CharSequence) (obj)));
                }
            }
            obj = toolbar.a(uh.n);
            if (obj != null)
            {
                a(((Drawable) (obj)));
            }
            obj = toolbar.a(uh.m);
            if (k == null && obj != null)
            {
                i = ((Drawable) (obj));
                s();
            }
            obj = toolbar.a(uh.l);
            if (obj != null)
            {
                b(((Drawable) (obj)));
            }
            a(toolbar.a(uh.h, 0));
            int k1 = toolbar.f(uh.g, 0);
            if (k1 != 0)
            {
                a(LayoutInflater.from(a.getContext()).inflate(k1, a, false));
                a(e | 0x10);
            }
            k1 = toolbar.e(uh.j, 0);
            if (k1 > 0)
            {
                android.view.ViewGroup.LayoutParams layoutparams = a.getLayoutParams();
                layoutparams.height = k1;
                a.setLayoutParams(layoutparams);
            }
            int i2 = toolbar.c(uh.f, -1);
            k1 = toolbar.c(uh.e, -1);
            if (i2 >= 0 || k1 >= 0)
            {
                Toolbar toolbar1 = a;
                i2 = Math.max(i2, 0);
                k1 = Math.max(k1, 0);
                toolbar1.j.a(i2, k1);
            }
            k1 = toolbar.f(uh.s, 0);
            if (k1 != 0)
            {
                Toolbar toolbar2 = a;
                Context context = a.getContext();
                toolbar2.h = k1;
                if (toolbar2.b != null)
                {
                    toolbar2.b.setTextAppearance(context, k1);
                }
            }
            k1 = toolbar.f(uh.q, 0);
            if (k1 != 0)
            {
                Toolbar toolbar3 = a;
                Context context1 = a.getContext();
                toolbar3.i = k1;
                if (toolbar3.c != null)
                {
                    toolbar3.c.setTextAppearance(context1, k1);
                }
            }
            k1 = toolbar.f(uh.o, 0);
            if (k1 != 0)
            {
                a.a(k1);
            }
            ((yj) (toolbar)).a.recycle();
            q = toolbar.a();
        } else
        {
            int l1 = 11;
            if (a.e() != null)
            {
                l1 = 15;
            }
            e = l1;
            q = yh.a(toolbar.getContext());
        }
        if (i1 != r)
        {
            r = i1;
            if (TextUtils.isEmpty(a.d()))
            {
                e(r);
            }
        }
        n = a.d();
        toolbar = q.a(j1, false);
        if (s != toolbar)
        {
            s = toolbar;
            v();
        }
        toolbar = a;
        yl1 = new yl(this);
        toolbar.g();
        toolbar.d.setOnClickListener(yl1);
    }

    private void c(CharSequence charsequence)
    {
        b = charsequence;
        if ((e & 8) != 0)
        {
            a.a(charsequence);
        }
    }

    private void s()
    {
        Drawable drawable = null;
        if ((e & 2) != 0)
        {
            if ((e & 1) != 0)
            {
                if (j != null)
                {
                    drawable = j;
                } else
                {
                    drawable = i;
                }
            } else
            {
                drawable = i;
            }
        }
        a.a(drawable);
    }

    private void t()
    {
        if (g == null)
        {
            g = new abx(a.getContext(), null, b.o);
            aga aga1 = new aga(-2, -2, 0x800013);
            g.setLayoutParams(aga1);
        }
    }

    private void u()
    {
label0:
        {
            if ((e & 4) != 0)
            {
                if (!TextUtils.isEmpty(n))
                {
                    break label0;
                }
                a.b(r);
            }
            return;
        }
        a.c(n);
    }

    private void v()
    {
        if ((e & 4) != 0)
        {
            Toolbar toolbar = a;
            Drawable drawable;
            if (k != null)
            {
                drawable = k;
            } else
            {
                drawable = s;
            }
            toolbar.b(drawable);
        }
    }

    public final ViewGroup a()
    {
        return a;
    }

    public final ob a(int i1, long l1)
    {
        if (i1 == 8)
        {
            ob ob1 = mk.r(a).a(0.0F);
            ob1.a(l1);
            ob1.a(new ym(this));
            return ob1;
        }
        if (i1 == 0)
        {
            ob ob2 = mk.r(a).a(1.0F);
            ob2.a(l1);
            ob2.a(new yn(this));
            return ob2;
        } else
        {
            return null;
        }
    }

    public final void a(int i1)
    {
label0:
        {
            int j1 = e ^ i1;
            e = i1;
            if (j1 != 0)
            {
                if ((j1 & 4) != 0)
                {
                    if ((i1 & 4) != 0)
                    {
                        v();
                        u();
                    } else
                    {
                        a.b(null);
                    }
                }
                if ((j1 & 3) != 0)
                {
                    s();
                }
                if ((j1 & 8) != 0)
                {
                    if ((i1 & 8) != 0)
                    {
                        a.a(b);
                        a.b(m);
                    } else
                    {
                        a.a(null);
                        a.b(null);
                    }
                }
                if ((j1 & 0x10) != 0 && h != null)
                {
                    if ((i1 & 0x10) == 0)
                    {
                        break label0;
                    }
                    a.addView(h);
                }
            }
            return;
        }
        a.removeView(h);
    }

    public final void a(Drawable drawable)
    {
        j = drawable;
        s();
    }

    public final void a(Menu menu, wk wk)
    {
        if (o == null)
        {
            o = new aay(a.getContext());
        }
        o.d = wk;
        wk = a;
        menu = (vu)menu;
        aay aay1 = o;
        if (menu != null || ((Toolbar) (wk)).a != null)
        {
            wk.f();
            vu vu1 = ((Toolbar) (wk)).a.a;
            if (vu1 != menu)
            {
                if (vu1 != null)
                {
                    vu1.b(((Toolbar) (wk)).o);
                    vu1.b(((Toolbar) (wk)).p);
                }
                if (((Toolbar) (wk)).p == null)
                {
                    wk.p = new afz(wk);
                }
                aay1.h = true;
                if (menu != null)
                {
                    menu.a(aay1, ((Toolbar) (wk)).f);
                    menu.a(((Toolbar) (wk)).p, ((Toolbar) (wk)).f);
                } else
                {
                    aay1.a(((Toolbar) (wk)).f, null);
                    ((Toolbar) (wk)).p.a(((Toolbar) (wk)).f, null);
                    aay1.b(true);
                    ((Toolbar) (wk)).p.b(true);
                }
                ((Toolbar) (wk)).a.a(((Toolbar) (wk)).g);
                ((Toolbar) (wk)).a.a(aay1);
                wk.o = aay1;
            }
        }
    }

    public final void a(View view)
    {
        if (h != null && (e & 0x10) != 0)
        {
            a.removeView(h);
        }
        h = view;
        if (view != null && (e & 0x10) != 0)
        {
            a.addView(h);
        }
    }

    public final void a(android.view.Window.Callback callback)
    {
        c = callback;
    }

    public final void a(SpinnerAdapter spinneradapter, android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener)
    {
        t();
        g.setAdapter(spinneradapter);
        g.setOnItemSelectedListener(onitemselectedlistener);
    }

    public final void a(CharSequence charsequence)
    {
        if (!l)
        {
            c(charsequence);
        }
    }

    public final void a(wk wk, vv vv)
    {
        Toolbar toolbar = a;
        toolbar.q = wk;
        toolbar.r = vv;
    }

    public final void a(xx xx1)
    {
        if (f != null && f.getParent() == a)
        {
            a.removeView(f);
        }
        f = xx1;
        if (xx1 != null && p == 2)
        {
            a.addView(f, 0);
            aga aga1 = (aga)f.getLayoutParams();
            aga1.width = -2;
            aga1.height = -2;
            aga1.a = 0x800053;
            xx1.b = true;
        }
    }

    public final void a(boolean flag)
    {
        Toolbar toolbar = a;
        toolbar.s = flag;
        toolbar.requestLayout();
    }

    public final Context b()
    {
        return a.getContext();
    }

    public final void b(int i1)
    {
        int j1 = p;
        if (i1 == j1) goto _L2; else goto _L1
_L1:
        j1;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 89
    //                   2 124;
           goto _L3 _L4 _L5
_L3:
        p = i1;
        i1;
        JVM INSTR tableswitch 0 2: default 64
    //                   0 175
    //                   1 159
    //                   2 176;
           goto _L6 _L2 _L7 _L8
_L6:
        throw new IllegalArgumentException((new StringBuilder("Invalid navigation mode ")).append(i1).toString());
_L4:
        if (g != null && g.getParent() == a)
        {
            a.removeView(g);
        }
          goto _L3
_L5:
        if (f != null && f.getParent() == a)
        {
            a.removeView(f);
        }
          goto _L3
_L7:
        t();
        a.addView(g, 0);
_L2:
        return;
_L8:
        if (f != null)
        {
            a.addView(f, 0);
            aga aga1 = (aga)f.getLayoutParams();
            aga1.width = -2;
            aga1.height = -2;
            aga1.a = 0x800053;
            return;
        }
        if (true) goto _L2; else goto _L9
_L9:
    }

    public final void b(Drawable drawable)
    {
        k = drawable;
        v();
    }

    public final void b(CharSequence charsequence)
    {
        l = true;
        c(charsequence);
    }

    public final void c(int i1)
    {
        if (g == null)
        {
            throw new IllegalStateException("Can't set dropdown selected position without an adapter");
        } else
        {
            g.setSelection(i1);
            return;
        }
    }

    public final void c(Drawable drawable)
    {
        a.setBackgroundDrawable(drawable);
    }

    public final boolean c()
    {
        Toolbar toolbar = a;
        return toolbar.p != null && toolbar.p.a != null;
    }

    public final void d()
    {
        a.c();
    }

    public final void d(int i1)
    {
        Drawable drawable;
        if (i1 != 0)
        {
            drawable = q.a(i1, false);
        } else
        {
            drawable = null;
        }
        b(drawable);
    }

    public final CharSequence e()
    {
        return a.k;
    }

    public final void e(int i1)
    {
        Object obj;
        if (i1 == 0)
        {
            obj = null;
        } else
        {
            obj = a.getContext().getString(i1);
        }
        n = ((CharSequence) (obj));
        u();
    }

    public final void f(int i1)
    {
        a.setVisibility(i1);
    }

    public final boolean f()
    {
        Toolbar toolbar = a;
        return toolbar.getVisibility() == 0 && toolbar.a != null && toolbar.a.b;
    }

    public final boolean g()
    {
        return a.a();
    }

    public final boolean h()
    {
        Object obj = a;
        if (((Toolbar) (obj)).a == null) goto _L2; else goto _L1
_L1:
        obj = ((Toolbar) (obj)).a;
        if (((ActionMenuView) (obj)).c == null) goto _L4; else goto _L3
_L3:
        boolean flag;
        obj = ((ActionMenuView) (obj)).c;
        if (((aay) (obj)).k != null || ((aay) (obj)).f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L5
_L5:
        flag = true;
_L6:
        if (flag)
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L4:
        flag = false;
        if (true) goto _L6; else goto _L2
_L2:
        return false;
    }

    public final boolean i()
    {
        return a.b();
    }

    public final boolean j()
    {
        Object obj = a;
        if (((Toolbar) (obj)).a != null)
        {
            obj = ((Toolbar) (obj)).a;
            boolean flag;
            if (((ActionMenuView) (obj)).c != null && ((ActionMenuView) (obj)).c.c())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    public final void k()
    {
        d = true;
    }

    public final void l()
    {
        Toolbar toolbar = a;
        if (toolbar.a != null)
        {
            toolbar.a.c();
        }
    }

    public final int m()
    {
        return e;
    }

    public final int n()
    {
        return p;
    }

    public final int o()
    {
        if (g != null)
        {
            return g.getSelectedItemPosition();
        } else
        {
            return 0;
        }
    }

    public final View p()
    {
        return h;
    }

    public final int q()
    {
        return a.getVisibility();
    }

    public final Menu r()
    {
        Toolbar toolbar = a;
        toolbar.f();
        if (toolbar.a.a == null)
        {
            vu vu1 = (vu)toolbar.a.b();
            if (toolbar.p == null)
            {
                toolbar.p = new afz(toolbar);
            }
            toolbar.a.c.h = true;
            vu1.a(toolbar.p, toolbar.f);
        }
        return toolbar.a.b();
    }
}
