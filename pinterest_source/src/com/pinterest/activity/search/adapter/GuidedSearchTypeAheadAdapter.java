// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.adapter;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.pinterest.activity.search.model.GuidedSearchTypeAheadItem;
import com.pinterest.activity.search.ui.GuidedSearchDropDownCell;
import com.pinterest.kit.application.Resources;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GuidedSearchTypeAheadAdapter extends BaseAdapter
    implements Filterable
{

    private String _apiTag;
    private Map _cacheditemsMap;
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

    public GuidedSearchTypeAheadAdapter(Context context)
    {
        _itemsMap = Collections.emptyMap();
        _cacheditemsMap = Collections.emptyMap();
        _currentSearchTerm = "";
        _searchScope = com.pinterest.api.remote.SearchApi.Scope.d;
        _searchType = com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN;
        onDeleteAllRecentQueries = new _cls4();
        onDeleteSingleRecentQuery = new _cls5();
        _context = context;
        _li = (LayoutInflater)context.getSystemService("layout_inflater");
        _handler = new Handler();
    }

    private void setAutoCompleteData(List list)
    {
        if (_itemsMap.isEmpty())
        {
            _itemsMap = new HashMap();
        }
        if (TextUtils.equals(_searchMode, "VALUE_SEARCH_LOCAL") || TextUtils.equals(_searchMode, "VALUE_SEARCH_LIBRARY"))
        {
            setSectionedAutoCompleteData(list, com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN);
            return;
        } else
        {
            setSectionedAutoCompleteData(list, com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN);
            setSectionedAutoCompleteData(list, com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PINNER);
            setSectionedAutoCompleteData(list, com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.BOARD);
            return;
        }
    }

    private void setSectionedAutoCompleteData(List list, com.pinterest.activity.search.event.GuidedSearchEvent.SearchType searchtype)
    {
        Object obj;
        com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType itemtype;
        com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType itemtype1;
        Object obj1;
        com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType itemtype2;
        ArrayList arraylist;
        String s;
        arraylist = new ArrayList();
        s = Resources.string(0x7f0704ed, new Object[] {
            _currentSearchTerm
        });
        obj1 = "";
        itemtype2 = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN_SEARCH_ALL;
        obj = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PIN_HEADER;
        itemtype1 = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN;
        itemtype = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PIN;
        _cls6..SwitchMap.com.pinterest.activity.search.event.GuidedSearchEvent.SearchType[searchtype.ordinal()];
        JVM INSTR tableswitch 1 3: default 84
    //                   1 200
    //                   2 276
    //                   3 305;
           goto _L1 _L2 _L3 _L4
_L1:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_305;
_L5:
        GuidedSearchTypeAheadItem guidedsearchtypeaheaditem;
        guidedsearchtypeaheaditem = new GuidedSearchTypeAheadItem();
        if (_searchScope == com.pinterest.api.remote.SearchApi.Scope.b || _searchScope == com.pinterest.api.remote.SearchApi.Scope.c)
        {
            guidedsearchtypeaheaditem.setTitle(s);
            guidedsearchtypeaheaditem.setItemType(itemtype2);
        } else
        {
            guidedsearchtypeaheaditem.setTitle(((String) (obj1)));
            guidedsearchtypeaheaditem.setItemType(((com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType) (obj)));
        }
        obj = new ArrayList();
        for (int i = 0; i < list.size(); i++)
        {
            obj1 = (GuidedSearchTypeAheadItem)list.get(i);
            if (((GuidedSearchTypeAheadItem) (obj1)).getItemType() == itemtype1 || ((GuidedSearchTypeAheadItem) (obj1)).getItemType() == itemtype)
            {
                ((List) (obj)).add(obj1);
            }
        }

        break MISSING_BLOCK_LABEL_350;
_L2:
        itemtype2 = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN_SEARCH_ALL;
        obj = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PIN_HEADER;
        if (TextUtils.equals(_searchMode, "VALUE_SEARCH_LOCAL") || TextUtils.equals(_searchMode, "VALUE_SEARCH_LIBRARY"))
        {
            obj1 = Resources.string(0x7f070485).toUpperCase();
            itemtype1 = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.BOARD;
            itemtype = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_MY_PIN;
        } else
        {
            obj1 = Resources.string(0x7f0704ea);
            itemtype1 = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PIN;
            itemtype = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PIN;
        }
          goto _L5
_L3:
        obj1 = Resources.string(0x7f0704ec);
        itemtype2 = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PINNER_SEARCH_ALL;
        obj = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PINNER_HEADER;
        itemtype1 = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.PINNER;
        itemtype = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PINNER;
          goto _L5
        obj1 = Resources.string(0x7f0704e7);
        itemtype2 = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.BOARD_SEARCH_ALL;
        obj = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_BOARD_HEADER;
        itemtype1 = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.BOARD;
        itemtype = com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_BOARD;
          goto _L5
        if (((List) (obj)).size() != 0)
        {
            arraylist.add(guidedsearchtypeaheaditem);
        }
        if (_searchScope == com.pinterest.api.remote.SearchApi.Scope.c && ((List) (obj)).size() > 0)
        {
            list = new GuidedSearchTypeAheadItem();
            list.setTitle(Resources.string(0x7f07061c));
            list.setItemType(com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_BOARD_HEADER);
            arraylist.add(list);
        }
        arraylist.addAll(((java.util.Collection) (obj)));
        _itemsMap.put(searchtype, arraylist);
        return;
    }

    private void updateData(final String searchTerm, final List newData)
    {
        _handler.post(new _cls3());
    }

    public int getCount()
    {
        if (_itemsMap.get(_searchType) != null)
        {
            return ((List)_itemsMap.get(_searchType)).size();
        } else
        {
            return 0;
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
        List list = (List)_itemsMap.get(_searchType);
        if (list == null)
        {
            return null;
        } else
        {
            return (GuidedSearchTypeAheadItem)list.get(i);
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view instanceof GuidedSearchDropDownCell)
        {
            view = (GuidedSearchDropDownCell)view;
        } else
        {
            view = (GuidedSearchDropDownCell)_li.inflate(0x7f030157, viewgroup, false);
            view.setRecentHistoryClearOnClickListener(onDeleteAllRecentQueries);
            view.setRightIvOnClickListener(onDeleteSingleRecentQuery);
        }
        view.setOnTouchListener(new _cls1());
        view.setItem((GuidedSearchTypeAheadItem)getItem(i));
        if (TextUtils.equals(_searchMode, "VALUE_SEARCH_LIBRARY"))
        {
            view.useLibraryStyle();
        }
        return view;
    }

    public void loadCachedData()
    {
        if (_cacheditemsMap != null && !_cacheditemsMap.isEmpty())
        {
            _itemsMap = _cacheditemsMap;
            notifyDataSetChanged();
        }
    }

    public void setApiTag(String s)
    {
        _apiTag = s;
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
    static String access$202(GuidedSearchTypeAheadAdapter guidedsearchtypeaheadadapter, String s)
    {
        guidedsearchtypeaheadadapter._currentSearchTerm = s;
        return s;
    }

*/




/*
    static Map access$502(GuidedSearchTypeAheadAdapter guidedsearchtypeaheadadapter, Map map)
    {
        guidedsearchtypeaheadadapter._cacheditemsMap = map;
        return map;
    }

*/



    private class _cls4
        implements android.view.View.OnClickListener
    {

        final GuidedSearchTypeAheadAdapter this$0;

        public void onClick(View view)
        {
            view = com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.PIN;
            SearchApi.f("PERSONAL", new DeleteRecentQueryApiResponse(null), _apiTag);
            if (_itemsMap.get(view) != null)
            {
                ((List)_itemsMap.get(view)).clear();
                _cacheditemsMap = _itemsMap;
                notifyDataSetChanged();
            }
        }

        _cls4()
        {
            this$0 = GuidedSearchTypeAheadAdapter.this;
            super();
        }

        private class DeleteRecentQueryApiResponse extends BaseApiResponseHandler
        {

            final GuidedSearchTypeAheadAdapter this$0;

            public void onFailure(Throwable throwable, ApiResponse apiresponse)
            {
                Application.showToast(apiresponse.getMessage());
            }

            public void onSuccess(ApiResponse apiresponse)
            {
            }

            private DeleteRecentQueryApiResponse()
            {
                this$0 = GuidedSearchTypeAheadAdapter.this;
                super();
            }

            DeleteRecentQueryApiResponse(_cls1 _pcls1)
            {
                this();
            }
        }

    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final GuidedSearchTypeAheadAdapter this$0;

        public void onClick(View view)
        {
            GuidedSearchTypeAheadItem guidedsearchtypeaheaditem = (GuidedSearchTypeAheadItem)view.getTag();
            _cls6..SwitchMap.com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType[guidedsearchtypeaheaditem.getItemType().ordinal()];
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

        _cls5()
        {
            this$0 = GuidedSearchTypeAheadAdapter.this;
            super();
        }
    }


    private class _cls6
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
            catch (NoSuchFieldError nosuchfielderror6) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_BOARD.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror5) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_PINNER.ordinal()] = 3;
            }
            catch (NoSuchFieldError nosuchfielderror4) { }
            try
            {
                $SwitchMap$com$pinterest$activity$search$model$GuidedSearchTypeAheadItem$ItemType[com.pinterest.activity.search.model.GuidedSearchTypeAheadItem.ItemType.RECENT_HISTORY_MY_PIN.ordinal()] = 4;
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


    private class _cls3
        implements Runnable
    {

        final GuidedSearchTypeAheadAdapter this$0;
        final List val$newData;
        final String val$searchTerm;

        public void run()
        {
            if (TextUtils.equals(searchTerm, _currentSearchTerm))
            {
                setAutoCompleteData(newData);
                if (_searchScope == com.pinterest.api.remote.SearchApi.Scope.d || _searchScope == com.pinterest.api.remote.SearchApi.Scope.e)
                {
                    _cacheditemsMap = _itemsMap;
                }
                notifyDataSetChanged();
            }
        }

        _cls3()
        {
            this$0 = GuidedSearchTypeAheadAdapter.this;
            searchTerm = s;
            newData = list;
            super();
        }
    }


    private class _cls2 extends Filter
    {

        final GuidedSearchTypeAheadAdapter this$0;

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
            this$0 = GuidedSearchTypeAheadAdapter.this;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnTouchListener
    {

        final GuidedSearchTypeAheadAdapter this$0;

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
            this$0 = GuidedSearchTypeAheadAdapter.this;
            super();
        }
    }

}
