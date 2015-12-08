// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import butterknife.ButterKnife;
import com.pinterest.activity.search.adapter.GuidedSearchTypeAheadAdapter;
import com.pinterest.activity.search.ui.GuidedSearchBar;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.remote.SearchApi;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.tab.TabBar;
import org.apache.commons.lang3.StringUtils;

public class SearchTypeaheadFragment extends BaseFragment
{

    private static final int MAX_TYPEAHEAD_LOCAL_SUGGESTIONS = 10;
    private static final String SEARCH_HINT_BOARDS = Resources.string(0x7f0704da);
    private static final String SEARCH_HINT_PINNER = Resources.string(0x7f0704db);
    private static final String SEARCH_HINT_PINS = Resources.string(0x7f0704dc);
    private static final int TAB_BOARD = 2;
    private static final int TAB_PIN = 0;
    private static final int TAB_PINNER = 1;
    private int _lastTabIndex;
    ListView _listView;
    private String _query;
    private GuidedSearchTypeAheadAdapter _searchAdapter;
    private String _searchMode;
    com.pinterest.api.remote.SearchApi.Scope _searchScope;
    private com.pinterest.activity.search.event.GuidedSearchEvent.SearchType _searchType;
    private GuidedSearchBar _searchView;
    TabBar _tabBar;
    LinearLayout _typeaheadContainer;
    private com.pinterest.ui.tab.TabBar.Listener onTabChangedListener;

    public SearchTypeaheadFragment()
    {
        _searchType = com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN;
        onTabChangedListener = new _cls1();
        _layoutId = 0x7f0300d1;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _searchAdapter = new GuidedSearchTypeAheadAdapter(getActivity());
        _searchAdapter.setApiTag(getApiTag());
    }

    public void onDestroy()
    {
        _searchAdapter = null;
        super.onDestroy();
    }

    public void onDestroyView()
    {
        ButterKnife.a(this);
        _listView = null;
        _searchView = null;
        super.onDestroyView();
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
        byte byte0;
        boolean flag1;
        flag1 = true;
        byte0 = 0;
        if (bundle != null)
        {
            _lastTabIndex = bundle.getInt("tabIndex", 0);
        }
        ButterKnife.a(this, view);
        super.onViewCreated(view, bundle);
        if (_searchView == null) goto _L2; else goto _L1
_L1:
        _searchAdapter.setSearchType(_searchView.getSearchType());
        _cls2..SwitchMap.com.pinterest.activity.search.event.GuidedSearchEvent.SearchType[_searchView.getSearchType().ordinal()];
        JVM INSTR tableswitch 1 3: default 92
    //                   1 272
    //                   2 280
    //                   3 288;
           goto _L3 _L4 _L5 _L6
_L3:
        break; /* Loop/switch isn't completed */
_L6:
        break MISSING_BLOCK_LABEL_288;
_L2:
        _listView.setAdapter(_searchAdapter);
        _listView.setOnItemClickListener(new SearchDropDownOnItemClickListener());
        _searchAdapter.setSearchMode(_searchMode);
        if (_searchAdapter.getCount() == 0)
        {
            reload(_query, _searchScope);
        }
        _tabBar.setCurrentIndex(_lastTabIndex);
        _tabBar.setListener(onTabChangedListener);
        boolean flag = flag1;
        if (!TextUtils.equals(_searchMode, "VALUE_SEARCH_LOCAL"))
        {
            if (TextUtils.equals(_searchMode, "VALUE_SEARCH_LIBRARY"))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
        }
        view = _tabBar;
        if (flag)
        {
            byte0 = 8;
        }
        ViewHelper.setVisibility(view, byte0);
        if (_navigation.getExtra("com.pinterest.EXTRA_CONVERSATION_ID") != null)
        {
            ViewHelper.setVisibility(_tabBar, 8);
        }
        if (TextUtils.equals(_searchMode, "VALUE_SEARCH_LIBRARY"))
        {
            _typeaheadContainer.setBackgroundColor(getResources().getColor(0x7f0e00bf));
        }
        return;
_L4:
        _lastTabIndex = 0;
          goto _L2
_L5:
        _lastTabIndex = 1;
          goto _L2
        _lastTabIndex = 2;
          goto _L2
    }

    public void reload(String s, com.pinterest.api.remote.SearchApi.Scope scope)
    {
        if (_searchAdapter != null)
        {
            if (StringUtils.isEmpty(s))
            {
                _searchAdapter.loadCachedData();
            }
            _searchAdapter.setSearchScope(scope);
            if (s != null)
            {
                if (scope == com.pinterest.api.remote.SearchApi.Scope.c)
                {
                    GuidedSearchTypeAheadAdapter guidedsearchtypeaheadadapter = _searchAdapter;
                    guidedsearchtypeaheadadapter.getClass();
                    SearchApi.a(s, scope, new com.pinterest.activity.search.adapter.GuidedSearchTypeAheadAdapter.SearchTypeAheadApiHandler(guidedsearchtypeaheadadapter, s), getApiTag());
                    return;
                } else
                {
                    GuidedSearchTypeAheadAdapter guidedsearchtypeaheadadapter1 = _searchAdapter;
                    guidedsearchtypeaheadadapter1.getClass();
                    SearchApi.b(s, scope, new com.pinterest.activity.search.adapter.GuidedSearchTypeAheadAdapter.SearchTypeAheadApiHandler(guidedsearchtypeaheadadapter1, s), getApiTag());
                    return;
                }
            }
        }
    }

    public void setQuery(String s)
    {
        _query = s;
    }

    public void setSearchMode(String s)
    {
        _searchMode = s;
    }

    public void setSearchScope(com.pinterest.api.remote.SearchApi.Scope scope)
    {
        _searchScope = scope;
    }

    public void setSearchView(GuidedSearchBar guidedsearchbar)
    {
        _searchView = guidedsearchbar;
    }







/*
    static com.pinterest.activity.search.event.GuidedSearchEvent.SearchType access$302(SearchTypeaheadFragment searchtypeaheadfragment, com.pinterest.activity.search.event.GuidedSearchEvent.SearchType searchtype)
    {
        searchtypeaheadfragment._searchType = searchtype;
        return searchtype;
    }

*/





/*
    static int access$702(SearchTypeaheadFragment searchtypeaheadfragment, int i)
    {
        searchtypeaheadfragment._lastTabIndex = i;
        return i;
    }

*/

    private class _cls1
        implements com.pinterest.ui.tab.TabBar.Listener
    {

        final SearchTypeaheadFragment this$0;

        public void onTabReselected(int i)
        {
        }

        public void onTabSelected(int i)
        {
            String s;
            ElementType elementtype;
            elementtype = ElementType.SEARCH_PINS_BUTTON;
            s = SearchTypeaheadFragment.SEARCH_HINT_PINS;
            i;
            JVM INSTR tableswitch 0 2: default 36
        //                       0 146
        //                       1 190
        //                       2 168;
               goto _L1 _L2 _L3 _L4
_L1:
            if (_tabBar != null)
            {
                _tabBar.setCurrentIndex(i);
            }
            _lastTabIndex = i;
            if (_searchView != null)
            {
                _searchView.setSearchHint(s);
                _searchView.setSearchType(_searchType);
            }
            Pinalytics.a(elementtype);
            if (_searchAdapter != null)
            {
                _searchAdapter.setSearchType(_searchType);
                _searchAdapter.notifyDataSetChanged();
            }
            return;
_L2:
            elementtype = ElementType.SEARCH_PINS_BUTTON;
            _searchType = com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN;
            s = SearchTypeaheadFragment.SEARCH_HINT_PINS;
            continue; /* Loop/switch isn't completed */
_L4:
            elementtype = ElementType.SEARCH_BOARDS_BUTTON;
            _searchType = com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.BOARD;
            s = SearchTypeaheadFragment.SEARCH_HINT_BOARDS;
            continue; /* Loop/switch isn't completed */
_L3:
            elementtype = ElementType.SEARCH_PINNERS_BUTTON;
            _searchType = com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PINNER;
            s = SearchTypeaheadFragment.SEARCH_HINT_PINNER;
            if (true) goto _L1; else goto _L5
_L5:
        }

        _cls1()
        {
            this$0 = SearchTypeaheadFragment.this;
            super();
        }
    }


    private class _cls2
    {

        static final int $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType[];
        static final int $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[];

        static 
        {
            $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType = new int[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.values().length];
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PINNER_SEARCH_ALL.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror16) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.BOARD_SEARCH_ALL.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror15) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN_SEARCH_ALL.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror14) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror13) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN_LOCAL_CACHE.ordinal()] = 5;
            }
            catch (NoSuchFieldError nosuchfielderror12) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PIN.ordinal()] = 6;
            }
            catch (NoSuchFieldError nosuchfielderror11) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_BOARD.ordinal()] = 7;
            }
            catch (NoSuchFieldError nosuchfielderror10) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PINNER.ordinal()] = 8;
            }
            catch (NoSuchFieldError nosuchfielderror9) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_MY_PIN.ordinal()] = 9;
            }
            catch (NoSuchFieldError nosuchfielderror8) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PIN_HEADER.ordinal()] = 10;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PINNER_HEADER.ordinal()] = 11;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_BOARD_HEADER.ordinal()] = 12;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.BOARD.ordinal()] = 13;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PINNER.ordinal()] = 14;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType = new int[com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.values().length];
            try
            {
                $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType[com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType[com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PINNER.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType[com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.BOARD.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class SearchDropDownOnItemClickListener
        implements android.widget.AdapterView.OnItemClickListener
    {

        final SearchTypeaheadFragment this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
_L2:
            return;
            if (_searchAdapter == null || _searchView == null || i >= _searchAdapter.getCount()) goto _L2; else goto _L1
_L1:
            adapterview = ((AdapterView) (_searchAdapter.getItem(i)));
            if (!(adapterview instanceof GuidedSearchTypeAheadItem)) goto _L2; else goto _L3
_L3:
            Object obj1;
            GuidedSearchTypeAheadItem guidedsearchtypeaheaditem;
            int j;
            int k;
            guidedsearchtypeaheaditem = (GuidedSearchTypeAheadItem)adapterview;
            adapterview = _searchView.getQueryText();
            j = 1;
            k = j;
            obj1 = adapterview;
            _cls2..SwitchMap.com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType[guidedsearchtypeaheaditem.getItemType().ordinal()];
            JVM INSTR tableswitch 1 12: default 156
        //                       1 162
        //                       2 162
        //                       3 162
        //                       4 549
        //                       5 549
        //                       6 549
        //                       7 549
        //                       8 549
        //                       9 549
        //                       10 566
        //                       11 566
        //                       12 566;
               goto _L4 _L5 _L5 _L5 _L6 _L6 _L6 _L6 _L6 _L6 _L7 _L7 _L7
_L5:
            break; /* Loop/switch isn't completed */
_L4:
            k = 0;
            obj1 = adapterview;
_L19:
            Object obj;
            com.pinterest.activity.search.model.QueryMetaData.ContextType contexttype;
            HashMap hashmap;
            contexttype = com.pinterest.activity.search.model.QueryMetaData.ContextType.AUTO_COMPLETE;
            hashmap = new HashMap();
            j = i - 2;
            view = null;
            obj = null;
            adapterview = null;
            _cls2..SwitchMap.com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType[guidedsearchtypeaheaditem.getItemType().ordinal()];
            JVM INSTR tableswitch 1 14: default 272
        //                       1 648
        //                       2 621
        //                       3 593
        //                       4 577
        //                       5 593
        //                       6 661
        //                       7 661
        //                       8 661
        //                       9 661
        //                       10 272
        //                       11 272
        //                       12 272
        //                       13 605
        //                       14 631;
               goto _L8 _L9 _L10 _L11 _L12 _L11 _L13 _L13 _L13 _L13 _L8 _L8 _L8 _L14 _L15
_L8:
            view = null;
            adapterview = "";
            obj = contexttype;
_L17:
            int i1;
label0:
            {
                if (!StringUtils.isEmpty(adapterview))
                {
                    hashmap.put("autocomplete_type", adapterview);
                }
                i1 = j;
                if (guidedsearchtypeaheaditem.getItemType() != com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.BOARD)
                {
                    break label0;
                }
                if (!TextUtils.equals(_searchMode, "VALUE_SEARCH_LOCAL"))
                {
                    i1 = j;
                    if (!TextUtils.equals(_searchMode, "VALUE_SEARCH_LIBRARY"))
                    {
                        break label0;
                    }
                }
                i1 = i - 3;
            }
            hashmap.put("result_index", String.valueOf(i1));
            hashmap.put("entered_query", _searchAdapter.getCurrentSearchTerm());
            hashmap.put("selected_query", obj1);
            Pinalytics.a(ElementType.AUTOCOMPLETE_SUGGESTION, ComponentType.TYPEAHEAD_SUGGESTIONS, hashmap);
            if (guidedsearchtypeaheaditem.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN_LOCAL_CACHE)
            {
                Pinalytics.a(ElementType.AUTOCOMPLETE_SUGGESTION_LC1, ComponentType.TYPEAHEAD_SUGGESTIONS, hashmap);
            } else
            if (guidedsearchtypeaheaditem.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN)
            {
                Pinalytics.a(ElementType.AUTOCOMPLETE_SUGGESTION_LC2, ComponentType.TYPEAHEAD_SUGGESTIONS, hashmap);
            }
            if (k != 0)
            {
                adapterview = new QueryMetaData(((String) (obj1)), ((com.pinterest.activity.search.model.QueryMetaData.ContextType) (obj)));
                adapterview.setPosition(i1);
                _searchView.addQueryMetaData(adapterview);
                _searchView.addQueryList(((String) (obj1)));
                _searchView.setLastQueryData(adapterview);
                _searchView.setLastQueryState(com.pinterest.activity.search.model.QueryMetaData.FilterState.ADDED);
                _searchView.clearQueryText();
                adapterview = new GuidedSearchEvent(((String) (obj1)), _searchType);
                if (_searchType == com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN)
                {
                    StopWatch.get().start("search_ttrfp");
                }
                Events.post(adapterview);
                return;
            }
            break; /* Loop/switch isn't completed */
_L6:
            obj1 = StringUtils.trimToEmpty(guidedsearchtypeaheaditem.getTitle());
            k = j;
            continue; /* Loop/switch isn't completed */
_L7:
            _searchView.getFocus();
            return;
_L12:
            adapterview = new Navigation(Location.PIN, guidedsearchtypeaheaditem.getUid());
_L11:
            view = adapterview;
            adapterview = "query";
            obj = contexttype;
            continue; /* Loop/switch isn't completed */
_L14:
            view = new Navigation(Location.BOARD, guidedsearchtypeaheaditem.getUid());
_L10:
            adapterview = "board";
            obj = contexttype;
            continue; /* Loop/switch isn't completed */
_L15:
            obj = new Navigation(Location.USER, guidedsearchtypeaheaditem.getUid());
_L9:
            view = ((View) (obj));
            adapterview = "user";
            obj = contexttype;
            continue; /* Loop/switch isn't completed */
_L13:
            j = i - 1;
            obj = com.pinterest.activity.search.model.QueryMetaData.ContextType.RECENT_HISTORY;
            view = null;
            adapterview = "recent_query";
            if (true) goto _L17; else goto _L16
_L16:
            if (view != null)
            {
                Events.post(view);
                return;
            }
            WebhookActivity.openLink(getActivity(), guidedsearchtypeaheaditem.getIdentifier());
            return;
            if (true) goto _L19; else goto _L18
_L18:
        }

        public SearchDropDownOnItemClickListener()
        {
            this$0 = SearchTypeaheadFragment.this;
            super();
        }
    }

}
