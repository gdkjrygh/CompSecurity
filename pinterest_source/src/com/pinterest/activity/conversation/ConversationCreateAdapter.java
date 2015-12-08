// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.conversation.view.PersonRightImageListCell;
import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.activity.sendapin.adapter.PeopleSearchAdapter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;

public class ConversationCreateAdapter extends PeopleSearchAdapter
{

    private List _recentConversationList;
    private Set _selectedItems;

    public ConversationCreateAdapter(Context context)
    {
        super(context);
        _selectedItems = new HashSet();
        onSearchQueryChanged("");
        _emailMaxCount = 50;
    }

    protected void filterItems()
    {
    }

    protected int getNewViewLayoutId()
    {
        return 0x7f030164;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = (PersonRightImageListCell)super.getView(i, view, viewgroup);
        viewgroup = (TypeAheadItem)getItem(i);
        boolean flag;
        if (!viewgroup.isPlaceHolder() && _selectedItems.contains(viewgroup))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setChecked(flag);
        return view;
    }

    public void onPersonSelected(TypeAheadItem typeaheaditem)
    {
        _selectedItems.add(typeaheaditem);
    }

    public void onPersonUnselected(TypeAheadItem typeaheaditem)
    {
        _selectedItems.remove(typeaheaditem);
    }

    public void onSearchQueryChanged(String s)
    {
        if (StringUtils.isNotBlank(s))
        {
            super.onSearchQueryChanged(s);
            return;
        } else
        {
            _currentQuery = s;
            (new RecentContactsLoadTask(null)).execute();
            return;
        }
    }



/*
    static List access$102(ConversationCreateAdapter conversationcreateadapter, List list)
    {
        conversationcreateadapter._recentConversationList = list;
        return list;
    }

*/


    private class RecentContactsLoadTask extends BackgroundTask
    {

        final ConversationCreateAdapter this$0;

        public void onFinish()
        {
        }

        public void run()
        {
            if (_recentConversationList == null)
            {
                _recentConversationList = ModelHelper.getRecentConversationUsers();
            }
            addToDataSet("", _recentConversationList);
        }

        private RecentContactsLoadTask()
        {
            this$0 = ConversationCreateAdapter.this;
            super();
        }

        RecentContactsLoadTask(_cls1 _pcls1)
        {
            this();
        }
    }

}
