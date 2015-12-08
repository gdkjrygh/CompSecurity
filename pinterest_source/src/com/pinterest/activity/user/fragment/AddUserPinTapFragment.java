// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.fragment;

import com.pinterest.adapter.PinGridAdapter;
import com.pinterest.base.Constants;

// Referenced classes of package com.pinterest.activity.user.fragment:
//            UserPinsFragment

public class AddUserPinTapFragment extends UserPinsFragment
{

    public AddUserPinTapFragment()
    {
        _swipeOffsetStart = -Constants.ACTIONBAR_HEIGHT;
        _swipeOffsetEnd = _swipeOffsetStart + Constants.SWIPE_OFFSET_LENGTH;
        ((PinGridAdapter)_adapter).setRenderUser(false);
        ((PinGridAdapter)_adapter).setRenderSource(false);
        ((PinGridAdapter)_adapter).setRenderOnto(false);
        ((PinGridAdapter)_adapter).setRenderDomain(false);
        ((PinGridAdapter)_adapter).setOverrideClicks(true);
    }

    protected void initHeader()
    {
    }
}
