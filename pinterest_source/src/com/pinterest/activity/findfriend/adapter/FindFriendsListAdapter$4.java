// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend.adapter;

import com.pinterest.activity.board.view.PersonListCell;
import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.api.model.User;

// Referenced classes of package com.pinterest.activity.findfriend.adapter:
//            FindFriendsListAdapter

class val.listCell extends com.pinterest.api.remote.onse
{

    final FindFriendsListAdapter this$0;
    final TypeAheadItem val$contact;
    final PersonListCell val$listCell;

    public void onFailure()
    {
        TypeAheadItem typeaheaditem = val$contact;
        boolean flag;
        if (!val$contact.isFollowedByMe())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        typeaheaditem.setFollowedByMe(flag);
        FindFriendsListAdapter.access$100(FindFriendsListAdapter.this, val$listCell, val$contact);
    }

    public void onSuccess(User user)
    {
    }

    ()
    {
        this$0 = final_findfriendslistadapter;
        val$contact = typeaheaditem;
        val$listCell = PersonListCell.this;
        super();
    }
}
