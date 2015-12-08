// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.view.View;
import com.soundcloud.android.api.model.StationRecord;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.RecyclerItemAdapter;
import com.soundcloud.android.view.adapters.NowPlayingAdapter;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsHomePresenter, StationsViewHolder, StationBucket, StationViewModel, 
//            StationsBucketRenderer

static class  extends RecyclerItemAdapter
    implements NowPlayingAdapter
{

    public static final int STATION_BUCKET_TYPE = 0;

    protected volatile android.support.v7.widget.apter createViewHolder(View view)
    {
        return createViewHolder(view);
    }

    protected StationsViewHolder createViewHolder(View view)
    {
        return new StationsViewHolder(view);
    }

    public int getBasicItemViewType(int i)
    {
        return 0;
    }

    public void updateNowPlaying(Urn urn)
    {
        for (Iterator iterator = getItems().iterator(); iterator.hasNext();)
        {
            Iterator iterator1 = ((StationBucket)iterator.next()).getStationViewModels().iterator();
            while (iterator1.hasNext()) 
            {
                StationViewModel stationviewmodel = (StationViewModel)iterator1.next();
                stationviewmodel.setIsPlaying(stationviewmodel.getStation().getUrn().equals(urn));
            }
        }

        notifyDataSetChanged();
    }

    public (StationsBucketRenderer stationsbucketrenderer)
    {
        super(stationsbucketrenderer);
    }
}
