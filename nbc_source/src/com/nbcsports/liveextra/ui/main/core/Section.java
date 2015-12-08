// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.support.v4.app.Fragment;
import com.nbcsports.liveextra.library.configuration.Sport;

public class Section
{

    Fragment fragment;
    int icon;
    int index;
    com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo pageInfo;
    Sport sport;
    String title;

    public Section(int i)
    {
        index = i;
    }

    public Fragment getFragment()
    {
        return fragment;
    }

    public int getIcon()
    {
        return icon;
    }

    public int getIndex()
    {
        return index;
    }

    public com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo getPageInfo()
    {
        return pageInfo;
    }

    public Sport getSport()
    {
        return sport;
    }

    public String getTitle()
    {
        return title;
    }

    public void setFragment(Fragment fragment1)
    {
        fragment = fragment1;
    }

    public void setIcon(int i)
    {
        icon = i;
    }

    public void setIndex(int i)
    {
        index = i;
    }

    public void setPageInfo(com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo pageinfo)
    {
        pageInfo = pageinfo;
    }

    public void setSport(Sport sport1)
    {
        sport = sport1;
    }

    public void setTitle(String s)
    {
        title = s;
    }
}
