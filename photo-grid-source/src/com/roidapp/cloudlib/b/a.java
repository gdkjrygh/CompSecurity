// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.b;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.roidapp.cloudlib.al;
import com.roidapp.cloudlib.ar;
import com.roidapp.cloudlib.as;
import com.roidapp.cloudlib.sns.ab;
import com.roidapp.cloudlib.sns.main.b;
import java.lang.reflect.Field;

// Referenced classes of package com.roidapp.cloudlib.b:
//            c, d, j, g, 
//            f, b, e

public final class a extends b
    implements android.support.v4.view.ViewPager.OnPageChangeListener, android.view.View.OnClickListener
{

    private ViewPager a;
    private View b;
    private TextView c;
    private TextView d;
    private View e;
    private TextView f;
    private String g;
    private e h;
    private j i;
    private g j;
    private Thread k;
    private Thread l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private Handler q;
    private boolean r;

    public a()
    {
        o = true;
        q = new c(this);
    }

    static int a(a a1)
    {
        return a1.m;
    }

    static g a(a a1, g g1)
    {
        a1.j = g1;
        return g1;
    }

    static j a(a a1, j j1)
    {
        a1.i = j1;
        return j1;
    }

    static void a(a a1, String s)
    {
        a1.g = s;
    }

    private void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        s = new Thread(new d(this, s));
        if (m != 0)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        i.d();
        k = s;
_L1:
        s.start();
        this;
        JVM INSTR monitorexit ;
        return;
        j.d();
        l = s;
          goto _L1
        s;
        throw s;
    }

    static void a(Thread thread)
    {
        b(thread);
    }

    static j b(a a1)
    {
        return a1.i;
    }

    static void b(a a1, String s)
    {
        a1.a(s);
    }

    private static void b(Thread thread)
    {
        if (thread != null)
        {
            thread.interrupt();
        }
    }

    static String c(a a1)
    {
        return a1.g;
    }

    static g d(a a1)
    {
        return a1.j;
    }

    static ab e(a a1)
    {
        return a1.t;
    }

    static ab f(a a1)
    {
        return a1.t;
    }

    private void f()
    {
        if (m == 0)
        {
            i.c();
            return;
        } else
        {
            j.c();
            return;
        }
    }

    static ab g(a a1)
    {
        return a1.t;
    }

    private boolean g()
    {
        if (t != null)
        {
            if (g == null)
            {
                g = "";
            }
            t.a(g);
            return true;
        } else
        {
            return false;
        }
    }

    static boolean h(a a1)
    {
        return a1.r;
    }

    static Thread i(a a1)
    {
        return a1.k;
    }

    static Thread j(a a1)
    {
        return a1.l;
    }

    static void k(a a1)
    {
        a1.f();
    }

    static boolean l(a a1)
    {
        a1.r = true;
        return true;
    }

    static Handler m(a a1)
    {
        return a1.q;
    }

    public final View a(Context context)
    {
        context = new ab(context);
        context.a(u, false);
        context.e();
        if (!TextUtils.isEmpty(g))
        {
            context.a(g);
        }
        p = false;
        context.a(new f(this));
        context.a(new com.roidapp.cloudlib.b.b(this));
        context.a();
        return context;
    }

    public final void a(int i1)
    {
        if (i1 == 0)
        {
            i.b(g);
            return;
        } else
        {
            j.b(g);
            return;
        }
    }

    protected final void a(boolean flag)
    {
        super.a(flag);
        com.roidapp.baselib.c.b.b("SearchPage");
        if (s != null)
        {
            a(a(((Context) (getActivity()))), ((b) (this)));
        }
    }

    protected final void b()
    {
        super.b();
        com.roidapp.baselib.c.b.a("SearchPage", a());
    }

    public final void c()
    {
        p = true;
    }

    public final boolean d()
    {
        if (t != null && !TextUtils.isEmpty(t.b()))
        {
            t.a("");
            f();
            return true;
        } else
        {
            return false;
        }
    }

    public final String e()
    {
        return g;
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (h == null)
        {
            i = new j();
            j = new g();
            h = new e(this, getChildFragmentManager());
        }
        r = true;
        a.setAdapter(h);
        a.setCurrentItem(m);
        if (!TextUtils.isEmpty(g))
        {
            r = false;
            g();
        }
    }

    public final void onClick(View view)
    {
        if (view.equals(c))
        {
            if (a != null && a.getCurrentItem() != 0)
            {
                a.setCurrentItem(0);
                g();
            }
            m = 0;
        } else
        if (view.equals(d))
        {
            if (a != null && a.getCurrentItem() != 1)
            {
                a.setCurrentItem(1);
                g();
            }
            m = 1;
            return;
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        o = true;
        n = getResources().getDisplayMetrics().widthPixels;
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(as.b, null);
        a = (ViewPager)layoutinflater.findViewById(ar.bJ);
        e = layoutinflater.findViewById(ar.cf);
        f = (TextView)layoutinflater.findViewById(ar.ce);
        a.setOnPageChangeListener(this);
        b = layoutinflater.findViewById(ar.ch);
        c = (TextView)layoutinflater.findViewById(ar.co);
        d = (TextView)layoutinflater.findViewById(ar.cn);
        c.setOnClickListener(this);
        d.setOnClickListener(this);
        if (m == 0)
        {
            b.setPadding(n / 8, 0, (n / 8) * 5, 0);
        } else
        {
            b.setPadding((n / 8) * 5, 0, n / 8, 0);
        }
        al.g().b(getActivity(), "Search page");
        com.roidapp.baselib.c.b.b("Search page");
        return layoutinflater;
    }

    public final void onDestroy()
    {
        super.onDestroy();
        b(k);
        b(l);
    }

    public final void onDetach()
    {
        super.onDetach();
        try
        {
            Field field = android/support/v4/app/Fragment.getDeclaredField("mChildFragmentManager");
            field.setAccessible(true);
            field.set(this, null);
            return;
        }
        catch (NoSuchFieldException nosuchfieldexception)
        {
            throw new RuntimeException(nosuchfieldexception);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new RuntimeException(illegalaccessexception);
        }
    }

    public final void onPageScrollStateChanged(int i1)
    {
    }

    public final void onPageScrolled(int i1, float f1, int j1)
    {
        if (j1 > 0)
        {
            b.setPadding(n / 8 + j1 / 2, 0, (n / 8) * 5 - j1 / 2, 0);
            b.invalidate();
        }
    }

    public final void onPageSelected(int i1)
    {
        if (m != i1)
        {
            m = i1;
            g();
        }
    }
}
