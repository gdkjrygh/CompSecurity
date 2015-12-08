// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.adapter;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.pinterest.activity.board.view.PersonListCell;
import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.activity.sendapin.ui.PeoplePickerPersonCell;
import com.pinterest.activity.sendapin.ui.ProgressSpinnerListCell;
import com.pinterest.adapter.SearchableListAdapter;
import com.pinterest.api.model.MyUser;
import com.pinterest.api.remote.SearchApi;
import com.pinterest.api.remote.SendApi;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.DrawableUtils;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class PeopleSearchAdapter extends BaseAdapter
    implements SearchableListAdapter
{

    private static boolean LOCAL_CONTACTS_ONLY = false;
    private static final String TAG = "PeopleSearchAdapter";
    private String _apiTag;
    protected Context _context;
    protected String _currentQuery;
    protected int _emailMaxCount;
    private ProgressSpinnerListCell _footerView;
    private Handler _handler;
    private List _items;
    protected LayoutInflater _li;
    private int _listCellLayoutId;
    protected int _phoneMaxCount;
    protected String _prevQuery;
    private Integer _rowHeight;
    private boolean _searchOnEmptyQuery;

    public PeopleSearchAdapter(Context context)
    {
        this(context, false);
    }

    public PeopleSearchAdapter(Context context, boolean flag)
    {
        _items = Collections.emptyList();
        _currentQuery = "";
        _prevQuery = "";
        _emailMaxCount = 25;
        _phoneMaxCount = 100;
        _listCellLayoutId = 0x7f030163;
        _context = context;
        _li = (LayoutInflater)context.getSystemService("layout_inflater");
        _handler = new Handler();
        _searchOnEmptyQuery = flag;
    }

    private void getSearchSuggestions()
    {
        if (Experiments.K())
        {
            SendApi.f(_currentQuery, new PeopleSearchResponseHandler(_currentQuery), _apiTag);
            return;
        } else
        {
            SearchApi.a(_currentQuery, getSearchScope(), new PeopleSearchResponseHandler(_currentQuery), _apiTag);
            return;
        }
    }

    protected void addPlaceholderCells(String s, List list)
    {
        if (!StringUtils.isEmpty(s))
        {
            if (!MyUser.isConnectedToFacebook())
            {
                TypeAheadItem typeaheaditem = new TypeAheadItem();
                typeaheaditem.setTitle(Resources.string(0x7f07016f));
                typeaheaditem.setItemType(com.pinterest.activity.search.model.TypeAheadItem.ItemType.CONNECT_FB_PLACEHOLDER);
                list.add(typeaheaditem);
            }
            TypeAheadItem typeaheaditem1 = new TypeAheadItem();
            typeaheaditem1.setTitle(Resources.string(0x7f07023a, new Object[] {
                s
            }));
            typeaheaditem1.setItemType(com.pinterest.activity.search.model.TypeAheadItem.ItemType.EMAIL_PLACEHOLDER);
            typeaheaditem1.setIdentifier(s);
            list.add(typeaheaditem1);
        }
    }

    protected void addToDataSet(final String query, final List newItems)
    {
        addPlaceholderCells(query, newItems);
        _handler.post(new _cls1());
    }

    protected void filterItems()
    {
        if (!_prevQuery.contains(_currentQuery))
        {
            Iterator iterator = _items.iterator();
            String s = _currentQuery.trim();
            boolean flag = false;
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                TypeAheadItem typeaheaditem = (TypeAheadItem)iterator.next();
                if (!typeaheaditem.isPlaceHolder() && !StringUtils.containsIgnoreCase(typeaheaditem.getTitle(), s))
                {
                    iterator.remove();
                    flag = true;
                }
            } while (true);
            if (flag)
            {
                notifyDataSetChanged();
                return;
            }
        }
    }

    public int getCount()
    {
        return _items.size();
    }

    public Object getItem(int i)
    {
        return _items.get(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    protected int getNewViewLayoutId()
    {
        return _listCellLayoutId;
    }

    protected com.pinterest.api.remote.SearchApi.Scope getSearchScope()
    {
        return com.pinterest.api.remote.SearchApi.Scope.f;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view != null && (view instanceof PersonListCell))
        {
            view = (PersonListCell)view;
            _rowHeight = Integer.valueOf(view.getMeasuredHeight());
            view.reset();
        } else
        {
            view = (PersonListCell)_li.inflate(getNewViewLayoutId(), viewgroup, false);
            view.setBackgroundColor(-1);
        }
        if (view instanceof PeoplePickerPersonCell)
        {
            viewgroup = (TypeAheadItem)getItem(i);
            ((PeoplePickerPersonCell)view).setItem(viewgroup);
            if (viewgroup.getItemType() == com.pinterest.activity.search.model.TypeAheadItem.ItemType.CONTACT_NOT_FOUND_MISSING_PERMISSION)
            {
                view.setImage(0x7f0201ae);
                DrawableUtils.tintIcon(view.getImage().getDrawable(), 0x7f0e009c);
            }
        }
        return view;
    }

    public void onFacebookConnected()
    {
        getSearchSuggestions();
    }

    public void onSearchQueryChanged(String s)
    {
        if (!s.equals(_currentQuery))
        {
            PLog.log("PeopleSearchAdapter", "Request made for %s", new Object[] {
                s
            });
            if (StringUtils.isEmpty(_currentQuery))
            {
                setSpinnerState(true);
            }
            _prevQuery = _currentQuery;
            _currentQuery = s;
            refresh();
        }
    }

    public void refresh()
    {
        if (StringUtils.isEmpty(_currentQuery))
        {
            addToDataSet(_currentQuery, Collections.emptyList());
        }
        if (!StringUtils.isEmpty(_currentQuery) || _searchOnEmptyQuery)
        {
            getSearchSuggestions();
            filterItems();
        }
    }

    public void setApiTag(String s)
    {
        _apiTag = s;
    }

    public void setFooterView(ProgressSpinnerListCell progressspinnerlistcell)
    {
        _footerView = progressspinnerlistcell;
    }

    public void setListCellLayoutId(int i)
    {
        _listCellLayoutId = i;
    }

    public void setSpinnerState(final boolean showSpinner)
    {
        if (_footerView != null)
        {
            _footerView.post(new _cls2());
        }
    }

    static 
    {
        LOCAL_CONTACTS_ONLY = false;
    }


/*
    static List access$002(PeopleSearchAdapter peoplesearchadapter, List list)
    {
        peoplesearchadapter._items = list;
        return list;
    }

*/



    private class PeopleSearchResponseHandler extends BaseApiResponseHandler
    {

        private String query;
        final PeopleSearchAdapter this$0;

        private void parseData(ApiResponse apiresponse)
        {
            List list1 = TypeAheadItem.parseData(apiresponse.getData());
            List list = ContactsProvider.getContactsWithEmail(_context, query, _emailMaxCount);
            apiresponse = list;
            if (getSearchScope() == com.pinterest.api.remote.SearchApi.Scope.h)
            {
                apiresponse = ContactsProvider.getContactsWithPhoneNumber(_context, query, _phoneMaxCount);
                if (list != null && !list.isEmpty())
                {
                    list.addAll(apiresponse);
                    apiresponse = list;
                }
            }
            PLog.log("PeopleSearchAdapter", "Request came back for %s with %d, %d results", new Object[] {
                query, Integer.valueOf(list1.size()), Integer.valueOf(apiresponse.size())
            });
            if (ApplicationInfo.isNonProduction() && PeopleSearchAdapter.LOCAL_CONTACTS_ONLY && !apiresponse.isEmpty())
            {
                addToDataSet(query, apiresponse);
            } else
            {
                if (!list1.isEmpty() && !apiresponse.isEmpty())
                {
                    list1.addAll(apiresponse);
                    addToDataSet(query, list1);
                    return;
                }
                if (apiresponse.isEmpty())
                {
                    addToDataSet(query, list1);
                    return;
                }
                if (list1.isEmpty())
                {
                    addToDataSet(query, apiresponse);
                    return;
                }
            }
        }

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            PLog.error(throwable, "PeopleSearchResponseHandler failed with response %s", new Object[] {
                apiresponse
            });
            setSpinnerState(false);
        }

        public void onSuccess(final ApiResponse response)
        {
            class _cls1 extends BackgroundTask
            {

                final PeopleSearchResponseHandler this$1;
                final ApiResponse val$response;

                public void run()
                {
                    try
                    {
                        parseData(response);
                        return;
                    }
                    catch (SecurityException securityexception)
                    {
                        CrashReporting.a(securityexception);
                    }
                    TypeAheadItem typeaheaditem = new TypeAheadItem();
                    typeaheaditem.setItemType(com.pinterest.activity.search.model.TypeAheadItem.ItemType.CONTACT_NOT_FOUND_MISSING_PERMISSION);
                    typeaheaditem.setTitle(Resources.string(0x7f07017b));
                    ArrayList arraylist = new ArrayList();
                    arraylist.add(typeaheaditem);
                    addToDataSet(query, arraylist);
                }

                _cls1()
                {
                    this$1 = PeopleSearchResponseHandler.this;
                    response = apiresponse;
                    super();
                }
            }

            if (query.equalsIgnoreCase(_currentQuery))
            {
                (new _cls1()).execute();
            }
            setSpinnerState(false);
        }



        public PeopleSearchResponseHandler(String s)
        {
            this$0 = PeopleSearchAdapter.this;
            super();
            query = s;
        }
    }


    private class _cls1
        implements Runnable
    {

        final PeopleSearchAdapter this$0;
        final List val$newItems;
        final String val$query;

        public void run()
        {
            if (query.equals(_currentQuery))
            {
                _items = newItems;
            }
            notifyDataSetChanged();
        }

        _cls1()
        {
            this$0 = PeopleSearchAdapter.this;
            query = s;
            newItems = list;
            super();
        }
    }


    private class _cls2
        implements Runnable
    {

        final PeopleSearchAdapter this$0;
        final boolean val$showSpinner;

        public void run()
        {
            if (showSpinner)
            {
                ProgressSpinnerListCell progressspinnerlistcell = _footerView;
                boolean flag;
                if (getCount() == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                progressspinnerlistcell.showSpinner(flag);
                return;
            } else
            {
                _footerView.hideSpinner();
                return;
            }
        }

        _cls2()
        {
            this$0 = PeopleSearchAdapter.this;
            showSpinner = flag;
            super();
        }
    }

}
