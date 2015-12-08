// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.View;
import com.soundcloud.lightcycle.DefaultSupportFragmentLightCycle;

public class CollapsingScrollHelper extends DefaultSupportFragmentLightCycle
    implements android.support.design.widget.AppBarLayout.OnOffsetChangedListener
{

    private static final int TOP = 0;
    private AppBarLayout appBarLayout;
    private SwipeRefreshLayout swipeRefreshLayout;

    public CollapsingScrollHelper()
    {
    }

    public void onDestroyView(Fragment fragment)
    {
        appBarLayout.removeOnOffsetChangedListener(this);
        swipeRefreshLayout = null;
        appBarLayout = null;
        super.onDestroyView(fragment);
    }

    public void onOffsetChanged(AppBarLayout appbarlayout, int i)
    {
        appbarlayout = swipeRefreshLayout;
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        appbarlayout.setEnabled(flag);
    }

    public void onViewCreated(Fragment fragment, View view, Bundle bundle)
    {
        super.onViewCreated(fragment, view, bundle);
        swipeRefreshLayout = (SwipeRefreshLayout)view.findViewById(0x7f0f0153);
        if (swipeRefreshLayout == null)
        {
            throw new IllegalStateException("Expected to find SwipeRefreshLayout with ID R.id.str_layout");
        }
        appBarLayout = (AppBarLayout)view.findViewById(0x7f0f0168);
        if (appBarLayout == null)
        {
            throw new IllegalStateException("Expected to find AppBarLayout with ID R.id.appbar");
        } else
        {
            appBarLayout.addOnOffsetChangedListener(this);
            return;
        }
    }
}
