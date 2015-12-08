// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.main;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import com.roidapp.baselib.c.a;
import com.roidapp.cloudlib.ap;
import com.roidapp.cloudlib.sns.ab;
import com.roidapp.cloudlib.sns.g.c;
import com.roidapp.cloudlib.sns.g.e;
import com.roidapp.cloudlib.sns.i;
import com.roidapp.cloudlib.sns.modifiedrefresh.SwipeRefreshLayout2;
import com.roidapp.cloudlib.sns.u;

// Referenced classes of package com.roidapp.cloudlib.sns.main:
//            c, a, d

public class b extends a
    implements c
{

    private boolean a;
    private int b;
    private FragmentManager c;
    private e d[];
    protected com.roidapp.cloudlib.sns.main.a s;
    protected ab t;
    protected final android.view.View.OnClickListener u = new com.roidapp.cloudlib.sns.main.c(this);

    public b()
    {
        a = true;
        b = 0x80000000;
    }

    private void d()
    {
        if (s != null)
        {
            ViewPager viewpager = s.a();
            if (viewpager != null)
            {
                viewpager.getAdapter().notifyDataSetChanged();
            }
        }
    }

    public final void A()
    {
        s.m();
    }

    public View a(Context context)
    {
        return null;
    }

    public final d a(int i, b b1)
    {
        return new d(i, false, this, b1, false);
    }

    public final d a(int i, b b1, boolean flag)
    {
        return new d(i, flag, this, b1);
    }

    protected final void a(SwipeRefreshLayout swiperefreshlayout)
    {
        if (swiperefreshlayout != null)
        {
            float f = getResources().getDimension(ap.m);
            int i = (int)((float)t() - f / 2.0F);
            swiperefreshlayout.setProgressViewOffset(false, i, (int)(f + (float)i));
            swiperefreshlayout.setColorSchemeColors(new int[] {
                0xff008000, 0xffff0000, -23296, -256
            });
        }
    }

    public final void a(View view, b b1)
    {
        if (s != null)
        {
            s.a(view);
        }
        if (b1 != null && (view instanceof ab))
        {
            b1.t = (ab)view;
        }
    }

    public void a(e e, Object obj)
    {
    }

    public final void a(b b1)
    {
        b(s.a().getCurrentItem(), b1);
    }

    protected final void a(SwipeRefreshLayout2 swiperefreshlayout2, boolean flag, boolean flag1)
    {
        if (swiperefreshlayout2 != null)
        {
            int i = getResources().getDimensionPixelSize(ap.j);
            float f = getResources().getDimension(ap.m);
            int j = (int)((double)t() - (double)f / 1.5D);
            swiperefreshlayout2.a(j - i, (int)(f + (float)j));
            swiperefreshlayout2.a(new int[] {
                0xff008000, 0xffff0000, -23296, -256
            });
            swiperefreshlayout2.c(flag);
            swiperefreshlayout2.b(flag1);
            if (flag1)
            {
                swiperefreshlayout2.a(i);
            }
        }
    }

    protected final transient void a(e ae[])
    {
        if (d == null)
        {
            d = ae;
            ae = d;
            int j = ae.length;
            for (int i = 0; i < j; i++)
            {
                e e = ae[i];
                com.roidapp.cloudlib.sns.g.b.a().a(e, this);
            }

        }
    }

    public final transient void a(d ad[])
    {
        int i = 0;
        if (s != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        int j = ad.length;
        flag = false;
        do
        {
            if (i >= j)
            {
                continue; /* Loop/switch isn't completed */
            }
            d d1 = ad[i];
            if (d1.e)
            {
                if (d1.d.a)
                {
                    s.f();
                } else
                {
                    s.m_();
                }
            }
            if (d1.b)
            {
                s.a(this);
            } else
            if (c != null)
            {
                c.beginTransaction().remove(d1.c).commitAllowingStateLoss();
            }
            if (d1.e)
            {
                com.roidapp.cloudlib.sns.a.a.a(s.b(), Integer.valueOf(d1.d.hashCode()));
                a(d1.d.a(((Context) (getActivity()))), d1.d);
            }
            s.a(d1.a, d1.d);
            flag = true;
            i++;
        } while (true);
        if (!flag) goto _L1; else goto _L3
_L3:
        d();
        return;
    }

    public final b b(int i)
    {
        if (s != null)
        {
            return s.a(i);
        } else
        {
            return null;
        }
    }

    public final void b(int i, b b1)
    {
        a(new d[] {
            a(i, b1, true)
        });
    }

    public boolean h_()
    {
        if (s == null)
        {
            return false;
        }
        if (s.h())
        {
            return false;
        }
        ViewPager viewpager = s.a();
        b b1 = (b)s.g();
        if (b1 != null)
        {
            if (b1.a)
            {
                s.f();
            } else
            {
                s.m_();
            }
            if (c != null)
            {
                c.beginTransaction().remove(this).commit();
            }
            com.roidapp.cloudlib.sns.a.a.a(s.b(), Integer.valueOf(b1.hashCode()));
            a(b1.a(getActivity()), b1);
            s.a(viewpager.getCurrentItem(), b1);
            d();
            return true;
        } else
        {
            return false;
        }
    }

    public void i_()
    {
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        s = (com.roidapp.cloudlib.sns.main.a)activity;
        c = getFragmentManager();
    }

    public void onDestroy()
    {
        super.onDestroy();
        com.roidapp.cloudlib.sns.u.a().a(this);
        if (d != null)
        {
            e ae[] = d;
            int j = ae.length;
            for (int i = 0; i < j; i++)
            {
                e e = ae[i];
                com.roidapp.cloudlib.sns.g.b.a().b(e, this);
            }

        }
    }

    public final void r()
    {
        if (s != null)
        {
            s.i();
        }
    }

    public final boolean s()
    {
        if (s != null)
        {
            return s.k();
        } else
        {
            return false;
        }
    }

    public final int t()
    {
        if (b != 0x80000000)
        {
            return b;
        }
        if (s != null)
        {
            b = s.b().getLayoutParams().height;
            return b;
        } else
        {
            return 0;
        }
    }

    public final int u()
    {
        if (s != null)
        {
            View view = s.b();
            if (view != null)
            {
                return (int)ViewCompat.getTranslationY(view);
            }
        }
        return 0;
    }

    public final i v()
    {
        return s.l();
    }

    public final boolean w()
    {
        return a;
    }

    public final void x()
    {
        a = false;
    }

    public final void y()
    {
        s.d();
    }

    protected final boolean z()
    {
        return isAdded() && !getActivity().isFinishing();
    }
}
