// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.google.common.base.Strings;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.remote.CommerceApi;
import com.pinterest.di.components.FragmentComponent;
import com.pinterest.kit.application.Resources;

public class ShopSpaceSectionFragment extends BaseFragment
{

    public static final String EXTRA_SECTION_ID = "section_id";
    private Adapter _adapter;
    RelativeLayout _emptyStateContainer;
    ProgressBar _emptyStateSpinner;
    TextView _emptyStateText;
    private boolean _hasLoadMoreFired;
    private String _lastBookmark;
    RecyclerView _recyclerView;
    private String _sectionId;
    private boolean _showLoadMore;

    public ShopSpaceSectionFragment()
    {
        _layoutId = 0x7f0300b4;
        _menuId = 0x7f100002;
    }

    private String getEmptyStateText()
    {
        return Resources.string(0x7f0706ef);
    }

    private void handleGenericLoadMoreSuccess(String s, boolean flag)
    {
        updateEmptyState(false);
        _lastBookmark = s;
        if (_lastBookmark != null && flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _showLoadMore = flag;
        _hasLoadMoreFired = false;
        _adapter.maybeRemoveLoadMoreItem();
    }

    private void handleGenericSuccess(String s, boolean flag)
    {
        boolean flag2 = false;
        updateEmptyState(false);
        _lastBookmark = s;
        boolean flag1 = flag2;
        if (_lastBookmark != null)
        {
            flag1 = flag2;
            if (flag)
            {
                flag1 = true;
            }
        }
        _showLoadMore = flag1;
    }

    private void handleLoadMore()
    {
        if (Strings.isNullOrEmpty(_lastBookmark))
        {
            _adapter.maybeRemoveLoadMoreItem();
            return;
        } else
        {
            _adapter.maybeAddLoadMoreItem();
            updateEmptyState(true);
            CommerceApi.b(new _cls2(), _sectionId, _lastBookmark);
            return;
        }
    }

    private void maybeFireLoadMore()
    {
        if (!_hasLoadMoreFired && _showLoadMore)
        {
            android.support.v7.widget.RecyclerView.LayoutManager layoutmanager = _recyclerView.getLayoutManager();
            int i = layoutmanager.getChildCount();
            int j = layoutmanager.getItemCount();
            int k = ((LinearLayoutManager)_recyclerView.getLayoutManager()).findFirstVisibleItemPosition();
            if (j != 0 && k + i + 3 > j)
            {
                _hasLoadMoreFired = true;
                handleLoadMore();
                return;
            }
        }
    }

    private void resetAndLoadData()
    {
        _adapter.clearItems();
        _lastBookmark = null;
        updateEmptyState(true);
        CommerceApi.a(new _cls3(), _sectionId);
    }

    private void updateEmptyState()
    {
        updateEmptyState(false);
    }

    private void updateEmptyState(boolean flag)
    {
        RelativeLayout relativelayout = _emptyStateContainer;
        int i;
        if (_adapter.getItemCount() == 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        relativelayout.setVisibility(i);
        if (flag)
        {
            _emptyStateSpinner.setVisibility(0);
            _emptyStateText.setVisibility(8);
            return;
        } else
        {
            _emptyStateSpinner.setVisibility(8);
            _emptyStateText.setVisibility(0);
            _emptyStateText.setText(getEmptyStateText());
            return;
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("section_id", _sectionId);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        getComponent().inject(this);
        ButterKnife.a(this, view);
        if (bundle != null)
        {
            _sectionId = bundle.getString("section_id");
        }
        _recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        _recyclerView.setHasFixedSize(true);
        _adapter = new Adapter();
        _recyclerView.setAdapter(_adapter);
        _recyclerView.setOnScrollListener(new _cls1());
        _actionBar.setTitle(0x7f0706f0);
        updateEmptyState();
        resetAndLoadData();
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        navigation = ((Navigation) (navigation.getExtra("section_id")));
        if (navigation != null)
        {
            _sectionId = (String)navigation;
        }
    }





/*
    static boolean access$302(ShopSpaceSectionFragment shopspacesectionfragment, boolean flag)
    {
        shopspacesectionfragment._hasLoadMoreFired = flag;
        return flag;
    }

*/





    private class Adapter extends android.support.v7.widget.RecyclerView.Adapter
    {

        private final Object LOAD_MORE = new Object();
        private List items;
        final ShopSpaceSectionFragment this$0;

        public void appendItem(List list)
        {
            if (items.get(items.size() - 1) == LOAD_MORE)
            {
                items.remove(LOAD_MORE);
            }
            items.addAll(list);
            notifyDataSetChanged();
            updateEmptyState();
        }

        public void clearItems()
        {
            items = null;
            notifyDataSetChanged();
            updateEmptyState();
        }

        public int getItemCount()
        {
            if (items == null)
            {
                return 0;
            } else
            {
                return items.size();
            }
        }

        public int getItemViewType(int i)
        {
            Object obj = items.get(i);
            if (obj == LOAD_MORE)
            {
                return Type.LoadMore.ordinal();
            }
            if (obj instanceof ShopCollectionItem)
            {
                return Type.Section.ordinal();
            } else
            {
                throw new IllegalStateException("unknown view type");
            }
        }

        public void maybeAddLoadMoreItem()
        {
            while (items == null || items.get(items.size() - 1) == LOAD_MORE) 
            {
                return;
            }
            items.add(LOAD_MORE);
            notifyDataSetChanged();
        }

        public void maybeRemoveLoadMoreItem()
        {
            while (items == null || items.get(items.size() - 1) != LOAD_MORE) 
            {
                return;
            }
            items.remove(LOAD_MORE);
            notifyDataSetChanged();
        }

        public volatile void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
        {
            class ViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder
            {

                public LoadMoreListItemView loadMoreListItemView;
                public ShopSpaceSectionItemView shopSpaceSectionItemView;
                final Adapter this$1;

                public ViewHolder(LoadMoreListItemView loadmorelistitemview)
                {
                    this$1 = Adapter.this;
                    super(loadmorelistitemview);
                    loadMoreListItemView = loadmorelistitemview;
                }

                public ViewHolder(ShopSpaceSectionItemView shopspacesectionitemview)
                {
                    this$1 = Adapter.this;
                    super(shopspacesectionitemview);
                    shopSpaceSectionItemView = shopspacesectionitemview;
                }
            }

            onBindViewHolder((ViewHolder)viewholder, i);
        }

        public void onBindViewHolder(ViewHolder viewholder, int i)
        {
            final ShopCollectionItem shopCollectionItem = ((ShopCollectionItem) (items.get(i)));
            Type type = Type.getType(getItemViewType(i));
            switch (_cls4..SwitchMap.com.pinterest.activity.commerce.ShopSpaceSectionFragment.Type[type.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                shopCollectionItem = (ShopCollectionItem)shopCollectionItem;
                break;
            }
            viewholder.shopSpaceSectionItemView.bind(shopCollectionItem);
            class _cls1
                implements android.view.View.OnClickListener
            {

                final Adapter this$1;
                final ShopCollectionItem val$shopCollectionItem;

                public void onClick(View view)
                {
                    ShopSpaceNavigationHelper.handleNavigation(shopCollectionItem);
                }

                _cls1()
                {
                    this$1 = Adapter.this;
                    shopCollectionItem = shopcollectionitem;
                    super();
                }
            }

            viewholder.shopSpaceSectionItemView.setOnClickListener(new _cls1());
        }

        public volatile android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
        {
            return onCreateViewHolder(viewgroup, i);
        }

        public ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
        {
            Type type = Type.getType(i);
            switch (_cls4..SwitchMap.com.pinterest.activity.commerce.ShopSpaceSectionFragment.Type[type.ordinal()])
            {
            default:
                throw new IllegalStateException("unknown viewtype");

            case 1: // '\001'
                return new ViewHolder(new ShopSpaceSectionItemView(viewgroup.getContext()));

            case 2: // '\002'
                return new ViewHolder(new LoadMoreListItemView(viewgroup.getContext()));
            }
        }

        public void setItems(List list)
        {
            items = list;
            notifyDataSetChanged();
            updateEmptyState();
        }

        public Adapter()
        {
            this$0 = ShopSpaceSectionFragment.this;
            super();
        }

        private class Type extends Enum
        {

            private static final Type $VALUES[];
            public static final Type LoadMore;
            public static final Type Section;

            public static Type getType(int i)
            {
                switch (i)
                {
                default:
                    throw new IllegalStateException("Passed a value that is not in the range of this enum");

                case 0: // '\0'
                    return Section;

                case 1: // '\001'
                    return LoadMore;
                }
            }

            public static Type valueOf(String s)
            {
                return (Type)Enum.valueOf(com/pinterest/activity/commerce/ShopSpaceSectionFragment$Type, s);
            }

            public static Type[] values()
            {
                return (Type[])$VALUES.clone();
            }

            static 
            {
                Section = new Type("Section", 0);
                LoadMore = new Type("LoadMore", 1);
                $VALUES = (new Type[] {
                    Section, LoadMore
                });
            }

            private Type(String s, int i)
            {
                super(s, i);
            }
        }


        private class _cls4
        {

            static final int $SwitchMap$com$pinterest$activity$commerce$ShopSpaceSectionFragment$Type[];

            static 
            {
                $SwitchMap$com$pinterest$activity$commerce$ShopSpaceSectionFragment$Type = new int[Type.values().length];
                try
                {
                    $SwitchMap$com$pinterest$activity$commerce$ShopSpaceSectionFragment$Type[Type.Section.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$pinterest$activity$commerce$ShopSpaceSectionFragment$Type[Type.LoadMore.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

    }


    private class _cls2 extends com.pinterest.api.remote.CommerceApi.ShopSpaceCollectionItemsApiResponse
    {

        final ShopSpaceSectionFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            _adapter.maybeRemoveLoadMoreItem();
            _hasLoadMoreFired = false;
            updateEmptyState(false);
        }

        public void onSuccess(List list, String s)
        {
            super.onSuccess(list, s);
            _adapter.appendItem(list);
            ShopSpaceSectionFragment shopspacesectionfragment = ShopSpaceSectionFragment.this;
            boolean flag;
            if (!list.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            shopspacesectionfragment.handleGenericLoadMoreSuccess(s, flag);
        }

        _cls2()
        {
            this$0 = ShopSpaceSectionFragment.this;
            super();
        }
    }


    private class _cls3 extends com.pinterest.api.remote.CommerceApi.ShopSpaceCollectionItemsApiResponse
    {

        final ShopSpaceSectionFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            super.onFailure(throwable, apiresponse);
            CrashReporting.a(throwable);
            Events.post(new ToastEvent(new SimpleToast(getEmptyStateText())));
        }

        public void onSuccess(List list, String s)
        {
            super.onSuccess(list, s);
            _adapter.setItems(list);
            ShopSpaceSectionFragment shopspacesectionfragment = ShopSpaceSectionFragment.this;
            boolean flag;
            if (!list.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            shopspacesectionfragment.handleGenericSuccess(s, flag);
        }

        _cls3()
        {
            this$0 = ShopSpaceSectionFragment.this;
            super();
        }
    }


    private class _cls1 extends android.support.v7.widget.RecyclerView.OnScrollListener
    {

        final ShopSpaceSectionFragment this$0;

        public void onScrolled(RecyclerView recyclerview, int i, int j)
        {
            super.onScrolled(recyclerview, i, j);
            maybeFireLoadMore();
        }

        _cls1()
        {
            this$0 = ShopSpaceSectionFragment.this;
            super();
        }
    }

}
