// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.fragment;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.commerce.util.CommerceHelper;
import com.pinterest.activity.commerce.view.SearchCarouselView;
import com.pinterest.activity.commerce.view.SearchMerchantView;
import com.pinterest.activity.search.SearchNagView;
import com.pinterest.activity.search.adapter.SearchCategoryAdapter;
import com.pinterest.activity.search.event.GuidedSearchEvent;
import com.pinterest.activity.search.model.QueryMetaData;
import com.pinterest.activity.search.ui.GuidedSearchBar;
import com.pinterest.activity.search.ui.PinnerHeroView;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.DynamicStory;
import com.pinterest.api.model.GuidedPinFeed;
import com.pinterest.api.model.Interest;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.User;
import com.pinterest.api.remote.InterestsApi;
import com.pinterest.api.remote.SearchApi;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.developer.DeveloperHelper;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.actionbar.MetadataBar;
import com.pinterest.ui.grid.PinterestGridView;
import com.pinterest.ui.tab.Tab;
import com.pinterest.ui.tab.TabBar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.lucasr.twowayview.TwoWayView;

// Referenced classes of package com.pinterest.activity.search.fragment:
//            GuidedPinFragment

public class GuidedPinSearchFragment extends GuidedPinFragment
{

    public static final int ALL_PINS = 0;
    private static final long FADE_OUT_ANIMATION_OFFSET = 100L;
    public static final int MY_PINS = 1;
    protected boolean _addPinToMessages;
    private SearchCarouselView _carousel;
    private SearchCategoryAdapter _categoryAdapter;
    TwoWayView _categoryListView;
    private String _correctedQuery;
    View _dummyPaddingView;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    View _focusView;
    LinearLayout _headerWrapper;
    private Interest _interest;
    private int _lastTabIndex;
    View _metaDataBarPaddingView;
    MetadataBar _metadataBar;
    private Map _optFields;
    PinnerHeroView _pinnerHeroView;
    private DynamicStory _pinnerStory;
    View _queryAutoCorrectView;
    private boolean _queryAutoCorrected;
    com.pinterest.ui.scrollview.ObservableScrollView.ScrollViewListener _scrollListener;
    TabBar _tabBar;
    View _tabs;
    private final String followString = Resources.string(0x7f0702ab);
    private android.view.View.OnClickListener onFollowClicked;
    private com.pinterest.api.remote.InterestsApi.InterestApiResponseHandler onInterestLoaded;
    private android.view.View.OnClickListener onMyPinsClickListener;
    private PinSearchFeedResponse onPinsLoaded;
    private com.pinterest.ui.tab.TabBar.Listener onTabChangedListener;
    private PinSearchFeedResponse onUserPinsLoaded;
    private final String unfollowString = Resources.string(0x7f0705b2);

    public GuidedPinSearchFragment()
    {
        _addPinToMessages = false;
        _queryAutoCorrected = false;
        _optFields = new HashMap();
        _scrollListener = new _cls2();
        _eventsSubscriber = new _cls3();
        onMyPinsClickListener = new _cls5();
        onTabChangedListener = new _cls6();
        onInterestLoaded = new _cls7(false);
        onPinsLoaded = new PinSearchFeedResponse(gridResponseHandler, 0);
        onUserPinsLoaded = new PinSearchFeedResponse(gridResponseHandler, 1);
        onFollowClicked = new _cls9();
        _layoutId = 0x7f0300d0;
    }

    private void addTabs()
    {
        _tabs = _gridVw.addHeaderView(0x7f0301d9);
        _tabs.setVisibility(8);
        _tabBar = (TabBar)_tabs.findViewById(0x7f0f048c);
        Tab tab = (Tab)_tabBar.findViewById(0x7f0f048d);
        Tab tab1 = (Tab)_tabBar.findViewById(0x7f0f048e);
        tab.setText(Resources.string(0x7f07004a));
        tab1.setText(Resources.string(0x7f07061e));
        _tabBar.setCurrentIndex(_lastTabIndex);
        _tabBar.setListener(onTabChangedListener);
        _tabBar.disableUnderline();
    }

    private int getGuideXOffset(View view)
    {
        int ai[] = new int[2];
        view.getLocationInWindow(ai);
        return ai[0];
    }

    private List getMetaTermList()
    {
        ArrayList arraylist = new ArrayList();
        if (_queryMetaList != null)
        {
            for (Iterator iterator = _queryMetaList.iterator(); iterator.hasNext(); arraylist.add(((QueryMetaData)iterator.next()).toString())) { }
        }
        return arraylist;
    }

    private int getPinSearchMode()
    {
        return _searchMode;
    }

    private void hideQueryAutoCorrectionView()
    {
        if (_queryAutoCorrectView != null)
        {
            _gridVw.removeHeaderView(_queryAutoCorrectView);
        }
    }

    private void initBuyablePinsCarousel()
    {
    }

    private void initCategoryList()
    {
        _categoryListView.setVisibility(8);
        _categoryListView.setOrientation(org.lucasr.twowayview.TwoWayView.Orientation.HORIZONTAL);
        _categoryListView.setLongClickable(true);
        _categoryListView.setAdapter(_categoryAdapter);
        _categoryListView.setHorizontalScrollBarEnabled(false);
        _categoryListView.setItemMargin((int)Device.dpToPixel(8F));
        _categoryListView.setOverScrollMode(2);
        if (Experiments.d(false))
        {
            _headerWrapper.setBackgroundColor(Resources.color(0x7f0e00bf));
            _categoryListView.setBackgroundColor(Resources.color(0x7f0e00bf));
        }
        _categoryListView.setOnItemClickListener(new _cls1());
    }

    private void initGrid()
    {
        _gridVw.setState(com.pinterest.ui.grid.PinterestGridView.State.LOADING);
        _gridVw.addListener(_scrollListener);
        if (_shopCollectionItem != null)
        {
            SearchMerchantView searchmerchantview = new SearchMerchantView(getContext());
            searchmerchantview.bind(_shopCollectionItem);
            _gridVw.addHeaderView(searchmerchantview);
        }
    }

    private void initGridPadding(View view)
    {
        _dummyPaddingView = new View(view.getContext());
        _dummyPaddingView.setVisibility(8);
        _gridVw.addHeaderView(_dummyPaddingView, -1, (int)Resources.dimension(0x7f0a01b9));
        if (Experiments.d(true))
        {
            _metaDataBarPaddingView = new View(view.getContext());
            _metaDataBarPaddingView.setVisibility(8);
            _gridVw.addHeaderView(_metaDataBarPaddingView, -1, (int)Resources.dimension(0x7f0a0010));
            updateMetadataBarState();
        }
        _nagView = new SearchNagView(view.getContext());
        _nagView.setVisibility(8);
        _gridVw.addHeaderView(_nagView, -1, -2);
    }

    private void reloadWithCorrectedQuery()
    {
        if (_correctedQuery == null || _searchView == null)
        {
            return;
        }
        Object obj;
        if (_queryAutoCorrected)
        {
            obj = com.pinterest.activity.search.model.QueryMetaData.ContextType.TYPO_AUTO_ORGINAL;
        } else
        {
            obj = com.pinterest.activity.search.model.QueryMetaData.ContextType.TYPO_SUGGESTION;
        }
        obj = new QueryMetaData(_correctedQuery, ((com.pinterest.activity.search.model.QueryMetaData.ContextType) (obj)));
        _searchView.clearTokens(true);
        _searchView.addQueryMetaData(((QueryMetaData) (obj)));
        _searchView.addQueryList(_correctedQuery);
        _searchView.setLastQueryData(((QueryMetaData) (obj)));
        _searchView.setLastQueryState(com.pinterest.activity.search.model.QueryMetaData.FilterState.NONE);
        obj = new GuidedSearchEvent(_correctedQuery, com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN);
        ((GuidedSearchEvent) (obj)).setQueryAutoCorrectionDisabled(true);
        Events.post(obj);
        obj = new HashMap();
        if (_queryAutoCorrected)
        {
            ((HashMap) (obj)).put("type", "typo_auto_original");
        } else
        {
            ((HashMap) (obj)).put("type", "typo_suggestion");
        }
        Pinalytics.a(ElementType.SEARCH_QUERY_TYPO_CORRECTION, ((HashMap) (obj)));
    }

    private void retreiveAutoCorrectionForQuery(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject == null)
        {
            hideQueryAutoCorrectionView();
            return;
        } else
        {
            showQueryAutoCorrectionView();
            updateQueryAutoCorrectionNagText(pinterestjsonobject);
            return;
        }
    }

    private void setTabVisibility(int i)
    {
        _tabs.setVisibility(i);
    }

    private void showQueryAutoCorrectionView()
    {
        if (_queryAutoCorrectView == null)
        {
            _queryAutoCorrectView = _gridVw.addHeaderView(0x7f030191);
            _queryAutoCorrectView.setOnClickListener(new _cls4());
        }
    }

    private void toggleFollowButtonState()
    {
label0:
        {
            if (_pinnerStory != null)
            {
                if (_pinnerStory.isUserFollowing())
                {
                    break label0;
                }
                _pinnerStory.setUserFollowing(true);
                _pinnerHeroView.updateActionButton(unfollowString, com.pinterest.ui.text.PButton.ButtonStyle.PLAIN);
            }
            return;
        }
        _pinnerStory.setUserFollowing(false);
        _pinnerHeroView.updateActionButton(followString, com.pinterest.ui.text.PButton.ButtonStyle.RED);
    }

    private void updateCarousel(GuidedPinFeed guidedpinfeed)
    {
        if (getActivity() == null || _gridVw == null || isCommerceOnly())
        {
            return;
        }
        if (guidedpinfeed.hasStories())
        {
            _pinnerStory = guidedpinfeed.getSearchPinnerStory(0);
            updatePinnerHero();
        }
        if (!CommerceHelper.isCommerceEnabled() || !guidedpinfeed.hasStories())
        {
            ViewHelper.setVisibility(_carousel, false);
            return;
        }
        if (_carousel == null)
        {
            _carousel = new SearchCarouselView(getActivity());
            _gridVw.addHeaderView(_carousel);
        } else
        {
            ViewHelper.setVisibility(_carousel, true);
        }
        _carousel.setLastQuery(_lastQuery);
        _carousel.setStory(guidedpinfeed.getSearchStory(0));
    }

    private void updateCommerceView()
    {
        if (_commerceOnly)
        {
            ViewHelper.setVisibility(_metaDataBarPaddingView, 8);
            ViewHelper.setVisibility(_metadataBar, 8);
            ViewHelper.setVisibility(_carousel, 8);
        }
    }

    private void updateMetadataBarState()
    {
        if (_metaDataBarPaddingView == null || _metadataBar == null)
        {
            return;
        }
        if (_interest != null && !_commerceOnly)
        {
            _metadataBar.setModel(_interest);
            _metadataBar.setHeaderTitle(_interest.getName());
            ViewHelper.setVisibility(_metaDataBarPaddingView, 0);
            ViewHelper.setVisibility(_metadataBar, 0);
            Pinalytics.a(EventType.TOPIC_IN_SEARCH_SHOWN, null);
            return;
        } else
        {
            ViewHelper.setVisibility(_metaDataBarPaddingView, 8);
            ViewHelper.setVisibility(_metadataBar, 8);
            return;
        }
    }

    private void updatePinnerHero()
    {
        if (_pinnerStory == null || _pinnerStory.getUser() == null)
        {
            return;
        }
        _pinnerHeroView = (PinnerHeroView)LayoutInflater.from(getContext()).inflate(0x7f03018c, null);
        _pinnerHeroView.setUser(_pinnerStory.getUser());
        _pinnerHeroView.setDesc(_pinnerStory.getUser().getUsername());
        _pinnerHeroView.setOnClickListener(new _cls8());
        if (MyUser.getUid().equals(_pinnerStory.getUser().getUid()) || _pinnerStory.isNoFollowButton())
        {
            _pinnerHeroView.createActionButton(null, null);
            _pinnerHeroView.showDetailArrow();
        } else
        {
            if (!_pinnerStory.isUserFollowing())
            {
                _pinnerHeroView.createActionButton(followString, onFollowClicked);
                _pinnerHeroView.setActionButtonStyle(com.pinterest.ui.text.PButton.ButtonStyle.RED);
            } else
            {
                _pinnerHeroView.createActionButton(unfollowString, onFollowClicked);
                _pinnerHeroView.setActionButtonStyle(com.pinterest.ui.text.PButton.ButtonStyle.PLAIN);
            }
            _pinnerHeroView.setActionButtonTag(_pinnerStory.getUser());
        }
        Pinalytics.a(EventType.VIEW, ElementType.PINNER_MODULE, ComponentType.SEARCH_HERO, null);
        _gridVw.addHeaderView(_pinnerHeroView);
    }

    private void updateQueryAutoCorrectionNagText(PinterestJsonObject pinterestjsonobject)
    {
        if (_queryAutoCorrectView != null && pinterestjsonobject != null)
        {
            String s = String.format("#%06X", new Object[] {
                Integer.valueOf(0xffffff & _searchView.getFirstTokenColor())
            });
            TextView textview = (TextView)_queryAutoCorrectView.findViewById(0x7f0f0077);
            _queryAutoCorrected = pinterestjsonobject.a("corrected").booleanValue();
            Object obj;
            if (_queryAutoCorrected)
            {
                obj = pinterestjsonobject.a("original", "");
            } else
            {
                obj = pinterestjsonobject.a("correction", "");
            }
            _correctedQuery = ((String) (obj));
            textview.setText(Html.fromHtml(Resources.string(0x7f0704df, new Object[] {
                (new StringBuilder("<font color='")).append(s).append("'>").append(_correctedQuery).append("</font>").toString()
            })));
            if (_queryAutoCorrected)
            {
                obj = _searchView.getLastQueryDataWithFilters();
                ((QueryMetaData) (obj)).setQuery(pinterestjsonobject.a("correction", ""));
                ((QueryMetaData) (obj)).setType(com.pinterest.activity.search.model.QueryMetaData.ContextType.TYPO_AUTO_CORRECTED);
                _searchView.clearTokens(true);
                _searchView.addQueryMetaData(((QueryMetaData) (obj)));
                _searchView.addQueryList(pinterestjsonobject.a("correction", ""));
                _searchView.setLastQueryData(((QueryMetaData) (obj)));
                _searchView.setLastQueryState(com.pinterest.activity.search.model.QueryMetaData.FilterState.NONE);
                return;
            }
        }
    }

    private void updateRelatedQueries(List list, List list1)
    {
        if (_dummyPaddingView == null || _categoryListView == null)
        {
            return;
        }
        if ((list.size() > 0 || list1.size() > 0) && !_addPinToMessages)
        {
            ViewHelper.setVisibility(_dummyPaddingView, 0);
            ViewHelper.setVisibility(_categoryListView, 0);
            _categoryListView.setSelection(0);
        } else
        {
            ViewHelper.setVisibility(_dummyPaddingView, 8);
            ViewHelper.setVisibility(_categoryListView, 8);
        }
        _categoryAdapter.updateData(list, list1);
    }

    protected void loadData()
    {
        if (_lastQuery != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        updateEmptyContent();
        getPinSearchMode();
        JVM INSTR tableswitch 0 1: default 40
    //                   0 41
    //                   1 438;
           goto _L3 _L4 _L5
_L3:
        return;
_L4:
        _optFields.clear();
        if (_lastQueryState == null || _lastQueryData == null) goto _L7; else goto _L6
_L6:
        _cls10..SwitchMap.com.pinterest.activity.search.model.QueryMetaData.FilterState[_lastQueryState.ordinal()];
        JVM INSTR tableswitch 1 2: default 96
    //                   1 351
    //                   2 400;
           goto _L7 _L8 _L9
_L7:
        Object obj = AnimationUtils.loadAnimation(getView().getContext(), 0x7f040010);
        ((Animation) (obj)).setStartOffset(100L);
        ((Animation) (obj)).setFillAfter(true);
        _categoryListView.startAnimation(((Animation) (obj)));
        HashMap hashmap;
        if (_lastQueryData != null)
        {
            obj = _lastQueryData.getFilters();
        } else
        {
            obj = null;
        }
        if (_lastQueryData != null)
        {
            _optFields.put("rs", _lastQueryData.getType().getValue());
        }
        if (_queryAutoCorrectionDisabled)
        {
            _optFields.put("auto_correction_disabled", "true");
        }
        if (DeveloperHelper.d())
        {
            _optFields.put("corpus", "csr");
        }
        hashmap = new HashMap();
        hashmap.put("query", _lastQuery);
        if (_commerceOnly)
        {
            hashmap.put("commerce_only", "true");
            if (_price != null)
            {
                hashmap.put("suggested_price", _price);
            }
            if (StringUtils.isNotEmpty(_domain))
            {
                hashmap.put("domain", _domain);
            }
        }
        SearchApi.a(hashmap, getMetaTermList(), _optFields, ((List) (obj)), onPinsLoaded, getApiTag());
        if (Experiments.d(false))
        {
            InterestsApi.a(_lastQuery, onInterestLoaded, getApiTag());
            return;
        }
        if (true) goto _L1; else goto _L8
_L8:
        if (_lastQueryData.getType() == com.pinterest.activity.search.model.QueryMetaData.ContextType.FILTER || _lastQueryData.getType() == com.pinterest.activity.search.model.QueryMetaData.ContextType.ACTION_FILTER)
        {
            _optFields.put("add_refine[]", _lastQueryData.toString());
        }
          goto _L7
_L9:
        _optFields.put("remove_refine[]", _lastQueryData.toString());
        _lastQueryData.setType(com.pinterest.activity.search.model.QueryMetaData.ContextType.REMOVE);
          goto _L7
_L5:
        SearchApi.a(_lastQuery, onUserPinsLoaded, getApiTag());
        return;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _categoryAdapter = new SearchCategoryAdapter(getActivity());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        if (bundle != null)
        {
            _lastQuery = bundle.getString("_lastQuery");
        }
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroyView()
    {
        _dummyPaddingView = null;
        _metaDataBarPaddingView = null;
        _tabBar = null;
        _nagView = null;
        _metadataBar = null;
        if (_categoryListView != null)
        {
            _categoryListView.setOnItemClickListener(null);
        }
        super.onDestroyView();
    }

    public void onPause()
    {
        Events.unregister(_eventsSubscriber, new Class[] {
            com/pinterest/ui/grid/PinGridCell$ImageLoadEvent, com/pinterest/api/model/Interest$UpdateEvent
        });
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        Events.register(_eventsSubscriber, com/pinterest/ui/grid/PinGridCell$ImageLoadEvent, new Class[] {
            com/pinterest/api/model/Interest$UpdateEvent
        });
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (_tabBar != null)
        {
            bundle.putInt("tabIndex", _tabBar.getSelectedIndex());
        }
        super.onSaveInstanceState(bundle);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        if (bundle != null)
        {
            _lastTabIndex = bundle.getInt("tabIndex", 0);
        }
        ButterKnife.a(this, view);
        super.onViewCreated(view, bundle);
        Experiments.a("android_action_filter");
        initGridPadding(view);
        initCategoryList();
        initGrid();
    }

    public void refresh()
    {
        super.refresh();
        Events.register(_eventsSubscriber, com/pinterest/ui/grid/PinGridCell$ImageLoadEvent, new Class[] {
            com/pinterest/api/model/Interest$UpdateEvent
        });
    }

    protected void updateEmptyContent()
    {
        getPinSearchMode();
        JVM INSTR tableswitch 1 1: default 24
    //                   1 50;
           goto _L1 _L2
_L1:
        _emptyMessage = Resources.string(0x7f070273, new Object[] {
            _lastQuery
        });
_L4:
        super.updateEmptyContent();
        return;
_L2:
        _emptyMessage = Resources.string(0x7f070275, new Object[] {
            _lastQuery
        });
        if (true) goto _L4; else goto _L3
_L3:
    }




/*
    static int access$1002(GuidedPinSearchFragment guidedpinsearchfragment, int i)
    {
        guidedpinsearchfragment._lastTabIndex = i;
        return i;
    }

*/











/*
    static Interest access$302(GuidedPinSearchFragment guidedpinsearchfragment, Interest interest)
    {
        guidedpinsearchfragment._interest = interest;
        return interest;
    }

*/







    private class _cls2 extends com.pinterest.ui.scrollview.ObservableScrollView.ScrollViewListener
    {

        final GuidedPinSearchFragment this$0;

        public void onScroll(View view, int i, int j, int k, int l)
        {
            if (_focusView != null)
            {
                _focusView.requestFocus();
            }
            if (_categoryListView != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            int i1;
            i = _headerWrapper.getMeasuredHeight();
            k = (int)_headerWrapper.getY();
            i1 = (l - j) + k;
            if (j >= l)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (k >= 0) goto _L1; else goto _L3
_L3:
            _headerWrapper.setTranslationY(Math.min(0, i1));
            return;
            if (j <= l || k <= -i) goto _L1; else goto _L4
_L4:
            _headerWrapper.setTranslationY(Math.max(-i, i1));
            return;
        }

        _cls2()
        {
            this$0 = GuidedPinSearchFragment.this;
            super();
        }
    }


    private class _cls3
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final GuidedPinSearchFragment this$0;

        public void onEventMainThread(com.pinterest.api.model.Interest.UpdateEvent updateevent)
        {
            updateevent = updateevent.getInterest();
            if (updateevent != null && _interest != null && updateevent.getUid() == _interest.getUid())
            {
                _interest = updateevent;
                HashMap hashmap;
                if (_interest.getFollowing().booleanValue())
                {
                    updateevent = EventType.TOPIC_IN_SEARCH_INTEREST_FOLLOW;
                } else
                {
                    updateevent = EventType.TOPIC_IN_SEARCH_INTEREST_UNFOLLOW;
                }
                hashmap = new HashMap();
                hashmap.put("interest", _interest.getUrlName());
                Pinalytics.a(updateevent, null, null, hashmap);
                if (_metadataBar != null)
                {
                    _metadataBar.setModel(_interest);
                    return;
                }
            }
        }

        public void onEventMainThread(com.pinterest.ui.grid.PinGridCell.ImageLoadEvent imageloadevent)
        {
            StopWatch.get().complete("search_ttrfp");
            Events.unregister(_eventsSubscriber, new Class[] {
                com/pinterest/ui/grid/PinGridCell$ImageLoadEvent
            });
        }

        _cls3()
        {
            this$0 = GuidedPinSearchFragment.this;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final GuidedPinSearchFragment this$0;

        public void onClick(View view)
        {
            if (Experiments.x())
            {
                view = Location.USER_LIBRARY_PINS;
            } else
            {
                view = Location.USER_PINS;
            }
            Events.post(new Navigation(view, MyUser.getUid()));
        }

        _cls5()
        {
            this$0 = GuidedPinSearchFragment.this;
            super();
        }
    }



    private class _cls7 extends com.pinterest.api.remote.InterestsApi.InterestApiResponseHandler
    {

        final GuidedPinSearchFragment this$0;

        public void onSuccess(Interest interest)
        {
            if (interest != null)
            {
                if (ModelHelper.isValid(interest.getUid()) && interest.getPinnerCount().intValue() > 0)
                {
                    _interest = interest;
                } else
                {
                    _interest = null;
                }
            }
            updateMetadataBarState();
        }

        _cls7(boolean flag)
        {
            this$0 = GuidedPinSearchFragment.this;
            super(flag);
        }
    }


    private class PinSearchFeedResponse extends com.pinterest.api.remote.PinApi.GuidedPinFeedApiResponse
    {

        int _tabIndex;
        final GuidedPinSearchFragment this$0;

        public void onStart()
        {
            super.onStart();
            if (_categoryListView != null)
            {
                _categoryListView.setEnabled(false);
            }
            updateCommerceView();
            ViewHelper.setVisibility(_nagView, 8);
        }

        public void onSuccess(Feed feed)
        {
            super.onSuccess(feed);
            Object obj = new HashMap();
            ((HashMap) (obj)).put("query", _lastQuery);
            Pinalytics.a(EventType.SEARCH_PINS, "0", ((HashMap) (obj)));
            obj = (GuidedPinFeed)feed;
            updateRelatedQueries(((GuidedPinFeed) (obj)).getRelatedQueries(), ((GuidedPinFeed) (obj)).getSearchFilters());
            SearchNagView.showSearchNag(_nagView, feed);
            if (_categoryListView != null)
            {
                _categoryListView.setEnabled(true);
                Animation animation = AnimationUtils.loadAnimation(getView().getContext(), 0x7f040018);
                animation.setFillAfter(true);
                _categoryListView.startAnimation(animation);
            }
            updateCarousel((GuidedPinFeed)feed);
        }

        public void onSuccess(PinterestJsonObject pinterestjsonobject)
        {
            retreiveAutoCorrectionForQuery(pinterestjsonobject.c("typo"));
            super.onSuccess(pinterestjsonobject);
        }

        public PinSearchFeedResponse()
        {
            this$0 = GuidedPinSearchFragment.this;
            super();
            _tabIndex = -1;
        }

        public PinSearchFeedResponse(FeedApiResponseHandler feedapiresponsehandler, int i)
        {
            this$0 = GuidedPinSearchFragment.this;
            super(feedapiresponsehandler);
            _tabIndex = -1;
            _tabIndex = i;
        }
    }


    private class _cls9
        implements android.view.View.OnClickListener
    {

        final GuidedPinSearchFragment this$0;

        public void onClick(View view)
        {
            class _cls1 extends com.pinterest.api.remote.UserApi.UserFollowApiResponse
            {

                final _cls9 this$1;

                public void onFailure()
                {
                    toggleFollowButtonState();
                }

                public void onSuccess(User user)
                {
                }

                _cls1()
                {
                    this$1 = _cls9.this;
                    super();
                }
            }

            if (_pinnerStory.isUserFollowing())
            {
                view = EventType.USER_UNFOLLOW;
            } else
            {
                view = EventType.USER_FOLLOW;
            }
            Pinalytics.a(view, ElementType.PINNER_MODULE, ComponentType.SEARCH_HERO, _pinnerStory.getUser().getUid());
            toggleFollowButtonState();
            FollowUtils.getInstance().followUser(_pinnerStory.getUser().getUid(), _pinnerStory.isUserFollowing(), new _cls1(), null, true);
        }

        _cls9()
        {
            this$0 = GuidedPinSearchFragment.this;
            super();
        }
    }


    private class _cls1
        implements android.widget.AdapterView.OnItemClickListener
    {

        final GuidedPinSearchFragment this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            int j = _categoryAdapter.getItemViewType(i);
            adapterview = new HashMap();
            if (j == 1)
            {
                view = (SearchFilter)_categoryAdapter.getItem(i);
                GuidedSearchEvent guidedsearchevent = new GuidedSearchEvent(null, com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN);
                guidedsearchevent.setActionFilter(view);
                guidedsearchevent.setDominantColor(view.getDominantColorWithDefault());
                guidedsearchevent.setForceRefresh(true);
                adapterview.put("filter_type", view.getType());
                adapterview.put("label", view.getTypeValue());
                Pinalytics.a(ElementType.SEARCH_ACTION_SUGGESTION, adapterview);
                StopWatch.get().start("search_ttrfp");
                Events.post(guidedsearchevent);
            } else
            {
                if (j == 2)
                {
                    SearchFilter searchfilter = (SearchFilter)_categoryAdapter.getItem(i);
                    view = FilterDialog.newInstance(searchfilter, i, _categoryListView.getMeasuredHeight(), getGuideXOffset(view));
                    view.setForceFullWidthOnTablet(true);
                    adapterview.put("filter_type", searchfilter.getType());
                    adapterview.put("label", searchfilter.getTypeValue());
                    Pinalytics.a(ElementType.SEARCH_FILTER_DROPDOWNBUTTON, adapterview);
                    Events.post(new DialogEvent(view));
                    return;
                }
                view = (RelatedQueryItem)_categoryAdapter.getItem(i);
                if (view != null)
                {
                    adapterview.put("result_index", String.valueOf(i));
                    adapterview.put("label", view.getTerm());
                    Pinalytics.a(ElementType.SEARCH_GUIDE_SUGGESTION, adapterview);
                    boolean flag;
                    if (view.getPosition() == 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    adapterview = new GuidedSearchEvent(view.getTerm(), com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN);
                    adapterview.setTokenFilter(true);
                    adapterview.setTokenFront(flag);
                    adapterview.setDominantColor(view.getDominantColor());
                    adapterview.setFilterIndex(i);
                    StopWatch.get().start("search_ttrfp");
                    Events.post(adapterview);
                    return;
                }
            }
        }

        _cls1()
        {
            this$0 = GuidedPinSearchFragment.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final GuidedPinSearchFragment this$0;

        public void onClick(View view)
        {
            reloadWithCorrectedQuery();
        }

        _cls4()
        {
            this$0 = GuidedPinSearchFragment.this;
            super();
        }
    }


    private class _cls8
        implements android.view.View.OnClickListener
    {

        final GuidedPinSearchFragment this$0;

        public void onClick(View view)
        {
            Pinalytics.a(ElementType.PINNER_MODULE, ComponentType.SEARCH_HERO);
            Events.post(new Navigation(Location.USER, _pinnerStory.getUser().getUid()));
        }

        _cls8()
        {
            this$0 = GuidedPinSearchFragment.this;
            super();
        }
    }


    private class _cls10
    {

        static final int $SwitchMap$com$pinterest$activity$search$model$QueryMetaData$FilterState[];

        static 
        {
            $SwitchMap$com$pinterest$activity$search$model$QueryMetaData$FilterState = new int[com.pinterest.activity.search.model.QueryMetaData.FilterState.values().length];
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$QueryMetaData$FilterState[com.pinterest.activity.search.model.QueryMetaData.FilterState.ADDED.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$QueryMetaData$FilterState[com.pinterest.activity.search.model.QueryMetaData.FilterState.REMOVED.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$QueryMetaData$FilterState[com.pinterest.activity.search.model.QueryMetaData.FilterState.NONE.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
