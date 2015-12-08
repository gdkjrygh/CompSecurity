// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.presentation.RefreshableScreen;
import com.soundcloud.android.view.MultiSwipeRefreshLayout;
import com.soundcloud.lightcycle.LightCycleSupportFragment;
import dagger.b;

// Referenced classes of package com.soundcloud.android.search:
//            SearchResultsPresenter

public class SearchResultsFragment extends LightCycleSupportFragment
    implements RefreshableScreen
{

    static final String EXTRA_PUBLISH_SEARCH_SUBMISSION_EVENT = "publishSearchSubmissionEvent";
    static final String EXTRA_QUERY = "query";
    static final String EXTRA_TYPE = "type";
    SearchResultsPresenter presenter;

    public SearchResultsFragment()
    {
        setRetainInstance(true);
        SoundCloudApplication.getObjectGraph().a(this);
    }

    public static SearchResultsFragment create(int i, String s, boolean flag)
    {
        SearchResultsFragment searchresultsfragment = new SearchResultsFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("type", i);
        bundle.putString("query", s);
        bundle.putBoolean("publishSearchSubmissionEvent", flag);
        searchresultsfragment.setArguments(bundle);
        return searchresultsfragment;
    }

    public MultiSwipeRefreshLayout getRefreshLayout()
    {
        return (MultiSwipeRefreshLayout)getView().findViewById(0x7f0f0153);
    }

    public View[] getRefreshableViews()
    {
        return (new View[] {
            presenter.getRecyclerView(), presenter.getEmptyView()
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030056, viewgroup, false);
    }
}
