// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.adapter;

import android.support.v4.app.FixedFragmentStatePagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.ViewGroup;
import com.pinterest.activity.home.HomeFragment;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.task.view.MainViewPager;
import com.pinterest.base.Device;
import com.pinterest.kit.log.PLog;
import com.pinterest.reporting.CrashReporting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainViewAdapter extends FixedFragmentStatePagerAdapter
{

    private ArrayList _navigationItems;
    private MainViewPager _pager;

    public MainViewAdapter(FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
        _navigationItems = new ArrayList();
    }

    public void destroyItem(ViewGroup viewgroup, int i, Object obj)
    {
        if (!(obj instanceof HomeFragment))
        {
            super.destroyItem(viewgroup, i, obj);
        }
    }

    public Navigation get(int i)
    {
        return (Navigation)_navigationItems.get(i);
    }

    public int getCount()
    {
        return _navigationItems.size();
    }

    public Fragment getItem(int i)
    {
        Navigation navigation;
        if (_navigationItems == null || i > _navigationItems.size() - 1)
        {
            return new BaseFragment();
        }
        navigation = (Navigation)_navigationItems.get(i);
        if (navigation == null)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        BaseFragment basefragment;
        basefragment = (BaseFragment)navigation.getFragmentClass().newInstance();
        basefragment.setNavigation(navigation);
        return basefragment;
        Object obj;
        obj;
        PLog.error(((Throwable) (obj)), "exception occurred", new Object[0]);
_L2:
        return null;
        obj;
        PLog.error(((Throwable) (obj)), "exception occurred", new Object[0]);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public int getItemPosition(Object obj)
    {
        if (obj instanceof BaseFragment)
        {
            obj = ((BaseFragment)obj).getNavigation();
            return !_navigationItems.contains(obj) ? -2 : -1;
        } else
        {
            return super.getItemPosition(obj);
        }
    }

    public ArrayList getNavigationItems()
    {
        return _navigationItems;
    }

    public Navigation getNavigationSource(String s)
    {
        if (s == null)
        {
            return null;
        }
        for (int i = _navigationItems.size() - 1; i > 0; i--)
        {
            if (s.equals(((Navigation)_navigationItems.get(i)).getId()))
            {
                return (Navigation)_navigationItems.get(i - 1);
            }
        }

        return null;
    }

    public MainViewPager getPager()
    {
        return _pager;
    }

    public Object instantiateItem(ViewGroup viewgroup, int i)
    {
        viewgroup = ((ViewGroup) (super.instantiateItem(viewgroup, i)));
        if (viewgroup instanceof BaseFragment)
        {
            ((BaseFragment)viewgroup).setCutout(true);
        }
        return viewgroup;
    }

    public void push(Navigation navigation)
    {
        long l;
        if (navigation != null)
        {
            if (_navigationItems.size() <= 0 || navigation.getCreatedAt().longValue() - (l = ((Navigation)_navigationItems.get(0)).getCreatedAt().longValue()) >= 500L)
            {
                _navigationItems.add(navigation);
                notifyDataSetChanged();
                return;
            }
        }
    }

    public void push(List list)
    {
        if (list != null && list.size() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        long l;
        if (_navigationItems.size() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l = ((Navigation)_navigationItems.get(0)).getCreatedAt().longValue();
        obj = (Navigation)list.get(0);
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((Navigation) (obj)).getCreatedAt();
        if (obj != null && ((Long) (obj)).longValue() - l < 500L) goto _L1; else goto _L3
_L3:
        Navigation navigation;
        for (list = list.iterator(); list.hasNext(); _navigationItems.add(navigation))
        {
            navigation = (Navigation)list.next();
        }

        notifyDataSetChanged();
        if (_pager != null)
        {
            _pager.setEnabled(false);
            _pager.postDelayed(new _cls1(), 300L);
        }
        Device.logMemoryInfo();
        return;
    }

    public void remove(BaseFragment basefragment)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = _navigationItems.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Navigation navigation = (Navigation)iterator.next();
            if (navigation.equals(basefragment.getNavigation()))
            {
                arraylist.add(navigation);
            }
        } while (true);
        _navigationItems.removeAll(arraylist);
        notifyDataSetChanged();
        if (_pager != null)
        {
            _pager.setCurrentItem(_navigationItems.size(), true);
        }
        Device.logMemoryInfo();
    }

    public void remove(final Navigation navigation)
    {
        remove(((List) (new _cls2())));
    }

    public void remove(List list)
    {
        if (list == null || list.size() == 0)
        {
            return;
        }
        ArrayList arraylist = new ArrayList();
        for (list = list.iterator(); list.hasNext();)
        {
            Navigation navigation = (Navigation)list.next();
            Iterator iterator = _navigationItems.iterator();
            while (iterator.hasNext()) 
            {
                Navigation navigation1 = (Navigation)iterator.next();
                if (navigation1.equalsIgnoreCreatedAt(navigation))
                {
                    arraylist.add(navigation1);
                }
            }
        }

        _navigationItems.removeAll(arraylist);
        notifyDataSetChanged();
        if (_pager != null)
        {
            _pager.setCurrentItem(_navigationItems.size(), true);
        }
        Device.logMemoryInfo();
    }

    public void setNavigationItems(ArrayList arraylist)
    {
        if (arraylist == null)
        {
            return;
        } else
        {
            _navigationItems = arraylist;
            notifyDataSetChanged();
            return;
        }
    }

    public void setPager(MainViewPager mainviewpager)
    {
        _pager = mainviewpager;
    }

    protected boolean shouldSaveFragmentState(int i)
    {
        return i < getCount();
    }

    public void trim(int i)
    {
        try
        {
            if (i < _navigationItems.size())
            {
                _navigationItems = new ArrayList(_navigationItems.subList(0, i + 1));
                notifyDataSetChanged();
            }
        }
        catch (IllegalStateException illegalstateexception)
        {
            CrashReporting.a(illegalstateexception);
        }
        Device.logMemoryInfo();
    }


    private class _cls1
        implements Runnable
    {

        final MainViewAdapter this$0;

        public void run()
        {
            if (_pager != null)
            {
                _pager.setEnabled(true);
            }
        }

        _cls1()
        {
            this$0 = MainViewAdapter.this;
            super();
        }
    }


    private class _cls2 extends ArrayList
    {

        final MainViewAdapter this$0;
        final Navigation val$navigation;

        _cls2()
        {
            this$0 = MainViewAdapter.this;
            navigation = navigation1;
            super();
            add(navigation);
        }
    }

}
