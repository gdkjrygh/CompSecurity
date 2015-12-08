// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.activity.FragmentHelper;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.activity.user.fragment.AddUserPinTapFragment;
import com.pinterest.api.model.MyUser;

// Referenced classes of package com.pinterest.activity.search:
//            GuidedSearchFragment

public class AddPinSearchFragment extends GuidedSearchFragment
{

    private AddUserPinTapFragment _fragment;

    public AddPinSearchFragment()
    {
    }

    public void getFocus()
    {
    }

    protected void getInitialFocus()
    {
    }

    protected void loadFragment(Fragment fragment)
    {
        FragmentHelper.replaceFragment(this, fragment, true);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        _fragment = new AddUserPinTapFragment();
        _fragment.setNavigation(new Navigation(Location.USER_PINS_SELECT, MyUser.getUid()));
        return layoutinflater;
    }

    public void onDestroyView()
    {
        _fragment = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        FragmentHelper.replaceFragment(getActivity(), _fragment, false);
    }
}
