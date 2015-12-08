// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import butterknife.ButterKnife;
import com.pinterest.activity.search.adapter.MultiObjectSearchTypeAheadAdapter;
import com.pinterest.activity.search.model.GuidedSearchTypeAheadItem;
import com.pinterest.activity.search.ui.GuidedSearchBar;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.SearchTypeahead;
import com.pinterest.api.remote.SearchApi;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.reporting.CrashReporting;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class MultiObjectSearchTypeAheadFragment extends BaseFragment
{

    private static final int MAX_TYPEAHEAD_LOCAL_SUGGESTIONS = 5;
    protected boolean _commerceOnly;
    private boolean _isTypeaheadCachePopulated;
    ListView _listView;
    private String _query;
    private MultiObjectSearchTypeAheadAdapter _searchAdapter;
    private String _searchMode;
    com.pinterest.api.remote.SearchApi.Scope _searchScope;
    private com.pinterest.activity.search.event.GuidedSearchEvent.SearchType _searchType;
    private GuidedSearchBar _searchView;

    public MultiObjectSearchTypeAheadFragment()
    {
        _searchType = com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN;
        _layoutId = 0x7f0300de;
        _isTypeaheadCachePopulated = Preferences.persisted().getBoolean("PREF_TYPEAHEAD_CACHE_READY", false);
    }

    private void loadSuggestionsFromDB(String s)
    {
        List list;
        ArrayList arraylist;
        list = ModelHelper.getSearchTypeaheadList(s);
        arraylist = new ArrayList();
        int i = 0;
_L2:
        if (i >= Math.min(list.size(), 5))
        {
            break; /* Loop/switch isn't completed */
        }
        GuidedSearchTypeAheadItem guidedsearchtypeaheaditem = new GuidedSearchTypeAheadItem();
        guidedsearchtypeaheaditem.setTitle(((SearchTypeahead)list.get(i)).getQuery());
        guidedsearchtypeaheaditem.setItemType(com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN_LOCAL_CACHE);
        arraylist.add(guidedsearchtypeaheaditem);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        try
        {
            _searchAdapter.loadSearchTypeaheadData(s, arraylist);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            CrashReporting.a(s);
        }
        return;
    }

    public boolean isCommerceOnly()
    {
        return _commerceOnly;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _searchAdapter = new MultiObjectSearchTypeAheadAdapter(getActivity());
        _searchAdapter.setCommerceOnly(isCommerceOnly());
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

    public void onViewCreated(View view, Bundle bundle)
    {
        ButterKnife.a(this, view);
        super.onViewCreated(view, bundle);
        _listView.setAdapter(_searchAdapter);
        _listView.setOnItemClickListener(new SearchDropDownOnItemClickListener());
        _searchAdapter.setSearchMode(_searchMode);
        if (_searchAdapter.getCount() == 0)
        {
            reload(_query, _searchScope);
        }
    }

    public void reload(final String query, com.pinterest.api.remote.SearchApi.Scope scope)
    {
        if (_searchAdapter != null)
        {
            if (StringUtils.isEmpty(query))
            {
                _searchAdapter.loadCachedData();
                if (Experiments.t())
                {
                    MultiObjectSearchTypeAheadAdapter multiobjectsearchtypeaheadadapter = _searchAdapter;
                    multiobjectsearchtypeaheadadapter.getClass();
                    SearchApi.b(new com.pinterest.activity.search.adapter.MultiObjectSearchTypeAheadAdapter.TrendingQueriesApiHandler(multiobjectsearchtypeaheadadapter), getApiTag());
                }
            }
            _searchAdapter.setSearchScope(scope);
            if (query != null)
            {
                if (scope == com.pinterest.api.remote.SearchApi.Scope.c)
                {
                    MultiObjectSearchTypeAheadAdapter multiobjectsearchtypeaheadadapter1 = _searchAdapter;
                    multiobjectsearchtypeaheadadapter1.getClass();
                    SearchApi.a(query, scope, new com.pinterest.activity.search.adapter.MultiObjectSearchTypeAheadAdapter.SearchTypeAheadApiHandler(multiobjectsearchtypeaheadadapter1, query), getApiTag());
                    return;
                }
                if (Experiments.b(true) && _isTypeaheadCachePopulated && _searchType == com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN && query.length() > 0)
                {
                    (new _cls1()).execute();
                }
                MultiObjectSearchTypeAheadAdapter multiobjectsearchtypeaheadadapter2 = _searchAdapter;
                multiobjectsearchtypeaheadadapter2.getClass();
                SearchApi.b(query, scope, new com.pinterest.activity.search.adapter.MultiObjectSearchTypeAheadAdapter.SearchTypeAheadApiHandler(multiobjectsearchtypeaheadadapter2, query), getApiTag());
                return;
            }
        }
    }

    public void setCommerceOnly(boolean flag)
    {
        _commerceOnly = flag;
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
    static com.pinterest.activity.search.event.GuidedSearchEvent.SearchType access$202(MultiObjectSearchTypeAheadFragment multiobjectsearchtypeaheadfragment, com.pinterest.activity.search.event.GuidedSearchEvent.SearchType searchtype)
    {
        multiobjectsearchtypeaheadfragment._searchType = searchtype;
        return searchtype;
    }

*/


    private class SearchDropDownOnItemClickListener
        implements android.widget.AdapterView.OnItemClickListener
    {

        final MultiObjectSearchTypeAheadFragment this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
_L2:
            return;
            if (_searchAdapter == null || _searchView == null || i >= _searchAdapter.getCount()) goto _L2; else goto _L1
_L1:
            adapterview = ((AdapterView) (_searchAdapter.getItem(i)));
            if (!(adapterview instanceof GuidedSearchTypeAheadItem)) goto _L2; else goto _L3
_L3:
            Object obj;
            GuidedSearchTypeAheadItem guidedsearchtypeaheaditem;
            boolean flag;
            boolean flag1;
            guidedsearchtypeaheaditem = (GuidedSearchTypeAheadItem)adapterview;
            adapterview = _searchView.getQueryText();
            flag1 = true;
            flag = flag1;
            obj = adapterview;
            _cls2..SwitchMap.com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType[guidedsearchtypeaheaditem.getItemType().ordinal()];
            JVM INSTR tableswitch 1 16: default 172
        //                       1 178
        //                       2 178
        //                       3 178
        //                       4 178
        //                       5 178
        //                       6 178
        //                       7 563
        //                       8 563
        //                       9 563
        //                       10 563
        //                       11 563
        //                       12 563
        //                       13 563
        //                       14 580
        //                       15 580
        //                       16 580;
               goto _L4 _L5 _L5 _L5 _L5 _L5 _L5 _L6 _L6 _L6 _L6 _L6 _L6 _L6 _L7 _L7 _L7
_L5:
            break; /* Loop/switch isn't completed */
_L4:
            flag = false;
            obj = adapterview;
_L21:
            com.pinterest.activity.search.model.QueryMetaData.ContextType contexttype;
            HashMap hashmap;
            contexttype = com.pinterest.activity.search.model.QueryMetaData.ContextType.AUTO_COMPLETE;
            hashmap = new HashMap();
            view = null;
            adapterview = null;
            _cls2..SwitchMap.com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType[guidedsearchtypeaheaditem.getItemType().ordinal()];
            JVM INSTR tableswitch 1 18: default 296
        //                       1 713
        //                       2 678
        //                       3 640
        //                       4 713
        //                       5 678
        //                       6 640
        //                       7 591
        //                       8 613
        //                       9 731
        //                       10 731
        //                       11 731
        //                       12 731
        //                       13 749
        //                       14 296
        //                       15 296
        //                       16 296
        //                       17 662
        //                       18 697;
               goto _L8 _L9 _L10 _L11 _L9 _L10 _L11 _L12 _L13 _L14 _L14 _L14 _L14 _L15 _L8 _L8 _L8 _L16 _L17
_L8:
            view = null;
            adapterview = "";
_L19:
            if (!StringUtils.isEmpty(adapterview))
            {
                hashmap.put("autocomplete_type", adapterview);
            }
            hashmap.put("result_index", String.valueOf(i));
            hashmap.put("entered_query", _searchAdapter.getCurrentSearchTerm());
            hashmap.put("selected_query", obj);
            Pinalytics.a(ElementType.AUTOCOMPLETE_SUGGESTION, ComponentType.TYPEAHEAD_SUGGESTIONS, hashmap);
            if (Experiments.t() && guidedsearchtypeaheaditem.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.TRENDING_QUERY)
            {
                Pinalytics.a(ElementType.TRENDING_QUERY, ComponentType.TYPEAHEAD_SUGGESTIONS);
            }
            if (Experiments.s())
            {
                if (guidedsearchtypeaheaditem.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PINNER_SECTION_FOOTER)
                {
                    Pinalytics.a(ElementType.MULTIOBJECT_PINNER_LOAD_MORE_BUTTON, ComponentType.TYPEAHEAD_SUGGESTIONS);
                }
                if (guidedsearchtypeaheaditem.getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.BOARD_SECTION_FOOTER)
                {
                    Pinalytics.a(ElementType.MULTIOBJECT_BOARD_LOAD_MORE_BUTTON, ComponentType.TYPEAHEAD_SUGGESTIONS);
                }
            }
            if (flag)
            {
                adapterview = new QueryMetaData(((String) (obj)), contexttype);
                adapterview.setPosition(i);
                _searchView.addQueryMetaData(adapterview);
                _searchView.addQueryList(((String) (obj)));
                _searchView.setLastQueryData(adapterview);
                _searchView.setLastQueryState(com.pinterest.activity.search.model.QueryMetaData.FilterState.ADDED);
                _searchView.clearQueryText();
                adapterview = new GuidedSearchEvent(((String) (obj)), _searchType);
                if (_searchType == com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN)
                {
                    StopWatch.get().start("search_ttrfp");
                }
                Events.post(adapterview);
                return;
            }
            break; /* Loop/switch isn't completed */
_L6:
            obj = StringUtils.trimToEmpty(guidedsearchtypeaheaditem.getTitle());
            flag = flag1;
            continue; /* Loop/switch isn't completed */
_L7:
            _searchView.getFocus();
            return;
_L12:
            view = new Navigation(Location.PIN, guidedsearchtypeaheaditem.getUid());
            adapterview = "query";
            continue; /* Loop/switch isn't completed */
_L13:
            view = new Navigation(Location.PIN, guidedsearchtypeaheaditem.getUid());
            contexttype = com.pinterest.activity.search.model.QueryMetaData.ContextType.AUTO_COMPLETE_CLIENT_CACHE;
            adapterview = "query";
            continue; /* Loop/switch isn't completed */
_L11:
            view = new Navigation(Location.PIN, guidedsearchtypeaheaditem.getUid());
            adapterview = "query";
            continue; /* Loop/switch isn't completed */
_L16:
            adapterview = new Navigation(Location.BOARD, guidedsearchtypeaheaditem.getUid());
_L10:
            _searchType = com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.BOARD;
            view = adapterview;
            adapterview = "board";
            continue; /* Loop/switch isn't completed */
_L17:
            view = new Navigation(Location.USER, guidedsearchtypeaheaditem.getUid());
_L9:
            _searchType = com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PINNER;
            adapterview = "user";
            continue; /* Loop/switch isn't completed */
_L14:
            i--;
            contexttype = com.pinterest.activity.search.model.QueryMetaData.ContextType.RECENT_HISTORY;
            view = null;
            adapterview = "recent_query";
            continue; /* Loop/switch isn't completed */
_L15:
            int j = _searchAdapter.getItemCountByType(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN);
            if (j == 0)
            {
                j = 1;
            } else
            {
                j++;
            }
            i -= j;
            contexttype = com.pinterest.activity.search.model.QueryMetaData.ContextType.TRENDING;
            view = null;
            adapterview = "trending";
            if (true) goto _L19; else goto _L18
_L18:
            if (view != null)
            {
                Events.post(view);
                return;
            }
            WebhookActivity.openLink(getActivity(), guidedsearchtypeaheaditem.getIdentifier());
            return;
            if (true) goto _L21; else goto _L20
_L20:
        }

        public SearchDropDownOnItemClickListener()
        {
            this$0 = MultiObjectSearchTypeAheadFragment.this;
            super();
        }

        private class _cls2
        {

            static final int $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[];

            static 
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType = new int[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.values().length];
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PINNER_SEARCH_ALL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.BOARD_SEARCH_ALL.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN_SEARCH_ALL.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PINNER_SECTION_FOOTER.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.BOARD_SECTION_FOOTER.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN_SECTION_FOOTER.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN_LOCAL_CACHE.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PIN.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_BOARD.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PINNER.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_MY_PIN.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.TRENDING_QUERY.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PIN_HEADER.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PINNER_HEADER.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_BOARD_HEADER.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.BOARD.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PINNER.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }


    private class _cls1 extends BackgroundTask
    {

        final MultiObjectSearchTypeAheadFragment this$0;
        final String val$query;

        public void run()
        {
            loadSuggestionsFromDB(query);
        }

        _cls1()
        {
            this$0 = MultiObjectSearchTypeAheadFragment.this;
            query = s;
            super();
        }
    }

}
