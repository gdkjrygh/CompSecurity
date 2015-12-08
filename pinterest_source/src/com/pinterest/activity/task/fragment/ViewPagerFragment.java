// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.fragment;

import android.os.Bundle;
import android.support.v4.app.FixedFragmentStatePagerAdapter;
import android.support.v4.view.ModifiedViewPager;
import android.view.View;
import com.pinterest.ui.actions.Scrollable;
import java.util.ArrayList;

// Referenced classes of package com.pinterest.activity.task.fragment:
//            BaseFragment

public class ViewPagerFragment extends BaseFragment
{

    protected int _initialItem;
    protected int _offScreenLimit;
    protected FixedFragmentStatePagerAdapter _viewAdapter;
    protected ModifiedViewPager _viewPager;

    public ViewPagerFragment()
    {
        _offScreenLimit = 1;
        _initialItem = -1;
    }

    public void activateFragment(int i)
    {
        if (_viewAdapter != null && _viewPager != null) goto _L2; else goto _L1
_L1:
        int k;
        return;
_L2:
        if (i < (k = _viewAdapter.getCount()))
        {
            int j = 0;
            while (j < k) 
            {
                BaseFragment basefragment = getFragment(j);
                if (basefragment != null)
                {
                    basefragment = (BaseFragment)basefragment;
                    boolean flag;
                    if (j == i)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    basefragment.setActive(flag);
                }
                j++;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public BaseFragment getActiveFragment()
    {
        if (_viewPager == null)
        {
            return null;
        } else
        {
            return getFragment(_viewPager.getCurrentItem());
        }
    }

    public int getCurrentActiveItem()
    {
        if (_viewPager != null && _viewPager.getScrollX() == 0)
        {
            return _viewPager.getCurrentItem();
        } else
        {
            return -1;
        }
    }

    public int getCurrentItem()
    {
        if (_viewPager != null)
        {
            return _viewPager.getCurrentItem();
        } else
        {
            return -1;
        }
    }

    public BaseFragment getFragment(int i)
    {
        ArrayList arraylist;
        if (_viewAdapter != null && _viewPager != null)
        {
            if ((arraylist = _viewAdapter.getFragments()) != null && i + 1 <= arraylist.size())
            {
                return (BaseFragment)arraylist.get(i);
            }
        }
        return null;
    }

    public FixedFragmentStatePagerAdapter getViewAdapter()
    {
        return _viewAdapter;
    }

    protected void onActivate()
    {
        super.onActivate();
        BaseFragment basefragment = getActiveFragment();
        if (basefragment != null)
        {
            basefragment.onActivate();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300ed;
    }

    protected void onDeactivate()
    {
        super.onDeactivate();
        BaseFragment basefragment = getActiveFragment();
        if (basefragment != null)
        {
            basefragment.onDeactivate();
        }
    }

    public void onDestroy()
    {
        _viewAdapter = null;
        super.onDestroy();
    }

    public void onDestroyView()
    {
        if (_viewPager != null)
        {
            _viewPager.setOnPageChangeListener(null);
            _viewPager.setAdapter(null);
            _viewPager = null;
        }
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _viewPager = (ModifiedViewPager)view.findViewById(0x7f0f0248);
        _viewPager.setInitialItem(_initialItem);
        _viewPager.setOffscreenPageLimit(_offScreenLimit);
        _viewPager.setAdapter(_viewAdapter);
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        if (_viewPager != null)
        {
            _viewPager.requestDisallowInterceptTouchEvent(flag);
        }
    }

    public void scrollActiveFragmentToTop()
    {
        BaseFragment basefragment;
        for (basefragment = getActiveFragment(); basefragment == null || !com/pinterest/ui/actions/Scrollable.isAssignableFrom(basefragment.getClass());)
        {
            return;
        }

        basefragment.scrollTo(0, 0);
    }
}
