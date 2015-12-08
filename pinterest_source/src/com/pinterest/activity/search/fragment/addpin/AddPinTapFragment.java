// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.search.fragment.addpin;

import com.pinterest.activity.search.fragment.GuidedPinSearchFragment;
import com.pinterest.adapter.PinGridAdapter;

public class AddPinTapFragment extends GuidedPinSearchFragment
{

    public AddPinTapFragment()
    {
        _addPinToMessages = true;
        ((PinGridAdapter)_adapter).setRenderUser(false);
        ((PinGridAdapter)_adapter).setRenderSource(false);
        ((PinGridAdapter)_adapter).setRenderOnto(false);
        ((PinGridAdapter)_adapter).setRenderDomain(false);
        ((PinGridAdapter)_adapter).setOverrideClicks(true);
    }
}
