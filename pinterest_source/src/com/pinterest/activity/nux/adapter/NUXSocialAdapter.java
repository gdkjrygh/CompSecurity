// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.adapter;

import android.os.Bundle;
import com.pinterest.activity.nux.fragment.NUXSocialGridFragment;
import com.pinterest.activity.nux.view.NUXContinueBar;
import com.pinterest.activity.task.fragment.BaseFragment;
import java.util.ArrayList;

public class NUXSocialAdapter
{

    public static final int COUNT = 3;
    public static final int DEFAULT = 2;
    public static final int FACEBOOK = 0;
    public static final int NONE = -1;
    public static final String SOCIAL_TYPE = "socialType";
    public static final int TWITTER = 1;
    private NUXContinueBar _continueBar;
    private int _currentFragment;
    private ArrayList _fragments;

    public NUXSocialAdapter()
    {
        _fragments = new ArrayList();
        _currentFragment = 2;
        _fragments.add(createNUXSocialGridFragment(0));
        _fragments.add(createNUXSocialGridFragment(1));
        _fragments.add(createNUXSocialGridFragment(2));
    }

    private NUXSocialGridFragment createNUXSocialGridFragment(int i)
    {
        NUXSocialGridFragment nuxsocialgridfragment = new NUXSocialGridFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("socialType", i);
        nuxsocialgridfragment.setArguments(bundle);
        return nuxsocialgridfragment;
    }

    public int getCount()
    {
        return 3;
    }

    public NUXSocialGridFragment getCurrentFragment()
    {
        return (NUXSocialGridFragment)_fragments.get(_currentFragment);
    }

    public int getCurrentFragmentCount()
    {
        return _currentFragment;
    }

    public BaseFragment getItem(int i)
    {
        return (BaseFragment)_fragments.get(i);
    }

    public boolean isBothSocialComplete()
    {
        return ((NUXSocialGridFragment)_fragments.get(0)).isComplete() && ((NUXSocialGridFragment)_fragments.get(1)).isComplete();
    }

    public boolean isEitherSocialComplete()
    {
        return ((NUXSocialGridFragment)_fragments.get(0)).isComplete() || ((NUXSocialGridFragment)_fragments.get(1)).isComplete();
    }

    public void setCurrentFragment(int i)
    {
        _currentFragment = i;
    }

    public void submitSocialUsers()
    {
        ((NUXSocialGridFragment)_fragments.get(0)).submitFollowUsers();
        ((NUXSocialGridFragment)_fragments.get(1)).submitFollowUsers();
    }
}
