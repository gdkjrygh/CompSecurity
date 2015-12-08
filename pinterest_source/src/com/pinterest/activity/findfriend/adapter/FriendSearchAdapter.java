// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend.adapter;

import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.activity.board.view.PersonListCell;
import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.activity.sendapin.providers.ContactsProvider;
import com.pinterest.activity.sendapin.ui.PeoplePickerPersonCell;
import com.pinterest.activity.sendapin.ui.ProgressSpinnerListCell;
import com.pinterest.adapter.SearchableListAdapter;
import com.pinterest.base.Events;
import com.pinterest.kit.log.PLog;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class FriendSearchAdapter extends BaseAdapter
    implements SearchableListAdapter
{

    protected static final int CONTACT_LIMIT = 1000;
    private static final String TAG = "FriendSearchAdapter";
    private int _contactType;
    protected Context _context;
    private String _currentQuery;
    private ProgressSpinnerListCell _footerView;
    private Handler _handler;
    private List _items;
    protected LayoutInflater _li;

    public FriendSearchAdapter(Context context)
    {
        _items = Collections.emptyList();
        _currentQuery = "";
        _contactType = 0;
        _context = context;
        _li = (LayoutInflater)context.getSystemService("layout_inflater");
        _handler = new Handler();
    }

    private void addToDataSet(String s, final List newItems)
    {
        _handler.post(new _cls2());
    }

    private void filterItems()
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
        }
    }

    protected void fireContactsChangeEvent()
    {
        Events.post(new ContactsChangeEvent(_items.size()));
    }

    public List getContactList()
    {
        List list = null;
        if (_contactType == 0)
        {
            list = getEmailContactList(1000);
        } else
        if (_contactType == 1)
        {
            return getPhoneContactList(1000);
        }
        return list;
    }

    public int getCount()
    {
        return _items.size();
    }

    public List getEmailContactList(int i)
    {
        return ContactsProvider.getNamedContactsWithEmail(_context, _currentQuery, i);
    }

    public Object getItem(int i)
    {
        if (i < 0 || i >= getCount())
        {
            return null;
        } else
        {
            return _items.get(i);
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    protected int getNewViewLayoutId()
    {
        return 0x7f030163;
    }

    public List getPhoneContactList(int i)
    {
        return ContactsProvider.getContactsWithPhoneNumber(_context, _currentQuery, i);
    }

    public List getSortedContacts(int i)
    {
        return ContactsProvider.getSortedContacts(_context, i);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null || !(view instanceof PersonListCell)) goto _L2; else goto _L1
_L1:
        view = (PersonListCell)view;
        view.reset();
_L4:
        if (view instanceof PeoplePickerPersonCell)
        {
            viewgroup = ((ViewGroup) (getItem(i)));
            if (viewgroup instanceof TypeAheadItem)
            {
                ((PeoplePickerPersonCell)view).setItem((TypeAheadItem)viewgroup);
            }
        }
        return view;
_L2:
        view = (PersonListCell)_li.inflate(getNewViewLayoutId(), viewgroup, false);
        if (view != null)
        {
            view.setBackgroundColor(-1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void notifyDataSetChanged()
    {
        fireContactsChangeEvent();
        super.notifyDataSetChanged();
    }

    public void onSearchQueryChanged(String s)
    {
        if (!s.equals(_currentQuery))
        {
            PLog.log("FriendSearchAdapter", "Request made for %s", new Object[] {
                s
            });
            setCurrentQuery(s);
            refresh();
        }
    }

    public void refresh()
    {
        (new _cls1()).execute();
        if (!StringUtils.isEmpty(_currentQuery))
        {
            filterItems();
        }
    }

    public void refreshOnUiThread(List list)
    {
        addToDataSet(null, list);
        setSpinnerState(false);
    }

    public void setContactType(int i)
    {
        _contactType = i;
    }

    public void setCurrentQuery(String s)
    {
        _currentQuery = s;
    }

    public void setFooterView(ProgressSpinnerListCell progressspinnerlistcell)
    {
        _footerView = progressspinnerlistcell;
    }

    public void setSpinnerState(final boolean showSpinner)
    {
        if (_footerView != null)
        {
            _footerView.post(new _cls3());
        }
    }




/*
    static List access$202(FriendSearchAdapter friendsearchadapter, List list)
    {
        friendsearchadapter._items = list;
        return list;
    }

*/


    private class _cls2
        implements Runnable
    {

        final FriendSearchAdapter this$0;
        final List val$newItems;

        public void run()
        {
            _items = newItems;
            notifyDataSetChanged();
        }

        _cls2()
        {
            this$0 = FriendSearchAdapter.this;
            newItems = list;
            super();
        }
    }


    private class ContactsChangeEvent
    {

        public final FriendSearchAdapter originatingAdapter;
        public final int size;

        public ContactsChangeEvent(int i)
        {
            originatingAdapter = FriendSearchAdapter.this;
            size = i;
        }
    }


    private class _cls1 extends BackgroundTask
    {

        List contactItems;
        final FriendSearchAdapter this$0;

        public void onFinish()
        {
            if (contactItems != null && !contactItems.isEmpty())
            {
                addToDataSet(_currentQuery, contactItems);
            }
            setSpinnerState(false);
        }

        public void run()
        {
            contactItems = getContactList();
        }

        _cls1()
        {
            this$0 = FriendSearchAdapter.this;
            super();
        }
    }


    private class _cls3
        implements Runnable
    {

        final FriendSearchAdapter this$0;
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

        _cls3()
        {
            this$0 = FriendSearchAdapter.this;
            showSpinner = flag;
            super();
        }
    }

}
