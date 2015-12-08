// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.conversation.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.pinterest.activity.board.view.PersonListCell;
import com.pinterest.api.model.User;
import java.util.ArrayList;
import java.util.List;

public class BlockConversationUserAdapter extends BaseAdapter
{

    protected Context _context;
    private List _conversationUsers;
    protected LayoutInflater _li;
    private List _selectedUsers;

    public BlockConversationUserAdapter(Context context)
    {
        _selectedUsers = new ArrayList();
        _context = context;
        _li = (LayoutInflater)context.getSystemService("layout_inflater");
    }

    public int getCount()
    {
        return _conversationUsers.size();
    }

    public Object getItem(int i)
    {
        if (i < 0 || i >= getCount())
        {
            return null;
        } else
        {
            return _conversationUsers.get(i);
        }
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public List getSelectedUsers()
    {
        return _selectedUsers;
    }

    public View getView(int i, View view, final ViewGroup user)
    {
        if (view == null || !(view instanceof PersonListCell)) goto _L2; else goto _L1
_L1:
        view = (PersonListCell)view;
        view.reset();
_L4:
        user = (User)getItem(i);
        if (user != null)
        {
            view.setTitle(user.getFullName());
            view.setImage(user.getImageMediumUrl());
            view.setActionCheckBox(false, new _cls1());
        }
        return view;
_L2:
        view = (PersonListCell)_li.inflate(0x7f030163, user, false);
        if (view != null)
        {
            view.setBackgroundColor(-1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setDatasource(List list)
    {
        _conversationUsers = list;
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final BlockConversationUserAdapter this$0;
        final User val$user;

        public void onClick(View view)
        {
            if (_selectedUsers.contains(user))
            {
                _selectedUsers.remove(user);
                return;
            } else
            {
                _selectedUsers.add(user);
                return;
            }
        }

        _cls1()
        {
            this$0 = BlockConversationUserAdapter.this;
            user = user1;
            super();
        }
    }

}
