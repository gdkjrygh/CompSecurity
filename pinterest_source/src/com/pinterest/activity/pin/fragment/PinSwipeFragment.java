// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.os.Bundle;
import android.support.v4.app.FixedFragmentStatePagerAdapter;
import android.support.v4.view.ModifiedViewPager;
import android.view.View;
import com.pinterest.activity.pin.adapter.PinSwipeAdapter;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.fragment.ViewPagerFragment;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.adapter.LoadMoreListener;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.PinFeed;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.education.EducationHelper;
import com.pinterest.kit.application.Resources;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinFragment

public class PinSwipeFragment extends ViewPagerFragment
{

    private static final String SOURCE_PIN_FEED = "__SOURCE_PIN_FEED";
    private Runnable _eduRunnable;
    private boolean _eduRunnableCreated;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private boolean _flashlightButtonShown;
    private boolean _isPinFromHomefeed;
    private Feed _sourceFeed;
    protected LoadMoreListener loadMoreListener;
    protected FeedApiResponseHandler swipeResponseHandler;

    public PinSwipeFragment()
    {
        _flashlightButtonShown = false;
        _eduRunnableCreated = false;
        _isPinFromHomefeed = false;
        loadMoreListener = new _cls1();
        _eventsSubscriber = new _cls4();
        swipeResponseHandler = new _cls5();
    }

    private boolean isEntryPinDisplayed(Pin pin)
    {
        PinFragment pinfragment = (PinFragment)_viewAdapter.getCurrentPrimaryItem();
        if (pinfragment == null || pinfragment.getPin() == null || pin == null || _sourceFeed == null || _initialItem < 0 || _initialItem >= _sourceFeed.getCount())
        {
            return false;
        }
        return pin.equals(pinfragment.getPin()) && pin.equals(_sourceFeed.get(_initialItem));
    }

    protected void onActivate()
    {
        super.onActivate();
        if (_viewAdapter == null || _viewAdapter.getCount() == 0)
        {
            pressBackButton();
        }
    }

    public boolean onBackPressed()
    {
        if (_viewAdapter.getCurrentPrimaryItem() instanceof BaseFragment)
        {
            return ((BaseFragment)_viewAdapter.getCurrentPrimaryItem()).onBackPressed() || super.onBackPressed();
        } else
        {
            return super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300f7;
        _viewAdapter = new PinSwipeAdapter(getChildFragmentManager());
        ((PinSwipeAdapter)_viewAdapter).setLoadMoreListener(loadMoreListener);
        if (_isPinFromHomefeed)
        {
            ((PinSwipeAdapter)_viewAdapter).setPositionOfInitiallyClickedPin(_initialItem);
        }
        if (_sourceFeed == null && bundle != null)
        {
            _sourceFeed = Feed.restoreInstanceState(bundle, "__SOURCE_PIN_FEED");
        }
        ((PinSwipeAdapter)_viewAdapter).setDataSource(_sourceFeed);
    }

    public void onDestroyView()
    {
        EducationHelper.a(_eduRunnable);
        Events.unregister(_eventsSubscriber);
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        Bundle bundle1 = bundle;
        if (bundle == null)
        {
            bundle1 = new Bundle();
        }
        if (_sourceFeed != null && _sourceFeed.getAbsCount() > 0)
        {
            _sourceFeed.saveInstanceState(bundle1, "__SOURCE_PIN_FEED");
        }
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _viewPager.setOnPageChangeListener(new _cls2());
        _viewPager.setPageMargin((int)Device.dpToPixel(Resources.dimension(0x7f0a0187) / 2.0F));
        _viewPager.setPageTransformer(false, new _cls3());
        Events.registerSticky(_eventsSubscriber, com/pinterest/api/model/Pin$UpdateEvent, new Class[] {
            com/pinterest/activity/pin/view/PinCloseupImageView$ImageLoadEvent, com/pinterest/activity/pin/fragment/PinSwipeFragment$PinSwipeProfXEvent, com/pinterest/activity/pin/view/PinCloseupImageView$FlashlightSearchButtonDisplayedEvent
        });
        Events.register(_eventsSubscriber, com/pinterest/activity/pin/view/PinCloseupImageView$FlashlightSearchButtonEvent, new Class[] {
            com/pinterest/activity/flashlight/FlashlightResultsFragment$FlashlightCloseButtonEvent
        });
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        _sourceFeed = (PinFeed)navigation.getExtra("com.pinterest.EXTRA_FEED");
        _initialItem = navigation.getIntParcelable("com.pinterest.EXTRA_PIN_POSITION");
        boolean flag;
        if (navigation.getIntParcelable("com.pinterest.EXTRA_IS_HOMEFEED_PIN") == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _isPinFromHomefeed = flag;
    }



















/*
    static Runnable access$602(PinSwipeFragment pinswipefragment, Runnable runnable)
    {
        pinswipefragment._eduRunnable = runnable;
        return runnable;
    }

*/




/*
    static boolean access$802(PinSwipeFragment pinswipefragment, boolean flag)
    {
        pinswipefragment._flashlightButtonShown = flag;
        return flag;
    }

*/



/*
    static boolean access$902(PinSwipeFragment pinswipefragment, boolean flag)
    {
        pinswipefragment._eduRunnableCreated = flag;
        return flag;
    }

*/

    private class _cls1
        implements LoadMoreListener
    {

        final PinSwipeFragment this$0;

        public void loadMore()
        {
            Object obj = (PinSwipeAdapter)
// JavaClassFileOutputException: get_constant: invalid tag

        _cls1()
        {
            this$0 = PinSwipeFragment.this;
            super();
        }
    }


    private class _cls4
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final PinSwipeFragment this$0;

        public void onEventMainThread(com.pinterest.activity.flashlight.FlashlightResultsFragment.FlashlightCloseButtonEvent flashlightclosebuttonevent)
        {
            access$602.setDragEnabled(true);
        }

        public void onEventMainThread(PinSwipeProfXEvent pinswipeprofxevent)
        {
label0:
            {
                if (EducationHelper.k() && BuyableProductHelper.isPinAvailable(pinswipeprofxevent.getPin()))
                {
                    _eduRunnable = EducationHelper.a(Placement.ANDROID_PIN_CLOSEUP_COMMERCE_TAKEOVER, PinSwipeFragment.this);
                } else
                {
                    _eduRunnable = EducationHelper.a(Placement.ANDROID_PIN_CLOSEUP_TAKEOVER, PinSwipeFragment.this);
                }
                if (isEntryPinDisplayed(pinswipeprofxevent.getPin()) && EducationHelper.i())
                {
                    if (!_flashlightButtonShown)
                    {
                        break label0;
                    }
                    Education.showDelayed(_eduRunnable, 0);
                }
                return;
            }
            _eduRunnableCreated = true;
        }

        public void onEventMainThread(com.pinterest.activity.pin.view.PinCloseupImageView.FlashlightSearchButtonDisplayedEvent flashlightsearchbuttondisplayedevent)
        {
            if (isEntryPinDisplayed(flashlightsearchbuttondisplayedevent.getPin()))
            {
                if (EducationHelper.i() && _eduRunnableCreated)
                {
                    Education.showDelayed(_eduRunnable, 0);
                }
                _flashlightButtonShown = true;
                Events.unregister(_eventsSubscriber, new Class[] {
                    com/pinterest/activity/pin/view/PinCloseupImageView$FlashlightSearchButtonDisplayedEvent
                });
            }
        }

        public void onEventMainThread(com.pinterest.activity.pin.view.PinCloseupImageView.FlashlightSearchButtonEvent flashlightsearchbuttonevent)
        {
            access$602.setDragEnabled(false);
        }

        public void onEventMainThread(com.pinterest.activity.pin.view.PinCloseupImageView.ImageLoadEvent imageloadevent)
        {
            if (imageloadevent.getPin() == null || imageloadevent.getPin().equals(_sourceFeed.get(
// JavaClassFileOutputException: get_constant: invalid tag

        public void onEventMainThread(com.pinterest.api.model.Pin.UpdateEvent updateevent)
        {
            if (updateevent.wasDeleted() && 
// JavaClassFileOutputException: get_constant: invalid tag

        _cls4()
        {
            this$0 = PinSwipeFragment.this;
            super();
        }

        private class PinSwipeProfXEvent
        {

            private Pin _pin;

            public Pin getPin()
            {
                return _pin;
            }

            public PinSwipeProfXEvent(Pin pin)
            {
                _pin = pin;
            }
        }

    }


    private class _cls5 extends FeedApiResponseHandler
    {

        final PinSwipeFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            onFailure(throwable, apiresponse);
            if (
// JavaClassFileOutputException: get_constant: invalid tag

        public void onFinish()
        {
            onFinish();
        }

        public void onStart()
        {
            onStart();
            if (
// JavaClassFileOutputException: get_constant: invalid tag

        public void onSuccess(Feed feed)
        {
            onSuccess(feed);
            if (
// JavaClassFileOutputException: get_constant: invalid tag

        _cls5()
        {
            this$0 = PinSwipeFragment.this;
            super();
        }
    }


    private class _cls2 extends android.support.v4.view.ModifiedViewPager.SimpleOnPageChangeListener
    {

        final PinSwipeFragment this$0;

        public void onPageSelected(int i)
        {
            Pinalytics.a(PinSwipeFragment.this);
        }

        _cls2()
        {
            this$0 = PinSwipeFragment.this;
            super();
        }
    }


    private class _cls3
        implements android.support.v4.view.ModifiedViewPager.PageTransformer
    {

        final PinSwipeFragment this$0;

        public void transformPage(View view, float f, boolean flag, int i)
        {
            float f1 = 1.0F;
            if (f >= -1F && f <= 1.0F) goto _L2; else goto _L1
_L1:
            f1 = 0.9F;
_L4:
            view.setScaleX(f1);
            view.setScaleY(f1);
            return;
_L2:
            if (f != 0.0F)
            {
                f1 = 1.0F - Math.abs(f) * 0.1F;
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        _cls3()
        {
            this$0 = PinSwipeFragment.this;
            super();
        }
    }

}
