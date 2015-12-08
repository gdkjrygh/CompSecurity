// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.details;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.fragment.NetflixFrag;
import com.netflix.mediaclient.servicemgr.KidsCharacterDetails;
import com.netflix.mediaclient.servicemgr.Trackable;
import com.netflix.mediaclient.servicemgr.TrackableObject;
import com.netflix.mediaclient.servicemgr.Video;
import com.netflix.mediaclient.servicemgr.VideoType;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import com.netflix.mediaclient.ui.kids.lolomo.KidsHorizontalVideoView;
import com.netflix.mediaclient.ui.kids.lolomo.KidsOneToOneVideoView;
import java.util.List;
import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;

public class KidsCharacterDetailsAdapter extends BaseAdapter
    implements StickyListHeadersAdapter
{

    private static final String TAG = "KidsCharacterDetailsAdapter";
    private final NetflixActivity activity;
    private KidsCharacterDetails charDetails;
    private final int contentPadding;
    private final Trackable trackable;

    public KidsCharacterDetailsAdapter(NetflixFrag netflixfrag, KidsCharacterDetails kidscharacterdetails)
    {
        activity = netflixfrag.getNetflixActivity();
        charDetails = kidscharacterdetails;
        trackable = new TrackableObject(kidscharacterdetails.getGalleryRequestId(), kidscharacterdetails.getGalleryTrackId(), 0);
        contentPadding = netflixfrag.getResources().getDimensionPixelSize(0x7f0a002b);
    }

    private VideoType getHeaderType(int i)
    {
        return getItem(i).getType();
    }

    public int getCount()
    {
        return charDetails.getGallery().size();
    }

    public long getHeaderId(int i)
    {
        return (long)getHeaderType(i).hashCode();
    }

    public View getHeaderView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = view;
        if (view == null)
        {
            Log.v("KidsCharacterDetailsAdapter", (new StringBuilder()).append("Creating header view for position: ").append(i).toString());
            viewgroup = activity.getLayoutInflater().inflate(0x7f03003f, null);
        }
        int j = activity.getResources().getDimensionPixelSize(0x7f0a0086);
        int k = activity.getResources().getDimensionPixelSize(0x7f0a0087);
        int l = contentPadding;
        int i1;
        if (i != 0)
        {
            j = 0;
        }
        i1 = contentPadding;
        if (i != 0);
        viewgroup.setPadding(l, j, i1, k);
        view = (TextView)viewgroup.findViewById(0x7f0700e3);
        if (getHeaderType(i) == VideoType.MOVIE)
        {
            i = 0x7f0c005c;
        } else
        {
            i = 0x7f0c005b;
        }
        view.setText(i);
        return viewgroup;
    }

    public Video getItem(int i)
    {
        return (Video)charDetails.getGallery().get(i);
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
        Log.v("KidsCharacterDetailsAdapter", (new StringBuilder()).append("Getting view for position: ").append(i).toString());
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

    public void updateKidsCharacterDetails(KidsCharacterDetails kidscharacterdetails)
    {
        charDetails = kidscharacterdetails;
    }
}
