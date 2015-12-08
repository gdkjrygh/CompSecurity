// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.alarm.ui;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;
import com.fitbit.data.domain.device.Device;
import com.fitbit.util.p;
import java.util.List;

// Referenced classes of package com.fitbit.alarm.ui:
//            ChooseAlarmActivity, AlarmFragment

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

    public r(ChooseAlarmActivity choosealarmactivity, FragmentManager fragmentmanager, List list)
    {
        b = choosealarmactivity;
        super(fragmentmanager);
        d = null;
        c = list;
        a = new Fragment[list.size()];
    }
}
