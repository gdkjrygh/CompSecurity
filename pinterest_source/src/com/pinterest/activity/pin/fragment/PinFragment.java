// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.pinterest.activity.DialogHelper;
import com.pinterest.activity.commerce.util.BuyableProductHelper;
import com.pinterest.activity.flashlight.BottomSheetLayout;
import com.pinterest.activity.flashlight.FlashlightResultsFragment;
import com.pinterest.activity.map.GoogleServiceDialog;
import com.pinterest.activity.pin.view.PinCloseupAccessoryActionBar;
import com.pinterest.activity.pin.view.PinCloseupImageView;
import com.pinterest.activity.pin.view.PinCloseupView;
import com.pinterest.activity.pin.view.modules.PinCloseupGalleryModule;
import com.pinterest.activity.pin.view.modules.PinCloseupImageModule;
import com.pinterest.activity.task.event.BackEvent;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.adapter.PinGridAdapter;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Feed;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Constants;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.base.GooglePlayServices;
import com.pinterest.base.StopWatch;
import com.pinterest.education.EducationHelper;
import com.pinterest.experiment.Experiments;
import com.pinterest.fragment.PinGridFragment;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.DrawableUtils;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.ViewType;
import com.pinterest.ui.actionbar.ActionBar;
import com.pinterest.ui.grid.AdapterEmptyView;
import com.pinterest.ui.grid.PinterestGridView;
import com.pinterest.ui.text.BevelTitleDivider;
import java.util.ArrayList;
import java.util.List;

public class PinFragment extends PinGridFragment
{

    private static final int GLOBAL_PADDING = (int)Resources.dimension(0x7f0a016a);
    private final long FLOATING_ACTION_BAR_DELAY = 500L;
    private final int RELATED_PIN_DELAY_MS = (int)(Math.random() * 300D) + 1000;
    int _actionBarLocation[];
    private BottomSheetLayout _bottomSheetLayout;
    int _closeupImageLocation[];
    private boolean _didHideHeader;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private FlashlightResultsFragment _flashlightResultsFragment;
    private PinCloseupAccessoryActionBar _floatingSubActionBar;
    private Handler _handler;
    private boolean _hasPostedRelatedPinsEvent;
    private boolean _hasRepinnedPin;
    private boolean _hasViewedRelatedPins;
    private boolean _inFirstPinExperience;
    private boolean _isFlashlightShown;
    private boolean _modalShowing;
    private boolean _pendingHandler;
    protected Pin _pin;
    private PinCloseupView _pinVw;
    private int _positionOfInitiallyClickedPin;
    private BevelTitleDivider _relatedTitle;
    FrameLayout _rootVw;
    private boolean _timingCloseupBodyView;
    private boolean _timingRelatedPins;
    private android.view.ViewTreeObserver.OnPreDrawListener onPreDrawListener;
    protected com.pinterest.api.remote.PinApi.PinFeedApiResponse onRelatedPinsLoaded;

    public PinFragment()
    {
        _isFlashlightShown = false;
        _positionOfInitiallyClickedPin = -1;
        onPreDrawListener = new _cls3();
        _eventsSubscriber = new _cls4();
        onRelatedPinsLoaded = new _cls5(gridResponseHandler);
        _layoutId = 0x7f0300ef;
        _handler = new Handler();
        _reshowActionBar = false;
        ((PinGridAdapter)_adapter).setIsRelatedContent(true);
        setCutout(true);
        _inFirstPinExperience = EducationHelper.c();
        _actionBarLocation = new int[2];
        _closeupImageLocation = new int[2];
    }

    private void endAllViewTimers()
    {
        _pinVw.endView();
        endBodyViewTimers();
    }

    private void endBodyViewTimers()
    {
        endCloseupView();
        endRelatedView();
    }

    private void endCloseupView()
    {
        if (!_timingCloseupBodyView)
        {
            return;
        } else
        {
            Pinalytics.b(ViewType.PIN, ComponentType.PIN_CLOSEUP_BODY, _pin.getUid());
            _timingCloseupBodyView = false;
            return;
        }
    }

    private void endRelatedView()
    {
        if (!_timingRelatedPins)
        {
            return;
        } else
        {
            Pinalytics.b(ViewType.PIN, ComponentType.PIN_CLOSEUP_RELATED_PINS, _pin.getUid());
            _timingRelatedPins = false;
            return;
        }
    }

    private int getActionBarBottom()
    {
        _actionBarWrapper.getLocationOnScreen(_actionBarLocation);
        return ((_actionBarLocation[1] - Device.getStatusBarHeight()) + _actionBarWrapper.getHeight()) - ((android.widget.FrameLayout.LayoutParams)_actionBarWrapper.getLayoutParams()).bottomMargin;
    }

    private int getCloseupImageTop(PinCloseupImageView pincloseupimageview)
    {
        pincloseupimageview.getLocationOnScreen(_closeupImageLocation);
        return (_closeupImageLocation[1] - Device.getStatusBarHeight()) + (int)Resources.dimension(0x7f0a0186);
    }

    private List getRelatedPinsForHomefeedInsertion()
    {
        if (((PinGridAdapter)_adapter).getDataSource() == null || ((PinGridAdapter)_adapter).getDataSource().getItems().isEmpty())
        {
            return null;
        }
        ArrayList arraylist = new ArrayList();
        int j = Math.max(3, 5);
        for (int i = 0; i < j; i++)
        {
            Pin pin = (Pin)((PinGridAdapter)_adapter).getDataSource().get(i);
            if (pin != null)
            {
                arraylist.add(pin);
            }
        }

        return arraylist;
    }

    private void onLoginClicked()
    {
        Pinalytics.a(ElementType.LOGIN_BUTTON, ComponentType.NAVIGATION);
        DialogHelper.goLogin();
    }

    private void scrollToHideHeader()
    {
        while (_didHideHeader || _inFirstPinExperience || _gridVw == null || !_gridVw.canScroll() || _actionBarWrapper == null) 
        {
            return;
        }
        _gridVw.scrollTo(0, Constants.ACTIONBAR_HEIGHT);
        _actionBarWrapper.setTranslationY(Math.max(-Constants.ACTIONBAR_HEIGHT, -_gridVw.getScrolledY()));
        _didHideHeader = true;
        updateViewTimers();
    }

    private boolean shouldInsertRelatedPinsIntoHomefeed()
    {
        return !_hasViewedRelatedPins && !_hasPostedRelatedPinsEvent && _positionOfInitiallyClickedPin != -1 && !_pin.getIsDynamicallyInserted() && _hasRepinnedPin && Experiments.W();
    }

    private void startCloseupView()
    {
        if (_timingCloseupBodyView || _pin == null)
        {
            return;
        } else
        {
            Pinalytics.a(ViewType.PIN, ComponentType.PIN_CLOSEUP_BODY, _pin.getUid());
            Events.register(_eventsSubscriber, com/pinterest/activity/task/model/Navigation, new Class[] {
                com/pinterest/activity/task/event/DialogEvent
            });
            _timingCloseupBodyView = true;
            return;
        }
    }

    private void startRelatedView()
    {
        if (_timingRelatedPins || _pin == null)
        {
            return;
        } else
        {
            Pinalytics.a(ViewType.PIN, ComponentType.PIN_CLOSEUP_RELATED_PINS, _pin.getUid());
            _timingRelatedPins = true;
            return;
        }
    }

    private void updateFlashlightButtonPosition()
    {
        if (_pinVw == null || getView() == null) goto _L2; else goto _L1
_L1:
        if (_pinVw.getCloseupImageModule() == null) goto _L4; else goto _L3
_L3:
        PinCloseupImageView pincloseupimageview = _pinVw.getCloseupImageModule().getCloseupImageView();
_L6:
        if (pincloseupimageview != null)
        {
            ImageView imageview = pincloseupimageview.getFlashlightButton();
            if (imageview != null)
            {
                int i = getActionBarBottom();
                int j = getCloseupImageTop(pincloseupimageview);
                float f = imageview.getY();
                if (j < i)
                {
                    i -= j;
                    if (imageview.getHeight() + i < pincloseupimageview.getHeight())
                    {
                        f = i;
                    }
                } else
                {
                    f = 0.0F;
                }
                imageview.setY(f);
            }
        }
_L2:
        return;
_L4:
        if (_pinVw.getCloseupGalleryModule() == null) goto _L2; else goto _L5
_L5:
        pincloseupimageview = _pinVw.getCloseupGalleryModule().getCurrentView();
          goto _L6
    }

    private void updateFloatingBarState()
    {
        int i = 0x7f0f04b8;
        int k = 0x7f0f0305;
        int j = 0;
        PinCloseupAccessoryActionBar pincloseupaccessoryactionbar;
        if (getView() != null && _floatingSubActionBar != null && _pinVw != null)
        {
            if ((pincloseupaccessoryactionbar = _pinVw.getAccessoryActionBar()) != null)
            {
                int ai[] = new int[2];
                pincloseupaccessoryactionbar.getLocationOnScreen(ai);
                int ai1[] = new int[2];
                _floatingSubActionBar.getLocationOnScreen(ai1);
                int l;
                byte byte0;
                if (ai[1] < ai1[1] && !_inFirstPinExperience && !EducationHelper.d())
                {
                    byte0 = 8;
                    l = 0;
                } else
                {
                    l = 0x7f0f0305;
                    byte0 = 0;
                    k = 0;
                    j = 0x7f0f04b8;
                    i = 0;
                }
                _floatingSubActionBar.setVisibility(byte0);
                if (_floatingSubActionBar.getPinItButton() != null)
                {
                    _floatingSubActionBar.getPinItButton().setId(l);
                    _floatingSubActionBar.getBuyItButton().setId(j);
                }
                if (_pinVw.getAccessoryActionBar().getPinItButton() != null)
                {
                    _pinVw.getAccessoryActionBar().getPinItButton().setId(k);
                    _pinVw.getAccessoryActionBar().getBuyItButton().setId(i);
                }
                if (EducationHelper.d() || EducationHelper.k())
                {
                    Events.post(new com.pinterest.activity.task.education.view.EducationContainerView.PositionPulsarEvent());
                    return;
                }
            }
        }
    }

    private void updateView()
    {
        if (_pin != null)
        {
            if (_pinVw != null)
            {
                _pinVw.setPin(_pin);
            }
            if (_floatingSubActionBar != null && _pinVw != null)
            {
                _floatingSubActionBar.setPin(_pin, _pinVw.detailsLoaded());
                return;
            }
        }
    }

    private void updateViewTimers()
    {
        boolean flag = false;
        if (_active && _pinVw != null && !_modalShowing && !_isFlashlightShown) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        if (_floatingSubActionBar != null)
        {
            Object obj = _pinVw;
            int ai[];
            int ai1[];
            int j;
            if (_floatingSubActionBar.getVisibility() == 0)
            {
                i = _floatingSubActionBar.getMeasuredHeight();
            } else
            {
                i = 0;
            }
            ((PinCloseupView) (obj)).checkForCardBeginView(i);
        }
        obj = _pinVw.getAccessoryActionBar();
        if (obj == null) goto _L1; else goto _L3
_L3:
        ai1 = new int[2];
        ((View) (obj)).getLocationOnScreen(ai1);
        if (ai1[1] > 0)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0 && !_timingCloseupBodyView)
        {
            startCloseupView();
        } else
        if (i == 0 && _timingCloseupBodyView)
        {
            endCloseupView();
        }
        if (_relatedTitle == null || _relatedTitle.getVisibility() == 8) goto _L1; else goto _L4
_L4:
        ai = new int[2];
        _relatedTitle.getLocationOnScreen(ai);
        j = _relatedTitle.getMeasuredHeight();
        i = ((flag) ? 1 : 0);
        if ((float)(ai[1] + j) < Device.getScreenHeight())
        {
            i = 1;
        }
        if (i != 0)
        {
            _hasViewedRelatedPins = true;
        }
        if (i != 0 && !_timingRelatedPins)
        {
            startRelatedView();
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (i != 0 || !_timingRelatedPins) goto _L1; else goto _L5
_L5:
        endRelatedView();
        return;
    }

    public FlashlightResultsFragment getFlashlightResultsFragment()
    {
        if (_flashlightResultsFragment != null)
        {
            return _flashlightResultsFragment;
        } else
        {
            return (FlashlightResultsFragment)getChildFragmentManager().findFragmentByTag("flashlight_results_fragment");
        }
    }

    public Pin getPin()
    {
        return _pin;
    }

    public boolean isFlashlightShown()
    {
        return _isFlashlightShown;
    }

    protected void loadData()
    {
        if (MyUser.hasAccessToken() && _active && !_pendingHandler && _adapter != null && ((PinGridAdapter)_adapter).getCount() == 0 && !((PinGridAdapter)_adapter).isLoading())
        {
            if (_inFirstPinExperience || EducationHelper.d() || EducationHelper.k() && BuyableProductHelper.isPinBuyable(_pin))
            {
                if (_gridVw != null)
                {
                    _gridVw.getEmptyView().setState(2);
                    return;
                }
            } else
            {
                _pendingHandler = true;
                _handler.postDelayed(new _cls6(), RELATED_PIN_DELAY_MS);
                return;
            }
        }
    }

    protected void onActivate()
    {
        super.onActivate();
        Events.register(_eventsSubscriber, com/pinterest/api/model/Pin$UpdateEvent, new Class[] {
            com/pinterest/activity/task/model/Navigation, com/pinterest/activity/task/event/DialogEvent, com/pinterest/activity/pin/view/PinCloseupImageView$FlashlightSearchButtonEvent, com/pinterest/activity/flashlight/FlashlightResultsFragment$FlashlightCloseButtonEvent, com/pinterest/activity/pin/view/PinFlashlightCropView$PinCloseupImageViewResizeEvent, com/pinterest/api/model/Pin$PinRepinEvent
        });
        if (!_isFlashlightShown) goto _L2; else goto _L1
_L1:
        FlashlightResultsFragment flashlightresultsfragment = getFlashlightResultsFragment();
        if (flashlightresultsfragment != null)
        {
            flashlightresultsfragment.onPinFragmentActivate();
        }
_L4:
        loadData();
        return;
_L2:
        if (_didHideHeader)
        {
            updateViewTimers();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean onBackPressed()
    {
        if (_isFlashlightShown)
        {
            Events.post(new com.pinterest.activity.flashlight.FlashlightResultsFragment.FlashlightCloseButtonEvent());
            return true;
        } else
        {
            return super.onBackPressed();
        }
    }

    protected void onDeactivate()
    {
        if (shouldInsertRelatedPinsIntoHomefeed())
        {
            _hasPostedRelatedPinsEvent = true;
            List list = getRelatedPinsForHomefeedInsertion();
            if (list != null)
            {
                Events.post(new RelatedPinsLoadedEvent(list, _pin));
            }
        }
        StopWatch.get().invalidate("pin_closeup").invalidate("clickthrough_verify");
        _handler.removeCallbacksAndMessages(null);
        _pendingHandler = false;
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/api/model/Pin$UpdateEvent, com/pinterest/activity/task/model/Navigation, com/pinterest/activity/task/event/BackEvent, com/pinterest/activity/task/event/DialogEvent, com/pinterest/activity/pin/view/PinCloseupImageView$FlashlightSearchButtonEvent, com/pinterest/activity/flashlight/FlashlightResultsFragment$FlashlightCloseButtonEvent, com/pinterest/api/model/Pin$PinRepinEvent
        });
        if (_isFlashlightShown)
        {
            FlashlightResultsFragment flashlightresultsfragment = getFlashlightResultsFragment();
            if (flashlightresultsfragment != null)
            {
                flashlightresultsfragment.onPinFragmentDeactivate();
            }
        } else
        {
            endAllViewTimers();
        }
        super.onDeactivate();
    }

    public void onDestroy()
    {
        onPreDrawListener = null;
        super.onDestroy();
    }

    public void onDestroyView()
    {
        if (_gridVw != null)
        {
            _gridVw.getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
        }
        Events.unregister(_eventsSubscriber);
        _pinVw = null;
        _handler.removeCallbacksAndMessages(null);
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        Experiments.a("android_experiment_v2_closeup_test");
        _pinVw = new PinCloseupView(view.getContext());
        _pinVw.setApiTag(getApiTag());
        _pinVw.setFragmentManager(getChildFragmentManager());
        _gridVw.addHeaderView(_pinVw, -1, -2, 0, Constants.MARGIN);
        _relatedTitle = new BevelTitleDivider(view.getContext());
        long l;
        if (!_pin.isCSR())
        {
            _relatedTitle.setText(0x7f070492);
        } else
        {
            _relatedTitle.setText(Resources.string(0x7f0701ba, new Object[] {
                _pin.getDomain()
            }));
        }
        _gridVw.addHeaderView(_relatedTitle);
        _relatedTitle.setVisibility(8);
        if (_inFirstPinExperience)
        {
            l = 0L;
        } else
        {
            l = 500L;
        }
        view.postDelayed(new _cls1(), l);
        updateView();
        if (_pin != null && _pin.getHasPlace() == Boolean.TRUE && !GooglePlayServices.isAvailable())
        {
            GoogleServiceDialog.show();
        }
        _gridVw.addListener(new _cls2());
        _gridVw.getViewTreeObserver().addOnPreDrawListener(onPreDrawListener);
        DrawableUtils.tintToolbarIcons(_actionBar, 0x7f0e006d);
        if (_inFirstPinExperience || EducationHelper.d())
        {
            _pinVw.getAccessoryActionBar().setVisibility(4);
        }
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        _pin = navigation.getModelAsPin();
    }

    public void setPositionOfInitiallyClickedPin(int i)
    {
        _positionOfInitiallyClickedPin = i;
    }




/*
    static PinCloseupAccessoryActionBar access$002(PinFragment pinfragment, PinCloseupAccessoryActionBar pincloseupaccessoryactionbar)
    {
        pinfragment._floatingSubActionBar = pincloseupaccessoryactionbar;
        return pincloseupaccessoryactionbar;
    }

*/



/*
    static boolean access$1002(PinFragment pinfragment, boolean flag)
    {
        pinfragment._modalShowing = flag;
        return flag;
    }

*/




/*
    static boolean access$1202(PinFragment pinfragment, boolean flag)
    {
        pinfragment._isFlashlightShown = flag;
        return flag;
    }

*/



/*
    static BottomSheetLayout access$1302(PinFragment pinfragment, BottomSheetLayout bottomsheetlayout)
    {
        pinfragment._bottomSheetLayout = bottomsheetlayout;
        return bottomsheetlayout;
    }

*/



/*
    static boolean access$1502(PinFragment pinfragment, boolean flag)
    {
        pinfragment._hasRepinnedPin = flag;
        return flag;
    }

*/










/*
    static boolean access$2302(PinFragment pinfragment, boolean flag)
    {
        pinfragment._pendingHandler = flag;
        return flag;
    }

*/









    private class _cls4
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final PinFragment this$0;

        private void animateFlashlightViewsExit(final View pinCloseupImage, float f)
        {
            final ViewPropertyAnimator propertyAnimator = _bottomSheetLayout.getContentView().animate().y(f).setDuration(Constants.ANIM_SPEED_NORMAL);
            propertyAnimator.setListener(new _cls3());
            class _cls4
                implements Runnable
            {

                final _cls4 this$1;

                public void run()
                {
                    FragmentManager fragmentmanager = getChildFragmentManager();
                    FragmentTransaction fragmenttransaction = fragmentmanager.beginTransaction();
                    fragmenttransaction.remove(fragmentmanager.findFragmentByTag("flashlight_results_fragment"));
                    fragmenttransaction.commit();
                    if (_didHideHeader)
                    {
                        updateViewTimers();
                    }
                    Events.post(new com.pinterest.activity.task.view.MainViewPager.ControlEvent(1));
                }

                _cls4()
                {
                    this$1 = _cls4.this;
                    Object();
                }
            }

            _bottomSheetLayout.dismissSheet(new _cls4());
        }

        private void setupViewsForExitAnimation(View view)
        {
            view.setVisibility(4);
            _floatingSubActionBar.setTranslationY(_floatingSubActionBar.getHeight());
            .setTranslationY(.getHeight() * -1);
            view = (ScrollView)_bottomSheetLayout.getContentView().findViewById(0x7f0f01d8);
            PinFlashlightCropView pinflashlightcropview = (PinFlashlightCropView)view.getChildAt(0);
            pinflashlightcropview.hidePulsarsIfShown();
            view.getLayoutParams().height = pinflashlightcropview.getMeasuredHeight() + (int)Resources.dimension(0x7f0a018a) * 2;
            _bottomSheetLayout.getContentView().setBackgroundColor(0);
            pinflashlightcropview.setFlashlightCropperMoveListener(null);
            pinflashlightcropview.setShowCropWindow(false);
        }

        private void updateScrollViewDimensions(ScrollView scrollview, float f)
        {
            int i = FlashlightAnimationUtils.getCloseupImagePadding();
            scrollview.setPadding(i, scrollview.getPaddingTop(), i, 0);
            android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)scrollview.getLayoutParams();
            layoutparams.height = (int)f;
            scrollview.setLayoutParams(layoutparams);
        }

        public void onEventMainThread(com.pinterest.activity.flashlight.FlashlightResultsFragment.FlashlightCloseButtonEvent flashlightclosebuttonevent)
        {
            while (!_isFlashlightShown || _bottomSheetLayout == null || _pinVw == null) 
            {
                return;
            }
            float f;
            float f1;
            int ai[];
            if (_pinVw.getCloseupImageModule() != null)
            {
                flashlightclosebuttonevent = _pinVw.getCloseupImageModule();
            } else
            {
                flashlightclosebuttonevent = _pinVw.getCloseupGalleryModule();
            }
            ai = new int[2];
            flashlightclosebuttonevent.getLocationOnScreen(ai);
            f = ai[1] - Device.getStatusBarHeight();
            f1 = Resources.dimension(0x7f0a0187);
            setupViewsForExitAnimation(flashlightclosebuttonevent);
            animateFlashlightViewsExit(flashlightclosebuttonevent, f + f1);
            Pinalytics.a(PinFragment.this);
            _isFlashlightShown = false;
        }

        public void onEventMainThread(com.pinterest.activity.pin.view.PinCloseupImageView.FlashlightSearchButtonEvent flashlightsearchbuttonevent)
        {
            if (!_isFlashlightShown && _pinVw != null && getView() != null)
            {
                if (_pinVw.getCloseupImageModule() != null)
                {
                    flashlightsearchbuttonevent = _pinVw.getCloseupImageModule().getCloseupImageView();
                } else
                {
                    flashlightsearchbuttonevent = _pinVw.getCloseupGalleryModule().getCurrentView();
                }
                _bottomSheetLayout = FlashlightAnimationUtils.animateFlashlightEntrance(getView().getContext(), flashlightsearchbuttonevent, _pin, getChildFragmentManager());
                if (_bottomSheetLayout != null)
                {
                    View.inflate(getView().getContext(), 0x7f0300a2, _rootVw);
                    _rootVw.addView(_bottomSheetLayout);
                    class _cls2
                        implements Runnable
                    {

                        final _cls4 this$1;

                        public void run()
                        {
                            View view = _bottomSheetLayout.getSheetView().findViewById(0x7f0f0259);
                            _bottomSheetLayout.setHorizontallyScrollableView(view);
                        }

                _cls2()
                {
                    this$1 = _cls4.this;
                    super();
                }
                    }

                    flashlightsearchbuttonevent = new _cls2();
                    _bottomSheetLayout.getSheetView().post(flashlightsearchbuttonevent);
                    endAllViewTimers();
                    Events.post(new com.pinterest.activity.task.view.MainViewPager.ControlEvent(0));
                    _isFlashlightShown = true;
                    return;
                }
            }
        }

        public void onEventMainThread(com.pinterest.activity.pin.view.PinFlashlightCropView.PinCloseupImageViewResizeEvent pincloseupimageviewresizeevent)
        {
            if (_isFlashlightShown && _bottomSheetLayout != null && pincloseupimageviewresizeevent.getPin().equals(_pin))
            {
                pincloseupimageviewresizeevent = (LinearLayout)_bottomSheetLayout.getContentView();
                ScrollView scrollview = (ScrollView)pincloseupimageviewresizeevent.findViewById(0x7f0f01d8);
                PinFlashlightCropView pinflashlightcropview = (PinFlashlightCropView)scrollview.getChildAt(0);
                float f = FlashlightAnimationUtils.getScrollViewDesiredHeight(pinflashlightcropview);
                updateScrollViewDimensions(scrollview, f);
                float f1 = Device.getScreenHeight();
                float f2 = Constants.MARGIN;
                _bottomSheetLayout.setPeekSheetTranslation(f1 - f - f2 * 1.25F);
                _bottomSheetLayout.peekSheet();
                int i = (int)Resources.dimension(0x7f0a018a);
                pincloseupimageviewresizeevent.getLayoutParams().height = i * 2 + pinflashlightcropview.getHeight();
            }
        }

        public void onEventMainThread(BackEvent backevent)
        {
            if (backevent.isModalPopped())
            {
                Events.unregister(_eventsSubscriber, new Class[] {
                    com/pinterest/activity/task/event/BackEvent
                });
                _modalShowing = false;
                updateViewTimers();
            }
        }

        public void onEventMainThread(DialogEvent dialogevent)
        {
            dialogevent = dialogevent.getDialog();
            if (dialogevent == null)
            {
                return;
            } else
            {
                endBodyViewTimers();
                class _cls1
                    implements com.pinterest.activity.task.dialog.BaseDialog.OnDismissListener
                {

                    final _cls4 this$1;

                    public void onDismiss(BaseDialog basedialog)
                    {
                        updateViewTimers();
                    }

                _cls1()
                {
                    this$1 = _cls4.this;
                    super();
                }
                }

                dialogevent.addOnDismissListener(new _cls1());
                return;
            }
        }

        public void onEventMainThread(Navigation navigation)
        {
            while (navigation == null || navigation.getDisplayMode() != com.pinterest.activity.task.model.Navigation.DisplayMode.MODAL) 
            {
                return;
            }
            Events.register(_eventsSubscriber, com/pinterest/activity/task/event/BackEvent, new Class[0]);
            _modalShowing = true;
            endBodyViewTimers();
        }

        public void onEventMainThread(com.pinterest.api.model.Pin.PinRepinEvent pinrepinevent)
        {
            if (_pin != null && pinrepinevent.getPin() != null && pinrepinevent.getPin().equals(_pin))
            {
                _hasRepinnedPin = true;
            }
        }

        public void onEventMainThread(com.pinterest.api.model.Pin.UpdateEvent updateevent)
        {
            updateevent = updateevent.getPin();
            if (updateevent.equals(_pin))
            {
                updateViewTimers();
                updateFloatingBarState();
                if (_floatingSubActionBar != null && _pinVw != null)
                {
                    _floatingSubActionBar.setPin(updateevent, _pinVw.detailsLoaded());
                    return;
                }
            }
        }

        _cls4()
        {
            this$0 = PinFragment.this;
            super();
        }
    }


    private class _cls5 extends com.pinterest.api.remote.PinApi.PinFeedApiResponse
    {

        final PinFragment this$0;

        public void onSuccess(Feed feed)
        {
label0:
            {
                super.onSuccess(feed);
                if (_relatedTitle != null)
                {
                    if (feed == null || feed.getCount() <= 0 || _pinVw == null)
                    {
                        break label0;
                    }
                    _relatedTitle.setVisibility(0);
                }
                return;
            }
            _relatedTitle.setVisibility(8);
        }

        _cls5(FeedApiResponseHandler feedapiresponsehandler)
        {
            this$0 = PinFragment.this;
            super(feedapiresponsehandler);
        }
    }



    private class RelatedPinsLoadedEvent
    {

        private Pin _pin;
        private List _relatedPins;

        public Pin getPin()
        {
            return _pin;
        }

        public List getRelatedPins()
        {
            return _relatedPins;
        }

        public RelatedPinsLoadedEvent(List list, Pin pin)
        {
            _relatedPins = list;
            _pin = pin;
        }
    }


    private class _cls1
        implements Runnable
    {

        final PinFragment this$0;

        public void run()
        {
            Object obj = getView();
            if (obj == null)
            {
                return;
            } else
            {
                _floatingSubActionBar = new PinCloseupAccessoryActionBar(((View) (obj)).getContext());
                obj = new LayoutParams(-1, Constants.ACTIONBAR_HEIGHT);
                obj.gravity = 80;
                _floatingSubActionBar.setPin(_pin, _pinVw.detailsLoaded());
                _floatingSubActionBar.setVisibility(4);
                _floatingSubActionBar.setTranslationY(Constants.ACTIONBAR_HEIGHT);
                ObjectAnimator objectanimator = ObjectAnimator.ofFloat(_floatingSubActionBar, "translationY", new float[] {
                    0.0F
                });
                objectanimator.setInterpolator(new DecelerateInterpolator());
                objectanimator.setDuration(200L);
                objectanimator.start();
                _rootVw.addView(_floatingSubActionBar, ((android.view.ViewGroup.LayoutParams) (obj)));
                class _cls1
                    implements Runnable
                {

                    final _cls1 this$1;

                    public void run()
                    {
                        updateViewTimers();
                        updateFloatingBarState();
                    }

                _cls1()
                {
                    this$1 = _cls1.this;
                    Object();
                }
                }

                _floatingSubActionBar.post(new _cls1());
                return;
            }
        }

        _cls1()
        {
            this$0 = PinFragment.this;
            super();
        }
    }


    private class _cls2 extends com.pinterest.ui.scrollview.ObservableScrollView.ScrollViewListener
    {

        final PinFragment this$0;

        public void onScroll(View view, int i, int j, int k, int l)
        {
            updateViewTimers();
            updateFloatingBarState();
            updateFlashlightButtonPosition();
        }

        _cls2()
        {
            this$0 = PinFragment.this;
            super();
        }
    }

}
