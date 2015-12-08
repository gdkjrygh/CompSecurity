// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search;

import android.animation.AnimatorSet;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.ButterKnife;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.commerce.view.PricePickerIcon;
import com.pinterest.activity.search.dialog.SearchResultsFilterDialog;
import com.pinterest.activity.search.event.GuidedSearchEvent;
import com.pinterest.activity.search.fragment.GuidedBoardSearchFragment;
import com.pinterest.activity.search.fragment.GuidedMyPinSearchFragment;
import com.pinterest.activity.search.fragment.GuidedPeopleSearchFragment;
import com.pinterest.activity.search.fragment.GuidedPinFragment;
import com.pinterest.activity.search.fragment.GuidedPinSearchFragment;
import com.pinterest.activity.search.fragment.MultiObjectSearchTypeAheadFragment;
import com.pinterest.activity.search.fragment.SearchTypeaheadFragment;
import com.pinterest.activity.search.fragment.addpin.AddPinTapFragment;
import com.pinterest.activity.search.model.QueryMetaData;
import com.pinterest.activity.search.ui.GuidedSearchBar;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.model.SearchFilter;
import com.pinterest.api.model.ShopCollectionItem;
import com.pinterest.api.model.User;
import com.pinterest.base.Device;
import com.pinterest.base.Events;
import com.pinterest.experiment.Experiments;
import com.pinterest.fragment.PinGridFragment;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.utils.AnimationUtils;
import com.pinterest.schemas.event.PinImpressionType;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.text.IconView;
import org.apache.commons.lang3.StringUtils;

public class GuidedSearchFragment extends BaseFragment
{

    View _actionBarSearch;
    View _actionbarShadow;
    IconView _backBt;
    private Fragment _currentFragment;
    private String _domain;
    private com.pinterest.base.Events.EventsSubscriber _eventsSubscriber;
    private boolean _isBuyableOnly;
    private boolean _isSearchLocal;
    private GuidedSearchEvent _lastSearchEvent;
    PricePickerIcon _pricePicker;
    ImageView _searchFilterIcon;
    private String _searchMode;
    GuidedSearchBar _searchView;
    private ShopCollectionItem _shopCollectionItem;
    private GuidedSearchEvent _unhandledEvent;
    private User _user;

    public GuidedSearchFragment()
    {
        _eventsSubscriber = new _cls3();
    }

    private void addQueryMetaData(GuidedSearchEvent guidedsearchevent, String s, com.pinterest.activity.search.model.QueryMetaData.ContextType contexttype)
    {
        s = new QueryMetaData(s, contexttype);
        s.setCategory("word");
        s.setPosition(guidedsearchevent.getFilterIndex());
        s.setFilters(_searchView.getActionFilterList());
        _searchView.addQueryMetaData(s);
        _searchView.setLastQueryData(s);
        _searchView.setLastQueryState(com.pinterest.activity.search.model.QueryMetaData.FilterState.ADDED);
    }

    private void animatePriceTag()
    {
        ViewHelper.setVisibility(_searchFilterIcon, false);
        AnimationUtils.getScaleAnimator(_pricePicker).start();
    }

    private int getCurrentSearchFilter()
    {
        if (_currentFragment instanceof GuidedPinSearchFragment)
        {
            if (_lastSearchEvent.isMyPins())
            {
                return 1;
            }
            return !_lastSearchEvent.isCommerceOnly() ? 0 : 4;
        }
        if (_currentFragment instanceof GuidedBoardSearchFragment)
        {
            return 3;
        }
        return !(_currentFragment instanceof GuidedPeopleSearchFragment) ? -1 : 2;
    }

    private GuidedSearchEvent getPinQueryEvent(String s, String s1)
    {
        s = new GuidedSearchEvent(s, com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN);
        if (s1 != null && s1.equals("VALUE_HASHTAG"))
        {
            s.setHashTag(true);
            return s;
        }
        if (s1 != null && s1.equals("VALUE_CONTEXTUAL"))
        {
            s.setContextualSearch(true);
            return s;
        } else
        {
            s.setTokenFilter(true);
            return s;
        }
    }

    private void handleGuidedSearchEvent(GuidedSearchEvent guidedsearchevent)
    {
        boolean flag = false;
        if (shouldHandleEvent(guidedsearchevent)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        _searchView.loseFocus();
        Device.hideSoftKeyboard(_searchView);
        if (!guidedsearchevent.isTokenFilter()) goto _L4; else goto _L3
_L3:
        if (!_searchView.addTokenFilter(guidedsearchevent.getQuery(), guidedsearchevent.getDominantColor(), guidedsearchevent.isTokenFront(), false)) goto _L1; else goto _L5
_L5:
        addQueryMetaData(guidedsearchevent, guidedsearchevent.getQuery(), com.pinterest.activity.search.model.QueryMetaData.ContextType.FILTER);
        guidedsearchevent.setQuery(_searchView.getCurrentTokenQuery(false));
_L7:
        guidedsearchevent.setQueryMetaList(_searchView.getQueryMetaDataList());
        guidedsearchevent.setLastQueryData(_searchView.getLastQueryDataWithFilters());
        guidedsearchevent.setLastQueryState(_searchView.getLastQueryState());
        _lastSearchEvent = guidedsearchevent;
        loadSearchFragment(guidedsearchevent);
        updateSearchFilterIcon(guidedsearchevent.isSearchFilterApplied());
        return;
_L4:
        if (!guidedsearchevent.isHashTag())
        {
            break MISSING_BLOCK_LABEL_186;
        }
        if (!_searchView.addTokenFilter(guidedsearchevent.getQuery(), guidedsearchevent.getDominantColor(), true, false)) goto _L1; else goto _L6
_L6:
        addQueryMetaData(guidedsearchevent, guidedsearchevent.getQuery(), com.pinterest.activity.search.model.QueryMetaData.ContextType.HASHTAG);
        guidedsearchevent.setQuery(_searchView.getCurrentTokenQuery(false));
          goto _L7
        if (!guidedsearchevent.isContextualSearch()) goto _L9; else goto _L8
_L8:
        if (!_searchView.addTokenFilter(guidedsearchevent.getQuery(), guidedsearchevent.getDominantColor(), true, false)) goto _L1; else goto _L10
_L10:
        addQueryMetaData(guidedsearchevent, guidedsearchevent.getQuery(), com.pinterest.activity.search.model.QueryMetaData.ContextType.CONTEXTUAL);
        guidedsearchevent.setQuery(_searchView.getCurrentTokenQuery(false));
          goto _L7
_L9:
        if (guidedsearchevent.getActionFilter() == null) goto _L7; else goto _L11
_L11:
        Object obj;
        GuidedSearchBar guidedsearchbar;
        String s1;
        boolean flag1;
        obj = guidedsearchevent.getActionFilter();
        flag1 = com.pinterest.api.model.SearchFilter.FilterType.MODE.getValue().equals(((SearchFilter) (obj)).getType());
        guidedsearchbar = _searchView;
        s1 = guidedsearchevent.getDominantColor();
        if (flag1 || guidedsearchevent.isTokenFront())
        {
            flag = true;
        }
        if (!guidedsearchbar.addSearchFilter(((SearchFilter) (obj)), s1, flag, flag1)) goto _L1; else goto _L12
_L12:
        String s = ((SearchFilter) (obj)).getTypeValue();
        if (flag1)
        {
            obj = com.pinterest.activity.search.model.QueryMetaData.ContextType.MODE;
        } else
        {
            obj = com.pinterest.activity.search.model.QueryMetaData.ContextType.ACTION_FILTER;
        }
        addQueryMetaData(guidedsearchevent, s, ((com.pinterest.activity.search.model.QueryMetaData.ContextType) (obj)));
          goto _L7
    }

    private void hidePriceButton()
    {
        ViewHelper.setVisibility(_pricePicker, false);
    }

    private void loadBoardSearchFragment(GuidedSearchEvent guidedsearchevent)
    {
        if (!(_currentFragment instanceof GuidedBoardSearchFragment))
        {
            GuidedBoardSearchFragment guidedboardsearchfragment = new GuidedBoardSearchFragment();
            guidedboardsearchfragment.setLastQuery(guidedsearchevent.getQuery());
            _currentFragment = guidedboardsearchfragment;
            loadFragment(guidedboardsearchfragment);
            return;
        } else
        {
            ((GuidedBoardSearchFragment)_currentFragment).reload(guidedsearchevent.getQuery());
            return;
        }
    }

    private void loadPinSearchFragment(GuidedSearchEvent guidedsearchevent)
    {
        boolean flag = true;
        int i = 1;
        if (!(_currentFragment instanceof GuidedPinSearchFragment) && !(_currentFragment instanceof GuidedMyPinSearchFragment))
        {
            Object obj;
            if (_navigation.getExtra("com.pinterest.EXTRA_CONVERSATION_ID") != null)
            {
                obj = new AddPinTapFragment();
            } else
            if (_isSearchLocal)
            {
                obj = new GuidedMyPinSearchFragment();
            } else
            {
                obj = new GuidedPinSearchFragment();
            }
            ((GuidedPinFragment) (obj)).setNavigation(_navigation);
            ((GuidedPinFragment) (obj)).setSearchView(_searchView);
            ((GuidedPinFragment) (obj)).setLastQuery(guidedsearchevent.getQuery());
            ((GuidedPinFragment) (obj)).setQueryMetaList(guidedsearchevent.getQueryMetaList());
            ((GuidedPinFragment) (obj)).setLastQueryData(guidedsearchevent.getLastQueryData());
            ((GuidedPinFragment) (obj)).setLastQueryState(guidedsearchevent.getLastQueryState());
            if (!guidedsearchevent.isMyPins())
            {
                i = 0;
            }
            ((GuidedPinFragment) (obj)).setSearchMode(i);
            ((GuidedPinFragment) (obj)).setCommerceOnly(showBuyableOnlyPins());
            ((GuidedPinFragment) (obj)).setPrice(_pricePicker.getPrice());
            ((GuidedPinFragment) (obj)).setDomain(_domain);
            ((GuidedPinFragment) (obj)).setShopCollectionItem(_shopCollectionItem);
            _currentFragment = ((Fragment) (obj));
            loadFragment(((Fragment) (obj)));
        } else
        {
            ((GuidedPinFragment)_currentFragment).setDomain(_domain);
            ((GuidedPinFragment)_currentFragment).setShopCollectionItem(_shopCollectionItem);
            GuidedPinFragment guidedpinfragment = (GuidedPinFragment)_currentFragment;
            int j;
            if (guidedsearchevent.isMyPins())
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = 0;
            }
            guidedpinfragment.setSearchMode(j);
            ((GuidedPinFragment)_currentFragment).setPrice(_pricePicker.getPrice());
            ((GuidedPinFragment)_currentFragment).reload(guidedsearchevent.getQuery(), guidedsearchevent.getQueryMetaList(), guidedsearchevent.getLastQueryData(), guidedsearchevent.getLastQueryState(), guidedsearchevent.isQueryAutoCorrectionDisabled(), showBuyableOnlyPins());
        }
        updatePinImpressionType();
    }

    private void loadSearchFragment(GuidedSearchEvent guidedsearchevent)
    {
        switch (_cls4..SwitchMap.com.pinterest.activity.search.event.GuidedSearchEvent.SearchType[guidedsearchevent.getType().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            loadPinSearchFragment(guidedsearchevent);
            return;

        case 2: // '\002'
            loadBoardSearchFragment(guidedsearchevent);
            return;

        case 3: // '\003'
            loadUserSearchFragment(guidedsearchevent);
            break;
        }
    }

    private void loadTypeaheadFragment(String s, com.pinterest.api.remote.SearchApi.Scope scope)
    {
        Experiments.a("android_search_autocomplete");
        if (Experiments.s() && !_isSearchLocal)
        {
            if (!(_currentFragment instanceof MultiObjectSearchTypeAheadFragment))
            {
                MultiObjectSearchTypeAheadFragment multiobjectsearchtypeaheadfragment = new MultiObjectSearchTypeAheadFragment();
                multiobjectsearchtypeaheadfragment.setSearchView(_searchView);
                multiobjectsearchtypeaheadfragment.setSearchMode(_searchMode);
                multiobjectsearchtypeaheadfragment.setSearchScope(scope);
                multiobjectsearchtypeaheadfragment.setNavigation(_navigation);
                multiobjectsearchtypeaheadfragment.setCommerceOnly(showBuyableOnlyPins());
                multiobjectsearchtypeaheadfragment.setQuery(s);
                _currentFragment = multiobjectsearchtypeaheadfragment;
                loadFragment(multiobjectsearchtypeaheadfragment);
                return;
            } else
            {
                ((MultiObjectSearchTypeAheadFragment)_currentFragment).reload(s, scope);
                return;
            }
        }
        if (!(_currentFragment instanceof SearchTypeaheadFragment))
        {
            SearchTypeaheadFragment searchtypeaheadfragment = new SearchTypeaheadFragment();
            searchtypeaheadfragment.setSearchView(_searchView);
            searchtypeaheadfragment.setSearchMode(_searchMode);
            searchtypeaheadfragment.setSearchScope(scope);
            searchtypeaheadfragment.setNavigation(_navigation);
            searchtypeaheadfragment.setQuery(s);
            _currentFragment = searchtypeaheadfragment;
            loadFragment(searchtypeaheadfragment);
            return;
        } else
        {
            ((SearchTypeaheadFragment)_currentFragment).reload(s, scope);
            return;
        }
    }

    private void loadUserSearchFragment(GuidedSearchEvent guidedsearchevent)
    {
        if (!(_currentFragment instanceof GuidedPeopleSearchFragment))
        {
            GuidedPeopleSearchFragment guidedpeoplesearchfragment = new GuidedPeopleSearchFragment();
            guidedpeoplesearchfragment.setLastQuery(guidedsearchevent.getQuery());
            _currentFragment = guidedpeoplesearchfragment;
            loadFragment(guidedpeoplesearchfragment);
            return;
        } else
        {
            ((GuidedPeopleSearchFragment)_currentFragment).reload(guidedsearchevent.getQuery());
            return;
        }
    }

    private boolean shouldHandleEvent(GuidedSearchEvent guidedsearchevent)
    {
        return !TextUtils.isEmpty(guidedsearchevent.getQuery()) || guidedsearchevent.getForceRefresh() || isDomainSearch();
    }

    private boolean showBuyableOnlyPins()
    {
        if (_lastSearchEvent == null)
        {
            return _isBuyableOnly;
        }
        return _isBuyableOnly || _lastSearchEvent.isCommerceOnly();
    }

    private void updatePinImpressionType()
    {
        if (_currentFragment instanceof PinGridFragment)
        {
            PinGridFragment pingridfragment = (PinGridFragment)_currentFragment;
            PinImpressionType pinimpressiontype;
            if (showBuyableOnlyPins())
            {
                pinimpressiontype = PinImpressionType.SEARCH_COMMERCE_FEED;
            } else
            {
                pinimpressiontype = PinImpressionType.GRID_CELL;
            }
            pingridfragment.setImpressionType(pinimpressiontype);
        }
    }

    private void updateSearchFilterIcon(boolean flag)
    {
        if (!_isSearchLocal && !_isBuyableOnly)
        {
            if ((_currentFragment instanceof GuidedBoardSearchFragment) || (_currentFragment instanceof GuidedMyPinSearchFragment) || (_currentFragment instanceof GuidedPinSearchFragment) || (_currentFragment instanceof GuidedPeopleSearchFragment))
            {
                _searchFilterIcon.setVisibility(0);
                ImageView imageview = _searchFilterIcon;
                int i;
                if (flag)
                {
                    i = 0x7f0201f0;
                } else
                {
                    i = 0x7f0201ef;
                }
                imageview.setImageDrawable(Resources.drawable(i));
                return;
            } else
            {
                _searchFilterIcon.setVisibility(8);
                return;
            }
        } else
        {
            _searchFilterIcon.setVisibility(8);
            return;
        }
    }

    public void getFocus()
    {
        if (_searchView != null && _searchView.searchHintEnabled())
        {
            _searchView.getFocus();
        }
    }

    protected void getInitialFocus()
    {
        if (_searchView == null || isDomainSearch())
        {
            return;
        } else
        {
            _searchView.post(new _cls2());
            return;
        }
    }

    public String getQuery()
    {
        if (_lastSearchEvent == null)
        {
            return null;
        } else
        {
            return _lastSearchEvent.getQuery();
        }
    }

    public boolean isDomainSearch()
    {
        return StringUtils.isNotEmpty(_domain);
    }

    protected void loadFragment(Fragment fragment)
    {
        FragmentHelper.replaceFragment(this, fragment, false);
    }

    protected void onActivate()
    {
        super.onActivate();
        getInitialFocus();
        if (_currentFragment != null)
        {
            Pinalytics.a(_currentFragment);
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300ce;
        if (bundle != null)
        {
            _searchMode = bundle.getString("com.pinterest.EXTRA_SEARCH_MODE");
            if (TextUtils.equals(_searchMode, "VALUE_SEARCH_LOCAL") || TextUtils.equals(_searchMode, "VALUE_SEARCH_LIBRARY"))
            {
                _user = MyUser.get();
            }
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    protected void onDeactivate()
    {
        _searchView.clearFocus();
        super.onDeactivate();
    }

    public void onDestroyView()
    {
        Events.unregister(_eventsSubscriber);
        _searchView = null;
        if (_backBt != null)
        {
            _backBt.setOnClickListener(null);
            _backBt = null;
        }
        _currentFragment = null;
        super.onDestroyView();
    }

    protected void onFilterClicked()
    {
        showSearchFilterDialog();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putString("com.pinterest.EXTRA_SEARCH_MODE", _searchMode);
        super.onSaveInstanceState(bundle);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        Events.register(_eventsSubscriber);
        _searchView.setApiTag(getApiTag());
        _searchView.setUser(_user);
        _backBt.setOnClickListener(new _cls1());
        if (TextUtils.equals(_searchMode, "VALUE_SEARCH_LIBRARY"))
        {
            _actionbarShadow.setVisibility(8);
            _searchView.useLibraryStyle();
            int i = getResources().getDimensionPixelOffset(0x7f0a014c);
            _actionBarSearch.setPadding(_actionBarSearch.getPaddingLeft(), i, _actionBarSearch.getPaddingRight(), i);
        }
        updateSearchFilterIcon(false);
        if (_unhandledEvent != null)
        {
            handleGuidedSearchEvent(_unhandledEvent);
            _unhandledEvent = null;
        }
    }

    public void setActive(boolean flag)
    {
        super.setActive(flag);
        if (_currentFragment instanceof BaseFragment)
        {
            ((BaseFragment)_currentFragment).setActive(flag);
        }
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        if (navigation != null)
        {
            _searchMode = (String)navigation.getExtra("com.pinterest.EXTRA_SEARCH_MODE");
            boolean flag;
            if (TextUtils.equals(_searchMode, "VALUE_SEARCH_LOCAL") || TextUtils.equals(_searchMode, "VALUE_SEARCH_LIBRARY"))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            _isSearchLocal = flag;
            _isBuyableOnly = TextUtils.equals(_searchMode, "VALUE_SEARCH_BUYABLE");
            if (_isSearchLocal)
            {
                _user = MyUser.get();
            }
            if (navigation.getId() != null)
            {
                _unhandledEvent = getPinQueryEvent(navigation.getId(), navigation.getStringParcelable("com.pinterest.EXTRA_SEARCH_CONTEXT"));
            }
            if (_isBuyableOnly)
            {
                _domain = navigation.getStringParcelable("domain");
                _shopCollectionItem = (ShopCollectionItem)navigation.getParcelable("shop_collection");
                if (_unhandledEvent != null)
                {
                    _unhandledEvent.setCommerceOnly(true);
                    _unhandledEvent.setTokenFilter(false);
                    return;
                }
            }
        }
    }

    public void showSearchFilterDialog()
    {
        Events.post(new DialogEvent(SearchResultsFilterDialog.newInstance(_lastSearchEvent, getCurrentSearchFilter(), _searchView.getLastQueryDataWithFilters())));
    }











    private class _cls3
        implements com.pinterest.base.Events.EventsSubscriber
    {

        final GuidedSearchFragment this$0;

        public void onEventMainThread(com.pinterest.activity.commerce.PriceFilterFragment.PriceUpdatedEvent priceupdatedevent)
        {
            if (showBuyableOnlyPins())
            {
                if ((priceupdatedevent = priceupdatedevent.getPrice()) == null || !priceupdatedevent.equals(_pricePicker.getPrice()))
                {
                    _pricePicker.setPrice(priceupdatedevent);
                    if (_lastSearchEvent != null)
                    {
                        loadSearchFragment(_lastSearchEvent);
                        return;
                    }
                }
            }
        }

        public void onEventMainThread(GuidedSearchEvent guidedsearchevent)
        {
            handleGuidedSearchEvent(guidedsearchevent);
        }

        public void onEventMainThread(SearchSuggestionEvent searchsuggestionevent)
        {
            com.pinterest.api.remote.SearchApi.Scope scope = com.pinterest.api.remote.SearchApi.Scope.d;
            if (searchsuggestionevent.getType() == com.pinterest.activity.search.event.SearchSuggestionEvent.SuggestionType.RECENT_QUERY)
            {
                if (_isSearchLocal)
                {
                    scope = com.pinterest.api.remote.SearchApi.Scope.e;
                } else
                {
                    scope = com.pinterest.api.remote.SearchApi.Scope.d;
                }
            } else
            if (_isSearchLocal)
            {
                scope = com.pinterest.api.remote.SearchApi.Scope.c;
            } else
            {
                scope = com.pinterest.api.remote.SearchApi.Scope.b;
            }
            loadTypeaheadFragment(searchsuggestionevent.getQuery(), scope);
            hidePriceButton();
            updateSearchFilterIcon(false);
        }

        public void onEventMainThread(com.pinterest.fragment.PinterestGridFragment.FeedLoadedEvent feedloadedevent)
        {
            if (showBuyableOnlyPins() && feedloadedevent.getCount() > 0)
            {
                animatePriceTag();
            }
        }

        _cls3()
        {
            this$0 = GuidedSearchFragment.this;
            super();
        }
    }


    private class _cls4
    {

        static final int $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType[];

        static 
        {
            $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType = new int[com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.values().length];
            try
            {
                $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType[com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType[com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.BOARD.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType[com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PINNER.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls2
        implements Runnable
    {

        final GuidedSearchFragment this$0;

        public void run()
        {
            if (_searchView != null && _searchView.searchHintEnabled())
            {
                _searchView.getFocus();
            }
        }

        _cls2()
        {
            this$0 = GuidedSearchFragment.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final GuidedSearchFragment this$0;

        public void onClick(View view)
        {
            pressBackButton();
        }

        _cls1()
        {
            this$0 = GuidedSearchFragment.this;
            super();
        }
    }

}
