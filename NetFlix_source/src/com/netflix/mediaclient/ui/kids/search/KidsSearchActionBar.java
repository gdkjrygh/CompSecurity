// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.search;

import android.app.ActionBar;
import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.widget.SearchView;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.SearchActionBar;

public class KidsSearchActionBar extends SearchActionBar
{

    public KidsSearchActionBar(NetflixActivity netflixactivity)
    {
        super(netflixactivity);
        systemActionBar.setBackgroundDrawable(new ColorDrawable(netflixactivity.getResources().getColor(0x7f090066)));
        searchView.setQueryHint(getActivity().getString(0x7f0c0156));
    }

    public void onManagerReady()
    {
        configureBackButtonIfNecessary(true);
    }
}
