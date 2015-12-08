// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.fitbit.savedstate.c;
import com.fitbit.ui.fragments.FitbitFragment;
import com.fitbit.util.ap;
import com.fitbit.util.o;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.fitbit.ui:
//            DayFragment

public abstract class DayPagerFragment extends FitbitFragment
    implements android.support.v4.view.ViewPager.OnPageChangeListener
{
    public class a extends PagerAdapter
    {

        Set a;
        Map b;
        final DayPagerFragment c;
        private int d;
        private int e;
        private Calendar f;
        private int g;
        private final FragmentManager h;
        private FragmentTransaction i;
        private b j;
        private Bundle k;

        static int a(a a1)
        {
            return a1.g;
        }

        public int a(int l)
        {
            return Math.max(0, Math.min(d - 1, l - e));
        }

        public int a(Calendar calendar)
        {
            return a(o.h(calendar) - g);
        }

        public void a()
        {
            startUpdate(c.d);
            a.clear();
            b.clear();
            instantiateItem(c.d, -e + 1);
            instantiateItem(c.d, -e);
            instantiateItem(c.d, -e - 1);
            finishUpdate(c.d);
        }

        public void a(int l, int i1)
        {
            f = o.a();
            g = o.h(f);
            e = l;
            d = Math.max(0, (i1 - l) + 1);
            notifyDataSetChanged();
        }

        public int b(int l)
        {
            return a(l - g);
        }

        public void b()
        {
            Calendar calendar = o.a();
            if (f != null && !f.equals(calendar))
            {
                com.fitbit.e.a.d(DayPagerFragment.a(c), (new StringBuilder()).append("Day changed from ").append(DateFormat.format("yyyy-MM-dd", f)).append(" to ").append(DateFormat.format("yyyy-MM-dd", calendar)).toString(), new Object[0]);
                f = calendar;
                g = o.h(calendar);
                com.fitbit.savedstate.c.a(f.getTime());
                a();
                notifyDataSetChanged();
            }
        }

        public Calendar c(int l)
        {
            Calendar calendar = (Calendar)f.clone();
            calendar.add(5, e + l);
            return calendar;
        }

        public void destroyItem(ViewGroup viewgroup, int l, Object obj)
        {
            viewgroup = ((b)obj).c;
            a.remove(viewgroup);
            b.remove(Integer.valueOf(l));
            if (h.findFragmentByTag(viewgroup.getTag()) != null)
            {
                k.putParcelable(viewgroup.getTag(), h.saveFragmentInstanceState(viewgroup));
            }
            i.remove(viewgroup);
        }

        public void finishUpdate(ViewGroup viewgroup)
        {
            i.commitAllowingStateLoss();
            i = null;
        }

        public int getCount()
        {
            return d;
        }

        public int getItemPosition(Object obj)
        {
            return b(((b)obj).a);
        }

        public Object instantiateItem(ViewGroup viewgroup, int l)
        {
            Calendar calendar = c(l);
            String s = DateFormat.format("yyyy-MM-dd", calendar).toString();
            Fragment fragment1 = h.findFragmentByTag(s);
            Fragment fragment = fragment1;
            if (fragment1 == null)
            {
                fragment = c.a(calendar);
                android.support.v4.app.Fragment.SavedState savedstate = (android.support.v4.app.Fragment.SavedState)k.getParcelable(s);
                if (savedstate != null)
                {
                    fragment.setInitialSavedState(savedstate);
                }
                i.add(viewgroup.getId(), fragment, s);
            }
            if (fragment instanceof DayFragment)
            {
                viewgroup = (DayFragment)fragment;
                viewgroup.a(calendar);
                a.add(viewgroup);
                b.remove(viewgroup);
                b.put(Integer.valueOf(l), viewgroup);
            }
            return new b(o.h(calendar), calendar, fragment);
        }

        public boolean isViewFromObject(View view, Object obj)
        {
            return ((b)obj).c.getView() == view;
        }

        public void restoreState(Parcelable parcelable, ClassLoader classloader)
        {
            k = (Bundle)parcelable;
        }

        public Parcelable saveState()
        {
            if (j != null)
            {
                int i1 = c.d.getOffscreenPageLimit();
                int j1 = b(j.a);
                int l = Math.max(0, j1 - i1);
                for (i1 = Math.min(d - 1, i1 + j1); l <= i1; l++)
                {
                    Object obj = DateFormat.format("yyyy-MM-dd", c(l)).toString();
                    obj = h.findFragmentByTag(((String) (obj)));
                    if (obj != null)
                    {
                        k.putParcelable(((Fragment) (obj)).getTag(), h.saveFragmentInstanceState(((Fragment) (obj))));
                    }
                }

            }
            return k;
        }

        public void setPrimaryItem(ViewGroup viewgroup, int l, Object obj)
        {
            if (j == obj || ((b)obj).c == null)
            {
                return;
            }
            if (j != null)
            {
                j.c.setUserVisibleHint(false);
            }
            j = (b)obj;
            j.c.setUserVisibleHint(true);
            com.fitbit.e.a.d(DayPagerFragment.a(c), (new StringBuilder()).append(DayPagerFragment.b(c)).append(" opened on ").append(j.c.getTag()).toString(), new Object[0]);
            com.fitbit.savedstate.c.a(j.b);
        }

        public void startUpdate(ViewGroup viewgroup)
        {
            i = h.beginTransaction();
        }

        public a(FragmentManager fragmentmanager)
        {
            c = DayPagerFragment.this;
            super();
            d = 0;
            i = null;
            j = null;
            k = new Bundle();
            a = new HashSet();
            b = new HashMap();
            h = fragmentmanager;
        }
    }

    private static class b
    {

        final int a;
        final Calendar b;
        final Fragment c;

        b(int l, Calendar calendar, Fragment fragment)
        {
            a = l;
            b = calendar;
            c = fragment;
        }
    }


    private static final String a = "yyyy-MM-dd";
    protected static final String c = (new StringBuilder()).append(com/fitbit/ui/DayPagerFragment.getName()).append(".KEY_ADAPTER_STATE").toString();
    private final String b = com/fitbit/ui/DayPagerFragment.getSimpleName();
    protected ViewPager d;
    protected a e;
    private final String f = getClass().getSimpleName();
    private boolean g;

    public DayPagerFragment()
    {
        e = null;
        g = false;
    }

    static String a(DayPagerFragment daypagerfragment)
    {
        return daypagerfragment.b;
    }

    static String b(DayPagerFragment daypagerfragment)
    {
        return daypagerfragment.f;
    }

    public int a(int l)
    {
        return l - a.a(e);
    }

    public abstract Fragment a(Calendar calendar);

    public void a(int l, int i1)
    {
        e.a(l, i1);
        if (d != null)
        {
            d.setCurrentItem(e.a(com.fitbit.savedstate.c.i()));
        }
    }

    protected DayFragment b(int l)
    {
        return (DayFragment)e.b.get(Integer.valueOf(l));
    }

    public void h()
    {
        if (d != null)
        {
            d.setCurrentItem(e.a(0), true);
            return;
        } else
        {
            com.fitbit.savedstate.c.a(o.a());
            return;
        }
    }

    public Set i()
    {
        return e.a;
    }

    public ViewPager j()
    {
        return d;
    }

    public boolean k()
    {
        return g;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        e = new a(getChildFragmentManager());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        d = new ViewPager(layoutinflater.getContext());
        d.setId(0x7f110077);
        d.setSaveEnabled(false);
        d.setOnPageChangeListener(this);
        d.setPageMargin(ap.a(d.getContext(), 24F));
        d.setAdapter(e);
        if (bundle != null)
        {
            viewgroup = bundle.getBundle(c);
        } else
        {
            viewgroup = null;
        }
        if (viewgroup != null)
        {
            e.restoreState(viewgroup, layoutinflater.getContext().getClassLoader());
        }
        d.setCurrentItem(e.a(com.fitbit.savedstate.c.i()));
        return d;
    }

    public void onPageScrollStateChanged(int l)
    {
        boolean flag;
        if (l != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (g != flag)
        {
            g = flag;
            for (Iterator iterator = e.a.iterator(); iterator.hasNext(); ((DayFragment)iterator.next()).a(flag)) { }
        }
    }

    public void onPageScrolled(int l, float f1, int i1)
    {
    }

    public void onPageSelected(int l)
    {
    }

    public void onResume()
    {
        super.onResume();
        e.b();
        d.setCurrentItem(e.a(com.fitbit.savedstate.c.i()));
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (e != null)
        {
            bundle.putParcelable(c, e.saveState());
        }
    }

    protected void w_()
    {
        if (e != null)
        {
            e.b();
        }
    }

}
