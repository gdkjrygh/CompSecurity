// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.event;

import com.pinterest.activity.search.model.QueryMetaData;
import com.pinterest.api.model.SearchFilter;
import java.util.ArrayList;
import java.util.List;

public class GuidedSearchEvent
{

    private SearchFilter _actionFilter;
    private boolean _commerceOnly;
    private String _dominantColor;
    private int _filterIndex;
    private boolean _forceRefresh;
    private boolean _isContextualSearch;
    private boolean _isHashTag;
    private boolean _isMyPins;
    private boolean _isSearchFilterApplied;
    private boolean _isTokenFilter;
    private boolean _isTokenFront;
    private QueryMetaData _lastQueryData;
    private com.pinterest.activity.search.model.QueryMetaData.FilterState _lastQueryState;
    private String _query;
    private boolean _queryAutoCorrectionDisabled;
    private List _queryMetaList;
    private SearchType _type;

    public GuidedSearchEvent(String s)
    {
        _isTokenFilter = false;
        _isTokenFront = false;
        _isHashTag = false;
        _queryMetaList = new ArrayList();
        _forceRefresh = false;
        _queryAutoCorrectionDisabled = false;
        _isMyPins = false;
        _commerceOnly = false;
        _isSearchFilterApplied = false;
        _query = s;
    }

    public GuidedSearchEvent(String s, SearchType searchtype)
    {
        _isTokenFilter = false;
        _isTokenFront = false;
        _isHashTag = false;
        _queryMetaList = new ArrayList();
        _forceRefresh = false;
        _queryAutoCorrectionDisabled = false;
        _isMyPins = false;
        _commerceOnly = false;
        _isSearchFilterApplied = false;
        _query = s;
        _type = searchtype;
    }

    public SearchFilter getActionFilter()
    {
        return _actionFilter;
    }

    public String getDominantColor()
    {
        return _dominantColor;
    }

    public int getFilterIndex()
    {
        return _filterIndex;
    }

    public boolean getForceRefresh()
    {
        return _forceRefresh;
    }

    public QueryMetaData getLastQueryData()
    {
        return _lastQueryData;
    }

    public com.pinterest.activity.search.model.QueryMetaData.FilterState getLastQueryState()
    {
        return _lastQueryState;
    }

    public String getQuery()
    {
        return _query;
    }

    public List getQueryMetaList()
    {
        return _queryMetaList;
    }

    public SearchType getType()
    {
        return _type;
    }

    public boolean isCommerceOnly()
    {
        return _commerceOnly;
    }

    public boolean isContextualSearch()
    {
        return _isContextualSearch;
    }

    public boolean isHashTag()
    {
        return _isHashTag;
    }

    public boolean isMyPins()
    {
        return _isMyPins;
    }

    public boolean isQueryAutoCorrectionDisabled()
    {
        return _queryAutoCorrectionDisabled;
    }

    public boolean isSearchFilterApplied()
    {
        return _isSearchFilterApplied;
    }

    public boolean isTokenFilter()
    {
        return _isTokenFilter;
    }

    public boolean isTokenFront()
    {
        return _isTokenFront;
    }

    public void setActionFilter(SearchFilter searchfilter)
    {
        _actionFilter = searchfilter;
    }

    public void setCommerceOnly(boolean flag)
    {
        _commerceOnly = flag;
    }

    public void setContextualSearch(boolean flag)
    {
        _isContextualSearch = flag;
    }

    public void setDominantColor(String s)
    {
        _dominantColor = s;
    }

    public void setFilterIndex(int i)
    {
        _filterIndex = i;
    }

    public void setForceRefresh(boolean flag)
    {
        _forceRefresh = flag;
    }

    public void setHashTag(boolean flag)
    {
        _isHashTag = flag;
    }

    public void setIsMyPins(boolean flag)
    {
        _isMyPins = flag;
    }

    public void setLastQueryData(QueryMetaData querymetadata)
    {
        _lastQueryData = querymetadata;
    }

    public void setLastQueryState(com.pinterest.activity.search.model.QueryMetaData.FilterState filterstate)
    {
        _lastQueryState = filterstate;
    }

    public void setQuery(String s)
    {
        _query = s;
    }

    public void setQueryAutoCorrectionDisabled(boolean flag)
    {
        _queryAutoCorrectionDisabled = flag;
    }

    public void setQueryMetaList(List list)
    {
        _queryMetaList = list;
    }

    public void setSearchFilterApplied(boolean flag)
    {
        _isSearchFilterApplied = flag;
    }

    public void setTokenFilter(boolean flag)
    {
        _isTokenFilter = flag;
    }

    public void setTokenFront(boolean flag)
    {
        _isTokenFront = flag;
    }

    public void setType(SearchType searchtype)
    {
        _type = searchtype;
    }
}
