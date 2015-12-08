// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.adapter;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.pinterest.activity.search.model.GuidedSearchTypeAheadItem;
import com.pinterest.activity.search.ui.MultiObjectTypeaheadDropDownCell;
import com.pinterest.api.remote.SearchApi;
import com.pinterest.base.Device;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultiObjectSearchTypeAheadAdapter extends BaseAdapter
    implements Filterable
{

    private String _apiTag;
    private Map _cacheditemsMap;
    protected boolean _commerceOnly;
    private Context _context;
    private String _currentSearchTerm;
    private Handler _handler;
    private Map _itemsMap;
    private LayoutInflater _li;
    private String _searchMode;
    private com.pinterest.api.remote.SearchApi.Scope _searchScope;
    private com.pinterest.activity.search.event.GuidedSearchEvent.SearchType _searchType;
    private android.view.View.OnClickListener onDeleteAllRecentQueries;
    private android.view.View.OnClickListener onDeleteSingleRecentQuery;

    public MultiObjectSearchTypeAheadAdapter(Context context)
    {
        _itemsMap = Collections.emptyMap();
        _cacheditemsMap = Collections.emptyMap();
        _currentSearchTerm = "";
        _searchScope = com.pinterest.api.remote.SearchApi.Scope.d;
        _searchType = com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN;
        onDeleteAllRecentQueries = new _cls7();
        onDeleteSingleRecentQuery = new _cls8();
        _context = context;
        _li = (LayoutInflater)context.getSystemService("layout_inflater");
        _handler = new Handler();
    }

    private void mergeApiResultsWithDBData(List list, com.pinterest.activity.search.event.GuidedSearchEvent.SearchType searchtype)
    {
        Object obj;
        com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType itemtype;
        if (_itemsMap.get(searchtype) != null)
        {
            obj = (List)_itemsMap.get(searchtype);
        } else
        {
            obj = new ArrayList();
        }
        if (((List) (obj)).size() == 1 && ((GuidedSearchTypeAheadItem)((List) (obj)).get(0)).getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN_SECTION_FOOTER)
        {
            ((List) (obj)).clear();
        }
        itemtype = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN;
        if (searchtype == com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN)
        {
            int j;
            if (Device.isTablet())
            {
                searchtype = Integer.valueOf(SearchApi.b);
            } else
            {
                searchtype = Integer.valueOf(SearchApi.a);
            }
            j = searchtype.intValue();
            if (((List) (obj)).size() < j)
            {
                for (int i = 0; i < list.size(); i++)
                {
                    searchtype = (GuidedSearchTypeAheadItem)list.get(i);
                    if (searchtype.getItemType() != itemtype)
                    {
                        break;
                    }
                    if (!((List) (obj)).contains(searchtype) && ((List) (obj)).size() < j)
                    {
                        ((List) (obj)).add(searchtype);
                    }
                }

                if (((List) (obj)).size() == 0)
                {
                    list = new GuidedSearchTypeAheadItem();
                    list.setTitle(Resources.string(0x7f0704e8, new Object[] {
                        _currentSearchTerm
                    }));
                    list.setItemType(com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN_SECTION_FOOTER);
                    ((List) (obj)).add(list);
                }
                _itemsMap.put(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN, obj);
            }
        }
    }

    private void setAutoCompleteData(List list)
    {
        Object obj = Collections.emptyList();
        if (!_itemsMap.isEmpty() && _itemsMap.get(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN) != null)
        {
            Object obj1 = (List)_itemsMap.get(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN);
            if (obj1 != null && !((List) (obj1)).isEmpty())
            {
                obj1 = (GuidedSearchTypeAheadItem)((List) (obj1)).get(0);
                if (obj1 != null && ((GuidedSearchTypeAheadItem) (obj1)).getItemType() != com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PIN_HEADER)
                {
                    obj = new ArrayList();
                    ((List) (obj)).addAll((Collection)_itemsMap.get(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN));
                }
            }
        }
        _itemsMap = new HashMap();
        if (!((List) (obj)).isEmpty())
        {
            _itemsMap.put(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN, obj);
        }
        mergeApiResultsWithDBData(list, com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN);
        setSectionedAutoCompleteData(list, com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PINNER);
        setSectionedAutoCompleteData(list, com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.BOARD);
    }

    private void setSectionedAutoCompleteData(List list, com.pinterest.activity.search.event.GuidedSearchEvent.SearchType searchtype)
    {
        Object obj;
        Object obj1;
        Object obj2;
        com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType itemtype;
        com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType itemtype1;
        ArrayList arraylist;
        if (_itemsMap.isEmpty())
        {
            _itemsMap = new HashMap();
        }
        arraylist = new ArrayList();
        obj2 = "";
        itemtype1 = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PIN_HEADER;
        itemtype = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN;
        obj1 = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PIN;
        obj = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PINNER_SECTION_FOOTER;
        _cls9..SwitchMap.com.pinterest.activity.search.event.GuidedSearchEvent.SearchType[searchtype.ordinal()];
        JVM INSTR tableswitch 1 4: default 92
    //                   1 267
    //                   2 300
    //                   3 333
    //                   4 366;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        Object obj3;
        obj3 = obj1;
        obj1 = obj2;
        obj2 = obj;
        obj = itemtype1;
_L7:
        Object obj5 = obj;
        Object obj4 = obj1;
        if (_searchScope == com.pinterest.api.remote.SearchApi.Scope.b)
        {
            obj5 = obj;
            obj4 = obj1;
            if (searchtype == com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN)
            {
                obj5 = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.EMPTY_SPACE_HEADER;
                obj4 = "";
            }
        }
        obj = new GuidedSearchTypeAheadItem();
        ((GuidedSearchTypeAheadItem) (obj)).setTitle(((String) (obj4)));
        ((GuidedSearchTypeAheadItem) (obj)).setItemType(((com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType) (obj5)));
        arraylist.add(obj);
        int i = 0;
        do
        {
            if (i >= list.size())
            {
                break;
            }
            obj = (GuidedSearchTypeAheadItem)list.get(i);
            if (((GuidedSearchTypeAheadItem) (obj)).getItemType() == itemtype || ((GuidedSearchTypeAheadItem) (obj)).getItemType() == obj3 || ((GuidedSearchTypeAheadItem) (obj)).getItemType() == com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN_LOCAL_CACHE)
            {
                if (((GuidedSearchTypeAheadItem) (obj)).getItemType() == obj3 && arraylist.size() == 4)
                {
                    break;
                }
                arraylist.add(obj);
            }
            i++;
        } while (true);
        break; /* Loop/switch isn't completed */
_L2:
        obj = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PIN_HEADER;
        obj1 = Resources.string(0x7f070485).toUpperCase();
        itemtype = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN;
        obj3 = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PIN;
        obj2 = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN_SECTION_FOOTER;
        continue; /* Loop/switch isn't completed */
_L3:
        obj1 = Resources.string(0x7f0704ef).toUpperCase();
        obj = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PINNER_HEADER;
        itemtype = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PINNER;
        obj3 = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PINNER;
        obj2 = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PINNER_SECTION_FOOTER;
        continue; /* Loop/switch isn't completed */
_L4:
        obj1 = Resources.string(0x7f0704e6).toUpperCase();
        obj = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_BOARD_HEADER;
        itemtype = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.BOARD;
        obj3 = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_BOARD;
        obj2 = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.BOARD_SECTION_FOOTER;
        continue; /* Loop/switch isn't completed */
_L5:
        String s = Resources.string(0x7f0704ee).toUpperCase();
        obj2 = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.TRENDING_QUERY_HEADER;
        itemtype = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.TRENDING_QUERY;
        obj3 = obj;
        obj = obj2;
        obj2 = obj3;
        obj3 = obj1;
        obj1 = s;
        if (true) goto _L7; else goto _L6
_L6:
        if (arraylist.size() == 1)
        {
            arraylist.clear();
        }
        if (_searchScope == com.pinterest.api.remote.SearchApi.Scope.b && searchtype == com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PINNER && arraylist.size() > 1)
        {
            list = new GuidedSearchTypeAheadItem();
            list.setTitle(Resources.string(0x7f0704eb, new Object[] {
                _currentSearchTerm
            }));
            list.setItemType(((com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType) (obj2)));
            arraylist.add(list);
        }
        if (_searchScope == com.pinterest.api.remote.SearchApi.Scope.b && searchtype == com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.BOARD && arraylist.size() > 1)
        {
            list = new GuidedSearchTypeAheadItem();
            list.setTitle(Resources.string(0x7f0704e5, new Object[] {
                _currentSearchTerm
            }));
            list.setItemType(((com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType) (obj2)));
            arraylist.add(list);
        }
        if (_searchScope == com.pinterest.api.remote.SearchApi.Scope.b && searchtype == com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN && arraylist.size() == 0)
        {
            list = new GuidedSearchTypeAheadItem();
            list.setTitle(Resources.string(0x7f0704e8, new Object[] {
                _currentSearchTerm
            }));
            list.setItemType(((com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType) (obj2)));
            arraylist.add(list);
        }
        _itemsMap.put(searchtype, arraylist);
        return;
    }

    private void updateData(final String searchTerm, final List newData)
    {
        _handler.post(new _cls3());
    }

    private void updateTrendingData(final List newData)
    {
        _handler.post(new _cls4());
    }

    public int getCount()
    {
        boolean flag = false;
        int i;
        int k;
        if (_itemsMap.get(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN) != null)
        {
            i = ((List)_itemsMap.get(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN)).size();
        } else
        {
            i = 0;
        }
        k = i + 0;
        if (isCommerceOnly())
        {
            return k;
        }
        int j;
        if (_itemsMap.get(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PINNER) != null)
        {
            i = ((List)_itemsMap.get(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PINNER)).size();
        } else
        {
            i = 0;
        }
        if (_itemsMap.get(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.BOARD) != null)
        {
            j = ((List)_itemsMap.get(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.BOARD)).size();
        } else
        {
            j = 0;
        }
        j = k + i + j;
        if (Experiments.t())
        {
            i = ((flag) ? 1 : 0);
            if (_itemsMap.get(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.TRENDING) != null)
            {
                i = ((List)_itemsMap.get(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.TRENDING)).size();
            }
            return j + i;
        } else
        {
            return j;
        }
    }

    public String getCurrentSearchTerm()
    {
        return _currentSearchTerm;
    }

    public Filter getFilter()
    {
        return new _cls2();
    }

    public Object getItem(int i)
    {
        ArrayList arraylist = new ArrayList();
        if (_itemsMap.get(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN) != null)
        {
            arraylist.addAll((Collection)_itemsMap.get(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN));
        }
        if (_itemsMap.get(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PINNER) != null)
        {
            arraylist.addAll((Collection)_itemsMap.get(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PINNER));
        }
        if (_itemsMap.get(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.BOARD) != null)
        {
            arraylist.addAll((Collection)_itemsMap.get(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.BOARD));
        }
        if (Experiments.t() && _itemsMap.get(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.TRENDING) != null)
        {
            arraylist.addAll((Collection)_itemsMap.get(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.TRENDING));
        }
        return arraylist.get(i);
    }

    public int getItemCountByType(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType searchtype)
    {
        if (!_itemsMap.isEmpty() && _itemsMap.get(searchtype) != null)
        {
            return ((List)_itemsMap.get(searchtype)).size();
        } else
        {
            return 0;
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view instanceof MultiObjectTypeaheadDropDownCell)
        {
            view = (MultiObjectTypeaheadDropDownCell)view;
        } else
        {
            view = (MultiObjectTypeaheadDropDownCell)_li.inflate(0x7f03015e, viewgroup, false);
            view.setRecentHistoryClearOnClickListener(onDeleteAllRecentQueries);
            view.setRightIvOnClickListener(onDeleteSingleRecentQuery);
        }
        view.setOnTouchListener(new _cls1());
        viewgroup = (GuidedSearchTypeAheadItem)getItem(i);
        view.setCurrentSearchTerm(_currentSearchTerm);
        view.setItem(viewgroup);
        return view;
    }

    public boolean isCommerceOnly()
    {
        return _commerceOnly;
    }

    public void loadCachedData()
    {
        _handler.post(new _cls5());
    }

    public void loadSearchTypeaheadData(final String searchTerm, final List newData)
    {
        _handler.post(new _cls6());
    }

    public void setApiTag(String s)
    {
        _apiTag = s;
    }

    public void setCommerceOnly(boolean flag)
    {
        _commerceOnly = flag;
    }

    public void setSearchMode(String s)
    {
        _searchMode = s;
    }

    public void setSearchScope(com.pinterest.api.remote.SearchApi.Scope scope)
    {
        _searchScope = scope;
    }

    public void setSearchType(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType searchtype)
    {
        _searchType = searchtype;
    }





/*
    static Map access$102(MultiObjectSearchTypeAheadAdapter multiobjectsearchtypeaheadadapter, Map map)
    {
        multiobjectsearchtypeaheadadapter._itemsMap = map;
        return map;
    }

*/



/*
    static String access$202(MultiObjectSearchTypeAheadAdapter multiobjectsearchtypeaheadadapter, String s)
    {
        multiobjectsearchtypeaheadadapter._currentSearchTerm = s;
        return s;
    }

*/





/*
    static Map access$502(MultiObjectSearchTypeAheadAdapter multiobjectsearchtypeaheadadapter, Map map)
    {
        multiobjectsearchtypeaheadadapter._cacheditemsMap = map;
        return map;
    }

*/




    private class _cls7
        implements android.view.View.OnClickListener
    {

        final MultiObjectSearchTypeAheadAdapter this$0;

        public void onClick(View view)
        {
            view = com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN;
            SearchApi.f("PIN", new DeleteRecentQueryApiResponse(null), _apiTag);
            if (_itemsMap.get(view) != null)
            {
                ((List)_itemsMap.get(view)).clear();
                _cacheditemsMap = _itemsMap;
                notifyDataSetChanged();
            }
        }

        _cls7()
        {
            this$0 = MultiObjectSearchTypeAheadAdapter.this;
            super();
        }

        private class DeleteRecentQueryApiResponse extends BaseApiResponseHandler
        {

            final MultiObjectSearchTypeAheadAdapter this$0;

            public void onFailure(Throwable throwable, ApiResponse apiresponse)
            {
                Application.showToast(apiresponse.getMessage());
            }

            public void onSuccess(ApiResponse apiresponse)
            {
            }

            private DeleteRecentQueryApiResponse()
            {
                this$0 = MultiObjectSearchTypeAheadAdapter.this;
                super();
            }

            DeleteRecentQueryApiResponse(_cls1 _pcls1)
            {
                this();
            }
        }

    }


    private class _cls8
        implements android.view.View.OnClickListener
    {

        final MultiObjectSearchTypeAheadAdapter this$0;

        public void onClick(View view)
        {
            GuidedSearchTypeAheadItem guidedsearchtypeaheaditem = (GuidedSearchTypeAheadItem)view.getTag();
            _cls9..SwitchMap.com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType[guidedsearchtypeaheaditem.getItemType().ordinal()];
            JVM INSTR tableswitch 1 4: default 48
        //                       1 194
        //                       2 204
        //                       3 214
        //                       4 224;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            com.pinterest.activity.search.event.GuidedSearchEvent.SearchType searchtype;
            searchtype = com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN;
            view = "PIN";
_L7:
            SearchApi.d(guidedsearchtypeaheaditem.getTitle(), view, new DeleteRecentQueryApiResponse(null), _apiTag);
            if (_itemsMap.get(searchtype) != null && ((List)_itemsMap.get(searchtype)).remove(guidedsearchtypeaheaditem))
            {
                _cacheditemsMap = _itemsMap;
                notifyDataSetChanged();
            }
            if (((List)_itemsMap.get(searchtype)).size() == 1)
            {
                ((List)_itemsMap.get(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN)).clear();
            }
            return;
_L2:
            searchtype = com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN;
            view = "PIN";
            continue; /* Loop/switch isn't completed */
_L3:
            searchtype = com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.BOARD;
            view = "BOARD";
            continue; /* Loop/switch isn't completed */
_L4:
            searchtype = com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PINNER;
            view = "USER";
            continue; /* Loop/switch isn't completed */
_L5:
            searchtype = com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN;
            view = "PERSONAL";
            if (true) goto _L7; else goto _L6
_L6:
        }

        _cls8()
        {
            this$0 = MultiObjectSearchTypeAheadAdapter.this;
            super();
        }
    }


    private class _cls9
    {

        static final int $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType[];
        static final int $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[];

        static 
        {
            $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType = new int[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.values().length];
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PIN.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror7) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_BOARD.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PINNER.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_MY_PIN.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType = new int[com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.values().length];
            try
            {
                $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType[com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror3) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType[com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PINNER.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror2) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType[com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.BOARD.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$event$GuidedSearchEvent$SearchType[com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.TRENDING.ordinal()] = 4;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class _cls3
        implements Runnable
    {

        final MultiObjectSearchTypeAheadAdapter this$0;
        final List val$newData;
        final String val$searchTerm;

        public void run()
        {
            if (TextUtils.equals(searchTerm, _currentSearchTerm))
            {
                if (_searchScope == com.pinterest.api.remote.SearchApi.Scope.d)
                {
                    if (!_itemsMap.isEmpty())
                    {
                        _itemsMap.remove(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PINNER);
                        _itemsMap.remove(com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.BOARD);
                    }
                    setSectionedAutoCompleteData(newData, com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN);
                    _cacheditemsMap = _itemsMap;
                } else
                {
                    setAutoCompleteData(newData);
                }
                notifyDataSetChanged();
            }
        }

        _cls3()
        {
            this$0 = MultiObjectSearchTypeAheadAdapter.this;
            searchTerm = s;
            newData = list;
            super();
        }
    }


    private class _cls4
        implements Runnable
    {

        final MultiObjectSearchTypeAheadAdapter this$0;
        final List val$newData;

        public void run()
        {
            setSectionedAutoCompleteData(newData, com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.TRENDING);
            notifyDataSetChanged();
        }

        _cls4()
        {
            this$0 = MultiObjectSearchTypeAheadAdapter.this;
            newData = list;
            super();
        }
    }


    private class _cls2 extends Filter
    {

        final MultiObjectSearchTypeAheadAdapter this$0;

        protected android.widget.Filter.FilterResults performFiltering(CharSequence charsequence)
        {
            charsequence = new android.widget.Filter.FilterResults();
            List list = (List)_itemsMap.get(_searchType);
            charsequence.values = list;
            charsequence.count = list.size();
            return charsequence;
        }

        protected void publishResults(CharSequence charsequence, android.widget.Filter.FilterResults filterresults)
        {
        }

        _cls2()
        {
            this$0 = MultiObjectSearchTypeAheadAdapter.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnTouchListener
    {

        final MultiObjectSearchTypeAheadAdapter this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            if (motionevent.getAction() == 0)
            {
                Device.hideSoftKeyboard(view);
            }
            return false;
        }

        _cls1()
        {
            this$0 = MultiObjectSearchTypeAheadAdapter.this;
            super();
        }
    }


    private class _cls5
        implements Runnable
    {

        final MultiObjectSearchTypeAheadAdapter this$0;

        public void run()
        {
            if (_cacheditemsMap != null && !_cacheditemsMap.isEmpty())
            {
                _itemsMap = _cacheditemsMap;
                notifyDataSetChanged();
            }
        }

        _cls5()
        {
            this$0 = MultiObjectSearchTypeAheadAdapter.this;
            super();
        }
    }


    private class _cls6
        implements Runnable
    {

        final MultiObjectSearchTypeAheadAdapter this$0;
        final List val$newData;
        final String val$searchTerm;

        public void run()
        {
            if (TextUtils.equals(searchTerm, _currentSearchTerm))
            {
                _itemsMap.clear();
                setSectionedAutoCompleteData(newData, com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN);
                notifyDataSetChanged();
            }
        }

        _cls6()
        {
            this$0 = MultiObjectSearchTypeAheadAdapter.this;
            searchTerm = s;
            newData = list;
            super();
        }
    }

}
