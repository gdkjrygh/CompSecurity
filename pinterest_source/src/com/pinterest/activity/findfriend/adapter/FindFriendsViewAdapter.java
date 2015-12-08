// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.findfriend.adapter;

import android.support.v4.app.FixedFragmentStatePagerAdapter;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.pinterest.activity.findfriend.FindFriendsContactFragment;
import com.pinterest.activity.findfriend.FindFriendsFacebookFragment;
import com.pinterest.activity.findfriend.FindFriendsMoreFragment;
import com.pinterest.activity.findfriend.FindFriendsTwitterFragment;
import com.pinterest.activity.task.fragment.BaseFragment;

public class FindFriendsViewAdapter extends FixedFragmentStatePagerAdapter
{

    private BaseFragment _fragments[] = {
        new FindFriendsContactFragment(), new FindFriendsFacebookFragment(), new FindFriendsTwitterFragment(), new FindFriendsMoreFragment()
    };

    public FindFriendsViewAdapter(FragmentManager fragmentmanager)
    {
        super(fragmentmanager);
    }

    public int getCount()
    {
        return _fragments.length;
    }

    public Fragment getItem(int i)
    {
        return _fragments[i];
    }
}
