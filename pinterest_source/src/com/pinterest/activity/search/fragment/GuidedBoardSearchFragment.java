// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.ButterKnife;
import com.pinterest.activity.search.SearchNagView;
import com.pinterest.activity.search.adapter.SearchCategoryAdapter;
import com.pinterest.adapter.BoardGridAdapter;
import com.pinterest.api.remote.SearchApi;
import com.pinterest.base.Device;
import com.pinterest.fragment.BoardGridFragment;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.grid.PinterestGridView;
import com.pinterest.ui.tab.Tab;
import com.pinterest.ui.tab.TabBar;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.lucasr.twowayview.TwoWayView;

public class GuidedBoardSearchFragment extends BoardGridFragment
{

    private static final int ALL_BOARDS = 0;
    private static final int PLACE_BOARDS = 1;
    private SearchCategoryAdapter _categoryAdapter;
    TwoWayView _categoryListView;
    View _dummyPaddingView;
    View _focusView;
    LinearLayout _headerWrapper;
    private String _lastQuery;
    private int _lastTabIndex;
    SearchNagView _nagView;
    private int _oldY;
    TabBar _tabBar;
    private BoardSearchFeedResponse onAllBoardsLoaded;
    private BoardSearchFeedResponse onPlaceBoardsLoaded;
    private com.pinterest.ui.tab.TabBar.Listener onTabChangedListener;

    public GuidedBoardSearchFragment()
    {
        onTabChangedListener = new _cls3();
        onAllBoardsLoaded = new BoardSearchFeedResponse(gridResponseHandler, 0);
        onPlaceBoardsLoaded = new BoardSearchFeedResponse(gridResponseHandler, 1);
        _layoutId = 0x7f0300d0;
    }

    protected void loadData()
    {
        if (_lastQuery == null) goto _L2; else goto _L1
_L1:
        _lastTabIndex;
        JVM INSTR tableswitch 0 1: default 32
    //                   0 33
    //                   1 50;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        SearchApi.a(_lastQuery, false, onAllBoardsLoaded, getApiTag());
        return;
_L4:
        SearchApi.a(_lastQuery, false, onPlaceBoardsLoaded, getApiTag());
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
            setLastQuery(bundle.getString("_lastQuery"));
        }
        return super.onCreateView(layoutinflater, viewgroup, bundle);
    }

    public void onDestroyView()
    {
        _dummyPaddingView = null;
        _tabBar = null;
        _nagView = null;
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        if (_tabBar != null)
        {
            bundle.putInt("tabIndex", _tabBar.getSelectedIndex());
        }
        bundle.putString("_lastQuery", _lastQuery);
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
        _dummyPaddingView = new View(view.getContext());
        _dummyPaddingView.setVisibility(8);
        _gridVw.addHeaderView(_dummyPaddingView, -1, (int)Resources.dimension(0x7f0a01b9));
        _tabBar = (TabBar)((ViewGroup)_gridVw.addHeaderView(0x7f0301d9)).findViewById(0x7f0f048c);
        bundle = (Tab)_tabBar.findViewById(0x7f0f048d);
        Tab tab = (Tab)_tabBar.findViewById(0x7f0f048e);
        bundle.setText(Resources.string(0x7f070047));
        tab.setText(Resources.string(0x7f070435));
        _tabBar.setCurrentIndex(_lastTabIndex);
        _tabBar.setListener(onTabChangedListener);
        _tabBar.disableUnderline();
        _nagView = new SearchNagView(view.getContext());
        _gridVw.addHeaderView(_nagView, -1, -2);
        _categoryListView.setVisibility(8);
        _categoryListView.setOrientation(org.lucasr.twowayview.TwoWayView.Orientation.HORIZONTAL);
        _categoryListView.setLongClickable(true);
        _categoryListView.setAdapter(_categoryAdapter);
        _categoryListView.setHorizontalScrollBarEnabled(false);
        _categoryListView.setItemMargin((int)Device.dpToPixel(8F));
        _categoryListView.setOverScrollMode(2);
        _categoryListView.setOnItemClickListener(new _cls1());
        _gridVw.setState(com.pinterest.ui.grid.PinterestGridView.State.LOADING);
        _gridVw.addListener(new _cls2());
        updateEmptyContent();
    }

    public void reload(String s)
    {
        if (!isAdded())
        {
            return;
        }
        setLastQuery(s);
        ((BoardGridAdapter)_adapter).setDataSource(null);
        if (StringUtils.isEmpty(s))
        {
            _gridVw.setState(com.pinterest.ui.grid.PinterestGridView.State.NONE);
            ViewHelper.setVisibility(_nagView, 8);
            return;
        } else
        {
            _gridVw.setState(com.pinterest.ui.grid.PinterestGridView.State.LOADING);
            loadData();
            return;
        }
    }

    public void setLastQuery(String s)
    {
        _lastQuery = s;
        updateEmptyContent();
    }

    protected void updateEmptyContent()
    {
        _lastTabIndex;
        JVM INSTR tableswitch 1 1: default 24
    //                   1 69;
           goto _L1 _L2
_L1:
        int i = 0x7f07026f;
_L4:
        _emptyLeftImage = 0x7f020208;
        _emptyCenterImage = 0x7f020207;
        _emptyRightImage = 0x7f020206;
        _emptyMessage = Resources.string(i, new Object[] {
            _lastQuery
        });
        return;
_L2:
        i = 0x7f070274;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void updateRelatedQueries(List list)
    {
        if (_dummyPaddingView == null || _categoryListView == null)
        {
            return;
        }
        if (list.size() > 0)
        {
            ViewHelper.setVisibility(_dummyPaddingView, 0);
            ViewHelper.setVisibility(_categoryListView, 0);
            _categoryListView.setEnabled(true);
            _categoryListView.setSelection(0);
        } else
        {
            ViewHelper.setVisibility(_dummyPaddingView, 8);
            ViewHelper.setVisibility(_categoryListView, 8);
        }
        _categoryAdapter.updateData(list, new ArrayList());
    }




/*
    static int access$102(GuidedBoardSearchFragment guidedboardsearchfragment, int i)
    {
        guidedboardsearchfragment._oldY = i;
        return i;
    }

*/



/*
    static int access$202(GuidedBoardSearchFragment guidedboardsearchfragment, int i)
    {
        guidedboardsearchfragment._lastTabIndex = i;
        return i;
    }

*/


    private class _cls3
        implements com.pinterest.ui.tab.TabBar.Listener
    {

        final GuidedBoardSearchFragment this$0;

        public void onTabReselected(int i)
        {
        }

        public void onTabSelected(int i)
        {
            _lastTabIndex = i;
            reload(_lastQuery);
        }

        _cls3()
        {
            this$0 = GuidedBoardSearchFragment.this;
            super();
        }
    }


    private class BoardSearchFeedResponse extends com.pinterest.api.remote.BoardApi.GuidedBoardFeedApiResponse
    {

        int _tabIndex;
        final GuidedBoardSearchFragment this$0;

        private boolean isValidFeedState()
        {
            return _lastTabIndex == _tabIndex;
        }

        public void onStart()
        {
            super.onStart();
            ViewHelper.setVisibility(_nagView, 8);
        }

        public void onSuccess(Feed feed)
        {
            if (isValidFeedState())
            {
                super.onSuccess(feed);
                Object obj;
                HashMap hashmap;
                if (_tabIndex == 1)
                {
                    obj = EventType.SEARCH_PLACE_BOARDS;
                } else
                {
                    obj = EventType.SEARCH_BOARDS;
                }
                hashmap = new HashMap();
                hashmap.put("query", _lastQuery);
                Pinalytics.a(((EventType) (obj)), "0", hashmap);
                obj = (GuidedBoardFeed)feed;
                updateRelatedQueries(((GuidedBoardFeed) (obj)).getRelatedQueries());
                SearchNagView.showSearchNag(_nagView, feed);
            }
        }

        public void onSuccess(PinterestJsonObject pinterestjsonobject)
        {
            if (isValidFeedState())
            {
                super.onSuccess(pinterestjsonobject);
            }
        }

        public BoardSearchFeedResponse(FeedApiResponseHandler feedapiresponsehandler, int i)
        {
            this$0 = GuidedBoardSearchFragment.this;
            super(feedapiresponsehandler);
            _tabIndex = -1;
            _tabIndex = i;
        }
    }


    private class _cls1
        implements android.widget.AdapterView.OnItemClickListener
    {

        final GuidedBoardSearchFragment this$0;

        public void onItemClick(AdapterView adapterview, View view, int i, long l)
        {
            adapterview = (RelatedQueryItem)_categoryAdapter.getItem(i);
            boolean flag;
            if (adapterview.getPosition() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view = new GuidedSearchEvent(adapterview.getTerm(), com.pinterest.activity.search.event.GuidedSearchEvent.SearchType.BOARD);
            view.setTokenFilter(true);
            view.setTokenFront(flag);
            view.setDominantColor(adapterview.getDominantColor());
            Events.post(view);
            _categoryListView.setEnabled(false);
        }

        _cls1()
        {
            this$0 = GuidedBoardSearchFragment.this;
            super();
        }
    }


    private class _cls2 extends com.pinterest.ui.scrollview.ObservableScrollView.ScrollViewListener
    {

        final GuidedBoardSearchFragment this$0;

        public void onScroll(View view, int i, int j, int k, int l)
        {
            if (_focusView != null)
            {
                _focusView.requestFocus();
            }
            if (_categoryListView == null)
            {
                return;
            }
            i = _headerWrapper.getMeasuredHeight();
            k = (int)_headerWrapper.getY();
            if (j >= _oldY) goto _L2; else goto _L1
_L1:
            if (k < 0)
            {
                i = Math.min(0, k + (_oldY - j));
                _headerWrapper.setTranslationY(i);
            }
_L4:
            _oldY = j;
            return;
_L2:
            if (j > _oldY && k > -i)
            {
                i = Math.max(-i, k - (j - _oldY));
                _headerWrapper.setTranslationY(i);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        _cls2()
        {
            this$0 = GuidedBoardSearchFragment.this;
            super();
        }
    }

}
