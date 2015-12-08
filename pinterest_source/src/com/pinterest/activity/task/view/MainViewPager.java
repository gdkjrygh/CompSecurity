// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.view;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v4.app.FixedFragmentStatePagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.view.ModifiedViewPager;
import android.support.v4.view.PagerAdapter;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import com.pinterest.activity.board.fragment.BoardFragment;
import com.pinterest.activity.task.adapter.MainViewAdapter;
import com.pinterest.activity.task.animation.PagerAnimation;
import com.pinterest.activity.task.animation.PagerPopAnimation;
import com.pinterest.activity.task.animation.PagerSlideAnimation;
import com.pinterest.activity.task.animation.PagerVerticalSlideAnimation;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.fragment.ViewPagerFragment;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.web.fragment.WebViewFragment;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.base.Events;
import java.util.Iterator;
import java.util.List;

public class MainViewPager extends ModifiedViewPager
{

    public static float CURRENT_X = 0F;
    public static int DIRECTION = 0;
    public static float LAST_X = 0F;
    public static final int LEFT = 1;
    public static final int NONE = 0;
    public static final int RIGHT = 2;
    private static final float SWIPE_BACK_GUTTER = 0.18F;
    private PagerAnimation _animation;
    private int _currentItem;
    private boolean _dragged;
    private ViewPagerFragment _pagerFragment;
    private boolean _shouldTrim;
    private android.support.v4.view.ModifiedViewPager.OnPageChangeListener _wrappedOnPageChange;
    private android.support.v4.view.ModifiedViewPager.OnPageChangeListener onPageChange;
    private android.support.v4.view.ModifiedViewPager.PageTransformer onPageTransform;

    public MainViewPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _animation = null;
        _shouldTrim = false;
        _currentItem = 0;
        _dragged = false;
        _pagerFragment = null;
        _wrappedOnPageChange = null;
        onPageChange = new _cls1();
        onPageTransform = new _cls2();
        super.setOnPageChangeListener(onPageChange);
        setPageTransformer(false, onPageTransform);
        mSwipeBackOnly = true;
    }

    private void temporaryDisable()
    {
        if (isEnabled())
        {
            setEnabled(false);
            postDelayed(new _cls3(), 400L);
        }
    }

    private void updateTouchCoords(MotionEvent motionevent)
    {
        LAST_X = CURRENT_X;
        float f = motionevent.getRawX();
        CURRENT_X = f;
        int i;
        if (f > LAST_X)
        {
            i = 2;
        } else
        {
            i = 1;
        }
        DIRECTION = i;
    }

    protected boolean canScroll(View view, boolean flag, int i, int j, int k)
    {
        if ((float)j >= (float)getWidth() * 0.18F)
        {
            if (_pagerFragment != null)
            {
                if (_pagerFragment.getCurrentActiveItem() != 0 || DIRECTION != 2)
                {
                    return true;
                }
            } else
            {
                return super.canScroll(view, flag, i, j, k);
            }
        }
        return false;
    }

    public void forceTrim()
    {
        MainViewAdapter mainviewadapter = getAdapter();
        if (mainviewadapter != null)
        {
            mainviewadapter.trim(_currentItem);
        }
    }

    public volatile PagerAdapter getAdapter()
    {
        return getAdapter();
    }

    public MainViewAdapter getAdapter()
    {
        return (MainViewAdapter)super.getAdapter();
    }

    public int getAnimateBackwardsDuration(int i)
    {
        i = 0;
        if (_animation != null)
        {
            i = _animation.getBackwardsDuration();
        }
        return i;
    }

    public int getAnimateForwardsDuration(int i)
    {
        i = 0;
        if (_animation != null)
        {
            i = _animation.getForwardsDuration();
        }
        return i;
    }

    protected PagerAnimation getAnimation(Fragment fragment)
    {
        if (!(fragment instanceof BaseFragment)) goto _L2; else goto _L1
_L1:
        fragment = ((BaseFragment)fragment).getNavigation().getDisplayMode();
        _cls4..SwitchMap.com.pinterest.activity.task.model.Navigation.DisplayMode[fragment.ordinal()];
        JVM INSTR tableswitch 1 2: default 48
    //                   1 52
    //                   2 56;
           goto _L2 _L3 _L4
_L2:
        return PagerSlideAnimation.getInstance();
_L3:
        return PagerPopAnimation.getInstance();
_L4:
        return PagerVerticalSlideAnimation.getInstance();
    }

    public void handlePageSelected(int i)
    {
        Object obj1 = getAdapter().getFragments();
        if (_currentItem < ((List) (obj1)).size())
        {
            Object obj = (Fragment)((List) (obj1)).get(_currentItem);
            if ((obj instanceof BoardFragment) || (obj instanceof WebViewFragment))
            {
                setAllowHardwareLayers(false);
            }
            if (_pagerFragment != null)
            {
                Object obj3 = _pagerFragment.getViewAdapter();
                if (obj3 != null)
                {
                    obj3 = ((FixedFragmentStatePagerAdapter) (obj3)).getFragments().iterator();
                    do
                    {
                        if (!((Iterator) (obj3)).hasNext())
                        {
                            break;
                        }
                        Fragment fragment1 = (Fragment)((Iterator) (obj3)).next();
                        if ((fragment1 instanceof BaseFragment) && !fragment1.equals(obj))
                        {
                            ((BaseFragment)fragment1).setActive(false);
                        }
                    } while (true);
                }
            }
            obj1 = ((List) (obj1)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                Fragment fragment = (Fragment)((Iterator) (obj1)).next();
                if ((fragment instanceof BaseFragment) && !fragment.equals(obj))
                {
                    ((BaseFragment)fragment).setActive(false);
                }
            } while (true);
            if (obj instanceof BaseFragment)
            {
                ((BaseFragment)obj).setActive(true);
            }
            if (obj instanceof ViewPagerFragment)
            {
                _pagerFragment = (ViewPagerFragment)obj;
                Object obj2 = _pagerFragment.getViewAdapter();
                if (obj2 != null)
                {
                    obj2 = ((FixedFragmentStatePagerAdapter) (obj2)).getFragments();
                    int j = 0;
                    while (j < ((List) (obj2)).size()) 
                    {
                        Object obj4 = (Fragment)((List) (obj2)).get(j);
                        if (obj4 instanceof BaseFragment)
                        {
                            obj4 = (BaseFragment)obj4;
                            boolean flag;
                            if (j == _pagerFragment.getCurrentItem())
                            {
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                            ((BaseFragment) (obj4)).setActive(flag);
                        }
                        j++;
                    }
                }
            } else
            {
                _pagerFragment = null;
            }
            if (obj instanceof BaseFragment)
            {
                Pinalytics.a(((Fragment) (obj)));
                Events.post(new PageChangedEvent(((BaseFragment)obj).getNavigation()));
            }
            if (obj != null)
            {
                obj = ((Fragment) (obj)).getView();
                if (obj != null)
                {
                    ((View) (obj)).setVisibility(0);
                }
            }
        } else
        {
            _pagerFragment = null;
        }
        if (_wrappedOnPageChange != null)
        {
            _wrappedOnPageChange.onPageSelected(i);
        }
    }

    public boolean onBackPressed()
    {
        Fragment fragment = getAdapter().getCurrentPrimaryItem();
        if ((fragment instanceof BaseFragment) && ((BaseFragment)fragment).onBackPressed())
        {
            return true;
        }
        if (getCurrentItem() > 0)
        {
            setCurrentItem(getCurrentItem() - 1, true);
            return true;
        } else
        {
            return false;
        }
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        handleRotate();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        updateTouchCoords(motionevent);
        return super.onInterceptTouchEvent(motionevent);
    }

    public boolean onKeyLongPress(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            popTo(0);
            return true;
        } else
        {
            return super.onKeyLongPress(i, keyevent);
        }
    }

    public void popTo(int i)
    {
        MainViewAdapter mainviewadapter = getAdapter();
        if (mainviewadapter != null && i + 1 < mainviewadapter.getCount())
        {
            setCurrentItem(i + 1, false);
            _shouldTrim = true;
            setCurrentItem(i, true);
        }
    }

    public void setCurrentItem(int i)
    {
        super.setCurrentItem(i);
        temporaryDisable();
    }

    public void setCurrentItem(int i, boolean flag)
    {
        super.setCurrentItem(i, flag);
        temporaryDisable();
    }

    public void setOnPageChangeListener(android.support.v4.view.ModifiedViewPager.OnPageChangeListener onpagechangelistener)
    {
        _wrappedOnPageChange = onpagechangelistener;
    }

    public void setPagerFragment(ViewPagerFragment viewpagerfragment)
    {
        _pagerFragment = viewpagerfragment;
    }

    static 
    {
        LAST_X = 0.0F;
        CURRENT_X = 0.0F;
        DIRECTION = 0;
    }




/*
    static boolean access$102(MainViewPager mainviewpager, boolean flag)
    {
        mainviewpager._dragged = flag;
        return flag;
    }

*/



/*
    static boolean access$202(MainViewPager mainviewpager, boolean flag)
    {
        mainviewpager._shouldTrim = flag;
        return flag;
    }

*/



/*
    static int access$302(MainViewPager mainviewpager, int i)
    {
        mainviewpager._currentItem = i;
        return i;
    }

*/



/*
    static PagerAnimation access$402(MainViewPager mainviewpager, PagerAnimation pageranimation)
    {
        mainviewpager._animation = pageranimation;
        return pageranimation;
    }

*/

    private class _cls1
        implements android.support.v4.view.ModifiedViewPager.OnPageChangeListener
    {

        final MainViewPager this$0;

        public void onPageScrollStateChanged(int i)
        {
            Events.post(new PageStateEvent(i));
            i;
            JVM INSTR tableswitch 0 1: default 36
        //                       0 142
        //                       1 136;
               goto _L1 _L2 _L3
_L2:
            break MISSING_BLOCK_LABEL_142;
_L1:
            setBackgroundColor(Colors.BLACK);
_L4:
            java.util.ArrayList arraylist = getAdapter().getFragments();
            int j = getAdapter().getCount();
            int k = arraylist.size();
            if (j > k)
            {
                j = k;
            }
            _animation = getAnimation((Fragment)arraylist.get(j - 1));
            if (_wrappedOnPageChange != null)
            {
                _wrappedOnPageChange.onPageScrollStateChanged(i);
            }
            return;
_L3:
            Pinalytics.e();
              goto _L1
            setBackgroundColor(Colors.TRANSPARENT);
            _dragged = false;
            if (_shouldTrim)
            {
                _shouldTrim = false;
                getAdapter().trim(_currentItem);
            }
              goto _L4
        }

        public void onPageScrolled(int i, float f, int j)
        {
            if (_wrappedOnPageChange != null)
            {
                _wrappedOnPageChange.onPageScrolled(i, f, j);
            }
        }

        public void onPageSelected(final int position)
        {
            if (_dragged)
            {
                Pinalytics.f();
            }
            _shouldTrim = true;
            _currentItem = position;
            if (getAdapter().getFragments().size() == 0)
            {
                class _cls1
                    implements Runnable
                {

                    final _cls1 this$1;
                    final int val$position;

                    public void run()
                    {
                        handlePageSelected(position);
                    }

                _cls1()
                {
                    this$1 = _cls1.this;
                    position = i;
                    super();
                }
                }

                postDelayed(new _cls1(), 100L);
                return;
            } else
            {
                handlePageSelected(position);
                return;
            }
        }

        _cls1()
        {
            this$0 = MainViewPager.this;
            super();
        }

        private class PageStateEvent
        {

            private int _state;

            public int getState()
            {
                return _state;
            }

            public PageStateEvent(int i)
            {
                _state = i;
            }
        }

    }


    private class _cls2
        implements android.support.v4.view.ModifiedViewPager.PageTransformer
    {

        final MainViewPager this$0;

        public void transformPage(View view, float f, boolean flag, int i)
        {
            if (flag)
            {
                _dragged = true;
            }
            if (_animation != null)
            {
                _animation.transformView(view, f, _dragged, i);
            }
        }

        _cls2()
        {
            this$0 = MainViewPager.this;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final MainViewPager this$0;

        public void run()
        {
            setEnabled(true);
        }

        _cls3()
        {
            this$0 = MainViewPager.this;
            super();
        }
    }


    private class _cls4
    {

        static final int $SwitchMap$com$pinterest$activity$task$model$Navigation$DisplayMode[];

        static 
        {
            $SwitchMap$com$pinterest$activity$task$model$Navigation$DisplayMode = new int[com.pinterest.activity.task.model.Navigation.DisplayMode.values().length];
            try
            {
                $SwitchMap$com$pinterest$activity$task$model$Navigation$DisplayMode[com.pinterest.activity.task.model.Navigation.DisplayMode.OVERLAY.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$activity$task$model$Navigation$DisplayMode[com.pinterest.activity.task.model.Navigation.DisplayMode.EDUCATION.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class PageChangedEvent
    {

        private Navigation _navigation;

        public Navigation getNavigation()
        {
            return _navigation;
        }

        public void setNavigation(Navigation navigation)
        {
            _navigation = navigation;
        }

        public PageChangedEvent(Navigation navigation)
        {
            _navigation = navigation;
        }
    }

}
