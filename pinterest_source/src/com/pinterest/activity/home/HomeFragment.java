// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.URLUtil;
import com.google.gson.JsonPrimitive;
import com.pinterest.activity.commerce.model.StatementCreditExtraData;
import com.pinterest.activity.commerce.view.CommerceStatementCreditFeedHeroView;
import com.pinterest.activity.home.util.HomefeedBuilderData;
import com.pinterest.activity.home.view.HomefeedBuilderIcon;
import com.pinterest.activity.task.event.ToastEvent;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.toast.PinFromClipboardToast;
import com.pinterest.adapter.PinGridAdapter;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.analytics.scrollperf.ScrollPerfAutoCollector;
import com.pinterest.analytics.scrollperf.ScrollPerfCollector;
import com.pinterest.analytics.scrollperf.ScrollPerfTrackerConfig;
import com.pinterest.api.BaseApiResponseHandler;
import com.pinterest.api.remote.HomefeedApi;
import com.pinterest.api.remote.MyUserApi;
import com.pinterest.base.Application;
import com.pinterest.base.Constants;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.education.EducationHelper;
import com.pinterest.experience.ExperienceValue;
import com.pinterest.experience.Experiences;
import com.pinterest.experiment.Experiments;
import com.pinterest.fragment.PinGridFragment;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.data.DiskCache;
import com.pinterest.kit.utils.DrawableUtils;
import com.pinterest.schemas.experiences.Experience;
import com.pinterest.schemas.experiences.Placement;
import com.pinterest.ui.grid.PinterestGridView;
import com.pinterest.ui.megaphone.BaseNagEvent;
import com.pinterest.ui.megaphone.HomeFeedMegaphoneEvent;
import com.pinterest.ui.megaphone.MegaphoneView;
import com.pinterest.ui.megaphone.NagHideAndUpdateEvent;
import com.pinterest.ui.megaphone.NagUtils;
import java.io.File;
import java.util.ArrayList;
import org.apache.commons.lang3.StringUtils;

public class HomeFragment extends PinGridFragment
{

    private static final int DEFAULT_TOAST_DELAY = 500;
    private static final int SCROLL_STATE_IDLE_THRESHOLD = 1;
    private static final int WAITTIME_FEED = 3000;
    private BaseApiResponseHandler _dynamicPinsHandler;
    private Runnable _eduRunnable;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    Runnable _finishFeedRunnable;
    private boolean _firstLoad;
    private Handler _handler;
    protected com.pinterest.api.remote.PinApi.HomePinFeedApiResponseHandler _homeFeedHandler;
    protected boolean _relatedPinsLoaded;
    private ScrollPerfAutoCollector _scrollPerfCollector;

    public HomeFragment()
    {
        _firstLoad = true;
        _relatedPinsLoaded = false;
        _eventsSubscriber = new _cls3();
        _dynamicPinsHandler = new _cls4();
        _homeFeedHandler = new _cls6(gridResponseHandler);
        _finishFeedRunnable = new _cls7();
        _movingSpeed = 0.0F;
        _layoutId = 0x7f0300d2;
        _placementId = Experiences.a;
        _emptyMessage = Resources.string(0x7f0702bf);
        _handler = new Handler(Looper.getMainLooper());
    }

    private void navigateUri(String s)
    {
        Location.navigateUri(getActivity(), s);
    }

    private void pollHomeFeedReady()
    {
        if (isActive())
        {
            _handler.postDelayed(_finishFeedRunnable, 1500L);
        }
    }

    private void setViewToScreenHeight(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        layoutparams.height = (int)Device.getScreenHeight() - Constants.ACTIONBAR_HEIGHT;
        view.setLayoutParams(layoutparams);
    }

    private void showPinFromClipboardToast()
    {
        String s = Device.getClipboard();
        if (URLUtil.isValidUrl(s) && PinFromClipboardToast.shouldPrompt(s))
        {
            Events.postDelayed(new ToastEvent(new PinFromClipboardToast(s)), 500L);
        }
    }

    private void submitHomefeedBuilderData()
    {
        final HomefeedBuilderData data = HomefeedBuilderData.get();
        if (_swipeVw != null)
        {
            _swipeVw.setRefreshing(true);
        }
        Application.showToast(Resources.string(0x7f0702ef));
        HomefeedApi.a(new _cls8(), new ArrayList(data.getFollowedInterestUids()), new ArrayList(data.getUnfollowedInterestUids()), getApiTag());
    }

    protected void initAdapter()
    {
        setCompactCells(true);
    }

    protected void loadData()
    {
        MyUserApi.a(getApiTag());
        if (!_firstLoad)
        {
            loadNetworkData();
            return;
        }
        final StopWatch sw = StopWatch.get();
        sw.putAuxData("ttrfp_tmp_log", "sts_hf_fsize_pre_read", new JsonPrimitive(new Long(DiskCache.getCacheFile("MY_HOME_FEED").length()))).startSubWatch("ttrfp_tmp_log", "du_40_read_disk");
        final String cachedFeedString = DiskCache.getJsonString("MY_HOME_FEED");
        sw.stopSubWatch("ttrfp_tmp_log", "du_40_read_disk");
        if (StringUtils.isEmpty(cachedFeedString))
        {
            sw.logTimeStamp("ttrfp_tmp_log", "ts_40_hf_read_disk_post").putAuxData("ttrfp_tmp_log", "sts_41_hf_read_disk_post", StopWatch.TTRFP_LOG_FAILURE);
            loadNetworkData();
            return;
        } else
        {
            sw.putAuxData("ttrfp_tmp_log", "sts_41_hf_read_disk_post", StopWatch.TTRFP_LOG_SUCCESS).startSubWatch("ttrfp_tmp_log", "du_40_hf_obj_creation");
            (new _cls5()).execute();
            return;
        }
    }

    protected void loadNetworkData()
    {
        StopWatch.get().startSubWatch("ttrfp_tmp_log", "du_42_load_hf_from_net");
        MyUserApi.a(_homeFeedHandler, null, getApiTag());
    }

    protected void onActivate()
    {
        super.onActivate();
        if (_gridVw != null && ((float)_gridVw.getScrollY() <= Resources.dimension(0x7f0a000a) || HomefeedBuilderData.get().hasFollowedOrUnfollowed()) && _adapter != null && ((PinGridAdapter)_adapter).getCount() > 0)
        {
            if (_relatedPinsLoaded)
            {
                _relatedPinsLoaded = false;
            } else
            {
                if (HomefeedBuilderData.get().hasFollowedOrUnfollowed())
                {
                    submitHomefeedBuilderData();
                    _gridVw.setScrollY(0);
                    return;
                }
                if (!_refreshing && !((PinGridAdapter)_adapter).isLoading())
                {
                    refresh();
                    return;
                }
            }
        }
    }

    protected void onDeactivate()
    {
        EducationHelper.a(_eduRunnable);
        super.onDeactivate();
    }

    public void onDestroyView()
    {
        _nagView = null;
        Events.post(new com.pinterest.kit.utils.GifDecoder.CancelGifDecodeTaskEvent());
        super.onDestroyView();
        Events.unregister(_eventsSubscriber);
        ScrollPerfCollector.a(_scrollPerfCollector);
        _scrollPerfCollector = null;
    }

    public void onPause()
    {
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/api/model/User$UpdateEvent, com/pinterest/activity/nux/fragment/NUXEndScreenFragment$NUXCompletedEvent, com/pinterest/ui/grid/PinGridCell$ImageLoadEvent, com/pinterest/ui/megaphone/BaseNagEvent, com/pinterest/activity/nux/fragment/NUXEndScreenFragment$UndoRebuildFeedEvent, com/pinterest/ui/megaphone/NagHideAndUpdateEvent, com/pinterest/ui/megaphone/HomeFeedMegaphoneEvent, com/pinterest/activity/task/education/view/EducationToolTipView$StartLibraryEvent, com/pinterest/activity/task/education/view/EducationContainerView$ShowShareExtensionEvent, com/pinterest/activity/pin/fragment/PinFragment$RelatedPinsLoadedEvent, 
            com/pinterest/ui/feedback/PinFeedbackRelated$RemoveRelatedPinsEvent
        });
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        Events.register(_eventsSubscriber, com/pinterest/api/model/User$UpdateEvent, new Class[] {
            com/pinterest/activity/nux/fragment/NUXEndScreenFragment$NUXCompletedEvent, com/pinterest/ui/grid/PinGridCell$ImageLoadEvent, com/pinterest/ui/megaphone/BaseNagEvent, com/pinterest/activity/nux/fragment/NUXEndScreenFragment$UndoRebuildFeedEvent, com/pinterest/ui/megaphone/NagHideAndUpdateEvent, com/pinterest/activity/task/education/view/EducationToolTipView$StartLibraryEvent, com/pinterest/activity/task/education/view/EducationContainerView$ShowShareExtensionEvent, com/pinterest/activity/pin/fragment/PinFragment$RelatedPinsLoadedEvent, com/pinterest/ui/feedback/PinFeedbackRelated$RemoveRelatedPinsEvent
        });
        Events.registerSticky(_eventsSubscriber, com/pinterest/ui/megaphone/HomeFeedMegaphoneEvent, new Class[0]);
        NagUtils.showNag(getPlacementId(), new BaseNagEvent(), 0x7f060009);
        showPinFromClipboardToast();
    }

    public void onViewCreated(final View expValue, Bundle bundle)
    {
        StopWatch.get().logTimeStamp("ttrfp_tmp_log", "ts_30_hf_on_view_created");
        super.onViewCreated(expValue, bundle);
        initAdapter();
        _actionBar.setLogo(DrawableUtils.tintIcon(0x7f0201aa, 0x7f0e009c));
        _actionBar.setNavigationIcon(null);
        expValue = Experiences.a(String.valueOf(Placement.ANDROID_GLOBAL_NAG.getValue()));
        if (expValue != null && ((ExperienceValue) (expValue)).b == Experience.ANDROID_STATEMENT_CREDIT_HOME_FEED.getValue())
        {
            expValue.d();
            bundle = new StatementCreditExtraData(((ExperienceValue) (expValue)).g);
            final CommerceStatementCreditFeedHeroView feedStatementCredit = new CommerceStatementCreditFeedHeroView(getContext());
            feedStatementCredit.bind(bundle);
            _gridVw.addHeaderView(feedStatementCredit);
            feedStatementCredit.setUserActionListener(new _cls1());
        }
        if (Experiments.y())
        {
            _gridVw.addHeaderView(new HomefeedBuilderIcon(getActivity()));
        }
        _nagView = (MegaphoneView)_gridVw.addHeaderView(0x7f03017d);
        Experiments.a("android_experiment_v2_test");
        if (_gridVw != null)
        {
            _scrollPerfCollector = ScrollPerfAutoCollector.a(_gridVw, ScrollPerfTrackerConfig.f);
        }
        _gridVw.addListener(new _cls2());
    }















/*
    static boolean access$2002(HomeFragment homefragment, boolean flag)
    {
        homefragment._firstLoad = flag;
        return flag;
    }

*/




/*
    static Runnable access$2302(HomeFragment homefragment, Runnable runnable)
    {
        homefragment._eduRunnable = runnable;
        return runnable;
    }

*/










    private class _cls3
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final HomeFragment this$0;

        private String getContentIdsString(List list)
        {
            StringBuilder stringbuilder = new StringBuilder();
            for (list = list.iterator(); list.hasNext(); stringbuilder.append(PStringUtils.format("pin:%s|", new Object[] {
        ((Pin)(Model)list.next()).getUid()
    }))) { }
            if (stringbuilder.length() > 0)
            {
                stringbuilder.deleteCharAt(stringbuilder.length() - 1);
            }
            return stringbuilder.toString();
        }

        private DynamicStory getDynamicStoryForPins(List list, int i)
        {
            DynamicStory dynamicstory = new DynamicStory(null, ModelHelper.defaultCacheExpirationDate(), "story", RandomStringUtils.randomAlphanumeric(8), "related_pins", com.pinterest.api.model.DynamicStory.ContainerType.CAROUSEL.toString(), Boolean.valueOf(false), new String(), null, getContentIdsString(list), Integer.valueOf(i));
            dynamicstory.setObjects(list);
            dynamicstory.setTitle(new DynamicTitle(Resources.string(0x7f070492)));
            dynamicstory.setIsClientGenerated(true);
            dynamicstory.setDisplayOption(new DynamicDisplayOption(Boolean.valueOf(false), Boolean.valueOf(false), Integer.valueOf(-1)));
            return dynamicstory;
        }

        public void onEventMainThread(com.pinterest.activity.nux.fragment.NUXEndScreenFragment.NUXCompletedEvent nuxcompletedevent)
        {
            PLog.info("NUXCompletedEvent", new Object[0]);
            refresh();
        }

        public void onEventMainThread(com.pinterest.activity.nux.fragment.NUXEndScreenFragment.UndoRebuildFeedEvent undorebuildfeedevent)
        {
            .setRefreshing(true);
            InterestsApi.b(new _cls3(), getApiTag());
        }

        public void onEventMainThread(com.pinterest.activity.pin.fragment.PinFragment.RelatedPinsLoadedEvent relatedpinsloadedevent)
        {
            Feed feed = ((PinGridAdapter)
// JavaClassFileOutputException: get_constant: invalid tag

        public void onEventMainThread(com.pinterest.activity.task.education.view.EducationContainerView.ShowShareExtensionEvent showshareextensionevent)
        {
            if (MyUser.get() != null)
            {
                Events.post(new Navigation(Location.SHARE_EXTENSION));
            }
        }

        public void onEventMainThread(com.pinterest.activity.task.education.view.EducationToolTipView.StartLibraryEvent startlibraryevent)
        {
            Events.unregister(_eventsSubscriber, new Class[] {
                com/pinterest/activity/task/education/view/EducationToolTipView$StartLibraryEvent
            });
            if (MyUser.get() != null)
            {
                Pinalytics.a(ElementType.PROFILE_BUTTON, ComponentType.NAVIGATION);
                Events.post(new Navigation(Location.USER, MyUser.get()));
            }
        }

        public void onEventMainThread(com.pinterest.api.model.User.UpdateEvent updateevent)
        {
        }

        public void onEventMainThread(com.pinterest.ui.feedback.PinFeedbackRelated.RemoveRelatedPinsEvent removerelatedpinsevent)
        {
            Feed feed = ((PinGridAdapter)
// JavaClassFileOutputException: get_constant: invalid tag

        public void onEventMainThread(com.pinterest.ui.grid.PinGridCell.ImageLoadEvent imageloadevent)
        {
            boolean flag;
            if (StopWatch.get().getAuxData("ttrfp_tmp_log", "sts_41_hf_read_disk_post") == StopWatch.TTRFP_LOG_SUCCESS)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            StopWatch.get().complete("ttrfp", flag, null).complete("ttrfp_tmp_log", flag, null).complete("login_email").complete("signup_email");
            Events.unregister(_eventsSubscriber, new Class[] {
                com/pinterest/ui/grid/PinGridCell$ImageLoadEvent
            });
        }

        public void onEventMainThread(BaseNagEvent basenagevent)
        {
            ExperienceValue experiencevalue = Experiences.a(String.valueOf(Placement.ANDROID_GLOBAL_NAG.getValue()));
            if (experiencevalue != null && experiencevalue.b == Experience.ANDROID_STATEMENT_CREDIT_HOME_FEED.getValue())
            {
                return;
            } else
            {
                NagUtils.showNagFromEvent(HomeFragment.this, HomeFragment.this.DynamicStory, basenagevent);
                return;
            }
        }

        public void onEventMainThread(HomeFeedMegaphoneEvent homefeedmegaphoneevent)
        {
            if (HomeFragment.this.DynamicStory.getVisibility() != 0)
            {
                Events.removeStickyEvent(homefeedmegaphoneevent);
                if (homefeedmegaphoneevent.getType() == com.pinterest.ui.megaphone.HomeFeedMegaphoneEvent.EventType.UPDATE)
                {
                    HomeFragment.this.DynamicStory.setTitle(homefeedmegaphoneevent.getTitle());
                    HomeFragment.this.DynamicStory.setDesc(homefeedmegaphoneevent.getDesc());
                    class _cls1
                        implements android.view.View.OnClickListener
                    {

                        final _cls3 this$1;

                        public void onClick(View view)
                        {
                            Pinalytics.a(ElementType.UPDATE_BUTTON, ComponentType.NAG);
                            if (getActivity() != null)
                            {
                                AutoUpdateManager.a().startUpdate(getActivity());
                            }
                        }

                _cls1()
                {
                    this$1 = _cls3.this;
                    super();
                }
                    }

                    HomeFragment.this.DynamicStory.setPositiveButton(homefeedmegaphoneevent.getPositiveBtnText(), new _cls1());
                    class _cls2
                        implements android.view.View.OnClickListener
                    {

                        final _cls3 this$1;

                        public void onClick(View view)
                        {
                            Pinalytics.a(ElementType.CANCEL_BUTTON, ComponentType.NAG);
                        }

                _cls2()
                {
                    this$1 = _cls3.this;
                    super();
                }
                    }

                    HomeFragment.this.DynamicStory.setNegativeButton(homefeedmegaphoneevent.getNegativeBtnText(), new _cls2());
                    HomeFragment.this.DynamicStory.show();
                    return;
                }
            }
        }

        public void onEventMainThread(NagHideAndUpdateEvent naghideandupdateevent)
        {
            HomeFragment.this.DynamicStory.hideAndUpdate(naghideandupdateevent.updateOnly);
        }

        _cls3()
        {
            this$0 = HomeFragment.this;
            super();
        }
    }


    private class _cls4 extends BaseApiResponseHandler
    {

        final HomeFragment this$0;

        _cls4()
        {
            this$0 = HomeFragment.this;
            super();
        }
    }



    private class _cls7
        implements Runnable
    {

        final HomeFragment this$0;

        public void run()
        {
            InterestsApi.a(new _cls1(), getApiTag());
        }

        _cls7()
        {
            this$0 = HomeFragment.this;
            super();
        }
    }


    private class _cls8 extends ApiResponseHandler
    {

        final HomeFragment this$0;
        final HomefeedBuilderData val$data;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            refresh();
        }

        public void onFinish()
        {
            onFinish();
            data.getFollowedInterestUids().clear();
            data.getUnfollowedInterestUids().clear();
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            class _cls1
                implements Runnable
            {

                final _cls8 this$1;

                public void run()
                {
                    refresh();
                }

                _cls1()
                {
                    this$1 = _cls8.this;
                    Object();
                }
            }

            _handler.postDelayed(new _cls1(), 3000L);
        }

        _cls8()
        {
            this$0 = HomeFragment.this;
            data = homefeedbuilderdata;
            super();
        }
    }


    private class _cls5 extends BackgroundTask
    {

        PinFeed _cachedFeed;
        final HomeFragment this$0;
        final String val$cachedFeedString;
        final StopWatch val$sw;

        public void onFinish()
        {
            sw.stopSubWatch("ttrfp_tmp_log", "du_40_hf_obj_creation");
            _firstLoad = false;
            _homeFeedHandler.onSuccess(_cachedFeed);
            refresh();
            sw.logTimeStamp("ttrfp_tmp_log", "ts_x_hf_refresh");
        }

        public void run()
        {
            if (!Preferences.user().getBoolean("PREF_HOME_FEED_STREAMING", false))
            {
                break MISSING_BLOCK_LABEL_41;
            }
            _cachedFeed = PinFeed.parseJson(cachedFeedString, null);
_L1:
            _cachedFeed.isHomeFeed = true;
            _cachedFeed.setCached(true);
            return;
            try
            {
                _cachedFeed = new PinFeed(new PinterestJsonObject(cachedFeedString), null);
            }
            catch (Exception exception)
            {
                CrashReporting.a(new Exception((new StringBuilder("MY_HOME_FEED cachedFeedString: ")).append(cachedFeedString).append("\n_cachedFeed: ").append(_cachedFeed).append("\norg_msg: ").append(exception.getMessage()).toString()));
                return;
            }
              goto _L1
        }

        _cls5()
        {
            this$0 = HomeFragment.this;
            cachedFeedString = s;
            sw = stopwatch;
            super();
        }
    }



    private class _cls2 extends com.pinterest.ui.scrollview.ObservableScrollView.ScrollViewListener
    {

        final HomeFragment this$0;

        public void onScroll(View view, int i, int j, int k, int l)
        {
            if (Math.abs(k - i) <= 1 && Math.abs(l - j) <= 1 && (EducationHelper.h() || EducationHelper.l()))
            {
                EducationHelper.a(Placement.ANDROID_HOME_FEED_TAKEOVER, HomeFragment.this);
            }
            if (EducationHelper.l())
            {
                Events.post(new PositionPulsarEvent());
            }
        }

        _cls2()
        {
            this$0 = HomeFragment.this;
            super();
        }
    }

}
