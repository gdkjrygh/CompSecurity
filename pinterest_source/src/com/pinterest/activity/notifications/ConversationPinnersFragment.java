// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.api.model.Conversation;
import com.pinterest.api.model.UserFeed;
import com.pinterest.fragment.PeopleListFragment;

public class ConversationPinnersFragment extends PeopleListFragment
{

    private Conversation _conversation;

    public ConversationPinnersFragment()
    {
    }

    protected void loadData()
    {
        super.loadData();
        UserFeed userfeed = new UserFeed();
        userfeed.setItems(_conversation.getCachedUsers());
        onPeopleLoaded(userfeed);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300b8;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        _actionBar.setTitle(_conversation.getConversationTitle());
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        _conversation = (Conversation)navigation.getCachedModel();
    }
}
