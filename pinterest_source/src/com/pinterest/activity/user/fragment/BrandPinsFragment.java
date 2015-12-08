// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import android.view.View;
import com.pinterest.activity.user.view.UserMetadataView;
import com.pinterest.ui.grid.PinterestGridView;

// Referenced classes of package com.pinterest.activity.user.fragment:
//            UserPinsFragment

public class BrandPinsFragment extends UserPinsFragment
{

    private UserMetadataView _brandHeader;

    public BrandPinsFragment()
    {
    }

    protected void initHeader()
    {
        _brandHeader = new UserMetadataView(getView().getContext());
        _brandHeader.setUser(_user);
        _gridVw.addHeaderView(_brandHeader, -1, -2);
        super.initHeader();
    }

    public void onDestroyView()
    {
        _brandHeader = null;
        super.onDestroyView();
    }
}
