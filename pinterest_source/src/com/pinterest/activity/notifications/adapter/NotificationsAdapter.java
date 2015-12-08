// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications.adapter;

import android.support.v4.app.FixedFragmentStatePagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.pinterest.activity.notifications.ConversationListFragment;
import com.pinterest.activity.notifications.NetworkStoryFragment;
import com.pinterest.activity.notifications.YourNotificationFragment;

public class NotificationsAdapter extends FixedFragmentStatePagerAdapter
{

    public static final int INDEX_MESSAGES = 2;
    public static final int INDEX_NEWS = 0;
    public static final int INDEX_YOUR_STORY = 1;

    public NotificationsAdapter(FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
    }

    public int getCount()
    {
        return 3;
    }

    public Fragment getItem(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 0: // '\0'
            return new NetworkStoryFragment();

        case 1: // '\001'
            return new YourNotificationFragment();

        case 2: // '\002'
            return new ConversationListFragment();
        }
    }
}
