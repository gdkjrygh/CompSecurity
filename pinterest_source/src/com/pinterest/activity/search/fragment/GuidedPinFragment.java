// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.fragment;

import android.os.Bundle;
import com.pinterest.activity.search.SearchNagView;
import com.pinterest.activity.search.model.QueryMetaData;
import com.pinterest.activity.search.ui.GuidedSearchBar;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.adapter.PinGridAdapter;
import com.pinterest.api.model.ShopCollectionItem;
import com.pinterest.fragment.PinGridFragment;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.grid.PinterestGridView;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class GuidedPinFragment extends PinGridFragment
{

    protected boolean _commerceOnly;
    protected String _domain;
    protected String _lastQuery;
    protected QueryMetaData _lastQueryData;
    protected com.pinterest.activity.search.model.QueryMetaData.FilterState _lastQueryState;
    protected SearchNagView _nagView;
    protected String _price;
    protected boolean _queryAutoCorrectionDisabled;
    protected List _queryMetaList;
    protected int _searchMode;
    protected GuidedSearchBar _searchView;
    protected ShopCollectionItem _shopCollectionItem;

    public GuidedPinFragment()
    {
        _lastQueryState = com.pinterest.activity.search.model.QueryMetaData.FilterState.NONE;
        setCompactCells(true);
    }

    public com.pinterest.activity.search.model.QueryMetaData.FilterState getLastQueryState()
    {
        return _lastQueryState;
    }

    public boolean isCommerceOnly()
    {
        return _commerceOnly;
    }

    public boolean isDomainSearch()
    {
        return StringUtils.isNotEmpty(_domain);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putString("_lastQuery", _lastQuery);
        super.onSaveInstanceState(bundle);
    }

    public void reload(String s, List list, QueryMetaData querymetadata, com.pinterest.activity.search.model.QueryMetaData.FilterState filterstate, boolean flag, boolean flag1)
    {
        if (!isAdded())
        {
            return;
        }
        if (s != null)
        {
            _lastQuery = s;
        }
        _lastQueryData = querymetadata;
        _lastQueryState = filterstate;
        _queryMetaList = list;
        _queryAutoCorrectionDisabled = flag;
        _commerceOnly = flag1;
        ((PinGridAdapter)_adapter).setDataSource(null);
        if (StringUtils.isEmpty(s) && querymetadata.getFilters() == null)
        {
            _gridVw.setState(com.pinterest.ui.grid.PinterestGridView.State.LOADED);
            ViewHelper.setVisibility(_nagView, 8);
            return;
        } else
        {
            _gridVw.setState(com.pinterest.ui.grid.PinterestGridView.State.LOADING);
            refresh();
            return;
        }
    }

    public void setCommerceOnly(boolean flag)
    {
        _commerceOnly = flag;
    }

    public void setDomain(String s)
    {
        _domain = s;
    }

    public void setLastQuery(String s)
    {
        _lastQuery = s;
    }

    public void setLastQueryData(QueryMetaData querymetadata)
    {
        _lastQueryData = querymetadata;
    }

    public void setLastQueryState(com.pinterest.activity.search.model.QueryMetaData.FilterState filterstate)
    {
        _lastQueryState = filterstate;
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        if (navigation == null || navigation.getId() == null)
        {
            return;
        } else
        {
            setLastQuery(navigation.getId());
            return;
        }
    }

    public void setPrice(String s)
    {
        _price = s;
    }

    public void setQueryMetaList(List list)
    {
        _queryMetaList = list;
    }

    public void setSearchMode(int i)
    {
        _searchMode = i;
    }

    public void setSearchView(GuidedSearchBar guidedsearchbar)
    {
        _searchView = guidedsearchbar;
    }

    public void setShopCollectionItem(ShopCollectionItem shopcollectionitem)
    {
        _shopCollectionItem = shopcollectionitem;
    }

    protected void updateEmptyContent()
    {
        _emptyLeftImage = 0x7f02020f;
        _emptyCenterImage = 0x7f020217;
        _emptyRightImage = 0x7f020212;
    }
}
