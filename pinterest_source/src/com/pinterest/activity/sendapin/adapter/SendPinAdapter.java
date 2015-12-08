// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import com.pinterest.activity.notifications.util.RecentConversations;
import com.pinterest.activity.sendapin.ui.EmptySearchCell;
import com.pinterest.activity.sendapin.ui.ProgressSpinnerListCell;
import com.pinterest.activity.sendapin.ui.SendPinTitleCell;
import com.pinterest.activity.sendapin.ui.SendSocialView;
import com.pinterest.base.Device;
import com.pinterest.kit.log.PLog;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.text.SearchEditText;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.activity.sendapin.adapter:
//            PeopleSearchAdapter, RecentConversationListAdapter

public class SendPinAdapter extends BaseAdapter
    implements ListAdapter
{

    private static final int DEFAULT_DISPLAYED_ROWS = 3;
    private static float OVERLAP_PADDING = 0F;
    private static int ROW_HEIGHT = 0;
    public static final int SEARCH_HEADER_INDEX = 2;
    public static final int SHIM_HEADER_INDEX = 0;
    public static final int SOCIAL_HEADER_INDEX = 3;
    public static final int TITLE_HEADER_INDEX = 1;
    private BaseAdapter _activeAdapter;
    private String _apiTag;
    private int _currentScreenHeight;
    private EmptySearchCell _emptySearchCell;
    private ProgressSpinnerListCell _footerView;
    private LayoutInflater _inflater;
    private List _listViewHeaders;
    private PeopleSearchAdapter _peopleSearchAdapter;
    private DataSetObserver _peopleSearchAdapterObserver;
    private RecentConversationListAdapter _recentConversationLA;
    private SearchEditText _searchEt;
    private int _searchHeaderHeight;
    private ViewGroup _searchView;
    private FrameLayout _shimView;
    private SendSocialView _socialView;
    private int _stickyHeaderIndexes[] = {
        1, 2
    };
    private SparseArray _stickyHeaders;
    private SearchEditText _stickySearchEt;
    private SendPinTitleCell _stickyTitleCell;
    private SendPinTitleCell _titleCell;
    private int _titleHeaderHeight;

    public SendPinAdapter(Context context)
    {
        _listViewHeaders = new ArrayList();
        _currentScreenHeight = 0;
        _titleHeaderHeight = 0;
        _searchHeaderHeight = 0;
        _stickyHeaders = new SparseArray();
        _peopleSearchAdapterObserver = new _cls1();
        _peopleSearchAdapter = new PeopleSearchAdapter(context);
        _peopleSearchAdapter.setApiTag(_apiTag);
        _peopleSearchAdapter.registerDataSetObserver(_peopleSearchAdapterObserver);
        _activeAdapter = _peopleSearchAdapter;
        _inflater = (LayoutInflater)context.getSystemService("layout_inflater");
        _stickyTitleCell = (SendPinTitleCell)_inflater.inflate(0x7f030194, null);
        _stickyHeaders.put(1, _stickyTitleCell);
        Object obj = (ViewGroup)_inflater.inflate(0x7f030184, null);
        _stickySearchEt = (SearchEditText)((ViewGroup) (obj)).findViewById(0x7f0f0236);
        _stickySearchEt.setHint(0x7f070597);
        _stickyHeaders.put(2, obj);
        _shimView = new FrameLayout(context);
        _listViewHeaders.add(_shimView);
        _titleCell = (SendPinTitleCell)_inflater.inflate(0x7f030194, null);
        _listViewHeaders.add(_titleCell);
        _searchView = (ViewGroup)_inflater.inflate(0x7f030184, null);
        _searchEt = (SearchEditText)_searchView.findViewById(0x7f0f0236);
        _searchEt.setHint(0x7f070597);
        _listViewHeaders.add(_searchView);
        _socialView = new SendSocialView(context);
        _listViewHeaders.add(_socialView);
        _emptySearchCell = new EmptySearchCell(context);
        obj = RecentConversations.get();
        _recentConversationLA = new RecentConversationListAdapter(context);
        _recentConversationLA.setRecentConversations(((List) (obj)));
        if (RecentConversations.hasRecent())
        {
            _activeAdapter = _recentConversationLA;
        } else
        {
            _listViewHeaders.add(_emptySearchCell);
        }
        _footerView = new ProgressSpinnerListCell(context);
        ROW_HEIGHT = Math.round(context.getResources().getDimension(0x7f0a0158));
    }

    private void adjustFooterSize()
    {
        boolean flag = false;
        PLog.logv("#adjustFooterSize", new Object[0]);
        int i = _activeAdapter.getCount();
        float f = (float)(_searchHeaderHeight + _titleHeaderHeight) - OVERLAP_PADDING * 2.0F;
        if (i > 0)
        {
            float f1 = ROW_HEIGHT;
            float f2 = OVERLAP_PADDING;
            f1 = (int)((float)i * (f1 - f2));
            i = _currentScreenHeight - (int)(f1 + f);
            ProgressSpinnerListCell progressspinnerlistcell = _footerView;
            if ((float)i + OVERLAP_PADDING <= 0.0F)
            {
                i = 0;
            }
            setHeight(progressspinnerlistcell, i);
        } else
        {
            int j = (int)(((float)_currentScreenHeight - f) + OVERLAP_PADDING * 2.0F);
            if (_listViewHeaders.contains(_emptySearchCell))
            {
                setHeight(_emptySearchCell, j);
                setHeight(_footerView, 0);
            } else
            {
                flag = true;
                setHeight(_footerView, j);
            }
        }
        _footerView.setSpinnerVisibility(flag);
    }

    private int getActiveAdapterPos(int i)
    {
        return i - _listViewHeaders.size();
    }

    private boolean isFooterItem(int i)
    {
        return i == getCount() - 1;
    }

    private boolean isHeaderItem(int i)
    {
        return i < _listViewHeaders.size();
    }

    private void onDataSetChange()
    {
        PLog.logv("#onDataSetChange", new Object[0]);
        adjustFooterSize();
        notifyDataSetChanged();
    }

    private void setHeight(ViewGroup viewgroup, int i)
    {
        if (viewgroup != null)
        {
            viewgroup.setMinimumHeight(i);
            viewgroup.forceLayout();
        }
    }

    private void updateShimView()
    {
        if (_recentConversationLA.getCount() == 0)
        {
            setHeight(_shimView, 0);
            return;
        } else
        {
            _titleHeaderHeight = ((ViewGroup)_listViewHeaders.get(1)).getMeasuredHeight();
            _searchHeaderHeight = _searchView.getMeasuredHeight();
            int i = Math.min(3, _recentConversationLA.getCount());
            int j = ROW_HEIGHT;
            int k = _titleHeaderHeight;
            int l = _searchHeaderHeight;
            int i1 = _currentScreenHeight;
            setHeight(_shimView, i1 - ((i + 1) * j + (k + l)));
            return;
        }
    }

    public int getCount()
    {
        return _listViewHeaders.size() + _activeAdapter.getCount() + 1;
    }

    public int[] getHeaderPositions()
    {
        return _stickyHeaderIndexes;
    }

    public View getHeaderView(int i)
    {
        return (View)_stickyHeaders.get(i);
    }

    public Object getItem(int i)
    {
        if (isHeaderItem(i))
        {
            return _listViewHeaders.get(i);
        }
        if (isFooterItem(i))
        {
            return _footerView;
        } else
        {
            return _activeAdapter.getItem(getActiveAdapterPos(i));
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public int getItemViewType(int i)
    {
        if (isHeaderItem(i))
        {
            return i;
        }
        if (isFooterItem(i))
        {
            return getViewTypeCount() - 1;
        } else
        {
            return _listViewHeaders.size();
        }
    }

    public View getListHeaderView(int i)
    {
        return (View)_listViewHeaders.get(i);
    }

    public String getMessage()
    {
        return _titleCell.getMessage();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (isHeaderItem(i))
        {
            return (View)_listViewHeaders.get(i);
        }
        if (isFooterItem(i))
        {
            return _footerView;
        } else
        {
            return _activeAdapter.getView(getActiveAdapterPos(i), view, viewgroup);
        }
    }

    public int getViewTypeCount()
    {
        return _listViewHeaders.size() + _activeAdapter.getViewTypeCount() + 1;
    }

    public void onFacebookConnected()
    {
        _peopleSearchAdapter.onFacebookConnected();
    }

    public boolean onScreenHeightChanged(int i)
    {
        PLog.logv("#onScreenHeightChanged %d", new Object[] {
            Integer.valueOf(i)
        });
        if (_currentScreenHeight != i)
        {
            _currentScreenHeight = i;
            updateShimView();
            adjustFooterSize();
            return true;
        } else
        {
            return false;
        }
    }

    public void onSearchQueryChanged(String s)
    {
        boolean flag;
        boolean flag1;
        _peopleSearchAdapter.onSearchQueryChanged(s);
        flag = _listViewHeaders.contains(_emptySearchCell);
        flag1 = _listViewHeaders.contains(_socialView);
        if (!StringUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        _activeAdapter = _recentConversationLA;
        if (!flag1)
        {
            _listViewHeaders.add(3, _socialView);
        }
        if (!RecentConversations.hasRecent() && !flag)
        {
            _listViewHeaders.add(_emptySearchCell);
        }
_L4:
        onDataSetChange();
        return;
_L2:
        _activeAdapter = _peopleSearchAdapter;
        if (flag1)
        {
            _listViewHeaders.remove(_socialView);
        }
        if (flag)
        {
            _listViewHeaders.remove(_emptySearchCell);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void refresh()
    {
        _peopleSearchAdapter.refresh();
    }

    public void setApiTag(String s)
    {
        _apiTag = s;
    }

    public void setEmptySearchCellText(int i)
    {
        _emptySearchCell.setText(i);
    }

    public void setMessage(String s)
    {
        _titleCell.setMessage(s);
        _stickyTitleCell.setMessage(s);
    }

    public void setSearchBarOnClickAndLongPressListener(android.view.View.OnClickListener onclicklistener)
    {
        View view = ((ViewGroup)_listViewHeaders.get(2)).findViewById(0x7f0f0236);
        view.setOnClickListener(onclicklistener);
        view.setLongClickable(false);
    }

    public void setTitle(int i)
    {
        _titleCell.setTitle(i);
        _stickyTitleCell.setTitle(i);
    }

    public void syncText()
    {
        SearchEditText searchedittext = _searchEt;
        Object obj;
        if (_stickySearchEt.getText() == null)
        {
            obj = null;
        } else
        {
            obj = _stickySearchEt.getText().toString();
        }
        searchedittext.setText(((CharSequence) (obj)));
        ViewHelper.setTextCursorToEnd(_searchEt);
    }

    static 
    {
        OVERLAP_PADDING = 0.0F * Device.getDensity();
    }


    private class _cls1 extends DataSetObserver
    {

        final SendPinAdapter this$0;

        public void onChanged()
        {
            onDataSetChange();
        }

        public void onInvalidated()
        {
            notifyDataSetInvalidated();
        }

        _cls1()
        {
            this$0 = SendPinAdapter.this;
            super();
        }
    }

}
