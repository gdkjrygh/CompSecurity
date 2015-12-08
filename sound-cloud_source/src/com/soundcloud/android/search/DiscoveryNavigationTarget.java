// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import android.support.v4.app.Fragment;
import com.soundcloud.android.discovery.DiscoveryFragment;
import com.soundcloud.android.main.BaseNavigationTarget;
import com.soundcloud.android.main.Screen;

public class DiscoveryNavigationTarget extends BaseNavigationTarget
{

    public DiscoveryNavigationTarget()
    {
        super(0x7f0701f4, 0x7f020249);
    }

    public Fragment createFragment()
    {
        return new DiscoveryFragment();
    }

    public Screen getScreen()
    {
        return Screen.SEARCH_MAIN;
    }
}
