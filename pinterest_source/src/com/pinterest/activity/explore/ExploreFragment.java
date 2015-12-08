// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.explore;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import com.pinterest.activity.explore.adapter.ContextualExploreAdapter;
import com.pinterest.activity.explore.adapter.ExploreAdapter;
import com.pinterest.activity.explore.adapter.ExploreBaseAdapter;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.adapter.PinterestBaseAdapter;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Category;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.CategoryApi;
import com.pinterest.api.remote.FeedApiResponseHandler;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.base.Constants;
import com.pinterest.base.Events;
import com.pinterest.base.StopWatch;
import com.pinterest.fragment.PinterestGridFragment;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.schemas.event.EventType;
import com.pinterest.ui.grid.PinterestGridView;

public class ExploreFragment extends PinterestGridFragment
    implements android.widget.AdapterView.OnItemClickListener
{

    protected View _searchBar;
    private com.pinterest.api.remote.CategoryApi.CategoriesFeedApiResponse onFeedLoaded;

    public ExploreFragment()
    {
        onFeedLoaded = new _cls4(true, true);
        _layoutId = 0x7f0300c2;
        _menuId = 0x7f100003;
        initAdapter();
    }

    protected void initAdapter()
    {
        _adapter = new ExploreAdapter();
    }

    protected void loadData()
    {
        super.loadData();
        CategoryApi.a(new com.pinterest.api.remote.CategoryApi.CategoriesFeedApiResponse(onFeedLoaded), getApiTag());
    }

    protected void onActivate()
    {
        super.onActivate();
        MyUser.getLastUsedCategories(new _cls3());
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        _fixedActionBar = true;
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroyView()
    {
        if (_searchBar != null)
        {
            _searchBar.setOnClickListener(null);
            _searchBar.setOnLongClickListener(null);
            _searchBar = null;
        }
        super.onDestroyView();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (!(_adapter instanceof ExploreAdapter)) goto _L2; else goto _L1
_L1:
        adapterview = (Category)((ExploreBaseAdapter)_adapter).getItem(i);
        if (((ExploreBaseAdapter)_adapter).getItemViewType(i) != 3) goto _L4; else goto _L3
_L3:
        Pinalytics.a(EventType.TAP, null, ComponentType.SHOP_SPACE_BANNER, null);
        Events.post(new Navigation(Location.COMMERCE_SHOP_SPACE));
_L6:
        return;
_L2:
        if (_adapter instanceof ContextualExploreAdapter)
        {
            adapterview = (Category)((ExploreBaseAdapter)_adapter).getItem(i);
        } else
        {
            adapterview = null;
        }
_L4:
        if (adapterview != null)
        {
            view = adapterview.getUid();
            Pinalytics.a(ElementType.CATEGORY_ICON, ComponentType.FLOWED_CATEGORY, view);
            if (ModelHelper.isValid(adapterview.getKey()) && adapterview.getKey().equals("shop_space"))
            {
                Events.post(new Navigation(Location.COMMERCE_SHOP_SPACE));
            } else
            {
                StopWatch.get().start("category_ttrfp");
                Events.post(new Navigation(Location.CATEGORY, adapterview));
            }
            MyUser.setLastSelectedCategoryKey(adapterview.getKey());
            MyUser.addLastUsedCategory(adapterview.getKey());
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _gridVw.setOnItemClickListener(this);
        _gridVw.setContentPadding(0, -Constants.MARGIN, 0, 0);
        _searchBar = LayoutInflater.from(view.getContext()).inflate(0x7f0301bc, _actionBar, false);
        _actionBar.addView(_searchBar);
        _searchBar.setOnClickListener(new _cls1());
        if (ApplicationInfo.isNonProduction())
        {
            _searchBar.setOnLongClickListener(new _cls2());
        }
    }
















    private class _cls4 extends com.pinterest.api.remote.CategoryApi.CategoriesFeedApiResponse
    {

        final ExploreFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            if ( == null || 
// JavaClassFileOutputException: get_constant: invalid tag

        public void onStart()
        {
            onStart();
            ((ExploreBaseAdapter)
// JavaClassFileOutputException: get_constant: invalid tag

        public void onSuccess(Feed feed, Hero hero)
        {
            onSuccess(feed, hero);
            if (
// JavaClassFileOutputException: get_constant: invalid tag

        _cls4(boolean flag, boolean flag1)
        {
            this$0 = ExploreFragment.this;
            super(flag, flag1);
        }
    }



    private class _cls1
        implements android.view.View.OnClickListener
    {

        final ExploreFragment this$0;

        public void onClick(View view)
        {
            Events.post(new Navigation(Location.SEARCH, ""));
        }

        _cls1()
        {
            this$0 = ExploreFragment.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnLongClickListener
    {

        final ExploreFragment this$0;

        public boolean onLongClick(View view)
        {
            DeveloperHelper.a(getActivity());
            return true;
        }

        _cls2()
        {
            this$0 = ExploreFragment.this;
            super();
        }
    }

}
