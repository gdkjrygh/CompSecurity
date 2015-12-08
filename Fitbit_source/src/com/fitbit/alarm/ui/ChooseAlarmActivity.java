// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.alarm.ui;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.ViewGroup;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.views.ViewPagerTabIndicator;
import com.fitbit.util.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.alarm.ui:
//            ChooseAlarmActivity_, AlarmFragment

public class ChooseAlarmActivity extends FitbitActivity
{
    private class a extends FragmentPagerAdapter
    {

        Fragment a[];
        final ChooseAlarmActivity b;
        private List c;
        private AlarmFragment d;

        public int getCount()
        {
            return c.size();
        }

        public Fragment getItem(int i)
        {
            Fragment fragment = a[i];
            if (fragment != null)
            {
                return fragment;
            } else
            {
                a[i] = AlarmFragment.a(b.getBaseContext(), (String)c.get(i));
                return a[i];
            }
        }

        public CharSequence getPageTitle(int i)
        {
            return p.c((String)c.get(i)).i();
        }

        public void setPrimaryItem(ViewGroup viewgroup, int i, Object obj)
        {
            if (obj != null) goto _L2; else goto _L1
_L1:
            if (d != null)
            {
                d.a(false);
                d = null;
            }
_L4:
            super.setPrimaryItem(viewgroup, i, obj);
            return;
_L2:
            if (obj instanceof AlarmFragment)
            {
                AlarmFragment alarmfragment = (AlarmFragment)obj;
                alarmfragment.a(true);
                if (d != null && d != alarmfragment)
                {
                    d.a(false);
                }
                d = alarmfragment;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public a(FragmentManager fragmentmanager, List list)
        {
            b = ChooseAlarmActivity.this;
            super(fragmentmanager);
            d = null;
            c = list;
            a = new Fragment[list.size()];
        }
    }


    protected int a;
    protected ViewPager b;
    protected ViewPagerTabIndicator c;
    protected List d;
    private a e;

    public ChooseAlarmActivity()
    {
    }

    public static void a(Context context)
    {
        ChooseAlarmActivity_.b(context).b();
    }

    protected void a()
    {
        Object obj = p.b(DeviceFeature.ALARMS);
        d = new ArrayList();
        Device device;
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); d.add(device.d()))
        {
            device = (Device)((Iterator) (obj)).next();
        }

        e = new a(getSupportFragmentManager(), d);
        b.setAdapter(e);
        c.a(b);
        c.a(new android.support.v4.view.ViewPager.OnPageChangeListener() {

            final ChooseAlarmActivity a;

            public void onPageScrollStateChanged(int i)
            {
            }

            public void onPageScrolled(int i, float f, int j)
            {
            }

            public void onPageSelected(int i)
            {
            }

            
            {
                a = ChooseAlarmActivity.this;
                super();
            }
        });
        e.notifyDataSetChanged();
    }
}
