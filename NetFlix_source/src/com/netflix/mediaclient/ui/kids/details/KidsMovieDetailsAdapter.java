// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.details;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.servicemgr.MovieDetails;
import com.netflix.mediaclient.servicemgr.Trackable;
import com.netflix.mediaclient.servicemgr.TrackableObject;
import com.netflix.mediaclient.servicemgr.Video;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import com.netflix.mediaclient.ui.kids.lolomo.KidsHorizontalVideoView;
import com.netflix.mediaclient.ui.kids.lolomo.KidsOneToOneVideoView;
import java.util.List;

public class KidsMovieDetailsAdapter extends BaseAdapter
{

    private final NetflixActivity activity;
    private final MovieDetails movieDetails;
    private final Trackable trackable;

    public KidsMovieDetailsAdapter(NetflixFrag netflixfrag, MovieDetails moviedetails)
    {
        activity = netflixfrag.getNetflixActivity();
        movieDetails = moviedetails;
        trackable = new TrackableObject(movieDetails.getSimilarsRequestId(), movieDetails.getSimilarsTrackId(), movieDetails.getSimilarsListPos());
    }

    public int getCount()
    {
        return movieDetails.getSimilars().size();
    }

    public Video getItem(int i)
    {
        return (Video)movieDetails.getSimilars().get(i);
    }

    public volatile Object getItem(int i)
    {
        return getItem(i);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            int j;
            int k;
            if (KidsUtils.shouldShowHorizontalImages(activity))
            {
                view = new KidsHorizontalVideoView(activity, false);
            } else
            {
                view = new KidsOneToOneVideoView(activity, false);
            }
            j = activity.getResources().getDimensionPixelSize(0x7f0a007e);
            k = activity.getResources().getDimensionPixelSize(0x7f0a007f);
            view.setPadding(j, 0, j, k);
            view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, KidsUtils.computeSkidmarkRowHeight(activity, j, 0, j, k, false)));
            viewgroup = view;
        }
        ((com.netflix.mediaclient.ui.lomo.VideoViewGroup.IVideoView)viewgroup).update(getItem(i), trackable, i, false);
        return viewgroup;
    }
}
